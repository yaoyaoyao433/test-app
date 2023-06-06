package com.sankuai.waimai.store.drug.newwidgets.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends d {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0f9cde2517db661c91fb727226e38b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0f9cde2517db661c91fb727226e38b");
        } else {
            this.d = 0;
        }
    }

    private static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fb891e3f1eb863b2b8d8a153dfc9789", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fb891e3f1eb863b2b8d8a153dfc9789")).booleanValue();
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final void a(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9f4915b1ffa5f66b191996df0c33de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9f4915b1ffa5f66b191996df0c33de");
        } else if (this.d == i && a(this.a, num) && a(this.b, num2) && a(this.e, num3)) {
        } else {
            b(i, num, num2, num3);
            a();
        }
    }

    public final void b(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81677625e1e0b3e8aea6011ab21a76df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81677625e1e0b3e8aea6011ab21a76df");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552a9fa39b0d234bc22734ce091a069b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552a9fa39b0d234bc22734ce091a069b")).booleanValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7084c6c23389f6574b00588c4184d687", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7084c6c23389f6574b00588c4184d687")).booleanValue() : a(this.b);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499d3139d2efad72da99f56e2f0c7310", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499d3139d2efad72da99f56e2f0c7310")).booleanValue() : a(this.a);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6aa92c436fa905259ffedeeab3e159", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6aa92c436fa905259ffedeeab3e159")).booleanValue() : a(this.e);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e3801bdc09762118faa6f2c6e62714", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e3801bdc09762118faa6f2c6e62714")).intValue() : b(this.b);
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83bc6cb05371d698a45b69c47663abc8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83bc6cb05371d698a45b69c47663abc8")).intValue() : b(this.a);
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63af36f67c142c82fa9be229ca4234f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63af36f67c142c82fa9be229ca4234f")).intValue() : b(this.e);
    }

    private int b(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6bf94234134c19b76dfa3eab049fbb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6bf94234134c19b76dfa3eab049fbb")).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return this.d;
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160baf25c18a5c15a5239949d1508efa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160baf25c18a5c15a5239949d1508efa")).intValue();
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
