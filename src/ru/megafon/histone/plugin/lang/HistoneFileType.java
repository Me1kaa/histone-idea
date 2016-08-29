package ru.megafon.histone.plugin.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneFileType extends LanguageFileType {

    public static final HistoneFileType INSTANCE = new HistoneFileType();

    public static final String HISTONE_FILE_NAME = "Histone File";
    public static final String HISTONE_FILE_DESCRIPTION = "Histone template engine file";
    public static final String HISTONE_FILE_EXTENSTION = "tpl";


    protected HistoneFileType() {
        super(HistoneLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return HISTONE_FILE_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return HISTONE_FILE_DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return HISTONE_FILE_EXTENSTION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return HistoneIcon.FILE;
    }
}
