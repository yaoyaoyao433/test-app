package com.meituan.mmp.lib.api.canvas.path;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b = new a();
    private Map<String, b> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb11d9e6e6804819a5a476f9936b5970", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb11d9e6e6804819a5a476f9936b5970");
            return;
        }
        this.c = new HashMap();
        a(new h());
        a(new e());
        a(new g());
        a(new i());
        a(new f());
        a(new c());
        a(new d());
        a(new j());
    }

    public final Path a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cdedd99f2896b4a5b9504ccecd602f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Path) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cdedd99f2896b4a5b9504ccecd602f");
        }
        Path path = new Path();
        if (jSONArray == null || jSONArray.length() == 0) {
            return path;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("method");
                JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                b bVar = this.c.get(optString);
                if (bVar != null) {
                    bVar.a(path, optJSONArray);
                }
            }
        }
        return path;
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0def58e853401d27c753e4da275621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0def58e853401d27c753e4da275621");
        } else {
            this.c.put(bVar.a(), bVar);
        }
    }
}
