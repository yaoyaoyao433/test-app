package com.dianping.monitor.metric;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public Map<String, String> d;
    public Map<String, List<Float>> e;
    public String f;
    public long g;
    public String h;

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "128ff7beffa7b199239c6d7da23e9bf1", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "128ff7beffa7b199239c6d7da23e9bf1");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.b);
            jSONObject.put("ts", this.g);
            jSONObject.put("kvs", new JSONObject(this.e));
            jSONObject.put("tags", new JSONObject(this.d));
            jSONObject.put("extra", this.f);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
