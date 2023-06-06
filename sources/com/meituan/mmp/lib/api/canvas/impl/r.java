package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "save";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b717f05799dff721304e690eea8c116", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b717f05799dff721304e690eea8c116")).booleanValue();
        }
        canvas.save();
        com.meituan.mmp.lib.api.canvas.j jVar = iVar.c;
        iVar.e.push(iVar.c);
        iVar.c = iVar.c.a();
        if (iVar.c == null) {
            iVar.c = jVar;
        }
        com.meituan.mmp.lib.api.canvas.j jVar2 = iVar.d;
        iVar.f.push(iVar.d);
        iVar.d = iVar.d.a();
        if (iVar.d == null) {
            iVar.d = jVar2;
        }
        return true;
    }
}
