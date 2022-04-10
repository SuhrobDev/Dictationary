/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  androidx.core.internal.view.SupportMenuItem
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package a;

import android.view.MenuItem;
import androidx.core.internal.view.SupportMenuItem;

public abstract class a {
    public static /* bridge */ /* synthetic */ MenuItem a(SupportMenuItem supportMenuItem, CharSequence charSequence) {
        return supportMenuItem.setContentDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ MenuItem b(SupportMenuItem supportMenuItem, CharSequence charSequence) {
        return supportMenuItem.setTooltipText(charSequence);
    }
}

