package com.meituan.snare;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.h;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static final p d = new p();
    n b;
    String c;
    private h.a e;

    public static /* synthetic */ boolean a(p pVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, pVar, changeQuickRedirect, false, "9bc460f4fa9f46234a75459382665020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, pVar, changeQuickRedirect, false, "9bc460f4fa9f46234a75459382665020")).booleanValue();
        }
        File file = new File(pVar.c);
        return file.exists() && file.length() > 51200;
    }

    public static /* synthetic */ boolean b(p pVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, pVar, changeQuickRedirect, false, "0a6e5123cf9de923f4750e09b95c8d93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, pVar, changeQuickRedirect, false, "0a6e5123cf9de923f4750e09b95c8d93")).booleanValue() : pVar.d() >= 0 && pVar.a(pVar.c) >= 0;
    }

    public static p a() {
        return d;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab972302403d285ea9cd3e18c17c02f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab972302403d285ea9cd3e18c17c02f7");
        } else if (this.b == null || !this.b.m) {
        } else {
            if (this.e != null) {
                h.a().a(this.e);
            }
            d();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19fdaa6e99a504eb3a8cd9f83292a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19fdaa6e99a504eb3a8cd9f83292a1a");
        } else if (this.b == null || !this.b.m || TextUtils.isEmpty(this.c) || a(this.c) < 0) {
        } else {
            if (this.e == null) {
                this.e = new h.a() { // from class: com.meituan.snare.p.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.snare.h.a
                    public final boolean a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b87c7ef4008370a4a58e67100779d6e", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b87c7ef4008370a4a58e67100779d6e")).booleanValue();
                        }
                        if (p.a(p.this)) {
                            return p.b(p.this);
                        }
                        return true;
                    }
                };
            }
            h.a().a(30000L, this.e);
        }
    }

    private synchronized int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64cfbefd56c4df272c47f657b39864a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64cfbefd56c4df272c47f657b39864a")).intValue();
        }
        try {
            return NativeCrashHandler.redirectStderrJava(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private synchronized int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d53bbcdd9c09cfd641970b1cd3ec28b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d53bbcdd9c09cfd641970b1cd3ec28b")).intValue();
        }
        try {
            return NativeCrashHandler.restoreStderrJava();
        } catch (Throwable unused) {
            return -1;
        }
    }
}
