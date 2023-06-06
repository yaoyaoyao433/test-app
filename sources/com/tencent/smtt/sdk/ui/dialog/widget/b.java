package com.tencent.smtt.sdk.ui.dialog.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.widget.Button;
/* loaded from: classes6.dex */
public class b extends Button {
    private int a;
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;
    private c g;
    private c h;
    private c i;

    public b(Context context, float f, float f2, float f3, float f4, int i) {
        super(context);
        this.g = null;
        this.h = null;
        this.i = null;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.a = i;
        this.b = Color.parseColor("#D0D0D0");
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r8, int r9, int r10) {
        /*
            r7 = this;
            float r5 = (float) r9
            r0 = r7
            r1 = r8
            r2 = r5
            r3 = r5
            r4 = r5
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.ui.dialog.widget.b.<init>(android.content.Context, int, int):void");
    }

    public void a() {
        this.g = new c(this.a, this.c, this.d, this.e, this.f);
        this.g.a(getWidth(), getHeight());
        this.h = new c((this.a & ViewCompat.MEASURED_SIZE_MASK) | 1342177280, this.c, this.d, this.e, this.f);
        this.h.a(getWidth(), getHeight());
        this.i = new c(this.b, this.c, this.d, this.e, this.f);
        this.i.a(getWidth(), getHeight());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, -16842919}, this.g);
        stateListDrawable.addState(new int[]{16842910, 16842919}, this.h);
        stateListDrawable.addState(new int[]{-16842910}, this.i);
        setBackgroundDrawable(stateListDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.g != null) {
            this.g.a(i3 - i, i4 - i2);
        }
        if (this.h != null) {
            this.h.a(i3 - i, i4 - i2);
        }
        if (this.i != null) {
            this.i.a(i3 - i, i4 - i2);
        }
    }
}
