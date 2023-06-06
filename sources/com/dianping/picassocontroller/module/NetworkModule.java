package com.dianping.picassocontroller.module;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.e;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "network")
/* loaded from: classes.dex */
public class NetworkModule {
    private static final String FAIL = "fail";
    private static final String SUCCESS = "success";
    public static ChangeQuickRedirect changeQuickRedirect;
    private OkHttpClient okHttpClient;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class NetworkArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String body;
        public String headers;
        public String method = "GET";
        public int timeout;
        public String url;
    }

    public NetworkModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead11cd1cb19c0832c76dfac27349a42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead11cd1cb19c0832c76dfac27349a42");
        } else {
            this.okHttpClient = new OkHttpClient();
        }
    }

    @Keep
    @PCSBMethod(name = "fetch")
    public void fetch(final b bVar, final NetworkArgument networkArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        RequestBody requestBody;
        Object[] objArr = {bVar, networkArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8baa9b0eaf98f1416539b6bdf85d26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8baa9b0eaf98f1416539b6bdf85d26b");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        Headers.Builder builder = new Headers.Builder();
        try {
            if (!TextUtils.isEmpty(networkArgument.headers)) {
                JSONObject jSONObject = new JSONObject(networkArgument.headers);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    builder.add(next, jSONObject.optString(next));
                }
            }
        } catch (JSONException e) {
            Log.e(NetworkModule.class.getSimpleName(), e.toString());
        }
        Headers build = builder.build();
        String str = build.get("Content-Type");
        if (TextUtils.isEmpty(str)) {
            str = HHNetConfig.JSON;
        }
        MediaType parse = MediaType.parse(str);
        String str2 = TextUtils.isEmpty(networkArgument.method) ? "GET" : networkArgument.method;
        if (HttpMethod.permitsRequestBody(str2)) {
            requestBody = RequestBody.create(parse, networkArgument.body == null ? "" : networkArgument.body);
        } else {
            requestBody = null;
        }
        Request.Builder builder2 = new Request.Builder();
        builder2.url(networkArgument.url).headers(build).method(str2, requestBody);
        if (networkArgument.timeout > 0 && this.okHttpClient.connectTimeoutMillis() != networkArgument.timeout * 1000) {
            this.okHttpClient = this.okHttpClient.newBuilder().connectTimeout(networkArgument.timeout * 1000, TimeUnit.MILLISECONDS).build();
        }
        this.okHttpClient.newCall(builder2.build()).enqueue(new Callback() { // from class: com.dianping.picassocontroller.module.NetworkModule.1
            public static ChangeQuickRedirect a;

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                Object[] objArr2 = {call, iOException};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7470fbdfdc72ca9d7445adb3722e49b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7470fbdfdc72ca9d7445adb3722e49b");
                    return;
                }
                bVar2.b(NetworkModule.this.buildPicassoError(0, "network error", iOException.getMessage()));
                NetworkModule.this.reportPerformance((e) bVar, currentTimeMillis, networkArgument.url, "fail");
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) throws IOException {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d121746bfdb3545e6826ad10d7da7bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d121746bfdb3545e6826ad10d7da7bf");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("statusCode", response.code());
                    jSONObject2.put("status", "success");
                    jSONObject2.put("data", response.body() == null ? "" : response.body().string());
                    bVar2.a(jSONObject2);
                    NetworkModule.this.reportPerformance((e) bVar, currentTimeMillis, networkArgument.url, "success");
                } catch (JSONException e2) {
                    bVar2.b(NetworkModule.this.buildPicassoError(0, "request success, but fail when build result", e2.getMessage()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject buildPicassoError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff83043f08ff5eb8054d1f8b3e9c2c29", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff83043f08ff5eb8054d1f8b3e9c2c29");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("errMsg", str);
            jSONObject.put("info", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportPerformance(@NonNull e eVar, long j, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {eVar, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af3d7cd0225bcba4331f81525c2db9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af3d7cd0225bcba4331f81525c2db9b5");
        } else if (eVar.c() == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("state", str2);
            System.currentTimeMillis();
        }
    }
}
