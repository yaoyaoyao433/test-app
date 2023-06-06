package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.submit.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        private static final String[] d = {"<B>", "<h5>", "<highlight>"};
        private static final String[] e = {"</B>", "</h5>", "</highlight>"};
        protected String a;
        protected int b;
        protected int c;

        @NonNull
        public abstract CharacterStyle a();

        public abstract void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e extends a {
        public static ChangeQuickRedirect d;

        public e() {
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        public final void a(String str) {
            this.a = str;
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        @NonNull
        public final CharacterStyle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff46b4591ab2142270453fa261f6e77a", RobustBitConfig.DEFAULT_VALUE) ? (CharacterStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff46b4591ab2142270453fa261f6e77a") : new StyleSpan(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends a {
        public static ChangeQuickRedirect d;

        public b() {
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40b062c6e64b1d01d35892e29ef025b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40b062c6e64b1d01d35892e29ef025b");
            } else {
                this.a = j.a(str, str.indexOf("<B>") + 3, str.indexOf("</B>"));
            }
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        @NonNull
        public final CharacterStyle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d769fbea9e12d91659ed0d3f14a66535", RobustBitConfig.DEFAULT_VALUE) ? (CharacterStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d769fbea9e12d91659ed0d3f14a66535") : new StyleSpan(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d extends a {
        public static ChangeQuickRedirect d;
        private String e;
        private final View.OnClickListener f;

        private d(View.OnClickListener onClickListener) {
            Object[] objArr = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dcf22e73787c2d3540c7028e40a381", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dcf22e73787c2d3540c7028e40a381");
            } else {
                this.f = onClickListener;
            }
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f3558a4b51428ce846bc1f878a118e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f3558a4b51428ce846bc1f878a118e");
                return;
            }
            this.a = j.a(str, str.indexOf("<h5>") + 4, str.indexOf("<link>"));
            this.e = j.a(str, str.indexOf("<link>") + 6, str.indexOf("</link>"));
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        @NonNull
        public final CharacterStyle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83999bb2ffed71fea40b2e182d33e9f", RobustBitConfig.DEFAULT_VALUE)) {
                return (CharacterStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83999bb2ffed71fea40b2e182d33e9f");
            }
            final String str = this.e;
            return new URLSpan(str) { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.RichTextUtils$Hyperlink$1
                public static ChangeQuickRedirect a;

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(@NonNull TextPaint textPaint) {
                    Object[] objArr2 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "897be14c054886453df04a67ae819e18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "897be14c054886453df04a67ae819e18");
                        return;
                    }
                    textPaint.setColor(Color.parseColor("#FF8002"));
                    textPaint.setUnderlineText(false);
                }

                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public void onClick(View view) {
                    String str2;
                    View.OnClickListener onClickListener;
                    View.OnClickListener onClickListener2;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cbe1b0e286029a7eda8ef228b1756ed", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cbe1b0e286029a7eda8ef228b1756ed");
                        return;
                    }
                    Context context = view.getContext();
                    str2 = j.d.this.e;
                    com.sankuai.waimai.foundation.router.a.a(context, str2);
                    onClickListener = j.d.this.f;
                    if (onClickListener != null) {
                        onClickListener2 = j.d.this.f;
                        onClickListener2.onClick(view);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c extends a {
        public static ChangeQuickRedirect d;

        public c() {
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0a19b3e7b637ea526b8797a31d5c94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0a19b3e7b637ea526b8797a31d5c94");
            } else {
                this.a = j.a(str, str.indexOf("<highlight>") + 11, str.indexOf("</highlight>"));
            }
        }

        @Override // com.sankuai.waimai.bussiness.order.confirm.submit.j.a
        @NonNull
        public final CharacterStyle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe044e25afb89d8b2b855a4c22c6d82d", RobustBitConfig.DEFAULT_VALUE) ? (CharacterStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe044e25afb89d8b2b855a4c22c6d82d") : new ForegroundColorSpan(-32768);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r3.equals("<highlight>") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.sankuai.waimai.bussiness.order.confirm.submit.j.a b(@android.support.annotation.NonNull java.lang.String r20, android.view.View.OnClickListener r21) {
        /*
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 0
            r10[r11] = r0
            r12 = 1
            r10[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.waimai.bussiness.order.confirm.submit.j.a
            java.lang.String r14 = "81a6fef2ef7498101418458f93415c61"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r5 = r13
            r7 = r14
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r4, r13, r12, r14)
            com.sankuai.waimai.bussiness.order.confirm.submit.j$a r0 = (com.sankuai.waimai.bussiness.order.confirm.submit.j.a) r0
            return r0
        L25:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.waimai.bussiness.order.confirm.submit.j.a
            java.lang.String r6 = "0e9f332c136868408a6882c40a78aaff"
            r14 = 0
            r16 = 1
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = r3
            r15 = r5
            r17 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18)
            if (r7 == 0) goto L43
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r12, r6)
            java.lang.String r3 = (java.lang.String) r3
            goto L5a
        L43:
            java.lang.String[] r3 = com.sankuai.waimai.bussiness.order.confirm.submit.j.a.b()
            int r5 = r3.length
            r6 = 0
        L49:
            if (r6 >= r5) goto L58
            r7 = r3[r6]
            boolean r8 = r0.startsWith(r7)
            if (r8 == 0) goto L55
            r3 = r7
            goto L5a
        L55:
            int r6 = r6 + 1
            goto L49
        L58:
            java.lang.String r3 = ""
        L5a:
            r5 = -1
            int r6 = r3.hashCode()
            r7 = -85594298(0xfffffffffae5ef46, float:-5.969445E35)
            if (r6 == r7) goto L83
            r2 = 59768(0xe978, float:8.3753E-41)
            if (r6 == r2) goto L79
            r2 = 1889109(0x1cd355, float:2.647206E-39)
            if (r6 == r2) goto L6f
            goto L8c
        L6f:
            java.lang.String r2 = "<h5>"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8c
            r2 = 1
            goto L8d
        L79:
            java.lang.String r2 = "<B>"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8c
            r2 = 0
            goto L8d
        L83:
            java.lang.String r6 = "<highlight>"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L8c
            goto L8d
        L8c:
            r2 = -1
        L8d:
            switch(r2) {
                case 0: goto La3;
                case 1: goto L9c;
                case 2: goto L96;
                default: goto L90;
            }
        L90:
            com.sankuai.waimai.bussiness.order.confirm.submit.j$e r1 = new com.sankuai.waimai.bussiness.order.confirm.submit.j$e
            r1.<init>()
            goto La8
        L96:
            com.sankuai.waimai.bussiness.order.confirm.submit.j$c r1 = new com.sankuai.waimai.bussiness.order.confirm.submit.j$c
            r1.<init>()
            goto La8
        L9c:
            com.sankuai.waimai.bussiness.order.confirm.submit.j$d r2 = new com.sankuai.waimai.bussiness.order.confirm.submit.j$d
            r2.<init>(r1)
            r1 = r2
            goto La8
        La3:
            com.sankuai.waimai.bussiness.order.confirm.submit.j$b r1 = new com.sankuai.waimai.bussiness.order.confirm.submit.j$b
            r1.<init>()
        La8:
            r1.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.submit.j.b(java.lang.String, android.view.View$OnClickListener):com.sankuai.waimai.bussiness.order.confirm.submit.j$a");
    }

    public static SpannableString a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fac0d074c64ae284dfcd6344038ace4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fac0d074c64ae284dfcd6344038ace4b");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return new SpannableString(str);
            }
            ArrayList<a> arrayList = new ArrayList();
            a(str, arrayList, onClickListener);
            StringBuilder sb = new StringBuilder();
            for (a aVar : arrayList) {
                aVar.b = sb.length();
                sb.append(aVar.a);
                aVar.c = sb.length();
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            for (a aVar2 : arrayList) {
                spannableString.setSpan(aVar2.a(), aVar2.b, aVar2.c, 17);
            }
            return spannableString;
        } catch (Exception unused) {
            return new SpannableString(str);
        }
    }

    private static void a(@NonNull String str, List<a> list, View.OnClickListener onClickListener) {
        while (true) {
            Object[] objArr = {str, list, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb5c1542da135d654ebc83c45b62ce11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb5c1542da135d654ebc83c45b62ce11");
                return;
            }
            String[] a2 = a(str);
            if (!TextUtils.isEmpty(a2[0])) {
                list.add(b(a2[0], onClickListener));
            }
            if (!TextUtils.isEmpty(a2[1])) {
                list.add(b(a2[1], onClickListener));
            }
            if (TextUtils.isEmpty(a2[2])) {
                return;
            }
            str = a2[2];
        }
    }

    @NonNull
    private static String[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0e713b228a7f153335b6d4de5eb514a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0e713b228a7f153335b6d4de5eb514a");
        }
        String[] strArr = new String[3];
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        String b2 = b(str);
        if (TextUtils.isEmpty(b2)) {
            strArr[0] = str;
            return strArr;
        }
        int indexOf = str.indexOf(b2);
        strArr[0] = a(str, 0, indexOf);
        strArr[1] = b2;
        strArr[2] = a(str, indexOf + b2.length(), str.length());
        return strArr;
    }

    private static String b(@NonNull String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d4711839d10517a7fa83577b58617c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d4711839d10517a7fa83577b58617c5");
        }
        int c2 = c(str);
        int i2 = -1;
        if (c2 >= 0) {
            i = str.indexOf(a.d[c2]);
            if (i >= 0) {
                i2 = str.indexOf(a.e[c2]) + a.e[c2].length();
            }
        } else {
            i = -1;
        }
        return a(str, i, i2);
    }

    private static int c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ab9cc729297fc6a77ed4916a6a0fed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ab9cc729297fc6a77ed4916a6a0fed")).intValue();
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < a.d.length; i3++) {
            int indexOf = str.indexOf(a.d[i3]);
            if (indexOf >= 0 && (i2 < 0 || indexOf < i2)) {
                i2 = indexOf;
                i = i3;
            }
        }
        return i;
    }

    static String a(@NonNull String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "347ec02c0493ebd591fd22bcacf41334", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "347ec02c0493ebd591fd22bcacf41334");
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        return i2 - i < 0 ? "" : str.substring(i, i2);
    }
}
