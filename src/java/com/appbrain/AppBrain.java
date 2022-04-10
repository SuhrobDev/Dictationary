/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.appbrain.RemoteSettings
 *  com.appbrain.a.bd
 *  com.appbrain.a.bd$a
 *  com.appbrain.a.bd$b
 *  com.appbrain.a.bd$c
 *  com.appbrain.a.g
 *  com.appbrain.a.i
 *  com.appbrain.a.r
 *  com.appbrain.a.v
 *  com.appbrain.c.ai
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.appbrain;

import android.content.Context;
import com.appbrain.AdService;
import com.appbrain.AdvertiserService;
import com.appbrain.RemoteSettings;
import com.appbrain.a.bd;
import com.appbrain.a.g;
import com.appbrain.a.i;
import com.appbrain.a.r;
import com.appbrain.a.v;
import com.appbrain.c.ai;

public class AppBrain {
    public static void addTestDevice(String string) {
        r.a().a(string);
    }

    public static AdService getAds() {
        if (r.a().c()) {
            return g.a();
        }
        return new bd.a();
    }

    public static AdvertiserService getAdvertiserService() {
        if (r.a().c()) {
            return i.a();
        }
        return new bd.b();
    }

    public static RemoteSettings getSettings() {
        if (r.a().c()) {
            return v.a().c();
        }
        return new bd.c();
    }

    public static void init(Context context) {
        ai.b((Runnable)new Runnable(){

            public final void run() {
                r.a().a(Context.this, true);
            }
        });
    }

    @Deprecated
    public static void initApp(Context context) {
        ai.b((Runnable)new Runnable(){

            public final void run() {
                r.a().a(Context.this, false);
            }
        });
    }

}

