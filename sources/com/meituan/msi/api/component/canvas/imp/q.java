package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return AnimationViewCommandModel.Rotation;
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a966770bc882a37182736f71cdefffe2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a966770bc882a37182736f71cdefffe2")).booleanValue();
        }
        if (jsonArray.size() <= 0) {
            return false;
        }
        canvas.rotate((float) ((((float) jsonArray.get(0).getAsDouble()) / 3.141592653589793d) * 180.0d));
        return true;
    }
}
