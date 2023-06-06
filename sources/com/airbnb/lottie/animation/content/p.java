package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p implements l, a.InterfaceC0016a {
    private final Path a = new Path();
    private final String b;
    private final LottieDrawable c;
    private final com.airbnb.lottie.animation.keyframe.a<?, Path> d;
    private boolean e;
    @Nullable
    private r f;

    public p(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.o oVar) {
        this.b = oVar.a;
        this.c = lottieDrawable;
        this.d = oVar.b.a();
        aVar.a(this.d);
        this.d.a(this);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.a == q.a.a) {
                    this.f = rVar;
                    this.f.a(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        this.a.set(this.d.d());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        com.airbnb.lottie.utils.f.a(this.a, this.f);
        this.e = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }
}
