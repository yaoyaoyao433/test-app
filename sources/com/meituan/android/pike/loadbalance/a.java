package com.meituan.android.pike.loadbalance;

import android.content.Context;
import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.android.pike.bean.PikeSharedPreference;
import com.meituan.android.pike.inner.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public com.meituan.android.pike.manager.a c;
    long d;
    HashMap<String, ArrayList<String>> e;
    HashMap<String, Long> f;
    private String g;
    private long h;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pike.loadbalance.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0343a {
        public static final a a = new a();
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8d5ba5efa1efc6e62d7ef9e7bea85b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8d5ba5efa1efc6e62d7ef9e7bea85b3c");
        } else if (aVar.e.isEmpty()) {
            if (aVar.f.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, Long>> it = aVar.f.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, Long> next = it.next();
                aVar.g = next.getKey();
                aVar.h = next.getValue().longValue();
            }
            while (it.hasNext()) {
                Map.Entry<String, Long> next2 = it.next();
                if (next2.getValue().longValue() < aVar.h) {
                    aVar.g = next2.getKey();
                    aVar.h = next2.getValue().longValue();
                }
            }
            Context context = aVar.b;
            PikeSharedPreference.put(context, "hight_url_" + aVar.c.f.toString(), aVar.g);
            PikeSharedPreference.put(aVar.b, aVar.g, Long.valueOf(aVar.h));
        } else {
            Iterator<Map.Entry<String, ArrayList<String>>> it2 = aVar.e.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry<String, ArrayList<String>> next3 = it2.next();
                aVar.e.remove(next3.getKey());
                final String key = next3.getKey();
                Object[] objArr2 = {key};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "831ebcc193c8492a77033e47e39f6788", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "831ebcc193c8492a77033e47e39f6788");
                    return;
                }
                PikeLog.d("LoadBalanceManager:", "startMeasureConnection " + key);
                PikeClient.a aVar2 = new PikeClient.a();
                aVar2.f = false;
                final com.meituan.android.pike.inner.a aVar3 = new com.meituan.android.pike.inner.a(aVar2, key);
                aVar3.a(new c() { // from class: com.meituan.android.pike.loadbalance.a.2
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
                        if (r13.equals("error") != false) goto L17;
                     */
                    @Override // com.meituan.android.pike.inner.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.String r13, java.lang.Object... r14) {
                        /*
                            r12 = this;
                            r0 = 2
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            r9 = 0
                            r8[r9] = r13
                            r10 = 1
                            r8[r10] = r14
                            com.meituan.robust.ChangeQuickRedirect r14 = com.meituan.android.pike.loadbalance.a.AnonymousClass2.a
                            java.lang.String r11 = "d910d4c5e90e7ba79d4eb2d77302973b"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r8
                            r2 = r12
                            r3 = r14
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L1e
                            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r14, r9, r11)
                            return
                        L1e:
                            java.lang.String r14 = "LoadBalanceManager:"
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "emitterListenerResut "
                            r1.<init>(r2)
                            r1.append(r13)
                            java.lang.String r1 = r1.toString()
                            com.meituan.android.pike.bean.PikeLog.d(r14, r1)
                            r14 = -1
                            int r1 = r13.hashCode()
                            r2 = -808593805(0xffffffffcfcdd673, float:-6.9067668E9)
                            if (r1 == r2) goto L68
                            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
                            if (r1 == r2) goto L5f
                            r0 = 495510284(0x1d88e30c, float:3.623366E-21)
                            if (r1 == r0) goto L55
                            r0 = 951351530(0x38b478ea, float:8.605591E-5)
                            if (r1 == r0) goto L4b
                            goto L72
                        L4b:
                            java.lang.String r0 = "connect"
                            boolean r13 = r13.equals(r0)
                            if (r13 == 0) goto L72
                            r0 = 0
                            goto L73
                        L55:
                            java.lang.String r0 = "connect_timeout"
                            boolean r13 = r13.equals(r0)
                            if (r13 == 0) goto L72
                            r0 = 3
                            goto L73
                        L5f:
                            java.lang.String r1 = "error"
                            boolean r13 = r13.equals(r1)
                            if (r13 == 0) goto L72
                            goto L73
                        L68:
                            java.lang.String r0 = "connect_error"
                            boolean r13 = r13.equals(r0)
                            if (r13 == 0) goto L72
                            r0 = 1
                            goto L73
                        L72:
                            r0 = -1
                        L73:
                            switch(r0) {
                                case 0: goto L77;
                                case 1: goto L8d;
                                case 2: goto L8d;
                                case 3: goto L8d;
                                default: goto L76;
                            }
                        L76:
                            goto L97
                        L77:
                            long r13 = java.lang.System.currentTimeMillis()
                            com.meituan.android.pike.loadbalance.a r0 = com.meituan.android.pike.loadbalance.a.this
                            long r0 = r0.d
                            long r13 = r13 - r0
                            com.meituan.android.pike.loadbalance.a r0 = com.meituan.android.pike.loadbalance.a.this
                            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r0.f
                            java.lang.String r1 = r2
                            java.lang.Long r13 = java.lang.Long.valueOf(r13)
                            r0.put(r1, r13)
                        L8d:
                            com.meituan.android.pike.inner.a r13 = r3
                            r13.b()
                            com.meituan.android.pike.loadbalance.a r13 = com.meituan.android.pike.loadbalance.a.this
                            com.meituan.android.pike.loadbalance.a.a(r13)
                        L97:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pike.loadbalance.a.AnonymousClass2.a(java.lang.String, java.lang.Object[]):void");
                    }
                });
                aVar.d = System.currentTimeMillis();
                aVar3.a();
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71260372d97d1619e1c4f4684609b743", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71260372d97d1619e1c4f4684609b743");
            return;
        }
        this.d = 0L;
        this.e = new HashMap<>();
        this.f = new HashMap<>();
    }
}
