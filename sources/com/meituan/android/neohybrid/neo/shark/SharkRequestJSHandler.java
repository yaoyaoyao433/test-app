package com.meituan.android.neohybrid.neo.shark;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.base.jshandler.HybridBaseJSHandler;
import com.meituan.android.neohybrid.neo.http.a;
import com.meituan.android.neohybrid.neo.http.c;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharkRequestJSHandler extends HybridBaseJSHandler implements a<String> {
    private static final int CODE_CALLBACK_NET_ERROR = 0;
    private static final int CODE_CALLBACK_UNKNOWN = 4000;
    private static final String KEY_JSON_DATA = "data";
    private static final String KEY_JSON_HEADERS = "headers";
    private static final String KEY_JSON_HOST = "host";
    private static final String KEY_JSON_PARAMS = "params";
    private static final String KEY_JSON_PATH = "path";
    private static final String MSG_CALLBACK_NET_ERROR = "网络错误";
    private static final String MSG_CALLBACK_UNKNOWN = "unknown";
    private static final String NAME = "pay.sharkRequest";
    private static final int REQ_SHARK = 11189196;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mRequestPath;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return NAME;
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.HybridBaseJSHandler, com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8189def35675f9e789e05b3620c80770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8189def35675f9e789e05b3620c80770");
            return;
        }
        super.exec();
        try {
            if (jsBean() == null || jsBean().argsJson == null) {
                return;
            }
            JSONObject optJSONObject2 = jsBean().argsJson.optJSONObject("data");
            String f = com.meituan.android.neohybrid.init.a.f();
            String optString = optJSONObject2.optString("path");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("params");
            Map<String, String> map = null;
            Map<String, Object> map2 = optJSONObject3 != null ? (Map) b.a().fromJson(optJSONObject3.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.neo.shark.SharkRequestJSHandler.1
            }.getType()) : null;
            if (optJSONObject2.has(KEY_JSON_HEADERS) && (optJSONObject = optJSONObject2.optJSONObject(KEY_JSON_HEADERS)) != null) {
                map = (Map) b.a().fromJson(optJSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.neo.shark.SharkRequestJSHandler.2
                }.getType());
            }
            request(f, optString, map, map2);
        } catch (Exception unused) {
            jsCallbackSharkNormalErr();
        }
    }

    private void request(String str, String str2, Map<String, String> map, Map<String, Object> map2) {
        Object[] objArr = {str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa326b015c965d13ad5f7ca59c91ee5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa326b015c965d13ad5f7ca59c91ee5a");
            return;
        }
        this.mRequestPath = str + str2;
        if (TextUtils.isEmpty(this.mRequestPath)) {
            return;
        }
        d.a(getNeoCompat(), "b_pay_kloyo9kq_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("requestPath", this.mRequestPath).b);
        c.a b = c.a(this).a(REQ_SHARK).a(getNeoCompat()).a(this.mRequestPath).b(map2);
        if (map != null && !map.isEmpty()) {
            b.a(map);
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            b.a("knb-header-test", "knb-header-test-value");
        }
        b.a();
    }

    private void jsCallbackSharkNormalErr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec0f3aa35eb147424be374cc9ff21a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec0f3aa35eb147424be374cc9ff21a02");
            return;
        }
        d.a(getNeoCompat(), "b_pay_yokma8ek_sc", (Map<String, Object>) null);
        jsCallbackHybridErrorNew(4000, "unknown");
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public void onRequestSucc(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e50551fcd84736776eb9cd74dd4eada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e50551fcd84736776eb9cd74dd4eada");
            return;
        }
        if (i == REQ_SHARK) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    d.a(getNeoCompat(), "b_pay_2xs5kaya_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("requestPath", this.mRequestPath).b);
                    jsCallbackHybrid(new JSONObject(str));
                    return;
                } catch (JSONException unused) {
                }
            } else {
                jsCallbackSharkNormalErr();
                return;
            }
        }
        jsCallbackSharkNormalErr();
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public void onRequestFail(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65bd60cae77f2ad5be1be45ee535326c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65bd60cae77f2ad5be1be45ee535326c");
        } else if (i == REQ_SHARK) {
            d.a(getNeoCompat(), "b_pay_yokma8ek_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("requestPath", this.mRequestPath).b);
            jsCallbackHybridErrorNew(0, MSG_CALLBACK_NET_ERROR);
        } else {
            jsCallbackSharkNormalErr();
        }
    }
}
