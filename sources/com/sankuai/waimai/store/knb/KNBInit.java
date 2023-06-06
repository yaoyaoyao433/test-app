package com.sankuai.waimai.store.knb;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.knb.manager.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class KNBInit {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ShopcartGoodsListInShoppingCartHandler extends SmBaseJsHandler {
        public static final String SIGNATURE = "QExI1qEjpW0o2qyvXJunMoXLeg+rOK/5DwvWBV8Lt5C7zr/p02zPtzxKBTCshF6ikLt8k0WV1Tv2ozuyoXpnNg==";
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.store.knb.SmBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
        public String getSignature() {
            return SIGNATURE;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
        @Override // com.dianping.titans.js.jshandler.BaseJsHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void exec() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.knb.KNBInit.ShopcartGoodsListInShoppingCartHandler.changeQuickRedirect
                java.lang.String r10 = "c74b9092c359dc10e661d9e00dee87c9"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L18
                com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                return
            L18:
                boolean r1 = r11.validateArgs()
                r2 = 0
                if (r1 != 0) goto L27
                r0 = 2
                java.lang.String r1 = "param is not valid"
                r11.jsSmBusinessCallback(r0, r1, r2)
                return
            L27:
                com.dianping.titans.js.JsBean r1 = r11.jsBean()
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r0]
                com.sankuai.shangou.stone.util.log.a.a(r1, r3)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                com.dianping.titans.js.JsBean r3 = r11.jsBean()
                org.json.JSONObject r3 = r3.argsJson
                java.lang.String r4 = "poi_id_objects"
                org.json.JSONArray r3 = r3.optJSONArray(r4)
                r4 = 0
            L47:
                int r5 = r3.length()
                if (r4 >= r5) goto Lc0
                r5 = -1
                org.json.JSONObject r7 = r3.getJSONObject(r4)     // Catch: java.lang.Exception -> L64
                java.lang.String r8 = "poi_id"
                long r8 = r7.getLong(r8)     // Catch: java.lang.Exception -> L64
                java.lang.String r10 = "poi_id_str"
                java.lang.String r7 = r7.getString(r10)     // Catch: java.lang.Exception -> L62
                goto L6a
            L62:
                r7 = move-exception
                goto L66
            L64:
                r7 = move-exception
                r8 = r5
            L66:
                r7.printStackTrace()
                r7 = r2
            L6a:
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 == 0) goto Lbd
                boolean r5 = com.sankuai.shangou.stone.util.t.a(r7)
                if (r5 != 0) goto Lbd
                com.sankuai.waimai.store.order.a r5 = com.sankuai.waimai.store.order.a.e()
                java.lang.String r6 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(r7, r8)
                java.util.List r5 = r5.p(r6)
                org.json.JSONArray r6 = new org.json.JSONArray
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L89:
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto La0
                java.lang.Object r10 = r5.next()
                com.sankuai.waimai.store.platform.domain.core.order.OrderedFood r10 = (com.sankuai.waimai.store.platform.domain.core.order.OrderedFood) r10
                if (r10 != 0) goto L98
                goto L89
            L98:
                org.json.JSONObject r10 = r11.formSpuCount(r10)
                r6.put(r10)
                goto L89
            La0:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb9
                r5.<init>()     // Catch: org.json.JSONException -> Lb9
                java.lang.String r10 = "poi_id"
                r5.put(r10, r8)     // Catch: org.json.JSONException -> Lb9
                java.lang.String r8 = "poi_id_str"
                r5.put(r8, r7)     // Catch: org.json.JSONException -> Lb9
                java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> Lb9
                r1.put(r5, r6)     // Catch: org.json.JSONException -> Lb9
                goto Lbd
            Lb9:
                r5 = move-exception
                com.sankuai.shangou.stone.util.log.a.a(r5)
            Lbd:
                int r4 = r4 + 1
                goto L47
            Lc0:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "goodListDict"
                r2.put(r3, r1)     // Catch: org.json.JSONException -> Lcc
                goto Ld0
            Lcc:
                r1 = move-exception
                com.sankuai.shangou.stone.util.log.a.a(r1)
            Ld0:
                java.lang.String r1 = ""
                r11.jsSmBusinessCallback(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.knb.KNBInit.ShopcartGoodsListInShoppingCartHandler.exec():void");
        }

        @NonNull
        private JSONObject formSpuCount(@NonNull OrderedFood orderedFood) {
            Object[] objArr = {orderedFood};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "770e6a3369175daae38dbea3804df47b", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "770e6a3369175daae38dbea3804df47b");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("spu_id", String.valueOf(orderedFood.getSpuId()));
                jSONObject.put("sku_id", String.valueOf(orderedFood.getSkuId()));
                jSONObject.put("count", orderedFood.getCount());
            } catch (JSONException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
            return jSONObject;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ShopcartDecreaseFoodHandler extends SmBaseJsHandler {
        public static final String SIGNATURE = "N2F0KKdCMcqjuFM4aK5t6DYXtzVZZ9CHtZ54NeUdjlaHI08RhMCuCbvyXm+O0ETcAIMi1e1Y93rOyWMctAgEEQ==";
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.store.knb.SmBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
        public String getSignature() {
            return SIGNATURE;
        }

        @Override // com.dianping.titans.js.jshandler.BaseJsHandler
        public void exec() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d5f2d44398b5ebc0d97beb6d42d83ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d5f2d44398b5ebc0d97beb6d42d83ad");
            } else if (!validateArgs()) {
                jsSmBusinessCallback(2, "param is not valid", null);
            } else {
                a aVar = new a();
                aVar.a(jsBean().args);
                b bVar = new b() { // from class: com.sankuai.waimai.store.knb.KNBInit.ShopcartDecreaseFoodHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83c357c78cb5d1d062c29511ea68af11", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83c357c78cb5d1d062c29511ea68af11");
                        } else {
                            ShopcartDecreaseFoodHandler.this.jsSmBusinessCallback(0, "", null);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f7c18125aad29123dc83d70f7e97928b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f7c18125aad29123dc83d70f7e97928b");
                        } else {
                            ShopcartDecreaseFoodHandler.this.jsSmBusinessCallback(1, aVar2.getMessage(), null);
                        }
                    }
                };
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "7034956df37744af0750e32f96c546f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "7034956df37744af0750e32f96c546f4");
                } else if (aVar.b == null || aVar.c == null) {
                } else {
                    com.sankuai.waimai.store.order.a.e().b(aVar.b.f(), aVar.c.spu, aVar.c.spu.skus.get(0), (GoodsAttr[]) null, bVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ShopcartIncreaseFoodHandler extends SmBaseJsHandler {
        public static final String SIGNATURE = "u+yCYTIBqmpjgfD1fKolMG9JZnsG8mCGmDrSErXivn4jVM0QgaZf0JoMXL7ORkGAXld3+5DKNsisbry7t0qWUw==";
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.store.knb.SmBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
        public String getSignature() {
            return SIGNATURE;
        }

        @Override // com.dianping.titans.js.jshandler.BaseJsHandler
        public void exec() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52984b5476f301fdbb165f067e46c7fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52984b5476f301fdbb165f067e46c7fe");
            } else if (!validateArgs()) {
                jsSmBusinessCallback(2, "param is not valid", null);
            } else {
                a aVar = new a();
                aVar.a(jsBean().args);
                b bVar = new b() { // from class: com.sankuai.waimai.store.knb.KNBInit.ShopcartIncreaseFoodHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e34ce0eab9919e41e7ac4f2173cd654d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e34ce0eab9919e41e7ac4f2173cd654d");
                        } else {
                            ShopcartIncreaseFoodHandler.this.jsSmBusinessCallback(0, "", null);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "835ab8a63996719fe763c14e07bbf1c7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "835ab8a63996719fe763c14e07bbf1c7");
                        } else {
                            ShopcartIncreaseFoodHandler.this.jsSmBusinessCallback(1, aVar2.getMessage(), null);
                        }
                    }
                };
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "d876ffb307ff98a373525e45cdf45440", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "d876ffb307ff98a373525e45cdf45440");
                } else if (aVar.b == null || aVar.c == null || aVar.c.spu == null || com.sankuai.shangou.stone.util.a.b(aVar.c.spu.skus)) {
                } else {
                    com.sankuai.waimai.store.order.a.e().a(aVar.b.f(), aVar.c.spu, aVar.c.spu.skus.get(0), (GoodsAttr[]) null, bVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ShopcartBatchIncreaseFoodHandler extends SmBaseJsHandler {
        public static final String SIGNATURE = "u5yuW/7/OJtrbX/LVgKrtBsMmeCveYXpRZ3VmvU3402TeXMGUHEpK94PT03uHzI+NczQhEhsvrjHgQqCsp4p2A==";
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.store.knb.SmBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
        public String getSignature() {
            return SIGNATURE;
        }

        @Override // com.dianping.titans.js.jshandler.BaseJsHandler
        public void exec() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29bb8c53ff98b24373e93fca3237c2c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29bb8c53ff98b24373e93fca3237c2c7");
            } else if (!validateArgs()) {
                jsSmBusinessCallback(2, "param is not valid", null);
            } else {
                com.sankuai.shangou.stone.util.log.a.a("=%s", jsBean().args);
                a aVar = new a();
                aVar.a(jsBean().args);
                b bVar = new b() { // from class: com.sankuai.waimai.store.knb.KNBInit.ShopcartBatchIncreaseFoodHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(@Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ddbe0ceb0bbcaec2d3441e0710781411", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ddbe0ceb0bbcaec2d3441e0710781411");
                        } else {
                            ShopcartBatchIncreaseFoodHandler.this.jsSmBusinessCallback(0, "", null);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f664283936bfec579cf9daaeb3a78fa0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f664283936bfec579cf9daaeb3a78fa0");
                        } else {
                            ShopcartBatchIncreaseFoodHandler.this.jsSmBusinessCallback(1, aVar2.getMessage(), null);
                        }
                    }
                };
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "36e5095aee98cd28d882316799b92be1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "36e5095aee98cd28d882316799b92be1");
                } else if (aVar.b != null && aVar.c != null && !com.sankuai.shangou.stone.util.a.b(aVar.c.spus)) {
                    if (aVar.c.needClearShopcart) {
                        com.sankuai.waimai.store.order.a.e().a(aVar.b.f(), (b) null);
                    }
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "149cea3d1520b32c6a108ef579f85e98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "149cea3d1520b32c6a108ef579f85e98");
                        return;
                    }
                    List<GoodsSpu> list = aVar.c.spus;
                    com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = aVar.b;
                    ArrayList arrayList = new ArrayList();
                    for (GoodsSpu goodsSpu : list) {
                        if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkus())) {
                            GoodsSku goodsSku = goodsSpu.getSkus().get(0);
                            arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.minOrderCount));
                        }
                    }
                    com.sankuai.waimai.store.order.a.e().a(aVar2.f(), aVar2.b);
                    com.sankuai.waimai.store.order.a.e().a(aVar2.f(), arrayList);
                    bVar.a((com.sankuai.waimai.store.platform.domain.core.shopcart.b) null);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class UpdateSuperMarketOrderParamHandler extends SmBaseJsHandler {
        public static final String SIGNATURE = "MiopW+nJ+slru2CWyGcpQVzPQLA29GUZ5yvc0WBVSUFTFyVzLOx8d/1nNd0Upc+26MOk1/YQjeWDPWqX33gI9A==";
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.store.knb.SmBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
        public String getSignature() {
            return SIGNATURE;
        }

        @Override // com.dianping.titans.js.jshandler.BaseJsHandler
        public void exec() {
            JSONObject jSONObject;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ff97610f6c15c3b7ebc7d5be5e3ca75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ff97610f6c15c3b7ebc7d5be5e3ca75");
            } else if (!validateArgs()) {
                jsSmBusinessCallback(2, "param is not valid", null);
            } else {
                com.sankuai.waimai.store.knb.manager.a a = com.sankuai.waimai.store.knb.manager.a.a();
                String str = jsBean().args;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.knb.manager.a.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "5d410846f555cecea13a20af0efcf0e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "5d410846f555cecea13a20af0efcf0e1");
                } else {
                    String str2 = "";
                    try {
                        jSONObject = new JSONObject(str);
                        str2 = jSONObject.optString("use_pattern");
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                        jSONObject = null;
                    }
                    if ("1".equals(str2)) {
                        if (a.c != null) {
                            a.c = null;
                        }
                    } else if ("2".equals(str2)) {
                        if (a.d != null) {
                            a.d.a(jSONObject);
                            a.d = null;
                        }
                    } else if ("3".equals(str2)) {
                        if (a.d != null) {
                            a.d.b(jSONObject);
                            a.d = null;
                        }
                    } else {
                        for (a.InterfaceC1215a interfaceC1215a : a.b) {
                            if (interfaceC1215a != null) {
                                interfaceC1215a.b(str);
                            }
                        }
                    }
                }
                jsSmBusinessCallback(0, "", null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.store.platform.domain.manager.poi.a b;
        ShopcartBean c;

        public final boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbfc3882ce6dc1151c0e660dc60e097", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbfc3882ce6dc1151c0e660dc60e097")).booleanValue();
            }
            this.c = (ShopcartBean) i.a(str, ShopcartBean.class);
            if (this.c == null || this.c.poi == null) {
                return false;
            }
            this.b = new com.sankuai.waimai.store.platform.domain.manager.poi.a(this.c.poi);
            com.sankuai.waimai.store.order.a.e().a(this.b.f(), this.b.b);
            return true;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class ShopcartBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("need_clear_shopcart")
        public boolean needClearShopcart = false;
        @SerializedName("poi_info")
        public Poi poi;
        @SerializedName("spu")
        public GoodsSpu spu;
        @SerializedName("product_spu_list")
        public List<GoodsSpu> spus;

        public String getCid() {
            return "";
        }

        public ShopcartBean() {
        }
    }
}
