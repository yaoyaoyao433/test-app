package com.sankuai.waimai.store.goods.list.utils;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.shopcartbridge.IPoiTabMrnService;
import com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugPoiTabMrnServiceImpl implements IPoiTabMrnService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.mrn.shopcartbridge.IPoiTabMrnService
    public void updateMRNBridgePoiHelper(ReactContext reactContext, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c97d40616ccd867ca44c60ae4ca32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c97d40616ccd867ca44c60ae4ca32d");
        } else if (reactContext != null) {
            try {
                if (reactContext.getCatalystInstance().hasNativeModule(SMMRNShopCartModule.class)) {
                    ((SMMRNShopCartModule) reactContext.getCatalystInstance().getNativeModule(SMMRNShopCartModule.class)).updatePoiHelper(aVar);
                }
            } catch (Throwable th) {
                com.sankuai.waimai.store.base.log.a.a(th);
            }
        }
    }
}
