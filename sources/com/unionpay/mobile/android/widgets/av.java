package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import java.util.Calendar;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class av extends aa {
    public av(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.b.a(new InputFilter.LengthFilter(4));
        this.b.a(2);
    }

    @Override // com.unionpay.mobile.android.widgets.aa, com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        return this.b.b().trim();
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        String a = a();
        if (4 == a.length()) {
            int parseInt = Integer.parseInt(a.substring(0, 2));
            int parseInt2 = Integer.parseInt(a.substring(2));
            int i = Calendar.getInstance().get(1) % 100;
            if (parseInt > 0 && parseInt <= 12 && (parseInt2 > i || (parseInt2 == i && parseInt >= Calendar.getInstance().get(2) + 1))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_select_availdata";
    }
}
