package com.sankuai.waimai.store.pagingload;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.util.ac;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c<Src, Desc> {
    public static ChangeQuickRedirect a;
    public static final String b;
    public static final String c;
    public static int i;
    public a d;
    public String e;
    public int f;
    public a.InterfaceC1262a<Src, Desc> g;
    public a.b<Src, Desc> h;
    private boolean j;
    private k k;
    private MetricsSpeedMeterTask l;
    private a.f<Src> m;
    private a.e<Src> n;
    private a.d<Src, Desc> o;
    private a.c<Src> p;
    private final List<rx.d<Desc>> q;
    private final Queue<List<Src>> r;
    private final List<Desc> s;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        rx.d a(List list);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496a92ba1488593e62f54a147bd0f1ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496a92ba1488593e62f54a147bd0f1ea");
            return;
        }
        this.f = 10;
        this.q = new ArrayList();
        this.r = new LinkedList();
        this.s = Collections.emptyList();
    }

    public static /* synthetic */ void a(c cVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "122716d5578fdf11565f7387b6dcd0a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "122716d5578fdf11565f7387b6dcd0a2");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            if (cVar.h != null) {
                cVar.h.a(1, null, cVar.s);
            }
            d.a(cVar.e, "divide");
            cVar.d();
        } else {
            List<Src> a2 = com.sankuai.shangou.stone.util.a.a(list, 0, cVar.f);
            final List a3 = com.sankuai.shangou.stone.util.a.a(list, cVar.f, list.size());
            Runnable runnable = com.sankuai.shangou.stone.util.a.a(a3) > 0 ? new Runnable() { // from class: com.sankuai.waimai.store.pagingload.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45330a39877e4d7ff6b32022af5f93f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45330a39877e4d7ff6b32022af5f93f1");
                        return;
                    }
                    if (c.this.h != null) {
                        c.this.h.b(a3, 2);
                    }
                    c.this.a(a3, 2, null);
                }
            } : null;
            MetricsSpeedMeterTask metricsSpeedMeterTask = cVar.l;
            Object[] objArr2 = {metricsSpeedMeterTask};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "02c26083354de27b2ce10a4a3b26f884", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "02c26083354de27b2ce10a4a3b26f884");
            } else if (metricsSpeedMeterTask != null) {
                metricsSpeedMeterTask.recordStep("step_divide");
            }
            if (cVar.h != null) {
                cVar.h.b(a2, 1);
            }
            cVar.a(a2, 1, runnable);
        }
    }

    static {
        b = v.c ? "sg_opt_1_home_mt" : v.b ? "sg_opt_1_home_wm" : "sg_opt_1_home_dp";
        c = v.c ? "sg_opt_1_home_mach_tag_mt" : v.b ? "sg_opt_1_home_mach_tag_wm" : "sg_opt_1_home_mach_tag_dp";
        i = 0;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT > 27;
    }

    public final void a(List<Src> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a0c3efa5148a1d8c39534fb2c4b5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a0c3efa5148a1d8c39534fb2c4b5b2");
            return;
        }
        this.r.offer(list);
        if (this.j) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1ddc9c4f08e2c91f49cf0e37f37918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1ddc9c4f08e2c91f49cf0e37f37918");
            return;
        }
        List<Src> poll = this.r.poll();
        if (poll == null) {
            this.j = false;
            if (this.h != null) {
                this.h.a();
                return;
            }
            return;
        }
        this.j = true;
        this.l = b.a(this.e);
        b(poll);
    }

    public final boolean b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b647c5c289e47f9556221318c05170cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b647c5c289e47f9556221318c05170cc")).booleanValue();
        }
        if (j.h().a(SCConfigPath.PRELOAD_PRERENDER_MACHES, 0) > 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0db2061e5873687858d7ea4e6cadea68", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0db2061e5873687858d7ea4e6cadea68")).booleanValue();
            } else {
                z = !com.sankuai.waimai.store.manager.abtest.a.a(b).a();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private void b(List<Src> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6a5363047f0c26dbb76eabf897bbb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6a5363047f0c26dbb76eabf897bbb0");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            if (this.h != null) {
                this.h.a(1, null, this.s);
            }
            d.a(this.e, "load_mach");
            d();
        } else {
            c(list);
        }
    }

    private void c(final List<Src> list) {
        rx.d a2 = rx.d.a((d.a) new d.a<String>() { // from class: com.sankuai.waimai.store.pagingload.c.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                rx.j jVar = (rx.j) obj;
                Object[] objArr = {jVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2391cfcc881757c5c0000032cfef71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2391cfcc881757c5c0000032cfef71");
                    return;
                }
                if (c.this.p != null) {
                    int a3 = com.sankuai.shangou.stone.util.a.a(list);
                    for (int i2 = 0; i2 < a3; i2++) {
                        Object a4 = com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
                        if (a4 != null && (c.this.n == null || !c.this.n.a(a4))) {
                            a.c unused = c.this.p;
                        }
                    }
                    MetricsSpeedMeterTask metricsSpeedMeterTask = c.this.l;
                    Object[] objArr2 = {metricsSpeedMeterTask};
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9900d139fb2e559a29a8bc94457f61f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9900d139fb2e559a29a8bc94457f61f0");
                    } else if (metricsSpeedMeterTask != null) {
                        metricsSpeedMeterTask.recordStep("step_load_mach");
                    }
                }
                jVar.onCompleted();
            }
        });
        if (this.p != null) {
            a2 = a2.b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
        } else if (!al.a()) {
            a2 = a2.a(rx.android.schedulers.a.a());
        }
        rx.d.a(new rx.j<String>() { // from class: com.sankuai.waimai.store.pagingload.c.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fbe2e570f83c714b60ad9ac863e9f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fbe2e570f83c714b60ad9ac863e9f2");
                } else {
                    c.a(c.this, list);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr = {th};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961982f080911572166827f8fc663708", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961982f080911572166827f8fc663708");
                    return;
                }
                String str = c.this.e;
                Object[] objArr2 = {str, th};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ab86fe4d09c3116a2523c739cbe011d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ab86fe4d09c3116a2523c739cbe011d");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    com.sankuai.waimai.store.util.monitor.c.a(AgileLoadErrorType.LoadMachError, th != null ? th.getMessage() : null, str);
                }
            }
        }, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(List<Src> list, final int i2, final Runnable runnable) {
        Object[] objArr = {list, Integer.valueOf(i2), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5876402128d3eff43c7f9529d0367e43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5876402128d3eff43c7f9529d0367e43");
            return;
        }
        this.q.clear();
        rx.d<Desc> dVar = null;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            if (this.h != null) {
                this.h.a(1, null, this.s);
            }
            d.a(this.e, "deserialize");
            d();
            return;
        }
        b.a(this.l, i2);
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        final Pair[] pairArr = new Pair[a2];
        a aVar = this.d;
        if (b() && aVar != null) {
            this.k = aVar.a(list).a(new rx.functions.b<List<Desc>>() { // from class: com.sankuai.waimai.store.pagingload.c.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    final List<Desc> list2 = (List) obj;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc8b753b3cedd2ced92827e8de190de0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc8b753b3cedd2ced92827e8de190de0");
                        return;
                    }
                    b.b(c.this.l, i2);
                    if (al.a()) {
                        if (c.this.h != null) {
                            c.this.h.a(list2, i2);
                        }
                        if (runnable == null) {
                            b.a(c.this.l);
                            c.this.d();
                            return;
                        }
                        runnable.run();
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.store.pagingload.c.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a46e9b0b38d8f591e02bf2660cada8b0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a46e9b0b38d8f591e02bf2660cada8b0");
                                return;
                            }
                            if (c.this.h != null) {
                                c.this.h.a(list2, i2);
                            }
                            if (runnable == null) {
                                b.a(c.this.l);
                                c.this.d();
                                return;
                            }
                            runnable.run();
                        }
                    });
                }
            }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.store.pagingload.c.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    final Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cefe98124738cd9b8d917bd61efc8d22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cefe98124738cd9b8d917bd61efc8d22");
                        return;
                    }
                    d.a(c.this.e, th2);
                    if (al.a()) {
                        if (c.this.h != null) {
                            c.this.h.a(2, th2, c.this.s);
                            c.this.d();
                            return;
                        }
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.store.pagingload.c.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba67dbda23927457232cfcf32dbfbd3a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba67dbda23927457232cfcf32dbfbd3a");
                            } else if (c.this.h != null) {
                                c.this.h.a(2, th2, c.this.s);
                                c.this.d();
                            }
                        }
                    });
                }
            });
            return;
        }
        for (final int i3 = 0; i3 < a2; i3++) {
            final Object a3 = com.sankuai.shangou.stone.util.a.a((List<Object>) list, i3);
            if (a3 != null && (this.m == null || !this.m.a(a3))) {
                dVar = rx.d.a((d.a) new d.a<Desc>() { // from class: com.sankuai.waimai.store.pagingload.c.6
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
                    @Override // rx.functions.b
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* synthetic */ void call(java.lang.Object r20) {
                        /*
                            r19 = this;
                            r7 = r19
                            r8 = r20
                            rx.j r8 = (rx.j) r8
                            r9 = 1
                            java.lang.Object[] r10 = new java.lang.Object[r9]
                            r11 = 0
                            r10[r11] = r8
                            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.store.pagingload.c.AnonymousClass6.a
                            java.lang.String r13 = "af4fe6084c0720d1b63167869ac1ccad"
                            r3 = 0
                            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r0 = r10
                            r1 = r19
                            r2 = r12
                            r4 = r13
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
                            if (r0 == 0) goto L22
                            com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r12, r11, r13)
                            return
                        L22:
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$e r0 = com.sankuai.waimai.store.pagingload.c.b(r0)
                            r1 = 0
                            if (r0 == 0) goto L50
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$e r0 = com.sankuai.waimai.store.pagingload.c.b(r0)
                            java.lang.Object r2 = r2
                            boolean r0 = r0.a(r2)
                            if (r0 == 0) goto L50
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$d r0 = com.sankuai.waimai.store.pagingload.c.h(r0)
                            if (r0 != 0) goto L43
                        L41:
                            r0 = r1
                            goto L65
                        L43:
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$d r0 = com.sankuai.waimai.store.pagingload.c.h(r0)
                            java.lang.Object r2 = r2
                            java.lang.Object r0 = r0.a(r2)
                            goto L65
                        L50:
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$a r0 = com.sankuai.waimai.store.pagingload.c.i(r0)
                            if (r0 != 0) goto L59
                            goto L41
                        L59:
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            com.sankuai.waimai.store.pagingload.a$a r0 = com.sankuai.waimai.store.pagingload.c.i(r0)
                            java.lang.Object r2 = r2
                            java.lang.Object r0 = r0.a(r2)
                        L65:
                            if (r0 == 0) goto L7c
                            android.util.Pair[] r1 = r3
                            int r2 = r4
                            android.util.Pair r3 = new android.util.Pair
                            int r4 = r4
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                            r3.<init>(r4, r0)
                            r1[r2] = r3
                            r8.onNext(r0)
                            return
                        L7c:
                            com.sankuai.waimai.store.pagingload.c r0 = com.sankuai.waimai.store.pagingload.c.this
                            java.lang.String r0 = com.sankuai.waimai.store.pagingload.c.d(r0)
                            java.lang.Object[] r2 = new java.lang.Object[r9]
                            r2[r11] = r0
                            com.meituan.robust.ChangeQuickRedirect r3 = com.sankuai.waimai.store.pagingload.d.a
                            java.lang.String r4 = "495717103a380c9e3036b5f5366a4b1a"
                            r13 = 0
                            r15 = 1
                            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r12 = r2
                            r14 = r3
                            r16 = r4
                            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)
                            if (r5 == 0) goto L9c
                            com.meituan.robust.PatchProxy.accessDispatch(r2, r1, r3, r9, r4)
                            return
                        L9c:
                            boolean r2 = android.text.TextUtils.isEmpty(r0)
                            if (r2 != 0) goto La7
                            com.sankuai.waimai.store.pagingload.AgileLoadErrorType r2 = com.sankuai.waimai.store.pagingload.AgileLoadErrorType.DescNull
                            com.sankuai.waimai.store.util.monitor.c.a(r2, r1, r0)
                        La7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.pagingload.c.AnonymousClass6.call(java.lang.Object):void");
                    }
                }).b(rx.schedulers.a.a(ac.a()));
                this.q.add(dVar);
            }
        }
        if (dVar == null) {
            return;
        }
        this.k = rx.d.a((Iterable<? extends rx.d<?>>) this.q, (rx.functions.k) new rx.functions.k<List<Desc>>() { // from class: com.sankuai.waimai.store.pagingload.c.7
            @Override // rx.functions.k
            public final /* bridge */ /* synthetic */ Object call(Object[] objArr2) {
                return null;
            }
        }).a(rx.android.schedulers.a.a()).a(new rx.functions.b<List<Desc>>() { // from class: com.sankuai.waimai.store.pagingload.c.8
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                Object[] objArr2 = {(List) obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb2c2394946e31680a4eba0ff6b9c4fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb2c2394946e31680a4eba0ff6b9c4fb");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (pairArr != null) {
                    Pair[] pairArr2 = pairArr;
                    int length = pairArr2.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        Pair pair = pairArr2[i4];
                        Object obj2 = pair == null ? null : pair.second;
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                }
                b.b(c.this.l, i2);
                if (c.this.h != null) {
                    c.this.h.a(arrayList, i2);
                }
                if (runnable == null) {
                    b.a(c.this.l);
                    c.this.d();
                    return;
                }
                runnable.run();
            }
        }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.store.pagingload.c.9
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09a631e19c24dc97634fcf4a3a0da9e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09a631e19c24dc97634fcf4a3a0da9e5");
                    return;
                }
                d.a(c.this.e, th2);
                if (c.this.h != null) {
                    c.this.h.a(2, th2, c.this.s);
                    c.this.d();
                }
            }
        });
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd7bd8a06c3e942a57d5bd16ed98db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd7bd8a06c3e942a57d5bd16ed98db7");
            return;
        }
        if (this.j && this.h != null) {
            this.h.b();
        }
        if (this.k != null && !this.k.isUnsubscribed()) {
            this.k.unsubscribe();
        }
        this.r.clear();
        this.j = false;
    }
}
