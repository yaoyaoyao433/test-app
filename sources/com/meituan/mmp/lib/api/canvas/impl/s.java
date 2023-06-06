package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "scale";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c2f01d7d86c0c0ce4e8f8ed19d7011", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c2f01d7d86c0c0ce4e8f8ed19d7011")).booleanValue();
        }
        if (jSONArray.length() < 2) {
            return false;
        }
        canvas.scale((float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1));
        return true;
    }
}
