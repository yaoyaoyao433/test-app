package com.sankuai.waimai.rocks.view.mach;

import android.util.Log;
import android.util.Pair;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.rocks.view.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h {
    public static ChangeQuickRedirect b;
    protected com.sankuai.waimai.rocks.view.viewmodel.d c;
    protected a d;
    protected String e;
    public boolean f;

    public abstract com.sankuai.waimai.rocks.view.viewmodel.e a(com.sankuai.waimai.rocks.view.viewmodel.e eVar);

    public static /* synthetic */ void a(h hVar, c.InterfaceC1133c interfaceC1133c, List list, boolean z, MetricsSpeedMeterTask metricsSpeedMeterTask, long j, List list2) {
        Object[] objArr = {interfaceC1133c, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask, new Long(j), list2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "115fc048059fe1eb1feef5cc62d6d3ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "115fc048059fe1eb1feef5cc62d6d3ec");
            return;
        }
        ArrayList arrayList = new ArrayList(list2);
        Collections.sort(arrayList, new Comparator<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.11
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair, Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair2) {
                Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair3 = pair;
                Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair4 = pair2;
                Object[] objArr2 = {pair3, pair4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e8de99222f2c5837080352636b5db5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e8de99222f2c5837080352636b5db5")).intValue() : ((Integer) pair3.first).intValue() - ((Integer) pair4.first).intValue();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair.second != null) {
                arrayList2.add(pair.second);
            }
        }
        metricsSpeedMeterTask.recordStep(com.sankuai.waimai.rocks.log.c.a(z));
        com.sankuai.meituan.takeoutnew.util.aop.h.a(metricsSpeedMeterTask);
        String str = hVar.d.b() ? "preRenderOptimization" : "preRenderWithExecutor";
        Log.e(str, "pre_render_time :::::  " + (System.currentTimeMillis() - j) + "ms with list size:  " + list.size());
        if (interfaceC1133c != null) {
            hVar.c.o.addAll(arrayList2);
            interfaceC1133c.a(hVar.c);
        }
    }

    public h(com.sankuai.waimai.rocks.view.viewmodel.d dVar, a aVar, boolean z, String str) {
        Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130bb54563c6c10aa71f32351f32edd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130bb54563c6c10aa71f32351f32edd9");
            return;
        }
        this.c = dVar;
        this.d = aVar;
        this.e = str;
        this.f = z;
    }

    public void a(final c.InterfaceC1133c interfaceC1133c, final List<com.sankuai.waimai.rocks.view.viewmodel.e> list, final boolean z) {
        Iterator<com.sankuai.waimai.rocks.view.viewmodel.e> it;
        Object[] objArr = {interfaceC1133c, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a56048c456ffcef3c2a97fca8ee1bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a56048c456ffcef3c2a97fca8ee1bef");
            return;
        }
        final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(com.sankuai.waimai.rocks.log.c.a(this.e, this.d.b()));
        createCustomSpeedMeterTask.recordStep("rocks_data_begin_load_prerender");
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.d.b() && (this.d instanceof c)) {
            c cVar = (c) this.d;
            ArrayList arrayList = new ArrayList();
            Iterator<com.sankuai.waimai.rocks.view.viewmodel.e> it2 = list.iterator();
            while (it2.hasNext()) {
                com.sankuai.waimai.rocks.view.viewmodel.e next = it2.next();
                Map<String, Object> d = next.s.d();
                if (d == null) {
                    d = new HashMap<>();
                }
                d.put("index", Integer.valueOf(next.v));
                d.put("data_id", next.s.e);
                d.put("lx_view_info", next.s.f);
                d.put("lx_click_info", next.s.g);
                d.put("ad_view_info", next.s.h);
                d.put("ad_click_info", next.s.i);
                if (cVar.e != null) {
                    d.putAll(cVar.e);
                }
                if (cVar.b.isDestroyed()) {
                    cVar.g.e(this.e, next.s.c);
                    return;
                }
                if ("mach".equals(next.s.m) && (next instanceof com.sankuai.waimai.rocks.view.viewmodel.a)) {
                    it = it2;
                    com.sankuai.waimai.mach.recycler.c a = cVar.h.a(next.s.c, "", cVar.d.a(next.s.c).a(), next.s.n, cVar.c);
                    a.l = d;
                    a.n = next.s.q.m;
                    a.o = next.s.q.n;
                    ((com.sankuai.waimai.rocks.view.viewmodel.a) next).p = a;
                    arrayList.add(a);
                } else {
                    it = it2;
                }
                arrayList.addAll(a(next, cVar));
                it2 = it;
            }
            if (cVar.b == null || cVar.b.isDestroyed()) {
                cVar.g.e(this.e, "");
                return;
            } else {
                cVar.f.a(cVar.b, arrayList, new b.c() { // from class: com.sankuai.waimai.rocks.view.mach.h.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.recycler.b.c
                    public final void a(Map<com.sankuai.waimai.mach.recycler.c, b.C1020b> map) {
                        Object[] objArr2 = {map};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fac085102bd8a9cbb8de868207433a86", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fac085102bd8a9cbb8de868207433a86");
                        } else {
                            h.this.a(interfaceC1133c, list, z, createCustomSpeedMeterTask, currentTimeMillis);
                        }
                    }
                });
                return;
            }
        }
        a(interfaceC1133c, list, z, createCustomSpeedMeterTask, currentTimeMillis);
    }

    public final void a(final c.InterfaceC1133c interfaceC1133c, final List<com.sankuai.waimai.rocks.view.viewmodel.e> list, final boolean z, final MetricsSpeedMeterTask metricsSpeedMeterTask, final long j) {
        Object[] objArr = {interfaceC1133c, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3df23b4c3ba72c27fc1571b1be10ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3df23b4c3ba72c27fc1571b1be10ace");
            return;
        }
        List<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>> a = a(list);
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        rx.d.a((Iterable) a).c(new rx.functions.g<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>, rx.d<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.10
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ rx.d<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>> call(Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair) {
                Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7d27e1bf0397a9d95310a1bfe298b13", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7d27e1bf0397a9d95310a1bfe298b13") : rx.d.a(pair2).b(rx.schedulers.a.a(f.a())).d(new rx.functions.g<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>, Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.10.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> call(Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair3) {
                        Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair4 = pair3;
                        Object[] objArr3 = {pair4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "457b0e30cdf2252bbce18a2f4112807d", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "457b0e30cdf2252bbce18a2f4112807d") : new Pair<>(pair4.first, h.this.a((com.sankuai.waimai.rocks.view.viewmodel.e) pair4.second));
                    }
                }).a(new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.rocks.view.mach.h.10.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53d044593c5b6df1074ea4b4bbc78d31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53d044593c5b6df1074ea4b4bbc78d31");
                        } else {
                            Log.e("rocks", "rx_map_error exception");
                        }
                    }
                });
            }
        }).a(rx.android.schedulers.a.a()).a(new rx.functions.a() { // from class: com.sankuai.waimai.rocks.view.mach.h.9
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c1c269c6ea0890ff7411b74ad161600", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c1c269c6ea0890ff7411b74ad161600");
                } else {
                    h.a(h.this, interfaceC1133c, list, z, metricsSpeedMeterTask, j, copyOnWriteArrayList);
                }
            }
        }).a(new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.rocks.view.mach.h.8
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f70ad5a3465ac5138811b9b31307597e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f70ad5a3465ac5138811b9b31307597e");
                } else {
                    h.a(h.this, interfaceC1133c, list, z, metricsSpeedMeterTask, j, copyOnWriteArrayList);
                }
            }
        }).c(new rx.functions.b<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.7
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair) {
                Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6d8614e349cea89822f852a9ff715c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6d8614e349cea89822f852a9ff715c7");
                } else {
                    copyOnWriteArrayList.add(pair2);
                }
            }
        });
    }

    private List<Pair<Integer, com.sankuai.waimai.rocks.view.viewmodel.e>> a(List<com.sankuai.waimai.rocks.view.viewmodel.e> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c779c2ffb82254e2da1d1f408f1da4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c779c2ffb82254e2da1d1f408f1da4");
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.rocks.view.viewmodel.e eVar : list) {
            arrayList.add(new Pair(Integer.valueOf(i), eVar));
            i++;
        }
        return arrayList;
    }

    public void b(final c.InterfaceC1133c interfaceC1133c, final List<com.sankuai.waimai.rocks.view.viewmodel.e> list, final boolean z) {
        Object[] objArr = {interfaceC1133c, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e384748d3730069a14e1447ae8110c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e384748d3730069a14e1447ae8110c0");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(com.sankuai.waimai.rocks.log.c.a(this.e, true));
        createCustomSpeedMeterTask.recordStep("rocks_data_begin_load_prerender");
        if (this.d.b() && (this.d instanceof c)) {
            c cVar = (c) this.d;
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.waimai.rocks.view.viewmodel.e eVar : list) {
                Map<String, Object> d = eVar.s.d();
                d.put("index", Integer.valueOf(eVar.v));
                d.put("data_id", eVar.s.e);
                d.put("lx_view_info", eVar.s.f);
                d.put("lx_click_info", eVar.s.g);
                d.put("ad_view_info", eVar.s.h);
                d.put("ad_click_info", eVar.s.i);
                if (cVar.e != null) {
                    d.putAll(cVar.e);
                }
                if (cVar.b.isDestroyed()) {
                    cVar.g.e(this.e, eVar.s.c);
                    return;
                }
                if ("mach".equals(eVar.s.m) && (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a)) {
                    com.sankuai.waimai.mach.recycler.c a = cVar.h.a(eVar.s.c, "", cVar.d.a(eVar.s.c).a(), eVar.s.n, cVar.c);
                    a.l = d;
                    a.n = eVar.s.q.m;
                    a.o = eVar.s.q.n;
                    ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p = a;
                    arrayList.add(a);
                }
                arrayList.addAll(a(eVar, cVar));
            }
            if (cVar.b == null || cVar.b.isDestroyed()) {
                cVar.g.e(this.e, "");
                return;
            } else {
                cVar.f.a(cVar.b, arrayList, new b.c() { // from class: com.sankuai.waimai.rocks.view.mach.h.12
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.recycler.b.c
                    public final void a(Map<com.sankuai.waimai.mach.recycler.c, b.C1020b> map) {
                        Object[] objArr2 = {map};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ecf1f7078924f24e4576d62b56d0b5f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ecf1f7078924f24e4576d62b56d0b5f");
                        } else {
                            h.this.b(interfaceC1133c, list, z, createCustomSpeedMeterTask, currentTimeMillis);
                        }
                    }
                });
                return;
            }
        }
        b(interfaceC1133c, list, z, createCustomSpeedMeterTask, currentTimeMillis);
    }

    void b(final c.InterfaceC1133c interfaceC1133c, final List<com.sankuai.waimai.rocks.view.viewmodel.e> list, final boolean z, final MetricsSpeedMeterTask metricsSpeedMeterTask, final long j) {
        Object[] objArr = {interfaceC1133c, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341d0e9a35b095cdb3a3a3facceeff81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341d0e9a35b095cdb3a3a3facceeff81");
            return;
        }
        final ArrayList arrayList = new ArrayList(list.subList(0, list.size() / 2));
        final ArrayList arrayList2 = new ArrayList(list.subList(list.size() / 2, list.size()));
        rx.d.b(rx.d.a((d.a) new d.a<List<com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.13
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1473b3784d9bc0669c79b38799f5f89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1473b3784d9bc0669c79b38799f5f89");
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(h.this.a((com.sankuai.waimai.rocks.view.viewmodel.e) it.next()));
                }
                jVar.onNext(arrayList3);
            }
        }).b(rx.schedulers.a.d()), rx.d.a((d.a) new d.a<List<com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.14
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "651031c0c76eb40bf71abf4fb2aa147e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "651031c0c76eb40bf71abf4fb2aa147e");
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(h.this.a((com.sankuai.waimai.rocks.view.viewmodel.e) it.next()));
                }
                jVar.onNext(arrayList3);
            }
        }).b(rx.schedulers.a.d()), new rx.functions.h<List<com.sankuai.waimai.rocks.view.viewmodel.e>, List<com.sankuai.waimai.rocks.view.viewmodel.e>, List<com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.h
            public final /* synthetic */ List<com.sankuai.waimai.rocks.view.viewmodel.e> a(List<com.sankuai.waimai.rocks.view.viewmodel.e> list2, List<com.sankuai.waimai.rocks.view.viewmodel.e> list3) {
                List<com.sankuai.waimai.rocks.view.viewmodel.e> list4 = list2;
                List<com.sankuai.waimai.rocks.view.viewmodel.e> list5 = list3;
                Object[] objArr2 = {list4, list5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9762cdf4e428257294f10f543cbb98c9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9762cdf4e428257294f10f543cbb98c9");
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(list4);
                arrayList3.addAll(list5);
                return arrayList3;
            }
        }).a(rx.android.schedulers.a.a()).c(new rx.functions.b<List<com.sankuai.waimai.rocks.view.viewmodel.e>>() { // from class: com.sankuai.waimai.rocks.view.mach.h.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(List<com.sankuai.waimai.rocks.view.viewmodel.e> list2) {
                List<com.sankuai.waimai.rocks.view.viewmodel.e> list3 = list2;
                Object[] objArr2 = {list3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aad0038217f905bf93366e6860d61df8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aad0038217f905bf93366e6860d61df8");
                    return;
                }
                metricsSpeedMeterTask.recordStep(com.sankuai.waimai.rocks.log.c.a(z));
                com.sankuai.meituan.takeoutnew.util.aop.h.a(metricsSpeedMeterTask);
                if (interfaceC1133c != null) {
                    h.this.c.o.addAll(list3);
                    interfaceC1133c.a(h.this.c);
                    String str = h.this.d.b() ? "preRenderOptimizationSplit" : "preRenderWithSplitList";
                    Log.e(str, "pre_render_time :::::  " + (System.currentTimeMillis() - j) + "ms  list size 》》》》  " + list.size());
                }
            }
        });
    }

    public final void a(final com.sankuai.waimai.rocks.view.viewmodel.e eVar, final c.b bVar) {
        Object[] objArr = {eVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e641bb5f88467f3a9cc92700bccd668d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e641bb5f88467f3a9cc92700bccd668d");
        } else {
            rx.d.a((d.a) new d.a<com.sankuai.waimai.rocks.view.viewmodel.e>() { // from class: com.sankuai.waimai.rocks.view.mach.h.6
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a889c0ba2f912805d3edd2c1040e9132", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a889c0ba2f912805d3edd2c1040e9132");
                    } else {
                        jVar.onNext(h.this.a(eVar));
                    }
                }
            }).b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).a(new rx.functions.b<com.sankuai.waimai.rocks.view.viewmodel.e>() { // from class: com.sankuai.waimai.rocks.view.mach.h.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(com.sankuai.waimai.rocks.view.viewmodel.e eVar2) {
                    com.sankuai.waimai.rocks.view.viewmodel.e eVar3 = eVar2;
                    Object[] objArr2 = {eVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ec04f7b1575bd48de95964a45db39a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ec04f7b1575bd48de95964a45db39a1");
                    } else if (bVar != null) {
                        bVar.a(eVar3);
                    }
                }
            }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.rocks.view.mach.h.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a83cc56cadb8abd5d0b9f958afaa753", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a83cc56cadb8abd5d0b9f958afaa753");
                    } else if (bVar != null) {
                        bVar.a((com.sankuai.waimai.rocks.view.viewmodel.e) null);
                    }
                }
            });
        }
    }

    private List<com.sankuai.waimai.mach.recycler.c> a(com.sankuai.waimai.rocks.view.viewmodel.e eVar, c cVar) {
        Object[] objArr = {eVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff71668b05e5fac9be44846d433d052", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff71668b05e5fac9be44846d433d052");
        }
        ArrayList arrayList = new ArrayList();
        if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.b) {
            for (com.sankuai.waimai.rocks.view.viewmodel.e eVar2 : ((com.sankuai.waimai.rocks.view.viewmodel.b) eVar).o) {
                Map<String, Object> d = eVar2.s.d();
                d.put("index", Integer.valueOf(eVar.v));
                d.put("data_id", eVar2.s.e);
                d.put("data_id", eVar.s.e);
                d.put("lx_view_info", eVar.s.f);
                d.put("lx_click_info", eVar.s.g);
                d.put("ad_view_info", eVar.s.h);
                d.put("ad_click_info", eVar.s.i);
                if (cVar.e != null) {
                    d.putAll(cVar.e);
                }
                if ("mach".equals(eVar2.s.m) && (eVar2 instanceof com.sankuai.waimai.rocks.view.viewmodel.a)) {
                    com.sankuai.waimai.mach.recycler.c a = cVar.h.a(eVar2.s.c, "", cVar.d.a(eVar2.s.c).a(), eVar2.s.n, cVar.c);
                    a.l = d;
                    a.n = eVar2.s.q.m;
                    a.o = eVar2.s.q.n;
                    ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar2).p = a;
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }
}
