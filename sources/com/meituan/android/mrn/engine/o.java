package com.meituan.android.mrn.engine;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o {
    public static ChangeQuickRedirect a = null;
    private static final String c = "o";
    private static volatile o d;
    public final List<MRNInstanceRecord> b;
    private final Queue<k> e;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d86acc7289e6fd35d4874af7ec740c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d86acc7289e6fd35d4874af7ec740c");
            return;
        }
        this.e = new PriorityQueue(4, new Comparator<k>() { // from class: com.meituan.android.mrn.engine.o.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(k kVar, k kVar2) {
                k kVar3 = kVar;
                k kVar4 = kVar2;
                Object[] objArr2 = {kVar3, kVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b13218ccb817a8c57b49df0f482262e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b13218ccb817a8c57b49df0f482262e1")).intValue() : (int) (kVar3.c - kVar4.c);
            }
        });
        this.b = new ArrayList();
    }

    public static o a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffb44d133b508011a93d371fcb2fc823", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffb44d133b508011a93d371fcb2fc823");
        }
        if (d == null) {
            synchronized (o.class) {
                if (d == null) {
                    d = new o();
                }
            }
        }
        return d;
    }

    public final Queue<k> b() {
        PriorityQueue priorityQueue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73d95923214263894e7c583f9606306", RobustBitConfig.DEFAULT_VALUE)) {
            return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73d95923214263894e7c583f9606306");
        }
        synchronized (this.e) {
            priorityQueue = new PriorityQueue(this.e);
        }
        return priorityQueue;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7cb2235bd7fe58e5809429d1a7af04a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7cb2235bd7fe58e5809429d1a7af04a")).intValue() : this.e.size();
    }

    public final void a(MRNInstanceRecord mRNInstanceRecord) {
        Object[] objArr = {mRNInstanceRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d5e77c2aca7c232cf992b19bdbf82b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d5e77c2aca7c232cf992b19bdbf82b1");
            return;
        }
        for (MRNInstanceRecord mRNInstanceRecord2 : this.b) {
            if (mRNInstanceRecord2.equals(mRNInstanceRecord)) {
                mRNInstanceRecord2.pageExitTime = mRNInstanceRecord.pageExitTime;
                com.meituan.android.mrn.utils.p.a("[MRNInstancePool@updateInstanceRecord]", String.format("引擎管理-页面退出前保存pageExitTime：%s, start=%d, end=%d", mRNInstanceRecord2.bundleName, Long.valueOf(mRNInstanceRecord2.pageEnterTime), Long.valueOf(mRNInstanceRecord2.pageExitTime)));
            }
        }
    }

    public final List<MRNInstanceRecord> d() {
        List<MRNInstanceRecord> list;
        synchronized (this.b) {
            list = this.b;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x008b, TryCatch #0 {, blocks: (B:8:0x0021, B:9:0x0027, B:11:0x002d, B:13:0x0035, B:15:0x0039, B:17:0x0041, B:19:0x0045, B:23:0x004f, B:24:0x006c, B:21:0x004b, B:26:0x006e), top: B:32:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.android.mrn.engine.k a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mrn.engine.o.a
            java.lang.String r11 = "4257023fc0d794f398ee3def623fbf1d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.meituan.android.mrn.engine.k r13 = (com.meituan.android.mrn.engine.k) r13
            return r13
        L1e:
            java.util.Queue<com.meituan.android.mrn.engine.k> r1 = r12.e
            monitor-enter(r1)
            java.util.Queue<com.meituan.android.mrn.engine.k> r2 = r12.e     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8b
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8b
            com.meituan.android.mrn.engine.k r3 = (com.meituan.android.mrn.engine.k) r3     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L4b
            java.lang.String r4 = r3.k     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L4b
            java.lang.String r4 = r3.k     // Catch: java.lang.Throwable -> L8b
            boolean r4 = android.text.TextUtils.equals(r4, r13)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L4b
            com.facebook.react.ReactInstanceManager r4 = r3.b     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L4b
            com.meituan.android.mrn.engine.p r4 = r3.f     // Catch: java.lang.Throwable -> L8b
            com.meituan.android.mrn.engine.p r5 = com.meituan.android.mrn.engine.p.ERROR     // Catch: java.lang.Throwable -> L8b
            if (r4 != r5) goto L4f
        L4b:
            com.facebook.react.ReactInstanceManager r4 = r3.b     // Catch: java.lang.Throwable -> L8b
            if (r4 != 0) goto L27
        L4f:
            java.lang.String r2 = "[MRNInstancePool@getInstance]"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            r4.append(r13)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r13 = ","
            r4.append(r13)     // Catch: java.lang.Throwable -> L8b
            r4.append(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L8b
            r0[r9] = r13     // Catch: java.lang.Throwable -> L8b
            com.meituan.android.mrn.utils.p.a(r2, r0)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            return r3
        L6e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "[MRNInstancePool@getInstance]"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r13 = ",return instance null"
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0[r9] = r13
            com.meituan.android.mrn.utils.p.a(r1, r0)
            r13 = 0
            return r13
        L8b:
            r13 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.o.a(java.lang.String):com.meituan.android.mrn.engine.k");
    }

    public final k e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e4265785a2c312f3e0c97c62f6cb8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e4265785a2c312f3e0c97c62f6cb8a");
        }
        synchronized (this.e) {
            for (k kVar : this.e) {
                if (kVar != null && kVar.k == null && kVar.b != null) {
                    com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getEmptyInstance]", kVar);
                    return kVar;
                }
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getEmptyInstance]", "return null");
            return null;
        }
    }

    public final k b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f85e31139176976e2142f31737cf8e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f85e31139176976e2142f31737cf8e1");
        }
        synchronized (this.e) {
            for (k kVar : this.e) {
                if (kVar != null && !kVar.o && !TextUtils.isEmpty(kVar.k) && TextUtils.equals(kVar.k, str) && kVar.b != null && kVar.f != p.ERROR) {
                    com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getDirtyInstance]", str + CommonConstant.Symbol.COMMA + kVar);
                    return kVar;
                }
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getDirtyInstance]", str + ",return instance null");
            return null;
        }
    }

    public final k a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "990ec2b454afcc8d08244cf8e3f89374", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "990ec2b454afcc8d08244cf8e3f89374");
        }
        synchronized (this.e) {
            for (k kVar : this.e) {
                if (kVar != null && !kVar.o && kVar.i != null && TextUtils.equals(str, kVar.i.c) && TextUtils.equals(str2, kVar.i.f) && kVar.b != null && kVar.f != p.ERROR) {
                    com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getDirtyInstance]", str + CommonConstant.Symbol.COMMA + kVar);
                    return kVar;
                }
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getDirtyInstance]", str + ",return instance null");
            return null;
        }
    }

    public final int f() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6131bf402a88b2cf438f4e4085c8504e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6131bf402a88b2cf438f4e4085c8504e")).intValue();
        }
        synchronized (this.e) {
            i = 0;
            for (k kVar : this.e) {
                if (kVar != null && kVar.b != null && kVar.f == p.DIRTY) {
                    i++;
                }
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getDirtyInstanceCount]", "count=", Integer.valueOf(i));
        }
        return i;
    }

    public final int g() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02429297eabfdbbe53b518217055a19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02429297eabfdbbe53b518217055a19")).intValue();
        }
        synchronized (this.e) {
            i = 0;
            for (k kVar : this.e) {
                if (kVar != null && kVar.b != null && kVar.f == p.USED) {
                    i++;
                }
            }
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@getUsedInstanceCount]", "count=", Integer.valueOf(i));
        }
        return i;
    }

    public final k h() {
        k kVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300abc8fa6536334afcb502a61ec6b37", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300abc8fa6536334afcb502a61ec6b37");
        }
        synchronized (this.e) {
            kVar = new k();
            this.e.add(kVar);
            com.meituan.android.mrn.utils.p.a("[MRNInstancePool@createInstance]", "return " + kVar);
        }
        return kVar;
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694ab559d02d8a2ec86af9fdfbe79984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694ab559d02d8a2ec86af9fdfbe79984");
        } else if (kVar != null) {
            synchronized (this.e) {
                Iterator<k> it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() == kVar) {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    public final k a(e eVar) {
        e eVar2;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45379a997f0daf1c0b074034a7b0f500", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45379a997f0daf1c0b074034a7b0f500");
        }
        if (eVar == null || TextUtils.isEmpty(eVar.c) || TextUtils.isEmpty(eVar.f)) {
            return null;
        }
        synchronized (this.e) {
            for (k kVar : this.e) {
                if (kVar != null && (eVar2 = kVar.i) != null && TextUtils.equals(eVar.c, eVar2.c) && TextUtils.equals(eVar.f, eVar2.f)) {
                    return kVar;
                }
            }
            return null;
        }
    }
}
