package com.sankuai.waimai.business.search.common.view;

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
import com.sankuai.waimai.business.search.common.util.l;
import java.lang.ref.WeakReference;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e407fcb54e0126c3bac925b53f518f66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e407fcb54e0126c3bac925b53f518f66");
        } else {
            a();
        }
    }

    public EasterEggLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a9767a24f51c01dd1e37922b8becb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a9767a24f51c01dd1e37922b8becb5");
        } else {
            a();
        }
    }

    public EasterEggLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3b11d54ca63db6888d7c43e4a587b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3b11d54ca63db6888d7c43e4a587b1");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec725710b837b7385635a6f2f49104c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec725710b837b7385635a6f2f49104c");
            return;
        }
        this.g = new RelativeLayout.LayoutParams(l.a(getContext(), 40), l.a(getContext(), 40));
        this.d = new Handler();
        this.e = new Runnable() { // from class: com.sankuai.waimai.business.search.common.view.EasterEggLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e8ace15bb3e1d0366c0869184614a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e8ace15bb3e1d0366c0869184614a8");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7535e34e71013e82d463810d926cd050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7535e34e71013e82d463810d926cd050");
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
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5653c825c3dd24f59689f44dcf8c3ede", RobustBitConfig.DEFAULT_VALUE)) {
                animator = (Animator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5653c825c3dd24f59689f44dcf8c3ede");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf296774e981219f74e1e03739cdffac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf296774e981219f74e1e03739cdffac");
            return;
        }
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setRepeatMode(1);
    }

    private PointF getStartPoint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b165281be73b85869272b9815ba51881", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b165281be73b85869272b9815ba51881") : new PointF(new Random().nextInt(this.b), new Random().nextInt(100) - 300);
    }

    private PointF getEndPoint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f36b8b36ecccf66478a773d9799380", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f36b8b36ecccf66478a773d9799380") : new PointF(new Random().nextInt(this.b), this.c);
    }

    private PointF a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf2152f6b5b37e9cbea806ba2d5f5de", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf2152f6b5b37e9cbea806ba2d5f5de");
        }
        PointF pointF = new PointF();
        pointF.x = new Random().nextInt(this.b);
        pointF.y = new Random().nextInt(this.c);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;

        public c(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff1ed1623ed802184c090e6d96f6b0c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff1ed1623ed802184c090e6d96f6b0c9");
            } else {
                this.b = new WeakReference<>(view);
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af858d95350060b877b0e39762e1385d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af858d95350060b877b0e39762e1385d");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;
        private WeakReference<EasterEggLayout> c;

        public a(EasterEggLayout easterEggLayout, View view) {
            Object[] objArr = {easterEggLayout, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306948588238c5eb3cde9bc784a638fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306948588238c5eb3cde9bc784a638fd");
                return;
            }
            this.b = new WeakReference<>(view);
            this.c = new WeakReference<>(easterEggLayout);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee909563910fff3245d4f7bdb3b53402", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee909563910fff3245d4f7bdb3b53402");
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
    /* loaded from: classes4.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1a733d8158035fd5670acc3d02a303", RobustBitConfig.DEFAULT_VALUE)) {
                return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1a733d8158035fd5670acc3d02a303");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c20e0935197bb7a8f140d7de8663d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c20e0935197bb7a8f140d7de8663d0");
                return;
            }
            this.c = pointF;
            this.d = pointF2;
        }
    }
}
