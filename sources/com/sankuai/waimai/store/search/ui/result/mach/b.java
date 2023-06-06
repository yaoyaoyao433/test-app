package com.sankuai.waimai.store.search.ui.result.mach;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.mach.SGCommonMachUtilModule;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.machandprice.HandPriceMachProcessor;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import com.sankuai.waimai.store.view.standard.mach.SGScrollerProcessor;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static ISearchTemplateProvider c = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH);
    private static ISearchTemplateProvider d = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH);
    private static d e = new d();
    private static com.sankuai.waimai.platform.mach.monitor.a f = new com.sankuai.waimai.platform.mach.monitor.a("wm-search-result");
    public static String b = "wm-search-result";

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(com.sankuai.waimai.mach.recycler.c cVar);
    }

    public static com.sankuai.waimai.mach.recycler.c a(@NonNull com.sankuai.waimai.mach.recycler.b bVar, @Nullable String str, @NonNull String str2, @NonNull final Activity activity, @NonNull Map<String, Object> map, @NonNull String str3, int i, int i2, com.sankuai.waimai.mach.b bVar2, com.sankuai.waimai.mach.d dVar, @Nullable Map<String, Object> map2, Map<String, Object> map3) {
        SearchShareData b2;
        com.sankuai.waimai.mach.d dVar2;
        Map<String, Object> hashMap;
        com.sankuai.waimai.mach.d iVar;
        Object[] objArr = {bVar, str, str2, activity, map, str3, Integer.valueOf(i), 0, null, dVar, map2, map3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "349ed2006e4a84baeb5bd51070154891", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "349ed2006e4a84baeb5bd51070154891");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.sankuai.waimai.mach.recycler.h a2 = bVar.a(str, TextUtils.isEmpty(str2) ? "" : str2, b, 5000);
        if (a2 == null) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "422914ce7bebcf12ae9f0fc102568d99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "422914ce7bebcf12ae9f0fc102568d99");
            } else {
                com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.MANAGER_NOT_INIT, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str);
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_load_search").b("template download failed").d(jSONObject.toString()).b());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("template_id", str);
                    jSONObject2.put("case_tag", "loadTemplateFailed");
                    com.sankuai.waimai.platform.capacity.log.i.a(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_search").d(jSONObject2.toString()).b());
                } catch (Exception unused) {
                }
            }
            return null;
        }
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e7c04ab8df3449fb12984b0d5cb9cd4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e7c04ab8df3449fb12984b0d5cb9cd4d");
        } else {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("template_id", str);
                jSONObject3.put("data", "");
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_load_search").b("template download success").d(jSONObject3.toString()).b());
            } catch (Exception unused2) {
            }
        }
        if (activity.isDestroyed() || (b2 = SearchShareData.b((Context) activity)) == null) {
            return null;
        }
        map.put("mach_custom_env_value", a(map2, b2, str));
        if (dVar == null) {
            if (b2.bf == 1) {
                iVar = new d();
            } else {
                iVar = new i();
            }
            dVar2 = iVar;
        } else {
            dVar2 = dVar;
        }
        com.sankuai.waimai.search.common.mach.builder.a a3 = new com.sankuai.waimai.search.common.mach.builder.a(activity, "sg", b2.aY).a(new f(str, f)).a(dVar2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3345a4e6e3565140b1a1a420984f973d", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3345a4e6e3565140b1a1a420984f973d");
        } else {
            hashMap = new HashMap<>();
            hashMap.put("product_channel", "sg");
        }
        Mach.a a4 = a3.a(hashMap).a(new com.sankuai.waimai.store.search.ui.result.mach.a()).a();
        a(a4, b2.bf);
        a4.a(new SGScrollerProcessor(b2.aP));
        a4.a(new com.sankuai.waimai.store.mach.swiper.b());
        a4.a(new HandPriceMachProcessor());
        a4.a(new SGCommonMachUtilModule());
        e.b = AppUtil.generatePageInfoKey(activity);
        final com.sankuai.waimai.mach.recycler.c cVar = new com.sankuai.waimai.mach.recycler.c(str, a2, a4, b, SearchShareData.b);
        if (dVar2 instanceof d) {
            d dVar3 = (d) dVar2;
            dVar3.b = AppUtil.generatePageInfoKey(activity);
            dVar3.c = cVar;
            dVar3.d = map3;
        }
        if (dVar2 instanceof i) {
            i iVar2 = (i) dVar2;
            iVar2.b = AppUtil.generatePageInfoKey(activity);
            iVar2.c = cVar;
            iVar2.d = map3;
        }
        cVar.h = new com.sankuai.waimai.mach.f() { // from class: com.sankuai.waimai.store.search.ui.result.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.f
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9d36c0f0651e963c3ef083e635df9cd7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9d36c0f0651e963c3ef083e635df9cd7");
                    return;
                }
                SearchShareData b3 = SearchShareData.b((Context) activity);
                if (b3 == null || b3.aO == null) {
                    return;
                }
                b3.aO.a(cVar);
            }
        };
        cVar.a("mach_custom_env_value", a(map2, b2, str));
        bVar.a(activity, cVar, i, 0, map, b);
        if (cVar.b() == null) {
            Object[] objArr5 = {str, str3};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "20ab2ee0784cabc9712c067366150e2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "20ab2ee0784cabc9712c067366150e2f");
            } else {
                com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("template_id", str);
                    jSONObject4.put("case_tag", "preRenderFailed");
                    jSONObject4.put("data", str3);
                    com.sankuai.waimai.platform.capacity.log.i.a(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_search").d(jSONObject4.toString()).b());
                } catch (Exception unused3) {
                }
            }
        } else {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = e.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "9652c42c56b19cf126629c09ccfad871", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "9652c42c56b19cf126629c09ccfad871");
            } else {
                com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_SUCCESS, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
            }
        }
        return cVar;
    }

    private static void a(Mach.a aVar, int i) {
        com.sankuai.waimai.mach.render.b bVar;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.sankuai.waimai.mach.render.b bVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d6bd7c0df8e76c2b26214cb89e6b35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d6bd7c0df8e76c2b26214cb89e6b35e");
            return;
        }
        if (c != null) {
            SparseArrayCompat<ITagProcessor> providerMachComponentProcessor = c.providerMachComponentProcessor();
            bVar = c.providerMachRenderEngine();
            if (providerMachComponentProcessor != null) {
                int size = providerMachComponentProcessor.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ITagProcessor iTagProcessor = providerMachComponentProcessor.get(i2);
                    if (iTagProcessor != null) {
                        aVar.a(iTagProcessor);
                    }
                }
            }
        } else {
            bVar = null;
        }
        if (d != null) {
            SparseArrayCompat<ITagProcessor> providerMachComponentProcessor2 = d.providerMachComponentProcessor();
            bVar2 = d.providerMachRenderEngine();
            if (providerMachComponentProcessor2 != null) {
                int size2 = providerMachComponentProcessor2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ITagProcessor iTagProcessor2 = providerMachComponentProcessor2.get(i3);
                    if (iTagProcessor2 != null) {
                        aVar.a(iTagProcessor2);
                    }
                }
            }
        }
        if (i == 1) {
            bVar = bVar2;
        }
        aVar.c = bVar;
    }

    private static Map<String, Object> a(Map<String, Object> map, SearchShareData searchShareData, String str) {
        Object[] objArr = {map, searchShareData, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6aa62e97aca6bd7adfab4f150b9c0090", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6aa62e97aca6bd7adfab4f150b9c0090");
        }
        HashMap hashMap = new HashMap();
        if (searchShareData == null) {
            return hashMap;
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("qw_type_id", searchShareData.g);
        hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(searchShareData));
        hashMap.put("keyword", searchShareData.h);
        hashMap.put("label_word", searchShareData.l);
        hashMap.put("template_type", Integer.valueOf(searchShareData.D));
        hashMap.put("search_log_id", searchShareData.q);
        hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
        hashMap.put("sort_type", Integer.valueOf(searchShareData.aL));
        hashMap.put("spu_mode", Integer.valueOf(searchShareData.aK));
        hashMap.put("filter_codes", searchShareData.aM == null ? "" : searchShareData.aM);
        hashMap.put("filter_mapping", searchShareData.aN == null ? "" : searchShareData.aN);
        hashMap.put("paotui_channel", searchShareData.bp == null ? "" : searchShareData.bp);
        hashMap.put("more_param", searchShareData.bq == null ? "" : searchShareData.bq);
        hashMap.put("navigate_type", Long.valueOf(searchShareData.y));
        hashMap.put("search_source", Integer.valueOf(searchShareData.aw));
        hashMap.put("search_global_id", searchShareData.r);
        hashMap.put("search_mode", Integer.valueOf(searchShareData.aH));
        hashMap.put("is_filter_result", com.sankuai.waimai.store.search.statistics.g.b(searchShareData));
        hashMap.put("is_filter_sec_result", com.sankuai.waimai.store.search.statistics.g.e(searchShareData));
        hashMap.put("rank_type", Long.valueOf(com.sankuai.waimai.store.search.statistics.g.c(searchShareData)));
        hashMap.put("filter_type", com.sankuai.waimai.store.search.statistics.g.d(searchShareData));
        hashMap.put("trace_info", searchShareData.aZ);
        hashMap.put("user_prefer_type", searchShareData.ba);
        hashMap.put("exp_ab_info", com.sankuai.waimai.store.util.i.a(searchShareData.be));
        hashMap.put("tab_code", searchShareData.am);
        hashMap.put("poi_nest_scroll_type", Integer.valueOf(searchShareData.aI));
        hashMap.put("selected_query", searchShareData.i);
        hashMap.put("original_query", TextUtils.isEmpty(searchShareData.j) ? searchShareData.h : searchShareData.j);
        hashMap.put("maicai_support_level", searchShareData.bu);
        hashMap.put("maicai_support_classify", searchShareData.bv);
        a(hashMap, str);
        return hashMap;
    }

    private static void a(@NonNull Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec34f343df64fa3d8c5795a9d58b1a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec34f343df64fa3d8c5795a9d58b1a0c");
            return;
        }
        if (!"supermarket-drug-smart-triage-guide-result".equals(str)) {
            map.put("module_valid_index", Integer.valueOf(com.sankuai.waimai.store.search.data.e.b));
        }
        if ("supermarket-drug-search-product".equals(str) || "drug-search-poi-template".equals(str) || "drug-search-noresult-rec-poi".equals(str)) {
            map.put("module_valid_item_index", Integer.valueOf(com.sankuai.waimai.store.search.data.e.c));
        }
    }
}
