package com.meituan.android.mrn.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aj {
    public static ChangeQuickRedirect a;
    private static Point b;

    public static boolean a(View view, float f) {
        int i;
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "585f171b16c25543fc15d90a063bf194", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "585f171b16c25543fc15d90a063bf194")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Context context = view.getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a877c6876b1564d2343ec29d8e262ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a877c6876b1564d2343ec29d8e262ccc");
        } else if (b == null) {
            b = new Point();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(b);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int height = view.getHeight() + i3;
        int i4 = b.x;
        float f2 = i4;
        float f3 = (-i) * f;
        float f4 = b.y;
        return ((float) (view.getWidth() + i2)) < ((float) (-i4)) * f || ((float) i3) > f4 + (f4 * f) || ((float) i2) > f2 + (f2 * f) || ((float) height) < f3;
    }
}
