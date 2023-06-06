package com.unionpay.mobile.android.widgets;

import android.view.View;
/* loaded from: classes6.dex */
public final class l implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(k kVar) {
        this.a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[LOOP:0: B:17:0x007f->B:19:0x0085, LOOP_END] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.unionpay.mobile.android.widgets.k r0 = r5.a
            boolean r0 = com.unionpay.mobile.android.widgets.k.a(r0)
            r1 = 0
            if (r0 == 0) goto L90
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.unionpay.mobile.android.widgets.k r2 = r5.a     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.a()     // Catch: org.json.JSONException -> L6e
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L6e
            r3 = 1
            if (r2 != 0) goto L5b
            com.unionpay.mobile.android.widgets.k r2 = r5.a     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.a()     // Catch: org.json.JSONException -> L6e
            java.lang.String r4 = "[A-Za-z0-9]{8,32}"
            boolean r2 = r2.matches(r4)     // Catch: org.json.JSONException -> L6e
            if (r2 == 0) goto L45
            com.unionpay.mobile.android.widgets.k r1 = r5.a     // Catch: org.json.JSONException -> L6e
            r1.a(r3)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "value"
            com.unionpay.mobile.android.widgets.k r2 = r5.a     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.h()     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = "action"
            com.unionpay.mobile.android.widgets.k r2 = r5.a     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = com.unionpay.mobile.android.widgets.k.b(r2)     // Catch: org.json.JSONException -> L6e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            goto L72
        L45:
            com.unionpay.mobile.android.languages.c r2 = com.unionpay.mobile.android.languages.c.bD     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.aD     // Catch: org.json.JSONException -> L6e
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L6e
            com.unionpay.mobile.android.languages.c r4 = com.unionpay.mobile.android.languages.c.bD     // Catch: org.json.JSONException -> L6e
            java.lang.String r4 = r4.C     // Catch: org.json.JSONException -> L6e
            r3[r1] = r4     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = java.lang.String.format(r2, r3)     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = "errMsg"
        L57:
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L6e
            goto L72
        L5b:
            com.unionpay.mobile.android.languages.c r2 = com.unionpay.mobile.android.languages.c.bD     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = r2.aC     // Catch: org.json.JSONException -> L6e
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L6e
            com.unionpay.mobile.android.languages.c r4 = com.unionpay.mobile.android.languages.c.bD     // Catch: org.json.JSONException -> L6e
            java.lang.String r4 = r4.C     // Catch: org.json.JSONException -> L6e
            r3[r1] = r4     // Catch: org.json.JSONException -> L6e
            java.lang.String r1 = java.lang.String.format(r2, r3)     // Catch: org.json.JSONException -> L6e
            java.lang.String r2 = "errMsg"
            goto L57
        L6e:
            r1 = move-exception
            r1.printStackTrace()
        L72:
            r6.setTag(r0)
            com.unionpay.mobile.android.widgets.k r0 = r5.a
            java.util.ArrayList r0 = com.unionpay.mobile.android.widgets.k.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r6)
            goto L7f
        L8f:
            return
        L90:
            com.unionpay.mobile.android.widgets.k r0 = r5.a
            com.unionpay.mobile.android.widgets.u r0 = r0.b
            r0.e()
            com.unionpay.mobile.android.widgets.k r0 = r5.a
            r0.a(r1)
            com.unionpay.mobile.android.widgets.k r0 = r5.a
            java.util.ArrayList r0 = com.unionpay.mobile.android.widgets.k.d(r0)
            java.util.Iterator r0 = r0.iterator()
        La6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r0.next()
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r6)
            goto La6
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.widgets.l.onClick(android.view.View):void");
    }
}
