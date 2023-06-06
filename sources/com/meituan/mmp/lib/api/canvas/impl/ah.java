package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "strokeRect";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097c8267751b7655c05855fc1f66e29d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097c8267751b7655c05855fc1f66e29d")).booleanValue();
        }
        if (jSONArray.length() < 4) {
            return false;
        }
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 0);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        canvas.drawRect(a2, a3, a2 + com.meituan.mmp.lib.utils.p.a(jSONArray, 2), com.meituan.mmp.lib.utils.p.a(jSONArray, 3) + a3, iVar.c);
        return true;
    }
}
