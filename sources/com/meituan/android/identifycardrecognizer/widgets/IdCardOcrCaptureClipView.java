package com.meituan.android.identifycardrecognizer.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IdCardOcrCaptureClipView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private Paint n;

    public IdCardOcrCaptureClipView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742f3da1b2ac57672dbacaffb85e3c84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742f3da1b2ac57672dbacaffb85e3c84");
            return;
        }
        this.b = 0;
        this.n = new Paint();
    }

    public IdCardOcrCaptureClipView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117f333c495410917b51ae94d382bf9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117f333c495410917b51ae94d382bf9b");
            return;
        }
        this.b = 0;
        this.n = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.idcard_clip_width, R.attr.idcard_clip_heigh});
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.j = this.h;
        this.k = this.i;
        obtainStyledAttributes.recycle();
        this.l = aj.a(context, 314.0f);
        this.m = aj.a(context, 200.0f);
    }

    public IdCardOcrCaptureClipView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e36af6edf2f46e2fb3b44964b888fbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e36af6edf2f46e2fb3b44964b888fbc");
            return;
        }
        this.b = 0;
        this.n = new Paint();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403b838ed5869f150e929b5eadf70140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403b838ed5869f150e929b5eadf70140");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.g = getWidth() == 0 ? this.l : getWidth();
        this.f = getHeight() == 0 ? this.m : getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap createBitmap;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b465bcb883d267479362a9a7526b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b465bcb883d267479362a9a7526b37");
            return;
        }
        super.onDraw(canvas);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e38f67e28c3f67182bc740b16d5aa0e", RobustBitConfig.DEFAULT_VALUE)) {
            createBitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e38f67e28c3f67182bc740b16d5aa0e");
        } else {
            createBitmap = Bitmap.createBitmap((int) this.g, (int) this.f, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.clipRect(new RectF(0.0f, 0.0f, this.g, this.f));
            Path path = new Path();
            path.addRoundRect(new RectF((this.g / 2.0f) - (this.h / 2.0f), (this.f / 2.0f) - (this.i / 2.0f), (this.g / 2.0f) + (this.h / 2.0f), (this.f / 2.0f) + (this.i / 2.0f)), 8.0f, 8.0f, Path.Direction.CCW);
            canvas2.clipPath(path, Region.Op.DIFFERENCE);
            this.n.setColor(-16777216);
            this.n.setAlpha(100);
            canvas2.drawRect(new RectF(0.0f, 0.0f, this.g, this.f), this.n);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.save();
        switch (this.b) {
            case 0:
                canvas.rotate(0.0f, this.g / 2.0f, this.f / 2.0f);
                break;
            case 1:
                canvas.rotate(270.0f, this.g / 2.0f, this.f / 2.0f);
                break;
            case 2:
                canvas.rotate(180.0f, this.g / 2.0f, this.f / 2.0f);
                break;
            case 3:
                canvas.rotate(90.0f, this.g / 2.0f, this.f / 2.0f);
                break;
        }
        this.n.setColor(this.e);
        this.n.setTextSize(this.d);
        this.n.setAntiAlias(true);
        canvas.drawText(this.c, 0, this.c.length(), (this.g - ((int) this.n.measureText(this.c))) / 2.0f, ((this.f - this.k) / 2.0f) - aj.a(getContext(), 15.0f), this.n);
        canvas.restore();
    }

    public void setOrientationChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397859c1cebcfb7b20755bfb234d9cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397859c1cebcfb7b20755bfb234d9cc6");
            return;
        }
        this.b = i;
        if (this.b == 0 || this.b == 2) {
            this.h = this.j;
            this.i = this.k;
        } else {
            this.h = this.k;
            this.i = this.j;
        }
        invalidate();
    }

    public final void a(String str, int i, int i2) {
        this.c = str;
        this.d = i;
        this.e = i2;
    }
}
