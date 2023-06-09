package com.tencent.open.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends RelativeLayout {
    private static final String a = "com.tencent.open.c.a";
    private Rect b;
    private boolean c;
    private InterfaceC1490a d;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.open.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1490a {
        void a();

        void a(int i);
    }

    public a(Context context) {
        super(context);
        this.b = null;
        this.c = false;
        this.d = null;
        if (this.b == null) {
            this.b = new Rect();
        }
    }

    public void a(InterfaceC1490a interfaceC1490a) {
        this.d = interfaceC1490a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.b.top) - size;
        if (this.d != null && size != 0) {
            if (height > 100) {
                this.d.a((Math.abs(this.b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                this.d.a();
            }
        }
        super.onMeasure(i, i2);
    }
}
