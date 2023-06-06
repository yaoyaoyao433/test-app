package com.meituan.android.common.locate.locator;

import android.content.Context;
import android.os.Build;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.n;
import com.meituan.android.common.locate.remote.IGearsLocatorApi;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.utils.g;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context a;
    private com.meituan.android.common.locate.repo.response.a b;
    private MtLocation c;

    public a(Context context, com.meituan.android.common.locate.repo.response.a aVar, MtLocation mtLocation) {
        Object[] objArr = {context, aVar, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60fdc8e0e8e5fbc30b0694da64ad6ddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60fdc8e0e8e5fbc30b0694da64ad6ddc");
            return;
        }
        this.a = context;
        this.b = aVar;
        this.c = mtLocation;
    }

    private MtLocation a(Response<ap> response) throws IOException {
        String string;
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3a39c3e32866873161136d3e576c9da", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3a39c3e32866873161136d3e576c9da");
        }
        if (!response.f()) {
            LogUtils.a("GearsLocator retrofit response failed");
            com.meituan.android.common.locate.platform.sniffer.a.a("retrofit response fail " + response.c(), 5);
            LocationUtils.a("retrofit response fail " + response.c());
            return new MtLocation(this.c, 5);
        }
        if (f.b().getBoolean("gears_location_encrypt_switcher", false)) {
            InputStream source = response.e().source();
            if (source == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g.a(source, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            source.close();
            string = new String(LocationUtils.f(byteArray), Charset.forName("UTF-8"));
        } else {
            string = response.e().string();
        }
        return a(string);
    }

    private MtLocation a(Object obj) throws IOException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84676093f1f62e0f68ea5d90303055c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84676093f1f62e0f68ea5d90303055c4");
        }
        if (obj instanceof Response) {
            return a((Response) obj);
        }
        if (obj instanceof okhttp3.Response) {
            return a((okhttp3.Response) obj);
        }
        return null;
    }

    private MtLocation a(String str) {
        MtLocation mtLocation;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34e382fe89601469d29ae5397761c17d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34e382fe89601469d29ae5397761c17d");
        }
        try {
            try {
                LogUtils.a("response str is: " + str);
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("code");
                if (i != 200) {
                    com.meituan.android.common.locate.platform.sniffer.a.a("server error or auth failedstatusCode: " + i, 5);
                    LocationUtils.c(jSONObject);
                    return new MtLocation(this.c, 5);
                }
                JSONObject jSONObject2 = jSONObject.has("data") ? jSONObject.getJSONObject("data") : null;
                if (jSONObject2 == null) {
                    com.meituan.android.common.locate.platform.sniffer.a.a("data is nullstatusCode: " + i, 5);
                    com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3 handleJsonString data == null", 3);
                    return new MtLocation(this.c, 5);
                }
                try {
                    if (!jSONObject2.has("location") || this.b == null) {
                        mtLocation = null;
                    } else {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("location");
                        mtLocation = new MtLocation(GearsLocator.GEARS_PROVIDER);
                        try {
                            this.b.a(mtLocation, jSONObject3);
                        } catch (JSONException e) {
                            e = e;
                            com.meituan.android.common.locate.platform.logs.c.a(" handleJsonString exception ex= " + e.getMessage(), 3);
                            com.meituan.android.common.locate.platform.sniffer.a.a("parse serve location exception : " + e.getMessage());
                            LogUtils.a(e);
                            if (mtLocation != null) {
                                this.b.b(mtLocation, jSONObject2);
                                this.b.c(mtLocation, jSONObject2);
                            }
                            n.a().a("type_json_parse_time", System.currentTimeMillis() - currentTimeMillis);
                            return new MtLocation(mtLocation, 0);
                        }
                    }
                } catch (JSONException e2) {
                    e = e2;
                    mtLocation = null;
                }
                if (mtLocation != null && this.b != null) {
                    this.b.b(mtLocation, jSONObject2);
                    this.b.c(mtLocation, jSONObject2);
                }
                n.a().a("type_json_parse_time", System.currentTimeMillis() - currentTimeMillis);
                return new MtLocation(mtLocation, 0);
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.logs.c.a("GearsLocatorV3 handleJsonString Throwable e = " + th.getMessage(), 3);
                LogUtils.a("Gears Locator handle response exception " + th.getMessage());
                com.meituan.android.common.locate.platform.sniffer.a.a("handle response error" + th.getMessage() + str, 7);
                return new MtLocation(this.c, 7);
            }
        } catch (JSONException e3) {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::handleJsonString: JsonException e = " + e3.getMessage(), 3);
            LogUtils.a("Gears Locator handle response JsonException : " + e3.getMessage());
            com.meituan.android.common.locate.platform.sniffer.a.a("handle response JsonException" + e3.getMessage() + str, 4);
            try {
                if (new JSONObject(str).getJSONObject("error").getInt("code") == 400) {
                    com.meituan.android.common.locate.platform.logs.c.a(" handleJsonString error.getInt(code) == 400 ", 3);
                }
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3 handleJsonString exception= " + e4.getMessage(), 3);
                LogUtils.a("Gears handle JSONException exception: " + e4.getMessage() + "response:" + str);
            }
            return new MtLocation(this.c, 4);
        }
    }

    private MtLocation a(okhttp3.Response response) throws IOException {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a84709860b8e77ef032042ca788554d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a84709860b8e77ef032042ca788554d");
        }
        ResponseBody body = response.body();
        if (body != null) {
            return a(f.b().getBoolean("gears_location_encrypt_switcher", false) ? new String(LocationUtils.f(body.bytes()), Charset.forName("UTF-8")) : body.string());
        }
        return null;
    }

    private static Response a(boolean z, IGearsLocatorApi iGearsLocatorApi, JSONObject jSONObject, byte[] bArr) throws Exception {
        Call<ap> sendWithPlain;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iGearsLocatorApi, jSONObject, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67b87630c876ba073dc26369dadc1c8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67b87630c876ba073dc26369dadc1c8c");
        }
        String jSONObject2 = jSONObject.toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (!z || bArr == null) {
            sendWithPlain = iGearsLocatorApi.sendWithPlain(al.a(jSONObject2.getBytes(), "text/plain"));
        } else {
            ak a = al.a(bArr, "text/plain");
            sendWithPlain = f.b().getBoolean("gears_location_encrypt_switcher", false) ? iGearsLocatorApi.sendGotWithGzipped(a) : iGearsLocatorApi.sendWithGzipped(a);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Response<ap> a2 = sendWithPlain.a();
        long currentTimeMillis3 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("locate response back,request cost:");
        long j = currentTimeMillis3 - currentTimeMillis2;
        sb.append(j);
        sb.append(",package and request cost:");
        sb.append(currentTimeMillis3 - currentTimeMillis);
        LogUtils.a(sb.toString());
        n.a().a("type_network_time", j);
        return a2;
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de283054fa0d20a203f3f9f6c784dfcf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de283054fa0d20a203f3f9f6c784dfcf") : com.meituan.android.common.locate.cache.b.a() ? "https://mars.zservey.com/locate/v3/sdk/loc" : "https://mars.meituan.com/locate/v3/sdk/loc";
    }

    private static okhttp3.Response a(boolean z, OkHttpClient okHttpClient, JSONObject jSONObject, byte[] bArr) throws Exception {
        Request.Builder post;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), okHttpClient, jSONObject, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf22ef3eeaca72698c552b6cf2688dad", RobustBitConfig.DEFAULT_VALUE)) {
            return (okhttp3.Response) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf22ef3eeaca72698c552b6cf2688dad");
        }
        System.currentTimeMillis();
        if (!z || bArr == null) {
            post = new Request.Builder().url(a()).post(RequestBody.create(MediaType.parse(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON), jSONObject.toString()));
        } else {
            post = new Request.Builder().url(a()).post(RequestBody.create(MediaType.parse(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON), bArr)).addHeader("X-Request-Encrypt", "1").addHeader("Content-Encoding", "gzip");
            if (f.b().getBoolean("gears_location_encrypt_switcher", false)) {
                post.addHeader("X-Response-Encrypt", "1").addHeader("X-Response-Encoding", "gzip");
            }
        }
        com.meituan.android.common.locate.repo.request.b.a(post);
        Request build = post.build();
        long currentTimeMillis = System.currentTimeMillis();
        okhttp3.Response execute = okHttpClient.newCall(build).execute();
        n.a().a("type_network_time", System.currentTimeMillis() - currentTimeMillis);
        return execute;
    }

    public static <T> T b(boolean z, IGearsLocatorApi iGearsLocatorApi, OkHttpClient okHttpClient, JSONObject jSONObject) throws Exception {
        long currentTimeMillis;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iGearsLocatorApi, okHttpClient, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        T t = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9543d5fa91f2b2e7b84ed4c21a35e196", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9543d5fa91f2b2e7b84ed4c21a35e196");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String jSONObject2 = jSONObject.toString();
        LogUtils.a("V3 holder string: " + jSONObject2);
        byte[] b = z ? LocationUtils.b(jSONObject2) : null;
        if (Build.VERSION.SDK_INT == 23) {
            if (okHttpClient == null) {
                if (iGearsLocatorApi != null) {
                    t = (T) a(z, new OkHttpClient(), jSONObject, b);
                }
            }
            t = (T) a(z, okHttpClient, jSONObject, b);
        } else {
            if (iGearsLocatorApi != null) {
                t = (T) a(z, iGearsLocatorApi, jSONObject, b);
            }
            t = (T) a(z, okHttpClient, jSONObject, b);
        }
        com.meituan.android.common.locate.platform.logs.c.a(" requestLoc response end,cost is:" + (currentTimeMillis - currentTimeMillis2) + ",current time is:" + System.currentTimeMillis(), 3);
        return t;
    }

    public MtLocation a(MtLocation mtLocation, MtLocation mtLocation2) {
        c.a aVar;
        Object[] objArr = {mtLocation, mtLocation2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2edff629bfc1b113a469193d9b81f0d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2edff629bfc1b113a469193d9b81f0d5");
        }
        if (mtLocation2 == null) {
            return mtLocation;
        }
        if (mtLocation == null) {
            LogUtils.a("GearsLocator notify Valid Cached");
            aVar = new c.a("gears_location_hit_cache", "success");
        } else if (mtLocation.getStatusCode() != 10 && mtLocation.getStatusCode() != 3 && mtLocation.getStatusCode() != 5) {
            return mtLocation;
        } else {
            LogUtils.a("GearsLocator notify Valid Cached");
            aVar = new c.a("gears_location_hit_cache", "success");
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(aVar);
        com.meituan.android.common.locate.platform.logs.c.a(mtLocation2, "GearsLocatorV3 Cache", null, 2);
        return mtLocation2;
    }

    public MtLocation a(boolean z, IGearsLocatorApi iGearsLocatorApi, OkHttpClient okHttpClient, JSONObject jSONObject) {
        MtLocation mtLocation;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iGearsLocatorApi, okHttpClient, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "743660a06df448515201bd8590e28185", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "743660a06df448515201bd8590e28185");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.meituan.android.common.locate.platform.logs.g.a().e();
            Object b = b(z, iGearsLocatorApi, okHttpClient, jSONObject);
            long currentTimeMillis2 = System.currentTimeMillis();
            com.meituan.android.common.locate.platform.logs.g.a().a(currentTimeMillis, currentTimeMillis2, true);
            try {
                if (b != null) {
                    mtLocation = a(b);
                } else {
                    com.meituan.android.common.locate.platform.logs.c.a(" response is null ", 3);
                    mtLocation = null;
                }
                if (mtLocation == null) {
                    com.meituan.android.common.locate.platform.logs.c.a(" location is null after request from sever ", 3);
                }
            } catch (Exception e) {
                MtLocation mtLocation2 = new MtLocation(this.c, 5);
                LogUtils.a(e);
                mtLocation = mtLocation2;
            }
            if (currentTimeMillis2 - currentTimeMillis >= u.a(this.a).l()) {
                com.meituan.android.common.locate.platform.logs.c.a(" used time is longer than network request time", 3);
                return null;
            }
            return mtLocation;
        } catch (SocketException e2) {
            LogUtils.a("GearsLocator http operator Hijack: " + e2.getMessage());
            com.meituan.android.common.locate.platform.sniffer.a.a("retrofit socketException " + e2.getMessage(), 10);
            LocationUtils.a("retrofit socketException " + e2.getMessage());
            com.meituan.android.common.locate.platform.logs.c.a("locatesdk requestlocation socketexception socketException se=" + e2.getMessage(), 3);
            return new MtLocation(this.c, 10);
        } catch (Throwable th) {
            LogUtils.a(th);
            LogUtils.a("GearsLocator retrofit request error: " + th.getMessage());
            com.meituan.android.common.locate.platform.sniffer.a.a("retrofit request error " + th.getMessage(), 3);
            LocationUtils.a("retrofit request error " + th.getMessage());
            com.meituan.android.common.locate.platform.logs.c.a("locatesdk requestlocation throwable" + th.getMessage(), 3);
            return new MtLocation(this.c, 3);
        }
    }
}
