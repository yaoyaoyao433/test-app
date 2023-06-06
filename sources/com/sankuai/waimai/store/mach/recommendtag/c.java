package com.sankuai.waimai.store.mach.recommendtag;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.mach.component.base.a<RecommendFlowLayout> {
    public static ChangeQuickRedirect a;
    private List<PoiRecommendTagInfoListItem> b;
    private b c;
    private RecommendFlowLayout d;
    private final String e;
    private final String f;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99c20ff1e4c3d4be7ffc5236253e640", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99c20ff1e4c3d4be7ffc5236253e640");
            return;
        }
        this.b = new ArrayList();
        this.e = "exposeItemsAnalyse";
        this.f = "jumpScheme";
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(RecommendFlowLayout recommendFlowLayout) {
        String str;
        Object obj;
        RecommendFlowLayout recommendFlowLayout2 = recommendFlowLayout;
        Object[] objArr = {recommendFlowLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e96d267a10dff88e1c577f704a768e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e96d267a10dff88e1c577f704a768e");
            return;
        }
        super.a((c) recommendFlowLayout2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b096ad802e1a2e9f79b60549977909b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b096ad802e1a2e9f79b60549977909b");
        } else if (this.c == null) {
            this.c = new b(new d() { // from class: com.sankuai.waimai.store.mach.recommendtag.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mach.recommendtag.d
                public final void a(String str2) {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d7e3ac87fb238815c87ad44d32b2d82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d7e3ac87fb238815c87ad44d32b2d82");
                        return;
                    }
                    c cVar = c.this;
                    Object[] objArr4 = {"jumpScheme", str2};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "4d98027166ef83f71704a61053a5941e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "4d98027166ef83f71704a61053a5941e");
                    } else if (cVar.m == null || cVar.m.getV8JSEngine() == null || cVar.m.getActivity() == null) {
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(str2);
                        com.sankuai.waimai.imbase.log.a.a(true);
                        com.sankuai.waimai.imbase.log.a.c("invokeExposeViewFunc", str2, new Object[0]);
                        cVar.m.asyncCallJSMethod("jumpScheme", linkedList);
                    }
                }
            });
        }
        recommendFlowLayout2.setAdapter(this.c);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03231cd4adf449a95b0a023fda96903f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03231cd4adf449a95b0a023fda96903f");
        } else if (this.b.size() > 0) {
            this.c.a(this.b);
        }
        List<Integer> idList = recommendFlowLayout2.getIdList();
        Object[] objArr4 = {"exposeItemsAnalyse", idList};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e77f29a78fa0e26373583203f1d2ce7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e77f29a78fa0e26373583203f1d2ce7e");
        } else if (this.m != null && this.m.getV8JSEngine() != null && this.m.getActivity() != null && !com.sankuai.shangou.stone.util.a.b(idList)) {
            List<PoiRecommendTagInfoListItem> list = this.b;
            Object[] objArr5 = {list, idList};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78ee149a6c9c31f4da34d08505d565e2", RobustBitConfig.DEFAULT_VALUE)) {
                obj = PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78ee149a6c9c31f4da34d08505d565e2");
            } else {
                ExposeItem exposeItem = new ExposeItem();
                Object[] objArr6 = {list, idList};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "034d2ac92fe10b6160cd1ac5adb1d5fb", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "034d2ac92fe10b6160cd1ac5adb1d5fb");
                } else if (com.sankuai.shangou.stone.util.a.b(list) || com.sankuai.shangou.stone.util.a.b(idList)) {
                    str = "";
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                        if (idList.contains(Integer.valueOf(i))) {
                            arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
                        }
                    }
                    str = t.b(arrayList, new t.a<PoiRecommendTagInfoListItem>() { // from class: com.sankuai.waimai.store.mach.recommendtag.c.5
                        @Override // com.sankuai.shangou.stone.util.t.a
                        public final /* bridge */ /* synthetic */ String a(PoiRecommendTagInfoListItem poiRecommendTagInfoListItem) {
                            PoiRecommendTagInfoListItem poiRecommendTagInfoListItem2 = poiRecommendTagInfoListItem;
                            return (poiRecommendTagInfoListItem2 == null || poiRecommendTagInfoListItem2.type == 5) ? "" : poiRecommendTagInfoListItem2.recommendCode;
                        }
                    }, CommonConstant.Symbol.COMMA);
                }
                exposeItem.rank_label_info = str;
                exposeItem.rank_label_text = b(list, idList);
                exposeItem.recommend = a(list, idList);
                obj = exposeItem;
            }
            LinkedList linkedList = new LinkedList();
            try {
                linkedList.add(i.a(obj) == null ? new JSONObject() : new JSONObject(i.a(obj)));
                com.sankuai.waimai.imbase.log.a.a(true);
                com.sankuai.waimai.imbase.log.a.c("invokeExposeViewFunc", linkedList.get(0).toString(), new Object[0]);
                this.m.asyncCallJSMethod("exposeItemsAnalyse", linkedList);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ RecommendFlowLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63a2ecbf9c7237763fb6e2613f67929", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendFlowLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63a2ecbf9c7237763fb6e2613f67929");
        }
        this.d = new RecommendFlowLayout(context);
        this.d.setMaxLines(1);
        return this.d;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        PoiRecommendTagInfoListItem poiRecommendTagInfoListItem;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20db78a7460d81171f7085df87f8df5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20db78a7460d81171f7085df87f8df5e");
            return;
        }
        Map<String, Object> k = k();
        if (k == null || !k.containsKey("recommend_items")) {
            return;
        }
        Object obj = k.get("recommend_items");
        if (obj instanceof List) {
            this.b.clear();
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof PoiRecommendTagInfoListItem) {
                    this.b.add((PoiRecommendTagInfoListItem) obj2);
                } else if ((obj2 instanceof Map) && (poiRecommendTagInfoListItem = (PoiRecommendTagInfoListItem) i.a(i.a(obj2), new TypeToken<PoiRecommendTagInfoListItem>() { // from class: com.sankuai.waimai.store.mach.recommendtag.c.1
                }.getType())) != null) {
                    this.b.add(poiRecommendTagInfoListItem);
                }
            }
        }
    }

    private static String a(List<PoiRecommendTagInfoListItem> list, List<Integer> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c455b6335bfff766a71a0112734bb584", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c455b6335bfff766a71a0112734bb584");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || com.sankuai.shangou.stone.util.a.b(list2)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
            if (list2.contains(Integer.valueOf(i))) {
                arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
            }
        }
        return t.b(arrayList, new t.a<PoiRecommendTagInfoListItem>() { // from class: com.sankuai.waimai.store.mach.recommendtag.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* synthetic */ String a(PoiRecommendTagInfoListItem poiRecommendTagInfoListItem) {
                PoiRecommendTagInfoListItem poiRecommendTagInfoListItem2 = poiRecommendTagInfoListItem;
                Object[] objArr2 = {poiRecommendTagInfoListItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db679e4ef383ef90276567c6b4f98d8c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db679e4ef383ef90276567c6b4f98d8c") : (poiRecommendTagInfoListItem2 == null || poiRecommendTagInfoListItem2.type == 5) ? "" : String.valueOf(poiRecommendTagInfoListItem2.type);
            }
        }, CommonConstant.Symbol.COMMA);
    }

    private static String b(List<PoiRecommendTagInfoListItem> list, List<Integer> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81eae549d51897fd1294749cffbcf48c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81eae549d51897fd1294749cffbcf48c");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || com.sankuai.shangou.stone.util.a.b(list2)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
            if (list2.contains(Integer.valueOf(i))) {
                arrayList.add(com.sankuai.shangou.stone.util.a.a((List<Object>) list, i));
            }
        }
        return t.b(arrayList, new t.a<PoiRecommendTagInfoListItem>() { // from class: com.sankuai.waimai.store.mach.recommendtag.c.4
            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* bridge */ /* synthetic */ String a(PoiRecommendTagInfoListItem poiRecommendTagInfoListItem) {
                PoiRecommendTagInfoListItem poiRecommendTagInfoListItem2 = poiRecommendTagInfoListItem;
                return (poiRecommendTagInfoListItem2 == null || poiRecommendTagInfoListItem2.type == 5) ? "" : poiRecommendTagInfoListItem2.content;
            }
        }, CommonConstant.Symbol.COMMA);
    }
}
