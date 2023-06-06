package com.meituan.android.edfu.edfupreviewer.surface;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum g {
    CENTER_INSIDE,
    CENTER_CROP,
    FIT_XY;
    
    public static ChangeQuickRedirect a;

    g() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca12e382fd90c616488740fe68e38dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca12e382fd90c616488740fe68e38dc1");
        }
    }

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5a292981648a9b2bd1cba6760815055", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5a292981648a9b2bd1cba6760815055") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9257b02ca9cf6d03e4cf53928df8c95f", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9257b02ca9cf6d03e4cf53928df8c95f") : (g[]) values().clone();
    }
}
