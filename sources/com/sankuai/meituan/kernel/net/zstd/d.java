package com.sankuai.meituan.kernel.net.zstd;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.loader.DynLoader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    private volatile boolean c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        String a();

        byte[] a(Object obj, byte[] bArr) throws Throwable;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee7052495e9557d69687fc01a07f82d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee7052495e9557d69687fc01a07f82d");
            return;
        }
        this.c = false;
        this.b = false;
    }

    private synchronized boolean a() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ffec14e221bd886d287d918a191173", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ffec14e221bd886d287d918a191173")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b) {
            return true;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "770fa05014e58f1d6727726c47178621", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "770fa05014e58f1d6727726c47178621")).booleanValue();
        } else {
            if (this.d != null && !TextUtils.isEmpty(this.d.a())) {
                f.a("check zstd so whether available");
                z = DynLoader.available(this.d.a(), 1);
            }
            z = false;
        }
        f.a("loadSoFromLocal available=", Boolean.valueOf(z));
        if (!z) {
            f.a("so 文件不存在");
            return false;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "929da668f384a4dff90c0769ebc30bc4", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "929da668f384a4dff90c0769ebc30bc4")).booleanValue();
        } else {
            if (this.d != null && !TextUtils.isEmpty(this.d.a())) {
                z2 = DynLoader.load(this.d.a());
            }
            z2 = false;
        }
        if (!z2) {
            f.a("so 加载失败");
            return false;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a964dc7995657f87499152140b168e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a964dc7995657f87499152140b168e06");
        } else {
            try {
                Field declaredField = Class.forName("com.github.luben.zstd.util.Native").getDeclaredField("loaded");
                declaredField.setAccessible(true);
                declaredField.set(null, Boolean.TRUE);
                f.a("change Native.loaded=", declaredField.get(null));
                this.b = true;
            } catch (Exception e) {
                e.printStackTrace();
                f.a("so 加载失败 反射错误");
            }
        }
        f.a("so 加载成功，耗时：", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return true;
    }

    public final byte[] a(Object obj, byte[] bArr) throws Throwable {
        Object[] objArr = {obj, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9eb6c56cb550e2b031d0a4d4339689a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9eb6c56cb550e2b031d0a4d4339689a");
        }
        if (!a() || this.d == null) {
            return null;
        }
        try {
            return this.d.a(obj, bArr);
        } catch (Throwable th) {
            b.a().a(th instanceof Exception, "nativeUncompressZstd " + Log.getStackTraceString(th));
            throw th;
        }
    }
}
