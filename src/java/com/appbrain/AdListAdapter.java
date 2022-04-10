/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.WrapperListAdapter
 *  java.lang.Object
 */
package com.appbrain;

import android.view.View;
import android.widget.WrapperListAdapter;

public interface AdListAdapter
extends WrapperListAdapter {
    public int getItemPosition(int var1);

    public static interface AdLayoutCreator {
        public View createLayout();
    }

}

