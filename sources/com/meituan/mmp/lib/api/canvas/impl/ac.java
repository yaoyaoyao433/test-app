package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setStrokeStyle";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc9746147fb19a8a73540264072de92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc9746147fb19a8a73540264072de92")).booleanValue();
        }
        if (jSONArray.length() < 2) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if (CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR.equalsIgnoreCase(optString)) {
            if (jSONArray.length() < 3 || (optJSONArray2 = jSONArray.optJSONArray(1)) == null || optJSONArray2.length() < 4) {
                return false;
            }
            float a2 = com.meituan.mmp.lib.utils.p.a(optJSONArray2, 0);
            float a3 = com.meituan.mmp.lib.utils.p.a(optJSONArray2, 1);
            float a4 = com.meituan.mmp.lib.utils.p.a(optJSONArray2, 2);
            float a5 = com.meituan.mmp.lib.utils.p.a(optJSONArray2, 3);
            JSONArray optJSONArray3 = jSONArray.optJSONArray(2);
            if (optJSONArray3 == null || optJSONArray3.length() == 0) {
                return false;
            }
            int[] iArr = new int[optJSONArray3.length()];
            float[] fArr = new float[optJSONArray3.length()];
            for (int i = 0; i < optJSONArray3.length(); i++) {
                JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i);
                if (optJSONArray4.length() >= 2) {
                    fArr[i] = (float) optJSONArray4.optDouble(0);
                    iArr[i] = com.meituan.mmp.lib.utils.p.a(optJSONArray4.optJSONArray(1));
                }
            }
            iVar.c.setShader(new LinearGradient(a2, a3, a4, a5, iArr, fArr, Shader.TileMode.CLAMP));
        } else if ("radial".equalsIgnoreCase(optString)) {
            if (jSONArray.length() < 3 || (optJSONArray = jSONArray.optJSONArray(1)) == null || optJSONArray.length() < 3) {
                return false;
            }
            float a6 = com.meituan.mmp.lib.utils.p.a(optJSONArray, 1);
            float a7 = com.meituan.mmp.lib.utils.p.a(optJSONArray, 2);
            float a8 = com.meituan.mmp.lib.utils.p.a(optJSONArray, 3);
            JSONArray optJSONArray5 = jSONArray.optJSONArray(2);
            int[] iArr2 = new int[optJSONArray5.length()];
            float[] fArr2 = new float[optJSONArray5.length()];
            for (int i2 = 0; i2 < optJSONArray5.length(); i2++) {
                JSONArray optJSONArray6 = optJSONArray5.optJSONArray(i2);
                if (optJSONArray6.length() >= 2) {
                    fArr2[i2] = (float) optJSONArray6.optDouble(0);
                    iArr2[i2] = com.meituan.mmp.lib.utils.p.a(optJSONArray6.optJSONArray(1));
                }
            }
            iVar.c.setShader(new RadialGradient(a6, a7, a8, iArr2, fArr2, Shader.TileMode.CLAMP));
        } else if ("normal".equalsIgnoreCase(optString)) {
            iVar.c.setColor(com.meituan.mmp.lib.utils.p.a(jSONArray.optJSONArray(1)));
        }
        return true;
    }
}
