package com.meituan.msc.modules.service.codecache;

import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final int[] b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133854f1ec820322be0a0a9c6040d21b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133854f1ec820322be0a0a9c6040d21b");
        } else {
            this.b = new int[LoadJSCodeCacheCallback.LoadStatus.valuesCustom().length];
        }
    }

    public final a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35adb8188970266b4cfd1b805c4faf92", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35adb8188970266b4cfd1b805c4faf92");
        }
        a a2 = a();
        for (int i = 0; i < a2.b.length; i++) {
            int[] iArr = a2.b;
            iArr[i] = iArr[i] - aVar.b[i];
        }
        return a2;
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9150a399339eb2b85ab945ecc4f73e74", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9150a399339eb2b85ab945ecc4f73e74") : new a(Arrays.copyOf(this.b, this.b.length));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final int[] b;

        private a(int[] iArr) {
            Object[] objArr = {iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149f56f09a0b50124608039b07748a31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149f56f09a0b50124608039b07748a31");
            } else {
                this.b = iArr;
            }
        }

        public final int a(LoadJSCodeCacheCallback.LoadStatus loadStatus) {
            Object[] objArr = {loadStatus};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dbb339fa96851dd8c8995696429d6c9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dbb339fa96851dd8c8995696429d6c9")).intValue();
            }
            return (loadStatus != null ? Integer.valueOf(this.b[loadStatus.ordinal()]) : null).intValue();
        }
    }
}
