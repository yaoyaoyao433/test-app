package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "rect";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02d9936af5901c42ab270fa0ff3fbfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02d9936af5901c42ab270fa0ff3fbfb")).booleanValue();
        }
        if (jSONArray.length() < 4) {
            return false;
        }
        float a2 = p.a(jSONArray, 0);
        float a3 = p.a(jSONArray, 1);
        path.addRect(a2, a3, a2 + p.a(jSONArray, 2), p.a(jSONArray, 3) + a3, Path.Direction.CW);
        return true;
    }
}
