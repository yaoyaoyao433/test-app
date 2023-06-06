package com.sankuai.waimai.business.search.ui.result.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.common.util.m;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.platform.mach.monitor.a b = new com.sankuai.waimai.platform.mach.monitor.a("wm-search-result");

    public static com.sankuai.waimai.mach.recycler.c a(@NonNull com.sankuai.waimai.mach.recycler.b bVar, @Nullable String str, @NonNull String str2, @NonNull final Activity activity, Map<String, Object> map, @NonNull String str3, int i, int i2, com.sankuai.waimai.mach.b bVar2, com.sankuai.waimai.mach.d dVar, @Nullable Map<String, Object> map2) {
        HashMap hashMap;
        Map<String, Object> hashMap2;
        Object[] objArr = {bVar, str, str2, activity, map, str3, Integer.valueOf(i), 0, bVar2, dVar, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de1e57245da1e5e8de50fb071bf18581", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de1e57245da1e5e8de50fb071bf18581");
        }
        if (TextUtils.isEmpty(str) || activity.isDestroyed()) {
            return null;
        }
        com.sankuai.waimai.mach.recycler.h a2 = bVar.a(str, str2, "wm-search-result", null, 5000);
        if (a2 != null) {
            e.a(str);
            if (map == null) {
                HashMap hashMap3 = new HashMap();
                Object[] objArr2 = {activity, str, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "920da7318d37486b7859b686f8d932bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "920da7318d37486b7859b686f8d932bd");
                } else {
                    SearchShareData a3 = SearchShareData.a(activity);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("origin_data", str3);
                        jSONObject.put("keyword", a3.g);
                        jSONObject.put("cat_id", a3.w);
                        jSONObject.put("template_type", a3.y);
                        jSONObject.put("search_log_id", a3.l);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    com.sankuai.waimai.platform.capacity.log.i.d(new m().a("search_mach_data_error").b(str).c("mach_api_data_error").d(jSONObject.toString()).b());
                }
                hashMap = hashMap3;
            } else {
                hashMap = map;
            }
            if (com.sankuai.waimai.foundation.utils.f.a(activity)) {
                return null;
            }
            hashMap.put("mach_custom_env_value", a(activity, map2));
            hashMap.put("rank_list_id", ListIDHelper.a.a.a("nox", "search_global_block"));
            d dVar2 = dVar == null ? new d() : dVar;
            com.sankuai.waimai.search.common.mach.builder.a a4 = new com.sankuai.waimai.search.common.mach.builder.a(activity, "wm", SearchShareData.a(activity).n).a(new f(str, b)).a(dVar2);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "99c90ddb2ad07f49eb48d020c6709557", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap2 = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "99c90ddb2ad07f49eb48d020c6709557");
            } else {
                hashMap2 = new HashMap<>();
                hashMap2.put("product_channel", "wm");
            }
            final com.sankuai.waimai.mach.recycler.c cVar = new com.sankuai.waimai.mach.recycler.c(str, a2, a4.a(hashMap2).a(bVar2 == null ? new a() : bVar2).a(), "wm-search-result", "waimai");
            if (dVar2 instanceof d) {
                d dVar3 = (d) dVar2;
                dVar3.b = AppUtil.generatePageInfoKey(activity);
                dVar3.c = cVar;
            }
            cVar.h = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.business.search.ui.result.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.f
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "996ecf9924120d97587b751cdb08498b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "996ecf9924120d97587b751cdb08498b");
                    } else {
                        SearchShareData.a(activity).ai.a(cVar);
                    }
                }
            };
            bVar.a(activity, cVar, i, 0, hashMap, "wm-search-result");
            Mach l = cVar.l();
            if (l != null) {
                l.registerJsEventCallback(new Mach.d() { // from class: com.sankuai.waimai.business.search.ui.result.mach.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.Mach.d
                    public final void a(@NonNull String str4, @Nullable Map<String, Object> map3) {
                        Object[] objArr4 = {str4, map3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fa5122c20d0d8bc2d65359b3e9e1362", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fa5122c20d0d8bc2d65359b3e9e1362");
                        } else if (TextUtils.equals(str4, "std_trigger_expose_event")) {
                            com.sankuai.waimai.mach.recycler.c.this.e();
                        }
                    }
                });
            }
            if (cVar.b() == null) {
                e.a(str, str3);
            } else {
                e.a();
            }
            return cVar;
        }
        e.a(str, activity);
        return null;
    }

    private static Map<String, Object> a(Context context, Map<String, Object> map) {
        Map<String, Object> a2;
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5b37ce1ec7b57b9b617720d82debb88", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5b37ce1ec7b57b9b617720d82debb88");
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        SearchShareData a3 = SearchShareData.a(context);
        hashMap.put("qw_type_id", a3.e);
        hashMap.put("stid", a3.d);
        hashMap.put("keyword", a3.g);
        hashMap.put("label_word", a3.h);
        hashMap.put("template_type", Integer.valueOf(a3.y));
        hashMap.put("search_log_id", a3.l);
        hashMap.put("cat_id", Integer.valueOf(a3.w));
        hashMap.put("sort_type", Integer.valueOf(a3.R));
        hashMap.put("spu_mode", Integer.valueOf(a3.P));
        hashMap.put("is_filter_result", k.a(a3));
        hashMap.put("filter_codes", a3.S == null ? "0" : a3.S);
        hashMap.put("filter_mapping", a3.T == null ? "" : a3.T);
        hashMap.put("trace_info", a3.aa);
        hashMap.put("search_trace_info", a3.ad);
        hashMap.put("paotui_channel", a3.ab == null ? "" : a3.ab);
        hashMap.put("more_param", a3.ac);
        hashMap.put("user_prefer_type", a3.ae);
        hashMap.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, Integer.valueOf(a3.k));
        hashMap.put("search_mode", Integer.valueOf(a3.O));
        hashMap.put("exp_ab_info", a3.X);
        hashMap.put("search_type", Integer.valueOf(a3.V ? 2 : 1));
        hashMap.put("inner_search_intent", Integer.valueOf(a3.U));
        hashMap.put("ad_icon_url", com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.key_poi_ad_icon_url, ""));
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        String str = "";
        String str2 = "";
        if (p != null) {
            try {
                String valueOf = String.valueOf((long) (p.getLatitude() * 1000000.0d));
                try {
                    str2 = String.valueOf((long) (p.getLongitude() * 1000000.0d));
                } catch (NullPointerException unused) {
                }
                str = valueOf;
            } catch (NullPointerException unused2) {
            }
        }
        hashMap.put("poi_latitude", str);
        hashMap.put("poi_longitude", str2);
        if (!TextUtils.isEmpty(a3.af) && (a2 = com.sankuai.waimai.mach.utils.b.a(a3.af)) != null && a2.size() > 0) {
            hashMap.putAll(a2);
        }
        return hashMap;
    }
}
