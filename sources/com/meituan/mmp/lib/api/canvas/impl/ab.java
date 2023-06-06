package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setShadow";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "522ea6c0260c924192f65fc844b7f8df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "522ea6c0260c924192f65fc844b7f8df")).booleanValue();
        }
        if (jSONArray.length() < 4) {
            return false;
        }
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 0);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        float a4 = com.meituan.mmp.lib.utils.p.a(jSONArray, 2);
        JSONArray optJSONArray = jSONArray.optJSONArray(3);
        if (optJSONArray == null || optJSONArray.length() < 4) {
            return false;
        }
        int a5 = com.meituan.mmp.lib.utils.p.a(optJSONArray);
        iVar.d.setShadowLayer(a4, a2, a3, a5);
        iVar.c.setShadowLayer(a4, a2, a3, a5);
        return true;
    }
}
