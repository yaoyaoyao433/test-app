package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setLineDash";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        JsonArray asJsonArray;
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b14c74fee568f50ccd3a9c97e07914c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b14c74fee568f50ccd3a9c97e07914c")).booleanValue();
        }
        if (jsonArray.size() >= 2 && (asJsonArray = jsonArray.get(0).getAsJsonArray()) != null) {
            float[] fArr = new float[asJsonArray.size()];
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = com.meituan.msi.util.f.a(asJsonArray, i);
            }
            fVar.b.setPathEffect(new DashPathEffect(fArr, com.meituan.msi.util.f.a(jsonArray, 1)));
            return true;
        }
        return false;
    }
}
