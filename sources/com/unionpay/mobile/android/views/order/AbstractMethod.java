package com.unionpay.mobile.android.views.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unionpay.mobile.android.upviews.a;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class AbstractMethod extends LinearLayout implements a.b {
    protected static final int a = com.unionpay.mobile.android.global.b.a;
    protected Context b;
    protected String c;
    protected String d;
    protected b e;
    protected a f;
    private Button g;
    private RelativeLayout h;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, boolean z, int i2, a.C1512a c1512a);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, String str2);
    }

    public AbstractMethod(Context context) {
        this(context, null);
    }

    public AbstractMethod(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractMethod(Context context, AttributeSet attributeSet, int i) {
        super(context);
        this.b = context;
        setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(com.unionpay.mobile.android.global.b.k);
        textView.setTextColor(com.unionpay.mobile.android.utils.h.a(-10705958, -5846275, -5846275, -6710887));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public final void a() {
        this.h = new RelativeLayout(this.b);
        addView(this.h, new LinearLayout.LayoutParams(-1, -2));
        a(this.h);
        RelativeLayout relativeLayout = new RelativeLayout(this.b);
        addView(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
        b(relativeLayout);
        RelativeLayout relativeLayout2 = new RelativeLayout(this.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = com.unionpay.mobile.android.global.a.f;
        addView(relativeLayout2, layoutParams);
        this.g = new Button(this.b);
        this.g.setText(e());
        Button button = this.g;
        int i = com.unionpay.mobile.android.global.b.b;
        int i2 = com.unionpay.mobile.android.global.b.c;
        button.setTextColor(com.unionpay.mobile.android.utils.h.a(i, i2, i2, com.unionpay.mobile.android.global.b.d));
        this.g.setTextSize(com.unionpay.mobile.android.global.b.i);
        this.g.setOnClickListener(new com.unionpay.mobile.android.views.order.a(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.b.n);
        layoutParams2.addRule(15, -1);
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.f;
        int a2 = com.unionpay.mobile.android.utils.g.a(this.b, 10.0f);
        layoutParams2.rightMargin = a2;
        layoutParams2.leftMargin = a2;
        relativeLayout2.addView(this.g, layoutParams2);
        RelativeLayout relativeLayout3 = new RelativeLayout(this.b);
        addView(relativeLayout3, layoutParams);
        c(relativeLayout3);
        this.g.setEnabled(f());
    }

    public final void a(Drawable drawable) {
        if (this.g == null || drawable == null) {
            return;
        }
        this.g.setBackgroundDrawable(drawable);
    }

    public abstract void a(RelativeLayout relativeLayout);

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    public final void a(b bVar) {
        this.e = bVar;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        this.g.setEnabled(!z);
    }

    public abstract int b();

    public abstract void b(RelativeLayout relativeLayout);

    public abstract a.C1512a c();

    public abstract void c(RelativeLayout relativeLayout);

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    public int d() {
        return 0;
    }

    public abstract String e();

    public abstract boolean f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.h.setVisibility(8);
    }
}
