package ru.megafon.histone.plugin.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(HistoneFileType.INSTANCE, HistoneFileType.HISTONE_FILE_EXTENSTION);
    }
}
