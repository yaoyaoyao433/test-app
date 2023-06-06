package com.sankuai.waimai.store.search.common.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import java.lang.ref.WeakReference;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class EasterEggLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public Handler d;
    public Runnable e;
    public Bitmap f;
    private RelativeLayout.LayoutParams g;

    public EasterEggLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78181fd9a107d6014370c45ae03abcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78181fd9a107d6014370c45ae03abcd");
        } else {
            a();
        }
    }

    public EasterEggLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "164d28e77cf19247f47a0135e9f6d89b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "164d28e77cf19247f47a0135e9f6d89b");
        } else {
            a();
        }
    }

    public EasterEggLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84a4300714367b3f9e7f68c2dacce49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84a4300714367b3f9e7f68c2dacce49");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8fa7bd2480b5c63c3f67c3e3e53ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8fa7bd2480b5c63c3f67c3e3e53ef9");
            return;
        }
        this.g = new RelativeLayout.LayoutParams(h.a(getContext(), 40.0f), h.a(getContext(), 40.0f));
        this.d = new Handler();
        this.e = new Runnable() { // from class: com.sankuai.waimai.store.search.common.view.EasterEggLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0341a70894a7226b28a2d22eec83711b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0341a70894a7226b28a2d22eec83711b");
                } else {
                    EasterEggLayout.this.a(EasterEggLayout.this.f, 5);
                }
            }
        };
    }

    public void a(Bitmap bitmap, int i) {
        ObjectAnimator ofFloat;
        Animator animator;
        int i2 = 1;
        Object[] objArr = {bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f31ab60d5be4ffa1caea2ad83cff257b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f31ab60d5be4ffa1caea2ad83cff257b");
            return;
        }
        int i3 = 0;
        while (i3 < i) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageBitmap(bitmap);
            imageView.setLayoutParams(this.g);
            addView(imageView);
            Object[] objArr2 = new Object[i2];
            objArr2[0] = imageView;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fcd11c3f3c420aac5ceaa93dcf8c101", RobustBitConfig.DEFAULT_VALUE)) {
                animator = (Animator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fcd11c3f3c420aac5ceaa93dcf8c101");
            } else {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, RecceAnimUtils.SCALE_X, 1.0f, 0.9f, 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, RecceAnimUtils.SCALE_Y, 1.0f, 0.9f, 1.0f);
                ofFloat2.setDuration(1500L);
                ofFloat3.setDuration(1500L);
                setInfiniteRepeat(ofFloat2);
                setInfiniteRepeat(ofFloat3);
                int nextInt = new Random().nextInt(3);
                if (nextInt % 2 == 0) {
                    ofFloat = ObjectAnimator.ofFloat(imageView, RecceAnimUtils.ROTATION, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f);
                } else {
                    ofFloat = ObjectAnimator.ofFloat(imageView, RecceAnimUtils.ROTATION, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f);
                }
                ofFloat.setDuration(nextInt * 1000);
                setInfiniteRepeat(ofFloat);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat);
                animatorSet.setTarget(imageView);
                ValueAnimator ofObject = ValueAnimator.ofObject(new b(a(2), a(1)), getStartPoint(), getEndPoint());
                ofObject.addUpdateListener(new c(imageView));
                ofObject.setTarget(imageView);
                ofObject.setDuration(4000L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(animatorSet, ofObject);
                animatorSet2.setTarget(imageView);
                animator = animatorSet2;
            }
            animator.addListener(new a(this, imageView));
            animator.start();
            i3++;
            i2 = 1;
        }
    }

    private void setInfiniteRepeat(ObjectAnimator objectAnimator) {
        Object[] objArr = {objectAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595a7c1c0494c615ad6c2978d5e275b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595a7c1c0494c615ad6c2978d5e275b2");
            return;
        }
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setRepeatMode(1);
    }

    private PointF getStartPoint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35b7e5403821237eb5a89b343e56d76", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35b7e5403821237eb5a89b343e56d76") : new PointF(new Random().nextInt(this.b), new Random().nextInt(100) - 300);
    }

    private PointF getEndPoint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a034fa185ccb8ef8fb38bd9d4197f8e", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a034fa185ccb8ef8fb38bd9d4197f8e") : new PointF(new Random().nextInt(this.b), this.c);
    }

    private PointF a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d808d73f6d783efb42ba89581cf8aa48", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d808d73f6d783efb42ba89581cf8aa48");
        }
        PointF pointF = new PointF();
        pointF.x = new Random().nextInt(this.b);
        pointF.y = new Random().nextInt(this.c);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;

        public c(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e588a34143449883acda7fcfbfcb39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e588a34143449883acda7fcfbfcb39");
            } else {
                this.b = new WeakReference<>(view);
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f757c5ade33f903441b8f1fe8eda07ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f757c5ade33f903441b8f1fe8eda07ca");
                return;
            }
            PointF pointF = (PointF) valueAnimator.getAnimatedValue();
            View view = this.b.get();
            if (view != null) {
                view.setX(pointF.x);
                view.setY(pointF.y);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;
        private WeakReference<EasterEggLayout> c;

        public a(EasterEggLayout easterEggLayout, View view) {
            Object[] objArr = {easterEggLayout, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc1f8319eb8a7391389c255842cd082", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc1f8319eb8a7391389c255842cd082");
                return;
            }
            this.b = new WeakReference<>(view);
            this.c = new WeakReference<>(easterEggLayout);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d763205ae17d0e07975f775e0b642659", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d763205ae17d0e07975f775e0b642659");
                return;
            }
            super.onAnimationEnd(animator);
            View view = this.b.get();
            EasterEggLayout easterEggLayout = this.c.get();
            if (view == null || easterEggLayout == null) {
                return;
            }
            easterEggLayout.removeView(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements TypeEvaluator<PointF> {
        public static ChangeQuickRedirect a;
        private PointF c;
        private PointF d;

        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
            PointF pointF3 = pointF;
            PointF pointF4 = pointF2;
            Object[] objArr = {Float.valueOf(f), pointF3, pointF4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38cf23e6db7e578ae27ea9ec9f3a8060", RobustBitConfig.DEFAULT_VALUE)) {
                return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38cf23e6db7e578ae27ea9ec9f3a8060");
            }
            float f2 = 1.0f - f;
            PointF pointF5 = new PointF();
            float f3 = f2 * f2 * f2;
            float f4 = 3.0f * f2;
            float f5 = f2 * f4 * f;
            float f6 = f4 * f * f;
            float f7 = f * f * f;
            pointF5.x = (pointF3.x * f3) + (this.c.x * f5) + (this.d.x * f6) + (pointF4.x * f7);
            pointF5.y = (f3 * pointF3.y) + (f5 * this.c.y) + (f6 * this.d.y) + (f7 * pointF4.y);
            return pointF5;
        }

        public b(PointF pointF, PointF pointF2) {
            Object[] objArr = {EasterEggLayout.this, pointF, pointF2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d22f2de25e3d4ffea6ff5d43eb5b50f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d22f2de25e3d4ffea6ff5d43eb5b50f");
                return;
            }
            this.c = pointF;
            this.d = pointF2;
        }
    }
}
