package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class w extends LinearLayout {
    private String a;
    private x b;

    private w(Context context, String str, String str2, Drawable drawable) {
        super(context);
        this.a = null;
        this.b = null;
        setOrientation(0);
        this.a = str2;
        this.b = x.a(context, drawable);
        this.b.a(Html.fromHtml(String.format("<u>%s</u>", str)));
        this.b.a(com.unionpay.mobile.android.utils.h.a(-13601621, -15909519));
        addView(this.b);
    }

    public static final w a(Context context, JSONObject jSONObject, Drawable drawable) {
        if (jSONObject != null) {
            return new w(context, com.unionpay.mobile.android.utils.j.a(jSONObject, "label"), com.unionpay.mobile.android.utils.j.a(jSONObject, "href"), drawable);
        }
        return null;
    }

    public final String a() {
        return this.a;
    }

    public final void a(View.OnClickListener onClickListener) {
        if (this.b != null) {
            this.b.setOnClickListener(onClickListener);
        }
    }
}
