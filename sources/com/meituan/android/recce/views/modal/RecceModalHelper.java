package com.meituan.android.recce.views.modal;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.infer.annotation.a;
import com.meituan.android.mrn.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceModalHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Point MIN_POINT = new Point();
    private static final Point MAX_POINT = new Point();
    private static final Point SIZE_POINT = new Point();

    public static Point getModalHostSize(Context context) {
        int i = 0;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08794cf4d1d7c881a780ac77cc58b9df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08794cf4d1d7c881a780ac77cc58b9df");
        }
        Display defaultDisplay = ((WindowManager) a.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(MIN_POINT, MAX_POINT);
        defaultDisplay.getSize(SIZE_POINT);
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = ak.a(context);
        }
        if (SIZE_POINT.x < SIZE_POINT.y) {
            return new Point(MIN_POINT.x, MAX_POINT.y + i);
        }
        return new Point(MAX_POINT.x, MIN_POINT.y + i);
    }
}
