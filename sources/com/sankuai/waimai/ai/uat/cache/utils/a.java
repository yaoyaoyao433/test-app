package com.sankuai.waimai.ai.uat.cache.utils;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ai.uat.cache.utils.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[a.EnumC0684a.valuesCustom().length];

        static {
            try {
                a[a.EnumC0684a.WMUATContextRestaurant.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC0684a.WMUATContextHome.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC0684a.WMUATContextGlobal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static JSONObject a(com.sankuai.waimai.ai.uat.context.global.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14474c90bc2e63b7b4751113eff96f17", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14474c90bc2e63b7b4751113eff96f17");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (WMUATRestaurantContext wMUATRestaurantContext : aVar.g) {
            jSONArray.put(a(wMUATRestaurantContext));
            i++;
            if (i >= 15) {
                break;
            }
        }
        JSONArray jSONArray2 = aVar.j;
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length && i < 15; i2++) {
                Object opt = jSONArray2.opt(i2);
                if (opt != null) {
                    jSONArray.put(opt);
                    i++;
                }
            }
        }
        try {
            jSONObject.put("restaurants", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(WMUATRestaurantContext wMUATRestaurantContext) {
        Object[] objArr = {wMUATRestaurantContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66a9e268ec66223661e4ad086975d94a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66a9e268ec66223661e4ad086975d94a");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", String.valueOf(wMUATRestaurantContext.g));
            jSONObject.put(DeviceInfo.TM, String.valueOf(wMUATRestaurantContext.b));
            jSONObject.put("staytime", String.valueOf(wMUATRestaurantContext.d));
            JSONArray jSONArray = new JSONArray();
            if (wMUATRestaurantContext.h != null && !wMUATRestaurantContext.h.isEmpty()) {
                for (String str : wMUATRestaurantContext.h) {
                    if (str != null) {
                        jSONArray.put(str);
                    }
                }
            }
            jSONObject.put("add_spu_ids", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(Context context, a.EnumC0684a enumC0684a) {
        Object[] objArr = {context, enumC0684a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a111c83447c6704722bbdb0c301376e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a111c83447c6704722bbdb0c301376e");
        }
        if (AnonymousClass1.a[enumC0684a.ordinal()] == 3) {
            try {
                return new JSONObject(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ai/uat/context/global_context", ""));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
