package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setTextAlign";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c5afdb82870c15d257113305f2a17b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c5afdb82870c15d257113305f2a17b")).booleanValue();
        }
        if (jsonArray.size() <= 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if ("left".equalsIgnoreCase(asString)) {
            fVar.b.setTextAlign(Paint.Align.LEFT);
            fVar.c.setTextAlign(Paint.Align.LEFT);
        } else if ("right".equalsIgnoreCase(asString)) {
            fVar.b.setTextAlign(Paint.Align.RIGHT);
            fVar.c.setTextAlign(Paint.Align.RIGHT);
        } else if ("center".equalsIgnoreCase(asString)) {
            fVar.b.setTextAlign(Paint.Align.CENTER);
            fVar.c.setTextAlign(Paint.Align.CENTER);
        }
        return true;
    }
}
