package com.meituan.android.cube.util;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final int[] b = new int[2];

    public static boolean a(@Nullable View view, @Nullable Rect rect) {
        Object[] objArr = {view, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        Rect rect2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08492e25d9f08d43d5c94669a0fce1e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08492e25d9f08d43d5c94669a0fce1e3")).booleanValue();
        }
        if (view != null && rect != null) {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4e1a2590259f9588c6abbfb9d7681cde", RobustBitConfig.DEFAULT_VALUE)) {
                rect2 = (Rect) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4e1a2590259f9588c6abbfb9d7681cde");
            } else if (view != null) {
                view.getLocationInWindow(b);
                int i = b[0];
                int i2 = b[1];
                rect2 = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
            }
            if (Rect.intersects(rect2, rect)) {
                return true;
            }
        }
        return false;
    }
}
