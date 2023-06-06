package com.sankuai.xm.imui.common.processors;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    private static final Pattern c = Pattern.compile("^@\\[(-1|\\d+(,\\d+)*|\\(\\d+(,\\d+)*\\))\\|((?!\\s).)+]\\s$");
    public int b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d910f3f9678bdc1048667cba5dcf619", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d910f3f9678bdc1048667cba5dcf619");
        } else {
            this.b = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[EDGE_INSN: B:22:0x0095->B:21:0x0095 ?: BREAK  , SYNTHETIC] */
    @Override // com.sankuai.xm.imui.common.processors.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(java.lang.CharSequence r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.imui.common.processors.a.a
            java.lang.String r11 = "bdee4fed9e1b66e27bdc3dfb0ab2a0b7"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            return r13
        L1e:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r13)
            r13 = 0
        L24:
            java.lang.String r2 = "@["
            int r2 = android.text.TextUtils.indexOf(r1, r2, r9)
            if (r2 < 0) goto L90
            java.lang.String r13 = "] "
            int r13 = android.text.TextUtils.indexOf(r1, r13, r2)
            if (r13 <= r2) goto L90
            int r3 = r13 + 2
            java.lang.String r4 = android.text.TextUtils.substring(r1, r2, r3)
            java.util.regex.Pattern r5 = com.sankuai.xm.imui.common.processors.a.c
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r4 = r4.find()
            if (r4 != 0) goto L48
            r9 = r13
            goto L91
        L48:
            r4 = 124(0x7c, float:1.74E-43)
            int r5 = r2 + 2
            int r4 = android.text.TextUtils.indexOf(r1, r4, r5, r13)
            java.lang.String r5 = android.text.TextUtils.substring(r1, r5, r4)
            int r4 = r4 + r0
            java.lang.String r4 = android.text.TextUtils.substring(r1, r4, r13)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "@"
            r6.<init>(r7)
            r6.append(r4)
            r7 = 32
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.sankuai.xm.imui.common.view.c r7 = new com.sankuai.xm.imui.common.view.c
            r7.<init>(r6)
            java.lang.String r8 = "uid"
            r7.a(r8, r5)
            java.lang.String r5 = "name"
            r7.a(r5, r4)
            int r4 = r12.b
            if (r4 <= 0) goto L83
            int r4 = r12.b
            r7.c = r4
        L83:
            r1.replace(r2, r3, r6)
            int r3 = r6.length()
            int r3 = r3 + r2
            r4 = 33
            r1.setSpan(r7, r2, r3, r4)
        L90:
            r9 = r2
        L91:
            if (r9 < 0) goto L95
            if (r13 > r9) goto L24
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.processors.a.a(java.lang.CharSequence):java.lang.CharSequence");
    }

    public final CharSequence a(CharSequence charSequence, long j) {
        Object[] objArr = {charSequence, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88353d37ac674cb525c0baea310df93", 6917529027641081856L)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88353d37ac674cb525c0baea310df93");
        }
        return a("@[" + j + '|' + ((Object) charSequence) + "] ");
    }

    public final CharSequence a(CharSequence charSequence, long[] jArr) {
        Object[] objArr = {charSequence, jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2bbf1d75a3620920ffd8b861117680", 6917529027641081856L)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2bbf1d75a3620920ffd8b861117680");
        }
        if (jArr == null || jArr.length <= 0) {
            return charSequence;
        }
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BRACKET_LEFT);
        for (long j : jArr) {
            sb.append(Long.valueOf(j));
            sb.append(CommonConstant.Symbol.COMMA);
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return a("@[" + ((Object) sb) + '|' + ((Object) charSequence) + "] ");
    }
}
