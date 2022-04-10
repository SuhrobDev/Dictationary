/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ListAdapter
 *  com.appbrain.AppBrainUserData
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appbrain;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import com.appbrain.AdListAdapter;
import com.appbrain.AdOptions;
import com.appbrain.AppBrainUserData;

public interface AdService {
    public String getOfferWallButtonLabel(Context var1);

    @Deprecated
    public boolean maybeShowInterstitial(Context var1);

    @Deprecated
    public boolean maybeShowInterstitial(Context var1, AdOptions var2);

    public void setOfferWallClickListener(Context var1, View var2);

    public void setOfferWallClickListener(Context var1, View var2, View.OnClickListener var3);

    public void setOfferWallMenuItemClickListener(Context var1, MenuItem var2);

    public void setOfferWallMenuItemClickListener(Context var1, MenuItem var2, MenuItem.OnMenuItemClickListener var3);

    public void setPopupBorder(int var1, BorderSize var2);

    public void setReturnToAppInterstitial(ReturnToAppConfig var1);

    public void setUserData(AppBrainUserData var1);

    public boolean shouldShowInterstitial(Context var1);

    @Deprecated
    public boolean showInterstitial(Context var1);

    @Deprecated
    public boolean showInterstitial(Context var1, AdOptions var2);

    public void showOfferWall(Context var1);

    public void tagForChildDirectedTreatment(boolean var1);

    public void unityOfferWallButtonClick(Context var1);

    public AdListAdapter wrapListAdapter(Context var1, ListAdapter var2);

    public AdListAdapter wrapListAdapter(Context var1, ListAdapter var2, int var3, int var4, int var5, int var6);

    public AdListAdapter wrapListAdapter(Context var1, ListAdapter var2, AdListAdapter.AdLayoutCreator var3, int var4, int var5, int var6);

    public static final class BorderSize
    extends Enum {
        public static final /* enum */ BorderSize LARGE;
        public static final /* enum */ BorderSize MEDIUM;
        public static final /* enum */ BorderSize NONE;
        public static final /* enum */ BorderSize SMALL;
        private static final /* synthetic */ BorderSize[] a;
        public final int sizeDp;

        static {
            BorderSize borderSize;
            BorderSize borderSize2;
            BorderSize borderSize3;
            BorderSize borderSize4;
            NONE = borderSize2 = new BorderSize("NONE", 0, 0);
            SMALL = borderSize4 = new BorderSize("SMALL", 1, 2);
            MEDIUM = borderSize = new BorderSize("MEDIUM", 2, 4);
            LARGE = borderSize3 = new BorderSize("LARGE", 3, 8);
            a = new BorderSize[]{borderSize2, borderSize4, borderSize, borderSize3};
        }

        /*
         * Exception decompiling
         */
        private BorderSize() {
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

        public static BorderSize valueOf(String string) {
            return (BorderSize)Enum.valueOf(BorderSize.class, (String)string);
        }

        public static BorderSize[] values() {
            return (BorderSize[])a.clone();
        }
    }

    public static final class ReturnToAppConfig
    extends Enum {
        public static final /* enum */ ReturnToAppConfig FROM_DASHBOARD;
        public static final /* enum */ ReturnToAppConfig OFF;
        public static final /* enum */ ReturnToAppConfig ON;
        private static final /* synthetic */ ReturnToAppConfig[] a;

        static {
            ReturnToAppConfig returnToAppConfig;
            ReturnToAppConfig returnToAppConfig2;
            ReturnToAppConfig returnToAppConfig3;
            FROM_DASHBOARD = returnToAppConfig2 = new ReturnToAppConfig("FROM_DASHBOARD", 0);
            OFF = returnToAppConfig3 = new ReturnToAppConfig("OFF", 1);
            ON = returnToAppConfig = new ReturnToAppConfig("ON", 2);
            a = new ReturnToAppConfig[]{returnToAppConfig2, returnToAppConfig3, returnToAppConfig};
        }

        /*
         * Exception decompiling
         */
        private ReturnToAppConfig() {
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

        public static ReturnToAppConfig valueOf(String string) {
            return (ReturnToAppConfig)Enum.valueOf(ReturnToAppConfig.class, (String)string);
        }

        public static ReturnToAppConfig[] values() {
            return (ReturnToAppConfig[])a.clone();
        }
    }

}

