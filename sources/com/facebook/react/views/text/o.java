package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class o extends ReplacementSpan implements g {
    @Nullable
    public abstract Drawable a();

    public abstract void a(TextView textView);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract int f();

    public static void a(Spannable spannable, TextView textView) {
        o[] oVarArr;
        for (o oVar : (o[]) spannable.getSpans(0, spannable.length(), o.class)) {
            oVar.d();
            oVar.a(textView);
        }
    }
}
