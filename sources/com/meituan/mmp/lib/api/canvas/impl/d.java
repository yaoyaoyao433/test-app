package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "arc";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6e6de44bbf61825329a66903856fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6e6de44bbf61825329a66903856fb3")).booleanValue();
        }
        if (jSONArray.length() < 5) {
            return false;
        }
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 0);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        float a4 = com.meituan.mmp.lib.utils.p.a(jSONArray, 2);
        canvas.drawArc(new RectF(a2 - a4, a3 - a4, a2 + a4, a4 + a3), (float) ((((float) jSONArray.optDouble(3)) / 3.141592653589793d) * 180.0d), (float) ((((float) jSONArray.optDouble(4)) / 3.141592653589793d) * 180.0d), true, iVar.c);
        return true;
    }
}
