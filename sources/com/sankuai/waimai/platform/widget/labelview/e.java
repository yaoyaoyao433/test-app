package com.sankuai.waimai.platform.widget.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e implements d {
    public static ChangeQuickRedirect c;
    private Integer a;
    private Integer b;
    int d;
    private Integer e;

    private static boolean a(Integer num) {
        return num != null;
    }

    public void a() {
    }

    public e(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b367f95a6918d54d1fed82090fcec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b367f95a6918d54d1fed82090fcec7");
        } else {
            this.d = 0;
        }
    }

    private static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5e313c59690a653cec6de2265d1ec54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5e313c59690a653cec6de2265d1ec54")).booleanValue();
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final void a(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75df77435bcd8e23af9f6e8f43072ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75df77435bcd8e23af9f6e8f43072ff");
        } else if (this.d == i && a(this.a, num) && a(this.b, num2) && a(this.e, num3)) {
        } else {
            b(i, num, num2, num3);
            a();
        }
    }

    public final void b(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899cb16a094ee4a0282150ee8747250c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899cb16a094ee4a0282150ee8747250c");
            return;
        }
        this.d = i;
        this.a = num;
        this.b = num2;
        this.e = num3;
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1497eb0916b838f79172650b2ad28f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1497eb0916b838f79172650b2ad28f")).booleanValue();
        }
        switch (i) {
            case 2:
                return c();
            case 3:
                return b();
            case 4:
                return d();
            default:
                return true;
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b5736a21554bf546fb42c803f63536", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b5736a21554bf546fb42c803f63536")).booleanValue() : a(this.b);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49f4e6db024b2c4707c064622e18b02", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49f4e6db024b2c4707c064622e18b02")).booleanValue() : a(this.a);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2c51eff6722a5387e6dbddb74a312b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2c51eff6722a5387e6dbddb74a312b")).booleanValue() : a(this.e);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c3a22069b899775b4606352b4364d4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c3a22069b899775b4606352b4364d4")).intValue() : b(this.b);
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "668c32b725031f0bd2b82554f297b26e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "668c32b725031f0bd2b82554f297b26e")).intValue() : b(this.a);
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03bbbd50e22d5f8e04f2e090f1253288", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03bbbd50e22d5f8e04f2e090f1253288")).intValue() : b(this.e);
    }

    private int b(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29412062f82b34534643ca8806e636e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29412062f82b34534643ca8806e636e6")).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return this.d;
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b6707594edefaadc3b2841a1b261c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b6707594edefaadc3b2841a1b261c1")).intValue();
        }
        switch (i) {
            case 2:
                return f();
            case 3:
                return e();
            case 4:
                return g();
            default:
                return this.d;
        }
    }
}
