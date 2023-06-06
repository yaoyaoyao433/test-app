package com.sankuai.waimai.ai.uat.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.ai.uat.context.home.a;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import com.sankuai.waimai.alita.core.feature.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.alita.a {
    public static ChangeQuickRedirect a;
    private static b d;
    public WMUATRestaurantContext b;
    private com.sankuai.waimai.ai.uat.context.home.b e;
    private WMUATRestaurantContext f;
    private com.sankuai.waimai.ai.uat.context.global.a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a<T> {
        boolean a(T t);
    }

    public static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05167e2bba4945669df1f0951bdeb291", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05167e2bba4945669df1f0951bdeb291");
        }
        if (d == null) {
            d = new b();
        }
        return d;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f4f61d6a7f04b4b4734b262e86f070", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f4f61d6a7f04b4b4734b262e86f070");
            return;
        }
        JSONArray jSONArray = null;
        this.b = null;
        JSONObject a2 = com.sankuai.waimai.ai.uat.cache.utils.a.a(com.meituan.android.singleton.b.a, a.EnumC0684a.WMUATContextGlobal);
        if (a2 != null) {
            try {
                jSONArray = a2.getJSONArray("restaurants");
            } catch (JSONException unused) {
            }
        }
        c().j = jSONArray;
    }

    public final void a(com.sankuai.waimai.ai.uat.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84693223947c816dd5fecdceaa7a01b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84693223947c816dd5fecdceaa7a01b2");
            return;
        }
        switch (aVar.a()) {
            case WMUATContextHome:
                this.e = (com.sankuai.waimai.ai.uat.context.home.b) aVar;
                return;
            case WMUATContextRestaurant:
                WMUATRestaurantContext wMUATRestaurantContext = (WMUATRestaurantContext) aVar;
                this.f = wMUATRestaurantContext;
                c().g.add(0, wMUATRestaurantContext);
                return;
            case WMUATContextFoodDetail:
                c().h.add(0, aVar);
                return;
            case WMUATContextSearch:
                c().i.add(0, (com.sankuai.waimai.ai.uat.context.search.a) aVar);
                return;
            default:
                return;
        }
    }

    public com.sankuai.waimai.ai.uat.context.global.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92445458c15c7eb53094716935661c25", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ai.uat.context.global.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92445458c15c7eb53094716935661c25");
        }
        if (this.g == null) {
            this.g = new com.sankuai.waimai.ai.uat.context.global.a();
        }
        return this.g;
    }

    private JSONObject a(WMUATRestaurantContext wMUATRestaurantContext, boolean z) {
        Object[] objArr = {wMUATRestaurantContext, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096bc6fab0719d6a3bd084dfde017a84", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096bc6fab0719d6a3bd084dfde017a84");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", String.valueOf(wMUATRestaurantContext.g));
            jSONObject.put(DeviceInfo.TM, String.valueOf(wMUATRestaurantContext.b));
            jSONObject.put("staytime", String.valueOf(wMUATRestaurantContext.d));
            if (z) {
                jSONObject.put("session_id", String.valueOf(wMUATRestaurantContext.e));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject a(WMUATRestaurantContext wMUATRestaurantContext) {
        Object[] objArr = {wMUATRestaurantContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02072b24c4aecff2e12a686f6125fc7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02072b24c4aecff2e12a686f6125fc7f");
        }
        JSONObject a2 = a(wMUATRestaurantContext, false);
        try {
            JSONArray jSONArray = new JSONArray();
            if (wMUATRestaurantContext.h != null && !wMUATRestaurantContext.h.isEmpty()) {
                for (String str : wMUATRestaurantContext.h) {
                    jSONArray.put(str);
                }
            }
            a2.put("add_spu_ids", jSONArray);
        } catch (JSONException unused) {
        }
        return a2;
    }

    private JSONObject e() {
        JSONArray jSONArray;
        long j;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8370de028a57c668c543f19bd3f41e98", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8370de028a57c668c543f19bd3f41e98");
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = 86400000;
        if (c().g.isEmpty()) {
            JSONArray jSONArray4 = c().j;
            if (jSONArray4 != null) {
                int length = jSONArray4.length();
                int i2 = 0;
                for (int i3 = 15; i < length && i2 < i3; i3 = 15) {
                    JSONObject optJSONObject = jSONArray4.optJSONObject(i);
                    long optLong = optJSONObject.optLong(DeviceInfo.TM);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("add_spu_ids");
                    if (currentTimeMillis - optLong <= 86400000) {
                        if (optJSONArray == null) {
                            jSONArray2.put(optJSONObject);
                            jSONArray3.put(optJSONObject);
                        } else {
                            jSONArray3.put(optJSONObject);
                            try {
                                JSONObject jSONObject2 = new JSONObject(optJSONObject.toString());
                                jSONObject2.remove("add_spu_ids");
                                jSONArray2.put(jSONObject2);
                            } catch (JSONException unused) {
                            }
                        }
                        i2++;
                    }
                    i++;
                }
            }
        } else if (c().g.size() >= 15) {
            for (WMUATRestaurantContext wMUATRestaurantContext : c().g.subList(0, 15)) {
                if (wMUATRestaurantContext != null && currentTimeMillis - wMUATRestaurantContext.b <= 86400000) {
                    jSONArray2.put(a(wMUATRestaurantContext, true));
                    jSONArray3.put(a(wMUATRestaurantContext));
                }
            }
        } else {
            boolean z = false;
            int i4 = 0;
            for (WMUATRestaurantContext wMUATRestaurantContext2 : c().g) {
                if (currentTimeMillis - wMUATRestaurantContext2.b > 86400000) {
                    z = true;
                } else {
                    jSONArray2.put(a(wMUATRestaurantContext2, true));
                    jSONArray3.put(a(wMUATRestaurantContext2));
                    i4++;
                }
            }
            if (!z && (jSONArray = c().j) != null) {
                int i5 = 15 - i4;
                int length2 = jSONArray.length();
                int i6 = 0;
                while (i < length2 && i6 < i5) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        long optLong2 = optJSONObject2.optLong(DeviceInfo.TM);
                        JSONArray optJSONArray2 = optJSONObject2.optJSONArray("add_spu_ids");
                        j = 86400000;
                        if (currentTimeMillis - optLong2 <= 86400000) {
                            if (optJSONArray2 == null) {
                                jSONArray2.put(optJSONObject2);
                                jSONArray3.put(optJSONObject2);
                            } else {
                                jSONArray3.put(optJSONObject2);
                                try {
                                    JSONObject jSONObject3 = new JSONObject(optJSONObject2.toString());
                                    jSONObject3.remove("add_spu_ids");
                                    jSONArray2.put(jSONObject3);
                                } catch (JSONException unused2) {
                                }
                            }
                            i6++;
                        }
                    } else {
                        j = j2;
                    }
                    i++;
                    j2 = j;
                }
            }
        }
        try {
            jSONObject.put("24h_recs", jSONArray2);
            jSONObject.put("24h_rank", jSONArray3);
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    @Override // com.sankuai.waimai.alita.a, com.sankuai.waimai.alita.core.feature.h
    public final JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f36817e3347b9e4e95864d0f5ca4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f36817e3347b9e4e95864d0f5ca4cb");
        }
        if ("uat_global".equals(str)) {
            return e();
        }
        if ("all_query_words".equals(str)) {
            return f();
        }
        if ("all_click_pois".equals(str)) {
            return g();
        }
        if ("current_session_click_pois".equals(str)) {
            return h();
        }
        if ("current_session_query_words".equals(str)) {
            return i();
        }
        if ("current_poilist_rank_id_click_pois".equals(str)) {
            return j();
        }
        if ("last_interested_poi_info".equals(str)) {
            return k();
        }
        return null;
    }

    private JSONObject f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2ccf3acc54b2a48f938302dd852a37", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2ccf3acc54b2a48f938302dd852a37");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("all_query_words", jSONArray);
            if (this.g.i != null && !this.g.i.isEmpty()) {
                for (com.sankuai.waimai.ai.uat.context.search.a aVar : this.g.i) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("session_id", aVar.e);
                    jSONObject2.put("query_words", a(aVar.g, Integer.MAX_VALUE));
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c8b4804a69a5ad21df5749e32354ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c8b4804a69a5ad21df5749e32354ce");
        }
        JSONArray optJSONArray = e().optJSONArray("24h_recs");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("all_click_pois", optJSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.sankuai.waimai.alita.a, com.sankuai.waimai.alita.core.feature.h
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b852a067608ed7f222dc08c8bfef4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b852a067608ed7f222dc08c8bfef4f");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("uat_home");
        arrayList.add("uat_global");
        arrayList.add("all_click_pois");
        arrayList.add("all_query_words");
        arrayList.add("current_session_click_pois");
        arrayList.add("current_session_query_words");
        arrayList.add("current_poilist_rank_id_click_pois");
        arrayList.add("last_interested_poi_info");
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.feature.h
    public final void a(@NonNull String str, List<JSONObject> list, @Nullable f fVar) {
        Object[] objArr = {str, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173864ae4b727722c946ae71ec4207b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173864ae4b727722c946ae71ec4207b3");
        } else {
            com.sankuai.waimai.alita.core.base.util.a.a(fVar, a(str));
        }
    }

    @NonNull
    private JSONObject h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012e6a3bcc71c8532ee76a29322cc543", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012e6a3bcc71c8532ee76a29322cc543");
        }
        List<WMUATRestaurantContext> list = c().g;
        ArrayList arrayList = new ArrayList();
        for (WMUATRestaurantContext wMUATRestaurantContext : list) {
            if (wMUATRestaurantContext != null && wMUATRestaurantContext != this.f) {
                arrayList.add(wMUATRestaurantContext);
            }
        }
        final String session = Statistics.getSession();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(session)) {
                List<WMUATRestaurantContext> a2 = a(arrayList, new a<WMUATRestaurantContext>() { // from class: com.sankuai.waimai.ai.uat.feature.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.ai.uat.feature.b.a
                    public final /* synthetic */ boolean a(WMUATRestaurantContext wMUATRestaurantContext2) {
                        WMUATRestaurantContext wMUATRestaurantContext3 = wMUATRestaurantContext2;
                        Object[] objArr2 = {wMUATRestaurantContext3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc514a239e37b69d1b25bf9cc395c7bc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc514a239e37b69d1b25bf9cc395c7bc")).booleanValue() : session.equals(wMUATRestaurantContext3.e);
                    }
                }, 0);
                ArrayList arrayList2 = new ArrayList();
                for (WMUATRestaurantContext wMUATRestaurantContext2 : a2) {
                    if (wMUATRestaurantContext2 != null) {
                        String str = wMUATRestaurantContext2.g;
                        if (!TextUtils.isEmpty(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
                jSONObject.put("current_session_click_pois", a((List) arrayList2));
            } else {
                jSONObject.put("current_session_click_pois", new JSONArray());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    private JSONObject i() {
        List<String> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead1b0073a5f877472923697127a118c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead1b0073a5f877472923697127a118c");
        }
        List<com.sankuai.waimai.ai.uat.context.search.a> list2 = c().i;
        final String session = Statistics.getSession();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(session)) {
                List<com.sankuai.waimai.ai.uat.context.search.a> a2 = a(list2, new a<com.sankuai.waimai.ai.uat.context.search.a>() { // from class: com.sankuai.waimai.ai.uat.feature.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.ai.uat.feature.b.a
                    public final /* synthetic */ boolean a(com.sankuai.waimai.ai.uat.context.search.a aVar) {
                        com.sankuai.waimai.ai.uat.context.search.a aVar2 = aVar;
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "494c9186d871d6ec1569e00e3aea0329", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "494c9186d871d6ec1569e00e3aea0329")).booleanValue() : session.equals(aVar2.e);
                    }
                }, 0);
                ArrayList arrayList = new ArrayList();
                for (com.sankuai.waimai.ai.uat.context.search.a aVar : a2) {
                    if (aVar != null && (list = aVar.g) != null) {
                        arrayList.addAll(list);
                    }
                }
                jSONObject.put("current_session_query_words", a((List) arrayList));
            } else {
                jSONObject.put("current_session_query_words", new JSONArray());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b66ac6d82c2b26945000f2d4c9bd069", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b66ac6d82c2b26945000f2d4c9bd069");
        }
        List<WMUATRestaurantContext> list = c().g;
        ArrayList arrayList = new ArrayList();
        for (WMUATRestaurantContext wMUATRestaurantContext : list) {
            if (wMUATRestaurantContext != null && wMUATRestaurantContext != this.f) {
                arrayList.add(wMUATRestaurantContext);
            }
        }
        final String str = a.C0685a.a().b;
        JSONObject jSONObject = new JSONObject();
        try {
            List<WMUATRestaurantContext> a2 = a(arrayList, new a<WMUATRestaurantContext>() { // from class: com.sankuai.waimai.ai.uat.feature.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ai.uat.feature.b.a
                public final /* synthetic */ boolean a(WMUATRestaurantContext wMUATRestaurantContext2) {
                    WMUATRestaurantContext wMUATRestaurantContext3 = wMUATRestaurantContext2;
                    Object[] objArr2 = {wMUATRestaurantContext3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "881bd22c5bf0472b967221282d61caf4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "881bd22c5bf0472b967221282d61caf4")).booleanValue() : TextUtils.equals(str, wMUATRestaurantContext3.u);
                }
            }, 0);
            ArrayList arrayList2 = new ArrayList();
            for (WMUATRestaurantContext wMUATRestaurantContext2 : a2) {
                if (wMUATRestaurantContext2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("poi_id", wMUATRestaurantContext2.g);
                    jSONObject2.put("richness_degree", wMUATRestaurantContext2.t);
                    jSONObject2.put("click_count", wMUATRestaurantContext2.q.size() + 0 + wMUATRestaurantContext2.r.size() + (wMUATRestaurantContext2.m ? 1 : 0) + (wMUATRestaurantContext2.l ? 1 : 0) + (wMUATRestaurantContext2.k ? 1 : 0) + (wMUATRestaurantContext2.s ? 1 : 0));
                    arrayList2.add(jSONObject2);
                }
            }
            jSONObject.put("current_poilist_rank_id_click_pois", a((List) arrayList2));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    private static <T> List<T> a(@Nullable List<T> list, @Nullable a<T> aVar, int i) {
        Object[] objArr = {list, aVar, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eab972379f11cf19cc771408244bc866", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eab972379f11cf19cc771408244bc866");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                if (aVar.a(t)) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    private static <T> JSONArray a(@Nullable List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c05d767b472f0f9177aaea163ffefbc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c05d767b472f0f9177aaea163ffefbc5");
        }
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            jSONArray.put(t);
        }
        return jSONArray;
    }

    private JSONObject k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aed093e7fadc9c23f40dddc94c3c0d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aed093e7fadc9c23f40dddc94c3c0d3");
        }
        JSONObject jSONObject = new JSONObject();
        if (this.b != null) {
            try {
                jSONObject.put("last_interested_poi_info", com.sankuai.waimai.ai.uat.feature.a.b().a(this.b));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @Override // com.sankuai.waimai.alita.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc269743a780a6031ae324cc33fc5324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc269743a780a6031ae324cc33fc5324");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        com.sankuai.waimai.ai.uat.context.global.a c = c();
        Object[] objArr2 = {context, c};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ai.uat.cache.utils.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7ba8c33c1e6bcdcec3cf0a7792196c2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7ba8c33c1e6bcdcec3cf0a7792196c2a");
            return;
        }
        switch (c.a()) {
            case WMUATContextRestaurant:
                return;
            case WMUATContextHome:
                return;
            case WMUATContextGlobal:
                com.sankuai.waimai.ai.uat.context.global.a aVar = c;
                Object[] objArr3 = {context, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ai.uat.cache.utils.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a42b803fff79aef18733a4fd59181be8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a42b803fff79aef18733a4fd59181be8");
                    return;
                } else {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ai/uat/context/global_context", com.sankuai.waimai.ai.uat.cache.utils.a.a(aVar).toString());
                    return;
                }
            default:
                return;
        }
    }
}
