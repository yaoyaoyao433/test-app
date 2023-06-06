package com.unionpay.mobile.android.widgets;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ao extends aa {
    public ao(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.b.a(129);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        String a = a();
        return a != null && a.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "login_pwd";
    }
}
