package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "clearRect";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9654c73dadc660c0c70228c3b7c01778", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9654c73dadc660c0c70228c3b7c01778")).booleanValue();
        }
        if (jsonArray.size() < 4) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(jsonArray, 0);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 1);
        float a4 = com.meituan.msi.util.f.a(jsonArray, 2);
        float a5 = com.meituan.msi.util.f.a(jsonArray, 3);
        if (canvas.isHardwareAccelerated()) {
            if (canvas instanceof com.meituan.msi.api.component.canvas.view.a) {
                ((com.meituan.msi.api.component.canvas.view.a) canvas).a(a2, a3, a4 + a2, a5 + a3);
                return true;
            } else if (fVar.g != null) {
                canvas.drawRect(a2, a3, a4 + a2, a3 + a5, fVar.g);
                return true;
            } else {
                return false;
            }
        } else if (fVar.g != null) {
            canvas.drawRect(a2, a3, a4 + a2, a3 + a5, fVar.g);
            return true;
        } else {
            canvas.drawRect(a2, a3, a4 + a2, a3 + a5, fVar.f);
            return true;
        }
    }
}
