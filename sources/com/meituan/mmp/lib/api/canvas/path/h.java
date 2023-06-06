package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "moveTo";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c835811a2356d0d0758140351d47ee8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c835811a2356d0d0758140351d47ee8")).booleanValue();
        }
        if (jSONArray.length() < 2) {
            return false;
        }
        path.moveTo(p.a(jSONArray, 0), p.a(jSONArray, 1));
        return true;
    }
}
