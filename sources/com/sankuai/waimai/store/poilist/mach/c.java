package com.sankuai.waimai.store.poilist.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(List<PoiVerticality.RecommendLabel> list, List<Integer> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f31b8c291be7cd227e63f5ca2446e09", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f31b8c291be7cd227e63f5ca2446e09");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        if (!com.sankuai.shangou.stone.util.a.b(list2)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                if (list2.contains(Integer.valueOf(i))) {
                    arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
                }
            }
            list = arrayList;
        }
        return t.b(list, new t.a<PoiVerticality.RecommendLabel>() { // from class: com.sankuai.waimai.store.poilist.mach.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* synthetic */ String a(PoiVerticality.RecommendLabel recommendLabel) {
                PoiVerticality.RecommendLabel recommendLabel2 = recommendLabel;
                Object[] objArr2 = {recommendLabel2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7555b5f3f797c80d94f9cc06a87789f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7555b5f3f797c80d94f9cc06a87789f") : (recommendLabel2 == null || recommendLabel2.type == 5) ? "" : String.valueOf(recommendLabel2.type);
            }
        }, CommonConstant.Symbol.COMMA);
    }

    public static String b(List<PoiVerticality.RecommendLabel> list, List<Integer> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0019577158b68dd288ecebf2bdb4741", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0019577158b68dd288ecebf2bdb4741");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        if (!com.sankuai.shangou.stone.util.a.b(list2)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                if (list2.contains(Integer.valueOf(i))) {
                    arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
                }
            }
            list = arrayList;
        }
        return t.b(list, new t.a<PoiVerticality.RecommendLabel>() { // from class: com.sankuai.waimai.store.poilist.mach.c.2
            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* bridge */ /* synthetic */ String a(PoiVerticality.RecommendLabel recommendLabel) {
                PoiVerticality.RecommendLabel recommendLabel2 = recommendLabel;
                return (recommendLabel2 == null || recommendLabel2.type == 5) ? "" : recommendLabel2.content;
            }
        }, CommonConstant.Symbol.COMMA);
    }

    public static String c(List<PoiVerticality.RecommendLabel> list, List<Integer> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44ea31fc69c00326f92bac5c42455e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44ea31fc69c00326f92bac5c42455e71");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        if (!com.sankuai.shangou.stone.util.a.b(list2)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                if (list2.contains(Integer.valueOf(i))) {
                    arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
                }
            }
            list = arrayList;
        }
        return t.b(list, new t.a<PoiVerticality.RecommendLabel>() { // from class: com.sankuai.waimai.store.poilist.mach.c.3
            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* bridge */ /* synthetic */ String a(PoiVerticality.RecommendLabel recommendLabel) {
                PoiVerticality.RecommendLabel recommendLabel2 = recommendLabel;
                return (recommendLabel2 == null || recommendLabel2.type == 5) ? "" : recommendLabel2.recommendCode;
            }
        }, CommonConstant.Symbol.COMMA);
    }

    public static String a(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8a6d375e6e0256e7b225b9f1fe38dc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8a6d375e6e0256e7b225b9f1fe38dc4");
        }
        if (poiVerticality.isAdType()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adType", poiVerticality.adType);
                jSONObject.put("adChargeInfo", n.a(poiVerticality.chargeInfo));
                return jSONObject.toString();
            } catch (JSONException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return "";
    }
}
