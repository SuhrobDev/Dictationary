/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.appbrain.a.r
 *  com.appbrain.c.aa
 *  com.appbrain.c.o
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 */
package com.appbrain;

import android.util.Log;
import com.appbrain.a.r;
import com.appbrain.c.aa;
import com.appbrain.c.o;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AdId
implements Serializable {
    public static final AdId ACHIEVEMENTS;
    public static final AdId DEFAULT;
    public static final AdId EXIT;
    public static final AdId HOME_SCREEN;
    public static final AdId LEADERBOARDS;
    public static final AdId LEVEL_COMPLETE;
    public static final AdId LEVEL_START;
    public static final AdId PAUSE;
    public static final AdId STARTUP;
    public static final AdId STORE;
    private static final Map e;
    private final int a;
    private final String b;
    private final boolean c;
    private final boolean d;

    static {
        AdId adId;
        AdId adId2;
        AdId adId3;
        AdId adId4;
        AdId adId5;
        AdId adId6;
        AdId adId7;
        AdId adId8;
        AdId adId9;
        AdId adId10;
        DEFAULT = adId10 = new AdId(0, "DEFAULT");
        HOME_SCREEN = adId6 = new AdId(1, "HOME_SCREEN");
        STARTUP = adId = new AdId(2, "STARTUP");
        PAUSE = adId9 = new AdId(3, "PAUSE");
        EXIT = adId4 = new AdId(4, "EXIT");
        LEVEL_START = adId2 = new AdId(5, "LEVEL_START");
        LEVEL_COMPLETE = adId7 = new AdId(6, "LEVEL_COMPLETE");
        ACHIEVEMENTS = adId3 = new AdId(7, "ACHIEVEMENTS");
        LEADERBOARDS = adId5 = new AdId(8, "LEADERBOARDS");
        STORE = adId8 = new AdId(9, "STORE");
        AdId[] arradId = new AdId[]{adId10, adId6, adId, adId9, adId4, adId2, adId7, adId3, adId5, adId8};
        HashMap hashMap = new HashMap(10);
        for (int i = 0; i < 10; ++i) {
            AdId adId11 = arradId[i];
            hashMap.put((Object)adId11.b, (Object)adId11);
        }
        e = Collections.unmodifiableMap((Map)hashMap);
    }

    private AdId(int n, String string) {
        this(n, string, true, true);
    }

    private AdId(int n, String string, boolean bl, boolean bl2) {
        this.a = n;
        this.b = string;
        this.c = bl;
        this.d = bl2;
    }

    public static AdId custom(String string) {
        AdId adId;
        block7 : {
            int n;
            String string2;
            block9 : {
                block8 : {
                    boolean bl;
                    block6 : {
                        adId = null;
                        if (string == null) break block7;
                        if (!r.a().b()) {
                            return null;
                        }
                        string2 = string.toUpperCase(Locale.ENGLISH);
                        int n2 = string2.length();
                        n = 1;
                        if (n2 != 10) break block8;
                        char[] arrc = string2.substring(4).toCharArray();
                        int n3 = arrc.length;
                        for (int i = 0; i < n3; ++i) {
                            if ("0123456789ABCDEF".indexOf((int)arrc[i]) != -1) continue;
                            bl = false;
                            break block6;
                        }
                        bl = true;
                    }
                    if (!bl) break block8;
                    String string3 = string2.substring(0, 6);
                    Object[] arrobject = new Object[n];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append(o.b().c());
                    arrobject[0] = 65535L & aa.a((String)stringBuilder.toString());
                    String string4 = String.format((String)"%04X", (Object[])arrobject);
                    if (string2.substring(6).equals((Object)string4)) break block9;
                }
                n = 0;
            }
            if (n == 0) {
                StringBuilder stringBuilder = new StringBuilder("Invalid custom id string '");
                stringBuilder.append(string);
                stringBuilder.append("'. Using no ad id instead.");
                Log.println((int)6, (String)"AppBrain", (String)stringBuilder.toString());
                return null;
            }
            int n4 = Integer.parseInt((String)string2.substring(4, 6), (int)16);
            StringBuilder stringBuilder = new StringBuilder("CUSTOM('");
            stringBuilder.append(string);
            stringBuilder.append("')");
            adId = new AdId(n4, stringBuilder.toString(), string2.startsWith("INT-"), string2.startsWith("BAN-"));
        }
        return adId;
    }

    public static AdId parse(String string) {
        if (string == null) {
            return null;
        }
        AdId adId = (AdId)e.get((Object)string.toUpperCase(Locale.ENGLISH));
        if (adId != null) {
            return adId;
        }
        return AdId.custom(string);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            AdId adId = (AdId)object;
            if (this.a == adId.a && this.c == adId.c && this.d == adId.d) {
                return true;
            }
        }
        return false;
    }

    public int getIndex() {
        return this.a;
    }

    public int hashCode() {
        return 31 * (31 * this.a + this.c) + this.d;
    }

    public boolean isBannerId() {
        return this.d;
    }

    public boolean isInterstitialId() {
        return this.c;
    }

    public String toString() {
        return this.b;
    }
}

