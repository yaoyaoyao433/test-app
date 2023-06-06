package com.sankuai.waimai.business.search.ui.result.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.message.a;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.common.util.m;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.platform.mach.monitor.a b = new com.sankuai.waimai.platform.mach.monitor.a("wm-search-result");

    public static com.sankuai.waimai.mach.recycler.c a(IMachProvider iMachProvider, OasisModule oasisModule, final Activity activity, Map<String, Object> map, boolean z) {
        HashMap hashMap;
        Map<String, Object> hashMap2;
        int constraintHeight;
        Object[] objArr = {iMachProvider, oasisModule, activity, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e368578b29dee4d0913b7ee9d347b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e368578b29dee4d0913b7ee9d347b2e");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.machTemplateId) || activity.isDestroyed()) {
            return null;
        }
        com.sankuai.waimai.mach.recycler.b machLogicList = iMachProvider.machLogicList();
        if (machLogicList == null) {
            SearchShareData.a(activity);
            machLogicList = SearchShareData.s;
        }
        com.sankuai.waimai.mach.recycler.b bVar = machLogicList;
        com.sankuai.waimai.mach.recycler.h a2 = bVar.a(oasisModule.machTemplateId, oasisModule.defaultTemplateId, "wm-search-result", null, iMachProvider.timeout(oasisModule.machTemplateId));
        if (a2 != null) {
            e.a(oasisModule.machTemplateId);
            Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
            if (a3 == null) {
                HashMap hashMap3 = new HashMap();
                String str = oasisModule.machTemplateId;
                String str2 = oasisModule.stringData;
                Object[] objArr2 = {activity, str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f082d760629139bc33a44e2624cf878c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f082d760629139bc33a44e2624cf878c");
                } else {
                    SearchShareData a4 = SearchShareData.a(activity);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("origin_data", str2);
                        jSONObject.put("keyword", a4.g);
                        jSONObject.put("cat_id", a4.w);
                        jSONObject.put("template_type", a4.y);
                        jSONObject.put("search_log_id", a4.l);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    com.sankuai.waimai.platform.capacity.log.i.d(new m().a("search_mach_data_error").b(str).c("mach_api_data_error").d(jSONObject.toString()).b());
                }
                hashMap = hashMap3;
            } else {
                hashMap = a3;
            }
            if (com.sankuai.waimai.foundation.utils.f.a(activity)) {
                return null;
            }
            Map<String, Object> a5 = a(activity, map);
            iMachProvider.customValue(a5, oasisModule.machTemplateId, null);
            hashMap.put("mach_custom_env_value", a5);
            hashMap.put(Constants.Environment.KEY_UNION_ID, oasisModule.unionId);
            hashMap.put("rank_list_id", ListIDHelper.a.a.a("nox", "search_global_block"));
            hashMap.put("biz_type", iMachProvider.bizId());
            com.sankuai.waimai.mach.d logReport = iMachProvider.logReport(oasisModule.machTemplateId, "c_nfqbfvw", AppUtil.generatePageInfoKey(activity));
            if (logReport == null) {
                logReport = new d(iMachProvider);
            }
            com.sankuai.waimai.search.common.mach.builder.a a6 = new com.sankuai.waimai.search.common.mach.builder.a(activity, "wm", SearchShareData.a(activity).n).a(new f(oasisModule.machTemplateId, b)).a(logReport);
            Map<String, Object> customEnv = iMachProvider.customEnv(oasisModule.machTemplateId, null);
            Object[] objArr3 = {customEnv};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ffa8c60e3e02d2b8bca5f2ebadeb2976", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap2 = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ffa8c60e3e02d2b8bca5f2ebadeb2976");
            } else {
                hashMap2 = new HashMap<>();
                if (customEnv != null) {
                    hashMap2.putAll(customEnv);
                }
                hashMap2.put("product_channel", "wm");
            }
            Mach.a a7 = a6.a(hashMap2).a(new a()).a();
            iMachProvider.interceptMachBuilder(a7);
            List<ITagProcessor> tagProcessors = iMachProvider.tagProcessors(oasisModule.machTemplateId);
            if (tagProcessors != null) {
                for (ITagProcessor iTagProcessor : tagProcessors) {
                    a7.a(iTagProcessor);
                }
            }
            List<JSInvokeNativeMethod> jsInvokeNativeMethods = iMachProvider.jsInvokeNativeMethods(oasisModule.machTemplateId);
            if (jsInvokeNativeMethods != null) {
                for (JSInvokeNativeMethod jSInvokeNativeMethod : jsInvokeNativeMethods) {
                    a7.a(jSInvokeNativeMethod);
                }
            }
            final com.sankuai.waimai.mach.recycler.c cVar = new com.sankuai.waimai.mach.recycler.c(oasisModule.machTemplateId, a2, a7, "wm-search-result", iMachProvider.bizId());
            if (logReport instanceof d) {
                d dVar = (d) logReport;
                dVar.b = AppUtil.generatePageInfoKey(activity);
                dVar.c = cVar;
            }
            iMachProvider.interceptLogReport(logReport, cVar);
            cVar.h = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.business.search.ui.result.mach.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.f
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a4c590cf2b5e084df9834e2a3de50513", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a4c590cf2b5e084df9834e2a3de50513");
                    } else {
                        SearchShareData.a(activity).ai.a(cVar);
                    }
                }
            };
            cVar.a("mach_custom_env_value", a5);
            int constraintWidth = iMachProvider.constraintWidth(activity, oasisModule.machTemplateId);
            if (z) {
                constraintHeight = com.sankuai.waimai.foundation.utils.g.d(activity);
            } else {
                constraintHeight = iMachProvider.constraintHeight(activity, oasisModule.machTemplateId);
            }
            bVar.a(activity, cVar, constraintWidth, constraintHeight, hashMap, "wm-search-result");
            Mach l = cVar.l();
            if (l != null) {
                l.registerJsEventCallback(new Mach.d() { // from class: com.sankuai.waimai.business.search.ui.result.mach.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.Mach.d
                    public final void a(@NonNull String str3, @Nullable Map<String, Object> map2) {
                        Object[] objArr4 = {str3, map2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "283b30288ca982578b70a89fa44034e8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "283b30288ca982578b70a89fa44034e8");
                        } else if (TextUtils.equals(str3, "std_trigger_expose_event")) {
                            com.sankuai.waimai.mach.recycler.c.this.e();
                        } else if (TextUtils.equals(str3, "close")) {
                            com.meituan.android.bus.a.a().c(new a.b());
                        }
                    }
                });
            }
            if (cVar.b() == null) {
                e.a(oasisModule.machTemplateId, oasisModule.stringData);
            } else {
                e.a();
            }
            return cVar;
        }
        e.a(oasisModule.machTemplateId, activity);
        return null;
    }

    private static Map<String, Object> a(Context context, Map<String, Object> map) {
        Map<String, Object> a2;
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9ee26e3a8f24d35f00d231503e9a3cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9ee26e3a8f24d35f00d231503e9a3cc");
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
        hashMap.put("search_source", Integer.valueOf(a3.K));
        hashMap.put("search_global_id", a3.m);
        hashMap.put("drug_new_message_badge", Integer.valueOf(a3.q));
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
