package com.facebook.react.uimanager.layoutanimation;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.UiThreadUtil;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ProGuard */
@NotThreadSafe
/* loaded from: classes.dex */
public final class e {
    @Nullable
    private static Handler h;
    public boolean e;
    @Nullable
    public Runnable g;
    public final a a = new h();
    public final a b = new k();
    public final a c = new i();
    public final SparseArray<j> d = new SparseArray<>(0);
    public long f = -1;

    public final void a() {
        this.a.b();
        this.b.b();
        this.c.b();
        this.g = null;
        this.e = false;
        this.f = -1L;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return (this.e && view.getParent() != null) || this.d.get(view.getId()) != null;
    }

    public final void a(View view, final f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation b = this.c.b(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (b != null) {
            b(view);
            b.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.e.3
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    fVar.a();
                }
            });
            long duration = b.getDuration();
            if (duration > this.f) {
                a(duration);
                this.f = duration;
            }
            view.startAnimation(b);
            return;
        }
        fVar.a();
    }

    private void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }

    public void a(long j) {
        if (h == null) {
            h = new Handler(Looper.getMainLooper());
        }
        if (this.g != null) {
            h.removeCallbacks(this.g);
            h.postDelayed(this.g, j);
        }
    }
}
