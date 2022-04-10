/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.UiThread
 *  com.appbrain.AppBrainBanner$a
 *  com.appbrain.AppBrainBanner$b
 *  com.appbrain.AppBrainBanner$c
 *  com.appbrain.BannerListener
 *  com.appbrain.a
 *  com.appbrain.a.a
 *  com.appbrain.a.a$a
 *  com.appbrain.a.ac
 *  com.appbrain.a.ac$a
 *  com.appbrain.a.ac$b
 *  com.appbrain.a.ae
 *  com.appbrain.a.bb
 *  com.appbrain.a.bb$a
 *  com.appbrain.a.p
 *  com.appbrain.a.p$a
 *  com.appbrain.a.r
 *  com.appbrain.a.w
 *  com.appbrain.b
 *  com.appbrain.b.f
 *  com.appbrain.c
 *  com.appbrain.c.ai
 *  com.appbrain.c.b
 *  com.appbrain.c.l
 *  com.appbrain.d
 *  com.appbrain.e
 *  com.appbrain.f
 *  com.appbrain.g
 *  com.appbrain.h
 *  com.appbrain.i
 *  com.appbrain.j
 *  com.appbrain.k
 *  com.appbrain.l
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.appbrain;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.appbrain.AdId;
import com.appbrain.AppBrainBanner;
import com.appbrain.BannerListener;
import com.appbrain.a.a;
import com.appbrain.a.ac;
import com.appbrain.a.ae;
import com.appbrain.a.bb;
import com.appbrain.a.p;
import com.appbrain.a.r;
import com.appbrain.a.w;
import com.appbrain.b.f;
import com.appbrain.c.ai;
import com.appbrain.d;
import com.appbrain.e;
import com.appbrain.g;
import com.appbrain.h;
import com.appbrain.i;
import com.appbrain.j;
import com.appbrain.k;
import com.appbrain.l;

