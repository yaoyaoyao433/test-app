package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aj implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "translate";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "138a6d075105445fb132496cc71f3c39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "138a6d075105445fb132496cc71f3c39")).booleanValue();
        }
        if (jsonArray.size() < 2) {
            return false;
        }
        canvas.translate(com.meituan.msi.util.f.a(jsonArray, 0), com.meituan.msi.util.f.a(jsonArray, 1));
        return true;
    }
}
