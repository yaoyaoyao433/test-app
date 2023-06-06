package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.hw;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class hf implements Animation {
    public hw a = null;
    protected a b;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public long getDuration() {
        if (this.a != null) {
            return this.a.a();
        }
        return 0L;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public Interpolator getInterpolator() {
        if (this.a != null) {
            return this.a.f;
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public AnimationListener getAnimationListener() {
        if (this.b != null) {
            return this.b.a;
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setAnimationListener(AnimationListener animationListener) {
        this.b = new a(animationListener);
        if (this.a != null) {
            this.a.a(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements hw.a {
        AnimationListener a;

        public a(AnimationListener animationListener) {
            this.a = animationListener;
        }

        @Override // com.tencent.mapsdk.internal.hw.a
        public final void a() {
            if (this.a != null) {
                jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.hf.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a.onAnimationStart();
                    }
                });
            }
        }

        @Override // com.tencent.mapsdk.internal.hw.a
        public final void b() {
            if (this.a != null) {
                jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.hf.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a.onAnimationEnd();
                    }
                });
            }
        }
    }
}
