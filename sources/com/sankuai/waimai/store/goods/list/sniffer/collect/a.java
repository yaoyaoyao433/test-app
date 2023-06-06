package com.sankuai.waimai.store.goods.list.sniffer.collect;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.an;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentAnchor;
import com.sankuai.waimai.store.util.monitor.monitor.ShopContentSmooth;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.monitor.b<RestMenuResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.monitor.b
    public final void collect(String str, String str2, String str3, @NonNull BaseResponse<RestMenuResponse> baseResponse) {
        List<GoodsSpu> list;
        IMonitor iMonitor;
        Object[] objArr = {str, str2, str3, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbafa1623ce23c5af4e9d7452427f054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbafa1623ce23c5af4e9d7452427f054");
        } else if (baseResponse.data == null) {
        } else {
            List<GoodsPoiCategory> list2 = baseResponse.data.mGoodPoiCategoryList;
            if (com.sankuai.shangou.stone.util.a.b(list2)) {
                return;
            }
            RestMenuResponse restMenuResponse = baseResponse.data;
            Map<String, String> a2 = an.a(str2);
            String str4 = a2.get("wm_poi_id");
            String str5 = a2.get("product_spu_id");
            String str6 = restMenuResponse.mPoi == null ? "" : restMenuResponse.mPoi.name;
            if (!TextUtils.isEmpty(str5) && !"0".equals(str5)) {
                Object[] objArr2 = {list2, str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8edfb7e9a4e435aa6a18d74b01811c09", RobustBitConfig.DEFAULT_VALUE)) {
                    GoodsPoiCategory a3 = a(list2);
                    if (a3 == null) {
                        iMonitor = SGStoreContentAnchor.PrimaryCategoryEmpty;
                    } else {
                        GoodsPoiCategory a4 = a(a3.childGoodPoiCategory);
                        if (a4 != null) {
                            list = a4.spus;
                        } else {
                            list = a3.spus;
                        }
                        if (com.sankuai.shangou.stone.util.a.b(list)) {
                            iMonitor = SGStoreContentAnchor.SpuListEmpty;
                        } else {
                            Iterator<GoodsSpu> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    GoodsSpu next = it.next();
                                    if (next != null && str5.equals(String.valueOf(next.id))) {
                                        iMonitor = null;
                                        break;
                                    }
                                } else {
                                    iMonitor = SGStoreContentAnchor.NoFindSpu;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    iMonitor = (IMonitor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8edfb7e9a4e435aa6a18d74b01811c09");
                }
                IMonitor iMonitor2 = iMonitor;
                if (iMonitor2 != null) {
                    c.a(iMonitor2, a(str4, str6, str5, str2, str3, str), "");
                } else {
                    c.a(SGStoreContentAnchor.Normal);
                }
            }
            if (restMenuResponse.getPoi() == null || restMenuResponse.getPoi().isNewPage == 1) {
                return;
            }
            c.a(ShopContentSmooth.Normal);
        }
    }

    private String a(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c02f3706c6e16e03031b5859e60c577", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c02f3706c6e16e03031b5859e60c577");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", str);
            jSONObject.put(AgainManager.EXTRA_POI_NAME, str2);
            jSONObject.put("spu_id", str3);
            jSONObject.put("reqParams", str4);
            jSONObject.put("result", str5);
            jSONObject.put("x_env", com.sankuai.waimai.store.base.net.sg.c.a().b());
            jSONObject.put("TraceId", str6);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return jSONObject.toString();
    }

    private static GoodsPoiCategory a(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c61616a9cbd554e41810fc605cfd7ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c61616a9cbd554e41810fc605cfd7ec");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            GoodsPoiCategory goodsPoiCategory = list.get(i);
            if (goodsPoiCategory != null && goodsPoiCategory.isSelected()) {
                return goodsPoiCategory;
            }
        }
        return null;
    }
}
