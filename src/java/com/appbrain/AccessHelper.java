/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.appbrain.InterstitialBuilder
 *  java.lang.Object
 */
package com.appbrain;

import android.content.Context;
import com.appbrain.InterstitialBuilder;

public class AccessHelper {
    public static boolean showWithSkipChance(InterstitialBuilder interstitialBuilder, Context context, double d) {
        return interstitialBuilder.c(context, d);
    }
}

