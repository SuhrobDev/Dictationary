/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.appbrain.InterstitialListener
 *  com.appbrain.a.w
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appbrain;

import com.appbrain.AdId;
import com.appbrain.InterstitialListener;
import com.appbrain.a.w;

public class AdOptions {
    private volatile InterstitialListener a;
    private volatile Type b = Type.SMART;
    private volatile Theme c = Theme.SMART;
    private volatile String d;
    private volatile ScreenType e = ScreenType.FULLSCREEN;
    private volatile AdId f;

    public AdOptions() {
        if (w.b()) {
            this.d = "unity";
        }
    }

    public AdId getAdId() {
        return this.f;
    }

    public String getAnalyticsString() {
        return this.d;
    }

    public InterstitialListener getListener() {
        return this.a;
    }

    public ScreenType getScreenType() {
        return this.e;
    }

    public Theme getTheme() {
        return this.c;
    }

    public Type getType() {
        return this.b;
    }

    public void setAdId(AdId adId) {
        this.f = adId;
    }

    public AdOptions setAnalyticsString(String string) {
        this.d = w.b((String)string);
        return this;
    }

    public AdOptions setListener(InterstitialListener interstitialListener) {
        this.a = interstitialListener;
        return this;
    }

    public AdOptions setScreenType(ScreenType screenType) {
        this.e = screenType;
        return this;
    }

    public AdOptions setTheme(Theme theme) {
        this.c = theme;
        return this;
    }

    public AdOptions setType(Type type) {
        this.b = type;
        return this;
    }

    public static final class ScreenType
    extends Enum {
        public static final /* enum */ ScreenType DIALOG;
        public static final /* enum */ ScreenType FULLSCREEN;
        private static final /* synthetic */ ScreenType[] a;

        static {
            ScreenType screenType;
            ScreenType screenType2;
            FULLSCREEN = screenType2 = new ScreenType("FULLSCREEN", 0);
            DIALOG = screenType = new ScreenType("DIALOG", 1);
            a = new ScreenType[]{screenType2, screenType};
        }

        /*
         * Exception decompiling
         */
        private ScreenType() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException
            // org.benf.cfr.reader.b.a.f.g.a(VariableFactory.java:53)
            // org.benf.cfr.reader.b.a.a.g.b(Op02WithProcessedDataAndRefs.java:911)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:959)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:56)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2010)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2007)
            // org.benf.cfr.reader.util.d.a.d(AbstractGraphVisitorFI.java:60)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:2019)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:340)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:923)
            throw new IllegalStateException("Decompilation failed");
        }

        public static ScreenType valueOf(String string) {
            return (ScreenType)Enum.valueOf(ScreenType.class, (String)string);
        }

        public static ScreenType[] values() {
            return (ScreenType[])a.clone();
        }
    }

    public static final class Theme
    extends Enum {
        public static final /* enum */ Theme DARK;
        public static final /* enum */ Theme LIGHT;
        public static final /* enum */ Theme SMART;
        private static final /* synthetic */ Theme[] a;

        static {
            Theme theme;
            Theme theme2;
            Theme theme3;
            SMART = theme = new Theme("SMART", 0);
            LIGHT = theme2 = new Theme("LIGHT", 1);
            DARK = theme3 = new Theme("DARK", 2);
            a = new Theme[]{theme, theme2, theme3};
        }

        /*
         * Exception decompiling
         */
        private Theme() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException
            // org.benf.cfr.reader.b.a.f.g.a(VariableFactory.java:53)
            // org.benf.cfr.reader.b.a.a.g.b(Op02WithProcessedDataAndRefs.java:911)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:959)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:56)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2010)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2007)
            // org.benf.cfr.reader.util.d.a.d(AbstractGraphVisitorFI.java:60)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:2019)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:340)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:923)
            throw new IllegalStateException("Decompilation failed");
        }

        public static Theme valueOf(String string) {
            return (Theme)Enum.valueOf(Theme.class, (String)string);
        }

        public static Theme[] values() {
            return (Theme[])a.clone();
        }
    }

    public static final class Type
    extends Enum {
        public static final /* enum */ Type MORE_APPS;
        public static final /* enum */ Type SINGLE_APP;
        public static final /* enum */ Type SMART;
        private static final /* synthetic */ Type[] a;

        static {
            Type type;
            Type type2;
            Type type3;
            SMART = type = new Type("SMART", 0);
            MORE_APPS = type3 = new Type("MORE_APPS", 1);
            SINGLE_APP = type2 = new Type("SINGLE_APP", 2);
            a = new Type[]{type, type3, type2};
        }

        /*
         * Exception decompiling
         */
        private Type() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException
            // org.benf.cfr.reader.b.a.f.g.a(VariableFactory.java:53)
            // org.benf.cfr.reader.b.a.a.g.b(Op02WithProcessedDataAndRefs.java:911)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:959)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:56)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2010)
            // org.benf.cfr.reader.b.a.a.g$3.a(Op02WithProcessedDataAndRefs.java:2007)
            // org.benf.cfr.reader.util.d.a.d(AbstractGraphVisitorFI.java:60)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:2019)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:340)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:923)
            throw new IllegalStateException("Decompilation failed");
        }

        public static Type valueOf(String string) {
            return (Type)Enum.valueOf(Type.class, (String)string);
        }

        public static Type[] values() {
            return (Type[])a.clone();
        }
    }

}

