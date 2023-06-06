package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setLineJoin";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5952d5a4f3602b39825b6eee63fd89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5952d5a4f3602b39825b6eee63fd89")).booleanValue();
        }
        if (jsonArray.size() <= 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if ("miter".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeJoin(Paint.Join.MITER);
            fVar.b.setStrokeJoin(Paint.Join.MITER);
        } else if ("round".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeJoin(Paint.Join.ROUND);
            fVar.b.setStrokeJoin(Paint.Join.ROUND);
        } else if ("bevel".equalsIgnoreCase(asString)) {
            fVar.c.setStrokeJoin(Paint.Join.BEVEL);
            fVar.b.setStrokeJoin(Paint.Join.BEVEL);
        }
        return true;
    }
}
