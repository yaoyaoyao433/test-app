package com.sankuai.waimai.store.search.data;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.mach.SearchMachQaSp;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchDeserializeMonitor;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends AsyncTask<Void, Void, List<OasisModule>> {
    public static ChangeQuickRedirect a = null;
    public static int b = -1;
    public static int c = -1;
    private final WeakReference<a> d;
    private final WeakReference<Activity> e;
    private final SearchShareData f;
    private List<OasisModule> g;
    private List<OasisModule> h;
    private GlobalPageResponse i;
    private MetricsSpeedMeterTask j;
    private MetricsSpeedMeterTask k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull List<OasisModule> list);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(List<OasisModule> list) {
        List<OasisModule> list2 = list;
        Object[] objArr = {list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c3948ff5a2032586410a81ff767aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c3948ff5a2032586410a81ff767aab");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2) && this.i != null && this.i.globalSearchExtraInfo != null && !t.a(this.i.globalSearchExtraInfo.searchLogId)) {
            for (OasisModule oasisModule : list2) {
                this.f.a(oasisModule.data, this.i.globalSearchExtraInfo.searchLogId);
            }
        }
        if (this.j != null) {
            this.j.recordStep("child_process_stop");
            h.a(this.j);
            this.j.disable();
        }
        if (this.k != null) {
            this.k.recordStep("native_deserialize_finish");
            h.a(this.k);
        }
        if (this.f != null && this.f.aX != null) {
            this.f.aX.recordStep("native_deserialize_finish");
        }
        a aVar = this.d.get();
        if (aVar != null) {
            aVar.a(list2);
        }
    }

    public e(@NonNull Activity activity, @NonNull a aVar, @NonNull List<OasisModule> list, @NonNull SearchShareData searchShareData, @NonNull GlobalPageResponse globalPageResponse, MetricsSpeedMeterTask metricsSpeedMeterTask, MetricsSpeedMeterTask metricsSpeedMeterTask2, boolean z) {
        Object[] objArr = {activity, aVar, list, searchShareData, globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4434ceac9fb22e7888d3b18eed08a94d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4434ceac9fb22e7888d3b18eed08a94d");
            return;
        }
        this.e = new WeakReference<>(activity);
        this.d = new WeakReference<>(aVar);
        this.f = searchShareData;
        this.g = list;
        this.i = globalPageResponse;
        this.j = metricsSpeedMeterTask;
        this.k = metricsSpeedMeterTask2;
        this.h = new ArrayList();
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2c0fa9b9dd9644e7ce6c6edc2b4d360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2c0fa9b9dd9644e7ce6c6edc2b4d360");
        } else if (z) {
        } else {
            if (b != -1) {
                b = -1;
            }
            if (c != -1) {
                c = -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public List<OasisModule> doInBackground(Void... voidArr) {
        Set<String> set;
        Activity activity;
        int i;
        int i2 = 1;
        boolean z = false;
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504308ac061ad68d4902f3d5ae380fc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504308ac061ad68d4902f3d5ae380fc9");
        }
        if (!isCancelled()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a6628cb6211a48a253f456c2ae0c73", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a6628cb6211a48a253f456c2ae0c73");
            } else {
                Activity activity2 = this.e.get();
                if (activity2 != null && !com.sankuai.waimai.foundation.utils.d.a(this.g)) {
                    com.sankuai.waimai.mach.recycler.b bVar = this.f.t;
                    int a2 = com.sankuai.waimai.foundation.utils.g.a((Context) activity2);
                    d dVar = new d();
                    long b2 = SearchMachQaSp.b();
                    Set<String> a3 = SearchMachQaSp.a();
                    for (OasisModule oasisModule : this.g) {
                        if (oasisModule != null && (TextUtils.isEmpty(oasisModule.unionId) || !this.f.H.containsKey(oasisModule.unionId))) {
                            if (!"supermarket_search_question_score_module".equalsIgnoreCase(oasisModule.moduleId) || (!this.f.I.containsKey(oasisModule.moduleId) && System.currentTimeMillis() - b2 >= TimeUnit.DAYS.toMillis(1L))) {
                                if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_feed_product_template", oasisModule.nativeTemplateId) && TextUtils.equals(this.f.bj, "EXP")) {
                                    oasisModule.nativeTemplateId = "wm_search_feed_product_750";
                                }
                                if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_poi_template", oasisModule.nativeTemplateId) && TextUtils.equals(this.f.bk, ErrorCode.ERROR_TYPE_B)) {
                                    oasisModule.nativeTemplateId = "wm_search_poi_template_radical";
                                }
                                if (oasisModule.templateType == 0 && TextUtils.equals("wm_search_category_template", oasisModule.nativeTemplateId) && TextUtils.equals(this.f.bk, ErrorCode.ERROR_TYPE_B)) {
                                    oasisModule.nativeTemplateId = "wm_search_category_template_radical";
                                }
                                if (oasisModule.templateType == 0 && "wm_search_direct_card".equals(oasisModule.nativeTemplateId)) {
                                    oasisModule.templateType = i2;
                                    oasisModule.machTemplateId = "supermarket-search-business-direct";
                                }
                                if (oasisModule.templateType == i2) {
                                    if ("drug-search-normal-poi-template".equals(oasisModule.machTemplateId)) {
                                        this.f.aI = i2;
                                        oasisModule.machTemplateId = "drug-search-poi-template";
                                    }
                                    if ("drug-search-cate-poi-template".equals(oasisModule.machTemplateId)) {
                                        this.f.aI = 2;
                                        oasisModule.machTemplateId = "drug-search-poi-template";
                                    }
                                    String str = oasisModule.machTemplateId;
                                    Object[] objArr3 = new Object[i2];
                                    objArr3[z ? 1 : 0] = str;
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    Set<String> set2 = a3;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "580d01cade94962a649e4d78eb741a31", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, z, "580d01cade94962a649e4d78eb741a31");
                                    } else {
                                        if ("supermarket-drug-search-product".equals(str) || "drug-search-poi-template".equals(str) || "drug-search-noresult-rec-poi".equals(str)) {
                                            i = 1;
                                            c++;
                                        } else {
                                            i = 1;
                                        }
                                        if (!"supermarket-drug-smart-triage-guide-result".equals(str)) {
                                            b += i;
                                        }
                                    }
                                    CommonMachData a4 = com.sankuai.waimai.store.search.ui.result.mach.prerender.b.a(this.f, oasisModule, bVar, activity2, a2);
                                    if (a4 != null) {
                                        if (isCancelled()) {
                                            break;
                                        }
                                        if (!"supermarket_search_question_score_module".equalsIgnoreCase(oasisModule.moduleId) || TextUtils.isEmpty(oasisModule.stringData)) {
                                            a3 = set2;
                                        } else {
                                            Map<String, Object> a5 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
                                            a3 = set2;
                                            if (a3 != null) {
                                                try {
                                                } catch (Exception e) {
                                                    com.dianping.judas.util.a.a(e);
                                                }
                                                if (a3.contains(String.valueOf(a5.get("surveyId")))) {
                                                    i2 = 1;
                                                }
                                            }
                                            this.f.I.put(oasisModule.moduleId, "");
                                        }
                                        String str2 = oasisModule.machTemplateId;
                                        Object[] objArr4 = new Object[2];
                                        objArr4[z ? 1 : 0] = a4;
                                        objArr4[1] = str2;
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        set = a3;
                                        activity = activity2;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "995f31b05f7279b4d6f2bb16bd77abbc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "995f31b05f7279b4d6f2bb16bd77abbc");
                                        } else if (a4.mItem != null) {
                                            if (!"supermarket-drug-smart-triage-guide-result".equals(str2)) {
                                                a4.mItem.a("drug_index", Integer.valueOf(b));
                                            }
                                            if ("supermarket-drug-search-product".equals(str2) || "drug-search-poi-template".equals(str2) || "drug-search-noresult-rec-poi".equals(str2)) {
                                                a4.mItem.a("drug_item_index", Integer.valueOf(c));
                                            }
                                        }
                                        oasisModule.data = a4;
                                        this.h.add(oasisModule);
                                        this.f.H.put(oasisModule.unionId, "");
                                    } else {
                                        com.sankuai.waimai.store.util.monitor.c.a(SearchDeserializeMonitor.AsyncTaskMachPreRenderError, "template id = " + oasisModule.machTemplateId, null);
                                        oasisModule.templateType = 0;
                                        a(oasisModule, dVar);
                                        a3 = set2;
                                        i2 = 1;
                                        z = false;
                                    }
                                } else {
                                    set = a3;
                                    activity = activity2;
                                    if (oasisModule.templateType == 0) {
                                        a(oasisModule, dVar);
                                    }
                                }
                                a3 = set;
                                activity2 = activity;
                                i2 = 1;
                                z = false;
                            }
                        }
                    }
                }
            }
        }
        return this.h;
    }

    private void a(@NonNull OasisModule oasisModule, @NonNull d dVar) {
        Object[] objArr = {oasisModule, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bd65e6ef62e40cc0b195a19d99ec18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bd65e6ef62e40cc0b195a19d99ec18");
            return;
        }
        Serializable a2 = c.a(oasisModule);
        if (a2 == null || isCancelled()) {
            return;
        }
        b++;
        oasisModule.data = a2;
        this.h.add(oasisModule);
        this.f.H.put(oasisModule.unionId, "");
        if (a2 instanceof PoiEntity) {
            PoiEntity poiEntity = (PoiEntity) a2;
            a(dVar, poiEntity);
            a(poiEntity);
        }
    }

    private void a(@NonNull PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d5462434a8d65c373f3f95020969b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d5462434a8d65c373f3f95020969b9");
            return;
        }
        poiEntity.templateDetail = this.f.D;
        if (g.a == -1) {
            g.a = poiEntity.productShowType;
        }
    }

    private void a(@NonNull d dVar, @NonNull PoiEntity poiEntity) {
        Object[] objArr = {dVar, poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed772ac4b8bad7faf107d5f4fc67c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed772ac4b8bad7faf107d5f4fc67c31");
        } else if (dVar == null || dVar.a()) {
        } else {
            if (!dVar.b && poiEntity.isAccurateResult()) {
                dVar.b = true;
                JudasManualManager.b("b_g6VHz").a(a()).a();
            } else if (!dVar.d && poiEntity.isRelatedResult()) {
                dVar.d = true;
                JudasManualManager.b("b_65oN4").a(a()).a();
            } else if (dVar.c || !poiEntity.isRecommendResult()) {
            } else {
                dVar.c = true;
                JudasManualManager.b("b_j1X7u").a(a()).a();
            }
        }
    }

    private Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380de3878e13c18faf2257beea8fcc59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380de3878e13c18faf2257beea8fcc59");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qw_type_id", this.f.g);
        hashMap.put("stid", this.f.e);
        hashMap.put("keyword", this.f.h);
        hashMap.put("label_word", this.f.l);
        hashMap.put("search_log_id", this.f.q);
        hashMap.put("template_type", Integer.valueOf(this.f.D));
        hashMap.put("picture_pattern", Integer.valueOf(this.f.D == 2 ? 1 : 0));
        hashMap.put("cat_id", Integer.valueOf(this.f.z));
        hashMap.put("is_filter_result", com.sankuai.waimai.store.search.statistics.g.b(this.f));
        hashMap.put("filter_type", com.sankuai.waimai.store.search.statistics.g.d(this.f));
        hashMap.put("rank_type", Long.valueOf(com.sankuai.waimai.store.search.statistics.g.c(this.f)));
        return hashMap;
    }
}
