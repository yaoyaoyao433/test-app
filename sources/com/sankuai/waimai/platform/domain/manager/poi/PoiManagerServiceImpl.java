package com.sankuai.waimai.platform.domain.manager.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiManagerServiceImpl implements IPoiManagerService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void unregisterPoiShopObserver(com.sankuai.waimai.foundation.core.service.poi.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3b9704ad4a3b72a9f88868d5bb159f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3b9704ad4a3b72a9f88868d5bb159f3");
        } else {
            a.a().b(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void registerPoiShopObserver(com.sankuai.waimai.foundation.core.service.poi.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b3aff54913319c35e97182f54b8678e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b3aff54913319c35e97182f54b8678e");
        } else {
            a.a().a(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void locateGoodsFromShopCart(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b10288a5742d41f752bc1a27c10e1a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b10288a5742d41f752bc1a27c10e1a5a");
        } else {
            a.a().a(str, str2, j);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void updatePoiShop(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3deef71f3e75276bee89bfc3880052d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3deef71f3e75276bee89bfc3880052d4");
        } else {
            a.a().a(str);
        }
    }
}
