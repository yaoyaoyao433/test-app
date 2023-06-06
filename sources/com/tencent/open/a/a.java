package com.tencent.open.a;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.common.CommonConstant;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.ConnectionSpec;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private static a a;
    private OkHttpClient b;
    private g c;

    protected a() {
        b();
    }

    private void b() {
        C1489a c1489a = new C1489a("AndroidSDK_" + Build.VERSION.SDK + CommonConstant.Symbol.UNDERLINE + Build.DEVICE + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient.Builder addInterceptor = builder.connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS)).connectTimeout(15000L, TimeUnit.MILLISECONDS).readTimeout(30000L, TimeUnit.MILLISECONDS).writeTimeout(30000L, TimeUnit.MILLISECONDS).cache(null).addInterceptor(c1489a);
        a(addInterceptor);
        this.b = addInterceptor.build();
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        a.c();
        return a;
    }

    public void a(g gVar) {
        this.c = gVar;
        c();
    }

    private void c() {
        if (this.c == null) {
            return;
        }
        int a2 = this.c.a("Common_HttpConnectionTimeout");
        if (a2 == 0) {
            a2 = 15000;
        }
        int a3 = this.c.a("Common_SocketConnectionTimeout");
        if (a3 == 0) {
            a3 = 30000;
        }
        a(a2, a3);
    }

    public void a(long j, long j2) {
        if (this.b.connectTimeoutMillis() == j && this.b.readTimeoutMillis() == j2) {
            return;
        }
        SLog.i("openSDK_LOG.OpenHttpService", "setTimeout changed.");
        this.b = this.b.newBuilder().connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j2, TimeUnit.MILLISECONDS).writeTimeout(j2, TimeUnit.MILLISECONDS).build();
    }

    public b a(String str, Map<String, String> map) throws IOException {
        if (map == null || map.isEmpty()) {
            return a(str, "");
        }
        StringBuilder sb = new StringBuilder("");
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "UTF-8"));
                sb.append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return a(str, sb.toString());
    }

    public b a(String str, String str2) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int indexOf = str2.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            if (indexOf == -1) {
                str = str + CommonConstant.Symbol.QUESTION_MARK;
            } else if (indexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return new b(this.b.newCall(new Request.Builder().url(str).get().build()).execute(), str2.length());
    }

    public b b(String str, Map<String, String> map) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "post data");
        FormBody.Builder builder = new FormBody.Builder();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    builder.add(str2, str3);
                }
            }
        }
        FormBody build = builder.build();
        return new b(this.b.newCall(new Request.Builder().url(str).post(build).build()).execute(), (int) build.contentLength());
    }

    public b a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() == 0) {
            return b(str, map);
        }
        SLog.i("openSDK_LOG.OpenHttpService", "post data, has byte data");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    builder.addFormDataPart(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                builder.addFormDataPart(str4, str4, RequestBody.create(MediaType.get("content/unknown"), bArr));
                SLog.w("openSDK_LOG.OpenHttpService", "post byte data.");
            }
        }
        MultipartBody build = builder.build();
        return new b(this.b.newCall(new Request.Builder().url(str).post(build).build()).execute(), (int) build.contentLength());
    }

    private void a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 21) {
            return;
        }
        try {
            c cVar = new c();
            TrustManager a2 = cVar.a();
            if (a2 == null) {
                return;
            }
            builder.sslSocketFactory(cVar, (X509TrustManager) a2);
            SLog.i("openSDK_LOG.OpenHttpService", "enableTls2: enabled.");
        } catch (KeyManagementException e) {
            SLog.e("openSDK_LOG.OpenHttpService", "enableTls2: failed.", e);
        } catch (KeyStoreException e2) {
            SLog.e("openSDK_LOG.OpenHttpService", "enableTls2: failed.", e2);
        } catch (NoSuchAlgorithmException e3) {
            SLog.e("openSDK_LOG.OpenHttpService", "enableTls2: failed.", e3);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.open.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1489a implements Interceptor {
        private final String a;

        public C1489a(String str) {
            this.a = str;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", this.a).build());
        }
    }
}
