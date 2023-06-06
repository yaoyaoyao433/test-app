package com.dianping.imagemanager.animated.gif.java;

import android.graphics.Bitmap;
import com.dianping.imagemanager.animated.gif.java.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements a.InterfaceC0076a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.imagemanager.animated.gif.java.a.InterfaceC0076a
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), config};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fab30df8cd3541193d099177768e72b", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fab30df8cd3541193d099177768e72b") : Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.dianping.imagemanager.animated.gif.java.a.InterfaceC0076a
    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f9419744b7141dc19d4d0cbf1873b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f9419744b7141dc19d4d0cbf1873b5");
        } else {
            bitmap.recycle();
        }
    }

    @Override // com.dianping.imagemanager.animated.gif.java.a.InterfaceC0076a
    public final byte[] a(int i) {
        return new byte[i];
    }

    @Override // com.dianping.imagemanager.animated.gif.java.a.InterfaceC0076a
    public final int[] b(int i) {
        return new int[i];
    }
}
