package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum g {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    public static ChangeQuickRedirect a;
    final int e;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "411591f559584c038858d65e217bcf86", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "411591f559584c038858d65e217bcf86") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f75a0a4f20f2bc84e103bc54f599465c", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f75a0a4f20f2bc84e103bc54f599465c") : (g[]) values().clone();
    }

    g(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6741885d6fa6f118ff83d5be02ec2fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6741885d6fa6f118ff83d5be02ec2fd");
        } else {
            this.e = i;
        }
    }

    public static g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02fb15c6c814fcf52691cb5f0da7295e", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02fb15c6c814fcf52691cb5f0da7295e");
        }
        switch (i) {
            case 0:
                return INHERIT;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
