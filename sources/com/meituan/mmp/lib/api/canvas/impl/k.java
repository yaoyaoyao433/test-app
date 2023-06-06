package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.mmp.lib.api.canvas.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "fillText";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea3face7b428aece03046fc7513ee26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea3face7b428aece03046fc7513ee26")).booleanValue();
        }
        if (jSONArray.length() < 3) {
            return false;
        }
        String optString = jSONArray.optString(0);
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 2);
        float a4 = com.meituan.mmp.lib.utils.p.a(jSONArray, 3);
        Paint.FontMetrics fontMetrics = iVar.c.getFontMetrics();
        if (iVar.c.b == j.a.TOP) {
            a3 += Math.abs(fontMetrics.ascent);
        } else if (iVar.c.b == j.a.MIDDLE) {
            a3 += Math.abs((((-fontMetrics.ascent) + fontMetrics.descent) / 2.0f) - fontMetrics.descent);
        } else if (iVar.c.b == j.a.BOTTOM) {
            a3 -= Math.abs(fontMetrics.descent);
        }
        com.meituan.mmp.lib.api.canvas.j jVar = iVar.d;
        float measureText = jVar.measureText(optString);
        if (a4 <= 0.0f || a4 >= measureText) {
            canvas.drawText(optString, a2, a3, jVar);
        } else {
            canvas.save();
            canvas.translate(a2, a3);
            canvas.scale(a4 / measureText, 1.0f);
            canvas.drawText(optString, 0.0f, 0.0f, jVar);
            canvas.restore();
        }
        return true;
    }
}
