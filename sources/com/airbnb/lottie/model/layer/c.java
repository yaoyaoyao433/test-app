package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.i;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends a {
    private final Paint g;
    private final Rect h;
    private final Rect i;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.g = new Paint(3);
        this.h = new Rect();
        this.i = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void b(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap c = c();
        if (c == null || c.isRecycled()) {
            return;
        }
        float a = com.airbnb.lottie.utils.f.a();
        this.g.setAlpha(i);
        if (this.j != null) {
            this.g.setColorFilter(this.j.d());
        }
        canvas.save();
        canvas.concat(matrix);
        this.h.set(0, 0, c.getWidth(), c.getHeight());
        this.i.set(0, 0, (int) (c.getWidth() * a), (int) (c.getHeight() * a));
        canvas.drawBitmap(c, this.h, this.i, this.g);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap c = c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, c.getWidth()), Math.min(rectF.bottom, c.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    @Nullable
    private Bitmap c() {
        return this.b.a(this.c.g);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        super.a((c) t, (com.airbnb.lottie.value.c<c>) cVar);
        if (t == i.x) {
            if (cVar == null) {
                this.j = null;
            } else {
                this.j = new p(cVar);
            }
        }
    }
}
