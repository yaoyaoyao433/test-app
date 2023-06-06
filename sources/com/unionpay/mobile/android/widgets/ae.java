package com.unionpay.mobile.android.widgets;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ae extends aa {
    public ae(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return this.i || a().length() != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_name";
    }
}
