package ru.megafon.histone.plugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import ru.megafon.histone.plugin.lang.HistoneFileType;
import ru.megafon.histone.plugin.lang.HistoneLanguage;

import javax.swing.*;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneFile extends PsiFileBase {

    public HistoneFile(@NotNull FileViewProvider fileViewProvider) {
        super(fileViewProvider, HistoneLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return HistoneFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Histone template file";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
