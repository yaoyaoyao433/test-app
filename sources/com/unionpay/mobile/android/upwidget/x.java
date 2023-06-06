package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes6.dex */
public final class x extends LinearLayout {
    private Context a;
    private TextView b;

    private x(Context context, Drawable drawable) {
        super(context);
        this.a = null;
        this.b = null;
        this.a = context;
        setOrientation(0);
        Context context2 = this.a;
        if (drawable != null) {
            ImageView imageView = new ImageView(context2);
            imageView.setBackgroundDrawable(drawable);
            int i = com.unionpay.mobile.android.global.b.o;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.gravity = 16;
            addView(imageView, layoutParams);
        }
        this.b = new TextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (drawable != null) {
            layoutParams2.leftMargin = com.unionpay.mobile.android.global.a.d;
        }
        addView(this.b, layoutParams2);
    }

    public static x a(Context context, Drawable drawable) {
        x xVar = new x(context, drawable);
        if (xVar.b != null) {
            xVar.b.setTextSize(16.0f);
        }
        xVar.a(com.unionpay.mobile.android.utils.h.a(-16758391, (int) SupportMenu.CATEGORY_MASK));
        return xVar;
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.setTextColor(colorStateList);
        }
    }

    public final void a(CharSequence charSequence) {
        if (this.b != null) {
            this.b.setText(charSequence);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.b != null) {
            this.b.setOnClickListener(onClickListener);
        }
    }
}
