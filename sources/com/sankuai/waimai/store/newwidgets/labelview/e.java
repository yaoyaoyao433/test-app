package com.sankuai.waimai.store.newwidgets.labelview;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a9d54ebc8416c56d61ea9ae279941a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a9d54ebc8416c56d61ea9ae279941a");
        } else {
            this.d = 0;
        }
    }

    private static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "befec958586dfa8c1cbc106092c7dcdc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "befec958586dfa8c1cbc106092c7dcdc")).booleanValue();
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final void a(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f657393ebfa41b0b063f1d54cb0bf63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f657393ebfa41b0b063f1d54cb0bf63");
        } else if (this.d == i && a(this.a, num) && a(this.b, num2) && a(this.e, num3)) {
        } else {
            b(i, num, num2, num3);
            a();
        }
    }

    public final void b(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), num, num2, num3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9eac0d232e5e7b201c0edc077c1893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9eac0d232e5e7b201c0edc077c1893");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1092c143767ae558cc060d61ea41f1fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1092c143767ae558cc060d61ea41f1fc")).booleanValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cc29e35ac62f5fb3da560ccbdb35ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cc29e35ac62f5fb3da560ccbdb35ff")).booleanValue() : a(this.b);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fce0a8744d6105490cce3f2da7d840", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fce0a8744d6105490cce3f2da7d840")).booleanValue() : a(this.a);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8fd17f3e36df02e620216a9ac3d451", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8fd17f3e36df02e620216a9ac3d451")).booleanValue() : a(this.e);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ea98cc752265c981e0a6832887fa10", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ea98cc752265c981e0a6832887fa10")).intValue() : b(this.b);
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06888f819afe7889db7ff059a73fab10", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06888f819afe7889db7ff059a73fab10")).intValue() : b(this.a);
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd084a2334e38c571ed44da25ad32a5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd084a2334e38c571ed44da25ad32a5")).intValue() : b(this.e);
    }

    private int b(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd1c657c731ad4b6357707407a291f6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd1c657c731ad4b6357707407a291f6e")).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return this.d;
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566b3efb6ef89eea94e9e6b7823a1eed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566b3efb6ef89eea94e9e6b7823a1eed")).intValue();
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
