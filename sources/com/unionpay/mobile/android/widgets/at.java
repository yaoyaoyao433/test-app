package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import com.meituan.android.recce.props.gens.MaxLength;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class at extends aa {
    private int c;

    public at(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.c = 0;
        String a = com.unionpay.mobile.android.utils.j.a(jSONObject, MaxLength.LOWER_CASE_NAME);
        this.c = (a == null || a.length() <= 0) ? 23 : Integer.getInteger(a).intValue();
        this.b.a(new InputFilter.LengthFilter(this.c));
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return this.i || this.c >= a().length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_text";
    }
}
