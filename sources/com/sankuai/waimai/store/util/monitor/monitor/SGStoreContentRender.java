package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGStoreContentRender implements IMonitor {
    Normal,
    FoodReturnCodeException,
    FoodReturnEmptyData,
    FoodDrugReturnEmptyData,
    ProductDrugReturnCodeException,
    ProductReturnCodeException,
    ProductDrugReturnEmptyData,
    ProductReturnEmptyData,
    FoodDataSourceEmpty,
    FoodComposeContainerLoad;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGStoreContentRender() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767931ece224dd76df9fd9446ae7c2bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767931ece224dd76df9fd9446ae7c2bf");
        }
    }

    public static SGStoreContentRender valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d325d9c0c9817832afe2074a4b85482e", RobustBitConfig.DEFAULT_VALUE) ? (SGStoreContentRender) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d325d9c0c9817832afe2074a4b85482e") : (SGStoreContentRender) Enum.valueOf(SGStoreContentRender.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGStoreContentRender[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89b03a56e14fb50abfd61fa3b9e7bdc2", RobustBitConfig.DEFAULT_VALUE) ? (SGStoreContentRender[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89b03a56e14fb50abfd61fa3b9e7bdc2") : (SGStoreContentRender[]) values().clone();
    }
}
