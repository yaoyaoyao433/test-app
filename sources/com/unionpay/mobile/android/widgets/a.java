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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class a extends z {
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

    public a(Context context, JSONObject jSONObject, JSONArray jSONArray, String str) {
        super(context, jSONObject, str);
        this.a = null;
        this.b = 1;
        this.w = new b(this);
        this.x = new c(this);
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add((JSONArray) com.unionpay.mobile.android.utils.j.b(jSONArray, i));
        }
        if (arrayList.size() > 0) {
            u = new ArrayList(arrayList.size());
            v = new ArrayList(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                v.add(com.unionpay.mobile.android.utils.j.a((JSONArray) arrayList.get(i2), 0));
                u.add(com.unionpay.mobile.android.utils.j.a((JSONArray) arrayList.get(i2), 1));
            }
        }
        RelativeLayout relativeLayout = this.m;
        Drawable a = com.unionpay.mobile.android.resource.c.a(this.d).a(2014, -1, -1);
        this.q = new RelativeLayout(this.d);
        this.q.setBackgroundDrawable(a);
        this.q.setOnClickListener(new d(this));
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
        textView.setTextColor(-13421773);
        textView.setSingleLine(true);
        textView.setEms(4);
        textView.setText(com.unionpay.mobile.android.languages.c.bD.bd);
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
        if (this.i) {
            this.p.setText(b(i()));
            imageView.setVisibility(8);
            this.q.setClickable(false);
        } else if (u != null && u.size() > 0) {
            this.p.setText(u.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(a aVar, int i) {
        aVar.b = i;
        int c = i - aVar.o.c();
        aVar.o.a(aVar.b);
        if (aVar.p == null || u == null) {
            return;
        }
        aVar.p.setText(u.get(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(a aVar, View view) {
        if (aVar.r == null) {
            aVar.c = com.unionpay.mobile.android.languages.c.bD.be;
            ArrayList arrayList = null;
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
            aVar.t = arrayList;
            aVar.o = new com.unionpay.mobile.android.upwidget.c(aVar.d, aVar.t, aVar.c, "", "", aVar.b, 0);
            aVar.s = new com.unionpay.mobile.android.upwidget.g(aVar.d, aVar.o);
            aVar.s.a(aVar.x);
            aVar.s.a(aVar.w);
            aVar.r = new PopupWindow((View) aVar.s, -1, -1, true);
            aVar.r.setBackgroundDrawable(new ColorDrawable(-1342177280));
            aVar.r.update();
        }
        com.sankuai.waimai.platform.utils.p.a(aVar.r, view, 80, 0, 0);
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
        int c = this.b - (this.o == null ? 1 : this.o.c());
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
        return "_select_areacode";
    }
}
