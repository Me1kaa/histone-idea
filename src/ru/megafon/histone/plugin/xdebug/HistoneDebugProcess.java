package ru.megafon.histone.plugin.xdebug;

import com.intellij.execution.ExecutionResult;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import org.jetbrains.annotations.NotNull;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneDebugProcess extends XDebugProcess {


    private ExecutionResult executionResult;

    protected HistoneDebugProcess(@NotNull XDebugSession session, ExecutionResult executionResult) {
        super(session);

    }

    @NotNull
    @Override
    public XDebuggerEditorsProvider getEditorsProvider() {
        //FIXME implement
        return null;
    }
}
