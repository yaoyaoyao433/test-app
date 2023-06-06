package com.sankuai.waimai.store.search.data;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.ForbiddenInfo;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.mach.SearchMachQaSp;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchDeserializeMonitor;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static a b = new a(new b());
    private static boolean c = false;

    public static ForbiddenInfo a(GlobalPageResponse globalPageResponse) {
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "856b5ebb36d07e2fdd12fccb113c7acc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ForbiddenInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "856b5ebb36d07e2fdd12fccb113c7acc");
        }
        if (globalPageResponse == null || com.sankuai.waimai.foundation.utils.d.a(globalPageResponse.moduleList)) {
            return null;
        }
        for (OasisModule oasisModule : globalPageResponse.moduleList) {
            if (oasisModule != null && "wm_search_forbidden".equals(oasisModule.nativeTemplateId) && !TextUtils.isEmpty(oasisModule.stringData)) {
                Serializable a2 = b.a(oasisModule.nativeTemplateId, oasisModule.stringData);
                if (a2 instanceof ForbiddenInfo) {
                    return (ForbiddenInfo) a2;
                }
            }
        }
        return null;
    }

    public static Serializable a(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b06cd78c7cb5bb85c94791c211555e7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b06cd78c7cb5bb85c94791c211555e7f");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.nativeTemplateId) || TextUtils.isEmpty(oasisModule.stringData)) {
            return null;
        }
        return b.a(oasisModule.nativeTemplateId, oasisModule.stringData);
    }

    public static Serializable b(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b1d8f6f6d984825952bff44ffbe4ddb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b1d8f6f6d984825952bff44ffbe4ddb");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.machTemplateId) || TextUtils.isEmpty(oasisModule.stringData)) {
            return null;
        }
        return b.a(oasisModule.machTemplateId, oasisModule.stringData);
    }

    public static void a(boolean z) {
        c = z;
    }

    public static void a(OasisModule oasisModule, SearchShareData searchShareData, Activity activity, boolean z) {
        Object[] objArr = {oasisModule, searchShareData, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fba51393243c10de4756ec856be6bbb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fba51393243c10de4756ec856be6bbb1");
        } else if (c || oasisModule == null || activity == null || searchShareData == null) {
        } else {
            long b2 = SearchMachQaSp.b();
            Set<String> a2 = SearchMachQaSp.a();
            if (TextUtils.isEmpty(oasisModule.unionId) || !searchShareData.H.containsKey(oasisModule.unionId)) {
                searchShareData.H.put(oasisModule.unionId, "");
                if (!"supermarket_search_question_score_module".equalsIgnoreCase(oasisModule.moduleId) || (!searchShareData.I.containsKey(oasisModule.moduleId) && System.currentTimeMillis() - b2 >= TimeUnit.DAYS.toMillis(1L))) {
                    searchShareData.I.put(oasisModule.moduleId, "");
                    com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
                    int a3 = com.sankuai.waimai.foundation.utils.g.a((Context) activity);
                    d dVar = new d();
                    if (oasisModule.templateType == 0 && "wm_search_direct_card".equals(oasisModule.nativeTemplateId)) {
                        oasisModule.templateType = 1;
                        oasisModule.machTemplateId = "supermarket-search-business-direct";
                    }
                    if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_feed_product_template", oasisModule.nativeTemplateId) && TextUtils.equals(searchShareData.bj, "EXP")) {
                        oasisModule.nativeTemplateId = "wm_search_feed_product_750";
                    }
                    if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_poi_template", oasisModule.nativeTemplateId) && TextUtils.equals(searchShareData.bk, ErrorCode.ERROR_TYPE_B)) {
                        oasisModule.nativeTemplateId = "wm_search_poi_template_radical";
                    }
                    if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_category_template", oasisModule.nativeTemplateId) && TextUtils.equals(searchShareData.bk, ErrorCode.ERROR_TYPE_B)) {
                        oasisModule.nativeTemplateId = "wm_search_category_template_radical";
                    }
                    if (oasisModule.templateType == 1) {
                        CommonMachData a4 = com.sankuai.waimai.store.search.ui.result.mach.prerender.b.a(searchShareData, oasisModule, bVar, activity, a3);
                        if (a4 != null) {
                            if ("supermarket_search_question_score_module".equalsIgnoreCase(oasisModule.moduleId) && !TextUtils.isEmpty(oasisModule.stringData)) {
                                Map<String, Object> a5 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
                                if (a2 != null) {
                                    try {
                                        if (a2.contains(String.valueOf(a5.get("surveyId")))) {
                                            return;
                                        }
                                    } catch (Exception e) {
                                        com.dianping.judas.util.a.a(e);
                                        return;
                                    }
                                }
                            }
                            oasisModule.data = a4;
                            return;
                        }
                        com.sankuai.waimai.store.util.monitor.c.a(SearchDeserializeMonitor.ExecutorMachPreRenderError, null, oasisModule.machTemplateId);
                        if (z && com.sankuai.waimai.store.search.ui.result.mach.process.c.b(oasisModule.machTemplateId)) {
                            com.sankuai.waimai.store.search.ui.result.mach.process.c.a(oasisModule);
                            a(oasisModule, dVar, searchShareData);
                        }
                        if (z && com.sankuai.waimai.store.search.ui.result.mach.process.c.a(oasisModule.machTemplateId)) {
                            com.sankuai.waimai.store.search.ui.result.mach.process.c.b(oasisModule);
                            a(oasisModule, dVar, searchShareData);
                        }
                    } else if (oasisModule.templateType == 0) {
                        a(oasisModule, dVar, searchShareData);
                    }
                }
            }
        }
    }

    private static void a(@NonNull OasisModule oasisModule, @NonNull d dVar, SearchShareData searchShareData) {
        Object[] objArr = {oasisModule, dVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e6de3097d3ec0d0d0fa8e0d08a1e619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e6de3097d3ec0d0d0fa8e0d08a1e619");
            return;
        }
        Serializable a2 = a(oasisModule);
        if (a2 == null) {
            return;
        }
        oasisModule.data = a2;
        if (a2 instanceof PoiEntity) {
            PoiEntity poiEntity = (PoiEntity) a2;
            a(dVar, poiEntity, searchShareData);
            a(poiEntity, searchShareData);
        }
    }

    private static void a(@NonNull PoiEntity poiEntity, SearchShareData searchShareData) {
        poiEntity.templateDetail = searchShareData.D;
        if (g.a == -1) {
            g.a = poiEntity.productShowType;
        }
    }

    private static void a(@NonNull d dVar, @NonNull PoiEntity poiEntity, SearchShareData searchShareData) {
        Object[] objArr = {dVar, poiEntity, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f46578caff29fbc27e62eae4f3bcf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f46578caff29fbc27e62eae4f3bcf4");
        } else if (dVar == null || dVar.a()) {
        } else {
            if (!dVar.b && poiEntity.isAccurateResult()) {
                dVar.b = true;
                JudasManualManager.b("b_g6VHz").a(a(searchShareData)).a();
            } else if (!dVar.d && poiEntity.isRelatedResult()) {
                dVar.d = true;
                JudasManualManager.b("b_65oN4").a(a(searchShareData)).a();
            } else if (dVar.c || !poiEntity.isRecommendResult()) {
            } else {
                dVar.c = true;
                JudasManualManager.b("b_j1X7u").a(a(searchShareData)).a();
            }
        }
    }

    private static Map<String, Object> a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "252f0dc3491d3f6940e27dbf9b7af62d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "252f0dc3491d3f6940e27dbf9b7af62d");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qw_type_id", searchShareData.g);
        hashMap.put("stid", searchShareData.e);
        hashMap.put("keyword", searchShareData.h);
        hashMap.put("label_word", searchShareData.l);
        hashMap.put("search_log_id", searchShareData.q);
        hashMap.put("template_type", Integer.valueOf(searchShareData.D));
        hashMap.put("picture_pattern", Integer.valueOf(searchShareData.D != 2 ? 0 : 1));
        hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
        hashMap.put("is_filter_result", com.sankuai.waimai.store.search.statistics.g.b(searchShareData));
        hashMap.put("filter_type", com.sankuai.waimai.store.search.statistics.g.d(searchShareData));
        hashMap.put("rank_type", Long.valueOf(com.sankuai.waimai.store.search.statistics.g.c(searchShareData)));
        return hashMap;
    }
}
