package com.meituan.ai.speech.base.net.base;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.ai.speech.base.log.CatMonitor;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.data.AuthParams;
import com.meituan.ai.speech.base.net.data.AuthResult;
import com.meituan.ai.speech.base.net.data.BaseResult;
import com.meituan.ai.speech.base.net.data.IResult;
import com.meituan.ai.speech.base.net.service.AuthService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.q;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\"\u001a\u0002H#\"\n\b\u0002\u0010#\u0018\u0001*\u00028\u0000H\u0085\b¢\u0006\u0002\u0010\u001cJ\u001e\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0013H%J&\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0018\u00010%2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0013H%J\b\u0010+\u001a\u00020\tH\u0016J\b\u0010,\u001a\u00020\u0013H'J\r\u0010-\u001a\u00028\u0000H%¢\u0006\u0002\u0010\u001cJD\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0018\u00010%2\u0014\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0018\u0001042\u0006\u0010*\u001a\u00020\u0013H\u0015J \u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0013H\u0002J&\u00108\u001a\u00020/2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0002J\u001e\u0010;\u001a\u00020/2\u0006\u0010)\u001a\u00020\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0007J\u001e\u0010<\u001a\u00020/2\u0006\u0010)\u001a\u00020\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0007J\u0084\u0001\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\u00132\"\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130Bj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013`C2\"\u0010D\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130Bj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013`C2\b\u0010E\u001a\u0004\u0018\u00010\u0013H\u0002R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/meituan/ai/speech/base/net/base/BaseRequest;", "S", "R", "Lcom/meituan/ai/speech/base/net/data/IResult;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "catSamplingRate", "", "getCatSamplingRate", "()I", "getContext", "()Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "requestName", "", "getRequestName", "()Ljava/lang/String;", "requestTokenCount", "getRequestTokenCount", "setRequestTokenCount", "(I)V", "service", "getService", "()Ljava/lang/Object;", "setService", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "useBA", "", "createService", "T", "initCall", "Lcom/sankuai/meituan/retrofit2/Call;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "token", "initCallBA", "appKey", "secretKey", "initCatSampleRate", "initRequestName", "initService", "postPrivateMonitor", "", "requestTime", "", "call", "response", "Lcom/sankuai/meituan/retrofit2/Response;", "postResponseMonitor", "responseTime", "responseBytes", "realRequest", "callback", "Lcom/meituan/ai/speech/base/net/base/ICallback;", SocialConstants.TYPE_REQUEST, "requestToken", "uploadCat", "code", "requestBytes", "url", "headerReq", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headerResp", "extend", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public abstract class BaseRequest<S, R extends IResult> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    private final int catSamplingRate;
    @NotNull
    private final Context context;
    @Keep
    @NotNull
    private final Gson gson;
    @Keep
    @NotNull
    private final String requestName;
    private int requestTokenCount;
    @Keep
    @Nullable
    private S service;
    private boolean useBA;

    @Keep
    @Nullable
    public abstract Call<BaseResult<R>> initCall(@NotNull String str);

    @Keep
    @Nullable
    public abstract Call<BaseResult<R>> initCallBA(@NotNull String str, @NotNull String str2);

    public int initCatSampleRate() {
        return 100;
    }

    @Keep
    @NotNull
    public abstract String initRequestName();

    @Keep
    public abstract S initService();

    @Keep
    public void postPrivateMonitor(long j, @Nullable Call<BaseResult<R>> call, @Nullable Response<BaseResult<R>> response, @NotNull String str) {
        Object[] objArr = {new Long(j), call, response, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08e933290e68aae1020b8f91ab186110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08e933290e68aae1020b8f91ab186110");
        } else {
            h.b(str, "secretKey");
        }
    }

    public BaseRequest(@NotNull Context context) {
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8fe04262ba0303f4275e9fc7f76939e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8fe04262ba0303f4275e9fc7f76939e");
            return;
        }
        this.context = context;
        this.requestName = initRequestName();
        this.catSamplingRate = initCatSampleRate();
        this.gson = new Gson();
        this.useBA = true;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final S getService() {
        return this.service;
    }

    public final void setService(@Nullable S s) {
        this.service = s;
    }

    @NotNull
    public final String getRequestName() {
        return this.requestName;
    }

    public final int getCatSamplingRate() {
        return this.catSamplingRate;
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    public final int getRequestTokenCount() {
        return this.requestTokenCount;
    }

    public final void setRequestTokenCount(int i) {
        this.requestTokenCount = i;
    }

    @Keep
    public final void request(@NotNull String str, @NotNull ICallback<R> iCallback) {
        Object[] objArr = {str, iCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa5aa98a8848850526f4feb6c3a5b158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa5aa98a8848850526f4feb6c3a5b158");
            return;
        }
        h.b(str, "appKey");
        h.b(iCallback, "callback");
        if (this.useBA) {
            realRequest("", str, iCallback);
        } else {
            requestToken(str, iCallback);
        }
    }

    @Keep
    public final void requestToken(@NotNull String str, @NotNull ICallback<R> iCallback) {
        Object[] objArr = {str, iCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e5246a92800cbadef832ebc37af40d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e5246a92800cbadef832ebc37af40d9");
            return;
        }
        h.b(str, "appKey");
        h.b(iCallback, "callback");
        String str2 = NetCreator.INSTANCE.getTokens().get(str);
        if (str2 == null) {
            AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str);
            if (authParams == null) {
                iCallback.onFailed(com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.O);
                return;
            }
            com.meituan.ai.speech.base.net.a aVar = new com.meituan.ai.speech.base.net.a();
            String appKey = authParams.getAppKey();
            String secretKey = authParams.getSecretKey();
            b bVar = new b(iCallback, str);
            h.b(appKey, "clientId");
            h.b(secretKey, "clientSecret");
            h.b(bVar, "callback");
            HashMap hashMap = new HashMap();
            hashMap.put("grant_type", "client_credentials");
            hashMap.put(Constants.PARAM_CLIENT_ID, appKey);
            hashMap.put("client_secret", secretKey);
            ((AuthService) ((ar) aVar.c.a()).a(AuthService.class)).getToken(hashMap, System.currentTimeMillis()).a(bVar);
            return;
        }
        realRequest(str2, str, iCallback);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J4\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/meituan/ai/speech/base/net/base/BaseRequest$requestToken$1", "Lcom/sankuai/meituan/retrofit2/Callback;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "Lcom/meituan/ai/speech/base/net/data/AuthResult;", "onFailure", "", "call", "Lcom/sankuai/meituan/retrofit2/Call;", "t", "", "onResponse", "response", "Lcom/sankuai/meituan/retrofit2/Response;", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b implements f<BaseResult<AuthResult>> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ICallback c;
        public final /* synthetic */ String d;

        public b(ICallback iCallback, String str) {
            this.c = iCallback;
            this.d = str;
            Object[] objArr = {BaseRequest.this, iCallback, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476f646dac4dfb5f9383beb96b25414e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476f646dac4dfb5f9383beb96b25414e");
            }
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onFailure(@Nullable Call<BaseResult<AuthResult>> call, @Nullable Throwable th) {
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e79bec8ddff1703a2701f5b66b63ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e79bec8ddff1703a2701f5b66b63ce");
            } else {
                this.c.onFailed(com.meituan.ai.speech.base.net.base.a.RETROFIT_REQUEST_FAILED.N, th != null ? th.getMessage() : null);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onResponse(@Nullable Call<BaseResult<AuthResult>> call, @Nullable Response<BaseResult<AuthResult>> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3af7157431741ff6012be666f21980", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3af7157431741ff6012be666f21980");
            } else if (response == null) {
                this.c.onFailed(com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.O);
            } else if (response.b() == 200) {
                BaseResult<AuthResult> e = response.e();
                if (e.getCode() == 0) {
                    AuthResult data = e.getData();
                    if (data == null) {
                        this.c.onFailed(com.meituan.ai.speech.base.net.base.a.DATA_OF_BODY_IS_NULL_IN_RESPONSE.N, com.meituan.ai.speech.base.net.base.a.DATA_OF_BODY_IS_NULL_IN_RESPONSE.O);
                        return;
                    } else if (data.getAccess_token() == null) {
                        this.c.onFailed(com.meituan.ai.speech.base.net.base.a.TOKEN_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.TOKEN_IS_NULL.O);
                        return;
                    } else {
                        HashMap<String, String> tokens = NetCreator.INSTANCE.getTokens();
                        String str = this.d;
                        String access_token = data.getAccess_token();
                        if (access_token == null) {
                            h.a();
                        }
                        tokens.put(str, access_token);
                        BaseRequest baseRequest = BaseRequest.this;
                        String access_token2 = data.getAccess_token();
                        if (access_token2 == null) {
                            h.a();
                        }
                        baseRequest.realRequest(access_token2, this.d, this.c);
                        return;
                    }
                }
                ICallback iCallback = this.c;
                int code = e.getCode();
                iCallback.onFailed(code, "请求失败，code=" + e.getCode() + ",message=" + e.getMsg());
            } else {
                ICallback iCallback2 = this.c;
                int b = response.b();
                iCallback2.onFailed(b, "网络错误，code=" + response.b() + ",message=" + response.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void realRequest(String str, String str2, ICallback<R> iCallback) {
        Object[] objArr = {str, str2, iCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "324b33b03cd27ba39566f835afa6a731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "324b33b03cd27ba39566f835afa6a731");
            return;
        }
        AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str2);
        String secretKey = authParams != null ? authParams.getSecretKey() : null;
        if (secretKey == null) {
            iCallback.onFailed(com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.O);
            return;
        }
        this.service = initService();
        Call<BaseResult<R>> initCallBA = this.useBA ? initCallBA(str2, secretKey) : initCall(str);
        if (initCallBA != null) {
            initCallBA.a(new a(secretKey, iCallback, str2));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J(\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J4\u0010\t\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/meituan/ai/speech/base/net/base/BaseRequest$realRequest$1", "Lcom/sankuai/meituan/retrofit2/Callback;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "onFailure", "", "call", "Lcom/sankuai/meituan/retrofit2/Call;", "t", "", "onResponse", "response", "Lcom/sankuai/meituan/retrofit2/Response;", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a implements f<BaseResult<R>> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String c;
        public final /* synthetic */ ICallback d;
        public final /* synthetic */ String e;

        public a(String str, ICallback iCallback, String str2) {
            this.c = str;
            this.d = iCallback;
            this.e = str2;
            Object[] objArr = {BaseRequest.this, str, iCallback, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a1610d6fad8cd11b977202559b3f78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a1610d6fad8cd11b977202559b3f78");
            }
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onFailure(@Nullable Call<BaseResult<R>> call, @Nullable Throwable th) {
            aj e;
            aj e2;
            List<q> d;
            aj e3;
            ak i;
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ef07bd3b3293e4a55b86262bd7083a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ef07bd3b3293e4a55b86262bd7083a");
                return;
            }
            StringBuilder sb = new StringBuilder("[Request]Failed!message = ");
            sb.append(th != null ? th.getMessage() : null);
            String sb2 = sb.toString();
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', sb2);
            }
            Integer valueOf = (call == null || (e3 = call.e()) == null || (i = e3.i()) == null) ? null : Integer.valueOf((int) i.contentLength());
            if (valueOf == null) {
                h.a();
            }
            int intValue = valueOf.intValue();
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (call != null && (e2 = call.e()) != null && (d = e2.d()) != null) {
                for (q qVar : d) {
                    h.a((Object) qVar, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
                    String a2 = qVar.a();
                    h.a((Object) a2, "header.name");
                    String b = qVar.b();
                    h.a((Object) b, "header.value");
                    hashMap.put(a2, b);
                }
            }
            String str = (String) hashMap.get("request-time");
            Long valueOf2 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            BaseRequest baseRequest = BaseRequest.this;
            int i2 = com.meituan.ai.speech.base.net.base.a.RETROFIT_REQUEST_FAILED.N;
            int longValue = (int) (currentTimeMillis - (valueOf2 != null ? valueOf2.longValue() : 0L));
            String b2 = (call == null || (e = call.e()) == null) ? null : e.b();
            HashMap hashMap2 = new HashMap();
            StringBuilder sb3 = new StringBuilder("app_key=");
            sb3.append(this.c);
            sb3.append(" msg=");
            sb3.append(th != null ? th.getMessage() : null);
            baseRequest.uploadCat(i2, intValue, 0, longValue, b2, hashMap, hashMap2, sb3.toString());
            this.d.onFailed(com.meituan.ai.speech.base.net.base.a.RETROFIT_REQUEST_FAILED.N, th != null ? th.getMessage() : null);
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onResponse(@Nullable Call<BaseResult<R>> call, @Nullable Response<BaseResult<R>> response) {
            int i;
            StackTraceElement[] stackTrace;
            BaseResult<R> e;
            List<q> d;
            aj e2;
            ak i2;
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d40898b3741a81162513c2d954c89d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d40898b3741a81162513c2d954c89d");
            } else if (response == null) {
                BaseRequest.this.setRequestTokenCount(0);
                this.d.onFailed(com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.O);
            } else if (response.b() != 200) {
                BaseRequest.this.setRequestTokenCount(0);
                this.d.onFailed(response.b(), "网络错误，code=" + response.b() + ",message=" + response.c());
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                Integer valueOf = (call == null || (e2 = call.e()) == null || (i2 = e2.i()) == null) ? null : Integer.valueOf((int) i2.contentLength());
                if (valueOf == null) {
                    h.a();
                }
                int intValue = valueOf.intValue();
                HashMap hashMap = new HashMap();
                List<q> d2 = response.d();
                if (d2 != null) {
                    int i3 = 0;
                    for (q qVar : d2) {
                        h.a((Object) qVar, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
                        String a2 = qVar.a();
                        h.a((Object) a2, "header.name");
                        String b = qVar.b();
                        h.a((Object) b, "header.value");
                        hashMap.put(a2, b);
                        if (h.a((Object) qVar.a(), (Object) "Content-Length")) {
                            String b2 = qVar.b();
                            h.a((Object) b2, "header.value");
                            i3 = Integer.parseInt(b2);
                        }
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                HashMap hashMap2 = new HashMap();
                aj e3 = call.e();
                if (e3 != null && (d = e3.d()) != null) {
                    for (q qVar2 : d) {
                        h.a((Object) qVar2, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
                        String a3 = qVar2.a();
                        h.a((Object) a3, "header.name");
                        String b3 = qVar2.b();
                        h.a((Object) b3, "header.value");
                        hashMap2.put(a3, b3);
                    }
                }
                String str = (String) hashMap2.get("request-time");
                Long valueOf2 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                Long valueOf3 = Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L);
                BaseRequest.this.postResponseMonitor((int) (currentTimeMillis - valueOf3.longValue()), i, this.c);
                Response<BaseResult<R>> response2 = response;
                BaseRequest.this.postPrivateMonitor(valueOf3.longValue(), call, response2, this.c);
                try {
                    new StringBuilder("[Response]").append(response.toString());
                    String simpleName = getClass().getSimpleName();
                    h.a((Object) simpleName, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(simpleName);
                        sb.append(']');
                    }
                    e = response.e();
                } catch (Exception e4) {
                    e = e4;
                    response2 = i;
                }
                try {
                    if (e.getCode() == com.meituan.ai.speech.base.net.base.a.SUCCESS.N) {
                        BaseRequest.this.setRequestTokenCount(0);
                        BaseRequest baseRequest = BaseRequest.this;
                        int code = e.getCode() + 1000;
                        int longValue = (int) (currentTimeMillis - valueOf3.longValue());
                        aj e5 = call.e();
                        baseRequest.uploadCat(code, intValue, i, longValue, e5 != null ? e5.b() : null, hashMap2, hashMap, "app_key=" + this.e);
                        ICallback iCallback = this.d;
                        String str2 = this.e;
                        R data = e.getData();
                        if (data == null) {
                            h.a();
                        }
                        iCallback.onSuccess(str2, data);
                        return;
                    }
                    int i4 = i;
                    if (e.getCode() != com.meituan.ai.speech.base.net.base.a.AUTH_CLIENT_ERROR.N && e.getCode() != com.meituan.ai.speech.base.net.base.a.AUTH_TOKEN_AMOUNT_LIMIT.N && e.getCode() != com.meituan.ai.speech.base.net.base.a.SERVER_ERROR_TOKEN_ERROR.N && e.getCode() != com.meituan.ai.speech.base.net.base.a.SERVER_ERROR_TOKEN_TIMEOUT_ERROR.N && e.getCode() != com.meituan.ai.speech.base.net.base.a.SERVER_ERROR_TOKEN_UNLESS_ERROR.N) {
                        BaseRequest baseRequest2 = BaseRequest.this;
                        int code2 = e.getCode();
                        int longValue2 = (int) (currentTimeMillis - valueOf3.longValue());
                        aj e6 = call.e();
                        baseRequest2.uploadCat(code2, intValue, i4, longValue2, e6 != null ? e6.b() : null, hashMap2, hashMap, "app_key=" + this.e);
                        BaseRequest.this.setRequestTokenCount(0);
                        this.d.onFailed(e.getCode(), e.getMsg());
                        return;
                    }
                    BaseRequest baseRequest3 = BaseRequest.this;
                    int code3 = e.getCode();
                    int longValue3 = (int) (currentTimeMillis - valueOf3.longValue());
                    aj e7 = call.e();
                    baseRequest3.uploadCat(code3, intValue, i4, longValue3, e7 != null ? e7.b() : null, hashMap2, hashMap, "app_key=" + this.e);
                    String str3 = "[Response]无效的Token! app_key=" + this.e;
                    String simpleName2 = getClass().getSimpleName();
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                        Log.e("[" + simpleName2 + ']', str3);
                    }
                    if (BaseRequest.this.useBA) {
                        this.d.onFailed(e.getCode(), e.getMsg());
                        return;
                    }
                    NetCreator.INSTANCE.getTokens().remove(this.e);
                    BaseRequest baseRequest4 = BaseRequest.this;
                    baseRequest4.setRequestTokenCount(baseRequest4.getRequestTokenCount() + 1);
                    if (BaseRequest.this.getRequestTokenCount() < 10) {
                        BaseRequest.this.request(this.e, this.d);
                    } else {
                        this.d.onFailed(e.getCode(), e.getMsg());
                    }
                } catch (Exception e8) {
                    e = e8;
                    e.printStackTrace();
                    BaseRequest.this.setRequestTokenCount(0);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.toString() + "\n");
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        sb2.append(stackTraceElement.toString() + "\n");
                    }
                    String sb3 = sb2.toString();
                    h.a((Object) sb3, "sb.toString()");
                    String concat = "[Response]Exception!! Cause: ".concat(String.valueOf(sb3));
                    String simpleName3 = getClass().getSimpleName();
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                        Log.e("[" + simpleName3 + ']', concat);
                    }
                    BaseRequest baseRequest5 = BaseRequest.this;
                    int i5 = com.meituan.ai.speech.base.net.base.a.RESPONSE_DATA_PARSE_ERROR.N;
                    int longValue4 = (int) (currentTimeMillis - valueOf3.longValue());
                    aj e9 = call.e();
                    baseRequest5.uploadCat(i5, intValue, response2 == 1 ? 1 : 0, longValue4, e9 != null ? e9.b() : null, hashMap2, hashMap, "app_key=" + this.c + " msg=" + sb3);
                    this.d.onFailed(com.meituan.ai.speech.base.net.base.a.RESPONSE_DATA_PARSE_ERROR.N, sb3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postResponseMonitor(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57df0094eecee715de1259296fd5608b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57df0094eecee715de1259296fd5608b");
        } else {
            CatMonitor.INSTANCE.uploadCustomIndicator(this.context, kotlin.collections.h.a((Object[]) new k[]{new k("response-time", kotlin.collections.h.a(Float.valueOf(i))), new k("response-length", kotlin.collections.h.a(Float.valueOf(i2)))}), kotlin.collections.h.a((Object[]) new k[]{new k("requestName", this.requestName), new k("secretKey", str), new k("networkType", "http")}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadCat(int i, int i2, int i3, int i4, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, hashMap, hashMap2, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f31dc465e91beb888ca6f5ae3b1be27e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f31dc465e91beb888ca6f5ae3b1be27e");
        } else {
            CatMonitor.INSTANCE.uploadNetIndicator(i, this.requestName, i2, i3, i4, str, hashMap, hashMap2, this.catSamplingRate, str2);
        }
    }

    @Keep
    private final <T extends S> T createService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee55d7e549c4422b60cba487c6942f96", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee55d7e549c4422b60cba487c6942f96");
        }
        ar retrofit2 = NetCreator.INSTANCE.getRetrofit();
        h.a(4, "T");
        return (T) retrofit2.a(Object.class);
    }
}
