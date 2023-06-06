package com.meituan.msc.mmpviews.shell.background;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.mmpviews.csstypes.b;
import com.meituan.msc.mmpviews.csstypes.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.PicassoBitmapDrawable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends c {
    public static ChangeQuickRedirect a;
    protected Matrix b;
    protected b.C0448b c;
    protected c.a d;
    protected RectF e;
    protected boolean f;
    private boolean i;

    public a(@NonNull b.C0448b c0448b, @NonNull c.a aVar) {
        this(null, c0448b, aVar);
        Object[] objArr = {c0448b, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018ef768e63517ceb82f5dbd1c0fa290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018ef768e63517ceb82f5dbd1c0fa290");
        }
    }

    private a(@Nullable Drawable drawable, @NonNull b.C0448b c0448b, @NonNull c.a aVar) {
        super(null);
        Object[] objArr = {null, c0448b, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e016213e7314f19acc3a3a8ce28b8e59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e016213e7314f19acc3a3a8ce28b8e59");
            return;
        }
        this.b = new Matrix();
        this.i = false;
        this.f = true;
        this.c = c0448b;
        this.d = aVar;
    }

    public final void a(RectF rectF) {
        this.e = rectF;
    }

    @Override // com.meituan.msc.mmpviews.shell.background.c, android.graphics.drawable.Animatable
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79c7bdeae274bc9e43fb12a2145932f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79c7bdeae274bc9e43fb12a2145932f");
            return;
        }
        super.start();
        this.i = true;
    }

    @Override // com.meituan.msc.mmpviews.shell.background.c
    public final void a(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4253b00d6318ac1f53d9fc693f6df060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4253b00d6318ac1f53d9fc693f6df060");
            return;
        }
        super.a(drawable);
        if (this.i) {
            start();
        }
    }

    public final void a(@NonNull Canvas canvas) {
        boolean z = true;
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319c0d539c68bdb4f7141b0e40443b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319c0d539c68bdb4f7141b0e40443b0a");
            return;
        }
        this.b.reset();
        float[] a2 = a();
        float f = a2[0];
        float f2 = a2[1];
        if (f == 1.0f && f2 == 1.0f) {
            z = false;
        }
        RectF a3 = a(f, f2);
        if (z) {
            i = canvas.save();
            this.b.setScale(f, f2);
            canvas.concat(this.b);
            a3.left /= f;
            a3.right /= f;
            a3.top /= f2;
            a3.bottom /= f2;
        }
        if (this.c.a() && this.c.b()) {
            a(canvas, a3);
        } else {
            b(canvas, a3);
        }
        if (z) {
            canvas.restoreToCount(i);
        }
    }

    private RectF a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b372332097f940cf63cdbc90891acb", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b372332097f940cf63cdbc90891acb");
        }
        Rect bounds = getBounds();
        RectF rectF = new RectF();
        if (this.c.a()) {
            rectF.left = bounds.left;
            rectF.right = bounds.left + (b() * f);
        } else {
            rectF.left = bounds.left - this.e.left;
            rectF.right = bounds.right + this.e.right;
        }
        if (this.c.b()) {
            rectF.top = bounds.top;
            rectF.bottom = bounds.top + (c() * f2);
        } else {
            rectF.top = bounds.top - this.e.top;
            rectF.bottom = bounds.bottom + this.e.bottom;
        }
        return rectF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ad, code lost:
        if (r24.f != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float[] a() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.shell.background.a.a():float[]");
    }

    @Override // com.meituan.msc.mmpviews.shell.background.c, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24638c15767bb064e55f54ebe194423d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24638c15767bb064e55f54ebe194423d");
        } else if (this.h == null) {
        } else {
            a(canvas);
        }
    }

    public void a(@NonNull Canvas canvas, RectF rectF) {
        Object[] objArr = {canvas, rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598fb805a82a270f110bfee16ddb0c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598fb805a82a270f110bfee16ddb0c46");
            return;
        }
        Drawable drawable = this.h;
        drawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        drawable.draw(canvas);
    }

    public void b(@NonNull Canvas canvas, RectF rectF) {
        Bitmap createBitmap;
        Object[] objArr = {canvas, rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2e2d44f71472e5bddace53f5a1ea53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2e2d44f71472e5bddace53f5a1ea53");
            return;
        }
        Drawable drawable = this.h;
        Object[] objArr2 = {drawable, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bb30646d3acb5ec7b1676f878530aa3f", RobustBitConfig.DEFAULT_VALUE)) {
            bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bb30646d3acb5ec7b1676f878530aa3f");
        } else if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else if (drawable instanceof PicassoBitmapDrawable) {
                bitmap = ((PicassoBitmapDrawable) drawable).b();
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap.Config config = drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                if (drawable instanceof ColorDrawable) {
                    createBitmap = Bitmap.createBitmap(2, 2, config);
                } else {
                    createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                }
                bitmap = createBitmap;
                Canvas canvas2 = new Canvas(bitmap);
                Rect copyBounds = drawable.copyBounds();
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas2);
                drawable.setBounds(copyBounds);
            }
        }
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawRect(rectF, paint);
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3644cf3206fcae133f8d455c9fc125aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3644cf3206fcae133f8d455c9fc125aa")).intValue();
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        Rect bounds = getBounds();
        return bounds.right - bounds.left;
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986df1c17dbdcaf4aed4ef2d076264ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986df1c17dbdcaf4aed4ef2d076264ae")).intValue();
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        Rect bounds = getBounds();
        return bounds.bottom - bounds.top;
    }
}
