package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;
    public static final u b = new u(false, false);
    public static final u c = new u(true, true);
    public static final u d = new u(false, true);
    public static final u e;
    public static final u f;
    public final boolean g;
    public final boolean h;

    static {
        u uVar = new u(true, false);
        e = uVar;
        f = uVar;
    }

    private u(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98d120ae6789118bf85c04b1d121cde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98d120ae6789118bf85c04b1d121cde");
            return;
        }
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9419fe95375802f092bc22dc1c12060", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9419fe95375802f092bc22dc1c12060")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.g == uVar.g && this.h == uVar.h;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be780e5bb85d82f626e4248b716c1771", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be780e5bb85d82f626e4248b716c1771")).intValue() : (((this.g ? 1 : 0) + 527) * 31) + (this.h ? 1 : 0);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9dd84850654c90e37435d3d4c4d85ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9dd84850654c90e37435d3d4c4d85ae");
        }
        return "isStorage=" + this.g + ":isUserRelated=" + this.h;
    }

    public static List<u> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8cc7fdecbed8e1fb36ef5e88b10a18d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8cc7fdecbed8e1fb36ef5e88b10a18d") : Arrays.asList(e, c);
    }

    public static List<u> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4a52ae0d450289f44e09bfabbc83484", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4a52ae0d450289f44e09bfabbc83484") : Arrays.asList(b, d);
    }

    public static List<u> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d7292303b9e881b6aca6b7d5152f33f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d7292303b9e881b6aca6b7d5152f33f") : Arrays.asList(c, d);
    }

    public static List<u> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32389e0bb27678c715f7322c181f405b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32389e0bb27678c715f7322c181f405b") : Arrays.asList(e, b);
    }

    public static List<u> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7f49a573923ce9f794bcaec96a428ba", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7f49a573923ce9f794bcaec96a428ba") : Arrays.asList(c, d, e, b);
    }
}
