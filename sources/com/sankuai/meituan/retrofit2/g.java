package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static int a(String str, int i, int i2) {
        Object[] objArr = {str, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94525aa12955105c4941349509693589", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94525aa12955105c4941349509693589")).intValue();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3;
            }
        }
        return i2;
    }

    public static int b(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bcd8c945050f2965a375ee8f9c5225b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bcd8c945050f2965a375ee8f9c5225b")).intValue();
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    public static int a(String str, int i, int i2, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a96288df68abd94013b23e54ae91adc", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a96288df68abd94013b23e54ae91adc")).intValue();
        }
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae596b349de2a039cbc8ca6b06e9832f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae596b349de2a039cbc8ca6b06e9832f")).intValue();
        }
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.meituan.retrofit2.g.a
            java.lang.String r12 = "8877534d7d275e76564d06855dd60a82"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r11, r0, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1e:
            java.lang.String r1 = java.net.IDN.toASCII(r17)     // Catch: java.lang.IllegalArgumentException -> L75
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L75
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch: java.lang.IllegalArgumentException -> L75
            boolean r3 = r1.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L75
            if (r3 == 0) goto L2f
            return r2
        L2f:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.IllegalArgumentException -> L75
            r3[r9] = r1     // Catch: java.lang.IllegalArgumentException -> L75
            com.meituan.robust.ChangeQuickRedirect r4 = com.sankuai.meituan.retrofit2.g.a     // Catch: java.lang.IllegalArgumentException -> L75
            java.lang.String r5 = "02ac4cd96173d0ce439518b15b3252e3"
            r11 = 0
            r13 = 1
            r15 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r10 = r3
            r12 = r4
            r14 = r5
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.IllegalArgumentException -> L75
            if (r6 == 0) goto L4f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r2, r4, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L75
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.IllegalArgumentException -> L75
            boolean r0 = r0.booleanValue()     // Catch: java.lang.IllegalArgumentException -> L75
            goto L71
        L4f:
            r3 = 0
        L50:
            int r4 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L75
            if (r3 >= r4) goto L70
            char r4 = r1.charAt(r3)     // Catch: java.lang.IllegalArgumentException -> L75
            r5 = 31
            if (r4 <= r5) goto L71
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 < r5) goto L63
            goto L71
        L63:
            java.lang.String r5 = " #%/:?@[\\]"
            int r4 = r5.indexOf(r4)     // Catch: java.lang.IllegalArgumentException -> L75
            r5 = -1
            if (r4 == r5) goto L6d
            goto L71
        L6d:
            int r3 = r3 + 1
            goto L50
        L70:
            r0 = 0
        L71:
            if (r0 == 0) goto L74
            return r2
        L74:
            return r1
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.g.a(java.lang.String):java.lang.String");
    }

    public static String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "c1dfc04932e7007137c4bd9dbb105eb0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "c1dfc04932e7007137c4bd9dbb105eb0") : String.format(Locale.US, str, objArr);
    }
}
