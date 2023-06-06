package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "fillPath";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111c9ea3492b471be8d8ab4f5814f36c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111c9ea3492b471be8d8ab4f5814f36c")).booleanValue();
        }
        canvas.drawPath(com.meituan.mmp.lib.api.canvas.path.a.b.a(jSONArray), iVar.d);
        return true;
    }
}
