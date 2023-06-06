package com.meituan.android.recce.views.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.android.recce.views.anim.node.RecceAnimConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RecceAnimUtils {
    public static final String ALPHA = "alpha";
    public static final boolean ANIM_DEBUG = false;
    public static final String ANIM_TAG = "RecceAnim";
    public static final String DURATION = "duration";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final String SCALE_Y = "scaleY";
    public static final String SCALE_X = "scaleX";
    public static final String TRANSLATION_Y = "translationY";
    public static final String TRANSLATION_X = "translationX";
    public static final String ROTATION = "rotation";
    public static final String ROTATION_X = "rotationX";
    public static final String ROTATION_Y = "rotationY";
    public static String[] animPropKeys = {"alpha", SCALE_Y, SCALE_X, TRANSLATION_Y, TRANSLATION_X, ROTATION, ROTATION_X, ROTATION_Y};
    public static final String START_DELAY = "startDelay";
    public static final String REPEAT_COUNT = "repeatCount";
    public static final String REPEAT_MODE = "repeatMode";
    public static final String INTERPOLATOR = "interpolator";
    public static String[] animControlKeys = {"duration", START_DELAY, REPEAT_COUNT, REPEAT_MODE, INTERPOLATOR};

    public static Interpolator configInterpolator(RecceAnimConfig recceAnimConfig) {
        Object[] objArr = {recceAnimConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ddb7b13e5466e62299700e8097a41a21", RobustBitConfig.DEFAULT_VALUE)) {
            return (Interpolator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ddb7b13e5466e62299700e8097a41a21");
        }
        if (recceAnimConfig == null) {
            return new LinearInterpolator();
        }
        if (TextUtils.equals("accelerate_decelerate", recceAnimConfig.interpolator)) {
            return new AccelerateDecelerateInterpolator();
        }
        if (TextUtils.equals("accelerate", recceAnimConfig.interpolator)) {
            return new AccelerateInterpolator();
        }
        if (TextUtils.equals("decelerate", recceAnimConfig.interpolator)) {
            return new DecelerateInterpolator();
        }
        if (TextUtils.equals("bounce", recceAnimConfig.interpolator)) {
            return new BounceInterpolator();
        }
        return new LinearInterpolator();
    }

    public static List<Animator> configAnimator(View view, RecceAnimConfig recceAnimConfig) {
        Object[] objArr = {view, recceAnimConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4743c06c8aa63882a024fb401e930b4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4743c06c8aa63882a024fb401e930b4d");
        }
        ArrayList arrayList = new ArrayList();
        if (recceAnimConfig == null) {
            return arrayList;
        }
        String[] strArr = animPropKeys;
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        for (String str : strArr) {
            float[] propValue = recceAnimConfig.getPropValue(str);
            if (propValue != null && propValue.length != 0) {
                if (TextUtils.equals(TRANSLATION_Y, str)) {
                    for (int i = 0; i < propValue.length; i++) {
                        propValue[i] = propValue[i] * measuredHeight;
                    }
                }
                if (TextUtils.equals(TRANSLATION_X, str)) {
                    for (int i2 = 0; i2 < propValue.length; i2++) {
                        propValue[i2] = propValue[i2] * measuredWidth;
                    }
                }
                arrayList.add(ObjectAnimator.ofFloat(view, str, propValue));
            }
        }
        return arrayList;
    }
}
