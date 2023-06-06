package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setTextAlign";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096fa66d7b3e9d780ee6fc7561cddad8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096fa66d7b3e9d780ee6fc7561cddad8")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if ("left".equalsIgnoreCase(optString)) {
            iVar.c.setTextAlign(Paint.Align.LEFT);
            iVar.d.setTextAlign(Paint.Align.LEFT);
        } else if ("right".equalsIgnoreCase(optString)) {
            iVar.c.setTextAlign(Paint.Align.RIGHT);
            iVar.d.setTextAlign(Paint.Align.RIGHT);
        } else if ("center".equalsIgnoreCase(optString)) {
            iVar.c.setTextAlign(Paint.Align.CENTER);
            iVar.d.setTextAlign(Paint.Align.CENTER);
        }
        return true;
    }
}
