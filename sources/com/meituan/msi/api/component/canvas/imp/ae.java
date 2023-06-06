package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.msi.api.component.canvas.view.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setTextBaseline";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b803e6c1cf8a98652bceaddf1898fbbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b803e6c1cf8a98652bceaddf1898fbbe")).booleanValue();
        }
        if (jsonArray.size() <= 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if ("top".equalsIgnoreCase(asString)) {
            fVar.b.b = b.a.TOP;
            fVar.c.b = b.a.TOP;
        } else if ("middle".equalsIgnoreCase(asString)) {
            fVar.b.b = b.a.MIDDLE;
            fVar.c.b = b.a.MIDDLE;
        } else if ("bottom".equalsIgnoreCase(asString)) {
            fVar.b.b = b.a.BOTTOM;
            fVar.c.b = b.a.BOTTOM;
        } else if ("normal".equalsIgnoreCase(asString)) {
            fVar.b.b = b.a.NORMAL;
            fVar.c.b = b.a.NORMAL;
        }
        return true;
    }
}