public class AppBrainBanner
extends FrameLayout {
    private final ac.a a;
    private p b;
    private a.a c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final p.a g;

    public AppBrainBanner(Context context) {
        this(context, null);
    }

    public AppBrainBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppBrainBanner(Context context, AttributeSet attributeSet, int n) {
        ac.a a2;
        super(context, attributeSet, n);
        this.a = a2 = new ac.a();
        this.e = true;
        this.g = new c(this);
        com.appbrain.c.b.a().a((View)this);
        this.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
        a2.a(this.a());
        a2.a(attributeSet, this.isInEditMode());
    }

    @UiThread
    private void A() {
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.isInEditMode()) {
            this.x();
            return;
        }
        com.appbrain.c.l.a().a((Runnable)new com.appbrain.a(this));
    }

    private /* synthetic */ void B(int n) {
        this.a.d(n);
    }

    @UiThread
    private void C() {
        p p2 = this.b;
        if (p2 != null) {
            p2.a();
            return;
        }
        if (this.G()) {
            this.A();
        }
    }

    private /* synthetic */ void D(int n) {
        this.a.b(n);
    }

    static /* synthetic */ boolean E(AppBrainBanner appBrainBanner) {
        return appBrainBanner.G();
    }

    private /* synthetic */ void F(int n) {
        this.a.a(n);
    }

    @UiThread
    private boolean G() {
        boolean bl = this.c != null;
        return bl && this.getVisibility() == 0;
    }

    static /* synthetic */ boolean H(AppBrainBanner appBrainBanner) {
        return appBrainBanner.f;
    }

    private /* synthetic */ void I() {
        if (r.a().c()) {
            this.x();
            this.b.d();
            return;
        }
        BannerListener bannerListener = this.a.b();
        if (bannerListener != null) {
            bannerListener.onAdRequestDone(false);
        }
    }

    public static /* synthetic */ void a(AppBrainBanner appBrainBanner, int n) {
        appBrainBanner.F(n);
    }

    public static /* synthetic */ void b(AppBrainBanner appBrainBanner, boolean bl) {
        appBrainBanner.t(bl);
    }

    public static /* synthetic */ void c(AppBrainBanner appBrainBanner, int n) {
        appBrainBanner.D(n);
    }

    public static /* synthetic */ void d(AppBrainBanner appBrainBanner, BannerListener bannerListener) {
        appBrainBanner.s(bannerListener);
    }

    public static /* synthetic */ void e(AppBrainBanner appBrainBanner, boolean bl, String string) {
        appBrainBanner.u(bl, string);
    }

    public static /* synthetic */ void f(AppBrainBanner appBrainBanner, BannerSize bannerSize, BannerSize bannerSize2) {
        appBrainBanner.q(bannerSize, bannerSize2);
    }

    public static /* synthetic */ void g(AppBrainBanner appBrainBanner, int n) {
        appBrainBanner.y(n);
    }

    public static /* synthetic */ void h(AppBrainBanner appBrainBanner, AdId adId) {
        appBrainBanner.p(adId);
    }

    public static /* synthetic */ void i(AppBrainBanner appBrainBanner, int n) {
        appBrainBanner.B(n);
    }

    public static /* synthetic */ void j(AppBrainBanner appBrainBanner) {
        appBrainBanner.x();
    }

    public static /* synthetic */ void k(AppBrainBanner appBrainBanner, int n) {
        appBrainBanner.o(n);
    }

    public static /* synthetic */ void l(AppBrainBanner appBrainBanner) {
        appBrainBanner.I();
    }

    static /* synthetic */ p m(AppBrainBanner appBrainBanner) {
        return appBrainBanner.b;
    }

    static /* synthetic */ p n(AppBrainBanner appBrainBanner, p p2) {
        appBrainBanner.b = p2;
        return p2;
    }

    private /* synthetic */ void o(int n) {
        this.a.e(n);
    }

    private /* synthetic */ void p(AdId adId) {
        this.a.a(adId);
    }

    private /* synthetic */ void q(BannerSize bannerSize, BannerSize bannerSize2) {
        this.a.a(bannerSize, bannerSize2);
    }

    static /* synthetic */ void r(AppBrainBanner appBrainBanner, int n, int n2) {
        super.onMeasure(n, n2);
    }

    private /* synthetic */ void s(BannerListener bannerListener) {
        this.a.a(bannerListener);
    }

    private /* synthetic */ void t(boolean bl) {
        this.e = bl;
    }

    private /* synthetic */ void u(boolean bl, String string) {
        this.a.a(bl, w.b((String)string));
    }

    static /* synthetic */ boolean v(AppBrainBanner appBrainBanner, boolean bl) {
        appBrainBanner.f = bl;
        return bl;
    }

    static /* synthetic */ p.a w(AppBrainBanner appBrainBanner) {
        return appBrainBanner.g;
    }

    @UiThread
    private void x() {
        if (this.b != null) {
            return;
        }
        ac ac2 = this.a.a();
        Object object = this.e && !ac2.b() && !this.isInEditMode() && f.a().a(ac2.i()) ? new bb(this.g, ac2, (bb.a)new b(this)) : new ae(this.g, ac2);
        this.b = object;
        this.b.a();
    }

    private /* synthetic */ void y(int n) {
        this.a.c(n);
    }

    static /* synthetic */ ac.a z(AppBrainBanner appBrainBanner) {
        return appBrainBanner.a;
    }

    protected ac.b a() {
        return null;
    }

    public BannerListener getBannerListener() {
        return this.a.b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            this.c = com.appbrain.a.a.a((View)this, (a.a)new a(this));
            this.f = false;
            this.C();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a.a a2 = this.c;
        if (a2 != null) {
            com.appbrain.a.a.a((a.a)a2);
            this.c = null;
            this.C();
        }
    }

    protected void onMeasure(int n, int n2) {
        p p2 = this.b;
        if (p2 == null) {
            super.onMeasure(n, n2);
            return;
        }
        p2.a(n, n2);
    }

    public void requestAd() {
        com.appbrain.c.l.a().a((Runnable)new d(this));
    }

    public void setAdId(AdId adId) {
        ai.b((Runnable)new j(this, adId));
    }

    public void setAllowedToUseMediation(boolean bl) {
        ai.b((Runnable)new com.appbrain.b(this, bl));
    }

    public void setBannerListener(BannerListener bannerListener) {
        ai.b((Runnable)new l(this, bannerListener));
    }

    public void setButtonTextIndex(int n) {
        ai.b((Runnable)new com.appbrain.f(this, n));
    }

    public void setColors(int n) {
        ai.b((Runnable)new g(this, n));
    }

    public void setDesign(int n) {
        ai.b((Runnable)new h(this, n));
    }

    public void setIsMediatedBanner(boolean bl, String string) {
        ai.b((Runnable)new com.appbrain.c(this, bl, string));
    }

    public void setSingleAppDesign(int n) {
        ai.b((Runnable)new i(this, n));
    }

    public void setSize(BannerSize bannerSize) {
        this.setSize(bannerSize, bannerSize);
    }

    public void setSize(BannerSize bannerSize, BannerSize bannerSize2) {
        ai.b((Runnable)new k(this, bannerSize, bannerSize2));
    }

    public void setTitleIndex(int n) {
        ai.b((Runnable)new e(this, n));
    }

    public void setVisibility(int n) {
        super.setVisibility(n);
        this.C();
    }

    public static final class BannerSize
    extends Enum {
        public static final /* enum */ BannerSize LARGE;
        public static final /* enum */ BannerSize MATCH_PARENT;
        public static final /* enum */ BannerSize RESPONSIVE;
        public static final /* enum */ BannerSize STANDARD;
        private static final /* synthetic */ BannerSize[] a;

        static {
            BannerSize bannerSize;
            BannerSize bannerSize2;
            BannerSize bannerSize3;
            BannerSize bannerSize4;
            STANDARD = bannerSize2 = new BannerSize("STANDARD", 0);
            LARGE = bannerSize3 = new BannerSize("LARGE", 1);
            RESPONSIVE = bannerSize4 = new BannerSize("RESPONSIVE", 2);
            MATCH_PARENT = bannerSize = new BannerSize("MATCH_PARENT", 3);
            a = new BannerSize[]{bannerSize2, bannerSize3, bannerSize4, bannerSize};
        }

        /*
         * Exception decompiling
         */
        private BannerSize() {
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

        public static BannerSize valueOf(String string) {
            return (BannerSize)Enum.valueOf(BannerSize.class, (String)string);
        }

        public static BannerSize[] values() {
            return (BannerSize[])a.clone();
        }
    }

}

