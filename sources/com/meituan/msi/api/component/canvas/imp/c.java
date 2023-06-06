package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "transform";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a3d3cb57e36357002ef24fa8291065", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a3d3cb57e36357002ef24fa8291065")).booleanValue();
        }
        if (jsonArray.size() < 6) {
            return false;
        }
        float asDouble = (float) jsonArray.get(2).getAsDouble();
        float asDouble2 = (float) jsonArray.get(3).getAsDouble();
        float a2 = com.meituan.msi.util.f.a(jsonArray, 4);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 5);
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preSkew(asDouble, (float) jsonArray.get(1).getAsDouble());
        matrix.preTranslate(a2, a3);
        matrix.preScale((float) jsonArray.get(0).getAsDouble(), asDouble2);
        canvas.concat(matrix);
        return true;
    }
}
