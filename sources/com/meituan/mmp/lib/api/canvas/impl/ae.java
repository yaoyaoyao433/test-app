package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.mmp.lib.api.canvas.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setTextBaseline";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa456d671ae75eeca73654fcd80a3b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa456d671ae75eeca73654fcd80a3b8")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if ("top".equalsIgnoreCase(optString)) {
            iVar.c.b = j.a.TOP;
            iVar.d.b = j.a.TOP;
        } else if ("middle".equalsIgnoreCase(optString)) {
            iVar.c.b = j.a.MIDDLE;
            iVar.d.b = j.a.MIDDLE;
        } else if ("bottom".equalsIgnoreCase(optString)) {
            iVar.c.b = j.a.BOTTOM;
            iVar.d.b = j.a.BOTTOM;
        } else if ("normal".equalsIgnoreCase(optString)) {
            iVar.c.b = j.a.NORMAL;
            iVar.d.b = j.a.NORMAL;
        }
        return true;
    }
}
