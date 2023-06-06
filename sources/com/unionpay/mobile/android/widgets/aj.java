package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upwidget.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class aj extends z {
    private String A;
    private boolean B;
    private String C;
    private a D;
    private final View.OnClickListener a;
    private final View.OnClickListener b;
    private final AdapterView.OnItemClickListener c;
    private JSONArray o;
    private PopupWindow p;
    private com.unionpay.mobile.android.upwidget.j q;
    private int r;
    private int s;
    private JSONArray t;
    private JSONArray u;
    private TextView v;
    private com.unionpay.mobile.android.upwidget.q w;
    private TextView x;
    private String y;
    private RelativeLayout z;

    /* loaded from: classes6.dex */
    public interface a {
        void g();
    }

    public aj(Context context, JSONObject jSONObject, String str, a aVar) {
        super(context, jSONObject, str);
        this.a = new ak(this);
        this.b = new al(this);
        this.c = new am(this);
        this.s = 0;
        this.t = null;
        this.u = null;
        this.A = "";
        this.B = true;
        this.C = "";
        this.D = null;
        this.D = aVar;
        this.r = 0;
        this.o = com.unionpay.mobile.android.utils.j.d(this.n, "items");
        this.y = com.unionpay.mobile.android.utils.j.a(jSONObject, "label");
        if (a(this.y)) {
            this.y = com.unionpay.mobile.android.languages.c.bD.bg;
        }
        if (!TextUtils.isEmpty(com.unionpay.mobile.android.utils.j.a(jSONObject, "default_item_idx"))) {
            this.s = Integer.parseInt(com.unionpay.mobile.android.utils.j.a(jSONObject, "default_item_idx"));
        }
        this.q = new com.unionpay.mobile.android.upwidget.j(context, this.o, this.s, str);
        this.q.a(this.c);
        this.q.a(this.a);
        this.q.d(this.b);
        RelativeLayout relativeLayout = this.m;
        Drawable a2 = com.unionpay.mobile.android.resource.c.a(this.d).a(2014, -1, -1);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setId(linearLayout.hashCode());
        linearLayout.setBackgroundColor(-3419943);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
        com.unionpay.mobile.android.utils.j.a(this.n, "type");
        relativeLayout.addView(linearLayout, layoutParams);
        this.z = new RelativeLayout(this.d);
        this.z.setId(this.z.hashCode());
        this.z.setBackgroundDrawable(a2);
        this.z.setOnClickListener(new an(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(3, linearLayout.getId());
        relativeLayout.addView(this.z, layoutParams2);
        ImageView imageView = new ImageView(this.d);
        imageView.setId(imageView.hashCode());
        imageView.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(this.d).a(1002, -1, -1));
        int a3 = com.unionpay.mobile.android.utils.g.a(this.d, 15.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a3, a3);
        layoutParams3.addRule(11, -1);
        layoutParams3.addRule(15, -1);
        layoutParams3.rightMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.z.addView(imageView, layoutParams3);
        this.v = new TextView(this.d);
        this.v.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.v.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.v.setSingleLine(true);
        this.v.setTextColor(-10066330);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(9, -1);
        layoutParams4.addRule(0, imageView.getId());
        layoutParams4.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams4.rightMargin = layoutParams4.leftMargin;
        this.z.addView(this.v, layoutParams4);
        if (!"instalment".equals(ICashierJSHandler.KEY_PROMOTION)) {
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setBackgroundColor(-3419943);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, 1);
            layoutParams5.bottomMargin = com.unionpay.mobile.android.global.a.f;
            layoutParams5.addRule(3, this.z.getId());
            relativeLayout.addView(linearLayout2, layoutParams5);
        }
        a(this.w != null ? this.w.b() : true);
        a(this.s, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, int i2, String str) {
        Object b = com.unionpay.mobile.android.utils.j.b(this.o, i);
        if (b != null) {
            JSONObject jSONObject = (JSONObject) b;
            String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "type");
            Object b2 = com.unionpay.mobile.android.utils.j.b("coupon".equals(a2) ? this.t : PayLabelConstants.TYPE_POINT.equals(a2) ? this.u : com.unionpay.mobile.android.utils.j.d(jSONObject, "options"), i2);
            return b2 != null ? com.unionpay.mobile.android.utils.j.a((JSONObject) b2, str) : "";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String a(aj ajVar, int i, String str) {
        Object b = com.unionpay.mobile.android.utils.j.b(ajVar.o, i);
        return b != null ? com.unionpay.mobile.android.utils.j.a((JSONObject) b, str) : "";
    }

    private static JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("label", str2);
            jSONObject.put("checked", str3);
            jSONObject.put("ckb_style", "small");
            jSONObject.put("required", "0");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.s = i;
        this.r = i2;
        if (this.v != null) {
            this.v.setText(a(i, i2, "label"));
        }
        String a2 = a(i, i2, "rel_label");
        String a3 = a(i, i2, "rel_value");
        String a4 = a(i, i2, "rel_value_style");
        this.C = a3;
        if (!this.B) {
            this.D.g();
        }
        this.B = false;
        this.A = a(i, i2, "value");
        int i3 = 8;
        if (!a(a2) || !a(a3)) {
            if (com.unionpay.mobile.android.data.a.a(a4)) {
                int parseColor = Color.parseColor(a4);
                a4 = Integer.toString(parseColor, 16);
            }
            String concat = "#ff".concat(String.valueOf(a4));
            TextView textView = this.x;
            int parseColor2 = Color.parseColor(concat);
            int length = a2.length();
            int length2 = TextUtils.isEmpty(a3) ? 0 : a3.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + a3);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-13421773);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(parseColor2);
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, length, 33);
            spannableStringBuilder.setSpan(foregroundColorSpan2, length, length2 + length, 18);
            textView.setText(spannableStringBuilder);
            if (this.w != null ? this.w.b() : true) {
                i3 = 0;
            }
        }
        this.x.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(aj ajVar, View view) {
        if (ajVar.p == null) {
            ajVar.p = new PopupWindow((View) ajVar.q, -1, -1, true);
            ajVar.p.setBackgroundDrawable(new ColorDrawable(-1342177280));
            ajVar.p.update();
        }
        com.sankuai.waimai.platform.utils.p.a(ajVar.p, view, 80, 0, 0);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        String a2 = a(this.s, this.r, "value");
        if (a2 != null) {
            a2 = a2.replace(CommonConstant.Symbol.DOUBLE_QUOTES, "\\\"");
        }
        if (this.w != null && !this.w.b()) {
            a2 = null;
        }
        com.unionpay.mobile.android.utils.k.c("uppay", n() + " : " + a2);
        return a2;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.q.b(this.a);
        this.q.b(onClickListener);
    }

    public final void a(q.a aVar) {
        if (this.w != null) {
            this.w.a(aVar);
        }
    }

    public final void a(JSONArray jSONArray) {
        this.t = jSONArray;
        this.q.a(jSONArray);
    }

    public final void a(JSONArray jSONArray, String str) {
        this.u = jSONArray;
        this.q.a(jSONArray, str);
    }

    public final void a(boolean z) {
        this.A = !z ? "" : a(this.s, this.r, "value");
        if (this.w != null) {
            this.w.a(z);
        }
        int i = z ? 0 : 8;
        this.m.setVisibility(i);
        if (this.x != null) {
            if (TextUtils.isEmpty(this.x.getText().toString())) {
                this.x.setVisibility(8);
            } else {
                this.x.setVisibility(i);
            }
        }
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    protected final boolean a(LinearLayout linearLayout, String str) {
        if (a(str)) {
            return true;
        }
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n));
        JSONObject a2 = a(com.unionpay.mobile.android.utils.j.a(this.n, "type"), str, com.unionpay.mobile.android.utils.j.a(this.n, "checked"));
        Context context = this.d;
        this.w = new com.unionpay.mobile.android.upwidget.q(context, a2, s() + "_agree_reduce_activity");
        this.w.a();
        this.w.a(com.unionpay.mobile.android.global.b.k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams.gravity = 16;
        int a3 = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams.rightMargin = a3;
        layoutParams.leftMargin = a3;
        linearLayout2.addView(this.w, layoutParams);
        return true;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.q.e(onClickListener);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return true;
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    protected final boolean b_() {
        this.x = new TextView(this.d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        int a2 = com.unionpay.mobile.android.utils.g.a(this.d, 5.0f);
        layoutParams.bottomMargin = a2;
        layoutParams.topMargin = a2;
        this.x.setTextSize(com.unionpay.mobile.android.global.b.k);
        addView(this.x, layoutParams);
        this.x.setVisibility(8);
        return true;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.q.c(onClickListener);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_select_reduce_activity";
    }

    @Override // com.unionpay.mobile.android.widgets.z, com.unionpay.mobile.android.widgets.ba
    public final boolean f() {
        String a2 = a(this.s, this.r, "available");
        return TextUtils.isEmpty(a2) || !"1".equals(a2);
    }

    public final String g() {
        return this.A;
    }
}
