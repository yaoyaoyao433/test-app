package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setTransform";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edcdb577a2da0cfb956fbc69634dc3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edcdb577a2da0cfb956fbc69634dc3b")).booleanValue();
        }
        if (jSONArray.length() < 6) {
            return false;
        }
        try {
            float f = (float) jSONArray.getDouble(2);
            float f2 = (float) jSONArray.getDouble(3);
            float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 4);
            float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 5);
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.preSkew(f, (float) jSONArray.getDouble(1));
            matrix.preTranslate(a2, a3);
            matrix.preScale((float) jSONArray.getDouble(0), f2);
            canvas.setMatrix(matrix);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
