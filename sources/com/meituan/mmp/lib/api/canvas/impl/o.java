package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setLineHeight";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe9052d17e7dbcc9c0bb02634e1ddfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe9052d17e7dbcc9c0bb02634e1ddfd")).booleanValue();
        }
        if (jSONArray.length() != 0) {
            com.meituan.mmp.lib.utils.p.b(jSONArray, 0);
        }
        return false;
    }
}
