package com.meituan.android.paybase.downgrading;

import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a = null;
    private static volatile Boolean r = Boolean.valueOf(b());
    private static final long serialVersionUID = 8997018580215686320L;
    public double b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "061db4d89cd942910c36aeb1e5fa96b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "061db4d89cd942910c36aeb1e5fa96b3");
            return;
        }
        this.b = 6.0d;
        this.d = false;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = false;
        this.q = true;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "677681c0e73ba5e93e5036d249cd3bd6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "677681c0e73ba5e93e5036d249cd3bd6")).booleanValue() : r.booleanValue();
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb6c369a0a70701de1fbc6c910dbfb18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb6c369a0a70701de1fbc6c910dbfb18")).booleanValue();
        }
        try {
            return af.a("jinrong_pay_horn_cache").b("finance_boot_optimize", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50c39f357585a93a8791a4876e076223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50c39f357585a93a8791a4876e076223");
            return;
        }
        try {
            af.a("jinrong_pay_horn_cache").a("finance_boot_optimize", z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
