package com.meituan.msi.api.component.canvas;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public String a;
    public Stack<com.meituan.msi.api.component.canvas.view.b> d;
    public Stack<com.meituan.msi.api.component.canvas.view.b> e;
    public Paint g;
    public Paint f = new Paint();
    public c h = null;
    public com.meituan.msi.api.component.canvas.view.b b = new com.meituan.msi.api.component.canvas.view.b();
    public com.meituan.msi.api.component.canvas.view.b c = new com.meituan.msi.api.component.canvas.view.b();

    public f() {
        this.b.setStyle(Paint.Style.STROKE);
        this.c.setStyle(Paint.Style.FILL);
        this.b.setAntiAlias(true);
        this.c.setAntiAlias(true);
        this.b.setStrokeWidth(com.meituan.msi.util.f.d(1.0f));
        this.c.setStrokeWidth(com.meituan.msi.util.f.d(1.0f));
        this.d = new Stack<>();
        this.e = new Stack<>();
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
