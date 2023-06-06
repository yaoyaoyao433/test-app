package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setShadow";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911ea3a84c6b4b4fff7d5026376a28c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911ea3a84c6b4b4fff7d5026376a28c6")).booleanValue();
        }
        if (jsonArray.size() < 4) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(jsonArray, 0);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 1);
        float a4 = com.meituan.msi.util.f.a(jsonArray, 2);
        JsonArray asJsonArray = jsonArray.get(3).getAsJsonArray();
        if (asJsonArray == null || asJsonArray.size() < 4) {
            return false;
        }
        int a5 = com.meituan.msi.util.f.a(asJsonArray);
        fVar.c.setShadowLayer(a4, a2, a3, a5);
        fVar.b.setShadowLayer(a4, a2, a3, a5);
        return true;
    }
}
