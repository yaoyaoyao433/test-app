package com.meituan.mmp.lib.pip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    NONE,
    PUSH,
    POP,
    PUSH_AND_POP;
    
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return i == 1 || i == 16;
    }

    a() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71db9dc5615f4450a4eeaf4a0f414bf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71db9dc5615f4450a4eeaf4a0f414bf9");
        }
    }

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7871d3655792669a7614f24a6198ad77", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7871d3655792669a7614f24a6198ad77") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66bbe4db8db62dcf93d90ee8ce6f7df3", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66bbe4db8db62dcf93d90ee8ce6f7df3") : (a[]) values().clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r12.equals("push") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.mmp.lib.pip.a a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.pip.a.a
            java.lang.String r11 = "8a2a1d14d70a7950cd9ab7362a2f3d28"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.mmp.lib.pip.a r12 = (com.meituan.mmp.lib.pip.a) r12
            return r12
        L1f:
            java.lang.String r12 = r12.trim()
            r1 = -1
            int r2 = r12.hashCode()
            if (r2 == 0) goto L5a
            r3 = 111185(0x1b251, float:1.55803E-40)
            if (r2 == r3) goto L4f
            r3 = 3452698(0x34af1a, float:4.83826E-39)
            if (r2 == r3) goto L45
            r0 = 1077886132(0x403f3cb4, float:2.98808)
            if (r2 == r0) goto L3a
            goto L64
        L3a:
            java.lang.String r0 = "pushAndPop"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 2
            goto L65
        L45:
            java.lang.String r2 = "push"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L64
            goto L65
        L4f:
            java.lang.String r0 = "pop"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 0
            goto L65
        L5a:
            java.lang.String r0 = ""
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 3
            goto L65
        L64:
            r0 = -1
        L65:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L6e;
                case 2: goto L6b;
                default: goto L68;
            }
        L68:
            com.meituan.mmp.lib.pip.a r12 = com.meituan.mmp.lib.pip.a.NONE
            return r12
        L6b:
            com.meituan.mmp.lib.pip.a r12 = com.meituan.mmp.lib.pip.a.PUSH_AND_POP
            return r12
        L6e:
            com.meituan.mmp.lib.pip.a r12 = com.meituan.mmp.lib.pip.a.PUSH
            return r12
        L71:
            com.meituan.mmp.lib.pip.a r12 = com.meituan.mmp.lib.pip.a.POP
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.pip.a.a(java.lang.String):com.meituan.mmp.lib.pip.a");
    }

    public static boolean a(boolean z, a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a20805f079b217d27e64121d4d1f5db9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a20805f079b217d27e64121d4d1f5db9")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (aVar.equals(PUSH_AND_POP)) {
            return true;
        }
        if (z && aVar.equals(PUSH)) {
            return true;
        }
        return !z && aVar.equals(POP);
    }
}
