package ru.megafon.histone.plugin.xdebug;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugProcessStarter;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XDebuggerManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * @author Aleksander Melnichnikov
 */
public class HistoneDebugRunner extends GenericProgramRunner {

    public static final String HISTONE_PROCESS_ID = "ru.megafon.histone.plugin.xdebug.HistoneDebugRunner";
    public static final Logger log = Logger.getInstance("Histone.HistoneDebugRunner");


    private ExecutionResult executionResult;

    private final XDebugProcessStarter processStarter = new XDebugProcessStarter() {
        @NotNull
        @Override
        public XDebugProcess start(@NotNull XDebugSession session) throws ExecutionException {
            return new HistoneDebugProcess(session, executionResult);
        }
    };

    @NotNull
    @Override
    public String getRunnerId() {
        return HISTONE_PROCESS_ID;
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile runProfile) {
        return DefaultDebugExecutor.EXECUTOR_ID.equals(executorId); //todo CAN RUN
    }


    @Nullable
    @Override
    protected RunContentDescriptor doExecute(Project project, RunProfileState state, RunContentDescriptor contentToReuse, ExecutionEnvironment env) throws ExecutionException {
        FileDocumentManager.getInstance().saveAllDocuments();

        if (log.isDebugEnabled()) log.debug("Starting LuaDebugProcess");

        executionResult = state.execute(env.getExecutor(), this);

        XDebugSession session = XDebuggerManager.getInstance(project).startSession(env, processStarter);

        return session.getRunContentDescriptor();
    }
}
