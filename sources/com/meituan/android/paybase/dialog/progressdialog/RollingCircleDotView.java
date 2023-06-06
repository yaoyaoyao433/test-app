package com.meituan.android.paybase.dialog.progressdialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RollingCircleDotView extends View {
    public static ChangeQuickRedirect a;
    private static final int h = Color.parseColor("#EEEEEE");
    private static final int i = Color.parseColor("#888888");
    public boolean b;
    int c;
    private Paint d;
    private int e;
    private int f;
    private int g;
    private Handler j;

    public RollingCircleDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6c8e4183371e44e4138bd230790e10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6c8e4183371e44e4138bd230790e10");
            return;
        }
        this.e = 3;
        this.f = 8;
        this.g = 200;
        this.b = true;
        this.c = 1;
        this.e = aj.a(context, 3.5f);
        this.f = aj.a(context, 15.0f);
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.j = new Handler();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6321129b01e4056255dcf8929ffe766a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6321129b01e4056255dcf8929ffe766a");
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        switch (this.c) {
            case 1:
                int i2 = h;
                int i3 = i;
                a(canvas, width, height, i2, i3, i3);
                return;
            case 2:
                a(canvas, width, height, i, h, i);
                return;
            case 3:
                int i4 = i;
                a(canvas, width, height, i4, i4, h);
                return;
            default:
                return;
        }
    }

    private void a(Canvas canvas, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {canvas, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d5013ad0f4dfc01fff0ed8f288ded7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d5013ad0f4dfc01fff0ed8f288ded7");
            return;
        }
        this.d.setColor(i4);
        float f = i2 / 2.0f;
        float f2 = i3 / 2.0f;
        canvas.drawCircle(f - this.f, f2, this.e, this.d);
        this.d.setColor(i5);
        canvas.drawCircle(f, f2, this.e, this.d);
        this.d.setColor(i6);
        canvas.drawCircle(f + this.f, f2, this.e, this.d);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47cc35b9c891f9d726b03d6c87ded8a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47cc35b9c891f9d726b03d6c87ded8a5");
            return;
        }
        this.j.post(new Runnable() { // from class: com.meituan.android.paybase.dialog.progressdialog.RollingCircleDotView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6858ed085ee827801e553a436b629713", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6858ed085ee827801e553a436b629713");
                    return;
                }
                RollingCircleDotView rollingCircleDotView = RollingCircleDotView.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = RollingCircleDotView.a;
                if (PatchProxy.isSupport(objArr3, rollingCircleDotView, changeQuickRedirect3, false, "d12a68ce3190fabc0b43a525878a0420", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, rollingCircleDotView, changeQuickRedirect3, false, "d12a68ce3190fabc0b43a525878a0420");
                } else {
                    rollingCircleDotView.c++;
                    if (rollingCircleDotView.c > 3) {
                        rollingCircleDotView.c = 1;
                    }
                    rollingCircleDotView.postInvalidate();
                }
                if (RollingCircleDotView.this.b) {
                    RollingCircleDotView.this.j.postDelayed(this, RollingCircleDotView.this.g);
                }
            }
        });
    }

    public void setFlag(boolean z) {
        this.b = z;
    }
}
