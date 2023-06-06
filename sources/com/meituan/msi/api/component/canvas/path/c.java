package com.meituan.msi.api.component.canvas.path;

import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final String a() {
        return "arc";
    }

    @Override // com.meituan.msi.api.component.canvas.path.b
    public final boolean a(Path path, double[] dArr) {
        float f;
        Object[] objArr = {path, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b3ff2a25c588582e9a6a6b334aa58f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b3ff2a25c588582e9a6a6b334aa58f1")).booleanValue();
        }
        if (dArr == null || dArr.length < 5) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(dArr, 0);
        float a3 = com.meituan.msi.util.f.a(dArr, 1);
        float a4 = com.meituan.msi.util.f.a(dArr, 2);
        float f2 = a2 - a4;
        float f3 = a3 - a4;
        float f4 = a2 + a4;
        float f5 = a3 + a4;
        float degrees = (float) Math.toDegrees(dArr[3]);
        float degrees2 = (float) Math.toDegrees(dArr[4]);
        float f6 = (float) (360.0d / (a4 * 6.283185307179586d));
        if (dArr.length < 6 || dArr[5] <= 1.0d) {
            if (degrees2 - degrees >= 360.0f) {
                f = 360.0f;
            } else {
                float f7 = degrees % 360.0f;
                float f8 = degrees2 % 360.0f;
                if (f7 < 0.0f) {
                    f7 += 360.0f;
                }
                if (f8 < 0.0f) {
                    f8 += 360.0f;
                }
                f = f8 >= f7 ? f8 - f7 : (f8 + 360.0f) - f7;
            }
        } else if (degrees - degrees2 >= 360.0f) {
            f = -360.0f;
        } else {
            float f9 = degrees % 360.0f;
            float f10 = degrees2 % 360.0f;
            if (f9 < 0.0f) {
                f9 += 360.0f;
            }
            if (f10 < 0.0f) {
                f10 += 360.0f;
            }
            f = f10 >= f9 ? (f10 - f9) - 360.0f : f10 - f9;
        }
        float f11 = f % 360.0f;
        if (f11 > f6 || f11 < (-f6)) {
            path.arcTo(new RectF(f2, f3, f4, f5), degrees, f, false);
            return true;
        }
        path.arcTo(new RectF(f2, f3, f4, f5), degrees, f, false);
        path.addArc(new RectF(f2, f3, f4, f5), degrees, f);
        return true;
    }
}
