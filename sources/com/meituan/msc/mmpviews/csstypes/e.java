package com.meituan.msc.mmpviews.csstypes;

import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    float b;
    private a c;

    public e(a aVar, float f) {
        Object[] objArr = {aVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a5ac0afe6fae9598c33eb37e9bc93c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a5ac0afe6fae9598c33eb37e9bc93c");
            return;
        }
        this.c = aVar;
        this.b = f;
    }

    private e(a aVar) {
        this(aVar, -1.0f);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7a5a3a0bb4186381b1f529991ff035", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7a5a3a0bb4186381b1f529991ff035");
        }
    }

    public final boolean a() {
        return this.c == a.Auto;
    }

    public final boolean b() {
        return this.c == a.Percent;
    }

    public static e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e081fe8cde4bc9c05067cdc5e77db104", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e081fe8cde4bc9c05067cdc5e77db104");
        }
        if (str.endsWith("px")) {
            return new e(a.Fixed, s.a(Float.parseFloat(str.substring(0, str.length() - 2))));
        }
        if (str.endsWith("%")) {
            return new e(a.Percent, Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f);
        }
        return new e(a.Auto);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        Auto,
        Relative,
        Percent,
        Fixed,
        Intrinsic,
        MinIntrinsic,
        MinContent,
        MaxContent,
        FillAvailable,
        FitContent,
        Calculated,
        Content,
        Undefined;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7f75a74ebb5881e62e597966204d82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7f75a74ebb5881e62e597966204d82");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87649b00521d51d3aeb7ec63a13d3b2b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87649b00521d51d3aeb7ec63a13d3b2b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0662eabade88f2d11d01baedbc738dd8", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0662eabade88f2d11d01baedbc738dd8") : (a[]) values().clone();
        }
    }
}
