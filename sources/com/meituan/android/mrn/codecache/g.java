package com.meituan.android.mrn.codecache;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.bridge.JSCodeCacheCreator;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.utils.k;
import com.meituan.android.mrn.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.mrn.utils.worker.c {
    public static ChangeQuickRedirect a;
    private c f;
    private com.meituan.android.mrn.engine.e g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.meituan.android.mrn.codecache.c r13, com.meituan.android.mrn.engine.e r14) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mrn.codecache.g.a
            java.lang.String r11 = "681c576a552ce0b7a3f91dd46c15844d"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r1 = 0
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r8, r1, r10, r0, r11)
            java.lang.String r1 = (java.lang.String) r1
            goto L36
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cc_"
            r1.<init>(r2)
            if (r14 != 0) goto L2b
            java.lang.String r2 = ""
            goto L2f
        L2b:
            java.lang.String r2 = r14.i()
        L2f:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L36:
            r12.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r9] = r13
            r1[r0] = r14
            com.meituan.robust.ChangeQuickRedirect r0 = com.meituan.android.mrn.codecache.g.a
            java.lang.String r10 = "d8d517f802cd421f8d1d791927a72eb8"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r1
            r3 = r12
            r4 = r0
            r6 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L55
            com.meituan.robust.PatchProxy.accessDispatch(r1, r12, r0, r9, r10)
            return
        L55:
            r12.g = r14
            r12.f = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.codecache.g.<init>(com.meituan.android.mrn.codecache.c, com.meituan.android.mrn.engine.e):void");
    }

    @Override // com.meituan.android.mrn.utils.worker.c
    public final void a() {
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f793c06da00069667d117de87dbab1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f793c06da00069667d117de87dbab1a");
            return;
        }
        final c cVar = this.f;
        com.meituan.android.mrn.engine.e eVar = this.g;
        int i = 1;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bbee7e888ed26240363a34fff615b748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bbee7e888ed26240363a34fff615b748");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "7a57129ad52044e34610647dd1fe75fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "7a57129ad52044e34610647dd1fe75fa");
        } else {
            b bVar = b.b;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            int intValue = (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "9ecf7934e519e280db955f308dcfb410", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "9ecf7934e519e280db955f308dcfb410")).intValue() : ((Integer) t.b.a("CodeCache.storageQuota")).intValue()) * 1024 * 1024;
            Object[] objArr5 = {Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "355930cf120092f2c01fda89b51725ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "355930cf120092f2c01fda89b51725ea");
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = c.a;
                long longValue = PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "90a2461367f41157ce2704d5257304a6", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "90a2461367f41157ce2704d5257304a6")).longValue() : cVar.d.a();
                long j = intValue;
                if (longValue > j) {
                    List<String> a2 = com.meituan.android.mrn.monitor.b.a().a(c.b);
                    PriorityQueue priorityQueue = new PriorityQueue(cVar.d.b(), new Comparator<Pair<e, Integer>>() { // from class: com.meituan.android.mrn.codecache.c.2
                        public static ChangeQuickRedirect a;

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Pair<e, Integer> pair, Pair<e, Integer> pair2) {
                            Pair<e, Integer> pair3 = pair;
                            Pair<e, Integer> pair4 = pair2;
                            int i2 = 0;
                            Object[] objArr7 = {pair3, pair4};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1886ecb895a42f827c0b12bdb6f25a23", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Integer) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1886ecb895a42f827c0b12bdb6f25a23")).intValue();
                            }
                            int intValue2 = ((Integer) pair3.second).intValue();
                            int intValue3 = ((Integer) pair4.second).intValue();
                            e eVar2 = (e) pair3.first;
                            e eVar3 = (e) pair4.first;
                            if (eVar2 == eVar3) {
                                return 0;
                            }
                            Comparable[] comparableArr = {Integer.valueOf(intValue2), Integer.valueOf(intValue3), eVar2, eVar3};
                            Object[] objArr8 = {comparableArr};
                            ChangeQuickRedirect changeQuickRedirect8 = z.a;
                            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "b261a00a1509b31b15ca31a07dc6930f", RobustBitConfig.DEFAULT_VALUE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "b261a00a1509b31b15ca31a07dc6930f")).intValue();
                            } else {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    Comparable comparable = comparableArr[i3];
                                    Comparable comparable2 = comparableArr[i3 + 1];
                                    if (comparable != comparable2) {
                                        i2 = z.a(comparable, comparable2);
                                        break;
                                    }
                                    i3 += 2;
                                }
                            }
                            return -i2;
                        }
                    });
                    for (e eVar2 : cVar.d.c()) {
                        priorityQueue.add(new Pair(eVar2, Integer.valueOf(a2.indexOf(eVar2.b))));
                    }
                    int b = cVar.d.b();
                    b bVar2 = b.b;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b.a;
                    int intValue2 = b - (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "629b42d295b497600e30315a3f6e358f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "629b42d295b497600e30315a3f6e358f")).intValue() : Math.abs(((Integer) t.b.a("CodeCache.minCodeCacheFileCount")).intValue()));
                    for (int i2 = 0; i2 < intValue2; i2++) {
                        Pair pair = (Pair) priorityQueue.poll();
                        if (pair == null) {
                            break;
                        }
                        e eVar3 = (e) pair.first;
                        cVar.a(eVar3.b, eVar3.c, 0);
                        longValue -= eVar3.d;
                        if (longValue < j) {
                            break;
                        }
                    }
                    i = 1;
                }
            }
        }
        Object[] objArr8 = new Object[i];
        objArr8[0] = eVar;
        ChangeQuickRedirect changeQuickRedirect8 = c.a;
        if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "db8f91a6df068b385d5a3ee3af25b021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "db8f91a6df068b385d5a3ee3af25b021");
        } else {
            File a3 = cVar.a(eVar.i());
            com.facebook.common.logging.a.b("CodeCacheManager", String.format("Create code cache: %s_%s, CodeCacheFile: %s, success: %s", eVar.c, eVar.f, a3, Boolean.valueOf(JSCodeCacheCreator.createCodeCacheFromDioFile(eVar.m, "index.js", eVar.e(), a3.toString()))));
        }
        String i3 = eVar.i();
        if (cVar.d(eVar.i())) {
            long f = k.f(cVar.b(i3));
            if (f > 0) {
                e eVar4 = new e();
                eVar4.b = eVar.c;
                eVar4.c = eVar.f;
                Object[] objArr9 = {new Long(f)};
                ChangeQuickRedirect changeQuickRedirect9 = e.a;
                if (PatchProxy.isSupport(objArr9, eVar4, changeQuickRedirect9, false, "913b858d799a9ab50e2f823b46115b56", RobustBitConfig.DEFAULT_VALUE)) {
                    c = 0;
                    e eVar5 = (e) PatchProxy.accessDispatch(objArr9, eVar4, changeQuickRedirect9, false, "913b858d799a9ab50e2f823b46115b56");
                } else {
                    c = 0;
                    eVar4.d = f;
                }
                f fVar = cVar.d;
                Object[] objArr10 = new Object[1];
                objArr10[c] = eVar4;
                ChangeQuickRedirect changeQuickRedirect10 = f.a;
                if (PatchProxy.isSupport(objArr10, fVar, changeQuickRedirect10, false, "58684b4d97a0c632add5da4e78ca8eaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, fVar, changeQuickRedirect10, false, "58684b4d97a0c632add5da4e78ca8eaf");
                    return;
                }
                String a4 = com.meituan.android.mrn.engine.e.a(eVar4.b, eVar4.c);
                if (TextUtils.isEmpty(a4)) {
                    return;
                }
                fVar.b.put(a4, eVar4);
            }
        }
    }
}
