package com.meituan.ai.speech.base.net;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.b;
import com.meituan.ai.speech.base.net.data.AuthParams;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlin.reflect.i;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040/H\u0007J\u0018\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020-H\u0007J9\u00105\u001a\u0002062*\u00107\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0/08\"\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0/H\u0007¢\u0006\u0002\u0010;J$\u0010<\u001a\u00020:2\u001a\u0010=\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040/\u0018\u00010>H\u0007J\u0010\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020AH\u0007J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0004H\u0007J<\u0010E\u001a\u00020-2\u0006\u00101\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u001a\u0010I\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040/\u0018\u00010>H\u0007JD\u0010E\u001a\u00020-2\u0006\u00101\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010J\u001a\u00020:2\u0006\u0010G\u001a\u00020H2\u001a\u0010I\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040/\u0018\u00010>H\u0007J\u0010\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#R:\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006M"}, d2 = {"Lcom/meituan/ai/speech/base/net/NetCreator;", "", "()V", "NET_PARAMS_TIMESTAMP", "", "NET_PARAMS_TOKEN", "NET_REQUEST_BODY_STREAM", "authParams", "", "Lcom/meituan/ai/speech/base/net/data/AuthParams;", "getAuthParams", "()Ljava/util/Map;", "mAsrBashUrl", "mClient", "Lokhttp3/OkHttpClient;", "getMClient", "()Lokhttp3/OkHttpClient;", "mClient$delegate", "Lkotlin/Lazy;", "publicParams", "retrofit", "Lcom/sankuai/meituan/retrofit2/Retrofit;", "getRetrofit", "()Lcom/sankuai/meituan/retrofit2/Retrofit;", "retrofit$delegate", "threadPool", "Ljava/util/concurrent/ThreadPoolExecutor;", "kotlin.jvm.PlatformType", "getThreadPool", "()Ljava/util/concurrent/ThreadPoolExecutor;", "threadPool$delegate", "threadQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/lang/Runnable;", "getThreadQueue", "()Ljava/util/concurrent/LinkedBlockingQueue;", "threadQueue$delegate", "tokens", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getTokens", "()Ljava/util/HashMap;", "setTokens", "(Ljava/util/HashMap;)V", "appendPublicParams", "", "param", "Lkotlin/Pair;", "appendToken", "secretKey", "requestBuilder", "Lokhttp3/Request$Builder;", "cancel", "createMultiBody", "Lokhttp3/MultipartBody;", "bodys", "", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "([Lkotlin/Pair;)Lokhttp3/MultipartBody;", "createRequestBody", "params", "", "createStreamBody", "data", "", "getUseNetType", "", "appKey", SocialConstants.TYPE_REQUEST, "url", "callback", "Lokhttp3/Callback;", "headers", "body", "setAsrBaseUrl", "asrBaseUrl", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class NetCreator {
    private static final String NET_PARAMS_TIMESTAMP = "timestamp";
    private static final String NET_PARAMS_TOKEN = "asr-token";
    private static final String NET_REQUEST_BODY_STREAM = "application/octet-stream";
    @Keep
    @NotNull
    private static final Map<String, AuthParams> authParams;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAsrBashUrl;
    private static final Map<String, String> publicParams;
    @Keep
    @NotNull
    private static HashMap<String, String> tokens;
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(NetCreator.class), "mClient", "getMClient()Lokhttp3/OkHttpClient;")), u.a(new s(u.a(NetCreator.class), "retrofit", "getRetrofit()Lcom/sankuai/meituan/retrofit2/Retrofit;")), u.a(new s(u.a(NetCreator.class), "threadQueue", "getThreadQueue()Ljava/util/concurrent/LinkedBlockingQueue;")), u.a(new s(u.a(NetCreator.class), "threadPool", "getThreadPool()Ljava/util/concurrent/ThreadPoolExecutor;"))};
    public static final NetCreator INSTANCE = new NetCreator();
    private static final kotlin.d mClient$delegate = e.a(a.b);
    @NotNull
    private static final kotlin.d retrofit$delegate = e.a(b.b);
    private static final kotlin.d threadQueue$delegate = e.a(d.b);
    private static final kotlin.d threadPool$delegate = e.a(c.b);

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient getMClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (OkHttpClient) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f8479099e2bd06c46529fcadff83593", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f8479099e2bd06c46529fcadff83593") : mClient$delegate.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadPoolExecutor getThreadPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ThreadPoolExecutor) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8cec549b5a644a89448096df5c89eff", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8cec549b5a644a89448096df5c89eff") : threadPool$delegate.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkedBlockingQueue<Runnable> getThreadQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LinkedBlockingQueue) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a06299616d147225feb932fd17d72353", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a06299616d147225feb932fd17d72353") : threadQueue$delegate.a());
    }

    @NotNull
    public final ar getRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ar) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "061bdd785b0abcacb1263029bf0d936e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "061bdd785b0abcacb1263029bf0d936e") : retrofit$delegate.a());
    }

    static {
        b.a aVar = com.meituan.ai.speech.base.net.b.a;
        mAsrBashUrl = "https://asr.meituan.com";
        publicParams = new LinkedHashMap();
        authParams = new LinkedHashMap();
        tokens = new HashMap<>();
    }

    public static final /* synthetic */ String access$getMAsrBashUrl$p(NetCreator netCreator) {
        return mAsrBashUrl;
    }

    @Keep
    public final int getUseNetType(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29c12cbb47cb5cfd7965f14b2eba45fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29c12cbb47cb5cfd7965f14b2eba45fd")).intValue();
        }
        h.b(str, "appKey");
        AuthParams authParams2 = authParams.get(str);
        return (authParams2 == null || !authParams2.isNetWebSocket()) ? 0 : 1;
    }

    @NotNull
    public final Map<String, AuthParams> getAuthParams() {
        return authParams;
    }

    @NotNull
    public final HashMap<String, String> getTokens() {
        return tokens;
    }

    public final void setTokens(@NotNull HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b508e528bc07515e2210ca002edcfdf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b508e528bc07515e2210ca002edcfdf2");
            return;
        }
        h.b(hashMap, "<set-?>");
        tokens = hashMap;
    }

    @Keep
    public final void setAsrBaseUrl(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16221770b48f6b3175eaf0c1b318668c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16221770b48f6b3175eaf0c1b318668c");
            return;
        }
        h.b(str, "asrBaseUrl");
        mAsrBashUrl = str;
    }

    @Keep
    public final void appendPublicParams(@NotNull k<String, String> kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "581ac34c7fc17ee8ab849d378e3b4f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "581ac34c7fc17ee8ab849d378e3b4f3b");
            return;
        }
        h.b(kVar, "param");
        publicParams.put(kVar.a, kVar.b);
        StringBuilder sb = new StringBuilder("[Append Public Param]");
        sb.append(kVar.a);
        sb.append('=');
        sb.append(kVar.b);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName);
            sb2.append(']');
        }
    }

    @Keep
    public final void request(@NotNull String str, @NotNull String str2, @NotNull RequestBody requestBody, @NotNull Callback callback, @Nullable List<k<String, String>> list) {
        Object[] objArr = {str, str2, requestBody, callback, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba2a5d81bab36d54c1e47dd5cc45a556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba2a5d81bab36d54c1e47dd5cc45a556");
            return;
        }
        h.b(str, "secretKey");
        h.b(str2, "url");
        h.b(requestBody, "body");
        h.b(callback, "callback");
        Request.Builder post = new Request.Builder().url(str2).post(requestBody);
        for (Map.Entry<String, String> entry : publicParams.entrySet()) {
            post.addHeader(entry.getKey(), entry.getValue());
        }
        post.addHeader("timestamp", String.valueOf(System.currentTimeMillis()));
        if (list != null) {
            for (k<String, String> kVar : list) {
                post.addHeader(kVar.a, kVar.b);
            }
        }
        h.a((Object) post, "requestBuilder");
        appendToken(str, post);
        "[Request Public Params]Headers=".concat(String.valueOf(post));
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        getMClient().newCall(post.build()).enqueue(callback);
        "[Post Request]url=".concat(String.valueOf(str2));
        String simpleName2 = getClass().getSimpleName();
        h.a((Object) simpleName2, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName2);
            sb2.append(']');
        }
    }

    private final void appendToken(String str, Request.Builder builder) {
        Object[] objArr = {str, builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75e80569c168b83b1b1f156d3b665c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75e80569c168b83b1b1f156d3b665c3b");
            return;
        }
        String str2 = tokens.get(str);
        if (str2 != null) {
            builder.addHeader(NET_PARAMS_TOKEN, str2);
        }
    }

    @Keep
    public final void request(@NotNull String str, @NotNull String str2, @NotNull Callback callback, @Nullable List<k<String, String>> list) {
        Object[] objArr = {str, str2, callback, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96c8a3180404bb65393b4b0b94204219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96c8a3180404bb65393b4b0b94204219");
            return;
        }
        h.b(str, "secretKey");
        h.b(str2, "url");
        h.b(callback, "callback");
        Request.Builder url = new Request.Builder().url(str2);
        for (Map.Entry<String, String> entry : publicParams.entrySet()) {
            url.addHeader(entry.getKey(), entry.getValue());
        }
        url.addHeader("timestamp", String.valueOf(System.currentTimeMillis()));
        if (list != null) {
            for (k<String, String> kVar : list) {
                url.addHeader(kVar.a, kVar.b);
            }
        }
        h.a((Object) url, "requestBuilder");
        appendToken(str, url);
        "[Request Public Params]Headers=".concat(String.valueOf(url));
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        getMClient().newCall(url.build()).enqueue(callback);
        "[Get Request]url=".concat(String.valueOf(str2));
        String simpleName2 = getClass().getSimpleName();
        h.a((Object) simpleName2, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.ERROR.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName2);
            sb2.append(']');
        }
    }

    @Keep
    @NotNull
    public final RequestBody createRequestBody(@Nullable List<k<String, String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "556454def08d335b3a51bd92433da062", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBody) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "556454def08d335b3a51bd92433da062");
        }
        FormBody.Builder builder = new FormBody.Builder();
        if (list != null) {
            for (k<String, String> kVar : list) {
                builder.add(kVar.a, kVar.b);
            }
        }
        "[Create Request Body]=".concat(String.valueOf(builder));
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        FormBody build = builder.build();
        h.a((Object) build, "formBodyBuilder.build()");
        return build;
    }

    @Keep
    @NotNull
    public final RequestBody createStreamBody(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "623f0340f55ab012af688a3cd69416bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBody) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "623f0340f55ab012af688a3cd69416bf");
        }
        h.b(bArr, "data");
        MediaType parse = MediaType.parse(NET_REQUEST_BODY_STREAM);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        RequestBody create = RequestBody.create(parse, bArr);
        h.a((Object) create, "RequestBody.create(type, data)");
        return create;
    }

    @Keep
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36796531e8be5aff935d988e7c94c49d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36796531e8be5aff935d988e7c94c49d");
            return;
        }
        getThreadQueue().clear();
        getMClient().dispatcher().cancelAll();
    }

    @Keep
    @NotNull
    public final MultipartBody createMultiBody(@NotNull k<Headers, ? extends RequestBody>... kVarArr) {
        Object[] objArr = {kVarArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c00ff27e049802fb34f24177f4cee037", RobustBitConfig.DEFAULT_VALUE)) {
            return (MultipartBody) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c00ff27e049802fb34f24177f4cee037");
        }
        h.b(kVarArr, "bodys");
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (k<Headers, ? extends RequestBody> kVar : kVarArr) {
            type.addPart(kVar.a, (RequestBody) kVar.b);
        }
        MultipartBody build = type.build();
        h.a((Object) build, "multipartBodyBuilder.build()");
        return build;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<OkHttpClient> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        public a() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205578256880da9533039d2cf73ce1b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205578256880da9533039d2cf73ce1b2");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            return builder.connectTimeout(15L, TimeUnit.SECONDS).readTimeout(15L, TimeUnit.SECONDS).writeTimeout(15L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/sankuai/meituan/retrofit2/Retrofit;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ar> {
        public static ChangeQuickRedirect a;
        public static final b b = new b();

        public b() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1be4433fb3025b30ae9198dfc143f90", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1be4433fb3025b30ae9198dfc143f90");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ar invoke() {
            com.sankuai.meituan.retrofit2.callfactory.okhttp3.a a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(NetCreator.INSTANCE.getMClient());
            return new ar.a().a(NetCreator.access$getMAsrBashUrl$p(NetCreator.INSTANCE)).a(NetCreator.INSTANCE.getThreadPool()).a(a2).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/lang/Runnable;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<LinkedBlockingQueue<Runnable>> {
        public static ChangeQuickRedirect a;
        public static final d b = new d();

        public d() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ff6626ccc0af620aaf25e8b50ec41a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ff6626ccc0af620aaf25e8b50ec41a");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ LinkedBlockingQueue<Runnable> invoke() {
            return new LinkedBlockingQueue<>();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ThreadPoolExecutor> {
        public static ChangeQuickRedirect a;
        public static final c b = new c();

        public c() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b9ace690b41b1ce574077b9993d4af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b9ace690b41b1ce574077b9993d4af");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ThreadPoolExecutor invoke() {
            return com.sankuai.android.jarvis.c.a("SpeechBase-getToken", 5, 10, 60L, TimeUnit.SECONDS, NetCreator.INSTANCE.getThreadQueue());
        }
    }
}
