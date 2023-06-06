package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.liteav.TXLiteAVCode;
/* loaded from: classes6.dex */
public final class ay extends RelativeLayout {
    private Context a;
    private TextView b;
    private ImageView c;
    private TextView d;
    private Drawable e;
    private ImageView f;
    private LinearLayout g;
    private int h;
    private int i;
    private int j;
    private a k;

    /* loaded from: classes6.dex */
    public interface a {
        void l();
    }

    public ay(Context context, String str, Drawable drawable, int i, a aVar) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.a = context;
        this.k = aVar;
        this.j = com.unionpay.mobile.android.utils.g.a(this.a, 10.0f);
        this.e = drawable;
        this.h = i;
        b(str);
    }

    public ay(Context context, String str, a aVar) {
        this(context, str, aVar, (byte) 0);
    }

    private ay(Context context, String str, a aVar, byte b) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.a = context;
        this.k = aVar;
        this.j = com.unionpay.mobile.android.utils.g.a(this.a, 10.0f);
        b(str);
    }

    private void b(String str) {
        this.i = com.unionpay.mobile.android.global.a.k;
        setLayoutParams(new RelativeLayout.LayoutParams(-1, this.i));
        setBackgroundColor(com.unionpay.mobile.android.global.a.M);
        com.unionpay.mobile.android.resource.c a2 = com.unionpay.mobile.android.resource.c.a(this.a);
        this.g = new LinearLayout(this.a);
        this.g.setOnClickListener(new az(this));
        this.g.setPadding(this.j, this.j, this.j, this.j);
        this.g.setGravity(16);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        addView(this.g, layoutParams);
        int a3 = com.unionpay.mobile.android.utils.g.a(this.a, 20.0f);
        int a4 = com.unionpay.mobile.android.utils.g.a(this.a, 11.0f);
        if (this.h != 0) {
            a4 = this.h;
        }
        ImageView imageView = new ImageView(this.a);
        imageView.setBackgroundDrawable(this.e != null ? this.e : a2.a(TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, -1, -1));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a4, a3);
        layoutParams2.addRule(15, -1);
        this.g.addView(imageView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.global.a.l, this.i);
        layoutParams3.addRule(13, -1);
        this.d = new TextView(this.a);
        this.d.setTextSize(20.0f);
        this.d.setTextColor(-1);
        this.d.setText(str);
        this.d.setGravity(17);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.d, layoutParams3);
        if (!TextUtils.isEmpty(null)) {
            int i = com.unionpay.mobile.android.global.a.e;
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, this.i);
            layoutParams4.addRule(11, -1);
            layoutParams4.addRule(15, -1);
            layoutParams4.rightMargin = i;
            this.b = new TextView(this.a);
            this.b.setTextSize(16.0f);
            this.b.setTextColor(-1);
            this.b.setText((CharSequence) null);
            this.b.setGravity(16);
            this.b.setId(this.b.hashCode());
            addView(this.b, layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.global.a.H, com.unionpay.mobile.android.global.a.m);
            layoutParams5.addRule(0, this.b.getId());
            layoutParams5.addRule(15, -1);
            layoutParams5.rightMargin = i;
            addView(new o(this.a, com.unionpay.mobile.android.global.a.N, 1), layoutParams5);
        }
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(com.unionpay.mobile.android.global.a.E, com.unionpay.mobile.android.global.a.D);
        layoutParams6.addRule(11, -1);
        layoutParams6.addRule(15, -1);
        layoutParams6.rightMargin = this.j;
        Drawable a5 = a2.a(1031, -1, -1);
        this.f = new ImageView(this.a);
        this.f.setBackgroundDrawable(a5);
        addView(this.f, layoutParams6);
        int i2 = com.unionpay.mobile.android.global.a.D;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams7.addRule(11, -1);
        layoutParams7.addRule(15, -1);
        layoutParams7.rightMargin = this.j;
        this.c = new ImageView(this.a);
        addView(this.c, layoutParams7);
    }

    public final void a() {
        if (this.g != null) {
            this.g.setVisibility(8);
        }
    }

    public final void a(int i) {
        if (this.c != null) {
            if (i == 0) {
                this.f.setVisibility(8);
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(8);
                this.f.setVisibility(0);
            }
            this.c.setVisibility(i);
        }
    }

    public final void a(String str) {
        if (this.d != null) {
            this.d.setText(str);
        }
    }
}
