package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.gson.JsonArray;
import com.meituan.msi.api.component.canvas.view.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "fillText";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478306a690288af15f2f96ce80893a2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478306a690288af15f2f96ce80893a2e")).booleanValue();
        }
        if (jsonArray.size() < 3) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        float a2 = com.meituan.msi.util.f.a(jsonArray, 1);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 2);
        float a4 = com.meituan.msi.util.f.a(jsonArray, 3);
        Paint.FontMetrics fontMetrics = fVar.b.getFontMetrics();
        if (fVar.b.b == b.a.TOP) {
            a3 += Math.abs(fontMetrics.ascent);
        } else if (fVar.b.b == b.a.MIDDLE) {
            a3 += Math.abs((((-fontMetrics.ascent) + fontMetrics.descent) / 2.0f) - fontMetrics.descent);
        } else if (fVar.b.b == b.a.BOTTOM) {
            a3 -= Math.abs(fontMetrics.descent);
        }
        com.meituan.msi.api.component.canvas.view.b bVar = fVar.c;
        float measureText = bVar.measureText(asString);
        if (a4 <= 0.0f || a4 >= measureText) {
            canvas.drawText(asString, a2, a3, bVar);
        } else {
            canvas.save();
            canvas.translate(a2, a3);
            canvas.scale(a4 / measureText, 1.0f);
            canvas.drawText(asString, 0.0f, 0.0f, bVar);
            canvas.restore();
        }
        return true;
    }
}
