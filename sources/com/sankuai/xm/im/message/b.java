package com.sankuai.xm.im.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.q;
import com.sankuai.xm.im.IMClient;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends q {
    public static ChangeQuickRedirect h;
    private static b i;
    private HashMap<Long, String> j;

    public static String d() {
        return "clear_user_data";
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e28a0274bb148a5844989cedaf92d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e28a0274bb148a5844989cedaf92d5");
        } else {
            this.j = new HashMap<>();
        }
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e9d67df5c53b135deb6354f059f4724", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e9d67df5c53b135deb6354f059f4724");
        }
        if (i == null) {
            synchronized (b.class) {
                if (i == null) {
                    i = new b();
                }
            }
        }
        return i;
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecc18643609282e3a39737f7c3638668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecc18643609282e3a39737f7c3638668");
            return;
        }
        synchronized (this) {
            JSONArray jSONArray = this.e;
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    long optLong = jSONObject.optLong("uid", 0L);
                    this.j.put(Long.valueOf(optLong), jSONObject.optString("id", ""));
                }
            } else {
                this.j.clear();
            }
        }
    }

    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06d5155f06b9fe3211127f542bc0782", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06d5155f06b9fe3211127f542bc0782");
        }
        synchronized (this) {
            if (this.j == null) {
                return "";
            }
            for (Map.Entry<Long, String> entry : this.j.entrySet()) {
                if (entry.getKey().longValue() != 0 && IMClient.a().k() != 0 && entry.getKey().longValue() == IMClient.a().k()) {
                    return entry.getValue();
                }
            }
            return "";
        }
    }
}
