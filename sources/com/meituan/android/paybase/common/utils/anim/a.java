package com.meituan.android.paybase.common.utils.anim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final float[] b = {-14.0f, 28.0f, -19.0f, 10.0f, -8.0f, 6.0f, -3.0f};
    private static final float[] c = {0.0f, -0.25f, 0.25f, -0.08928572f, 0.08928572f, -0.05357143f, 0.05357143f};

    private static int a(int i) {
        return (i >> 24) & 255;
    }

    private static int b(int i) {
        return (i >> 16) & 255;
    }

    private static int c(int i) {
        return (i >> 8) & 255;
    }

    public static int a(int i, int i2, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7737da38b8f75a854617dcf571082884", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7737da38b8f75a854617dcf571082884")).intValue();
        }
        int i3 = i & 255;
        return Color.argb(a(i) + Math.round((a(i2) - a(i)) * f), b(i) + Math.round((b(i2) - b(i)) * f), c(i) + Math.round((c(i2) - c(i)) * f), i3 + Math.round(((i2 & 255) - i3) * f));
    }

    public static float[] a(Path path, int i) {
        Object[] objArr = {path, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "323a98a0c8ad1daeb904a95fe2c12980", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "323a98a0c8ad1daeb904a95fe2c12980");
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[i * 2];
        float length = pathMeasure.getLength();
        float f = length / i;
        float[] fArr2 = new float[2];
        int i2 = 0;
        for (float f2 = 0.0f; f2 < length && i2 < i; f2 += f) {
            pathMeasure.getPosTan(f2, fArr2, null);
            int i3 = i2 * 2;
            fArr[i3] = fArr2[0];
            fArr[i3 + 1] = fArr2[1];
            i2++;
        }
        return fArr;
    }

    @MTPaySuppressFBWarnings({"ICAST_IDIV_CAST_TO_DOUBLE"})
    public static float[] a(float[] fArr, float f, float f2, float f3) {
        float f4;
        Object[] objArr = {fArr, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "503821bb2b97966b55bf154e9c6e5b36", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "503821bb2b97966b55bf154e9c6e5b36");
        }
        float f5 = f < 0.0f ? 0.0f : f;
        float f6 = f5 > 1.0f ? 1.0f : f5;
        float f7 = f2 < 0.0f ? 0.0f : f2;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f7 - f6;
        if (f8 < 0.0f) {
            f8 = -f8;
        }
        if (f8 >= 1.0f) {
            return fArr;
        }
        if (f3 >= 0.0f) {
            f4 = (f3 / 360.0f) - (((int) f3) / 360);
        } else {
            f4 = ((f3 / 360.0f) - (((int) f3) / 360)) + 1.0f;
        }
        int length = ((int) ((fArr.length * f8) / 2.0f)) * 2;
        int length2 = ((int) (((f4 * fArr.length) + (fArr.length * f6)) / 2.0f)) * 2;
        while (length2 < 0) {
            length2 += fArr.length;
        }
        while (length2 > fArr.length) {
            length2 -= fArr.length;
        }
        float[] fArr2 = new float[length];
        int i = length2 / 2;
        for (int i2 = 0; i2 < length / 2; i2++) {
            if (i >= fArr.length / 2) {
                i = 0;
            } else if (i < 0) {
                i = (fArr.length / 2) - 1;
            }
            int i3 = i2 * 2;
            int i4 = i * 2;
            fArr2[i3] = fArr[i4];
            fArr2[i3 + 1] = fArr[i4 + 1];
            i++;
        }
        return fArr2;
    }

    public static Animator a(View view, int i, Animator.AnimatorListener animatorListener, float... fArr) {
        Object[] objArr = {view, Integer.valueOf(i), animatorListener, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f558f93bd4acaa32b8d8445b2cc23e4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f558f93bd4acaa32b8d8445b2cc23e4d");
        }
        if (view == null) {
            return null;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(b.a(view, measuredHeight));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
        return ofFloat;
    }

    public static /* synthetic */ void c(View view, int i, ValueAnimator valueAnimator) {
        Object[] objArr = {view, Integer.valueOf(i), valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea22d34a09dc7ec4197fd818c9898c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea22d34a09dc7ec4197fd818c9898c12");
        } else if (view.getVisibility() != 8) {
            view.getLayoutParams().height = (int) (i * ((Float) valueAnimator.getAnimatedValue()).floatValue());
            view.requestLayout();
        }
    }

    public static Animator a(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener, float... fArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), animatorListener, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a8607328605f58cad17434e1195bed4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a8607328605f58cad17434e1195bed4");
        }
        if (view == null) {
            return null;
        }
        view.measure(i, i2);
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(i3);
        ofFloat.addUpdateListener(c.a(view, measuredHeight));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
        return ofFloat;
    }

    public static /* synthetic */ void b(View view, int i, ValueAnimator valueAnimator) {
        Object[] objArr = {view, Integer.valueOf(i), valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f86e255ea2dcc9e90a97e8c523ac5fca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f86e255ea2dcc9e90a97e8c523ac5fca");
        } else if (view.getVisibility() != 8) {
            view.getLayoutParams().height = (int) (i * ((Float) valueAnimator.getAnimatedValue()).floatValue());
            if (com.meituan.android.paybase.utils.d.c(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()), Double.valueOf(1.0d)) == 0) {
                view.getLayoutParams().height = -2;
            }
            view.requestLayout();
        }
    }

    public static Animator a(View view, int i, Animator.AnimatorListener animatorListener, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), null, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d023d6f3fc2e9c628fd4dfa4e1636b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d023d6f3fc2e9c628fd4dfa4e1636b0");
        }
        if (view == null) {
            return null;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), i2);
        ofInt.setDuration(i);
        ofInt.addUpdateListener(d.a(view));
        ofInt.start();
        return ofInt;
    }

    public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
        Object[] objArr = {view, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d29e466dfe028c113c579d50706199e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d29e466dfe028c113c579d50706199e3");
        } else if (view.getVisibility() != 8) {
            view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.requestLayout();
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "995af05f34f6d2a340ced8183aa805de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "995af05f34f6d2a340ced8183aa805de");
            return;
        }
        Object[] objArr2 = {view, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8d8dc1cd0cc1dcd4689dc995e5e36bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8d8dc1cd0cc1dcd4689dc995e5e36bec");
            return;
        }
        ValueAnimator[] valueAnimatorArr = new ValueAnimator[7];
        for (int i = 0; i < 7; i++) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(0.0f, 1.0f);
            switch (i) {
                case 0:
                case 1:
                    valueAnimatorArr[i].setDuration(100L);
                    break;
                case 2:
                case 3:
                    valueAnimatorArr[i].setDuration(60L);
                    break;
                case 4:
                case 5:
                    valueAnimatorArr[i].setDuration(40L);
                    break;
                case 6:
                    valueAnimatorArr[i].setDuration(20L);
                    break;
            }
            valueAnimatorArr[i].addUpdateListener(e.a(view, i));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorArr);
        animatorSet.start();
    }

    public static /* synthetic */ void a(View view, int i, ValueAnimator valueAnimator) {
        Object[] objArr = {view, Integer.valueOf(i), valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cd688a70090d5f8ec7e3817e5428c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cd688a70090d5f8ec7e3817e5428c80");
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float width = view.getWidth();
        view.setTranslationX((((floatValue * width) * b[i]) / 56.0f) + (width * c[i]));
    }
}
