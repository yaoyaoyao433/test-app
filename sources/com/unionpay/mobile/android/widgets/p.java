package com.unionpay.mobile.android.widgets;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upwidget.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class p extends z {
    private final View.OnClickListener a;
    private final AdapterView.OnItemClickListener b;
    private JSONArray c;
    private List<Map<String, Object>> o;
    private AlertDialog p;
    private PopupWindow q;
    private com.unionpay.mobile.android.upwidget.e r;
    private int s;
    private TextView t;
    private com.unionpay.mobile.android.upwidget.q u;
    private TextView v;
    private String w;
    private RelativeLayout x;
    private boolean y;
    private boolean z;

    public p(Context context, JSONObject jSONObject, String str) {
        super(context, jSONObject, str);
        this.a = new q(this);
        this.b = new r(this);
        this.y = false;
        this.z = true;
        this.s = 1;
        this.c = com.unionpay.mobile.android.utils.j.d(this.n, "new_instalments");
        this.w = com.unionpay.mobile.android.utils.j.a(jSONObject, "label");
        if (a(this.w)) {
            this.w = com.unionpay.mobile.android.languages.c.bD.bg;
        }
        this.o = b(this.c);
        this.r = new com.unionpay.mobile.android.upwidget.e(this.d, this.o, "");
        a(this.m);
    }

    private String a(int i, String str) {
        Object b = com.unionpay.mobile.android.utils.j.b(this.c, i);
        return b != null ? com.unionpay.mobile.android.utils.j.a((JSONObject) b, str) : "";
    }

    private JSONObject a(String str, String str2, String str3) {
        JSONObject c;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("label", str2);
            jSONObject.put("checked", str3);
            jSONObject.put("ckb_style", "small");
            jSONObject.put("required", "0");
            if ("instalment".equals(str) && (c = com.unionpay.mobile.android.utils.j.c(this.n, "url")) != null) {
                jSONObject.put("href_label", com.unionpay.mobile.android.utils.j.a(c, "label"));
                jSONObject.put("href_url", com.unionpay.mobile.android.utils.j.a(c, "href"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.s = i;
        int a = i - this.r.a();
        this.r.a(this.s);
        if (this.t != null) {
            this.t.setText(a(a, "label"));
        }
    }

    private void a(RelativeLayout relativeLayout) {
        Drawable a = com.unionpay.mobile.android.resource.c.a(this.d).a(2014, -1, -1);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setId(linearLayout.hashCode());
        linearLayout.setBackgroundColor(-3419943);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
        String a2 = com.unionpay.mobile.android.utils.j.a(this.n, "type");
        if ("instalment".equals(a2)) {
            layoutParams.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        this.x = new RelativeLayout(this.d);
        this.x.setId(this.x.hashCode());
        this.x.setBackgroundDrawable(a);
        this.x.setOnClickListener(new s(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(3, linearLayout.getId());
        relativeLayout.addView(this.x, layoutParams2);
        ImageView imageView = new ImageView(this.d);
        imageView.setId(imageView.hashCode());
        imageView.setBackgroundDrawable(com.unionpay.mobile.android.resource.c.a(this.d).a(1002, -1, -1));
        int a3 = com.unionpay.mobile.android.utils.g.a(this.d, 15.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a3, a3);
        layoutParams3.addRule(11, -1);
        layoutParams3.addRule(15, -1);
        layoutParams3.rightMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.x.addView(imageView, layoutParams3);
        this.t = new TextView(this.d);
        this.t.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.t.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.t.setSingleLine(true);
        this.t.setTextColor(-10066330);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(9, -1);
        layoutParams4.addRule(0, imageView.getId());
        layoutParams4.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams4.rightMargin = layoutParams4.leftMargin;
        this.x.addView(this.t, layoutParams4);
        if (!"instalment".equals(a2)) {
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setBackgroundColor(-3419943);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, 1);
            layoutParams5.bottomMargin = com.unionpay.mobile.android.global.a.f;
            layoutParams5.addRule(3, this.x.getId());
            relativeLayout.addView(linearLayout2, layoutParams5);
        }
        b(g());
        a(this.r.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Dialog b(p pVar) {
        if (pVar.p == null || pVar.z) {
            pVar.z = false;
            pVar.p = new AlertDialog.Builder(pVar.d).setInverseBackgroundForced(false).create();
            AlertDialog alertDialog = pVar.p;
            LinearLayout linearLayout = new LinearLayout(pVar.d);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1);
            int a = com.unionpay.mobile.android.utils.g.a(pVar.d, 1.0f);
            RelativeLayout relativeLayout = new RelativeLayout(pVar.d);
            int i = com.unionpay.mobile.android.global.b.g;
            relativeLayout.setPadding(i, i, i, i);
            linearLayout.addView(relativeLayout);
            LinearLayout linearLayout2 = new LinearLayout(pVar.d);
            linearLayout2.setBackgroundColor(-3419943);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, 1));
            TextView textView = new TextView(pVar.d);
            textView.setText(pVar.w);
            textView.setTextSize(com.unionpay.mobile.android.global.b.i);
            textView.setTextColor(-13421773);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13, -1);
            relativeLayout.addView(textView, layoutParams);
            relativeLayout.setBackgroundColor(-986892);
            new LinearLayout.LayoutParams(-1, -2);
            ListView listView = new ListView(pVar.d);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) pVar.r);
            listView.setDividerHeight(a);
            listView.setOnItemClickListener(new t(pVar));
            new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(listView);
            alertDialog.setView(linearLayout, -1, -1, -1, -1);
            pVar.p.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return pVar.p;
    }

    private List<Map<String, Object>> b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("label", a(i, "label"));
            hashMap.put("style", a(i, "rel_value_style"));
            String[] split = a(i, "rel_value").split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
            ArrayList arrayList2 = new ArrayList(split.length);
            ArrayList arrayList3 = new ArrayList(split.length);
            for (String str : split) {
                String[] split2 = str.split(CommonConstant.Symbol.COLON);
                arrayList2.add(split2[0]);
                arrayList3.add(split2[1]);
            }
            hashMap.put("keys", arrayList2);
            hashMap.put("values", arrayList3);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        String a = a(this.s - this.r.a(), "value");
        if (this.u != null && !this.u.b()) {
            a = null;
        }
        com.unionpay.mobile.android.utils.k.c("uppay", n() + " : " + a);
        return a;
    }

    public final void a(q.a aVar) {
        this.u.a(aVar);
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.z = true;
        this.c = jSONArray;
        this.o = b(jSONArray);
        this.r = new com.unionpay.mobile.android.upwidget.e(this.d, this.o, "");
        a(this.m);
    }

    public final void a(boolean z) {
        this.y = z;
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
        String a = com.unionpay.mobile.android.utils.j.a(this.n, "type");
        if ("instalment".equals(a)) {
            LinearLayout linearLayout3 = new LinearLayout(this.d);
            linearLayout3.setId(linearLayout3.hashCode());
            linearLayout3.setBackgroundColor(-3419943);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
            layoutParams.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
            linearLayout2.addView(linearLayout3, layoutParams);
        }
        JSONObject a2 = a(a, str, com.unionpay.mobile.android.utils.j.a(this.n, "checked"));
        Context context = this.d;
        this.u = new com.unionpay.mobile.android.upwidget.q(context, a2, s() + "_agree_installment");
        this.u.a();
        this.u.a(com.unionpay.mobile.android.global.b.k);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.n);
        layoutParams2.gravity = 16;
        int a3 = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        layoutParams2.rightMargin = a3;
        layoutParams2.leftMargin = a3;
        linearLayout2.addView(this.u, layoutParams2);
        return true;
    }

    public final void b(boolean z) {
        this.u.a(z);
        if (!z) {
            this.y = z;
        }
        int i = (this.y && z) ? 0 : 8;
        this.m.setVisibility(i);
        if (this.v != null) {
            if (TextUtils.isEmpty(this.v.getText().toString())) {
                this.v.setVisibility(8);
            } else {
                this.v.setVisibility(i);
            }
        }
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return true;
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    protected final boolean b_() {
        this.v = new TextView(this.d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 5.0f);
        layoutParams.bottomMargin = a;
        layoutParams.topMargin = a;
        this.v.setTextSize(com.unionpay.mobile.android.global.b.k);
        addView(this.v, layoutParams);
        this.v.setVisibility(8);
        return true;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_select_installment";
    }

    @Override // com.unionpay.mobile.android.widgets.z, com.unionpay.mobile.android.widgets.ba
    public final boolean f() {
        String a = a(this.s - this.r.a(), "available");
        return TextUtils.isEmpty(a) || !"1".equals(a);
    }

    public final boolean g() {
        if (this.u != null) {
            return this.u.b();
        }
        return true;
    }
}
