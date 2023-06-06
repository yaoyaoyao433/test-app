package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.google.gson.JsonArray;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setStrokeStyle";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        JsonArray asJsonArray;
        JsonArray asJsonArray2;
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7dad03f13ed9402dc88c3367dd3717", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7dad03f13ed9402dc88c3367dd3717")).booleanValue();
        }
        if (jsonArray.size() < 2) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if (CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR.equalsIgnoreCase(asString)) {
            if (jsonArray.size() < 3 || (asJsonArray2 = jsonArray.get(1).getAsJsonArray()) == null || asJsonArray2.size() < 4) {
                return false;
            }
            float a2 = com.meituan.msi.util.f.a(asJsonArray2, 0);
            float a3 = com.meituan.msi.util.f.a(asJsonArray2, 1);
            float a4 = com.meituan.msi.util.f.a(asJsonArray2, 2);
            float a5 = com.meituan.msi.util.f.a(asJsonArray2, 3);
            JsonArray asJsonArray3 = jsonArray.get(2).getAsJsonArray();
            if (asJsonArray3 == null || asJsonArray3.size() == 0) {
                return false;
            }
            int[] iArr = new int[asJsonArray3.size()];
            float[] fArr = new float[asJsonArray3.size()];
            for (int i = 0; i < asJsonArray3.size(); i++) {
                JsonArray asJsonArray4 = asJsonArray3.get(i).getAsJsonArray();
                if (asJsonArray4.size() >= 2) {
                    fArr[i] = (float) asJsonArray4.get(0).getAsDouble();
                    iArr[i] = com.meituan.msi.util.f.a(asJsonArray4.get(1).getAsJsonArray());
                }
            }
            fVar.b.setShader(new LinearGradient(a2, a3, a4, a5, iArr, fArr, Shader.TileMode.CLAMP));
        } else if ("radial".equalsIgnoreCase(asString)) {
            if (jsonArray.size() < 3 || (asJsonArray = jsonArray.get(1).getAsJsonArray()) == null || asJsonArray.size() < 3) {
                return false;
            }
            float a6 = com.meituan.msi.util.f.a(asJsonArray, 1);
            float a7 = com.meituan.msi.util.f.a(asJsonArray, 2);
            float a8 = com.meituan.msi.util.f.a(asJsonArray, 3);
            JsonArray asJsonArray5 = jsonArray.get(2).getAsJsonArray();
            int[] iArr2 = new int[asJsonArray5.size()];
            float[] fArr2 = new float[asJsonArray5.size()];
            for (int i2 = 0; i2 < asJsonArray5.size(); i2++) {
                JsonArray asJsonArray6 = asJsonArray5.get(i2).getAsJsonArray();
                if (asJsonArray6.size() >= 2) {
                    fArr2[i2] = (float) asJsonArray6.get(0).getAsDouble();
                    iArr2[i2] = com.meituan.msi.util.f.a(asJsonArray6.get(1).getAsJsonArray());
                }
            }
            fVar.b.setShader(new RadialGradient(a6, a7, a8, iArr2, fArr2, Shader.TileMode.CLAMP));
        } else if ("normal".equalsIgnoreCase(asString)) {
            fVar.b.setColor(com.meituan.msi.util.f.a(jsonArray.get(1).getAsJsonArray()));
        }
        return true;
    }
}
