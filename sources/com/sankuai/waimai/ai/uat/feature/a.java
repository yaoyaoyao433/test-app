package com.sankuai.waimai.ai.uat.feature;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import com.sankuai.waimai.alita.core.feature.f;
import com.sankuai.waimai.foundation.utils.h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.alita.a {
    public static ChangeQuickRedirect a;
    private static a b;
    private WMUATRestaurantContext d;

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    @Override // com.sankuai.waimai.alita.a, com.sankuai.waimai.alita.core.feature.h
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da51c7e4f86cb62952b026b9df0f01e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da51c7e4f86cb62952b026b9df0f01e4");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("poi_interest");
        arrayList.add("uat_poi");
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.feature.h
    public final void a(@NonNull String str, List<JSONObject> list, @Nullable f fVar) {
        Object[] objArr = {str, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15fb01952702c8b567399362d5454e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15fb01952702c8b567399362d5454e5e");
        } else {
            com.sankuai.waimai.alita.core.base.util.a.a(fVar, a(str));
        }
    }

    public final void a(com.sankuai.waimai.ai.uat.context.a aVar) {
        this.d = (WMUATRestaurantContext) aVar;
    }

    public final synchronized void b(com.sankuai.waimai.ai.uat.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04bccaad76d83673b2a27a5e062e1969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04bccaad76d83673b2a27a5e062e1969");
        } else {
            a(aVar);
        }
    }

    @Override // com.sankuai.waimai.alita.a, com.sankuai.waimai.alita.core.feature.h
    public final synchronized JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a784629386dd7a0a4bacb33ee70c937d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a784629386dd7a0a4bacb33ee70c937d");
        }
        return a(this.d);
    }

    public final JSONObject a(WMUATRestaurantContext wMUATRestaurantContext) {
        boolean z = true;
        Object[] objArr = {wMUATRestaurantContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8295d84de743231604460a34b196c176", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8295d84de743231604460a34b196c176");
        }
        JSONObject jSONObject = new JSONObject();
        if (wMUATRestaurantContext != null) {
            try {
                jSONObject.put("poi_id", wMUATRestaurantContext.g);
                StringBuilder sb = new StringBuilder();
                sb.append(wMUATRestaurantContext.b);
                jSONObject.put(DeviceInfo.TM, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wMUATRestaurantContext.c > 0 ? this.d.c : System.currentTimeMillis() - this.d.b);
                jSONObject.put("duration", sb2.toString());
                jSONObject.put("is_review_activity_detail", a(wMUATRestaurantContext.i));
                jSONObject.put("is_review_comment", a(wMUATRestaurantContext.k));
                jSONObject.put("is_review_merchant", a(wMUATRestaurantContext.l));
                if (!wMUATRestaurantContext.m && !wMUATRestaurantContext.o && !wMUATRestaurantContext.n) {
                    z = false;
                }
                jSONObject.put("is_activity_card_clicked", a(z));
                jSONObject.put("clicked_categories", a(wMUATRestaurantContext.j, Integer.MAX_VALUE));
                jSONObject.put("exposed_spu_count", a(wMUATRestaurantContext.p, Integer.MAX_VALUE).length());
                jSONObject.put("spu_ids_clicked", a(wMUATRestaurantContext.q, Integer.MAX_VALUE));
                jSONObject.put("spu_ids_inc_clicked", a(wMUATRestaurantContext.r, Integer.MAX_VALUE));
                jSONObject.put("is_clicked_collect", a(wMUATRestaurantContext.s));
                jSONObject.put("exposed_spu_ids", a(wMUATRestaurantContext.p, Integer.MAX_VALUE));
                jSONObject.put("is_connect_shop", a(wMUATRestaurantContext.x));
                jSONObject.put("spu_clicked_count", wMUATRestaurantContext.q.size());
                jSONObject.put("spu_inc_count", wMUATRestaurantContext.r.size());
                jSONObject.put("is_coupon_clicked", a(wMUATRestaurantContext.m));
                jSONObject.put("is_red_packet_clicked", a(wMUATRestaurantContext.n));
                jSONObject.put("comment_all", a(wMUATRestaurantContext, "comment_all"));
                jSONObject.put("comment_dp", a(wMUATRestaurantContext, "comment_dp"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    @NonNull
    private JSONObject a(WMUATRestaurantContext wMUATRestaurantContext, String str) {
        Map<String, Float> b2;
        Object[] objArr = {wMUATRestaurantContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d0d08987bb5148423f354fc38d1d59", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d0d08987bb5148423f354fc38d1d59");
        }
        JSONObject jSONObject = new JSONObject();
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 899150444) {
            if (hashCode == 2103857089 && str.equals("comment_all")) {
                c = 0;
            }
        } else if (str.equals("comment_dp")) {
            c = 1;
        }
        switch (c) {
            case 0:
                b2 = b(wMUATRestaurantContext);
                break;
            case 1:
                b2 = wMUATRestaurantContext.w.get(21);
                break;
            default:
                b2 = null;
                break;
        }
        if (b2 != null && !b2.isEmpty()) {
            ArrayList<Float> arrayList = new ArrayList(b2.values());
            double d = 0.0d;
            int i = 0;
            for (Float f : arrayList) {
                d += f.floatValue();
                if (f.floatValue() == 1.0f) {
                    i++;
                }
            }
            try {
                jSONObject.put("exposed_count", arrayList.size());
                double size = d / arrayList.size();
                Object[] objArr2 = {Double.valueOf(size), 1};
                ChangeQuickRedirect changeQuickRedirect2 = h.a;
                jSONObject.put("exposed_avg_star", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3aee9b2a4f460c7765b9b670b88346ae", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3aee9b2a4f460c7765b9b670b88346ae")).doubleValue() : new BigDecimal(size).setScale(1, 4).doubleValue());
                jSONObject.put("exposed_one_star_count", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                jSONObject.put("exposed_count", 0);
                jSONObject.put("exposed_avg_star", 0);
                jSONObject.put("exposed_one_star_count", 0);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    private Map<String, Float> b(WMUATRestaurantContext wMUATRestaurantContext) {
        Object[] objArr = {wMUATRestaurantContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c86d48f6062594bae69bb61d95d82f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c86d48f6062594bae69bb61d95d82f");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Map<String, Float>> entry : wMUATRestaurantContext.w.entrySet()) {
            if (entry.getKey().intValue() != 21) {
                hashMap.putAll(entry.getValue());
            }
        }
        return hashMap;
    }

    public static a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4108073c1babfd81ab81958bdb62b9d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4108073c1babfd81ab81958bdb62b9d4");
        }
        if (b == null) {
            b = new a();
        }
        return b;
    }
}
