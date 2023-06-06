package com.unionpay.mobile.android.pro.views;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class aa implements View.OnClickListener {
    final /* synthetic */ y a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.model.b bVar;
        JSONObject jSONObject = (JSONObject) view.getTag();
        String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "errMsg");
        if (a != null && !TextUtils.isEmpty(a)) {
            this.a.a(a);
            return;
        }
        String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "action");
        String a3 = com.unionpay.mobile.android.utils.j.a(jSONObject, "value");
        bVar = this.a.a;
        String str = bVar.br ? "10" : "2";
        y yVar = this.a;
        y.a(yVar, a2, a3 + ",\"carrier_tp\":" + str);
    }
}
