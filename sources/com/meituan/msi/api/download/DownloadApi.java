package com.meituan.msi.api.download;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiGray;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.network.HeadersReceivedEvent;
import com.meituan.msi.api.network.okhttp3.b;
import com.meituan.msi.api.network.okhttp3.c;
import com.meituan.msi.api.request.RequestApiResponse;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ProgressUpdateEvent;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.file.d;
import com.meituan.msi.util.g;
import com.meituan.msi.util.h;
import com.meituan.msi.util.o;
import com.meituan.msi.util.s;
import com.meituan.msi.util.t;
import com.meituan.msi.util.u;
import com.meituan.msi.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
@MsiApiGray(graySwitchName = "api_download")
/* loaded from: classes3.dex */
public class DownloadApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final Map<String, Call> c;
    private String d;
    private long e;
    private long f;

    @MsiApiMethod(isCallback = true, name = "DownloadTask.offHeadersReceived")
    public void offHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.offProgressUpdate")
    public void offProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.onHeadersReceived", response = HeadersReceivedEvent.class)
    public void onHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.onProgressUpdate", response = ProgressUpdateEvent.class)
    public void onUploadFileProgressUpdate(MsiContext msiContext) {
    }

    public DownloadApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d43af4ddbe851c380696f5ff88ad5de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d43af4ddbe851c380696f5ff88ad5de");
            return;
        }
        this.b = a.f();
        this.c = new ConcurrentHashMap();
    }

    public static /* synthetic */ RequestApiResponse a(DownloadApi downloadApi, Response response, String str, MsiContext msiContext) {
        Object[] objArr = {response, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, downloadApi, changeQuickRedirect, false, "8465ce78db24a4db14351c730f25117e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestApiResponse) PatchProxy.accessDispatch(objArr, downloadApi, changeQuickRedirect, false, "8465ce78db24a4db14351c730f25117e");
        }
        RequestApiResponse requestApiResponse = new RequestApiResponse();
        HashMap hashMap = new HashMap();
        Headers headers = response.headers();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < headers.size(); i++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.name(i))) {
                hashSet.add(headers.value(i));
            } else {
                hashMap.put(headers.name(i), headers.value(i));
            }
        }
        hashMap.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        requestApiResponse.cookies = (String[]) hashSet.toArray(new String[0]);
        requestApiResponse.header = hashMap;
        HeadersReceivedEvent headersReceivedEvent = new HeadersReceivedEvent();
        headersReceivedEvent.header = hashMap;
        headersReceivedEvent.header.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        headersReceivedEvent.cookies = new ArrayList();
        headersReceivedEvent.cookies.addAll(hashSet);
        msiContext.dispatchEvent("DownloadTask.onHeadersReceived", headersReceivedEvent, str);
        return requestApiResponse;
    }

    public static /* synthetic */ void a(DownloadApi downloadApi, DownloadProfile downloadProfile, b bVar) {
        long j;
        int i = 2;
        Object[] objArr = {downloadProfile, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, downloadApi, changeQuickRedirect, false, "71b56a6f136293e9ee07535f938427a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, downloadApi, changeQuickRedirect, false, "71b56a6f136293e9ee07535f938427a2");
        } else if (bVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - downloadApi.e;
            long a2 = s.a();
            if (currentTimeMillis != 0) {
                j = (((a2 - downloadApi.f) / 1024) * 1000) / currentTimeMillis;
            } else {
                com.meituan.msi.log.a.a("can not divide by zero");
                j = 0;
            }
            downloadProfile.throughputKbps = j;
            if (j == 0) {
                i = 1;
            } else if (j >= 50) {
                i = j <= 100 ? 3 : j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE ? 4 : j <= 100000 ? 5 : 6;
            }
            downloadProfile.estimate_nettype = i;
            downloadProfile.connectEnd = bVar.g;
            downloadProfile.connectStart = bVar.f;
            downloadProfile.domainLookUpEnd = bVar.e;
            downloadProfile.domainLookUpStart = bVar.d;
            downloadProfile.peerIP = bVar.m;
            downloadProfile.port = bVar.n;
            downloadProfile.requestEnd = bVar.k;
            downloadProfile.requestStart = bVar.j;
            downloadProfile.responseEnd = bVar.l;
            downloadProfile.socketReused = bVar.o;
            downloadProfile.SSLconnectionStart = bVar.h;
            downloadProfile.SSLconnectionEnd = bVar.i;
        }
    }

    @MsiApiMethod(name = "downloadFile", request = DownloadApiParam.class, response = DownloadApiResponse.class)
    public void downloadFile(final DownloadApiParam downloadApiParam, final MsiContext msiContext) {
        Integer num;
        long j;
        Object[] objArr = {downloadApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ca8f9ddbf2826f60ebd6180e46f864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ca8f9ddbf2826f60ebd6180e46f864");
            return;
        }
        final com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
        if (TextUtils.isEmpty(this.d)) {
            this.d = fileProvider.b();
        }
        final String str = downloadApiParam.url;
        Map<String, String> map = downloadApiParam.header;
        String str2 = "";
        if (!TextUtils.isEmpty(downloadApiParam.filePath)) {
            str2 = fileProvider.a(downloadApiParam.filePath);
            if (str2 == null) {
                msiContext.onError(400, "invalid path" + downloadApiParam.filePath);
                return;
            } else if (!com.meituan.msi.util.file.b.a(str2, fileProvider.c())) {
                msiContext.onError(401, "permission denied" + downloadApiParam.filePath);
                return;
            }
        }
        final String str3 = str2;
        long j2 = downloadApiParam.timeout;
        Object[] objArr2 = {msiContext, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9b137daf44de6dd3a6c2c98d455427e", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9b137daf44de6dd3a6c2c98d455427e")).longValue();
        } else if (j2 > 0) {
            j = j2;
        } else {
            j = ((Integer) msiContext.getDefaultValue(DefaultValue.DEFAULT_VALUE_DOWNLOAD_TIMEOUT)) != null ? num.intValue() : LocationStrategy.LOCATION_TIMEOUT;
        }
        final String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        final DownloadOrUploadPerformanceEventInner b = t.b(str);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.d)) {
            msiContext.onError("mTempDir is empty ");
        } else if (HttpUrl.parse(str) == null) {
            msiContext.onError("illegal url");
        } else {
            Request.Builder builder = new Request.Builder();
            if (map != null) {
                builder.headers(Headers.of(map));
            }
            final Request build = builder.url(str).build();
            OkHttpClient.Builder newBuilder = u.a().c().newBuilder();
            if (j > 0) {
                newBuilder.connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS);
            }
            Call newCall = newBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.meituan.msi.api.download.DownloadApi.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) throws IOException {
                    Object[] objArr3 = {chain};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "352ea467ef6261580b9a8f7e90b34b66", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Response) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "352ea467ef6261580b9a8f7e90b34b66");
                    }
                    Response proceed = chain.proceed(chain.request());
                    return proceed.newBuilder().body(new y(msiContext, proceed.body(), new g("DownloadTask.onProgressUpdate", asString, DownloadApi.this.b))).build();
                }
            }).build().newCall(build);
            final HashMap hashMap = new HashMap();
            hashMap.put("url", b.url);
            hashMap.put("urlhost", s.a(b.url));
            hashMap.put("urlpath", s.b(b.url));
            hashMap.put("type", s.a(a.f()));
            newCall.enqueue(new Callback() { // from class: com.meituan.msi.api.download.DownloadApi.2
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    MsiContext msiContext2;
                    String message;
                    Object[] objArr3 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69db6f4ec822473856554815947dee51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69db6f4ec822473856554815947dee51");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(ResponseWithInnerData.TASK_ID, asString);
                    if (iOException != null && TextUtils.equals("Already canceled", iOException.getMessage())) {
                        msiContext2 = msiContext;
                        message = "downloadFile:fail abort";
                    } else {
                        msiContext2 = msiContext;
                        message = iOException == null ? "" : iOException.getMessage();
                    }
                    msiContext2.onError(message, hashMap2);
                    DownloadApi.this.c.remove(asString);
                    c.b(call);
                    t.a(msiContext, b, build, null, elapsedRealtime, "download");
                    hashMap.put("statusCode", -1);
                    hashMap.put("message", iOException.getMessage());
                    com.meituan.msi.log.a.a(hashMap, msiContext.request, "msi.api.network", (int) b.value, 1.0f);
                }

                /* JADX WARN: Type inference failed for: r1v16, types: [T, com.meituan.msi.api.download.DownloadApiResponse] */
                @Override // okhttp3.Callback
                @RequiresApi(api = 19)
                public final void onResponse(Call call, Response response) throws IOException {
                    String str4;
                    boolean z;
                    String str5;
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2bfe8c71249024023182c7991b13ae1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2bfe8c71249024023182c7991b13ae1");
                        return;
                    }
                    DownloadApi.this.e = System.currentTimeMillis();
                    DownloadApi.this.f = s.a();
                    DownloadApi.a(DownloadApi.this, response, asString, msiContext);
                    t.a(msiContext, b, build, response, elapsedRealtime, "download");
                    hashMap.put("statusCode", Integer.valueOf(response.code()));
                    com.meituan.msi.log.a.a(hashMap, msiContext.request, "msi.api.network", (int) b.value, 1.0f);
                    b a2 = c.a(call);
                    c.b(call);
                    String b2 = d.b(response.request().url().encodedPath());
                    if (TextUtils.isEmpty(b2)) {
                        b2 = CommonConstant.Symbol.DOT + o.b(response.header("Content-Type", ""));
                    }
                    File a3 = DownloadApi.this.a(DownloadApi.this.a(str), b2);
                    if (!h.a(response.body().byteStream(), a3)) {
                        a3 = null;
                    }
                    int code = response.code();
                    String path = a3 != null ? a3.getPath() : "";
                    if (a3 != null && a3.exists()) {
                        if (TextUtils.isEmpty(str3)) {
                            str4 = path;
                            z = false;
                        } else {
                            File file = new File(str3);
                            file.delete();
                            z = a3.renameTo(file);
                            str4 = z ? downloadApiParam.filePath : "";
                        }
                        if (z) {
                            path = str4;
                        } else {
                            if (fileProvider instanceof com.meituan.msi.provider.b) {
                                str5 = "tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + fileProvider.a(d.c(a3), 1) + b2;
                            } else {
                                str5 = fileProvider.a(d.c(a3), 0) + b2;
                            }
                            File file2 = new File(DownloadApi.this.d, str5);
                            if (!file2.exists()) {
                                a3.renameTo(file2);
                            } else {
                                a3.delete();
                            }
                            if (fileProvider instanceof com.meituan.msi.provider.b) {
                                path = "msifile://" + file2.getName();
                            } else {
                                path = fileProvider.b(file2.getName());
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(path)) {
                        ?? downloadApiResponse = new DownloadApiResponse();
                        DownloadProfile downloadProfile = new DownloadProfile();
                        DownloadApi.a(DownloadApi.this, downloadProfile, a2);
                        downloadApiResponse.profile = downloadProfile;
                        downloadApiResponse.statusCode = code;
                        if (TextUtils.isEmpty(downloadApiParam.filePath)) {
                            downloadApiResponse.tempFilePath = path;
                        } else {
                            downloadApiResponse.filePath = downloadApiParam.filePath;
                        }
                        ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
                        responseWithInnerData.response = downloadApiResponse;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(ResponseWithInnerData.TASK_ID, asString);
                        responseWithInnerData.innerData = hashMap2;
                        msiContext.onSuccess(responseWithInnerData);
                        DownloadApi.this.c.remove(asString);
                        return;
                    }
                    msiContext.onError("downloadFile failed");
                    DownloadApi.this.c.remove(asString);
                }
            });
            this.c.put(asString, newCall);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ac73e7ca8a88d5333c356091a8b1c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ac73e7ca8a88d5333c356091a8b1c1");
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.toHexString(crc32.getValue());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File a(String str, String str2) {
        File file;
        do {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f2fd976b454b282f5664dd937b8284", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f2fd976b454b282f5664dd937b8284");
            }
            String str3 = this.d;
            file = new File(str3, UUID.randomUUID().toString() + str + str2);
        } while (file.exists());
        return file;
    }

    @MsiApiMethod(name = "DownloadTask.abort")
    public void abort(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534a67128b6e0dc1d83425a01a73145a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534a67128b6e0dc1d83425a01a73145a");
            return;
        }
        String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        if (!this.c.containsKey(asString)) {
            msiContext.onError(400, "taskId 不存在 ");
        } else {
            this.c.get(asString).cancel();
        }
    }

    @MsiApiMethod(name = "DownloadTask")
    public EmptyResponse downloadTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }
}
