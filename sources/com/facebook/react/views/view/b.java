package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static int a(float f, YogaMeasureMode yogaMeasureMode) {
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
