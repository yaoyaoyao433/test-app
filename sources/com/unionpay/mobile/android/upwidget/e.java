package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class e extends BaseAdapter {
    private Drawable a;
    private Context b;
    private String c;
    private int e;
    private List<Map<String, Object>> f;
    private String d = null;
    private ArrayList<View.OnClickListener> g = new ArrayList<>();
    private View.OnClickListener h = new f(this);

    public e(Context context, List<Map<String, Object>> list, String str) {
        this.c = null;
        this.e = 1;
        this.b = context;
        this.f = list;
        this.c = str;
        this.e = 0;
        this.a = com.unionpay.mobile.android.resource.c.a(this.b).a(1015, -1, -1);
    }

    private boolean b() {
        return (this.c == null || TextUtils.isEmpty(this.c)) ? false : true;
    }

    private boolean b(int i) {
        Object obj;
        int a = i - a();
        return this.f == null || a == this.f.size() || (obj = this.f.get(a).get("available")) == null || Boolean.FALSE != ((Boolean) obj);
    }

    public final int a() {
        return b() ? 1 : 0;
    }

    public final void a(int i) {
        this.e = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i = 0;
        if (this.f == null) {
            return 0;
        }
        int size = this.f.size() + a();
        if (this.d != null && !TextUtils.isEmpty(this.d)) {
            i = 1;
        }
        return size + i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i == 0 || this.f == null || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i - a());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        getItem(i);
        Map<String, Object> map = this.f.get(i - a());
        List list = (List) map.get("keys");
        List list2 = (List) map.get("values");
        LinearLayout linearLayout = new LinearLayout(this.b);
        linearLayout.setOrientation(1);
        RelativeLayout relativeLayout = new RelativeLayout(this.b);
        int i2 = com.unionpay.mobile.android.global.b.g;
        relativeLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(relativeLayout);
        LinearLayout linearLayout2 = new LinearLayout(this.b);
        linearLayout2.setBackgroundColor(-3419943);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        ImageView imageView = new ImageView(this.b);
        imageView.setVisibility(4);
        imageView.setId(imageView.hashCode());
        TextView textView = new TextView(this.b);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText((String) map.get("style"));
        textView.setTextSize(com.unionpay.mobile.android.global.b.i);
        textView.setTextColor(-10066330);
        int a = com.unionpay.mobile.android.utils.g.a(this.b, 20.0f);
        int i3 = this.e == i ? 1008 : 1007;
        int a2 = com.unionpay.mobile.android.utils.g.a(this.b, 20.0f);
        Drawable a3 = com.unionpay.mobile.android.resource.c.a(this.b).a(i3, a, a);
        if (b(i)) {
            imageView.setVisibility(0);
        }
        imageView.setBackgroundDrawable(a3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(9, -1);
        relativeLayout.addView(imageView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15, -1);
        int hashCode = imageView.hashCode();
        boolean z = true;
        layoutParams3.addRule(1, hashCode);
        layoutParams3.leftMargin = com.unionpay.mobile.android.global.b.g;
        relativeLayout.addView(textView, layoutParams3);
        LinearLayout linearLayout3 = new LinearLayout(this.b);
        linearLayout3.setOrientation(1);
        int i4 = 5;
        linearLayout3.setGravity(5);
        linearLayout3.setId(linearLayout3.hashCode());
        LinearLayout linearLayout4 = new LinearLayout(this.b);
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(5);
        linearLayout4.setId(linearLayout4.hashCode());
        int i5 = 0;
        while (i5 < list.size()) {
            TextView textView2 = new TextView(this.b);
            textView2.setSingleLine(z);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText((CharSequence) list.get(i5));
            textView2.setTextSize(com.unionpay.mobile.android.global.b.k);
            textView2.setTextColor(-6710887);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = i4;
            linearLayout3.addView(textView2, layoutParams4);
            TextView textView3 = new TextView(this.b);
            textView3.setSingleLine(true);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setText((CharSequence) list2.get(i5));
            textView3.setTextSize(com.unionpay.mobile.android.global.b.k);
            textView3.setTextColor(-6710887);
            linearLayout4.addView(textView3, layoutParams4);
            i5++;
            i4 = 5;
            z = true;
        }
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.utils.g.a(this.b, 120.0f), -2);
        layoutParams5.addRule(11, -1);
        relativeLayout.addView(linearLayout4, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.utils.g.a(this.b, 100.0f), -2);
        layoutParams6.addRule(0, linearLayout4.getId());
        relativeLayout.addView(linearLayout3, layoutParams6);
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        linearLayout.addView(linearLayout2, layoutParams);
        return linearLayout;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        if (!(b() && i == 0) && b(i)) {
            return super.isEnabled(i);
        }
        return false;
    }
}
