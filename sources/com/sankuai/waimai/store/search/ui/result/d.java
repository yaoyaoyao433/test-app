package com.sankuai.waimai.store.search.ui.result;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.search.data.e;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.c;
import com.sankuai.waimai.store.search.ui.result.datamarket.StoreSearchChainErrorType;
import com.sankuai.waimai.store.search.ui.result.datamarket.StoreSearchChainExpErrorType;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchDeserializeMonitor;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchMachMonitor;
import com.sankuai.waimai.store.util.ac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements e.a, c.a {
    public static ChangeQuickRedirect a;
    private static final int b = Runtime.getRuntime().availableProcessors();
    private c.b c;
    private SearchShareData d;
    private com.sankuai.waimai.store.search.ui.actionbar.b e;
    private boolean f;
    private com.sankuai.waimai.store.search.data.e g;
    private k h;
    private com.sankuai.waimai.store.search.ui.result.mach.process.b i;
    private boolean j;
    private final boolean k;

    public static /* synthetic */ void a(d dVar, final GlobalPageResponse globalPageResponse, final MetricsSpeedMeterTask metricsSpeedMeterTask, final MetricsSpeedMeterTask metricsSpeedMeterTask2, final MetricsSpeedMeterTask metricsSpeedMeterTask3) {
        Object[] objArr = {globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, metricsSpeedMeterTask3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "31af2fe836f1b37bdbcd564eb0ad2d6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "31af2fe836f1b37bdbcd564eb0ad2d6a");
        } else if (globalPageResponse != null && !com.sankuai.shangou.stone.util.a.b(globalPageResponse.moduleList)) {
            int a2 = com.sankuai.shangou.stone.util.a.a((List) globalPageResponse.moduleList);
            int max = Math.max(b - 1, 2);
            int ceil = (int) Math.ceil(a2 / (max * 1.0d));
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < max; i++) {
                int i2 = i * ceil;
                if (i2 >= a2) {
                    break;
                }
                List a3 = com.sankuai.shangou.stone.util.a.a(globalPageResponse.moduleList, i2, i2 + ceil);
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a3)) {
                    linkedList.add(a3);
                }
            }
            ArrayList arrayList = new ArrayList();
            int a4 = com.sankuai.shangou.stone.util.a.a((List) linkedList);
            for (int i3 = 0; i3 < a4; i3++) {
                final List list = (List) com.sankuai.shangou.stone.util.a.a((List<Object>) linkedList, i3);
                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                    arrayList.add(rx.d.a((d.a) new d.a<List<OasisModule>>() { // from class: com.sankuai.waimai.store.search.ui.result.d.5
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Object obj) {
                            j jVar = (j) obj;
                            Object[] objArr2 = {jVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ff9e6b471e6df5f0c44520abd18fd4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ff9e6b471e6df5f0c44520abd18fd4");
                                return;
                            }
                            int a5 = com.sankuai.shangou.stone.util.a.a(list);
                            for (int i4 = 0; i4 < a5; i4++) {
                                OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i4);
                                if (oasisModule != null) {
                                    com.sankuai.waimai.store.search.data.c.a(oasisModule, d.this.d, d.this.c.r(), d.this.k);
                                }
                            }
                            jVar.onNext(list);
                        }
                    }).b(rx.schedulers.a.e()));
                }
            }
            dVar.h = rx.d.a((Iterable<? extends rx.d<?>>) arrayList, new rx.functions.k<List<OasisModule>>() { // from class: com.sankuai.waimai.store.search.ui.result.d.8
                @Override // rx.functions.k
                public final /* bridge */ /* synthetic */ List<OasisModule> call(Object[] objArr2) {
                    return null;
                }
            }).a(rx.android.schedulers.a.a()).a(new rx.functions.b<List<OasisModule>>() { // from class: com.sankuai.waimai.store.search.ui.result.d.6
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(List<OasisModule> list2) {
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d46a2f5f71c48abf001dbceb7f0b22d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d46a2f5f71c48abf001dbceb7f0b22d");
                        return;
                    }
                    metricsSpeedMeterTask.recordStep("two_thread_deserialize_finish");
                    h.a(metricsSpeedMeterTask);
                    metricsSpeedMeterTask.disable();
                    if (d.this.d.ay && metricsSpeedMeterTask2 != null) {
                        metricsSpeedMeterTask2.recordStep("executor_finish");
                        h.a(metricsSpeedMeterTask2);
                    }
                    if (metricsSpeedMeterTask3 != null) {
                        metricsSpeedMeterTask3.recordStep("whole_first_screen_finish");
                        h.a(metricsSpeedMeterTask3);
                    }
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) globalPageResponse.moduleList) && globalPageResponse.globalSearchExtraInfo != null && !t.a(globalPageResponse.globalSearchExtraInfo.searchLogId)) {
                        for (OasisModule oasisModule : globalPageResponse.moduleList) {
                            d.this.d.a(oasisModule.data, globalPageResponse.globalSearchExtraInfo.searchLogId);
                        }
                    }
                    com.sankuai.waimai.store.search.ui.result.datamarket.d.a().a(globalPageResponse.moduleList, d.this.d);
                    d.this.c.a(globalPageResponse.moduleList, 0);
                }
            }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.store.search.ui.result.d.7
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9ce5835ee33f10499b1e410570784c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9ce5835ee33f10499b1e410570784c7");
                        return;
                    }
                    SearchDeserializeMonitor searchDeserializeMonitor = SearchDeserializeMonitor.ExecutorDeserializeError;
                    com.sankuai.waimai.store.util.monitor.c.a(searchDeserializeMonitor, "throwable = " + th2, th2.getMessage());
                }
            });
        }
    }

    public d(c.b bVar, final SearchShareData searchShareData) {
        Object[] objArr = {bVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a5a8ae183dc29a14a66113de9d37d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a5a8ae183dc29a14a66113de9d37d5");
            return;
        }
        this.c = bVar;
        this.d = searchShareData;
        this.f = i.h().a("global_search_two_thread_deserialize/stop_two_thread_deserialize", false);
        this.j = i.h().a("search_first_screen_speed_loading/first_screen_speed_loading", true);
        this.d.aP = i.h().a("search_mach_expose_immediately/expose_immediately", true);
        this.k = i.h().a("search_mach_transform_to_native/transform", true);
        this.d.aV = i.h().a("store_search_crash/use_post", 1);
        this.i = new com.sankuai.waimai.store.search.ui.result.mach.process.b(this.d, this.c.r(), this.k, new com.sankuai.waimai.store.search.ui.result.mach.process.a() { // from class: com.sankuai.waimai.store.search.ui.result.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.search.ui.result.mach.process.a
            public final void a(List<OasisModule> list, int i) {
                Object[] objArr2 = {list, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fcb22621241775baa24253af6a4f5ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fcb22621241775baa24253af6a4f5ef");
                    return;
                }
                if (i == 1 && searchShareData != null) {
                    com.sankuai.waimai.store.search.ui.result.datamarket.d.a().a(list, searchShareData);
                    searchShareData.aQ = MetricsSpeedMeterTask.createCustomSpeedMeterTask("search_mach_render_span");
                    if (!d.this.d.aP) {
                        searchShareData.aT = true;
                        searchShareData.aU = true;
                    }
                }
                d.this.c.a(list, i);
                if (i == 1) {
                    d.this.c.c();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void a(com.sankuai.waimai.store.search.ui.actionbar.b bVar) {
        this.e = bVar;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db9ad573e256f770fce532ea8a16ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db9ad573e256f770fce532ea8a16ad7");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.d.aq);
        for (int i = 0; i < a2; i++) {
            GuidedItem guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d.aq, i);
            if (guidedItem != null) {
                guidedItem.isSelected = false;
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8166a1113499e47d55df72e4ef8942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8166a1113499e47d55df72e4ef8942");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "97462f17dc8e79505f555d7ae0577672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "97462f17dc8e79505f555d7ae0577672");
        } else {
            gVar.b = false;
            gVar.c = false;
            gVar.r = true;
            gVar.d = true;
            gVar.e = true;
            gVar.f = true;
            gVar.g = true;
            gVar.h = true;
            gVar.i = true;
            gVar.j = true;
            gVar.k = true;
            gVar.l = true;
            gVar.m = false;
            gVar.n = true;
            gVar.o = true;
            gVar.p = true;
            gVar.q = true;
        }
        this.d.bt = -1;
        this.d.ax = true;
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7f62af6d5d737fe581b71a28cb5a22e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7f62af6d5d737fe581b71a28cb5a22e");
        } else {
            if (this.d.av != -1) {
                if (i == 17) {
                    this.d.av = 3;
                } else if (i == 19) {
                    this.d.av = 2;
                } else if (i == 30) {
                    this.d.av = 1;
                }
            }
            this.d.av = 0;
        }
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 27:
            case 28:
            case 29:
            case 32:
                return;
            case 4:
            case 8:
            case 12:
            case 20:
            case 23:
            case 24:
            case 26:
            case 31:
            case 33:
            case 34:
            default:
                return;
            case 5:
                gVar.c = true;
                return;
            case 6:
                this.d.ax = false;
                gVar.b = true;
                gVar.e = false;
                gVar.f = false;
                gVar.g = false;
                gVar.i = false;
                gVar.j = false;
                gVar.k = false;
                gVar.l = false;
                gVar.h = false;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                gVar.q = false;
                gVar.r = false;
                return;
            case 7:
            case 14:
            case 15:
            case 17:
                gVar.e = false;
                gVar.f = false;
                gVar.g = false;
                gVar.i = false;
                gVar.k = false;
                gVar.h = false;
                gVar.m = true;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                gVar.q = false;
                gVar.r = false;
                return;
            case 9:
                gVar.e = false;
                gVar.f = false;
                gVar.g = false;
                gVar.d = false;
                gVar.k = false;
                gVar.i = false;
                gVar.h = false;
                return;
            case 10:
                gVar.e = false;
                gVar.f = false;
                gVar.g = false;
                gVar.d = false;
                gVar.i = false;
                gVar.h = false;
                return;
            case 11:
                gVar.i = false;
                return;
            case 13:
                gVar.e = true;
                gVar.d = true;
                gVar.k = false;
                gVar.i = false;
                return;
            case 16:
                gVar.f = false;
                gVar.g = false;
                gVar.d = false;
                gVar.k = false;
                gVar.i = false;
                gVar.h = false;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                gVar.r = false;
                return;
            case 18:
                this.d.bt = MapConstant.LayerPropertyFlag_MarkerAvoidScreen;
                gVar.d = false;
                return;
            case 19:
                gVar.e = true;
                gVar.f = false;
                gVar.i = false;
                gVar.k = false;
                gVar.m = true;
                return;
            case 21:
                gVar.i = false;
                gVar.g = false;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                return;
            case 22:
                gVar.i = false;
                gVar.f = false;
                gVar.g = false;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                return;
            case 25:
            case 35:
                gVar.h = false;
                gVar.i = false;
                gVar.n = false;
                gVar.o = false;
                gVar.p = false;
                gVar.r = false;
                return;
            case 30:
                gVar.d = false;
                gVar.e = true;
                gVar.f = false;
                gVar.i = false;
                gVar.k = false;
                gVar.m = true;
                gVar.q = false;
                return;
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f2231d1df945d0414e5b5b198a6267", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f2231d1df945d0414e5b5b198a6267");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.d.at.entrySet()) {
            List<String> value = entry.getValue();
            if (!com.sankuai.shangou.stone.util.a.b(value)) {
                HashMap hashMap = new HashMap();
                hashMap.put("cpv_key", entry.getKey());
                hashMap.put("cpv_value", t.a(value, CommonConstant.Symbol.COMMA));
                arrayList.add(hashMap);
            }
        }
        return com.sankuai.waimai.store.util.i.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0477  */
    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r49, int r50, int r51, final boolean r52, boolean r53, java.lang.String r54, java.lang.String r55, int r56, long r57, int r59, final boolean r60, java.lang.String r61, final com.meituan.metrics.speedmeter.MetricsSpeedMeterTask r62, int r63, long r64) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.d.a(java.lang.String, int, int, boolean, boolean, java.lang.String, java.lang.String, int, long, int, boolean, java.lang.String, com.meituan.metrics.speedmeter.MetricsSpeedMeterTask, int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.meituan.metrics.speedmeter.MetricsSpeedMeterTask] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.meituan.metrics.speedmeter.MetricsSpeedMeterTask] */
    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void a(GlobalPageResponse globalPageResponse, MetricsSpeedMeterTask metricsSpeedMeterTask, boolean z) {
        MetricsSpeedMeterTask metricsSpeedMeterTask2;
        Object[] objArr = {globalPageResponse, metricsSpeedMeterTask, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb7faa04fb61f7e124462d51e094ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb7faa04fb61f7e124462d51e094ba4");
            return;
        }
        com.sankuai.waimai.store.search.ui.result.datamarket.d a2 = com.sankuai.waimai.store.search.ui.result.datamarket.d.a();
        List<OasisModule> list = globalPageResponse.moduleList;
        SearchShareData searchShareData = this.d;
        Object[] objArr2 = {list, searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.result.datamarket.d.a;
        final String str = null;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "574448dc9132bb23188a8458607474e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "574448dc9132bb23188a8458607474e2");
        } else if (a2.d) {
            com.sankuai.waimai.store.search.ui.result.datamarket.c a3 = com.sankuai.waimai.store.search.ui.result.datamarket.c.a();
            boolean a4 = a2.a(searchShareData);
            Object[] objArr3 = {list, Byte.valueOf(a4 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.ui.result.datamarket.c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "fe437b66909c033edd7a9d461575c912", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "fe437b66909c033edd7a9d461575c912");
            } else if (a3.a(list)) {
                String str2 = a4 ? DefaultHeaderService.KEY_DRUG : DefaultHeaderService.KEY_STORE;
                if (a3.f) {
                    a3.f = false;
                    com.sankuai.waimai.store.util.monitor.c.b(StoreSearchChainErrorType.ProcessStart, null, str2 + "qv");
                }
                com.sankuai.waimai.store.util.monitor.c.b(StoreSearchChainErrorType.ProcessStart, null, str2 + "normal");
            }
            com.sankuai.waimai.store.search.ui.result.datamarket.b a5 = com.sankuai.waimai.store.search.ui.result.datamarket.b.a();
            boolean a6 = a2.a(searchShareData);
            String b2 = a2.b(searchShareData);
            Object[] objArr4 = {list, Byte.valueOf(a6 ? (byte) 1 : (byte) 0), b2};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.search.ui.result.datamarket.b.a;
            if (PatchProxy.isSupport(objArr4, a5, changeQuickRedirect4, false, "883567427df26fb097485e704a2defe2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a5, changeQuickRedirect4, false, "883567427df26fb097485e704a2defe2");
            } else if (!TextUtils.isEmpty(b2) && a5.a(list)) {
                a5.a(StoreSearchChainExpErrorType.ExpProcessStart, 16, a6, b2);
            }
        }
        if (globalPageResponse.searchIntent == 1) {
            this.g = new com.sankuai.waimai.store.search.data.e(this.c.r(), this, globalPageResponse.moduleList, this.d, globalPageResponse, metricsSpeedMeterTask, null, z);
            if (metricsSpeedMeterTask != null) {
                metricsSpeedMeterTask.recordStep("child_process_start");
            }
            if (this.d != null && this.d.aX != null) {
                this.d.aX.recordStep("drug_deserialize_start");
            }
            com.sankuai.waimai.launcher.util.aop.b.a(this.g, ac.a(), new Void[0]);
            return;
        }
        boolean a7 = a(globalPageResponse, z);
        b(globalPageResponse, z);
        if (this.d.ay) {
            metricsSpeedMeterTask2 = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_search_deserialize_task");
            metricsSpeedMeterTask2.recordStep("deserialize_start");
        } else {
            metricsSpeedMeterTask2 = null;
        }
        if (this.d != null && this.d.aX != null) {
            this.d.aX.recordStep("sg_deserialize_start");
        }
        a(globalPageResponse);
        if (a7 && !this.f) {
            if (globalPageResponse.currentPage == 0) {
                final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_search_first_screen_cost");
                createCustomSpeedMeterTask.recordStep("first_screen_start");
                if (this.j) {
                    if (globalPageResponse.globalSearchExtraInfo != null && !t.a(globalPageResponse.globalSearchExtraInfo.searchLogId)) {
                        str = globalPageResponse.globalSearchExtraInfo.searchLogId;
                    }
                    final com.sankuai.waimai.store.search.ui.result.mach.process.b bVar = this.i;
                    final List<OasisModule> list2 = globalPageResponse.moduleList;
                    Object[] objArr5 = {list2, str, createCustomSpeedMeterTask};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.search.ui.result.mach.process.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "ec5c97b03611d3012cadc50d4c1d6dc9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "ec5c97b03611d3012cadc50d4c1d6dc9");
                        return;
                    }
                    Object[] objArr6 = {list2, str, createCustomSpeedMeterTask};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.search.ui.result.mach.process.b.a;
                    if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "891b64f06aafe831d93fe07cf80ef21f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "891b64f06aafe831d93fe07cf80ef21f");
                        return;
                    }
                    com.sankuai.waimai.store.fsp.a.a().a(bVar.d, "before_loadMachTemplate");
                    rx.d.a(new j<String>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        @Override // rx.e
                        public final void onCompleted() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1e5d7166a85ed2ba066627a262ce3738", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1e5d7166a85ed2ba066627a262ce3738");
                                return;
                            }
                            com.sankuai.waimai.store.fsp.a.a().a(bVar.d, "end_loadMachTemplate");
                            final b bVar2 = bVar;
                            List list3 = list2;
                            final String str3 = str;
                            MetricsSpeedMeterTask metricsSpeedMeterTask3 = createCustomSpeedMeterTask;
                            Object[] objArr8 = {list3, str3, metricsSpeedMeterTask3};
                            ChangeQuickRedirect changeQuickRedirect8 = b.a;
                            if (PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "1064163a1b5e6b96cf9046f9135a0ac4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "1064163a1b5e6b96cf9046f9135a0ac4");
                            } else if (com.sankuai.shangou.stone.util.a.b(list3)) {
                            } else {
                                List<OasisModule> a8 = com.sankuai.shangou.stone.util.a.a(list3, 0, bVar2.i);
                                final List a9 = com.sankuai.shangou.stone.util.a.a(list3, bVar2.i, list3.size());
                                bVar2.a(a8, str3, 1, new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr9 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "0724f1a52d795ac3cad67d2ada34754f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "0724f1a52d795ac3cad67d2ada34754f");
                                        } else {
                                            bVar2.a(a9, str3, 2, null, null);
                                        }
                                    }
                                }, metricsSpeedMeterTask3);
                            }
                        }
                    }, rx.d.a((d.a) new d.a<String>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Object obj) {
                            j jVar = (j) obj;
                            int i = 0;
                            Object[] objArr7 = {jVar};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b4eef1bc45b041416a861bae1e35309c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b4eef1bc45b041416a861bae1e35309c");
                            } else if (bVar.f) {
                                int a8 = com.sankuai.shangou.stone.util.a.a(list2);
                                for (int i2 = 0; i2 < a8; i2++) {
                                    OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i2);
                                    if (oasisModule != null && oasisModule.templateType == 1 && !TextUtils.isEmpty(oasisModule.machTemplateId) && ((!bVar.g || !c.b(oasisModule.machTemplateId)) && ((!bVar.h || !c.a(oasisModule.machTemplateId)) && bVar.c.t.a(oasisModule.machTemplateId, "", "wm-search-result", 500) == null))) {
                                        com.sankuai.waimai.store.util.monitor.c.a(SearchDeserializeMonitor.MachSyncLoadTemplateError, null, oasisModule.machTemplateId);
                                        if (c.b(oasisModule.machTemplateId)) {
                                            bVar.g = true;
                                        }
                                        if (c.a(oasisModule.machTemplateId)) {
                                            bVar.h = true;
                                        }
                                    }
                                }
                                int a9 = com.sankuai.shangou.stone.util.a.a(list2);
                                while (i < a9) {
                                    OasisModule oasisModule2 = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i);
                                    if (oasisModule2 != null) {
                                        if (bVar.g && c.b(oasisModule2.machTemplateId)) {
                                            c.a(oasisModule2);
                                        }
                                        if (bVar.h && c.a(oasisModule2.machTemplateId)) {
                                            c.b(oasisModule2);
                                        }
                                    }
                                    i++;
                                }
                                jVar.onCompleted();
                            } else {
                                int a10 = com.sankuai.shangou.stone.util.a.a(list2);
                                while (i < a10) {
                                    OasisModule oasisModule3 = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i);
                                    if (oasisModule3 != null && oasisModule3.templateType == 1 && !TextUtils.isEmpty(oasisModule3.machTemplateId)) {
                                        bVar.c.t.a(oasisModule3.machTemplateId, "", "wm-search-result", 500);
                                    }
                                    i++;
                                }
                                jVar.onCompleted();
                            }
                        }
                    }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
                    return;
                }
                com.sankuai.waimai.store.search.data.c.a(false);
                a(globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, createCustomSpeedMeterTask);
                return;
            }
            com.sankuai.waimai.store.search.data.c.a(false);
            a(globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, null);
            return;
        }
        if (globalPageResponse.currentPage == 0 && b(globalPageResponse)) {
            str = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_search_native_deserialize_span");
        }
        this.g = new com.sankuai.waimai.store.search.data.e(this.c.r(), this, globalPageResponse.moduleList, this.d, globalPageResponse, metricsSpeedMeterTask, str, z);
        if (metricsSpeedMeterTask != null) {
            metricsSpeedMeterTask.recordStep("child_process_start");
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.g, ac.a(), new Void[0]);
    }

    private void a(GlobalPageResponse globalPageResponse) {
        boolean z = false;
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ca2c91fdc943fc49101fa06eae3b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ca2c91fdc943fc49101fa06eae3b47");
        } else if (this.d.n()) {
            Iterator<OasisModule> it = globalPageResponse.moduleList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if ("supermarket-search-second-search".equals(it.next().machTemplateId)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                OasisModule oasisModule = (OasisModule) globalPageResponse.moduleList.get(i).clone();
                oasisModule.machTemplateId = "supermarket-search-second-search-banner";
                oasisModule.unionId = "second_search_banner_query";
                globalPageResponse.moduleList.add(i + 1, oasisModule);
            }
        }
    }

    private boolean a(GlobalPageResponse globalPageResponse, boolean z) {
        Object[] objArr = {globalPageResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c8409f27c8b114f9aa411ac0e4e1ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c8409f27c8b114f9aa411ac0e4e1ed")).booleanValue();
        }
        this.d.ay = false;
        this.d.aC = false;
        this.d.az = "";
        int a2 = com.sankuai.shangou.stone.util.a.a((List) globalPageResponse.moduleList);
        for (int i = 0; i < a2; i++) {
            OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) globalPageResponse.moduleList, i);
            if (oasisModule != null && oasisModule.templateType != 0 && (TextUtils.equals(oasisModule.machTemplateId, "supermarket-search-product-recommend") || TextUtils.equals(oasisModule.machTemplateId, "supermarket-search-product") || TextUtils.equals(oasisModule.machTemplateId, "supermarket-search-product-v2") || TextUtils.equals(oasisModule.machTemplateId, "supermarket-search-product-flower") || TextUtils.equals(oasisModule.machTemplateId, "supermarket-search-poi"))) {
                this.d.ay = true;
                this.d.az = oasisModule.machTemplateId;
                break;
            }
        }
        if (!z && this.d.ay) {
            this.d.aA = true;
            this.d.aB = true;
            com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.MachPreRenderStart, "", this.d.az);
        }
        return this.d.ay;
    }

    private void b(GlobalPageResponse globalPageResponse, boolean z) {
        Object[] objArr = {globalPageResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ce9e98d92a016dd5d9da4d0ee382d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ce9e98d92a016dd5d9da4d0ee382d4");
            return;
        }
        this.d.aD = false;
        this.d.aG = false;
        this.d.aE = "";
        for (OasisModule oasisModule : globalPageResponse.moduleList) {
            if (oasisModule != null && oasisModule.templateType != 1 && (TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_category_template") || TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_poi_template") || TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_feed_product_template"))) {
                this.d.aD = true;
                this.d.aE = oasisModule.nativeTemplateId;
                break;
            }
        }
        if (z || !this.d.aD) {
            return;
        }
        this.d.aF = true;
        com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.NativeProcessStart, "", this.d.aE);
    }

    private boolean b(GlobalPageResponse globalPageResponse) {
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adc6b2d84fa4ca0b89603fb3d0cdbcfc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adc6b2d84fa4ca0b89603fb3d0cdbcfc")).booleanValue();
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) globalPageResponse.moduleList);
        for (int i = 0; i < a2; i++) {
            OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) globalPageResponse.moduleList, i);
            if (oasisModule != null && oasisModule.templateType != 1 && (TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_category_template") || TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_poi_template") || TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_feed_product_template"))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8978c05b6f54a509ba742ddb820d132f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8978c05b6f54a509ba742ddb820d132f");
            return;
        }
        if (this.g != null && !this.g.isCancelled()) {
            this.g.cancel(true);
        }
        if (this.h != null && !this.h.isUnsubscribed()) {
            this.h.unsubscribe();
        }
        com.sankuai.waimai.store.search.ui.result.mach.process.b bVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.result.mach.process.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9fbd39ea85864ea9c65811c4ca430689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9fbd39ea85864ea9c65811c4ca430689");
        } else if (bVar.b != null && !bVar.b.isUnsubscribed()) {
            bVar.b.unsubscribe();
        }
        com.sankuai.waimai.store.search.data.c.a(true);
    }

    private void a(GlobalPageResponse globalPageResponse, MetricsSpeedMeterTask metricsSpeedMeterTask, MetricsSpeedMeterTask metricsSpeedMeterTask2, MetricsSpeedMeterTask metricsSpeedMeterTask3) {
        Object[] objArr = {globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, metricsSpeedMeterTask3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23dfd19a28e814988f8af1c0748c2593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23dfd19a28e814988f8af1c0748c2593");
            return;
        }
        metricsSpeedMeterTask.recordStep("two_thread_deserialize_start");
        b(globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, metricsSpeedMeterTask3);
    }

    private void b(final GlobalPageResponse globalPageResponse, final MetricsSpeedMeterTask metricsSpeedMeterTask, final MetricsSpeedMeterTask metricsSpeedMeterTask2, final MetricsSpeedMeterTask metricsSpeedMeterTask3) {
        Object[] objArr = {globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, metricsSpeedMeterTask3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8742873662ad5dabe567a14de47c0c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8742873662ad5dabe567a14de47c0c8");
        } else {
            rx.d.a(new j<String>() { // from class: com.sankuai.waimai.store.search.ui.result.d.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eb15b6534b7dcc7e5664ca0106fadc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eb15b6534b7dcc7e5664ca0106fadc2");
                    } else {
                        d.a(d.this, globalPageResponse, metricsSpeedMeterTask, metricsSpeedMeterTask2, metricsSpeedMeterTask3);
                    }
                }
            }, rx.d.a((d.a) new d.a<String>() { // from class: com.sankuai.waimai.store.search.ui.result.d.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fc84677c59ca527c989e8c10b497402", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fc84677c59ca527c989e8c10b497402");
                    } else if (globalPageResponse != null) {
                        int a2 = com.sankuai.shangou.stone.util.a.a((List) globalPageResponse.moduleList);
                        for (int i = 0; i < a2; i++) {
                            OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) globalPageResponse.moduleList, i);
                            if (oasisModule != null && oasisModule.templateType == 1 && !TextUtils.isEmpty(oasisModule.machTemplateId)) {
                                d.this.d.t.a(oasisModule.machTemplateId, "", "wm-search-result", 500);
                            }
                        }
                        jVar.onCompleted();
                    }
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    private Integer a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddcaf0b5c7d8eb6ea652c56972e135e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddcaf0b5c7d8eb6ea652c56972e135e");
        }
        if (i == 100 || i == 200) {
            return Integer.valueOf(i);
        }
        return null;
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8f8effdd457408b5c3486271a2c6b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8f8effdd457408b5c3486271a2c6b2");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d.aq)) {
            arrayList.add("1");
        }
        return com.sankuai.waimai.store.util.i.a(arrayList);
    }

    @Override // com.sankuai.waimai.store.search.data.e.a
    public final void a(@NonNull List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdbed0ef76b4bf962870059c43b199a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdbed0ef76b4bf962870059c43b199a");
            return;
        }
        com.sankuai.waimai.store.search.ui.result.datamarket.d.a().a(list, this.d);
        this.c.a(list, 0);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3296a73968dfbb765038c2518a53ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3296a73968dfbb765038c2518a53ae5");
        } else {
            b();
        }
    }
}
