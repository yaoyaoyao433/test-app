package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ie {
    private static double[] a(double d, double d2, int i) {
        double d3 = d + d2;
        double abs = Math.abs(d2) / 2.0d;
        double sqrt = Math.sqrt((4.0d * abs) / 3.141592653589793d);
        int i2 = i >> 1;
        int i3 = i2 << 1;
        double[] dArr = new double[i3];
        int i4 = i2 - 1;
        dArr[i4] = d + (d2 / 2.0d);
        dArr[i3 - 1] = d3;
        double d4 = sqrt / i2;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i4;
            int i7 = i5 + 1;
            double d5 = d3;
            double d6 = sqrt - (i7 * d4);
            double acos = Math.acos(d6 / sqrt);
            double sin = (((acos * abs) * 2.0d) / 3.141592653589793d) - ((d6 * (Math.sin(acos) * sqrt)) / 2.0d);
            if (d2 < 0.0d) {
                sin = -sin;
            }
            dArr[i5] = d + sin;
            dArr[(i3 - 2) - i5] = d5 - sin;
            i5 = i7;
            i4 = i6;
            d3 = d5;
        }
        return dArr;
    }

    public static double[] a(double d, double d2) {
        double d3 = d + d2;
        double[] dArr = new double[20];
        dArr[9] = (d2 / 2.0d) + d;
        dArr[19] = d3;
        double d4 = (d2 / 10.0d) / 10.0d;
        double d5 = d4 / 2.0d;
        dArr[0] = d + d5;
        dArr[18] = d3 - d5;
        for (int i = 1; i < 9; i++) {
            double d6 = (i * d4) + d5;
            dArr[i] = dArr[i - 1] + d6;
            dArr[18 - i] = dArr[19 - i] - d6;
        }
        return dArr;
    }

    private static double[] b(double d, double d2, int i) {
        double d3 = d + d2;
        double[] dArr = new double[i];
        double d4 = i;
        double d5 = ((d2 * 2.0d) / d4) / d4;
        double d6 = d5 / 2.0d;
        int i2 = i - 1;
        dArr[i2] = d3;
        dArr[0] = d + d6;
        for (int i3 = 1; i3 < i2; i3++) {
            dArr[i3] = dArr[i3 - 1] + (i3 * d5) + d6;
        }
        return dArr;
    }

    public static <A extends Animation> hf a(bn bnVar, A a) {
        Animation animation = null;
        if (bnVar == null || a == null) {
            return null;
        }
        if (a instanceof hf) {
            return (hf) a;
        }
        Class<?> cls = a.getClass();
        if (cls == AlphaAnimation.class) {
            AlphaAnimation alphaAnimation = (AlphaAnimation) a;
            animation = bnVar.createAlphaAnimation(alphaAnimation.mFromAlpha, alphaAnimation.mToAlpha);
        } else if (cls == ScaleAnimation.class) {
            ScaleAnimation scaleAnimation = (ScaleAnimation) a;
            animation = bnVar.createScaleAnimation(scaleAnimation.mFromX, scaleAnimation.mToX, scaleAnimation.mFromY, scaleAnimation.mToY);
        } else if (cls == EmergeAnimation.class) {
            animation = bnVar.createEmergeAnimation(((EmergeAnimation) a).mStartPoint);
        } else if (cls == AnimationSet.class) {
            AnimationSet animationSet = (AnimationSet) a;
            IAnimationSet createAnimationSet = bnVar.createAnimationSet(animationSet.mShareInterpolator);
            for (Animation animation2 : animationSet.mAnimations) {
                ((hg) createAnimationSet).addAnimation(a(bnVar, animation2));
            }
            animation = createAnimationSet;
        } else if (cls == RotateAnimation.class) {
            RotateAnimation rotateAnimation = (RotateAnimation) a;
            animation = bnVar.createRotateAnimation(rotateAnimation.mFromDegree, rotateAnimation.mToDegree, rotateAnimation.mPivoteX, rotateAnimation.mPivoteY, rotateAnimation.mPivoteZ);
        } else if (cls == TranslateAnimation.class) {
            animation = bnVar.createTranslateAnimation(((TranslateAnimation) a).mTargetLatLng);
        }
        if (animation != null) {
            animation.setDuration(a.getDuration());
            animation.setInterpolator(a.getInterpolator());
            animation.setAnimationListener(a.getAnimationListener());
        }
        return (hf) animation;
    }
}
