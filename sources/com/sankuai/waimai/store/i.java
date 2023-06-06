package com.sankuai.waimai.store;

import android.app.Application;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.mrn.engine.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.knb.KNBInit;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.al;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9353c1c7a3d4442ceef2a6b2aecbb0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9353c1c7a3d4442ceef2a6b2aecbb0c");
        } else if (b) {
        } else {
            Object[] objArr2 = {application};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4ca0aa0dfb40b8b597809dff1ecfa6d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4ca0aa0dfb40b8b597809dff1ecfa6d5");
            } else {
                com.sankuai.waimai.store.config.j.h().b();
                com.sankuai.waimai.store.config.i.h().b();
                com.sankuai.waimai.store.config.l.e().b();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poi.list.newp.bubble.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d9cf37e53a0f779664905f278ddf8ee8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d9cf37e53a0f779664905f278ddf8ee8");
                } else {
                    Map a2 = com.sankuai.waimai.store.poi.list.newp.bubble.a.a();
                    if (a2 != null) {
                        Iterator it = a2.entrySet().iterator();
                        while (it.hasNext()) {
                            if (com.meituan.android.time.c.b() > ((PrimaryFilterCondList.Bubble) ((Map.Entry) it.next()).getValue()).etime * 1000) {
                                it.remove();
                            }
                        }
                        com.sankuai.waimai.store.poi.list.newp.bubble.a.a(a2);
                    }
                }
                OneIdHandler.getInstance(application).init();
            }
            Object[] objArr4 = {application};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "46a307487c42876889f785aedca752cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "46a307487c42876889f785aedca752cc");
            } else {
                al.a(new al.a() { // from class: com.sankuai.waimai.store.i.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.a
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "90489eafbaf5df65eb6ab671e3f98163", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "90489eafbaf5df65eb6ab671e3f98163");
                            return;
                        }
                        u.a(application, "supermarket", DefaultHeaderService.KEY_DRUG);
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = KNBInit.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "29fe488bd46a92de13467a823dd83b63", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "29fe488bd46a92de13467a823dd83b63");
                            return;
                        }
                        JsHandlerFactory.registerJsHandler("waimai.smIncreaseFood", KNBInit.ShopcartIncreaseFoodHandler.SIGNATURE, KNBInit.ShopcartIncreaseFoodHandler.class);
                        JsHandlerFactory.registerJsHandler("waimai.smDecreaseFood", KNBInit.ShopcartDecreaseFoodHandler.SIGNATURE, KNBInit.ShopcartDecreaseFoodHandler.class);
                        JsHandlerFactory.registerJsHandler("waimai.smGoodsListInShoppingCart", KNBInit.ShopcartGoodsListInShoppingCartHandler.SIGNATURE, KNBInit.ShopcartGoodsListInShoppingCartHandler.class);
                        JsHandlerFactory.registerJsHandler("waimai.smBatchIncreaseFoods", KNBInit.ShopcartBatchIncreaseFoodHandler.SIGNATURE, KNBInit.ShopcartBatchIncreaseFoodHandler.class);
                        JsHandlerFactory.registerJsHandler("waimai.updateSupermarketOrderParam", KNBInit.UpdateSuperMarketOrderParamHandler.SIGNATURE, KNBInit.UpdateSuperMarketOrderParamHandler.class);
                    }
                }, (String) null);
            }
            b = true;
        }
    }
}
