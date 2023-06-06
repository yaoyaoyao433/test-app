package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class k extends aa {
    private final String c;
    private ArrayList<View.OnClickListener> o;
    private ArrayList<View.OnClickListener> p;
    private TextView q;
    private boolean r;
    private String s;
    private String t;
    private View.OnClickListener u;

    public k(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.c = "[A-Za-z0-9]{8,32}";
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = null;
        this.r = true;
        this.s = null;
        this.t = null;
        this.u = new l(this);
        this.s = com.unionpay.mobile.android.utils.j.a(jSONObject, "button_label");
        this.t = com.unionpay.mobile.android.utils.j.a(jSONObject, "button_action");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.b.n);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.b.setLayoutParams(layoutParams);
        this.q = new TextView(getContext());
        this.q.setGravity(17);
        this.q.setText(this.s);
        this.q.setTextColor(com.unionpay.mobile.android.utils.h.a(-10705958, -5846275, -5846275, -6710887));
        this.q.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.q.setOnClickListener(this.u);
        a(false);
        this.b.a(this.q, new LinearLayout.LayoutParams(-2, -1));
    }

    public final void a(View.OnClickListener onClickListener) {
        this.o.add(onClickListener);
    }

    public final void a(boolean z) {
        boolean z2;
        if (z) {
            this.q.setText(com.unionpay.mobile.android.languages.c.bD.B);
            z2 = false;
        } else {
            this.q.setText(this.s);
            z2 = true;
        }
        this.r = z2;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.p.add(onClickListener);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return this.i || 6 == a().length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_coupon";
    }
}
