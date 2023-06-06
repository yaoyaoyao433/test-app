package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "restore";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbee169a1f1ba7f7096b6118c933ef7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbee169a1f1ba7f7096b6118c933ef7")).booleanValue();
        }
        canvas.restore();
        if (!iVar.e.isEmpty()) {
            iVar.c = iVar.e.pop();
            iVar.d = iVar.f.pop();
        }
        return true;
    }
}
