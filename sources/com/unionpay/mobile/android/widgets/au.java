package com.unionpay.mobile.android.widgets;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class au extends aa {
    public au(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        if (this.i) {
            return true;
        }
        String a = a() != null ? a() : "";
        return (this.j == null || this.j.length() <= 0) ? a.length() > 0 && a.length() <= 64 : a.matches(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "login_user";
    }
}
