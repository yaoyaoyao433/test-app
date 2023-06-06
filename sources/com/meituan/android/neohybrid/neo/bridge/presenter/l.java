package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.neo.http.c;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class l extends b implements com.meituan.android.neohybrid.neo.http.a<String> {
    public static ChangeQuickRedirect a = null;
    public static final String n = "l";
    private String o;
    private String p;

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return SocialConstants.TYPE_REQUEST;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public /* synthetic */ void onRequestSucc(int i, String str) {
        String str2 = str;
        Object[] objArr = {Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65072006c613e497e6680015e1904acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65072006c613e497e6680015e1904acf");
            return;
        }
        g();
        if (i != 11189196) {
            b("SharkBridgePresenter.onRequestSucc: unkonw tag, tag=" + i + ";json=" + str2 + ";requestPath=" + this.o + ";tradeno=" + this.p);
            try {
                String str3 = this.f;
                a(str3, c("unkonw tag; tag=" + i));
            } catch (Exception e) {
                b(e.toString());
            }
        } else if (TextUtils.isEmpty(str2)) {
            b("SharkBridgePresenter.onRequestSucc: json is null, tag=" + i + ";json=" + str2 + ";requestPath=" + this.o + ";tradeno=" + this.p);
            try {
                a(this.f, c("result json is empty"));
            } catch (Exception e2) {
                b(e2.toString());
            }
        } else {
            try {
                a(this.f, new JSONObject(str2));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public l(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95dea90f5ad941f19f568376bc17f696", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95dea90f5ad941f19f568376bc17f696");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() throws JSONException {
        Map<String, String> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb30706970b4b6e8f283201ff359a9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb30706970b4b6e8f283201ff359a9b");
        }
        if (this.c.equals(TrafficRecord.Detail.TUNNEL_SHARK)) {
            f();
            JSONObject jSONObject = new JSONObject(this.d);
            String f = com.meituan.android.neohybrid.init.a.f();
            String optString = jSONObject.optString("path");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            Map<String, Object> map2 = optJSONObject != null ? (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.neo.bridge.presenter.l.1
            }.getType()) : null;
            if (jSONObject.has("headers")) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("headers");
                map = optJSONObject2 != null ? (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONObject2.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.neo.bridge.presenter.l.2
                }.getType()) : null;
            } else {
                map = null;
            }
            Object[] objArr2 = {f, optString, map, map2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f3d0e1d4819a633e3afcee2e3df3e78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f3d0e1d4819a633e3afcee2e3df3e78");
            } else {
                this.o = f + optString;
                if (TextUtils.isEmpty(this.o)) {
                    b("SharkBridgePresenter.onRequestSucc: mRequestPath is null; tradeno=" + this.p);
                } else {
                    this.p = map2 != null ? String.valueOf(map2.get("tradeno")) : null;
                    c.a b = com.meituan.android.neohybrid.neo.http.c.a(this).a(11189196).a(e()).a(this.o).b(map2);
                    if (map != null && !map.isEmpty()) {
                        b.a(map);
                    }
                    if (com.meituan.android.neohybrid.init.a.h()) {
                        b.a("neo-header-test", "neo-header-test-value");
                    }
                    b.a();
                }
            }
            com.meituan.android.neohybrid.util.f.a("NeoBridge - RequestBridgePresenter\n" + this.c + "\n" + this.d + "\n" + this.o + "\n");
            return i();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return n;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public void onRequestFail(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c20df686c99bda7a0a305ec9a510f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c20df686c99bda7a0a305ec9a510f4b");
            return;
        }
        g();
        if (i != 11189196) {
            b(n + "onRequestFail.unkonw tag.tag=" + i + ";e=" + exc + ";requestPath=" + this.o + ";tradeno=" + this.p);
            return;
        }
        b(n + "onRequestFail.req fail.tag=" + i + ";e=" + exc + ";requestPath=" + this.o + ";tradeno=" + this.p);
        try {
            a(this.f, c(exc.toString()));
        } catch (Exception e) {
            b(n + "onRequestFail.e1:" + e.toString());
        }
    }

    private JSONObject c(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2910cf932a78713b5745e7d978353a3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2910cf932a78713b5745e7d978353a3f");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "fail");
        jSONObject.put("response", str);
        return jSONObject;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b, com.meituan.android.neohybrid.neo.bridge.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2518a447927a63844b140e31c63ff24b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2518a447927a63844b140e31c63ff24b");
            return;
        }
        super.a();
        g();
    }
}
