package com.sankuai.waimai.store.search.ui.result.mach.process;

import android.app.Activity;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public k b;
    SearchShareData c;
    public Activity d;
    a e;
    final boolean f;
    boolean g;
    boolean h;
    int i;
    private final List<d<OasisModule>> j;

    public b(SearchShareData searchShareData, Activity activity, boolean z, a aVar) {
        Object[] objArr = {searchShareData, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8cc6bdf0a61ced6d4e186a87663ef2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8cc6bdf0a61ced6d4e186a87663ef2");
            return;
        }
        this.j = new ArrayList();
        this.c = searchShareData;
        this.d = activity;
        this.e = aVar;
        this.f = z;
        this.i = i.h().a("store_agile_data_processor/search", 10);
    }

    void a(final List<OasisModule> list, final String str, final int i, final Runnable runnable, final MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {list, str, Integer.valueOf(i), runnable, metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3884919edaf88f9b259e6eb150216f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3884919edaf88f9b259e6eb150216f2");
            return;
        }
        this.j.clear();
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            if (this.e != null) {
                this.e.a(list, i);
                return;
            }
            return;
        }
        com.sankuai.waimai.store.search.data.c.a(false);
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i2 = 0; i2 < a2; i2++) {
            final OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
            if (oasisModule != null) {
                this.j.add(d.a((d.a) new d.a<OasisModule>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        j jVar = (j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00dec01e8a0ad85a5b93b7fa87abe8f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00dec01e8a0ad85a5b93b7fa87abe8f1");
                            return;
                        }
                        com.sankuai.waimai.store.search.data.c.a(oasisModule, b.this.c, b.this.d, b.this.f);
                        jVar.onNext(oasisModule);
                    }
                }).b(rx.schedulers.a.e()));
            }
        }
        this.b = d.a((Iterable<? extends d<?>>) this.j, (rx.functions.k) new rx.functions.k<OasisModule>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.7
            @Override // rx.functions.k
            public final /* bridge */ /* synthetic */ OasisModule call(Object[] objArr2) {
                return null;
            }
        }).a(rx.android.schedulers.a.a()).a(new rx.functions.b<OasisModule>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.5
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(OasisModule oasisModule2) {
                Object[] objArr2 = {oasisModule2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36fa68552ab20f9c39915f7614d3a845", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36fa68552ab20f9c39915f7614d3a845");
                    return;
                }
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list) && !t.a(str)) {
                    for (OasisModule oasisModule3 : list) {
                        b.this.c.a(oasisModule3.data, str);
                    }
                }
                if (metricsSpeedMeterTask != null) {
                    metricsSpeedMeterTask.recordStep("divide_screen_finish");
                    h.a(metricsSpeedMeterTask);
                }
                if (b.this.e != null) {
                    b.this.e.a(list, i);
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.store.search.ui.result.mach.process.b.6
            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(Throwable th) {
            }
        });
    }
}
