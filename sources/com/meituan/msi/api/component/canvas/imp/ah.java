package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "strokeRect";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad0feef9dfb8a903b4a5c1ac31b7605", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad0feef9dfb8a903b4a5c1ac31b7605")).booleanValue();
        }
        if (jsonArray.size() < 4) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(jsonArray, 0);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 1);
        canvas.drawRect(a2, a3, a2 + com.meituan.msi.util.f.a(jsonArray, 2), com.meituan.msi.util.f.a(jsonArray, 3) + a3, fVar.b);
        return true;
    }
}
