package com.sankuai.waimai.foundation.core.service.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements IPoiManagerService {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static final IPoiManagerService d = new IPoiManagerService() { // from class: com.sankuai.waimai.foundation.core.service.poi.a.1
        @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
        public final void locateGoodsFromShopCart(String str, String str2, long j) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
        public final void registerPoiShopObserver(b bVar) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
        public final void unregisterPoiShopObserver(b bVar) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
        public final void updatePoiShop(String str) {
        }
    };
    private IPoiManagerService c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01781d081e97adf9b99143964b298d89", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01781d081e97adf9b99143964b298d89");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void unregisterPoiShopObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cc7ff23914a0aa1e1b8d285af6d712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cc7ff23914a0aa1e1b8d285af6d712");
        } else {
            b().unregisterPoiShopObserver(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void registerPoiShopObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829243d0cda62e933fb8e1c291e1783e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829243d0cda62e933fb8e1c291e1783e");
        } else {
            b().registerPoiShopObserver(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void locateGoodsFromShopCart(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a7330615dd5b6e92ef045a6fce2f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a7330615dd5b6e92ef045a6fce2f79");
        } else {
            b().locateGoodsFromShopCart(str, str2, j);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService
    public void updatePoiShop(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bffc2e884a25c9275c475efcf219668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bffc2e884a25c9275c475efcf219668");
        } else {
            b().updatePoiShop(str);
        }
    }

    private IPoiManagerService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cf24d5e3ce200ce529e6e4fa0671a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPoiManagerService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cf24d5e3ce200ce529e6e4fa0671a0");
        }
        if (this.c == null) {
            this.c = (IPoiManagerService) com.sankuai.waimai.router.a.a(IPoiManagerService.class, IPoiManagerService.KEY);
        }
        return this.c == null ? d : this.c;
    }
}
