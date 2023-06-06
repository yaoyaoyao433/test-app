package com.sankuai.waimai.store.goods.list.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.goods.list.model.SuperSaleModel a(@android.support.annotation.NonNull android.content.Intent r12, java.lang.String r13) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.goods.list.utils.g.a
            java.lang.String r11 = "0807eff1fd73b8fececbebccde16b46e"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            com.sankuai.waimai.store.goods.list.model.SuperSaleModel r12 = (com.sankuai.waimai.store.goods.list.model.SuperSaleModel) r12
            return r12
        L22:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L43
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r2.<init>(r13)     // Catch: org.json.JSONException -> L3f
            java.lang.String r13 = "multiProductsPurchase"
            boolean r13 = r2.optBoolean(r13, r8)     // Catch: org.json.JSONException -> L3f
            goto L44
        L3f:
            r13 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r13)
        L43:
            r13 = 0
        L44:
            if (r13 == 0) goto La7
            java.lang.String r2 = "godProducts"
            java.lang.String r3 = "godProducts"
            java.lang.String r4 = ""
            java.lang.String r12 = com.sankuai.waimai.store.goods.list.utils.d.a(r12, r2, r3, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto La7
            r0.clear()
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> La3
            r2.<init>(r12)     // Catch: org.json.JSONException -> La3
        L60:
            int r12 = r2.length()     // Catch: org.json.JSONException -> La3
            if (r8 >= r12) goto La7
            org.json.JSONObject r12 = r2.optJSONObject(r8)     // Catch: org.json.JSONException -> La3
            if (r12 == 0) goto La0
            java.lang.String r3 = "spuId"
            long r3 = r12.optLong(r3)     // Catch: org.json.JSONException -> La3
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> La3
            boolean r5 = r0.contains(r5)     // Catch: org.json.JSONException -> La3
            if (r5 != 0) goto L84
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> La3
            r0.add(r5)     // Catch: org.json.JSONException -> La3
        L84:
            com.sankuai.waimai.store.goods.list.model.AddCrossSkus r5 = new com.sankuai.waimai.store.goods.list.model.AddCrossSkus     // Catch: org.json.JSONException -> La3
            r5.<init>()     // Catch: org.json.JSONException -> La3
            java.lang.String r6 = "skuId"
            long r6 = r12.optLong(r6)     // Catch: org.json.JSONException -> La3
            r5.id = r3     // Catch: org.json.JSONException -> La3
            r5.skuid = r6     // Catch: org.json.JSONException -> La3
            java.lang.String r3 = "num"
            int r12 = r12.optInt(r3)     // Catch: org.json.JSONException -> La3
            r5.count = r12     // Catch: org.json.JSONException -> La3
            r1.add(r5)     // Catch: org.json.JSONException -> La3
        La0:
            int r8 = r8 + 1
            goto L60
        La3:
            r12 = move-exception
            r12.printStackTrace()
        La7:
            com.sankuai.waimai.store.goods.list.model.SuperSaleModel r12 = new com.sankuai.waimai.store.goods.list.model.SuperSaleModel
            r12.<init>(r13, r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.utils.g.a(android.content.Intent, java.lang.String):com.sankuai.waimai.store.goods.list.model.SuperSaleModel");
    }
}
