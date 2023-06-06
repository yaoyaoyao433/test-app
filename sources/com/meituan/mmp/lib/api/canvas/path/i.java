package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final String a() {
        return "quadraticCurveTo";
    }

    @Override // com.meituan.mmp.lib.api.canvas.path.b
    public final boolean a(Path path, JSONArray jSONArray) {
        Object[] objArr = {path, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1711e358cd98b497634b897856a19d55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1711e358cd98b497634b897856a19d55")).booleanValue();
        }
        if (jSONArray.length() < 4) {
            return false;
        }
        path.quadTo(p.a(jSONArray, 0), p.a(jSONArray, 1), p.a(jSONArray, 2), p.a(jSONArray, 3));
        return true;
    }
}
