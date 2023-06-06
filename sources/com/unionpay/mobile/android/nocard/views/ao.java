package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.mobile.android.views.order.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class ao extends b implements a.b {
    private Handler A;
    List<Map<String, Object>> r;
    private int s;
    private int t;
    private Button u;
    private com.unionpay.mobile.android.upviews.a v;
    private com.unionpay.mobile.android.views.order.o w;
    private LinearLayout x;
    private boolean y;
    private Handler z;

    /* loaded from: classes6.dex */
    public final class a implements o.a {
        public a() {
        }

        @Override // com.unionpay.mobile.android.views.order.b.InterfaceC1514b
        public final int a() {
            ao.this.a.J = true;
            ao.this.d(2);
            return 0;
        }

        @Override // com.unionpay.mobile.android.views.order.b.InterfaceC1514b
        public final int a(int i) {
            ao.this.t = i;
            ao.this.s = 3;
            ao.this.j = false;
            ao.this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
            ao.this.e.l(ao.this.a.q.get(i).a());
            return 0;
        }

        @Override // com.unionpay.mobile.android.views.order.AbstractMethod.a
        public final void a(int i, boolean z, int i2, a.C1512a c1512a) {
            String b;
            if (ao.this.w != null) {
                ao.this.a.aQ = ao.this.w.a();
                StringBuilder sb = new StringBuilder();
                sb.append(ao.this.a.aQ);
                com.unionpay.mobile.android.utils.k.c("functionEx", sb.toString());
            }
            if (i == com.unionpay.mobile.android.views.order.l.e.intValue()) {
                ao.c(ao.this, i2);
            } else if (!z) {
                if (!c1512a.a()) {
                    ao.this.a(c1512a.b);
                } else if (i == com.unionpay.mobile.android.views.order.l.c.intValue()) {
                    ao.this.j = false;
                    ao.this.s = 4;
                    ao.this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
                    ao.this.e.m(c1512a.b);
                } else {
                    ao.this.j = false;
                    ao.this.s = 2;
                    ao.this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
                    ao.this.a.M = "0";
                    ao.this.e.c(bh.a(ao.this.a.j), bh.b(ao.this.a.M, c1512a.b, "1", "1"));
                }
            } else {
                ao.this.a.N = i2;
                ao.this.j = false;
                ao.this.s = 2;
                ao.this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
                if (ao.this.a.q.get(i2).c() == 0) {
                    String a = ao.this.a.q.get(i2).a();
                    ao.this.a.M = "1";
                    b = bh.a(ao.this.a.M, a, "1", "1");
                } else {
                    ao.this.a.M = "0";
                    String b2 = ao.this.a.q.get(i2).b();
                    String str = ao.this.a.M;
                    b = bh.b(str, "\"pan\":\"" + b2 + CommonConstant.Symbol.DOUBLE_QUOTES, "2", "1\",\"carrier_tp\":\"2");
                }
                ao.this.e.c(bh.a(ao.this.a.j), b);
            }
        }

        @Override // com.unionpay.mobile.android.views.order.AbstractMethod.b
        public final void a(String str, String str2) {
            ao.this.a(str, str2);
        }

        @Override // com.unionpay.mobile.android.views.order.b.InterfaceC1514b
        public final int b(int i) {
            String[] strArr = com.unionpay.mobile.android.utils.o.f;
            new Object[1][0] = Integer.valueOf(i);
            return 0;
        }

        @Override // com.unionpay.mobile.android.views.order.CViewMethods.a
        public final void c(int i) {
            ao.this.q();
            if (i == com.unionpay.mobile.android.views.order.l.b.intValue()) {
                ao.this.a.aP = com.unionpay.mobile.android.views.order.l.b.intValue();
                ao.this.d(2);
            } else if (i == com.unionpay.mobile.android.views.order.l.c.intValue()) {
                ao.d(ao.this);
            } else if (i == com.unionpay.mobile.android.views.order.l.d.intValue()) {
                ao.this.d(17);
            } else if (i == com.unionpay.mobile.android.views.order.l.e.intValue()) {
                ao.f(ao.this);
            } else if (i == com.unionpay.mobile.android.views.order.l.f.intValue()) {
                ao.this.d(ao.this.a.bp, ao.this.a.bq);
            }
        }
    }

    public ao(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
        this.s = 0;
        this.t = -1;
        this.u = null;
        this.v = null;
        this.r = new ArrayList(1);
        this.y = false;
        this.z = null;
        this.A = new Handler(new ap(this));
        this.f = 2;
        if (this.a.aE && this.a.az) {
            this.a.aP = com.unionpay.mobile.android.views.order.l.e.intValue();
        }
        this.q = "order";
        setBackgroundColor(-1052684);
        e();
        if (!TextUtils.isEmpty(this.a.u) || this.a.aC) {
            this.z = new Handler(new aq(this));
        }
        if (com.unionpay.mobile.android.model.b.bl || this.a.aP != com.unionpay.mobile.android.views.order.l.e.intValue() || !this.a.az || this.a.aC || this.a.aD) {
            return;
        }
        this.A.sendMessageDelayed(this.A.obtainMessage(500), 8000L);
        com.unionpay.mobile.android.utils.k.c("uppay", "mHceHandler.sendMessageDelayed(msg, 8000)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(com.unionpay.mobile.android.model.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("text1", dVar.b() + dVar.c());
        hashMap.put("text2", dVar.a().substring(0, 4) + " **** " + dVar.a().substring(dVar.a().length() - 4));
        return hashMap;
    }

    static /* synthetic */ void c(ao aoVar, int i) {
        aoVar.s = 6;
        aoVar.j = false;
        aoVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        String a2 = com.unionpay.mobile.android.model.b.bb.get(i).a();
        String e = com.unionpay.mobile.android.model.b.bb.get(i).e();
        String d = com.unionpay.mobile.android.model.b.bb.get(i).d();
        aoVar.a.bc = i;
        String str = "\"pan\":\"" + a2 + "\",\"carrier_tp\":\"9\",\"issuer\":\"" + e + "\",\"type\":\"" + d + CommonConstant.Symbol.DOUBLE_QUOTES;
        com.unionpay.mobile.android.utils.k.c("uppay", str);
        aoVar.e.c("cardrules", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(ao aoVar) {
        if (aoVar.a.u == null || aoVar.a.u.length() <= 0) {
            aoVar.a.aP = com.unionpay.mobile.android.views.order.l.c.intValue();
            aoVar.d(2);
            return;
        }
        aoVar.s = 4;
        aoVar.j = false;
        aoVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        aoVar.e.m(String.format("\"user_id\":\"%s\"", aoVar.a.u));
    }

    private void d(JSONObject jSONObject) {
        int a2 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
        if (a2 != 0) {
            b(a2);
        } else {
            com.unionpay.mobile.android.model.e a3 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
            if (this.a.z != null && this.a.z.length() > 0) {
                a(6, a3);
            } else if (this.a.D != null && this.a.D.length() > 0) {
                d(5);
            }
        }
        this.s = 0;
    }

    private void e(JSONObject jSONObject) {
        int b = com.unionpay.mobile.android.nocard.utils.f.b(this.a, jSONObject);
        if (b != 0) {
            b(b);
            return;
        }
        String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, DeviceInfo.USER_ID);
        if (!TextUtils.isEmpty(a2)) {
            String[] strArr = com.unionpay.mobile.android.utils.o.e;
            new Object[1][0] = a2;
        }
        if (this.w != null) {
            String b2 = this.w.b();
            if (!TextUtils.isEmpty(b2)) {
                PreferenceUtils.d(this.d, b2);
            }
        }
        a(13, com.unionpay.mobile.android.nocard.utils.f.a(jSONObject));
        this.s = 0;
    }

    static /* synthetic */ void f(ao aoVar) {
        if (com.unionpay.mobile.android.model.b.bl && (com.unionpay.mobile.android.model.b.bb == null || com.unionpay.mobile.android.model.b.bb.size() <= 0)) {
            aoVar.a(com.unionpay.mobile.android.languages.c.bD.bq, aoVar.a.bh, aoVar.a.aE, true);
            return;
        }
        aoVar.a.aP = com.unionpay.mobile.android.views.order.l.e.intValue();
        aoVar.d(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.a.aP != com.unionpay.mobile.android.views.order.l.e.intValue() || !this.a.az || this.a.aC || this.a.aD) {
            return;
        }
        this.A.removeMessages(500);
        com.unionpay.mobile.android.utils.k.c("uppay", "mHceHandler remove Message");
    }

    protected void a(Handler handler) {
    }

    public final void a(com.unionpay.mobile.android.model.a aVar) {
        this.a.br = true;
        this.a.bs = aVar;
        this.s = 2;
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        this.a.M = "0";
        String str = this.a.M;
        this.e.c(bh.a(this.a.j), bh.b(str, "\"pan\":\"" + aVar.b() + CommonConstant.Symbol.DOUBLE_QUOTES, "2", "1\",\"carrier_tp\":\"10"));
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        this.b.c();
        switch (this.s) {
            case 1:
                com.unionpay.mobile.android.model.b bVar = this.a;
                bVar.X = com.unionpay.mobile.android.utils.j.d(jSONObject, "login_rules");
                bVar.Y = com.unionpay.mobile.android.utils.j.c(jSONObject, "register_url");
                if (((bVar.X == null || bVar.X.length() <= 0) ? (char) 2 : (char) 0) != 0) {
                    b(2);
                } else {
                    d(12);
                }
                this.s = 0;
                return;
            case 2:
                if (b(jSONObject)) {
                    return;
                }
                d(jSONObject);
                return;
            case 3:
                com.unionpay.mobile.android.model.b bVar2 = this.a;
                int i = this.t;
                if (bVar2.q != null && i < bVar2.q.size()) {
                    bVar2.q.remove(i);
                }
                if (this.a.q == null || this.a.q.size() <= 0) {
                    this.a.N = -1;
                    c();
                } else {
                    if (this.t == this.a.N) {
                        this.a.N = 0;
                    } else if (this.t < this.a.N) {
                        com.unionpay.mobile.android.model.b bVar3 = this.a;
                        bVar3.N--;
                    }
                    this.w.c(this.a.N);
                }
                this.s = 0;
                return;
            case 4:
                if (b(jSONObject)) {
                    return;
                }
                e(jSONObject);
                return;
            case 5:
                i();
                int a2 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                if (a2 != 0) {
                    b(a2);
                    return;
                }
                com.unionpay.mobile.android.model.e a3 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                if (this.a.z != null && this.a.z.length() > 0) {
                    a(6, a3);
                    return;
                } else if (this.a.D == null || this.a.D.length() <= 0) {
                    return;
                } else {
                    d(5);
                    return;
                }
            case 6:
                this.b.c();
                int a4 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                if (a4 != 0) {
                    b(a4);
                    return;
                }
                com.unionpay.mobile.android.model.e a5 = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                v();
                a(18, a5);
                return;
            default:
                return;
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.u == null || this.u == null) {
            return;
        }
        this.u.setEnabled(!z);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    protected final void b() {
        String str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        String str2 = this.a.o;
        com.unionpay.mobile.android.widgets.ay ayVar = new com.unionpay.mobile.android.widgets.ay(this.d, str2, this);
        if (!this.a.J) {
            if ((this.a.aE && this.a.aP == com.unionpay.mobile.android.views.order.l.e.intValue()) || this.a.aP == com.unionpay.mobile.android.views.order.l.a.intValue() || (this.a.aP == com.unionpay.mobile.android.views.order.l.c.intValue() && this.a.aC && (this.a.q == null || this.a.q.size() <= 0))) {
                ayVar = new com.unionpay.mobile.android.widgets.ay(this.d, str2, this.c.a(1030, -1, -1), com.unionpay.mobile.android.utils.g.a(this.d, 20.0f), this);
            }
            if (this.a.aP == com.unionpay.mobile.android.views.order.l.e.intValue()) {
                str = com.unionpay.mobile.android.languages.c.bD.bq;
            }
            layoutParams.addRule(13, -1);
            this.k.addView(ayVar, layoutParams);
        }
        str = com.unionpay.mobile.android.languages.c.bD.l;
        ayVar.a(str);
        layoutParams.addRule(13, -1);
        this.k.addView(ayVar, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(String str, JSONObject jSONObject) {
        if ("init".equals(str)) {
            if (this.a.J) {
                m();
            }
        } else if (!"".equals(str)) {
            this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
            this.j = false;
            this.s = 5;
            this.e.c(str, "");
        } else if (this.s == 2) {
            d(jSONObject);
        } else if (this.s == 4) {
            e(jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.unionpay.mobile.android.nocard.views.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c() {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.views.ao.c():void");
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str, String str2) {
    }

    public final void e(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.a.I.f = str2;
        }
        a(str, true);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (!this.a.aE && this.a.J) {
            super.k();
            v();
            this.a.J = false;
        } else if (this.a.aE || ((this.a.aP == com.unionpay.mobile.android.views.order.l.a.intValue() || (this.a.aP == com.unionpay.mobile.android.views.order.l.c.intValue() && this.a.aC && (this.a.q == null || this.a.q.size() <= 0))) && this.a.aP != com.unionpay.mobile.android.views.order.l.e.intValue())) {
            v();
            s();
        } else {
            super.k();
            v();
            this.a.aP = com.unionpay.mobile.android.views.order.l.a.intValue();
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (com.unionpay.mobile.android.model.b.bm && this.a.aP == com.unionpay.mobile.android.views.order.l.a.intValue() && !"1".equalsIgnoreCase(this.a.an)) {
            com.unionpay.mobile.android.utils.k.c("spay", "out");
            d(this.a.bp, this.a.bq);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.v != null) {
            this.v.clearFocus();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y || this.z == null) {
            return;
        }
        this.y = true;
        this.z.sendEmptyMessage(0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }

    public final void s() {
        this.b.a(new ar(this), new as(this));
        this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, com.unionpay.mobile.android.languages.c.bD.av, com.unionpay.mobile.android.languages.c.bD.W, com.unionpay.mobile.android.languages.c.bD.X);
    }

    protected boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
    }
}
