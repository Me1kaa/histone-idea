package ru.megafon.histone.plugin.xdebug;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.xdebugger.breakpoints.XBreakpointProperties;
import com.intellij.xdebugger.breakpoints.XLineBreakpointType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneTemplateLineBreakpointType extends XLineBreakpointType<XBreakpointProperties> {

    protected HistoneTemplateLineBreakpointType(@NonNls @NotNull String id, @Nls @NotNull String title) {
        super("histone-line", "histone-breakpoints");
    }

    @Nullable
    @Override
    public XBreakpointProperties createBreakpointProperties(@NotNull VirtualFile virtualFile, int i) {
        return null;
    }

    public boolean canPutAt(@NotNull VirtualFile file, int line, @NotNull Project project) {
        return "tpl".equals(file.getExtension());
    }

}
