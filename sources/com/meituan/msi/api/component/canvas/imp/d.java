package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "arc";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af65b2e774bea094694178e6cbfb4f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af65b2e774bea094694178e6cbfb4f4")).booleanValue();
        }
        if (jsonArray.size() < 5) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(jsonArray, 0);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 1);
        float a4 = com.meituan.msi.util.f.a(jsonArray, 2);
        canvas.drawArc(new RectF(a2 - a4, a3 - a4, a2 + a4, a4 + a3), (float) ((((float) jsonArray.get(3).getAsDouble()) / 3.141592653589793d) * 180.0d), (float) ((((float) jsonArray.get(4).getAsDouble()) / 3.141592653589793d) * 180.0d), true, fVar.b);
        return true;
    }
}
