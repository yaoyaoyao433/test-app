package com.sankuai.waimai.business.page.home.list.future.recommend;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.list.future.model.e;
import com.sankuai.waimai.business.page.home.list.future.net.FutureApi;
import com.sankuai.waimai.business.page.home.list.future.recommend.b;
import com.sankuai.waimai.business.page.home.model.ReRankListBean;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.dynamic.g;
import com.sankuai.waimai.platform.dynamic.h;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.model.RocksResponse;
import com.sankuai.waimai.rocks.view.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    private Set<Long> A;
    private com.sankuai.waimai.business.page.common.list.ai.c B;
    private int C;
    public c c;
    public String d;
    public String e;
    public int f;
    public List<String> g;
    public List<String> h;
    public String i;
    public int j;
    public e k;
    public boolean l;
    private AlitaAutoRunManager.b m;
    private AlitaAutoRunManager.b n;
    private j<RocksResponse<com.sankuai.waimai.business.page.home.list.future.net.a>> o;
    private int p;
    private int q;
    private Map<String, Object> r;
    private int s;
    private PageFragment t;
    private int u;
    private int v;
    private long w;
    private String x;
    private com.sankuai.waimai.rocks.view.recyclerview.b y;
    private final com.sankuai.waimai.business.page.home.list.future.complex.e z;

    public static /* synthetic */ j a(a aVar, j jVar) {
        aVar.o = null;
        return null;
    }

    public static /* synthetic */ void a(a aVar, final Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "30d291d77bee0e7211ca8b9975de2109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "30d291d77bee0e7211ca8b9975de2109");
        } else if ((aVar.o != null && !aVar.o.isUnsubscribed()) || com.sankuai.waimai.platform.model.c.a().b() == 1 || aVar.l) {
        } else {
            d<RocksResponse<com.sankuai.waimai.business.page.home.list.future.net.a>> interactiveCardData = ((FutureApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FutureApi.class)).getInteractiveCardData(map);
            aVar.o = new b.AbstractC1042b<RocksResponse<com.sankuai.waimai.business.page.home.list.future.net.a>>() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.6
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    RocksResponse rocksResponse = (RocksResponse) obj;
                    Object[] objArr2 = {rocksResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a26762b48d8e8c7251e27c0c9434f55b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a26762b48d8e8c7251e27c0c9434f55b");
                        return;
                    }
                    a.a(a.this, (j) null);
                    if (rocksResponse.code != 0 || rocksResponse.data == 0) {
                        onError(null);
                        return;
                    }
                    com.sankuai.waimai.business.page.common.list.ai.a a2 = com.sankuai.waimai.business.page.common.list.ai.a.a();
                    String str = ((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).a;
                    Object[] objArr3 = {0, str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.list.ai.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1f05d9f88eb8fe007b8da6757b573618", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1f05d9f88eb8fe007b8da6757b573618");
                    } else {
                        a2.a(0, str, "");
                    }
                    if (((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).b != null) {
                        if ((a.this.v <= a.this.u || a.this.u == 0) && a.a(a.this, ((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).b)) {
                            a.AbstractC1040a a3 = new com.sankuai.waimai.business.page.common.log.a().a("Future_Alita_Executor_interactive_request");
                            StringBuilder sb = new StringBuilder("mClickedPoiIdStr:");
                            sb.append(a.this.e);
                            sb.append(",clickedPoiId:");
                            sb.append(a.this.d);
                            sb.append(",intent_type:");
                            sb.append(a.this.p);
                            sb.append(",rankTraceId:");
                            sb.append(a.this.i);
                            sb.append(",alitaPoiId");
                            sb.append(a.this.w);
                            sb.append(",mMachCustomMap:");
                            sb.append(a.this.r != null ? a.this.r.get("rank_trace_id") : "mMachCustomMap 为空");
                            i.b(a3.d(sb.toString()).b());
                            long a4 = a.this.a(((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).b);
                            if (a4 != 0 && !a.this.A.contains(Long.valueOf(a4))) {
                                a.t(a.this);
                            }
                            ListIDHelper.a.a.a("page", k.g, (String) map.get("rank_list_id"));
                            final c cVar = a.this.c;
                            int i = a.this.f;
                            final RocksServerModel rocksServerModel = ((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).b;
                            int i2 = a.this.q;
                            DynamicCardStatisticsBean c = a.c(a.this, ((com.sankuai.waimai.business.page.home.list.future.net.a) rocksResponse.data).b);
                            boolean z = a.this.l;
                            Object[] objArr4 = {Integer.valueOf(i), rocksServerModel, Integer.valueOf(i2), c, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = c.a;
                            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "7c1e6b6cf0467590b2ac7bbbea19fd25", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "7c1e6b6cf0467590b2ac7bbbea19fd25");
                                return;
                            }
                            cVar.g = z;
                            cVar.h = i2;
                            cVar.l = c;
                            cVar.i = i;
                            switch (i2) {
                                case 1:
                                    Object[] objArr5 = {rocksServerModel};
                                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "f30b563dffd86a55d01808e505c14952", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "f30b563dffd86a55d01808e505c14952");
                                        return;
                                    }
                                    int i3 = cVar.i;
                                    a.b bVar = new a.b() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.4
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.rocks.view.a.b
                                        public final void a(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
                                            Object[] objArr6 = {eVar};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c19c3c4d46d0ff81788bcdf1c3f34bba", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c19c3c4d46d0ff81788bcdf1c3f34bba");
                                            } else if (eVar == null) {
                                                cVar.a();
                                            } else {
                                                cVar.m = eVar;
                                            }
                                        }

                                        @Override // com.sankuai.waimai.rocks.view.a.b
                                        public final void a() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cace7638387c17a5a321770f71ce239b", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cace7638387c17a5a321770f71ce239b");
                                            } else {
                                                cVar.a();
                                            }
                                        }
                                    };
                                    Object[] objArr6 = {Integer.valueOf(i3), rocksServerModel, bVar};
                                    ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                    if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "a8c48d8db9e866060b798f5cafa325a7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "a8c48d8db9e866060b798f5cafa325a7");
                                        return;
                                    } else if (rocksServerModel == null) {
                                        bVar.a();
                                        return;
                                    } else {
                                        int a5 = cVar.a(i3);
                                        if (a5 <= 0) {
                                            bVar.a();
                                            return;
                                        }
                                        rocksServerModel.stringData = cVar.a(rocksServerModel, cVar.l);
                                        boolean d = cVar.c.d.h.d();
                                        if (d) {
                                            a5--;
                                        }
                                        cVar.c.a(rocksServerModel, a5, d, bVar);
                                        return;
                                    }
                                case 2:
                                    Object[] objArr7 = {rocksServerModel};
                                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                    if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect7, false, "bdeaaa23ea9f34d46946a0ab2caf5f85", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect7, false, "bdeaaa23ea9f34d46946a0ab2caf5f85");
                                        return;
                                    } else if (cVar.d == null || cVar.d.F == null || cVar.d.F.isDestroyed() || rocksServerModel == null || cVar.d.getContext() == null || cVar.e == null || cVar.e.g() == null) {
                                        return;
                                    } else {
                                        com.sankuai.waimai.platform.dynamic.j jVar = new com.sankuai.waimai.platform.dynamic.j(rocksServerModel.templateId, rocksServerModel.templatePhId, cVar.a(rocksServerModel, cVar.l));
                                        jVar.b("c_m84bv26");
                                        jVar.c(rocksServerModel.moduleId);
                                        if (jVar.c().booleanValue()) {
                                            final g gVar = new g(new com.meituan.android.cube.pga.core.a(cVar.d.getContext()));
                                            int max = Math.max(cVar.e.g().getWidth(), 0);
                                            int max2 = Math.max(cVar.e.g().getHeight(), 0);
                                            gVar.w = max;
                                            gVar.x = max2;
                                            gVar.a(new h() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.5
                                                public static ChangeQuickRedirect a;

                                                @Override // com.sankuai.waimai.platform.dynamic.h
                                                public final void a(int i4, int i5) {
                                                    Object[] objArr8 = {Integer.valueOf(i4), Integer.valueOf(i5)};
                                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2b6e4d5e9c44fbe7a6df7e7393db6a35", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2b6e4d5e9c44fbe7a6df7e7393db6a35");
                                                        return;
                                                    }
                                                    gVar.b((h) this);
                                                    b bVar2 = cVar.q;
                                                    Object[] objArr9 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect9 = b.a;
                                                    if (PatchProxy.isSupport(objArr9, bVar2, changeQuickRedirect9, false, "3cd69c41689721d6fd8f1214a6f685dc", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr9, bVar2, changeQuickRedirect9, false, "3cd69c41689721d6fd8f1214a6f685dc");
                                                    } else {
                                                        i.c(new b.a().a(b.b).b(b.c).c(b.c).a(true).b());
                                                    }
                                                    cVar.f = gVar;
                                                }

                                                @Override // com.sankuai.waimai.platform.dynamic.h
                                                public final void a() {
                                                    Object[] objArr8 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "82933bcdd82dc5f369d02f6ebda999af", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "82933bcdd82dc5f369d02f6ebda999af");
                                                        return;
                                                    }
                                                    gVar.b((h) this);
                                                    b bVar2 = cVar.q;
                                                    String str2 = rocksServerModel.templateId;
                                                    Object[] objArr9 = {str2};
                                                    ChangeQuickRedirect changeQuickRedirect9 = b.a;
                                                    if (PatchProxy.isSupport(objArr9, bVar2, changeQuickRedirect9, false, "f1062cf8d84a42ee48c1beb4a3f2f0f4", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr9, bVar2, changeQuickRedirect9, false, "f1062cf8d84a42ee48c1beb4a3f2f0f4");
                                                        return;
                                                    }
                                                    a.AbstractC1040a c2 = new b.a().a(b.b).b(b.d).c(b.d);
                                                    i.d(c2.d("machTemplateId : " + str2).a(true).b());
                                                }
                                            });
                                            gVar.a(jVar);
                                            return;
                                        }
                                        return;
                                    }
                                default:
                                    return;
                            }
                        }
                        return;
                    }
                    onError(null);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7442e784c4a2233a879e452b617d83d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7442e784c4a2233a879e452b617d83d");
                        return;
                    }
                    a.a(a.this, (j) null);
                    a.this.b();
                }
            };
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(interactiveCardData, aVar.o, aVar.t.q());
        }
    }

    public static /* synthetic */ void a(a aVar, final JSONObject jSONObject) {
        int i = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b40d74c0d183b3c136004d5943dfe538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b40d74c0d183b3c136004d5943dfe538");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("trace_id", (String) aVar.r.get("rank_trace_id"));
            jSONObject2.put("current_data_id", aVar.k == null ? "" : aVar.k.a);
            if (aVar.k != null) {
                i = aVar.k.b;
            }
            jSONObject2.put("current_index", i);
            jSONObject2.put("front_data_ids", aVar.k == null ? "" : aVar.k.c);
            jSONObject2.put("behind_data_ids", aVar.k == null ? "" : aVar.k.d);
            jSONObject2.put("intention_type", aVar.p);
            com.sankuai.waimai.alita.platform.a.a().a("alita_waimai-rank-novelty-rt-feature-consume", Collections.singletonList(jSONObject2), new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr2 = {str, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4658367d4e4b7a3dc292a54a999e3ed9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4658367d4e4b7a3dc292a54a999e3ed9");
                    } else if (alitaJSValue == null) {
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject(alitaJSValue.stringValue()).getJSONObject("data").getJSONObject("data");
                            jSONObject3.put("exp_info", jSONObject);
                            Map b2 = a.b(a.this, ListIDHelper.a.a.a());
                            if (b2 == null) {
                                return;
                            }
                            b2.put("behavioral_characteristics", jSONObject3);
                            a.a(a.this, b2);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "785997cf9449c1851aa9881d5b4df18d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "785997cf9449c1851aa9881d5b4df18d");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.a(exc);
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ boolean a(a aVar, RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "31dc9d94f2489f638b8f41635a5b87fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "31dc9d94f2489f638b8f41635a5b87fe")).booleanValue() : (rocksServerModel == null || TextUtils.isEmpty(rocksServerModel.stringData)) ? false : true;
    }

    public static /* synthetic */ Map b(a aVar, String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5ad00b5cd3cd8a4461f0eb6f40dd706d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5ad00b5cd3cd8a4461f0eb6f40dd706d");
        }
        if (CollectionUtils.isEmpty(aVar.g) || aVar.p == -1) {
            return null;
        }
        String str3 = "";
        WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
        if (k != null && k.hasAddress()) {
            str3 = k.getAddress();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id_list", com.sankuai.waimai.foundation.utils.k.a().toJson(aVar.g));
        hashMap.put("ad_data_ids", com.sankuai.waimai.foundation.utils.k.a().toJson(aVar.h));
        if (aVar.w != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.w);
            str2 = sb.toString();
        } else {
            str2 = aVar.d;
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("poi_id", str2);
        }
        hashMap.put("intent_type", Integer.valueOf(aVar.p));
        hashMap.put("bizTraceId", aVar.i);
        hashMap.put("rank_list_id", str);
        hashMap.put("address_plaintext", str3);
        hashMap.put("trigger_scene", 0);
        return hashMap;
    }

    public static /* synthetic */ DynamicCardStatisticsBean c(a aVar, RocksServerModel rocksServerModel) {
        String str;
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "846978078857ff66b25f8002f67000a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicCardStatisticsBean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "846978078857ff66b25f8002f67000a5");
        }
        DynamicCardStatisticsBean dynamicCardStatisticsBean = new DynamicCardStatisticsBean();
        String a2 = ListIDHelper.a.a.a("page", k.g);
        dynamicCardStatisticsBean.cardIntentType = aVar.p;
        dynamicCardStatisticsBean.cardListId = a2;
        dynamicCardStatisticsBean.rankTraceId = (String) aVar.r.get("rank_trace_id");
        dynamicCardStatisticsBean.rankListId = (String) aVar.r.get("rank_list_id");
        dynamicCardStatisticsBean.refIndex = aVar.q == 1 ? aVar.j + 1 : aVar.j;
        dynamicCardStatisticsBean.refPoiIdStr = !TextUtils.isEmpty(aVar.x) ? aVar.x : aVar.e;
        if (aVar.w != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.w);
            str = sb.toString();
        } else {
            str = aVar.d;
        }
        dynamicCardStatisticsBean.refPoiId = str;
        if (aVar.k != null) {
            dynamicCardStatisticsBean.triggerPoiIndex = aVar.k.b;
        }
        if (rocksServerModel != null) {
            dynamicCardStatisticsBean.dataId = rocksServerModel.dataId;
        }
        return dynamicCardStatisticsBean;
    }

    public static /* synthetic */ int t(a aVar) {
        int i = aVar.v;
        aVar.v = i + 1;
        return i;
    }

    public a(com.sankuai.waimai.rocks.view.a aVar, com.sankuai.waimai.business.page.common.list.ai.c cVar, Map<String, Object> map, PageFragment pageFragment, com.sankuai.waimai.business.page.home.list.future.complex.e eVar) {
        int i;
        Object[] objArr = {aVar, cVar, map, pageFragment, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a7c63cdcd4bf11d731d86a632da71b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a7c63cdcd4bf11d731d86a632da71b");
            return;
        }
        this.p = -1;
        this.d = "";
        this.f = -1;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = "";
        this.q = 1;
        this.u = 0;
        this.v = 0;
        this.A = new HashSet();
        this.c = new c(aVar, cVar, eVar, pageFragment);
        this.r = map;
        this.t = pageFragment;
        this.z = eVar;
        this.B = cVar;
        this.y = aVar.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67312d5f5ebd539d26a5dab526c27530", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67312d5f5ebd539d26a5dab526c27530");
        } else {
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").a("alita_waimai-rank-edge-rerank-recall", new AlitaAutoRunManager.d() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.d
                public final Map<String, ?> a(com.sankuai.waimai.alita.core.event.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "577f5df06c12095afda6df4c8b0bfaf3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "577f5df06c12095afda6df4c8b0bfaf3");
                    }
                    String str = "";
                    WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
                    if (k != null && k.hasAddress()) {
                        str = k.getAddress();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("module_list", com.sankuai.waimai.foundation.utils.k.a().toJson(com.sankuai.waimai.business.page.home.list.future.complex.d.a().e));
                    hashMap.put("rank_list_id", a.this.r.get("rank_list_id"));
                    hashMap.put("rank_trace_id", a.this.r.get("rank_trace_id"));
                    hashMap.put("fact_offset", Integer.valueOf(a.this.z.b()));
                    hashMap.put("seq_num", Integer.valueOf(a.this.z.b + 1));
                    hashMap.put("realtime_feature_in_string", com.sankuai.waimai.business.page.common.list.ai.a.a().b());
                    hashMap.put("address_plaintext", str);
                    hashMap.put("ad_data_ids", com.sankuai.waimai.foundation.utils.k.a().toJson(a.this.B.c()));
                    return hashMap;
                }
            });
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").a("alita_waimai-rank-edge-rerank-predict", new AlitaAutoRunManager.d() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.d
                public final Map<String, ?> a(com.sankuai.waimai.alita.core.event.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc334374a388ac1ec6771701f56de700", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc334374a388ac1ec6771701f56de700");
                    }
                    String str = a.b;
                    com.sankuai.waimai.foundation.utils.log.a.b(str, "端上重排脚本onPreRun：" + aVar2, new Object[0]);
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int c = a.this.c.c();
                    if (a.this.y.u() <= c) {
                        return null;
                    }
                    for (int u = a.this.y.u() - c; u < a.this.y.u(); u++) {
                        arrayList.add(a.this.y.G().o.get(u).s.e);
                    }
                    for (int max = Math.max((a.this.y.u() - c) - 4, 0); max < a.this.y.u() - c; max++) {
                        arrayList2.add(a.this.y.G().o.get(max).s.e);
                    }
                    a.this.C = a.this.z.b;
                    hashMap.put("rerank_candidates", arrayList);
                    hashMap.put("above_list", arrayList2);
                    hashMap.put("rank_trace_id", a.this.r.get("rank_trace_id"));
                    hashMap.put("start_index", Integer.valueOf(a.this.c.b()));
                    return hashMap;
                }
            });
            i = 0;
        }
        Object[] objArr3 = new Object[i];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "73c063ca924f39c6d595341d2259a3d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "73c063ca924f39c6d595341d2259a3d5");
            return;
        }
        this.n = new AlitaAutoRunManager.b() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.3
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
            public final void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                RocksServerModel a2;
                Object[] objArr4 = {str, str2, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6f23b16ac6008052c405b66285fcac97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6f23b16ac6008052c405b66285fcac97");
                    return;
                }
                super.b(str, str2, alitaJSValue);
                String str3 = a.b;
                StringBuilder sb = new StringBuilder("重排结果回调：");
                sb.append(alitaJSValue != null ? alitaJSValue.stringValue() : "");
                com.sankuai.waimai.foundation.utils.log.a.b(str3, sb.toString(), new Object[0]);
                if (alitaJSValue == null || a.this.z.b != a.this.C) {
                    com.sankuai.waimai.foundation.utils.log.a.e(a.b, "alitaReRankObserver 结果不符合要求舍弃", new Object[0]);
                } else if (a.this.l) {
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(alitaJSValue.stringValue());
                        int optInt = jSONObject.optInt("code");
                        ReRankListBean reRankListBean = (ReRankListBean) com.sankuai.waimai.foundation.utils.k.a().fromJson(jSONObject.optString("data"), (Class<Object>) ReRankListBean.class);
                        if (optInt == 0 && reRankListBean != null) {
                            if (reRankListBean.isReRank) {
                                final c cVar2 = a.this.c;
                                Object[] objArr5 = {reRankListBean};
                                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "7b6692b07f153efeac45a6a105b27195", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "7b6692b07f153efeac45a6a105b27195");
                                } else if (reRankListBean != null && reRankListBean.reRankResult != null && !com.sankuai.waimai.modular.utils.a.a(reRankListBean.reRankResult.resList) && (a2 = com.sankuai.waimai.business.page.home.list.future.complex.d.a().a(reRankListBean, cVar2.n.b)) != null && !com.sankuai.waimai.modular.utils.a.a(a2.moduleList)) {
                                    int c = cVar2.c();
                                    if (c >= a2.moduleList.size()) {
                                        c = a2.moduleList.size();
                                    }
                                    if (c >= a2.moduleList.size()) {
                                        cVar2.c.a(a2, false, true, true, true, c, new a.c() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.6
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.rocks.view.a.c
                                            public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
                                            }

                                            @Override // com.sankuai.waimai.rocks.view.a.c
                                            public final void a() {
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3740f7ec549f57dd9a21fa5078040e18", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3740f7ec549f57dd9a21fa5078040e18");
                                                    return;
                                                }
                                                com.sankuai.waimai.business.page.home.list.future.complex.d.a().h = true;
                                                if (!com.sankuai.waimai.foundation.core.a.b() || cVar2.d == null || cVar2.d.getContext() == null) {
                                                    return;
                                                }
                                                ae.a(cVar2.d.getContext(), "端上重排成功");
                                            }

                                            @Override // com.sankuai.waimai.rocks.view.a.c
                                            public final void b() {
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fa851074600cf08e9d9c445b41362e98", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fa851074600cf08e9d9c445b41362e98");
                                                } else {
                                                    com.sankuai.waimai.foundation.utils.log.a.e(c.b, "mixRocksServerModel render error", new Object[0]);
                                                }
                                            }
                                        });
                                    } else {
                                        com.sankuai.waimai.business.page.home.list.future.complex.d.a().g = null;
                                        com.sankuai.waimai.foundation.utils.log.a.e(c.b, "最大曝光位置大于初始计算位置，曝光数量发生变化结果丢弃-用户发生滑动或非本次回调触发", new Object[0]);
                                    }
                                }
                            }
                            if (!reRankListBean.isTrack || reRankListBean.reRankResult == null) {
                                return;
                            }
                            JudasManualManager.b("b_waimai_vdmsau38_mv", "c_m84bv26", AppUtil.generatePageInfoKey(a.this.t)).a("intent_type", 11).a("biz_trace_id", reRankListBean.bizTraceId).a("edge_trace_id", reRankListBean.reRankResult.edgeTraceId).a("rank_ext", com.sankuai.waimai.foundation.utils.k.a().toJson(reRankListBean.reRankResult.resList)).a();
                            HashMap hashMap = new HashMap();
                            hashMap.put("user_feat", reRankListBean.reRankResult.userFeat);
                            hashMap.put("rank_ctx", reRankListBean.reRankResult.rankCtx);
                            JudasManualManager.b("b_waimai_vdmsau38_mv", "c_m84bv26", AppUtil.generatePageInfoKey(a.this.t)).a("intent_type", 11).a("biz_trace_id", reRankListBean.bizTraceId).a("edge_trace_id", reRankListBean.reRankResult.edgeTraceId).a("rank_ext", com.sankuai.waimai.foundation.utils.k.a().toJson(hashMap)).a();
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
            public final void b(@NonNull String str, @Nullable Exception exc) {
                Object[] objArr4 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "acf0dae5de13b9f6613d615f3f6b3a3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "acf0dae5de13b9f6613d615f3f6b3a3a");
                } else {
                    super.b(str, exc);
                }
            }
        };
        com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").a("alita_waimai-rank-edge-rerank-predict", this.n);
        this.m = new AlitaAutoRunManager.b() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.a.4
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
            public final void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                com.sankuai.waimai.alita.core.jsexecutor.model.a a2;
                Object[] objArr4 = {str, str2, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa816314036a33cd6c27da38797ab4ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa816314036a33cd6c27da38797ab4ab");
                } else if (a.this.l || (a2 = com.sankuai.waimai.alita.core.jsexecutor.model.a.a(alitaJSValue)) == null || !TextUtils.equals(a2.f, "alita_waimai_rule_engine_home_list_recommend") || a2.b == null || a2.g == null || a.this.t == null || !a.this.t.isAdded()) {
                } else {
                    a.this.p = a2.b.optInt("intent_type");
                    a.this.w = a2.b.optLong("poi_id");
                    a.this.x = a2.b.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    a.this.q = a2.g.optInt("interaction_mode");
                    a.this.s = a2.g.optInt("is_request");
                    a.this.u = a2.g.optInt("max_exposedCard");
                    JudasManualManager.b("b_waimai_vdmsau38_mv", "c_m84bv26", AppUtil.generatePageInfoKey(a.this.t)).a("intent_type", a.this.p).a(RollSearchKeyword.TRIGGER_POI_ID, a.this.w).a("trigger_poi_id_str", a.this.x).a("trigger_poi_index", a.this.k != null ? a.this.k.b : 0).a();
                    if (a.this.s == 1) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("scene_name", "alita_waimai_rule_engine");
                            jSONObject.put("exp_group_name", a2.f);
                            jSONObject.put("exp_name", a2.h.optString("exp_key"));
                            jSONObject.put("rule_id", a2.c);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        a.a(a.this, jSONObject);
                    }
                }
            }
        };
        com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").a("alita_waimai-alita-alita-rule-engine", this.m);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d334bd58de0a298d1bebdadb72f04d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d334bd58de0a298d1bebdadb72f04d");
            return;
        }
        if (this.m != null) {
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").b("alita_waimai-alita-alita-rule-engine", this.m);
        }
        if (this.n != null) {
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").b("alita_waimai-rank-edge-rerank-predict", this.n);
        }
        com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").b("alita_waimai-rank-edge-rerank-recall");
        com.sankuai.waimai.alita.core.event.autorunner.c.a().b("waimai").b("alita_waimai-rank-edge-rerank-predict");
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1901a87011662eaa82d1c450f2565d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1901a87011662eaa82d1c450f2565d96");
        } else if (this.o != null) {
            this.o.unsubscribe();
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(RocksServerModel rocksServerModel) {
        long optLong;
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b394d12801573f356e874d5c74c4471b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b394d12801573f356e874d5c74c4471b")).longValue();
        }
        if (rocksServerModel == null) {
            return 0L;
        }
        try {
            optLong = new JSONObject(rocksServerModel.stringData).optLong("poi_id");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        if (optLong != 0) {
            return optLong;
        }
        return 0L;
    }
}
