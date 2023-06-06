package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "save";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6dc7b6adf68ff36436b80463c636ee3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6dc7b6adf68ff36436b80463c636ee3")).booleanValue();
        }
        canvas.save();
        com.meituan.msi.api.component.canvas.view.b bVar = fVar.b;
        fVar.d.push(fVar.b);
        fVar.b = fVar.b.a();
        if (fVar.b == null) {
            fVar.b = bVar;
        }
        com.meituan.msi.api.component.canvas.view.b bVar2 = fVar.c;
        fVar.e.push(fVar.c);
        fVar.c = fVar.c.a();
        if (fVar.c == null) {
            fVar.c = bVar2;
        }
        return true;
    }
}
