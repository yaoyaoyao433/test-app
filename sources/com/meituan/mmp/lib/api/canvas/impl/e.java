package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "clearRect";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2667f4c7e6790fe3b49ca9370e82f4c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2667f4c7e6790fe3b49ca9370e82f4c2")).booleanValue();
        }
        if (jSONArray.length() < 4) {
            return false;
        }
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 0);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        float a4 = com.meituan.mmp.lib.utils.p.a(jSONArray, 2);
        float a5 = com.meituan.mmp.lib.utils.p.a(jSONArray, 3);
        if (canvas.isHardwareAccelerated()) {
            if (canvas instanceof com.meituan.mmp.lib.api.canvas.g) {
                ((com.meituan.mmp.lib.api.canvas.g) canvas).a(a2, a3, a4 + a2, a5 + a3);
                return true;
            } else if (iVar.h != null) {
                canvas.drawRect(a2, a3, a4 + a2, a3 + a5, iVar.h);
                return true;
            } else {
                return false;
            }
        } else if (iVar.h != null) {
            canvas.drawRect(a2, a3, a4 + a2, a3 + a5, iVar.h);
            return true;
        } else {
            canvas.drawRect(a2, a3, a4 + a2, a3 + a5, iVar.g);
            return true;
        }
    }
}
