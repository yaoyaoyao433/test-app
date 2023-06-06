package com.taobao.gcanvas.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GCanvasUtil {
    public static float getScaledDensity(Context context) {
        if (context == null) {
            return 1.0f;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.scaledDensity;
    }
}
