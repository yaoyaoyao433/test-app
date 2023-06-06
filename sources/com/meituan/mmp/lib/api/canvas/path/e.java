package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "closePath";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72882c6c1e6a27982d3e7d29a8ae027b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72882c6c1e6a27982d3e7d29a8ae027b")).booleanValue();
        }
        path.close();
        return true;
    }
}
