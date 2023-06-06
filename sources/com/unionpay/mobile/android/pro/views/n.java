package com.unionpay.mobile.android.pro.views;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class n implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JSONObject jSONObject = (JSONObject) view.getTag();
        String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "errMsg");
        if (a != null && !TextUtils.isEmpty(a)) {
            this.a.a(a);
            return;
        }
        String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "action");
        String a3 = com.unionpay.mobile.android.utils.j.a(jSONObject, "value");
        k kVar = this.a;
        k.a(kVar, a2, a3 + ",\"carrier_tp\":\"7\"");
    }
}
