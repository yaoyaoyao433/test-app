package com.dianping.mainboard;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public double b;
    public double c;
    public String d;
    public long e;
    public String f;
    public boolean g;
    public String h;
    public int i;
    public String j;
    private com.dianping.mainboard.b k;
    private b l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        String a();
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2386a6be2e92cae6cd3c66d1976b5fa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2386a6be2e92cae6cd3c66d1976b5fa8");
        }
        if (this.l != null) {
            return this.l.a();
        }
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa13618f9c38012b04cb0786ec7d1d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa13618f9c38012b04cb0786ec7d1d25");
            return;
        }
        this.f = "0";
        this.k = com.dianping.mainboard.b.a();
    }

    public static final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c51ade967929ba67c0904ce527181608", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c51ade967929ba67c0904ce527181608") : C0091a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.mainboard.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0091a {
        private static final a a = new a();
    }

    @Deprecated
    public final synchronized void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a5c7bb2c3abc4d28f2622f0d3ddbf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a5c7bb2c3abc4d28f2622f0d3ddbf9");
            return;
        }
        this.k.a(DeviceInfo.USER_ID, j);
        this.e = j;
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507f45c7c359169230ef41e33d5e3dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507f45c7c359169230ef41e33d5e3dd4");
            return;
        }
        this.k.a("isLogin", z);
        this.g = z;
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9ca0424a1a4f3f1eb3f7ec3a927747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9ca0424a1a4f3f1eb3f7ec3a927747");
            return;
        }
        this.k.a("pushToken", str);
        this.h = str;
    }
}
