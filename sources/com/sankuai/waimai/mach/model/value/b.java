package com.sankuai.waimai.mach.model.value;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum b {
    head(TextUtils.TruncateAt.START),
    middle(TextUtils.TruncateAt.MIDDLE),
    end(TextUtils.TruncateAt.END),
    clip(null);
    
    public static ChangeQuickRedirect a;
    public final TextUtils.TruncateAt f;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16ba80650dda8709cf7723e362c87f9b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16ba80650dda8709cf7723e362c87f9b") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa1d35d9086cef24f42fa7baa30035dc", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa1d35d9086cef24f42fa7baa30035dc") : (b[]) values().clone();
    }

    b(TextUtils.TruncateAt truncateAt) {
        Object[] objArr = {r10, Integer.valueOf(r11), truncateAt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82881edb9183105a5e8b49cba27d607c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82881edb9183105a5e8b49cba27d607c");
        } else {
            this.f = truncateAt;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r12.equals("middle") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.b a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.b.a
            java.lang.String r11 = "0803b62683f608ff543b2f23c248a56d"
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
            com.sankuai.waimai.mach.model.value.b r12 = (com.sankuai.waimai.mach.model.value.b) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1074341483: goto L5d;
                case 3056464: goto L53;
                case 3198432: goto L48;
                case 3552336: goto L3d;
                case 844038445: goto L32;
                case 1516766305: goto L28;
                default: goto L27;
            }
        L27:
            goto L67
        L28:
            java.lang.String r0 = "char-wrap"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L67
            r0 = 5
            goto L68
        L32:
            java.lang.String r0 = "word-wrap"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L67
            r0 = 4
            goto L68
        L3d:
            java.lang.String r0 = "tail"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L67
            r0 = 2
            goto L68
        L48:
            java.lang.String r0 = "head"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L67
            r0 = 0
            goto L68
        L53:
            java.lang.String r0 = "clip"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L67
            r0 = 3
            goto L68
        L5d:
            java.lang.String r2 = "middle"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L67
            goto L68
        L67:
            r0 = -1
        L68:
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L8c;
                case 2: goto L89;
                case 3: goto L86;
                case 4: goto L83;
                case 5: goto L80;
                default: goto L6b;
            }
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported mode: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L80:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.clip
            return r12
        L83:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.clip
            return r12
        L86:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.clip
            return r12
        L89:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.end
            return r12
        L8c:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.middle
            return r12
        L8f:
            com.sankuai.waimai.mach.model.value.b r12 = com.sankuai.waimai.mach.model.value.b.head
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.b.a(java.lang.String):com.sankuai.waimai.mach.model.value.b");
    }
}
