package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "bezierCurveTo";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8a53d2fd95e25cf978dc13398a3b38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8a53d2fd95e25cf978dc13398a3b38")).booleanValue();
        }
        if (jSONArray.length() < 6) {
            return false;
        }
        path.cubicTo(p.a(jSONArray, 0), p.a(jSONArray, 1), p.a(jSONArray, 2), p.a(jSONArray, 3), p.a(jSONArray, 4), p.a(jSONArray, 5));
        return true;
    }
}
