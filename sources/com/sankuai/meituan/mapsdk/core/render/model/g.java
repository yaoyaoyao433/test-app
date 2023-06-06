package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum g {
    Auto(0),
    Order2D(1),
    Order3D(100),
    OrderSymbol(200);
    
    public static ChangeQuickRedirect a;
    public int f;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3a7ee6bc8b827031043ca7ebdfed0c2", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3a7ee6bc8b827031043ca7ebdfed0c2") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bf98c8f8da171f225319a38620b0c37", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bf98c8f8da171f225319a38620b0c37") : (g[]) values().clone();
    }

    g(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac0a98aa65104d57a51a50a36c0d814", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac0a98aa65104d57a51a50a36c0d814");
            return;
        }
        this.f = 0;
        this.f = i;
    }
}
