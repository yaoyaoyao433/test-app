package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.unionpay.tsmservice.data.AppStatus;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class g extends z {
    private static List<String> u;
    private static List<String> v;
    private Spinner a;
    private int b;
    private String c;
    private com.unionpay.mobile.android.upwidget.c o;
    private TextView p;
    private RelativeLayout q;
    private PopupWindow r;
    private com.unionpay.mobile.android.upwidget.g s;
    private List<Map<String, Object>> t;
    private final View.OnClickListener w;
    private final AdapterView.OnItemClickListener x;

    static {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.M);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.N);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.O);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.P);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.Q);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.R);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.S);
        arrayList.add(com.unionpay.mobile.android.languages.c.bD.T);
        u = arrayList;
        ArrayList arrayList2 = new ArrayList(8);
        arrayList2.add("01");
        arrayList2.add("02");
        arrayList2.add(Constant.RECHARGE_MODE_BUSINESS_OFFICE);
        arrayList2.add(Constant.RECHARGE_MODE_DESIGNATED_AND_CACH);
        arrayList2.add(AppStatus.OPEN);
        arrayList2.add(AppStatus.APPLY);
        arrayList2.add(AppStatus.VIEW);
        arrayList2.add("99");
        v = arrayList2;
    }

    public g(Context context, JSONObject jSONObject, String str) {
        super(context, jSONObject, str);
        ArrayList arrayList = null;
        this.a = null;
        this.b = 1;
        this.w = new h(this);
        this.x = new i(this);
        this.c = com.unionpay.mobile.android.languages.c.bD.bf;
        if (u != null && u.size() > 0) {
            arrayList = new ArrayList(u.size());
            for (int i = 0; i < u.size(); i++) {
                HashMap hashMap = new HashMap();
                hashMap.put("text1", u.get(i));
                hashMap.put("text2", "");
                hashMap.put("editable", Boolean.FALSE);
                arrayList.add(hashMap);
            }
        }
        this.t = arrayList;
        this.o = new com.unionpay.mobile.android.upwidget.c(context, this.t, this.c, "", "", this.b, 0);
        this.s = new com.unionpay.mobile.android.upwidget.g(this.d, this.o);
        this.s.a(this.x);
        this.s.a(this.w);
        RelativeLayout relativeLayout = this.m;
        Drawable a = com.unionpay.mobile.android.resource.c.a(this.d).a(2014, -1, -1);
        this.q = new RelativeLayout(this.d);
        this.q.setBackgroundDrawable(a);
        this.q.setOnClickListener(new j(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams.addRule(15, -1);
        relativeLayout.addView(this.q, layoutParams);
        ImageView imageView = new ImageView(this.d);
        imageView.setId(imageView.hashCode());
        imageView.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(this.d).a(1002, -1, -1));
        int a2 = com.unionpay.mobile.android.utils.g.a(this.d, 15.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(15, -1);
        layoutParams2.rightMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.q.addView(imageView, layoutParams2);
        TextView textView = new TextView(this.d);
        textView.setId(textView.hashCode());
        textView.setTextSize(com.unionpay.mobile.android.global.b.k);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        textView.setEms(4);
        textView.setText(com.unionpay.mobile.android.languages.c.bD.bc);
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15, -1);
        layoutParams3.addRule(9, -1);
        layoutParams3.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.q.addView(textView, layoutParams3);
        this.p = new TextView(this.d);
        this.p.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.p.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.p.setSingleLine(true);
        this.p.setTextColor(-10066330);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, textView.getId());
        layoutParams4.addRule(0, imageView.getId());
        this.q.addView(this.p, layoutParams4);
        if (!this.i) {
            a(1);
            return;
        }
        this.p.setText(b(i()));
        imageView.setVisibility(8);
        this.q.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.b = i;
        int c = i - this.o.c();
        this.o.a(this.b);
        if (this.p == null || u == null) {
            return;
        }
        this.p.setText(u.get(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(g gVar, View view) {
        if (gVar.r == null) {
            gVar.r = new PopupWindow((View) gVar.s, -1, -1, true);
            gVar.r.setBackgroundDrawable(new ColorDrawable(-1342177280));
            gVar.r.update();
        }
        com.sankuai.waimai.platform.utils.p.a(gVar.r, view, 80, 0, 0);
    }

    private static String b(String str) {
        String str2 = "";
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).equals(str)) {
                str2 = u.get(i);
            }
        }
        return str2;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        int c = this.b - this.o.c();
        return this.i ? i() : (c < 0 || c > u.size()) ? "" : v.get(c);
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return true;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_select_certtype";
    }
}
