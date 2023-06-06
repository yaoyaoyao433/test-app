package com.meituan.msi.api.upload;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiGray;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.download.DownloadOrUploadPerformanceEventInner;
import com.meituan.msi.api.network.HeadersReceivedEvent;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ProgressUpdateEvent;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.ab;
import com.meituan.msi.util.o;
import com.meituan.msi.util.s;
import com.meituan.msi.util.t;
import com.meituan.msi.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* compiled from: ProGuard */
@MsiApiGray(graySwitchName = "api_upload")
/* loaded from: classes3.dex */
public class UploadApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final Map<String, Call> c;

    @MsiApiMethod(isCallback = true, name = "UploadTask.offHeadersReceived")
    public void offHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.offProgressUpdate")
    public void offProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.onHeadersReceived", response = HeadersReceivedEvent.class)
    public void onHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.onProgressUpdate", response = ProgressUpdateEvent.class)
    public void onUploadFileProgressUpdate(MsiContext msiContext) {
    }

    public UploadApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984b1b284ef7126eac732ac47a547148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984b1b284ef7126eac732ac47a547148");
            return;
        }
        this.b = a.f();
        this.c = new ConcurrentHashMap();
    }

    @MsiApiMethod(name = "uploadFile", request = UploadApiParam.class, response = UploadApiResponse.class)
    public void uploadFile(UploadApiParam uploadApiParam, final MsiContext msiContext) {
        Integer num;
        long j;
        Object[] objArr = {uploadApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4037df26e4070c82e9a699d68b95ca36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4037df26e4070c82e9a699d68b95ca36");
            return;
        }
        String str = uploadApiParam.url;
        String str2 = uploadApiParam.filePath;
        String str3 = uploadApiParam.name;
        long j2 = uploadApiParam.timeout;
        Object[] objArr2 = {msiContext, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be8fe5bb8831d56756a2fa4eb133c194", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be8fe5bb8831d56756a2fa4eb133c194")).longValue();
        } else if (j2 > 0) {
            j = j2;
        } else {
            j = ((Integer) msiContext.getDefaultValue(DefaultValue.DEFAULT_VALUE_UPLOAD_TIMEOUT)) != null ? num.intValue() : LocationStrategy.LOCATION_TIMEOUT;
        }
        final String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        final DownloadOrUploadPerformanceEventInner b = t.b(str);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String a2 = msiContext.getFileProvider().a(str2);
        File file = new File(a2);
        if (!file.exists()) {
            msiContext.onError(400, "file not exist " + a2);
            return;
        }
        Headers build = uploadApiParam.header == null ? new Headers.Builder().build() : Headers.of(uploadApiParam.header);
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        Map<String, String> map = uploadApiParam.formData;
        if (map != null) {
            for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<String, String> next = it.next();
                builder.addFormDataPart(next.getKey(), next.getValue());
            }
        }
        builder.addFormDataPart(str3, file.getName(), RequestBody.create(MediaType.parse(o.a(a2)), file));
        final Request build2 = new Request.Builder().headers(build).url(str).post(builder.build()).build();
        OkHttpClient c = com.meituan.msi.util.network.a.a().c();
        if (j > 0) {
            c = c.newBuilder().connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).build();
        }
        OkHttpClient build3 = c.newBuilder().addNetworkInterceptor(new Interceptor() { // from class: com.meituan.msi.api.upload.UploadApi.1
            public static ChangeQuickRedirect a;

            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) throws IOException {
                Object[] objArr3 = {chain};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea1c72573e3ba0aea8c90dd7899f833a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Response) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea1c72573e3ba0aea8c90dd7899f833a");
                }
                Request request = chain.request();
                return chain.proceed(request.newBuilder().post(new x(msiContext, request.body(), new ab("UploadTask.onProgressUpdate", asString, UploadApi.this.b))).build());
            }
        }).build();
        final HashMap hashMap = new HashMap();
        hashMap.put("url", b.url);
        hashMap.put("urlhost", s.a(b.url));
        hashMap.put("urlpath", s.b(b.url));
        hashMap.put("type", s.a(a.f()));
        Call newCall = build3.newCall(build2);
        newCall.enqueue(new Callback() { // from class: com.meituan.msi.api.upload.UploadApi.2
            public static ChangeQuickRedirect a;

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                MsiContext msiContext2;
                String message;
                Object[] objArr3 = {call, iOException};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5beff0cee0e8824ae34581509ca61ea7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5beff0cee0e8824ae34581509ca61ea7");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ResponseWithInnerData.TASK_ID, asString);
                if (iOException != null && TextUtils.equals("Already canceled", iOException.getMessage())) {
                    msiContext2 = msiContext;
                    message = "uploadFile:fail abort";
                } else {
                    msiContext2 = msiContext;
                    message = iOException == null ? "" : iOException.getMessage();
                }
                msiContext2.onError(message, hashMap2);
                UploadApi.this.c.remove(asString);
                t.a(msiContext, b, build2, null, elapsedRealtime, "upload");
                hashMap.put("statusCode", -1);
                hashMap.put("message", iOException.getMessage());
                com.meituan.msi.log.a.a(hashMap, msiContext.request, "msi.api.network", (int) b.value, 1.0f);
            }

            /* JADX WARN: Type inference failed for: r11v6, types: [T, com.meituan.msi.api.upload.UploadApiResponse] */
            @Override // okhttp3.Callback
            @RequiresApi(api = 19)
            public final void onResponse(Call call, Response response) throws IOException {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c28da9134f5c0ff6b95847298f198ea8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c28da9134f5c0ff6b95847298f198ea8");
                    return;
                }
                HeadersReceivedEvent headersReceivedEvent = new HeadersReceivedEvent();
                headersReceivedEvent.header = new HashMap();
                Headers headers = response.headers();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < headers.size(); i++) {
                    if ("Set-Cookie".equalsIgnoreCase(headers.name(i))) {
                        arrayList.add(t.a(headers.value(i)));
                    } else {
                        headersReceivedEvent.header.put(headers.name(i), t.a(headers.value(i)));
                    }
                }
                headersReceivedEvent.header.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, arrayList));
                headersReceivedEvent.cookies = arrayList;
                msiContext.dispatchEvent("UploadTask.onHeadersReceived", headersReceivedEvent, asString);
                t.a(msiContext, b, build2, response, elapsedRealtime, "upload");
                hashMap.put("statusCode", Integer.valueOf(response.code()));
                com.meituan.msi.log.a.a(hashMap, msiContext.request, "msi.api.network", (int) b.value, 1.0f);
                ?? uploadApiResponse = new UploadApiResponse();
                uploadApiResponse.statusCode = response.code();
                uploadApiResponse.data = response.body() != null ? response.body().string() : null;
                ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
                responseWithInnerData.response = uploadApiResponse;
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ResponseWithInnerData.TASK_ID, asString);
                responseWithInnerData.innerData = hashMap2;
                msiContext.onSuccess(responseWithInnerData);
                UploadApi.this.c.remove(asString);
            }
        });
        this.c.put(asString, newCall);
    }

    @MsiApiMethod(name = "UploadTask.abort")
    public void abort(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b2461dcfee80187a9283f7dc56070b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b2461dcfee80187a9283f7dc56070b");
            return;
        }
        String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        if (!this.c.containsKey(asString)) {
            msiContext.onError(400, "taskId 不存在 ");
        } else {
            this.c.get(asString).cancel();
        }
    }

    @MsiApiMethod(name = "UploadTask")
    public EmptyResponse uploadTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }
}
