package com.meituan.msc.views.modal;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Point b = new Point();
    private static final Point c = new Point();
    private static final Point d = new Point();

    public static Point a(Context context) {
        int i = 0;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2948393e6a1ed103a994c2340b76ceff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2948393e6a1ed103a994c2340b76ceff");
        }
        Display defaultDisplay = ((WindowManager) com.facebook.infer.annotation.a.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(b, c);
        defaultDisplay.getSize(d);
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = com.meituan.msc.utils.d.a(context);
        }
        if (d.x < d.y) {
            return new Point(b.x, c.y + i);
        }
        return new Point(c.x, b.y + i);
    }
}
