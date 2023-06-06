package com.meituan.android.yoda.util;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static Point a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f673e80c75d1474892726ad9fa013c6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f673e80c75d1474892726ad9fa013c6b");
        }
        if (context != null) {
            Point point = new Point();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
            return point;
        }
        return null;
    }
}
