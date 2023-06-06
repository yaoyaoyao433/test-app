package com.sankuai.waimai.restaurant.shopcart.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class RoundRectTextView extends TextView {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private boolean d;
    private Paint e;

    public RoundRectTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c171daa0cdbbc021600efed09ebce4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c171daa0cdbbc021600efed09ebce4c");
            return;
        }
        this.d = false;
        this.b = 0;
        this.c = 0;
        a();
    }

    public RoundRectTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ca24d841c69452f21ce3d4602b10e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ca24d841c69452f21ce3d4602b10e4");
            return;
        }
        this.d = false;
        this.b = 0;
        this.c = 0;
        a();
    }

    public RoundRectTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d780e555825f8ca23bf1c596ac5c2465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d780e555825f8ca23bf1c596ac5c2465");
            return;
        }
        this.d = false;
        this.b = 0;
        this.c = 0;
        a();
    }

    public RoundRectTextView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac40ebcf8bae9c1bb6b4440208b8b421", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac40ebcf8bae9c1bb6b4440208b8b421");
            return;
        }
        this.d = false;
        this.b = 0;
        this.c = 0;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4352359c4eca1ce7afe6bc5c40dfac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4352359c4eca1ce7afe6bc5c40dfac9");
            return;
        }
        this.e = new Paint();
        this.e.setColor(SupportMenu.CATEGORY_MASK);
        this.e.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03efbb3ce056091024fad0292bd2e69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03efbb3ce056091024fad0292bd2e69b");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.b = i;
        this.c = i2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85522d2e6d2c6fa38e8dc2098de571fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85522d2e6d2c6fa38e8dc2098de571fc");
            return;
        }
        if (this.d) {
            Paint paint = this.e;
            int i = this.b;
            int i2 = this.c;
            Object[] objArr2 = {canvas, paint, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "27a6b4701073ff9004f1f6afa566ac7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "27a6b4701073ff9004f1f6afa566ac7d");
            } else if (i > 0 && i2 > 0 && i >= i2) {
                canvas.save();
                float f = i2 / 2;
                canvas.drawRoundRect(0.0f, 0.0f, i, i2, f, f, paint);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    public void setDrawable(boolean z) {
        this.d = z;
    }
}
