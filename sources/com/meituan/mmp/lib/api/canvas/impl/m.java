package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setLineCap";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f6251649fcfd8afd7d1a5f3bc089d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f6251649fcfd8afd7d1a5f3bc089d3")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if ("butt".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeCap(Paint.Cap.BUTT);
            iVar.c.setStrokeCap(Paint.Cap.BUTT);
        } else if ("round".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeCap(Paint.Cap.ROUND);
            iVar.c.setStrokeCap(Paint.Cap.ROUND);
        } else if ("square".equalsIgnoreCase(optString)) {
            iVar.d.setStrokeCap(Paint.Cap.SQUARE);
            iVar.c.setStrokeCap(Paint.Cap.SQUARE);
        }
        return true;
    }
}
