package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setLineDash";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4a28ef46883167a6f4eb12d471d61b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4a28ef46883167a6f4eb12d471d61b")).booleanValue();
        }
        if (jSONArray.length() < 2) {
            return false;
        }
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
            if (jSONArray2 == null) {
                return false;
            }
            float[] fArr = new float[jSONArray2.length()];
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = com.meituan.mmp.lib.utils.p.a(jSONArray2, i);
            }
            iVar.c.setPathEffect(new DashPathEffect(fArr, com.meituan.mmp.lib.utils.p.a(jSONArray, 1)));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
