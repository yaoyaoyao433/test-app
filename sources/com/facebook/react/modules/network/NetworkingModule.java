package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
@ReactModule(name = NetworkingModule.NAME)
/* loaded from: classes.dex */
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final int FETCH_TYPE_BIZ = 2;
    public static final int FETCH_TYPE_RN = 1;
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    @Nullable
    private static a customClientBuilder;
    private final OkHttpClient mClient;
    private final com.facebook.react.modules.network.c mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    @Nullable
    private final String mDefaultUserAgent;
    private final List<b> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<c> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<d> mUriHandlers;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        RequestBody a(ReadableMap readableMap, String str);

        boolean a(ReadableMap readableMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        WritableMap a(ResponseBody responseBody) throws IOException;

        boolean a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(Uri uri, String str);

        WritableMap b(Uri uri, String str) throws IOException;
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    @ReactMethod
    public final void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public final String getName() {
        return NAME;
    }

    @ReactMethod
    public final void removeListeners(double d2) {
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient, @Nullable List<f> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (f fVar : list) {
                newBuilder.addNetworkInterceptor(fVar.a());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new com.facebook.react.modules.network.c(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, h.a(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<f> list) {
        this(reactApplicationContext, null, h.a(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, h.a(reactApplicationContext), null);
    }

    public static void setCustomClientBuilder(a aVar) {
        customClientBuilder = aVar;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void initialize() {
        this.mCookieJarContainer.a(new e(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        com.facebook.react.modules.network.c cVar = this.mCookieHandler;
        if (com.facebook.react.modules.network.c.a) {
            CookieManager a2 = cVar.a();
            if (a2 != null) {
                a2.removeExpiredCookie();
            }
            cVar.b.b();
        }
        this.mCookieJarContainer.a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public final void addUriHandler(d dVar) {
        this.mUriHandlers.add(dVar);
    }

    public final void addRequestBodyHandler(b bVar) {
        this.mRequestBodyHandlers.add(bVar);
    }

    public final void addResponseHandler(c cVar) {
        this.mResponseHandlers.add(cVar);
    }

    public final void removeUriHandler(d dVar) {
        this.mUriHandlers.remove(dVar);
    }

    public final void removeRequestBodyHandler(b bVar) {
        this.mRequestBodyHandlers.remove(bVar);
    }

    public final void removeResponseHandler(c cVar) {
        this.mResponseHandlers.remove(cVar);
    }

    @ReactMethod
    public final void sendRequest(String str, String str2, double d2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d3, boolean z2) {
        int i = (int) d2;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d3, z2, "", 1);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d(TAG, "Failed to send url request: " + str2, th);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                o.a(eventEmitter, i, th.getMessage(), th);
            }
        }
    }

    @ReactMethod
    public final void sendRequestWithSceneToken(String str, String str2, double d2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d3, boolean z2, String str4) {
        int i = (int) d2;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d3, z2, str4, 2);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d(TAG, "Failed to send url request: " + str2, th);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                o.a(eventEmitter, i, th.getMessage(), th);
            }
        }
    }

    public final void sendRequestInternal(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z, int i2, boolean z2, String str4, int i3) {
        b bVar;
        RequestBody a2;
        Charset charset;
        final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (d dVar : this.mUriHandlers) {
                if (dVar.a(parse, str3)) {
                    com.facebook.common.logging.a.b("[NetworkingModule@sendRequestInternal]", "none http request, : " + str2);
                    if (i3 == 2) {
                        o.a(eventEmitter, i, dVar.b(parse, str4));
                        o.a(eventEmitter, i);
                        return;
                    }
                    o.a(eventEmitter, i, "fetch by rn, none-http request, permission denied", null);
                    com.facebook.common.logging.a.d("[NetworkingModule@sendRequestInternal]", "fetch by rn, none-http request, permission denied" + str2);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                applyCustomBuilder(newBuilder);
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule.1
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Response proceed = chain.proceed(chain.request());
                            return proceed.newBuilder().body(new k(proceed.body(), new i() { // from class: com.facebook.react.modules.network.NetworkingModule.1.1
                                long a = System.nanoTime();

                                @Override // com.facebook.react.modules.network.i
                                public final void a(long j, long j2, boolean z3) {
                                    long nanoTime = System.nanoTime();
                                    if ((z3 || NetworkingModule.shouldDispatch(nanoTime, this.a)) && !str3.equals("text")) {
                                        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = eventEmitter;
                                        int i4 = i;
                                        WritableArray createArray = Arguments.createArray();
                                        createArray.pushInt(i4);
                                        createArray.pushInt((int) j);
                                        createArray.pushInt((int) j2);
                                        if (rCTDeviceEventEmitter != null) {
                                            rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", createArray);
                                        }
                                        this.a = nanoTime;
                                    }
                                }
                            })).build();
                        }
                    });
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout(i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    o.a(eventEmitter, i, "Unrecognized headers format", null);
                    return;
                }
                String str5 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str6 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<b> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        bVar = it.next();
                        if (bVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                bVar = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals(PicassoBounceOnTouchListener.HEAD_BOUNCE)) {
                    a2 = n.a(str);
                } else if (bVar != null) {
                    a2 = bVar.a(readableMap, str5);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                    if (str5 == null) {
                        o.a(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                    MediaType parse2 = MediaType.parse(str5);
                    if ("gzip".equalsIgnoreCase(str6)) {
                        a2 = n.a(parse2, string);
                        if (a2 == null) {
                            o.a(eventEmitter, i, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        if (parse2 == null) {
                            charset = com.facebook.react.common.f.a;
                        } else {
                            charset = parse2.charset(com.facebook.react.common.f.a);
                        }
                        a2 = RequestBody.create(parse2, string.getBytes(charset));
                    }
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                    if (str5 == null) {
                        o.a(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    a2 = RequestBody.create(MediaType.parse(str5), okio.f.b(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                } else if (readableMap.hasKey("uri")) {
                    if (str5 == null) {
                        o.a(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString("uri");
                    InputStream a3 = n.a(getReactApplicationContext(), string2, str4, i3);
                    if (a3 == null) {
                        o.a(eventEmitter, i, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    a2 = n.a(MediaType.parse(str5), a3);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                    if (str5 == null) {
                        str5 = "multipart/form-data";
                    }
                    MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str5, i, str4, i3);
                    if (constructMultipartBody == null) {
                        return;
                    }
                    a2 = constructMultipartBody.build();
                } else {
                    a2 = n.a(str);
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(a2, eventEmitter, i));
                addRequest(i);
                build.newCall(url.build()).enqueue(new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                    @Override // okhttp3.Callback
                    public final void onFailure(Call call, IOException iOException) {
                        String str7;
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i);
                        if (iOException.getMessage() != null) {
                            str7 = iOException.getMessage();
                        } else {
                            str7 = "Error while executing request: " + iOException.getClass().getSimpleName();
                        }
                        o.a(eventEmitter, i, str7, iOException);
                    }

                    @Override // okhttp3.Callback
                    public final void onResponse(Call call, Response response) throws IOException {
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i);
                        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = eventEmitter;
                        int i4 = i;
                        int code = response.code();
                        WritableMap translateHeaders = NetworkingModule.translateHeaders(response.headers());
                        String httpUrl = response.request().url().toString();
                        WritableArray createArray = Arguments.createArray();
                        createArray.pushInt(i4);
                        createArray.pushInt(code);
                        createArray.pushMap(translateHeaders);
                        createArray.pushString(httpUrl);
                        if (rCTDeviceEventEmitter != null) {
                            rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", createArray);
                        }
                        try {
                            ResponseBody body = response.body();
                            if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                                okio.k kVar = new okio.k(body.source());
                                String header = response.header("Content-Type");
                                body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1L, okio.m.a(kVar));
                            }
                            for (c cVar : NetworkingModule.this.mResponseHandlers) {
                                if (cVar.a(str3)) {
                                    o.a(eventEmitter, i, cVar.a(body));
                                    o.a(eventEmitter, i);
                                    return;
                                }
                            }
                            if (z && str3.equals("text")) {
                                NetworkingModule.this.readWithProgress(eventEmitter, i, body);
                                o.a(eventEmitter, i);
                                return;
                            }
                            String str7 = "";
                            if (str3.equals("text")) {
                                try {
                                    str7 = body.string();
                                } catch (IOException e) {
                                    if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                        o.a(eventEmitter, i, e.getMessage(), e);
                                    }
                                }
                            } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                str7 = Base64.encodeToString(body.bytes(), 2);
                            }
                            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = eventEmitter;
                            int i5 = i;
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushInt(i5);
                            createArray2.pushString(str7);
                            if (rCTDeviceEventEmitter2 != null) {
                                rCTDeviceEventEmitter2.emit("didReceiveNetworkData", createArray2);
                            }
                            o.a(eventEmitter, i);
                        } catch (IOException e2) {
                            o.a(eventEmitter, i, e2.getMessage(), e2);
                        }
                    }
                });
            } catch (Exception e) {
                o.a(eventEmitter, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            o.a(eventEmitter, i, e2.getMessage(), e2);
        }
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, final int i) {
        if (requestBody == null) {
            return null;
        }
        return new j(requestBody, new i() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            long a = System.nanoTime();

            @Override // com.facebook.react.modules.network.i
            public final void a(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.a)) {
                    DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = rCTDeviceEventEmitter;
                    int i2 = i;
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    createArray.pushInt((int) j);
                    createArray.pushInt((int) j2);
                    if (rCTDeviceEventEmitter2 != null) {
                        rCTDeviceEventEmitter2.emit("didSendNetworkData", createArray);
                    }
                    this.a = nanoTime;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) throws IOException {
        long j;
        long j2 = -1;
        try {
            k kVar = (k) responseBody;
            j = kVar.a;
            try {
                j2 = kVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        l lVar = new l(responseBody.contentType() == null ? com.facebook.react.common.f.a : responseBody.contentType().charset(com.facebook.react.common.f.a));
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    return;
                }
                String a2 = lVar.a(bArr, read);
                WritableArray createArray = Arguments.createArray();
                createArray.pushInt(i);
                createArray.pushString(a2);
                createArray.pushInt((int) j);
                createArray.pushInt((int) j2);
                if (rCTDeviceEventEmitter != null) {
                    rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", createArray);
                }
            }
        } finally {
            byteStream.close();
        }
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (bundle.containsKey(name)) {
                bundle.putString(name, bundle.getString(name) + ", " + headers.value(i));
            } else {
                bundle.putString(name, headers.value(i));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    @ReactMethod
    public final void abortRequest(double d2) {
        int i = (int) d2;
        cancelRequest(i);
        removeRequest(i);
    }

    private void cancelRequest(final int i) {
        com.sankuai.waimai.launcher.util.aop.b.a(new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                OkHttpClient okHttpClient = NetworkingModule.this.mClient;
                Integer valueOf = Integer.valueOf(i);
                for (Call call : okHttpClient.dispatcher().queuedCalls()) {
                    if (valueOf.equals(call.request().tag())) {
                        call.cancel();
                        return;
                    }
                }
                for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
                    if (valueOf.equals(call2.request().tag())) {
                        call2.cancel();
                        return;
                    }
                }
            }
        }, new Void[0]);
    }

    @ReactMethod
    public final void clearCookies(final com.facebook.react.bridge.Callback callback) {
        final com.facebook.react.modules.network.c cVar = this.mCookieHandler;
        if (com.facebook.react.modules.network.c.a) {
            com.sankuai.waimai.launcher.util.aop.b.a(new GuardedResultAsyncTask<Boolean>(cVar.c) { // from class: com.facebook.react.modules.network.c.1
                @Override // com.facebook.react.bridge.GuardedResultAsyncTask
                public final /* synthetic */ void onPostExecuteGuarded(Boolean bool) {
                    callback.invoke(bool);
                }

                @Override // com.facebook.react.bridge.GuardedResultAsyncTask
                public final /* synthetic */ Boolean doInBackgroundGuarded() {
                    CookieManager a2 = cVar.a();
                    if (a2 != null) {
                        a2.removeAllCookie();
                    }
                    cVar.b.a();
                    return Boolean.TRUE;
                }
            }, new Void[0]);
            return;
        }
        CookieManager a2 = cVar.a();
        if (a2 != null) {
            a2.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.facebook.react.modules.network.c.2
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    cVar.b.a();
                    callback.invoke(bool);
                }
            });
        }
    }

    @Nullable
    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i, String str2, int i2) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ReadableMap map = readableArray.getMap(i3);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                o.a(eventEmitter, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str3 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str3 != null) {
                mediaType = MediaType.parse(str3);
                extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey("uri")) {
                o.a(eventEmitter, i, "Unrecognized FormData part.", null);
            } else if (mediaType == null) {
                o.a(eventEmitter, i, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString("uri");
                InputStream a2 = n.a(getReactApplicationContext(), string, str2, i2);
                if (a2 == null) {
                    o.a(eventEmitter, i, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(extractHeaders, n.a(mediaType, a2));
            }
        }
        return builder;
    }

    @Nullable
    private Headers extractHeaders(@Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap) {
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ReadableArray array = readableArray.getArray(i2);
            if (array == null || array.size() != 2) {
                return null;
            }
            String string = array.getString(i);
            StringBuilder sb = new StringBuilder(string.length());
            int length = string.length();
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = string.charAt(i3);
                if (charAt <= ' ' || charAt >= 127) {
                    z = true;
                } else {
                    sb.append(charAt);
                }
            }
            if (z) {
                string = sb.toString();
            }
            String a2 = com.facebook.react.modules.network.d.a(array.getString(1));
            if (string == null || a2 == null) {
                return null;
            }
            builder.add(string, a2);
            i2++;
            i = 0;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && this.mDefaultUserAgent != null) {
            builder.add(USER_AGENT_HEADER_NAME, this.mDefaultUserAgent);
        }
        if (!(readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING))) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }
}
