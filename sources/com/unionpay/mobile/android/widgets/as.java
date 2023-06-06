package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
/* loaded from: classes6.dex */
public final class as extends LinearLayout {
    private com.unionpay.mobile.android.resource.c a;
    private ImageView b;
    private ImageView c;

    public as(Context context) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = com.unionpay.mobile.android.resource.c.a(context);
        setBackgroundColor(0);
        setOrientation(1);
        this.c = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.unionpay.mobile.android.global.a.C);
        layoutParams.gravity = 80;
        addView(this.c, layoutParams);
        Drawable a = this.a.a(1001, -1, -1);
        if (this.b != null) {
            this.b.setBackgroundDrawable(a);
        }
    }
}
