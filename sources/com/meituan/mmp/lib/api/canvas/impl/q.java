package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return AnimationViewCommandModel.Rotation;
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3cc3bafe5a785e57b1fb0b84c10b6dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3cc3bafe5a785e57b1fb0b84c10b6dd")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        canvas.rotate((float) ((((float) jSONArray.optDouble(0)) / 3.141592653589793d) * 180.0d));
        return true;
    }
}
