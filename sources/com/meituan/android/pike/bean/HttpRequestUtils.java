package com.meituan.android.pike.bean;

import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HttpRequestUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void get(String str, final HttpCallBack httpCallBack) {
        Object[] objArr = {str, httpCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0dd16302c5e65a70427b6c5fed8b9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0dd16302c5e65a70427b6c5fed8b9d2");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Protocol.HTTP_1_1);
            arrayList.add(Protocol.SPDY_3);
            arrayList.add(Protocol.HTTP_2);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            builder.followRedirects(false).connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).protocols(arrayList).cookieJar(new CookieImpl()).build().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: com.meituan.android.pike.bean.HttpRequestUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    Object[] objArr2 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f76f22fb996b170df981e9e346097cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f76f22fb996b170df981e9e346097cc");
                        return;
                    }
                    PikeLog.e("HttpRequestUtils", "onFailure ");
                    if (HttpCallBack.this != null) {
                        HttpCallBack.this.onFailure();
                    }
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "beb387b176f6f21ac4006873fadead07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "beb387b176f6f21ac4006873fadead07");
                        return;
                    }
                    String string = response.body().string();
                    PikeLog.d("HttpRequestUtils", string);
                    if (HttpCallBack.this != null) {
                        HttpCallBack.this.onResponse(string);
                    }
                }
            });
        }
    }
}
