package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o extends b implements com.meituan.android.neohybrid.neo.http.a<String> {
    public static ChangeQuickRedirect a = null;
    public static final String o = "o";
    private String p;
    private String q;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return SocialConstants.TYPE_REQUEST;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public /* synthetic */ void onRequestSucc(int i, String str) {
        String str2 = str;
        Object[] objArr = {Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e717d4511d90ba5cf7f16aebae9066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e717d4511d90ba5cf7f16aebae9066");
            return;
        }
        g();
        if (i != 11189196) {
            b("SharkBridgePresenter.onRequestSucc: unkonw tag, tag=" + i + ";json=" + str2 + ";requestPath=" + this.p + ";tradeno=" + this.q);
            try {
                String str3 = this.f;
                a(str3, c("unkonw tag; tag=" + i));
            } catch (Exception e) {
                b(e.toString());
            }
        } else if (TextUtils.isEmpty(str2)) {
            b("SharkBridgePresenter.onRequestSucc: json is null, tag=" + i + ";json=" + str2 + ";requestPath=" + this.p + ";tradeno=" + this.q);
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

    public o(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43af53fe244b277f64c0b937b32e6b58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43af53fe244b277f64c0b937b32e6b58");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    public o(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar2) {
        Object[] objArr = {aVar, str, str2, str3, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e208710b3da14f540cf1301535bdf8d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e208710b3da14f540cf1301535bdf8d9");
        } else {
            a(aVar, str, str2, str3, aVar2);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6edd0beaa04716d5a447267adc5d74f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6edd0beaa04716d5a447267adc5d74f");
        }
        if (this.c.equals(TrafficRecord.Detail.TUNNEL_SHARK)) {
            f();
            JSONObject jSONObject = new JSONObject(this.d);
            String f = com.meituan.android.neohybrid.init.a.f();
            String optString = jSONObject.optString("path");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            Map map = optJSONObject != null ? (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.o.1
            }.getType()) : null;
            HashMap hashMap = new HashMap();
            if (!com.meituan.android.paybase.utils.i.a(map)) {
                hashMap.putAll(map);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("fill_params");
            List list = optJSONArray != null ? (List) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONArray.toString(), new TypeToken<List<String>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.o.2
            }.getType()) : null;
            if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
                Map<String, Object> a2 = com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(this.h, list);
                if (!com.meituan.android.paybase.utils.i.a(a2)) {
                    hashMap.putAll(a2);
                }
            }
            Object[] objArr2 = {f, optString, hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81da9646ce82907f33c35974dca4fc33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81da9646ce82907f33c35974dca4fc33");
            } else {
                this.p = f + optString;
                if (TextUtils.isEmpty(this.p)) {
                    b("SharkBridgePresenter.onRequestSucc: mRequestPath is null; tradeno=" + this.q);
                } else {
                    this.q = String.valueOf(hashMap.get("tradeno"));
                    com.meituan.android.neohybrid.v2.neo.http.b.a(this).a(11189196).a(e()).a(this.p).a(hashMap).a();
                }
            }
            com.meituan.android.neohybrid.util.f.a("NeoBridge - RequestBridgePresenter\n" + this.c + "\n" + this.d + "\n" + this.p + "\n");
            return i();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public void onRequestFail(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d977927af4aa93ce1e7f4119ad1a6866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d977927af4aa93ce1e7f4119ad1a6866");
            return;
        }
        g();
        if (i != 11189196) {
            b(o + "onRequestFail.unkonw tag.tag=" + i + ";e=" + exc + ";requestPath=" + this.p + ";tradeno=" + this.q);
            return;
        }
        b(o + "onRequestFail.req fail.tag=" + i + ";e=" + exc + ";requestPath=" + this.p + ";tradeno=" + this.q);
        try {
            a(this.f, c(exc.toString()));
        } catch (Exception e) {
            b(o + "onRequestFail.e1:" + e.toString());
        }
    }

    private JSONObject c(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9103c458fadedb21d8713cf206b37cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9103c458fadedb21d8713cf206b37cc");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "fail");
        jSONObject.put("response", str);
        return jSONObject;
    }
}
