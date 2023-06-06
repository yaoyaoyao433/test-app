package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "arcTo";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        float f;
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf20097ab9c8f941a42a8094cc0cdc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf20097ab9c8f941a42a8094cc0cdc4")).booleanValue();
        }
        if (jSONArray.length() < 5) {
            return false;
        }
        float a2 = p.a(jSONArray, 0);
        float a3 = p.a(jSONArray, 1);
        float a4 = p.a(jSONArray, 2);
        float f2 = a2 - a4;
        float f3 = a3 - a4;
        float f4 = a2 + a4;
        float f5 = a3 + a4;
        float degrees = (float) Math.toDegrees((float) jSONArray.optDouble(3));
        float degrees2 = (float) Math.toDegrees((float) jSONArray.optDouble(4));
        float f6 = (float) (360.0d / (a4 * 6.283185307179586d));
        if (jSONArray.length() <= 5 || !jSONArray.optBoolean(5)) {
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
