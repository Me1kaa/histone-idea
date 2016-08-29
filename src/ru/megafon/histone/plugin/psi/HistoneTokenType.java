package ru.megafon.histone.plugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.megafon.histone.plugin.lang.HistoneLanguage;

/**
 * @author Aleksander Melnichnikov
 */
public class HistoneTokenType extends IElementType {

    public HistoneTokenType(@NotNull @NonNls String debugName) {
        super(debugName, HistoneLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "HistoneTokenType" + super.toString();
    }
}
