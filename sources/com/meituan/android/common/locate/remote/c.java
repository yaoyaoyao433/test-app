package com.meituan.android.common.locate.remote;

import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static c f;
    private ICollectReportApi a;
    private IErrorReportApi b;
    private IBLEInfoReportApi c;
    private IConfigApi d;
    private IAltBeaconApi e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "576095de8c1ff5398419f058ab6c4d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "576095de8c1ff5398419f058ab6c4d6b");
            return;
        }
        ar b = b.b();
        if (b != null) {
            this.a = (ICollectReportApi) b.a(ICollectReportApi.class);
            this.b = (IErrorReportApi) b.a(IErrorReportApi.class);
            this.d = (IConfigApi) b.a(IConfigApi.class);
            this.c = (IBLEInfoReportApi) b.a(IBLEInfoReportApi.class);
            this.e = (IAltBeaconApi) b.a(IAltBeaconApi.class);
        }
    }

    public static c a() {
        return f;
    }

    public static void a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79a47518a2e1bd3c91ac6e2ff924c38d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79a47518a2e1bd3c91ac6e2ff924c38d");
        } else if (interfaceC0637a == null) {
        } else {
            f = new c();
        }
    }

    public com.meituan.android.common.locate.altbeacon.beacon.bean.a a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb46c4b69d074e7c730d70b8e58bbdf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.common.locate.altbeacon.beacon.bean.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb46c4b69d074e7c730d70b8e58bbdf8");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appname", str);
            jSONObject.put("userid", str2);
            jSONObject.put("uuid", str3);
            jSONObject.put("authkey", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ak a = al.a(jSONObject.toString().getBytes(), "Content-Type=application/json");
        if (this.e == null) {
            return null;
        }
        try {
            Response<ap> a2 = this.e.getAltBeaconConfig(a).a();
            if (a2 != null && a2.f() && a2.e() != null) {
                String string = a2.e().string();
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject2 = new JSONObject(string);
                    if (!jSONObject2.has("code") || jSONObject2.getInt("code") == 200) {
                        new JSONObject();
                        if (jSONObject2.has("data")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            com.meituan.android.common.locate.altbeacon.beacon.bean.a aVar = new com.meituan.android.common.locate.altbeacon.beacon.bean.a();
                            if (jSONObject3.has("uuid")) {
                                aVar.a = jSONObject3.getString("uuid");
                            }
                            if (jSONObject3.has("major")) {
                                aVar.b = jSONObject3.getInt("major");
                            }
                            if (jSONObject3.has("minor")) {
                                aVar.c = jSONObject3.getInt("minor");
                            }
                            return aVar;
                        }
                        return null;
                    }
                    return null;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public boolean reportCollectorRecord(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a82f80f8130d1e123b0bf1e0d5636aea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a82f80f8130d1e123b0bf1e0d5636aea")).booleanValue();
        }
        LogUtils.a("retrofit reportCollectorRecord");
        Response<ap> a = this.a.reportCollect(al.a(bArr, "text/plain")).a();
        if (a == null || !a.f()) {
            throw new IOException("response not success");
        }
        if (a.b() == 200) {
            ap e = a.e();
            if (e != null) {
                String string = e.string();
                LogUtils.a("reportCollectorRecord response:" + string);
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    return jSONObject.optBoolean("success") && jSONObject.optString("msg").equalsIgnoreCase("success");
                } catch (Throwable th) {
                    LogUtils.a(th);
                    return false;
                }
            }
            throw new IOException("responseBody null");
        }
        throw new IOException("status is not 200");
    }
}
