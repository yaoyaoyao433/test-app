package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class q extends RelativeLayout {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private RelativeLayout k;
    private Button l;
    private boolean m;
    private Context n;
    private float o;
    private View.OnClickListener p;
    private View.OnClickListener q;
    private String r;
    private TextView s;
    private String t;
    private a u;

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, boolean z);
    }

    public q(Context context, JSONObject jSONObject, String str) {
        this(context, jSONObject, str, (byte) 0);
    }

    private q(Context context, JSONObject jSONObject, String str, byte b) {
        super(context);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = 0.0f;
        this.p = new r(this);
        this.q = new s(this);
        this.n = context;
        this.o = 16.0f;
        this.t = str;
        this.a = com.unionpay.mobile.android.utils.j.a(jSONObject, "name");
        this.b = com.unionpay.mobile.android.utils.j.a(jSONObject, "type");
        this.c = com.unionpay.mobile.android.utils.j.a(jSONObject, "value");
        this.d = com.unionpay.mobile.android.utils.j.a(jSONObject, "label");
        this.e = com.unionpay.mobile.android.utils.j.a(jSONObject, "href_label");
        this.f = com.unionpay.mobile.android.utils.j.a(jSONObject, "href_url");
        this.g = com.unionpay.mobile.android.utils.j.a(jSONObject, "href_title");
        this.h = com.unionpay.mobile.android.utils.j.a(jSONObject, "checked");
        this.i = com.unionpay.mobile.android.utils.j.a(jSONObject, "required");
        this.j = com.unionpay.mobile.android.utils.j.a(jSONObject, "error_info");
        this.r = com.unionpay.mobile.android.utils.j.a(jSONObject, "ckb_style");
        this.k = new RelativeLayout(this.n);
        addView(this.k, new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n));
        if (a(this.d)) {
            this.s = new TextView(this.n);
            this.s.setId(this.s.hashCode());
            this.s.setText(this.d);
            this.s.setTextSize(this.o);
            this.s.setTextColor(-16777216);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9, -1);
            layoutParams.addRule(15, -1);
            this.k.addView(this.s, layoutParams);
        }
        this.l = new Button(this.n);
        this.l.setId(this.l.hashCode());
        if (a(this.h) && this.h.equalsIgnoreCase("0")) {
            this.m = true;
        } else {
            this.m = false;
        }
        this.l.setOnClickListener(this.p);
        c();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.utils.g.a(this.n, 60.0f), com.unionpay.mobile.android.utils.g.a(this.n, 34.0f));
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(15, -1);
        this.k.addView(this.l, layoutParams2);
        if (this.u != null) {
            this.u.a(this.b, this.m);
        }
        if (a(this.e) && a(this.f)) {
            TextView textView = new TextView(this.n);
            textView.setText(Html.fromHtml(this.e));
            textView.setTextSize(com.unionpay.mobile.android.global.b.l);
            textView.setOnClickListener(this.q);
            textView.setTextColor(com.unionpay.mobile.android.utils.h.a(-10705958, -5846275, -5846275, -6710887));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(1, this.s.getId());
            layoutParams3.addRule(15, -1);
            layoutParams3.leftMargin = com.unionpay.mobile.android.utils.g.a(this.n, 10.0f);
            this.k.addView(textView, layoutParams3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(q qVar) {
        qVar.m = !qVar.m;
        String str = qVar.m ? Constants.GestureMoveEvent.KEY_Y : "n";
        String[] strArr = com.unionpay.mobile.android.utils.o.g;
        new String[1][0] = str;
        if (qVar.u != null) {
            qVar.u.a(qVar.b, qVar.m);
        }
        qVar.c();
    }

    private static boolean a(String str) {
        return str != null && str.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(q qVar) {
        if (qVar.u != null) {
            qVar.u.a(qVar.e, qVar.f);
        }
    }

    private void c() {
        if (this.l == null) {
            return;
        }
        this.l.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(this.n).a(this.m ? 1010 : 1009, com.unionpay.mobile.android.utils.g.a(this.n, 60.0f), com.unionpay.mobile.android.utils.g.a(this.n, 34.0f)));
    }

    public final void a() {
        if (this.s != null) {
            this.s.setTextColor(-13421773);
        }
    }

    public final void a(float f) {
        if (this.s != null) {
            this.s.setTextSize(f);
        }
    }

    public final void a(a aVar) {
        this.u = aVar;
    }

    public final void a(boolean z) {
        this.m = z;
        c();
    }

    public final boolean b() {
        if (a(this.i) && this.i.equalsIgnoreCase("0")) {
            return this.m;
        }
        return true;
    }
}
