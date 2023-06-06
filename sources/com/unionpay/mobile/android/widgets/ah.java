package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ah extends aa {
    private a c;
    private String o;
    private String p;

    /* loaded from: classes6.dex */
    public interface a {
        void e(String str);
    }

    public ah(Context context, int i, JSONObject jSONObject, String str) {
        this(context, i, jSONObject, str, (byte) 0);
    }

    private ah(Context context, int i, JSONObject jSONObject, String str, byte b) {
        super(context, i, jSONObject, str);
        this.c = null;
        this.o = null;
        this.p = null;
        this.o = com.unionpay.mobile.android.utils.j.a(jSONObject, "button_label");
        this.p = com.unionpay.mobile.android.utils.j.a(jSONObject, "button_action");
        this.b.a(new InputFilter.LengthFilter(11));
        this.b.a(2);
        if (this.o == null || this.o.length() <= 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.b.n);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.b.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(this.o);
        textView.setTextColor(-7829368);
        textView.setTextSize(com.unionpay.mobile.android.global.b.k);
        textView.setOnClickListener(new ai(this));
        this.b.a(textView, new LinearLayout.LayoutParams(-2, -1));
    }

    @Override // com.unionpay.mobile.android.widgets.aa, com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        return this.b.b();
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        if (this.i) {
            return true;
        }
        return (this.j == null || TextUtils.isEmpty(this.j)) ? 11 == a().length() && a().startsWith("1") : a().matches(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_phoneNO";
    }
}
