package ru.megafon.histone.plugin;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneLexerAdapter extends FlexAdapter {
    public HistoneLexerAdapter() {
        super(new HistoneLexer(null));
    }
}
