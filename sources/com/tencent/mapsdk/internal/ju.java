package com.tencent.mapsdk.internal;

import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ju {
    private static void a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    private static void a(View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setScaleX(f);
            view.setScaleY(f2);
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f2);
        scaleAnimation.setDuration(0L);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    private static void a(Object obj, String str, int i, float... fArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, fArr[0], fArr[1]);
            ofFloat.setDuration(i);
            ofFloat.start();
        } else if ("Alpha".equals(str) && (obj instanceof View)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(fArr[0], fArr[1]);
            alphaAnimation.setDuration(i);
            alphaAnimation.setFillAfter(true);
            ((View) obj).startAnimation(alphaAnimation);
        } else if ("Scale".equals(str) && (obj instanceof View)) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(fArr[0], fArr[1], fArr[0], fArr[1]);
            scaleAnimation.setDuration(i);
            scaleAnimation.setFillAfter(true);
            ((View) obj).startAnimation(scaleAnimation);
        }
    }

    private static boolean b(String str, String str2, int i) {
        return a(str, str2, i) > 0;
    }

    public static boolean a(String str, String str2) {
        return a(str, str2, 3) < 0;
    }

    private static boolean c(String str, String str2, int i) {
        return a(str, str2, i) == 0;
    }

    public static int a(String str, String str2, int i) {
        int compareTo;
        int i2 = 0;
        if (hb.a(str) || hb.a(str2) || str.equals(str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i3 = 0;
        while (i2 < i) {
            try {
                compareTo = Integer.valueOf(Integer.parseInt(i2 < split.length ? split[i2] : "0")).compareTo(Integer.valueOf(Integer.parseInt(i2 < split2.length ? split2[i2] : "0")));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (compareTo != 0) {
                return compareTo;
            }
            i3 = compareTo;
            i2++;
        }
        return i3;
    }
}
