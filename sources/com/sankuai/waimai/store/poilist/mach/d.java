package com.sankuai.waimai.store.poilist.mach;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poilist.mach.a;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.functions.k;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    private static final int e = Runtime.getRuntime().availableProcessors();
    public int b;
    public com.sankuai.waimai.store.param.a c;
    public String d;
    private Handler j;
    private j<Object> k;

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str, String str2) {
        return "闪购Poi可复用mach模版";
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ String a(BaseModuleDesc baseModuleDesc) {
        return baseModuleDesc.templateId;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ Map a(int i, @NonNull BaseModuleDesc baseModuleDesc) {
        String str;
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a09f80d715f7b70a1f9f5d650406178", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a09f80d715f7b70a1f9f5d650406178");
        }
        if (i >= this.c.aB) {
            i -= this.c.aB;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", String.valueOf(this.c.c));
        hashMap.put("sec_cat_id", this.c.f == null ? "" : this.c.f);
        hashMap.put("filter", this.c.n());
        hashMap.put("api_stids", this.c.c());
        hashMap.put("sort_type", Long.valueOf(this.c.g));
        if ("sm_mach_order_list_poi_recycle_mach_%s".equals(this.d) || "sm_mach_order_detail_poi_recycle_mach_%s".equals(this.d)) {
            str = this.c.k;
        } else {
            str = this.c.l.get(this.c.f);
        }
        hashMap.put("rank_trace_id", str);
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("section", 2);
        hashMap.put("ad_poi_icon", com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.key_poi_ad_icon_url, ""));
        hashMap.put("sort", Long.valueOf(this.c.g));
        hashMap.put("stid", this.c.c());
        hashMap.put("sec_cat_type", this.c.f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sort", Long.valueOf(this.c.g));
        hashMap2.put("filter", this.c.n());
        hashMap2.put("rank_trace_id", this.c.l.get(this.c.f));
        hashMap2.put("sec_cate_id", this.c.f == null ? "" : this.c.f);
        hashMap2.put("stid", this.c.c());
        hashMap2.put("index", Integer.valueOf(i));
        hashMap2.put("customExtCategory", this.c.o());
        hashMap.put("module_lab", hashMap2);
        hashMap.put("trace_id", t.a(baseModuleDesc2.traceId) ? "-999" : baseModuleDesc2.traceId);
        hashMap.put("api_extra", this.c.S);
        hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
        hashMap.put("request_trace_id", this.c.aI);
        hashMap.put("scheme_params", this.c.aA);
        HashMap hashMap3 = new HashMap(baseModuleDesc2.jsonData);
        hashMap3.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
        return hashMap3;
    }

    public d(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar) {
        this(baseActivity, aVar, new com.sankuai.waimai.mach.recycler.b("supermarket"));
        Object[] objArr = {baseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c0d6100d8345e86ce01358e12609bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c0d6100d8345e86ce01358e12609bc");
        }
    }

    public d(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, int i) {
        this(baseActivity, aVar, new com.sankuai.waimai.mach.recycler.b("supermarket"));
        Object[] objArr = {baseActivity, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cb7d5d38963360c8a591a1f0586ea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cb7d5d38963360c8a591a1f0586ea8");
        } else {
            this.b = i;
        }
    }

    public d(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.mach.recycler.b bVar, int i) {
        super(baseActivity, new e(baseActivity, aVar.G), "supermarket", bVar);
        Object[] objArr = {baseActivity, aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0ca4602917d32661aa4217f100ad29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0ca4602917d32661aa4217f100ad29");
            return;
        }
        this.j = new Handler(Looper.getMainLooper());
        this.c = aVar;
        this.b = i;
    }

    public d(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.mach.recycler.b bVar) {
        super(baseActivity, new e(baseActivity, aVar.G), "supermarket", bVar);
        Object[] objArr = {baseActivity, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16592923e4f05e586b53e0862767457d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16592923e4f05e586b53e0862767457d");
            return;
        }
        this.j = new Handler(Looper.getMainLooper());
        this.c = aVar;
        this.b = ((h.a((Context) baseActivity) - (h.a(baseActivity, 3.0f) * 4)) - (h.a(baseActivity, 9.0f) * 2)) / 2;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3248d10aa7fd0ed5a0285a61def5601", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3248d10aa7fd0ed5a0285a61def5601");
        }
        return String.format(TextUtils.isEmpty(this.d) ? "sm_mach_poi_recycle_mach_%s" : this.d, str);
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc94f06e82a78e29ed64f9a411ad99b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc94f06e82a78e29ed64f9a411ad99b");
        }
        return str2 + ":可复用mach模版预渲染失败！";
    }

    public final f<BaseModuleDesc> a(@NonNull PoiCardInfo poiCardInfo, int i) {
        Object[] objArr = {poiCardInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c14a63cc614d09afb83b2675a7f256", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c14a63cc614d09afb83b2675a7f256");
        }
        com.sankuai.waimai.mach.recycler.c cVar = null;
        if (poiCardInfo.moduleDesc != null && !t.a(poiCardInfo.moduleDesc.templateId)) {
            cVar = a(i, poiCardInfo.moduleDesc, poiCardInfo.moduleDesc.moduleId, this.b);
        }
        return new f<>(poiCardInfo.moduleDesc, cVar);
    }

    public final rx.d<List<f>> a(@NonNull List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "579be11b84d0325fc19809b3aed15c72", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "579be11b84d0325fc19809b3aed15c72") : a(list, this.b, new a.InterfaceC1285a() { // from class: com.sankuai.waimai.store.poilist.mach.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poilist.mach.a.InterfaceC1285a
            public final Object a(Object obj) {
                PoiCardInfo poiCardInfo;
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2c0c446dfc2d6e44d4678da81f3e856", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2c0c446dfc2d6e44d4678da81f3e856");
                }
                if (!(obj instanceof com.sankuai.waimai.store.repository.model.f) || (poiCardInfo = ((com.sankuai.waimai.store.repository.model.f) obj).i) == null) {
                    return null;
                }
                return poiCardInfo.moduleDesc;
            }

            @Override // com.sankuai.waimai.store.poilist.mach.a.InterfaceC1285a
            public final String b(Object obj) {
                PoiCardInfo poiCardInfo;
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e601cba99d5ccc54be7ee9ccfcd2f573", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e601cba99d5ccc54be7ee9ccfcd2f573") : (!(obj instanceof com.sankuai.waimai.store.repository.model.f) || (poiCardInfo = ((com.sankuai.waimai.store.repository.model.f) obj).i) == null) ? "" : poiCardInfo.moduleDesc.moduleId;
            }
        });
    }

    public final void a(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        Object[] objArr = {runnable, runnable2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8a273d158685dda140db1d239beb66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8a273d158685dda140db1d239beb66");
            return;
        }
        this.k = new j<Object>() { // from class: com.sankuai.waimai.store.poilist.mach.d.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final void onNext(Object obj) {
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5eb36b4369d2d98c3c8323765332c0bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5eb36b4369d2d98c3c8323765332c0bb");
                    return;
                }
                runnable.run();
                d.this.j.post(runnable2);
            }
        };
        rx.d.a(this.k, rx.d.b().b(rx.schedulers.a.e()).a(rx.schedulers.a.e()));
    }

    public final void a(final Runnable runnable, final List<com.sankuai.waimai.store.repository.model.f> list, boolean z) {
        Object[] objArr = {runnable, list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d5c4ea3177da8b67448d945f800bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d5c4ea3177da8b67448d945f800bbf");
            return;
        }
        final int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        if (a2 <= 1) {
            if (a2 == 1) {
                final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("supermarket_mach_preload_tag");
                rx.d.a((d.a) new d.a<List<f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poilist.mach.d.7
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        j jVar = (j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0206a6672163710b583208b69df5f5b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0206a6672163710b583208b69df5f5b9");
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < a2; i++) {
                            com.sankuai.waimai.store.repository.model.f fVar = (com.sankuai.waimai.store.repository.model.f) list.get(i);
                            if (fVar != null && fVar.j == null) {
                                fVar.j = d.this.a(fVar.i, fVar.e);
                            }
                        }
                        jVar.onNext(arrayList);
                    }
                }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<List<f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poilist.mach.d.6
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(List<f<BaseModuleDesc>> list2) {
                        Object[] objArr2 = {list2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb7b679c09f6a43d6872ebba2e1c6650", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb7b679c09f6a43d6872ebba2e1c6650");
                            return;
                        }
                        createCustomSpeedMeterTask.recordStep("feed_mach_data_first_end_load_prerender");
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                return;
            } else if (runnable != null) {
                runnable.run();
                return;
            } else {
                return;
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        boolean booleanValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6f27d5936a4a45326ad0922a0daf20c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6f27d5936a4a45326ad0922a0daf20c4")).booleanValue() : com.sankuai.waimai.store.config.j.h().a("optimize/more_thread_mach_load", false);
        int max = booleanValue ? Math.max(e - 1, 2) : 2;
        int ceil = (int) Math.ceil(a2 / (max * 1.0d));
        LinkedList<List> linkedList = new LinkedList();
        for (int i = 0; i < max; i++) {
            int i2 = i * ceil;
            if (i2 >= a2) {
                break;
            }
            List a3 = com.sankuai.shangou.stone.util.a.a(list, i2, i2 + ceil);
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a3)) {
                linkedList.add(a3);
            }
        }
        LinkedList linkedList2 = new LinkedList();
        for (final List list2 : linkedList) {
            linkedList2.add(rx.d.a((d.a) new d.a<List<f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poilist.mach.d.3
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr3 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dca8603f9c5c726ca18ee1a28f167c8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dca8603f9c5c726ca18ee1a28f167c8e");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < com.sankuai.shangou.stone.util.a.c(list2); i3++) {
                        com.sankuai.waimai.store.repository.model.f fVar = (com.sankuai.waimai.store.repository.model.f) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i3);
                        if (fVar != null && fVar.j == null) {
                            fVar.j = d.this.a(fVar.i, fVar.e);
                        }
                    }
                    jVar.onNext(arrayList);
                }
            }).b(rx.schedulers.a.e()));
        }
        final MetricsSpeedMeterTask createCustomSpeedMeterTask2 = MetricsSpeedMeterTask.createCustomSpeedMeterTask(!booleanValue ? "supermarket_mach_preload_tag" : "supermarket_mach_preload_tag_omt_optimized");
        createCustomSpeedMeterTask2.recordStep("feed_mach_data_begin_load_prerender");
        rx.d.a((Iterable<? extends rx.d<?>>) linkedList2, new k<List<f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poilist.mach.d.5
            public static ChangeQuickRedirect a;

            @Override // rx.functions.k
            public final /* synthetic */ List<f<BaseModuleDesc>> call(Object[] objArr3) {
                Object[] objArr4 = {objArr3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "c554a364ed25b8b7ba95d94687c46449", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "c554a364ed25b8b7ba95d94687c46449") : Collections.emptyList();
            }
        }).a(rx.android.schedulers.a.a()).c(new rx.functions.b<List<f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.poilist.mach.d.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(List<f<BaseModuleDesc>> list3) {
                Object[] objArr3 = {list3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bab7336c0df8dd711615fc094014292d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bab7336c0df8dd711615fc094014292d");
                    return;
                }
                createCustomSpeedMeterTask2.recordStep("feed_mach_data_first_end_load_prerender");
                com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask2);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c328c6b00cee6defe3d2af01cc2272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c328c6b00cee6defe3d2af01cc2272");
            return;
        }
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
        }
        if (this.k == null || this.k.isUnsubscribed()) {
            return;
        }
        this.k.unsubscribe();
    }
}
