package com.meituan.mtwebkit.internal.mode;

import android.content.pm.PackageInfo;
import com.meituan.mtwebkit.MTWebViewFactoryProvider;
import com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext;
import com.meituan.mtwebkit.internal.k;
import com.meituan.mtwebkit.internal.l;
import com.meituan.mtwebkit.internal.system.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends e {
    public static ChangeQuickRedirect g;

    @Override // com.meituan.mtwebkit.internal.mode.e, com.meituan.mtwebkit.internal.m
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ade22fd1d9cc19dd0ee2f108a4a078f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ade22fd1d9cc19dd0ee2f108a4a078f");
            return;
        }
        PackageInfo b = l.b();
        StringBuilder sb = new StringBuilder("createFactoryProviderLocked, 本地包: ");
        sb.append(b != null ? Integer.valueOf(b.versionCode) : "为空");
        com.meituan.mtwebkit.internal.e.c("MTWebViewFromNetMode", sb.toString());
        if (b != null) {
            try {
                final MTWebViewFromLocalStorageContext mTWebViewFromLocalStorageContext = new MTWebViewFromLocalStorageContext(b);
                this.e = mTWebViewFromLocalStorageContext;
                this.d = mTWebViewFromLocalStorageContext.b;
                k.a.a.a(new Runnable() { // from class: com.meituan.mtwebkit.internal.mode.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "289c29ec9f6f49445151fadfbb42d34c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "289c29ec9f6f49445151fadfbb42d34c");
                        } else {
                            mTWebViewFromLocalStorageContext.b();
                        }
                    }
                });
                b = mTWebViewFromLocalStorageContext.a();
                com.meituan.mtwebkit.internal.e.c("MTWebViewFromNetMode", "自研内核加载成功, 构造MTWebViewFactoryProvider. status: " + l.c());
            } catch (Throwable th) {
                l.a(th, 9);
            }
            if (b == null) {
                com.meituan.mtwebkit.internal.e.c("MTWebViewFromNetMode", "自研内核加载失败, 构造系统FactoryProvider. status: " + l.c());
                b = new y();
                this.e = null;
                this.d = null;
            }
        } else {
            com.meituan.mtwebkit.internal.e.c("MTWebViewFromNetMode", "requestPackageInfoSafely获取的包为空, 构造系统FactoryProvider. status: " + l.c());
            b = new y();
        }
        l.a(1, (l.a<Boolean>) null);
    }

    @Override // com.meituan.mtwebkit.internal.m
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9e6649d25522b0cd5b1b976a06480b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9e6649d25522b0cd5b1b976a06480b");
            return;
        }
        synchronized (c) {
            if (this.e != null) {
                MTWebViewFromLocalStorageContext mTWebViewFromLocalStorageContext = (MTWebViewFromLocalStorageContext) this.e;
                mTWebViewFromLocalStorageContext.c();
                b = (MTWebViewFactoryProvider) Objects.requireNonNull(mTWebViewFromLocalStorageContext.a(), "MTWebViewFactoryProvider can not be null here");
            } else {
                super.h();
            }
        }
    }
}
