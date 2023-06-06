package com.dianping.sdk.pike.agg;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.sdk.pike.agg.d;
import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.service.q;
import com.dianping.sdk.pike.service.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.dianping.sdk.pike.c implements d.a {
    public static ChangeQuickRedirect q;
    final c r;
    public e s;
    final AtomicReference<EnumC0117a> t;
    volatile String u;
    volatile long v;
    volatile d w;
    Runnable x;
    private volatile long y;

    public static /* synthetic */ void a(a aVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "032d4bc3ad1530bdff715b32c7bbe23b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "032d4bc3ad1530bdff715b32c7bbe23b");
        } else {
            com.dianping.nvtunnelkit.core.c.a().a(aVar.x, j);
        }
    }

    public static /* synthetic */ void a(a aVar, d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "874e6ea78d5203ab7929c3214942d380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "874e6ea78d5203ab7929c3214942d380");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.c.a;
        if ((PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d88754111dd2171ff5ba082724d3e3a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d88754111dd2171ff5ba082724d3e3a9")).booleanValue() : aVar.a((com.dianping.sdk.pike.a) null)) && aVar.g() && aVar.d != null) {
            final String str = aVar.u;
            final long j = aVar.v;
            com.dianping.sdk.pike.packet.d dVar2 = new com.dianping.sdk.pike.packet.d();
            dVar2.a = aVar.r.b;
            dVar2.b = str;
            dVar2.e = aVar.r.e;
            dVar2.f = aVar.r.c;
            if (dVar != null) {
                dVar2.c = dVar.d;
                dVar2.d = dVar.e;
                dVar2.g = dVar.f;
                dVar2.h = dVar.g;
                dVar.g = 0;
                dVar.f = 0;
            } else {
                dVar2.c = -1L;
                dVar2.d = "-1";
                dVar2.g = 0;
                dVar2.h = 0;
            }
            i.a("PikeAggClient", "###### fetchMessages  ->", " aggId: " + dVar2.b, " latestTimestamp: " + dVar2.c, " latestMessageId: " + dVar2.d, " count: " + dVar2.e, " alias: " + dVar2.f, " lastReceiveCount: " + dVar2.g, " lastReceiveValidCount: " + dVar2.h, " joinTimestamp: " + j);
            com.dianping.sdk.pike.a aVar2 = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.agg.a.7
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.a
                public final void a(String str2) {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f60a49929d2b5eac873c826f96227730", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f60a49929d2b5eac873c826f96227730");
                    } else if (com.dianping.nvtunnelkit.utils.f.b(a.this.u) && a.this.u.equals(str) && a.this.v == j) {
                        a.a(a.this, 50L);
                    }
                }

                @Override // com.dianping.sdk.pike.a
                public final void a(int i, String str2) {
                    Object[] objArr3 = {Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3478de95a666dad4adbcf3b27c4d969b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3478de95a666dad4adbcf3b27c4d969b");
                    } else if (com.dianping.nvtunnelkit.utils.f.b(a.this.u) && a.this.u.equals(str) && a.this.v == j) {
                        if (i == -64) {
                            a.a(a.this, 0L);
                        } else {
                            a.a(a.this, 1000L);
                        }
                    }
                }
            };
            long j2 = 10000;
            if (dVar != null && dVar.i > 10) {
                j2 = dVar.i * 1000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.y > j2 && !NVLinker.isAppBackground()) {
                com.dianping.sdk.pike.util.f.a("pike_agg_tunnel_state", aVar.d.i() ? 200 : -200, 0, 0, (int) j2, "", "", "");
                aVar.y = currentTimeMillis;
            }
            long j3 = aVar.r.f * 1000;
            if (dVar != null && dVar.h > 0) {
                j3 = dVar.h * 1000;
            }
            long j4 = j3;
            q qVar = aVar.d;
            Object[] objArr3 = {dVar2, new Long(j4), aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = q.a;
            if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "bdcbb32df25c32bc602ac27eac8c1dd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "bdcbb32df25c32bc602ac27eac8c1dd5");
            } else {
                qVar.a(dVar2, j4, com.dianping.sdk.pike.f.w, aVar2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.sdk.pike.agg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0117a {
        Left,
        Leaving,
        Joining,
        Joined;
        
        public static ChangeQuickRedirect a;

        EnumC0117a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad34bfae2c4ab4077064cf2cb0fe2c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad34bfae2c4ab4077064cf2cb0fe2c9");
            }
        }

        public static EnumC0117a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3054b17b971c4cf0f94aa398cc971f1c", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0117a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3054b17b971c4cf0f94aa398cc971f1c") : (EnumC0117a) Enum.valueOf(EnumC0117a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0117a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17e1b36eee0da93af5888731a51758f6", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0117a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17e1b36eee0da93af5888731a51758f6") : (EnumC0117a[]) values().clone();
        }
    }

    public static a a(Context context, c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcb4576a7f0ba834d7bb9b5a5cebf917", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcb4576a7f0ba834d7bb9b5a5cebf917");
        }
        if (context == null || cVar == null) {
            return null;
        }
        return new a(context, cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a(android.content.Context r11, com.dianping.sdk.pike.agg.c r12) {
        /*
            r10 = this;
            com.dianping.sdk.pike.e$a r0 = new com.dianping.sdk.pike.e$a
            r0.<init>()
            java.lang.String r1 = r12.b
            com.dianping.sdk.pike.e$a r0 = r0.a(r1)
            java.lang.String r1 = r12.c
            com.dianping.sdk.pike.e$a r0 = r0.b(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.d
            com.dianping.sdk.pike.e$a r0 = r0.a(r1)
            java.util.concurrent.ExecutorService r1 = r12.g
            r0.b = r1
            com.dianping.sdk.pike.e r0 = r0.a()
            r10.<init>(r11, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r11 = 1
            r0[r11] = r12
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.sdk.pike.agg.a.q
            java.lang.String r9 = "e88474204a22e1b834764cfd6519f247"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r10
            r3 = r11
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L40
            com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r11, r8, r9)
            return
        L40:
            java.lang.String r11 = ""
            r10.u = r11
            r0 = -1
            r10.v = r0
            r10.y = r0
            com.dianping.sdk.pike.agg.a$6 r11 = new com.dianping.sdk.pike.agg.a$6
            r11.<init>()
            r10.x = r11
            r10.r = r12
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference
            com.dianping.sdk.pike.agg.a$a r12 = com.dianping.sdk.pike.agg.a.EnumC0117a.Left
            r11.<init>(r12)
            r10.t = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.sdk.pike.agg.a.<init>(android.content.Context, com.dianping.sdk.pike.agg.c):void");
    }

    public final void b(String str, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb8194a2b0244282ad4ce8e90887e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb8194a2b0244282ad4ce8e90887e8a");
        } else if (a(aVar)) {
            if (com.dianping.nvtunnelkit.utils.f.a(str)) {
                a(aVar, -73, "agg join fail, aggId is empty or null");
            } else {
                c(str, aVar);
            }
        }
    }

    private void c(String str, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3df44978562e114069869181e46eb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3df44978562e114069869181e46eb4a");
        } else if (this.t.compareAndSet(EnumC0117a.Left, EnumC0117a.Joining)) {
            d(str, aVar);
        } else if (h()) {
            a(aVar, -74, "agg join fail, please wait last join or leave finish");
        } else if (g()) {
            e(str, aVar);
        } else {
            a(aVar, -70, "agg join fail");
        }
    }

    private void d(final String str, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c357125ce33e341a634425ff861f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c357125ce33e341a634425ff861f03");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.agg.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5d762e68db42a75318ffae0f4967696", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5d762e68db42a75318ffae0f4967696");
                        return;
                    }
                    com.dianping.sdk.pike.packet.f fVar = new com.dianping.sdk.pike.packet.f();
                    fVar.b = a.this.c.a;
                    fVar.c = str;
                    fVar.d = 1;
                    a.this.d.a(fVar, new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.agg.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str2) {
                            Object[] objArr3 = {str2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d74c0c9f9662838f6a36c595f3addb3b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d74c0c9f9662838f6a36c595f3addb3b");
                                return;
                            }
                            a.this.t.set(EnumC0117a.Joined);
                            a.this.u = str;
                            a.this.v = System.currentTimeMillis();
                            a.a(a.this, 0L);
                            if (aVar != null) {
                                aVar.a(str2);
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str2) {
                            Object[] objArr3 = {Integer.valueOf(i), str2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c4d493bd3a150acd7687904fb001031", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c4d493bd3a150acd7687904fb001031");
                                return;
                            }
                            a.this.t.set(EnumC0117a.Left);
                            if (aVar != null) {
                                aVar.a(i, str2);
                            }
                        }
                    });
                }
            }, aVar);
        }
    }

    private void e(@NonNull final String str, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "196491d275ffe1b1d1ba4c6bbffa2f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "196491d275ffe1b1d1ba4c6bbffa2f07");
        } else if (str.equals(this.u)) {
            a(aVar, "agg join success, repeated join ");
        } else {
            b(new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.agg.a.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.a
                public final void a(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca468fb51aba5d4515aceae0581effdf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca468fb51aba5d4515aceae0581effdf");
                    } else {
                        a.this.b(str, aVar);
                    }
                }

                @Override // com.dianping.sdk.pike.a
                public final void a(int i, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f765f1eda73c39054a95cd3e24ca811", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f765f1eda73c39054a95cd3e24ca811");
                    } else {
                        a.this.a(aVar, -75, "agg join fail");
                    }
                }
            });
        }
    }

    public final void b(com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c094842d4bb2f98acdca1fa8652870d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c094842d4bb2f98acdca1fa8652870d");
        } else if (a(aVar)) {
            c(aVar);
        }
    }

    private void c(com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a45f49b5814f4197113e0e3e266d70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a45f49b5814f4197113e0e3e266d70");
        } else if (this.t.compareAndSet(EnumC0117a.Joined, EnumC0117a.Leaving)) {
            d(aVar);
        } else if (h()) {
            a(aVar, -74, "agg leave fail, please wait last join or leave finish");
        } else if (i()) {
            a(aVar, "agg leave success");
        } else {
            a(aVar, -71, "agg leave fail");
        }
    }

    private void d(final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091c6ddc75066dd4729ba85f4a9b5e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091c6ddc75066dd4729ba85f4a9b5e9f");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.agg.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01be5402649a7d8ef6aef984dd42d02b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01be5402649a7d8ef6aef984dd42d02b");
                        return;
                    }
                    com.dianping.sdk.pike.packet.f fVar = new com.dianping.sdk.pike.packet.f();
                    fVar.b = a.this.c.a;
                    fVar.c = a.this.u;
                    fVar.d = 0;
                    a.this.d.a(fVar, new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.agg.a.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "572deb772dadb566b4fc9afe0a7dc4c9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "572deb772dadb566b4fc9afe0a7dc4c9");
                                return;
                            }
                            a.this.t.set(EnumC0117a.Left);
                            a.this.u = "";
                            a.this.w = null;
                            a aVar2 = a.this;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.q;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "06cfdfd80eb67b4675721dcdd8223734", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "06cfdfd80eb67b4675721dcdd8223734");
                            } else {
                                com.dianping.nvtunnelkit.core.c.a().b(aVar2.x);
                            }
                            if (aVar != null) {
                                aVar.a(str);
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d99b55ad700c028398ee0cd5350d5c76", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d99b55ad700c028398ee0cd5350d5c76");
                                return;
                            }
                            a.this.t.set(EnumC0117a.Joined);
                            if (aVar != null) {
                                aVar.a(i, str);
                            }
                        }
                    });
                }
            }, aVar);
        }
    }

    @Override // com.dianping.sdk.pike.agg.d.a
    public final void a(final d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efff05079ef05a26264ae5ce568226dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efff05079ef05a26264ae5ce568226dc");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.dianping.sdk.pike.agg.a.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccf2f24b218046a94b060f2fb12a9e88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccf2f24b218046a94b060f2fb12a9e88");
                } else if (dVar != null && a.this.g() && a.this.u.equals(dVar.c)) {
                    a.this.w = dVar;
                    if (a.this.s == null || dVar.j.isEmpty()) {
                        return;
                    }
                    a aVar = a.this;
                    d dVar2 = dVar;
                    Object[] objArr3 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.q;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9aca01836b2559eb487b4225a9a3757b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9aca01836b2559eb487b4225a9a3757b");
                    } else {
                        try {
                            i.a("PikeAggClient", "###### recvFetchMessages  ->", " bzId: " + dVar2.b, " aggId: " + dVar2.c, " latestMessageId: " + dVar2.e, " latestTimestamp: " + dVar2.d);
                            if (com.dianping.sdk.pike.f.g()) {
                                i.a("PikeAggClient", "recv agg message, bzId: " + dVar2.b + " aggId: " + dVar2.c + " messageIds: " + dVar2.k.toString());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    a.this.s.a(dVar.j);
                }
            }
        };
        if (this.c.d != null) {
            this.c.d.execute(runnable);
        } else {
            com.dianping.sdk.pike.service.c.a().a(runnable);
        }
    }

    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43087efc1cc109d4dcc7afe153643a56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43087efc1cc109d4dcc7afe153643a56")).booleanValue() : this.t.get().equals(EnumC0117a.Joined);
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0359aa41d2b0a4dbe35562e3a0512569", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0359aa41d2b0a4dbe35562e3a0512569")).booleanValue() : this.t.get().equals(EnumC0117a.Joining) || this.t.get().equals(EnumC0117a.Leaving);
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88df139fa9d291b037a5b3e9d698a57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88df139fa9d291b037a5b3e9d698a57")).booleanValue() : this.t.get().equals(EnumC0117a.Left);
    }

    @Override // com.dianping.sdk.pike.c
    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc06552d41b65623d4b5cd8d853985af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc06552d41b65623d4b5cd8d853985af");
            return;
        }
        b a = b.a();
        Object[] objArr2 = {str, this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "24b87c25a7eae6ba7a5ef665b443122b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "24b87c25a7eae6ba7a5ef665b443122b");
        } else if (!com.dianping.nvtunnelkit.utils.f.a(str)) {
            synchronized (a.b) {
                if (a.b.containsKey(str)) {
                    a.b.get(str).e();
                }
                a.b.put(str, this);
            }
        }
        if (this.d != null) {
            final r rVar = this.d.j;
            Object[] objArr3 = {str, this};
            ChangeQuickRedirect changeQuickRedirect3 = r.a;
            if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "8ef75599affdef8b2b71d59c1b3b796d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "8ef75599affdef8b2b71d59c1b3b796d");
            } else if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            } else {
                rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        List<d.a> arrayList;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "60043a807f7ea9b3f7a7f60394260d5c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "60043a807f7ea9b3f7a7f60394260d5c");
                            return;
                        }
                        if (r.this.e.containsKey(str)) {
                            com.dianping.sdk.pike.i.a("ReceiverManager", "bizId: " + str + " agg receiver registered, do overwrite the previous.");
                            arrayList = r.this.e.get(str);
                        } else {
                            arrayList = new ArrayList<>();
                            r.this.e.put(str, arrayList);
                        }
                        if (arrayList.contains(this)) {
                            return;
                        }
                        arrayList.add(this);
                    }
                });
            }
        }
    }

    @Override // com.dianping.sdk.pike.c
    public final void c(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa2b30cb21eb0081818b5126ade37fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa2b30cb21eb0081818b5126ade37fd");
            return;
        }
        c((com.dianping.sdk.pike.a) null);
        b a = b.a();
        Object[] objArr2 = {str, this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "0c1cfb5b12e6b35da9f0af11fcc00009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "0c1cfb5b12e6b35da9f0af11fcc00009");
        } else if (!com.dianping.nvtunnelkit.utils.f.a(str)) {
            synchronized (a.b) {
                if (a.b.containsKey(str)) {
                    a.b.remove(str);
                }
            }
        }
        if (this.d != null) {
            final r rVar = this.d.j;
            Object[] objArr3 = {str, this};
            ChangeQuickRedirect changeQuickRedirect3 = r.a;
            if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "d8f2c493af1d77d7efecca6bc1a30c85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "d8f2c493af1d77d7efecca6bc1a30c85");
            } else if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            } else {
                rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fe3e232511a630bf88bb89e15706069c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fe3e232511a630bf88bb89e15706069c");
                            return;
                        }
                        List<d.a> list = r.this.e.get(str);
                        if (list != null) {
                            list.remove(this);
                            if (list.isEmpty()) {
                                r.this.e.remove(str);
                            }
                        }
                    }
                });
            }
        }
    }
}
