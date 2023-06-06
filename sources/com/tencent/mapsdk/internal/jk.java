package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.mapsdk.internal.ji;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jk {
    ky a = new ky();
    private ConcurrentHashMap<String, Map<String, ji>> b = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <D extends com.tencent.mapsdk.internal.jj, C extends com.tencent.mapsdk.internal.ji<D>> C a(java.lang.Class<D> r12, com.tencent.mapsdk.internal.ji.a r13, java.lang.Class<C> r14) {
        /*
            r11 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.ji>> r0 = r11.b
            java.lang.String r1 = r14.getName()
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = r12.getName()
            r1.append(r12)
            java.lang.String r12 = r13.toString()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r12 = com.tencent.mapsdk.internal.jm.a(r12)
            java.lang.String r1 = r14.getName()
            r2 = 0
            if (r0 == 0) goto L37
            java.lang.Object r3 = r0.get(r12)
            com.tencent.mapsdk.internal.ji r3 = (com.tencent.mapsdk.internal.ji) r3
            if (r3 == 0) goto L38
            return r3
        L37:
            r3 = r2
        L38:
            java.lang.reflect.Constructor[] r14 = r14.getDeclaredConstructors()
            int r4 = r14.length
            r5 = 0
            r6 = r2
            r2 = 0
        L40:
            r7 = 1
            if (r2 >= r4) goto L58
            r8 = r14[r2]
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r10 = r9.length
            if (r10 != r7) goto L55
            r7 = r9[r5]
            java.lang.Class r9 = r13.getClass()
            if (r7 != r9) goto L55
            r6 = r8
        L55:
            int r2 = r2 + 1
            goto L40
        L58:
            if (r6 == 0) goto L73
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L6a java.lang.IllegalAccessException -> L6f
            r14[r5] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L6a java.lang.IllegalAccessException -> L6f
            java.lang.Object r13 = r6.newInstance(r14)     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L6a java.lang.IllegalAccessException -> L6f
            com.tencent.mapsdk.internal.ji r13 = (com.tencent.mapsdk.internal.ji) r13     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L6a java.lang.IllegalAccessException -> L6f
            goto L74
        L65:
            r13 = move-exception
            r13.printStackTrace()
            goto L73
        L6a:
            r13 = move-exception
            r13.printStackTrace()
            goto L73
        L6f:
            r13 = move-exception
            r13.printStackTrace()
        L73:
            r13 = r3
        L74:
            if (r13 == 0) goto L85
            if (r0 != 0) goto L7d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L7d:
            r0.put(r12, r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.ji>> r12 = r11.b
            r12.put(r1, r0)
        L85:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.jk.a(java.lang.Class, com.tencent.mapsdk.internal.ji$a, java.lang.Class):com.tencent.mapsdk.internal.ji");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<D extends jj> extends kr<String, D> {
        private ji.b<D> a;

        @Override // com.tencent.mapsdk.internal.kr
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            jj jjVar = (jj) obj;
            if (jjVar != null) {
                return jjVar.a();
            }
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.mapsdk.internal.kr
        public final /* bridge */ /* synthetic */ void a(boolean z, @NonNull Object obj) {
            jj jjVar = (jj) obj;
            if (!z || this.a == null) {
                return;
            }
            this.a.a(jjVar);
        }

        public a(int i, ji.b<D> bVar) {
            super(i);
            this.a = bVar;
        }

        private static int a(D d) {
            if (d != null) {
                return d.a();
            }
            return 0;
        }

        private void a(boolean z, @NonNull D d) {
            if (!z || this.a == null) {
                return;
            }
            this.a.a(d);
        }
    }

    private String a(String str) {
        return this.a.a(str);
    }
}
