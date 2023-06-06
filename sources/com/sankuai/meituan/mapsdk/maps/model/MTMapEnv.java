package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum MTMapEnv {
    RELEASE,
    STAGE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    MTMapEnv() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e35d0c93851720092a94ed254e6774ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e35d0c93851720092a94ed254e6774ea");
        }
    }

    public static MTMapEnv valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9f68da60c33db6cc50ca2c75c8b6d84", RobustBitConfig.DEFAULT_VALUE) ? (MTMapEnv) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9f68da60c33db6cc50ca2c75c8b6d84") : (MTMapEnv) Enum.valueOf(MTMapEnv.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MTMapEnv[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f67668bad1de8e23a4756dc85fccfde1", RobustBitConfig.DEFAULT_VALUE) ? (MTMapEnv[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f67668bad1de8e23a4756dc85fccfde1") : (MTMapEnv[]) values().clone();
    }
}
