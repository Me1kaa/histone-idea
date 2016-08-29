package ru.megafon.histone.plugin.lang;

import com.intellij.lang.Language;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneLanguage extends Language {

    public static final HistoneLanguage INSTANCE = new HistoneLanguage();

    protected HistoneLanguage() {
        super("Histone");
    }
}
