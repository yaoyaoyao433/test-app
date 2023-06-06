package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setLineCap";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2738d9171f0770a18f676466f29760d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2738d9171f0770a18f676466f29760d6")).booleanValue();
        }
        if (jsonArray.size() <= 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if ("butt".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeCap(Paint.Cap.BUTT);
            fVar.b.setStrokeCap(Paint.Cap.BUTT);
        } else if ("round".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeCap(Paint.Cap.ROUND);
            fVar.b.setStrokeCap(Paint.Cap.ROUND);
        } else if ("square".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeCap(Paint.Cap.SQUARE);
            fVar.b.setStrokeCap(Paint.Cap.SQUARE);
        }
        return true;
    }
}
