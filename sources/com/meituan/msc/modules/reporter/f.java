package com.meituan.msc.modules.reporter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.modules.container.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends MSCReporter {
    public static ChangeQuickRedirect m;
    protected a n;

    public f(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbd0f0c3b89ca259a1ccc7a66477987f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbd0f0c3b89ca259a1ccc7a66477987f");
        } else {
            this.n = aVar;
        }
    }

    @Override // com.meituan.msc.common.report.a
    public com.meituan.msc.common.report.d a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17b2157f7d3bbfe873797580b70c8e7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.report.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17b2157f7d3bbfe873797580b70c8e7") : super.a(str, z).a(this.n.a());
    }

    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc26a17ef6471a2adc04286619b21d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc26a17ef6471a2adc04286619b21d9");
        } else {
            a(jSONObject, "msc.js.error.count");
        }
    }

    public void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c41befd21cb2c480288137ade26a2a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c41befd21cb2c480288137ade26a2a0");
        } else {
            a(jSONObject, "msc.render.error.count");
        }
    }

    private void a(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bfa1a7eb1de31a834b8771a8b8a8e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bfa1a7eb1de31a834b8771a8b8a8e53");
        } else if (jSONObject == null) {
        } else {
            boolean optBoolean = jSONObject.optBoolean("isFatal", true);
            boolean optBoolean2 = jSONObject.optBoolean("isUser", false);
            try {
                jSONObject.put("isFatal", String.valueOf(optBoolean));
                jSONObject.put("isUser", String.valueOf(optBoolean2));
            } catch (JSONException unused) {
            }
            String c = c(jSONObject);
            com.meituan.msc.common.report.d b = b(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                    opt = opt.toString();
                }
                if (!TextUtils.equals(next, "extraData")) {
                    b.a(next, opt);
                }
            }
            if (!TextUtils.isEmpty(c)) {
                b.a("stack", c);
            }
            b.c();
        }
    }

    @Nullable
    private String c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139b56ec4fd1d392b00d4c55d32f4ef0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139b56ec4fd1d392b00d4c55d32f4ef0");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("extraData");
        if (optJSONObject != null) {
            return optJSONObject.optString("rawStack");
        }
        return null;
    }

    private static com.meituan.msc.modules.page.e a(com.meituan.msc.modules.engine.h hVar) {
        q b;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37d29e68b17ffc13c7f76b492268d454", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37d29e68b17ffc13c7f76b492268d454");
        }
        if (hVar == null || (b = hVar.b()) == null) {
            return null;
        }
        return b.g();
    }

    public static com.meituan.msc.modules.page.render.a b(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64f379943b7079afa7d3131ec85c8bdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64f379943b7079afa7d3131ec85c8bdd");
        }
        com.meituan.msc.modules.page.e a = a(hVar);
        if (a instanceof com.meituan.msc.modules.page.o) {
            return ((com.meituan.msc.modules.page.o) a).l();
        }
        return null;
    }

    public final a f() {
        return this.n;
    }
}
