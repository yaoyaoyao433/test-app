package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.n;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends a {
    private final com.airbnb.lottie.animation.content.c g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.g = new com.airbnb.lottie.animation.content.c(lottieDrawable, this, new n("__container", dVar.a));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a
    final void b(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.a(rectF, this.a);
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected final void b(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        this.g.a(eVar, i, list, eVar2);
    }
}
