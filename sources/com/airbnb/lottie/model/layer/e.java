package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends a {
    @Override // com.airbnb.lottie.model.layer.a
    final void b(Canvas canvas, Matrix matrix, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
