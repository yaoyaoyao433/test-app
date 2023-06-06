package com.unionpay.mobile.android.nocard.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.liteav.TXLiteAVCode;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.plugin.BaseActivity;
import com.unionpay.mobile.android.upwidget.UPScrollView;
import com.unionpay.mobile.android.widgets.UPWidget;
import com.unionpay.mobile.android.widgets.aa;
import com.unionpay.mobile.android.widgets.ay;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class b extends RelativeLayout implements UPPayEngine.a, a, UPScrollView.a, aa.a, ay.a {
    public com.unionpay.mobile.android.model.b a;
    public com.unionpay.mobile.android.widgets.m b;
    protected com.unionpay.mobile.android.resource.c c;
    public Context d;
    public UPPayEngine e;
    protected int f;
    protected String g;
    protected String h;
    protected String i;
    public boolean j;
    protected RelativeLayout k;
    protected ViewGroup l;
    protected RelativeLayout m;
    protected com.unionpay.mobile.android.widgets.as n;
    protected UPScrollView o;
    protected com.unionpay.mobile.android.model.e p;
    public String q;
    private LinearLayout r;
    private LinearLayout s;
    private LinearLayout t;
    private int u;
    private int v;
    private Activity w;

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = true;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = "uppay";
        this.w = null;
        this.f = 0;
        this.d = context;
        if (this.d instanceof Activity) {
            this.w = (Activity) this.d;
        }
        this.p = eVar;
        BaseActivity baseActivity = (BaseActivity) context;
        this.e = (UPPayEngine) baseActivity.a(UPPayEngine.class.toString());
        this.a = (com.unionpay.mobile.android.model.b) baseActivity.a((String) null);
        this.b = (com.unionpay.mobile.android.widgets.m) baseActivity.a(com.unionpay.mobile.android.widgets.m.class.toString());
        this.c = com.unionpay.mobile.android.resource.c.a(context);
        setId(8888);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(-1);
        com.unionpay.mobile.android.utils.k.b("uppayEx", "UPViewBase:" + toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(int i, boolean z, boolean z2) {
        BaseActivity baseActivity = (BaseActivity) this.d;
        b bVar = null;
        switch (i) {
            case 2:
            case 17:
            case 18:
                bVar = baseActivity.a(i, null);
                break;
            case 5:
                bVar = new g(this.d);
                break;
            case 6:
                int i2 = 0;
                if (this.a.q != null && this.a.q.size() > 0) {
                    i2 = this.a.q.get(this.a.N).c();
                }
                if ((!h() && i2 != 0) || this.a.br) {
                    i = 6;
                    bVar = baseActivity.a(i, null);
                    break;
                } else {
                    bVar = new at(this.d);
                    break;
                }
                break;
            case 8:
                bVar = new bd(this.d);
                break;
            case 10:
                bVar = new ak(this.d);
                break;
            case 11:
                bVar = new ai(this.d);
                break;
            case 12:
                bVar = new af(this.d);
                break;
            case 13:
                bVar = new o(this.d, null);
                break;
            case 14:
                bVar = new bi(this.d, z, z2);
                break;
        }
        if (bVar != null) {
            baseActivity.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean b(String str) {
        return str != null && str.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ColorStateList o() {
        int i = com.unionpay.mobile.android.global.b.b;
        int i2 = com.unionpay.mobile.android.global.b.c;
        return com.unionpay.mobile.android.utils.h.a(i, i2, i2, com.unionpay.mobile.android.global.b.d);
    }

    private RelativeLayout r() {
        LinearLayout linearLayout;
        int i;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.k != null) {
            layoutParams.addRule(3, this.k.getId());
            layoutParams.addRule(12, -1);
        }
        FrameLayout frameLayout = new FrameLayout(this.d);
        addView(frameLayout, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.o = new UPScrollView(this.d);
        this.o.setPadding(0, 0, 0, 0);
        frameLayout.addView(this.o, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.t = new LinearLayout(this.d);
        this.t.setId(this.t.hashCode());
        this.t.setOrientation(1);
        if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
            linearLayout = this.t;
            i = -267336;
        } else {
            linearLayout = this.t;
            i = -34177;
        }
        linearLayout.setBackgroundColor(i);
        this.t.setPadding(a, a, a, a);
        String str = "";
        if (b(this.a.ar)) {
            str = "" + this.a.ar;
        }
        if (b(str)) {
            TextView textView = new TextView(this.d);
            if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
                textView.setTextColor(-10066330);
            } else {
                textView.setTextColor(-1);
            }
            textView.setText(str);
            textView.setTextSize(com.unionpay.mobile.android.global.b.k);
            this.t.addView(textView);
        } else {
            this.t.setVisibility(8);
        }
        this.t.setVisibility(8);
        frameLayout.addView(this.t, layoutParams3);
        RelativeLayout relativeLayout = new RelativeLayout(this.d);
        relativeLayout.setBackgroundColor(-1052684);
        this.o.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RelativeLayout a() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setId(relativeLayout.hashCode());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, -1);
        addView(relativeLayout, layoutParams);
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.unionpay.mobile.android.widgets.z a(JSONObject jSONObject, String str) {
        String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "type");
        int i = com.unionpay.mobile.android.global.a.I - (com.unionpay.mobile.android.global.a.f * 4);
        com.unionpay.mobile.android.widgets.z afVar = "pan".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.af(this.d, i, jSONObject, str) : "mobile".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.ah(this.d, i, jSONObject, str) : "sms".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.ap(this.d, i, jSONObject, str) : Constant.KEY_CVN2.equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.e(this.d, i, jSONObject, str) : "expire".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.av(this.d, i, jSONObject, str) : "pwd".equalsIgnoreCase(a) ? new UPWidget(this.d, this.e.c(), i, jSONObject, str) : "text".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.at(this.d, i, jSONObject, str) : "string".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.ad(this.d, jSONObject, str) : "cert_id".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.f(this.d, i, jSONObject, str) : "cert_type".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.g(this.d, jSONObject, str) : "name".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.ae(this.d, i, jSONObject, str) : "hidden".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.y(this.d, jSONObject, str) : "user_name".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.au(this.d, i, jSONObject, str) : "password".equalsIgnoreCase(a) ? new com.unionpay.mobile.android.widgets.ao(this.d, i, jSONObject, str) : null;
        if (afVar != null && (afVar instanceof com.unionpay.mobile.android.widgets.aa)) {
            ((com.unionpay.mobile.android.widgets.aa) afVar).a((aa.a) this);
        }
        return afVar;
    }

    public final void a(int i) {
        ((BaseActivity) this.d).a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(int i, com.unionpay.mobile.android.model.e eVar) {
        b a;
        BaseActivity baseActivity = (BaseActivity) this.d;
        switch (i) {
            case 2:
            case 17:
            case 18:
                a = baseActivity.a(i, eVar);
                break;
            case 3:
            case 4:
            case 7:
            case 9:
            case 15:
            case 16:
            default:
                a = null;
                break;
            case 5:
                a = new g(this.d);
                break;
            case 6:
                int i2 = 0;
                if (this.a.q != null && this.a.q.size() > 0) {
                    i2 = this.a.q.get(this.a.N).c();
                }
                if ((!h() && i2 != 0 && this.a.aP != com.unionpay.mobile.android.views.order.l.c.intValue()) || this.a.br) {
                    i = 6;
                    a = baseActivity.a(i, eVar);
                    break;
                } else {
                    a = new at(this.d, eVar);
                    break;
                }
                break;
            case 8:
                a = new bd(this.d);
                break;
            case 10:
                a = new ak(this.d);
                break;
            case 11:
                a = new ai(this.d);
                break;
            case 12:
                a = new af(this.d);
                break;
            case 13:
                a = new o(this.d, eVar);
                break;
            case 14:
                a = new bi(this.d);
                break;
        }
        if (a != null) {
            baseActivity.a(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    @Override // com.unionpay.mobile.android.nocard.utils.UPPayEngine.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.views.b.a(int, java.lang.String):void");
    }

    @Override // com.unionpay.mobile.android.widgets.aa.a
    public final void a(com.unionpay.mobile.android.widgets.u uVar, String str) {
    }

    public final void a(String str) {
        a(str, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.b.a(onClickListener, onClickListener2);
        if (this.w == null || this.w.isFinishing() || com.unionpay.mobile.android.languages.c.bD == null) {
            return;
        }
        this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, str, com.unionpay.mobile.android.languages.c.bD.W, com.unionpay.mobile.android.languages.c.bD.X, false);
    }

    public final void a(String str, String str2) {
        a(str, str2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, String str2, boolean z, boolean z2) {
        ((InputMethodManager) this.d.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        this.a.ag = str2;
        this.a.af = str;
        a(14, z, z2);
    }

    public void a(String str, boolean z) {
        d dVar = new d(this, z);
        com.unionpay.mobile.android.utils.k.a("uppay", " showErrDialog(msg, boolean)  ");
        this.b.a(dVar, null);
        if (this.w == null || this.w.isFinishing() || com.unionpay.mobile.android.languages.c.bD == null) {
            return;
        }
        this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, str, com.unionpay.mobile.android.languages.c.bD.W);
    }

    protected boolean a(String str, JSONObject jSONObject) {
        return false;
    }

    protected void b() {
    }

    public void b(int i) {
        String c;
        boolean z;
        if (i == 8 || i == 17 || i == 19) {
            this.a.I.f = "fail";
            com.unionpay.mobile.android.utils.k.a("uppay", "showErrDialog 1");
            c = c(i);
            z = true;
        } else {
            com.unionpay.mobile.android.utils.k.a("uppay", "showErrDialog 2");
            c = c(i);
            z = false;
        }
        a(c, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str, String str2) {
        a(str, str2, true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, JSONObject jSONObject) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(JSONObject jSONObject) {
        if (com.unionpay.mobile.android.nocard.utils.f.c(this.a, jSONObject)) {
            c(jSONObject);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String c(int i) {
        switch (i) {
            case 2:
                return com.unionpay.mobile.android.languages.c.bD.aB;
            case 3:
                break;
            case 4:
                return com.unionpay.mobile.android.languages.c.bD.az;
            case 5:
                return com.unionpay.mobile.android.languages.c.bD.aH;
            case 6:
                return com.unionpay.mobile.android.languages.c.bD.aI;
            case 7:
                return com.unionpay.mobile.android.languages.c.bD.aG;
            case 8:
                return com.unionpay.mobile.android.languages.c.bD.aJ;
            case 9:
                return com.unionpay.mobile.android.languages.c.bD.aK;
            default:
                switch (i) {
                    case 16:
                        return com.unionpay.mobile.android.languages.c.bD.aM;
                    case 17:
                        break;
                    case 18:
                        return com.unionpay.mobile.android.languages.c.bD.aP;
                    case 19:
                        return com.unionpay.mobile.android.languages.c.bD.aN;
                    case 20:
                        return com.unionpay.mobile.android.languages.c.bD.aO;
                    case 21:
                        return com.unionpay.mobile.android.languages.c.bD.aL;
                    default:
                        return com.unionpay.mobile.android.languages.c.bD.aA;
                }
        }
        return this.h;
    }

    protected void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(JSONObject jSONObject) {
        this.b.a(new e(this, jSONObject), new f(this, jSONObject));
        if (this.w == null || this.w.isFinishing() || this.a == null) {
            return;
        }
        this.b.a(this.a.aG, this.a.aH, this.a.aI, this.a.aK);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.m = r();
    }

    public final void d(int i) {
        a(i, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.k = a();
        b();
        RelativeLayout r = r();
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(1);
        linearLayout.setId(linearLayout.hashCode());
        linearLayout.setBackgroundColor(-1114114);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, -1);
        r.addView(linearLayout, layoutParams);
        this.l = linearLayout;
        this.l.setBackgroundColor(0);
        f();
        int id = this.l.getId();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(12, -1);
        layoutParams2.addRule(3, id);
        RelativeLayout relativeLayout = new RelativeLayout(this.d);
        r.addView(relativeLayout, layoutParams2);
        this.m = relativeLayout;
        c();
    }

    @Override // com.unionpay.mobile.android.upwidget.UPScrollView.a
    public final void e(int i) {
        if (i >= this.v) {
            if (this.t.getVisibility() == 0 || this.t == null || this.r.getVisibility() != 0) {
                return;
            }
            this.t.setVisibility(0);
        } else if (i > this.v + this.u || this.t.getVisibility() != 0 || this.t == null) {
        } else {
            this.t.setVisibility(8);
        }
    }

    protected void f() {
        this.s = new LinearLayout(this.d);
        this.s.setOrientation(1);
        if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
            this.s.setBackgroundColor(-267336);
        } else {
            this.s.setBackgroundColor(-34177);
        }
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        if (b(this.a.ar)) {
            this.s.setPadding(a, a, a, 0);
        } else {
            this.s.setPadding(a, a, a, a);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = 0;
        this.l.addView(this.s, layoutParams);
        String str = "";
        if (b(this.a.at)) {
            str = "" + this.a.at;
        }
        if (b(str)) {
            TextView textView = new TextView(this.d);
            if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
                textView.setTextColor(-10066330);
            } else {
                textView.setTextColor(-1);
            }
            textView.setText(str);
            textView.setTextSize(com.unionpay.mobile.android.global.b.k);
            this.s.addView(textView);
        } else {
            this.s.setVisibility(8);
        }
        this.r = new LinearLayout(this.d);
        this.r.setOrientation(1);
        if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
            this.r.setBackgroundColor(-267336);
        } else {
            this.r.setBackgroundColor(-34177);
        }
        this.r.setPadding(a, a, a, a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = 0;
        this.l.addView(this.r, layoutParams2);
        String str2 = "";
        if (b(this.a.ar)) {
            str2 = "" + this.a.ar;
        }
        if (b(str2)) {
            TextView textView2 = new TextView(this.d);
            if (!this.a.aM || com.unionpay.mobile.android.model.b.bm) {
                textView2.setTextColor(-10066330);
            } else {
                textView2.setTextColor(-1);
            }
            textView2.setText(str2);
            textView2.setTextSize(com.unionpay.mobile.android.global.b.k);
            this.r.addView(textView2);
        } else {
            this.r.setVisibility(8);
        }
        this.r.getViewTreeObserver().addOnPreDrawListener(new c(this));
        com.unionpay.mobile.android.views.order.m mVar = new com.unionpay.mobile.android.views.order.m(this.d);
        mVar.a(this.c.a(1003, -1, -1), this.c.a(1001, -1, -1));
        mVar.a(this instanceof ao ? false : true, this.a.h, this.a.i);
        this.l.addView(mVar, new LinearLayout.LayoutParams(-1, -2));
        Drawable a2 = this.c.a(TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START, -1, -1);
        LinearLayout linearLayout = new LinearLayout(this.d);
        if (a2 != null) {
            linearLayout.setBackgroundDrawable(a2);
        }
        this.l.addView(linearLayout, new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.utils.g.a(this.d, 2.0f)));
    }

    public final int g() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        return this.a.J || this.a.q == null || this.a.q.size() == 0;
    }

    public final void i() {
        if (this.b == null || !this.b.a()) {
            return;
        }
        this.b.c();
    }

    public final void j() {
        com.unionpay.mobile.android.nocard.utils.d.a(this.d, this.a);
    }

    public void k() {
        if (this.j) {
            m();
        }
    }

    @Override // com.unionpay.mobile.android.widgets.ay.a
    public final void l() {
        k();
    }

    public final void m() {
        ((BaseActivity) this.d).b();
    }

    public final boolean n() {
        boolean z = this.b != null && this.b.a();
        com.unionpay.mobile.android.utils.k.a("uppay", " dialog showing:".concat(String.valueOf(z)));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.unionpay.mobile.android.utils.k.b("uppayEx", toString() + " onAttachedToWindow()");
        super.onAttachedToWindow();
        this.e.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        return !this.a.c;
    }

    public final void q() {
        if (this.d != null) {
            ((InputMethodManager) this.d.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }
}
