package com.dianping.animated.webp;

import android.graphics.Bitmap;
import com.dianping.animated.base.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WebPFrame {
    public static ChangeQuickRedirect a;
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDurationMs();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetWidth();

    @DoNotStrip
    private native int nativeGetXOffset();

    @DoNotStrip
    private native int nativeGetYOffset();

    @DoNotStrip
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotStrip
    public native boolean nativeIsBlendWithPreviousFrame();

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotStrip
    public native boolean nativeShouldDisposeToBackgroundColor();

    @DoNotStrip
    public WebPFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1b0b42d23a1f53fc2f0caed490e028", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1b0b42d23a1f53fc2f0caed490e028");
        } else {
            this.mNativeContext = j;
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741ecba5c7694eaf5c316ba2d8975aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741ecba5c7694eaf5c316ba2d8975aaf");
            return;
        }
        nativeFinalize();
        super.finalize();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87aba562553540374ac6043e272cbd2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87aba562553540374ac6043e272cbd2b");
        } else {
            nativeDispose();
        }
    }

    public final void a(int i, int i2, Bitmap bitmap) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276f9188ee55771276f3b4ee35a302a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276f9188ee55771276f3b4ee35a302a7");
        } else {
            nativeRenderFrame(i, i2, bitmap);
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e89dd73e65320b088d1a8a11e59df87", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e89dd73e65320b088d1a8a11e59df87")).intValue() : nativeGetWidth();
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53578628a48b25a1f185bca690535876", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53578628a48b25a1f185bca690535876")).intValue() : nativeGetHeight();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ef8fc5b1f1b76069a88710c364e66c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ef8fc5b1f1b76069a88710c364e66c")).intValue() : nativeGetXOffset();
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650d809fea2d51cd0aed83f12e8c7cf7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650d809fea2d51cd0aed83f12e8c7cf7")).intValue() : nativeGetYOffset();
    }
}
