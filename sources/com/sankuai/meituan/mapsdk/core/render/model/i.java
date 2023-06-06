package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum i {
    CustomThread(1),
    RenderThread(2);
    
    public static ChangeQuickRedirect a;
    public int d;

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "405790d11b6c55b2cbb2a9e5eba35173", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "405790d11b6c55b2cbb2a9e5eba35173") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62ce2b465a77541d966d1f5b537c479a", RobustBitConfig.DEFAULT_VALUE) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62ce2b465a77541d966d1f5b537c479a") : (i[]) values().clone();
    }

    i(int i) {
        Object[] objArr = {r11, Integer.valueOf(r12), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9ca33f4b07bc2afe6bd608a171f743", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9ca33f4b07bc2afe6bd608a171f743");
            return;
        }
        this.d = 1;
        this.d = i;
    }
}
