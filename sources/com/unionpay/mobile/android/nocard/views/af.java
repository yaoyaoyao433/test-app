package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unionpay.mobile.android.upviews.a;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class af extends b implements a.b {
    private TextView r;
    private View.OnClickListener s;
    private com.unionpay.mobile.android.upviews.a t;
    private int u;

    public af(Context context) {
        super(context);
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = 0;
        this.f = 12;
        this.s = new ag(this);
        setBackgroundColor(-1052684);
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(af afVar) {
        afVar.u = 1;
        a.C1512a b = afVar.t.b();
        if (!b.a()) {
            afVar.a(b.b);
            return;
        }
        afVar.j = false;
        afVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        afVar.e.m(b.b);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        if (this.u != 1) {
            return;
        }
        this.b.c();
        com.unionpay.mobile.android.nocard.utils.f.c(this.a, jSONObject);
        int b = com.unionpay.mobile.android.nocard.utils.f.b(this.a, jSONObject);
        if (b != 0) {
            b(b);
            return;
        }
        if (this.t != null) {
            this.t.f();
        }
        d(13);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.r != null) {
            this.r.setEnabled(!z);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(this.d, com.unionpay.mobile.android.languages.c.bD.m, this);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void c() {
        this.o.a(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, -1);
        layoutParams.topMargin = com.unionpay.mobile.android.global.a.f;
        this.t = new com.unionpay.mobile.android.upviews.a(this.d, this.a.X, this, "");
        boolean z = true;
        this.t.setOrientation(1);
        this.t.setId(this.t.hashCode());
        this.m.addView(this.t, layoutParams);
        com.unionpay.mobile.android.upwidget.w a = com.unionpay.mobile.android.upwidget.w.a(this.d, this.a.Y, this.c.a(1017, -1, -1));
        if (a != null) {
            a.setId(a.hashCode());
            a.a(new ah(this, a.a()));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(3, this.t.getId());
            int i = com.unionpay.mobile.android.global.a.d;
            layoutParams2.bottomMargin = i;
            layoutParams2.topMargin = i;
            layoutParams2.leftMargin = com.unionpay.mobile.android.global.a.d;
            this.m.addView(a, layoutParams2);
        }
        this.r = new TextView(this.d);
        this.r.setText(com.unionpay.mobile.android.languages.c.bD.n);
        this.r.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.r.setTextColor(o());
        this.r.setGravity(17);
        TextView textView = this.r;
        if (this.t != null && !this.t.e()) {
            z = false;
        }
        textView.setEnabled(z);
        int i2 = com.unionpay.mobile.android.global.a.n;
        this.r.setBackgroundDrawable(this.c.a(2008, -1, -1));
        this.r.setOnClickListener(this.s);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i2);
        layoutParams3.addRule(3, a != null ? a.getId() : this.t.getId());
        layoutParams3.topMargin = com.unionpay.mobile.android.global.a.f;
        this.m.addView(this.r, layoutParams3);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }
}
