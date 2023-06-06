package com.sankuai.waimai.business.search.common.data;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alipay.sdk.app.PayTask;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.PoiDao;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.business.search.common.util.NoxSp;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.common.util.m;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.business.search.datatype.PoiEntity;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.mach.prerender.i;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.store.search.model.SearchLocation;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends AsyncTask<Void, Void, List<Serializable>> {
    public static ChangeQuickRedirect a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final Executor e;
    private final WeakReference<a> f;
    private final WeakReference<Activity> g;
    private final SearchShareData h;
    private List<OasisModule> i;
    private List<OasisModule> j;
    private final List<OasisModule> k;
    private final List<OasisModule> l;
    private List<Serializable> m;
    private List<CommonMachData> n;
    private List<Serializable> o;
    private List<Serializable> p;
    private GuideQueryData q;
    private int r;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull List<Serializable> list, @NonNull List<Serializable> list2, @NonNull List<CommonMachData> list3, @Nullable List<Serializable> list4, @Nullable GuideQueryData guideQueryData);
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa31ccd63be5438ff6d349e93bbb9049", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa31ccd63be5438ff6d349e93bbb9049") : i == 100 ? PoiDao.TABLENAME : i == 200 ? SearchLocation.SWITCH_OLD_SPU_MOUDLE : "OTHER";
    }

    public static /* synthetic */ Serializable a(b bVar, OasisModule oasisModule, Activity activity, com.sankuai.waimai.mach.recycler.b bVar2, int i) {
        Object[] objArr = {oasisModule, activity, bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9288f01322343530efc12a1c01076c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9288f01322343530efc12a1c01076c1c");
        }
        if (oasisModule.templateType == 0 && "wm_search_direct_card".equals(oasisModule.nativeTemplateId)) {
            oasisModule.templateType = 1;
            oasisModule.machTemplateId = "mach_waimai-search-business-direct-style-12";
        }
        if (oasisModule.templateType == 1) {
            CommonMachData a2 = i.a(bVar.h, oasisModule, bVar2, activity, i, false, null);
            if (a2 != null) {
                if (bVar.isCancelled()) {
                    return null;
                }
                if (oasisModule.trackableType == 1) {
                    a2.isTrackable = false;
                }
                if (!TextUtils.isEmpty(oasisModule.unionId)) {
                    bVar.h.D.put(oasisModule.unionId, "");
                }
                return a2;
            }
            return bVar.a(oasisModule);
        } else if (oasisModule.templateType == 0) {
            return bVar.a(oasisModule);
        } else {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ List<Serializable> doInBackground(Void[] voidArr) {
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916aad305e3bd0f3ffe707256fe199af", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916aad305e3bd0f3ffe707256fe199af");
        }
        if (!isCancelled()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1df22ca5954e9684f2a07b87c1d62070", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1df22ca5954e9684f2a07b87c1d62070");
            } else {
                Activity activity = this.g.get();
                if (activity != null && (!com.sankuai.waimai.foundation.utils.d.a(this.j) || !com.sankuai.waimai.foundation.utils.d.a(this.i) || !com.sankuai.waimai.foundation.utils.d.a(this.k) || !com.sankuai.waimai.foundation.utils.d.a(this.l))) {
                    com.sankuai.waimai.mach.recycler.b bVar = SearchShareData.s;
                    int a2 = g.a((Context) activity);
                    if (!com.sankuai.waimai.foundation.utils.d.a(this.k)) {
                        a(EnumC0860b.FLOAT, activity, this.k, bVar, a2, false);
                    }
                    if (!com.sankuai.waimai.foundation.utils.d.a(this.i)) {
                        a(EnumC0860b.TOP, activity, this.i, bVar, a2, false);
                    }
                    if (!com.sankuai.waimai.foundation.utils.d.a(this.l)) {
                        a(EnumC0860b.TOTAL, activity, this.l, bVar, a2, true);
                    }
                    if (!com.sankuai.waimai.foundation.utils.d.a(this.j)) {
                        a(activity, this.j, bVar, a2);
                    }
                }
            }
        }
        return this.o;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(List<Serializable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afaffabbaacf67cff384ee32b02aa08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afaffabbaacf67cff384ee32b02aa08");
            return;
        }
        a aVar = this.f.get();
        if (aVar != null) {
            aVar.a(this.o, this.p, this.n, this.m, this.q);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        c = availableProcessors == 1 ? b : Math.max(2, Math.min(b - 1, 4));
        d = (b * 2) + 1;
        e = com.sankuai.android.jarvis.c.a("wm_nox-data_processor", c, d, PayTask.j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.common.data.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0860b {
        TOP,
        FLOAT,
        TOTAL;
        
        public static ChangeQuickRedirect a;

        EnumC0860b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89698abb79dfc21e22333478d75bb01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89698abb79dfc21e22333478d75bb01");
            }
        }

        public static EnumC0860b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e586e11ca16ebc5fa8a4bfd71d1c05e8", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0860b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e586e11ca16ebc5fa8a4bfd71d1c05e8") : (EnumC0860b) Enum.valueOf(EnumC0860b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0860b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff12f82f0bc4c6293c8c9c906e323e30", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0860b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff12f82f0bc4c6293c8c9c906e323e30") : (EnumC0860b[]) values().clone();
        }
    }

    public b(@NonNull Activity activity, @NonNull a aVar, @NonNull List<OasisModule> list, @NonNull List<OasisModule> list2, @NonNull List<OasisModule> list3, @Nullable List<OasisModule> list4, int i, @NonNull SearchShareData searchShareData) {
        Object[] objArr = {activity, aVar, list, list2, list3, list4, Integer.valueOf(i), searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e6107410cf911f41f15c48782042d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e6107410cf911f41f15c48782042d6");
            return;
        }
        this.g = new WeakReference<>(activity);
        this.f = new WeakReference<>(aVar);
        this.r = i;
        this.h = searchShareData;
        this.j = list;
        this.i = list2;
        this.k = list3;
        this.l = list4;
        this.m = new ArrayList();
        this.p = new ArrayList();
        this.n = new ArrayList();
        this.o = new CopyOnWriteArrayList();
    }

    private void a(EnumC0860b enumC0860b, Activity activity, List<OasisModule> list, com.sankuai.waimai.mach.recycler.b bVar, int i, boolean z) {
        Object[] objArr = {enumC0860b, activity, list, bVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7dfdc2fc3ba49c696d46a36eed8fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7dfdc2fc3ba49c696d46a36eed8fad");
            return;
        }
        for (OasisModule oasisModule : list) {
            if (oasisModule != null && (TextUtils.isEmpty(oasisModule.unionId) || !this.h.D.containsKey(oasisModule.unionId))) {
                if (oasisModule.templateType == 1) {
                    CommonMachData a2 = i.a(this.h, oasisModule, bVar, activity, i, z, a(enumC0860b));
                    if (a2 != null) {
                        if (isCancelled()) {
                            return;
                        }
                        if (oasisModule.trackableType == 1) {
                            a2.isTrackable = false;
                        }
                        switch (enumC0860b) {
                            case TOP:
                                this.p.add(a2);
                                break;
                            case FLOAT:
                                this.n.add(a2);
                                break;
                            case TOTAL:
                                this.m.add(a2);
                                break;
                            default:
                                throw new RuntimeException("handleNoListCardData data not supported");
                        }
                        if (!TextUtils.isEmpty(oasisModule.unionId)) {
                            this.h.D.put(oasisModule.unionId, "");
                        }
                    }
                } else if (oasisModule.templateType == 0 && "wm_nox_template_pouch".equals(oasisModule.nativeTemplateId)) {
                    Serializable a3 = com.sankuai.waimai.business.search.common.data.a.a(oasisModule);
                    if (a3 == null || isCancelled()) {
                        return;
                    }
                    try {
                        if (a3 instanceof PouchDynamicAd) {
                            a((PouchDynamicAd) a3);
                            if (EnumC0860b.TOP == enumC0860b) {
                                this.p.add(a3);
                            }
                        }
                    } catch (Exception e2) {
                        Log.wtf("processAdData", e2);
                    }
                }
            }
        }
    }

    private Map<String, Object> a(EnumC0860b enumC0860b) {
        Object[] objArr = {enumC0860b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdce5d1308e5ff9e8a7ede3603c73e68", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdce5d1308e5ff9e8a7ede3603c73e68");
        }
        HashMap hashMap = new HashMap();
        switch (enumC0860b) {
            case TOP:
                hashMap.put("top_direct_card", Boolean.TRUE);
                return hashMap;
            case FLOAT:
                hashMap.put("float_card", Boolean.TRUE);
                return hashMap;
            case TOTAL:
                hashMap.put("total_page_card", Boolean.TRUE);
                return hashMap;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(final Activity activity, List<OasisModule> list, final com.sankuai.waimai.mach.recycler.b bVar, final int i) {
        Object[] objArr = {activity, list, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6017cd857614651f22eaf1d67ccfba2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6017cd857614651f22eaf1d67ccfba2d");
            return;
        }
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WM_SEARCH_LIST_MODE_" + a(this.r));
        createCustomSpeedMeterTask.recordStep("pre_render_start");
        List<Pair<Integer, OasisModule>> a2 = a(list, NoxSp.c(), NoxSp.b());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        rx.d.a((Iterable) a2).c(new rx.functions.g<Pair<Integer, OasisModule>, rx.d<Pair<Integer, Serializable>>>() { // from class: com.sankuai.waimai.business.search.common.data.b.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ rx.d<Pair<Integer, Serializable>> call(Pair<Integer, OasisModule> pair) {
                Pair<Integer, OasisModule> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9af94665cd5cc058f49a2720e475035d", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9af94665cd5cc058f49a2720e475035d") : rx.d.a(pair2).b(rx.schedulers.a.a(b.e)).d(new rx.functions.g<Pair<Integer, OasisModule>, Pair<Integer, Serializable>>() { // from class: com.sankuai.waimai.business.search.common.data.b.4.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ Pair<Integer, Serializable> call(Pair<Integer, OasisModule> pair3) {
                        Pair<Integer, OasisModule> pair4 = pair3;
                        Object[] objArr3 = {pair4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c8b72069304fc6e23e927c6429f7f99", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c8b72069304fc6e23e927c6429f7f99") : new Pair<>(pair4.first, b.a(b.this, (OasisModule) pair4.second, activity, bVar, i));
                    }
                }).a(new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.business.search.common.data.b.4.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Throwable th2 = th;
                        Object[] objArr3 = {th2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "618a24d9abefe3450ea38e4b9155201d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "618a24d9abefe3450ea38e4b9155201d");
                        } else {
                            com.sankuai.waimai.platform.capacity.log.i.d(new m().a("rx_error").b("rx_map_error").c(th2 != null ? th2.getMessage() : "rx_map_error exception").b());
                        }
                    }
                });
            }
        }).a(rx.schedulers.a.a()).a(new rx.functions.a() { // from class: com.sankuai.waimai.business.search.common.data.b.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de7be5d4c5836dc1af186e911ecda533", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de7be5d4c5836dc1af186e911ecda533");
                } else {
                    countDownLatch.countDown();
                }
            }
        }).a(new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.business.search.common.data.b.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ea75f22510f8d8db6315a98a749db4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ea75f22510f8d8db6315a98a749db4");
                } else {
                    countDownLatch.countDown();
                }
            }
        }).c(new rx.functions.b<Pair<Integer, Serializable>>() { // from class: com.sankuai.waimai.business.search.common.data.b.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Pair<Integer, Serializable> pair) {
                Pair<Integer, Serializable> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5af09e6724a0f68e347433cc3e9a5d47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5af09e6724a0f68e347433cc3e9a5d47");
                } else {
                    copyOnWriteArrayList.add(pair2);
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
        Collections.sort(arrayList, new Comparator<Pair<Integer, Serializable>>() { // from class: com.sankuai.waimai.business.search.common.data.b.5
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Pair<Integer, Serializable> pair, Pair<Integer, Serializable> pair2) {
                Pair<Integer, Serializable> pair3 = pair;
                Pair<Integer, Serializable> pair4 = pair2;
                Object[] objArr2 = {pair3, pair4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e27d2a74f0484d838834490683578da0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e27d2a74f0484d838834490683578da0")).intValue() : ((Integer) pair3.first).intValue() - ((Integer) pair4.first).intValue();
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair.second != null) {
                if (pair.second instanceof com.sankuai.waimai.business.search.datatype.b) {
                    this.o.add(new com.sankuai.waimai.business.search.datatype.c());
                }
                this.o.add(pair.second);
            }
        }
        createCustomSpeedMeterTask.recordStep("pre_render_end");
        h.a(createCustomSpeedMeterTask);
    }

    private List<Pair<Integer, OasisModule>> a(List<OasisModule> list, long j, Set<String> set) {
        int i;
        int i2 = 0;
        Object[] objArr = {list, new Long(j), set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20743946a36db249cc7d2b50d449df02", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20743946a36db249cc7d2b50d449df02");
        }
        ArrayList arrayList = new ArrayList();
        for (OasisModule oasisModule : list) {
            if (isCancelled()) {
                return arrayList;
            }
            if (oasisModule != null && ((TextUtils.isEmpty(oasisModule.unionId) || !this.h.D.containsKey(oasisModule.unionId)) && ((!"search_aladdin_card_1".equalsIgnoreCase(oasisModule.moduleId) || (!this.h.C.containsKey(oasisModule.moduleId) && System.currentTimeMillis() - j >= TimeUnit.DAYS.toMillis(1L))) && !"wm_search_guide_query_template".equals(oasisModule.nativeTemplateId) && !"wm_search_fast_filter_template".equals(oasisModule.nativeTemplateId) && !"wm_search_fast_filter_elderly_template".equals(oasisModule.nativeTemplateId)))) {
                if (oasisModule.templateType == 0 && "wm_search_direct_card".equals(oasisModule.nativeTemplateId)) {
                    i = 1;
                    oasisModule.templateType = 1;
                    oasisModule.machTemplateId = "mach_waimai-search-business-direct-style-12";
                } else {
                    i = 1;
                }
                if (oasisModule.templateType == i) {
                    Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
                    if (set != null) {
                        try {
                            if (set.contains(String.valueOf(a2.get("surveyId")))) {
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    this.h.C.put(oasisModule.moduleId, "");
                }
                arrayList.add(new Pair(Integer.valueOf(i2), oasisModule));
                i2++;
            }
        }
        return arrayList;
    }

    private Serializable a(@Nullable OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a526122d90f2fd5e9566af78ea739698", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a526122d90f2fd5e9566af78ea739698");
        }
        Serializable a2 = com.sankuai.waimai.business.search.common.data.a.a(oasisModule);
        if (a2 == null || isCancelled()) {
            return null;
        }
        if (oasisModule != null && !TextUtils.isEmpty(oasisModule.unionId)) {
            this.h.D.put(oasisModule.unionId, "");
        }
        if (a2 instanceof PoiEntity) {
            PoiEntity poiEntity = (PoiEntity) a2;
            if (c.a == -1) {
                c.a = poiEntity.productShowType;
            }
        }
        if (a2 instanceof GuideQueryData) {
            this.q = (GuideQueryData) a2;
        }
        try {
            if ((a2 instanceof PouchDynamicAd) && com.sankuai.waimai.ad.gray.c.a()) {
                a((PouchDynamicAd) a2);
            }
        } catch (Exception e2) {
            Log.w("processAdData", e2);
        }
        return a2;
    }

    private void a(@NonNull PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee2cf19e438d8659f7194042be6ade3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee2cf19e438d8659f7194042be6ade3");
            return;
        }
        com.sankuai.waimai.pouch.model.c cVar = new com.sankuai.waimai.pouch.model.c();
        cVar.b = "c_nfqbfvw";
        cVar.e = "search_nox";
        HashMap hashMap = new HashMap();
        hashMap.put("use_pouch", "1");
        SearchShareData a2 = SearchShareData.a(this.g.get());
        if (a2 != null) {
            hashMap.put("no_result_scene", com.sankuai.waimai.business.search.statistics.c.a(a2));
            hashMap.put("no_delivery_scene", com.sankuai.waimai.business.search.statistics.c.b(a2));
            hashMap.put("mixed_mode", com.sankuai.waimai.business.search.statistics.c.a(a2, 7));
            hashMap.put("is_filter_result", k.a(a2));
            hashMap.put("sort_type", Integer.valueOf(a2.R));
            hashMap.put("filter_codes", a2.S == null ? "0" : a2.S);
            hashMap.put("search_log_id", a2.l);
            hashMap.put("qw_type_id", a2.e);
            hashMap.put("label_word", a2.h);
            hashMap.put("template_type", Integer.valueOf(a2.y));
            hashMap.put("keyword", a2.g);
            hashMap.put("stid", a2.d);
            hashMap.put("search_trace_info", a2.ad);
            hashMap.put("cat_id", Integer.valueOf(a2.w));
        }
        cVar.h = hashMap;
        a.C1112a c1112a = new a.C1112a();
        c1112a.b = this.g.get();
        c1112a.d = cVar;
        com.sankuai.waimai.pouch.a a3 = c1112a.a();
        pouchDynamicAd.setPouchAds(a3);
        a3.a(this.g.get(), SearchShareData.t, pouchDynamicAd);
        a3.a(com.sankuai.waimai.business.search.ui.result.pouch.b.b, pouchDynamicAd.stringData);
    }
}
