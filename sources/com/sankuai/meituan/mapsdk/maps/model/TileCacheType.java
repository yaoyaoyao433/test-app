package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum TileCacheType {
    NoCache(0),
    QualityLow(1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;

    public static TileCacheType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ed55da2e814591c6917647963c09258", RobustBitConfig.DEFAULT_VALUE) ? (TileCacheType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ed55da2e814591c6917647963c09258") : (TileCacheType) Enum.valueOf(TileCacheType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TileCacheType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcd73aa490545b590e1853889d8e01e8", RobustBitConfig.DEFAULT_VALUE) ? (TileCacheType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcd73aa490545b590e1853889d8e01e8") : (TileCacheType[]) values().clone();
    }

    TileCacheType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a132b54ea76b6cbd1a6da903f30d91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a132b54ea76b6cbd1a6da903f30d91");
            return;
        }
        this.a = 0;
        this.a = i;
    }

    public final int value() {
        return this.a;
    }
}
