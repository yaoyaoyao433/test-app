package com.facebook.react.views.modal;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.android.mrn.utils.ak;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final Point a = new Point();
    private static final Point b = new Point();
    private static final Point c = new Point();

    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) com.facebook.infer.annotation.a.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(a, b);
        defaultDisplay.getSize(c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = ak.a(context);
        }
        if (c.x < c.y) {
            return new Point(a.x, b.y + i);
        }
        return new Point(b.x, a.y + i);
    }
}
