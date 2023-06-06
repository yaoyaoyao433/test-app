package com.facebook.react.views.text.glidesupport;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.views.image.c;
import com.facebook.react.views.text.o;
import com.meituan.robust.common.StringUtil;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.SizeReadyCallback;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends o {
    @Nullable
    private Drawable a;
    private c b;
    private int c;
    private int d;
    @Nullable
    private TextView e;
    private Context f;

    public a(Context context, c cVar, int i, int i2) {
        this.f = context;
        this.b = cVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.react.views.text.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f
            if (r0 == 0) goto L38
            android.content.Context r0 = r3.f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L30
            r1 = 0
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L15
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L26
        L15:
            boolean r2 = r0 instanceof com.facebook.react.uimanager.ao
            if (r2 == 0) goto L26
            com.facebook.react.uimanager.ao r0 = (com.facebook.react.uimanager.ao) r0
            android.content.Context r0 = r0.getBaseContext()
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L26
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
        L26:
            if (r1 == 0) goto L30
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 != 0) goto L38
            android.content.Context r0 = r3.f
            com.squareup.picasso.Picasso.f(r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.glidesupport.a.b():void");
    }

    @Override // com.facebook.react.views.text.o
    public final void c() {
        if (this.f != null) {
            Picasso.f(this.f);
        }
    }

    @Override // com.facebook.react.views.text.o
    public final void d() {
        if (this.f != null) {
            Picasso.e(this.f);
        }
    }

    @Override // com.facebook.react.views.text.o
    public final void e() {
        if (this.f != null) {
            Picasso.e(this.f);
        }
    }

    @Override // com.facebook.react.views.text.o
    @Nullable
    public final Drawable a() {
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.d;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.c;
    }

    @Override // com.facebook.react.views.text.o
    public final void a(TextView textView) {
        this.e = textView;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.a == null && this.f != null) {
            RequestCreator requestCreator = null;
            if (this.b != null) {
                Uri uri = this.b.a;
                if (this.b.h) {
                    requestCreator = com.facebook.react.a.a(this.f, this.b.a);
                } else if (uri != null) {
                    requestCreator = Picasso.g(this.f.getApplicationContext()).a(uri);
                } else if (this.b.g && this.b.d > 0) {
                    requestCreator = Picasso.g(this.f.getApplicationContext()).a(this.b.d);
                } else if (this.b.i != null) {
                    requestCreator = Picasso.g(this.f.getApplicationContext()).a(this.b.i);
                } else {
                    com.facebook.common.logging.a.b("[GlideBasedReactTextInlineImageSpan@draw]", uri + StringUtil.SPACE + this.b.d);
                }
            }
            if (requestCreator != null) {
                if (this.b.e != 0) {
                    requestCreator.f = this.b.e;
                }
                if (this.b.f != 0) {
                    requestCreator.g = this.b.f;
                }
                if (this.b.b != 0.0d && this.b.c != 0.0d) {
                    requestCreator.b((int) (this.b.b + 0.5d), (int) (this.b.c + 0.5d));
                }
                requestCreator.k = DiskCacheStrategy.SOURCE;
                requestCreator.a(new PicassoDrawableTarget() { // from class: com.facebook.react.views.text.glidesupport.a.1
                    @Override // com.squareup.picasso.PicassoDrawableTarget
                    public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                        if (a.this.a == null) {
                            a.this.a = picassoDrawable;
                            if (a.this.e != null) {
                                a.this.e.invalidate();
                            }
                        }
                    }

                    @Override // com.squareup.picasso.PicassoDrawableTarget
                    public final void getSize(SizeReadyCallback sizeReadyCallback) {
                        if (a.this.c > 0 && a.this.d > 0) {
                            sizeReadyCallback.a(a.this.c, a.this.d);
                        } else {
                            super.getSize(sizeReadyCallback);
                        }
                    }
                });
            }
        }
        if (this.a != null) {
            this.a.setBounds(0, 0, this.c, this.d);
            this.a.setCallback(this.e);
            canvas.save();
            canvas.translate(f, i4 - this.a.getBounds().bottom);
            this.a.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.facebook.react.views.text.o
    public final int f() {
        return this.d;
    }
}
