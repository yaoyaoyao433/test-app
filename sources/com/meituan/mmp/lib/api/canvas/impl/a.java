package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setLineJoin";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22de7d4f64b5db08df161b8dd65f560c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22de7d4f64b5db08df161b8dd65f560c")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if ("miter".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeJoin(Paint.Join.MITER);
            iVar.c.setStrokeJoin(Paint.Join.MITER);
        } else if ("round".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeJoin(Paint.Join.ROUND);
            iVar.c.setStrokeJoin(Paint.Join.ROUND);
        } else if ("bevel".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeJoin(Paint.Join.BEVEL);
            iVar.c.setStrokeJoin(Paint.Join.BEVEL);
        }
        return true;
    }
}
