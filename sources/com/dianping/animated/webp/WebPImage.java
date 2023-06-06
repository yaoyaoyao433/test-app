package com.dianping.animated.webp;

import android.util.SparseArray;
import com.dianping.animated.base.DoNotStrip;
import com.dianping.animated.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class WebPImage {
    public static ChangeQuickRedirect a = null;
    private static boolean c = false;
    private SparseArray<com.dianping.animated.base.a> b;
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    @DoNotStrip
    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDuration();

    @DoNotStrip
    private native WebPFrame nativeGetFrame(int i);

    @DoNotStrip
    private native int nativeGetFrameCount();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetSizeInBytes();

    @DoNotStrip
    private native int nativeGetWidth();

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotStrip
    public native int[] nativeGetFrameDurations();

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotStrip
    public native int nativeGetLoopCount();

    @DoNotStrip
    public WebPImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f64d11cf094c9738d5e48da01ed1e6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f64d11cf094c9738d5e48da01ed1e6f");
        } else {
            this.b = new SparseArray<>();
        }
    }

    @DoNotStrip
    public WebPImage(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25fbd9da1b028ee987ede9f3222ac8aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25fbd9da1b028ee987ede9f3222ac8aa");
            return;
        }
        this.b = new SparseArray<>();
        this.mNativeContext = j;
    }

    private static synchronized void d() {
        synchronized (WebPImage.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f0b9e01d9854ec79b8932c13bfa80ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f0b9e01d9854ec79b8932c13bfa80ac");
                return;
            }
            if (!c) {
                System.loadLibrary("animated-webp");
                c = true;
            }
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10fc382f3e991142fb77a0f798405e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10fc382f3e991142fb77a0f798405e18");
            return;
        }
        nativeFinalize();
        super.finalize();
    }

    public static WebPImage a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52c83e1b9e449df9e397a7af9e602ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebPImage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52c83e1b9e449df9e397a7af9e602ca6");
        }
        d();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c134d8de284f2c3532df8013e6ea4abb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c134d8de284f2c3532df8013e6ea4abb")).intValue() : nativeGetWidth();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ecaec2927df4c15fa9d4c6a6180047d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ecaec2927df4c15fa9d4c6a6180047d")).intValue() : nativeGetHeight();
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6a1b55f3010aa5b949b1d17d515533", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6a1b55f3010aa5b949b1d17d515533")).intValue() : nativeGetFrameCount();
    }

    public final WebPFrame a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0a69d57b5131d7048f87e662cc9b53", RobustBitConfig.DEFAULT_VALUE) ? (WebPFrame) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0a69d57b5131d7048f87e662cc9b53") : nativeGetFrame(i);
    }

    public final com.dianping.animated.base.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69aca55cb22c6e28b83026cb8425000d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.animated.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69aca55cb22c6e28b83026cb8425000d");
        }
        com.dianping.animated.base.a aVar = this.b.get(i);
        if (aVar == null) {
            WebPFrame a2 = a(i);
            try {
                int d = a2.d();
                int e = a2.e();
                int b = a2.b();
                int c2 = a2.c();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = WebPFrame.a;
                a.EnumC0054a enumC0054a = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e618ba7d1be3b4b955813fb74d99b48b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e618ba7d1be3b4b955813fb74d99b48b")).booleanValue() : a2.nativeIsBlendWithPreviousFrame() ? a.EnumC0054a.BLEND_WITH_PREVIOUS : a.EnumC0054a.NO_BLEND;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = WebPFrame.a;
                com.dianping.animated.base.a aVar2 = new com.dianping.animated.base.a(i, d, e, b, c2, enumC0054a, PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "894c35d8187eabeae51a2a34ae79ba3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "894c35d8187eabeae51a2a34ae79ba3e")).booleanValue() : a2.nativeShouldDisposeToBackgroundColor() ? a.b.DISPOSE_TO_BACKGROUND : a.b.DISPOSE_DO_NOT);
                this.b.put(i, aVar2);
                return aVar2;
            } finally {
                a2.a();
            }
        }
        return aVar;
    }
}
