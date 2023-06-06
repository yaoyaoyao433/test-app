package com.meituan.ai.speech.base.net.base;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.util.Log;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.e;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.message.g;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.b;
import com.meituan.ai.speech.base.net.data.AuthParams;
import com.meituan.ai.speech.base.net.data.BaseResult;
import com.meituan.ai.speech.base.net.data.IResult;
import com.meituan.ai.speech.base.net.data.WebSocketRecogResult;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.ai.speech.base.utils.BasicAuthUtils;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000b\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH'J\b\u00105\u001a\u000202H\u0005J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\bH\u0002J\u0018\u00108\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00109\u001a\u00020:H'J\u0010\u0010;\u001a\u0002022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010<\u001a\u000202H'J \u0010=\u001a\u0002022\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bH\u0015J\u0010\u0010?\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0005J\u001e\u0010C\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00100\u001a\u00020\b2\u0006\u00107\u001a\u00020\bJ2\u0010D\u001a\u0002022\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010B2\u0006\u0010H\u001a\u00020\u0012H'J\u0018\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H'J\u0014\u0010L\u001a\u0002022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u000e\u0010,\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u000e\u00100\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/meituan/ai/speech/base/net/base/BaseWebSocketRequest;", "R", "Lcom/meituan/ai/speech/base/net/data/IResult;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ASR_BZ_ID", "", "BASIC_AUTH_METHOD", "DATAGRAM_NBEST", "DATAGRAM_NBEST_VAD", "MESSAGE_TIMEOUT_TIME", "", "RECOG_NBEST_REQUEST", "RECOG_NBEST_REQUEST_VAD", "TEST_IP_PORT", "appId", "", "appKey", "getAppKey", "()Ljava/lang/String;", "setAppKey", "(Ljava/lang/String;)V", "callback", "Lcom/meituan/ai/speech/base/net/base/IWebSocketCallback;", "getCallback", "()Lcom/meituan/ai/speech/base/net/base/IWebSocketCallback;", "setCallback", "(Lcom/meituan/ai/speech/base/net/base/IWebSocketCallback;)V", "getContext", "()Landroid/content/Context;", "value", "", "isVad", "()Z", "setVad", "(Z)V", "osStr", "pikeClient", "Lcom/dianping/sdk/pike/PikeClient;", "requestName", "getRequestName", "setRequestName", "requestTime", "secretKey", "getSecretKey", "setSecretKey", "uuid", "callRequest", "", TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, ProtoConstant.COMMAND, "createService", "getDeviceInfo", "sdkVersionName", "handleMessageData", "result", "Lcom/meituan/ai/speech/base/net/data/WebSocketRecogResult;", "initPikeClient", "initService", "postPrivateMonitor", "receiveSessionId", SocialConstants.TYPE_REQUEST, "sendPikeMessage", "speechData", "", "setInitParams", "setRecogParams", "sessionId", "asrParams", "data", "pktIndex", "setVadParams", "startTipTime", "endTipTime", "setWebSocketCallBack", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public abstract class BaseWebSocketRequest<R extends IResult> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String ASR_BZ_ID;
    private final String BASIC_AUTH_METHOD;
    private final String DATAGRAM_NBEST;
    private final String DATAGRAM_NBEST_VAD;
    private final long MESSAGE_TIMEOUT_TIME;
    private final String RECOG_NBEST_REQUEST;
    private final String RECOG_NBEST_REQUEST_VAD;
    private final String TEST_IP_PORT;
    private int appId;
    @NotNull
    private String appKey;
    @Nullable
    private IWebSocketCallback<R> callback;
    @NotNull
    private final Context context;
    private boolean isVad;
    private String osStr;
    private d pikeClient;
    @NotNull
    private String requestName;
    private long requestTime;
    @NotNull
    private String secretKey;
    private String uuid;

    @Keep
    public abstract void callRequest(@NotNull String str, @NotNull String str2);

    @Keep
    public abstract void handleMessageData(@NotNull String str, @NotNull WebSocketRecogResult webSocketRecogResult);

    @Keep
    public abstract void initService();

    @Keep
    public void postPrivateMonitor(long j, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aea5e6ba7d6e9b7afd4edbaa29579b0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aea5e6ba7d6e9b7afd4edbaa29579b0e");
            return;
        }
        h.b(str, "secretKey");
        h.b(str2, "receiveSessionId");
    }

    @Keep
    public abstract void setRecogParams(@NotNull String str, @NotNull String str2, boolean z, @Nullable byte[] bArr, int i);

    @Keep
    public abstract void setVadParams(int i, int i2);

    public BaseWebSocketRequest(@NotNull Context context) {
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b3310c27e18fa986b0b15227ecab29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b3310c27e18fa986b0b15227ecab29");
            return;
        }
        this.context = context;
        this.TEST_IP_PORT = "10.73.250.151:8000";
        this.ASR_BZ_ID = "asr-stream-api";
        this.DATAGRAM_NBEST = "/api/v2/websocket/datagram_nbest";
        this.DATAGRAM_NBEST_VAD = "/api/v2/websocket/vad_datagram_nbest";
        this.RECOG_NBEST_REQUEST = "recog-nbest-request";
        this.RECOG_NBEST_REQUEST_VAD = "recog-nbest-request-vad";
        this.BASIC_AUTH_METHOD = "websocket";
        this.MESSAGE_TIMEOUT_TIME = MetricsAnrManager.ANR_THRESHOLD;
        this.requestTime = -1L;
        this.uuid = "";
        this.osStr = "";
        this.appKey = "";
        this.secretKey = "";
        this.requestName = "";
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    public final void setAppKey(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b27fc1bb651e626095c0d4fb199093c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b27fc1bb651e626095c0d4fb199093c");
            return;
        }
        h.b(str, "<set-?>");
        this.appKey = str;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    public final void setSecretKey(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0ab830562bdd7a3c9737ea223c55cec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0ab830562bdd7a3c9737ea223c55cec");
            return;
        }
        h.b(str, "<set-?>");
        this.secretKey = str;
    }

    @NotNull
    public final String getRequestName() {
        return this.requestName;
    }

    public final void setRequestName(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9a78acf906495633c65ee6a2f55a72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9a78acf906495633c65ee6a2f55a72b");
            return;
        }
        h.b(str, "<set-?>");
        this.requestName = str;
    }

    public final boolean isVad() {
        return this.isVad;
    }

    public final void setVad(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50ae1bb72d2deaa3d5ffc9adc1469600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50ae1bb72d2deaa3d5ffc9adc1469600");
            return;
        }
        this.isVad = z;
        this.requestName = z ? this.RECOG_NBEST_REQUEST_VAD : this.RECOG_NBEST_REQUEST;
    }

    @Nullable
    public final IWebSocketCallback<R> getCallback() {
        return this.callback;
    }

    public final void setCallback(@Nullable IWebSocketCallback<R> iWebSocketCallback) {
        this.callback = iWebSocketCallback;
    }

    public final void setInitParams(int i, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b78ca3bd43ae9cf36395f387d884d148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b78ca3bd43ae9cf36395f387d884d148");
            return;
        }
        h.b(str, "uuid");
        h.b(str2, "sdkVersionName");
        this.appId = i;
        this.uuid = str;
        getDeviceInfo(str2);
    }

    public final void setWebSocketCallBack(@NotNull IWebSocketCallback<R> iWebSocketCallback) {
        Object[] objArr = {iWebSocketCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97191c64f93271109bb3b14989e937a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97191c64f93271109bb3b14989e937a9");
            return;
        }
        h.b(iWebSocketCallback, "callback");
        this.callback = iWebSocketCallback;
    }

    @Keep
    public final void request(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f02114babade6c3181014a9d9a927d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f02114babade6c3181014a9d9a927d");
            return;
        }
        h.b(str, "appKey");
        AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str);
        String secretKey = authParams != null ? authParams.getSecretKey() : null;
        if (secretKey == null) {
            IWebSocketCallback<R> iWebSocketCallback = this.callback;
            if (iWebSocketCallback != null) {
                iWebSocketCallback.onFailed(com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.TOKEN_PARAMS_IS_NULL.O);
                return;
            }
            return;
        }
        this.appKey = str;
        this.secretKey = secretKey;
        String str2 = this.isVad ? this.DATAGRAM_NBEST_VAD : this.DATAGRAM_NBEST;
        Map<String, String> basicAuthHeader = BasicAuthUtils.INSTANCE.getBasicAuthHeader(str, secretKey, this.BASIC_AUTH_METHOD, str2);
        callRequest(CommonConstant.Symbol.BIG_BRACKET_LEFT + this.osStr + ',' + ("\"Date\":\"" + basicAuthHeader.get("date") + "\",\"Authorization\":\"" + basicAuthHeader.get("auth") + '\"') + '}', str2);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "R", "Lcom/meituan/ai/speech/base/net/data/IResult;", "unionid"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a implements h.a {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {BaseWebSocketRequest.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6c3f75dea878f41de6471f76194fab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6c3f75dea878f41de6471f76194fab");
            }
        }

        @Override // com.dianping.sdk.pike.h.a
        @NotNull
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343565c82eb3edaffce23bb6b9612a8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343565c82eb3edaffce23bb6b9612a8b") : BaseWebSocketRequest.this.uuid;
        }
    }

    @Keep
    public final void createService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1966c8e3570485415d8ff645f678a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1966c8e3570485415d8ff645f678a59");
            return;
        }
        com.dianping.sdk.pike.h.a(this.context, this.appId, new a());
        b.a aVar = com.meituan.ai.speech.base.net.b.a;
        initPikeClient(this.context);
    }

    private final void initPikeClient(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b1fe4147715c4b58fe5d62915c1cc05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b1fe4147715c4b58fe5d62915c1cc05");
        } else if (this.pikeClient == null) {
            e a2 = new e.a().a(this.ASR_BZ_ID).b(this.uuid).a();
            kotlin.jvm.internal.h.a((Object) a2, "PikeConfig.Builder()\n   …\n                .build()");
            com.dianping.sdk.pike.h.a(new b(context, a2));
        } else {
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', "pikeClient已经存在");
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "R", "Lcom/meituan/ai/speech/base/net/data/IResult;", "run"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ e d;

        public b(Context context, e eVar) {
            this.c = context;
            this.d = eVar;
            Object[] objArr = {BaseWebSocketRequest.this, context, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d89e1f1b919961ebfea36a56e0eba7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d89e1f1b919961ebfea36a56e0eba7");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3247b2d8662f04f4b2470836a03b4755", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3247b2d8662f04f4b2470836a03b4755");
                return;
            }
            BaseWebSocketRequest.this.pikeClient = d.a(this.c, this.d);
            d dVar = BaseWebSocketRequest.this.pikeClient;
            if (dVar != null) {
                dVar.a(new com.dianping.sdk.pike.message.b() { // from class: com.meituan.ai.speech.base.net.base.BaseWebSocketRequest.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.message.b
                    public final void a(List<com.dianping.sdk.pike.message.e> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6579d3decd2dab75befcc94c80641ad", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6579d3decd2dab75befcc94c80641ad");
                            return;
                        }
                        com.dianping.sdk.pike.message.e eVar = list.get(0);
                        kotlin.jvm.internal.h.a((Object) eVar, "it[0]");
                        byte[] a2 = eVar.a();
                        kotlin.jvm.internal.h.a((Object) a2, "it[0].message");
                        try {
                            BaseResult baseResult = (BaseResult) new Gson().fromJson(new String(a2, kotlin.text.d.a), new TypeToken<BaseResult<WebSocketRecogResult>>() { // from class: com.meituan.ai.speech.base.net.base.BaseWebSocketRequest.b.1.1
                            }.getType());
                            if (baseResult == null) {
                                IWebSocketCallback<R> callback = BaseWebSocketRequest.this.getCallback();
                                if (callback != null) {
                                    callback.onFailed(com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.N, com.meituan.ai.speech.base.net.base.a.RESPONSE_IS_NULL.O);
                                }
                            } else if (baseResult.getCode() != com.meituan.ai.speech.base.net.base.a.SUCCESS.N) {
                                String str = "[WebSocket Response]code fail!!，code=" + baseResult.getCode();
                                String simpleName = BaseWebSocketRequest.this.getClass().getSimpleName();
                                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                                    Log.e("[" + simpleName + ']', str);
                                }
                                IWebSocketCallback<R> callback2 = BaseWebSocketRequest.this.getCallback();
                                if (callback2 != null) {
                                    callback2.onFailed(baseResult.getCode(), baseResult.getMsg());
                                }
                            } else if (baseResult.getData() == null) {
                                IWebSocketCallback<R> callback3 = BaseWebSocketRequest.this.getCallback();
                                if (callback3 != null) {
                                    callback3.onFailed(com.meituan.ai.speech.base.net.base.a.DATA_OF_BODY_IS_NULL_IN_RESPONSE.N, com.meituan.ai.speech.base.net.base.a.DATA_OF_BODY_IS_NULL_IN_RESPONSE.O);
                                }
                            } else {
                                BaseWebSocketRequest baseWebSocketRequest = BaseWebSocketRequest.this;
                                String appKey = BaseWebSocketRequest.this.getAppKey();
                                Object data = baseResult.getData();
                                if (data == null) {
                                    kotlin.jvm.internal.h.a();
                                }
                                baseWebSocketRequest.handleMessageData(appKey, (WebSocketRecogResult) data);
                                BaseWebSocketRequest baseWebSocketRequest2 = BaseWebSocketRequest.this;
                                long j = BaseWebSocketRequest.this.requestTime;
                                String secretKey = BaseWebSocketRequest.this.getSecretKey();
                                Object data2 = baseResult.getData();
                                if (data2 == null) {
                                    kotlin.jvm.internal.h.a();
                                }
                                String session_id = ((WebSocketRecogResult) data2).getSession_id();
                                if (session_id == null) {
                                    session_id = "";
                                }
                                baseWebSocketRequest2.postPrivateMonitor(j, secretKey, session_id);
                            }
                        } catch (Exception e) {
                            IWebSocketCallback<R> callback4 = BaseWebSocketRequest.this.getCallback();
                            if (callback4 != null) {
                                callback4.onFailed(com.meituan.ai.speech.base.net.base.a.RESPONSE_DATA_PARSE_ERROR.N, e.getMessage());
                            }
                        }
                    }
                });
            }
            d dVar2 = BaseWebSocketRequest.this.pikeClient;
            if (dVar2 != null) {
                dVar2.a();
            }
        }
    }

    @Keep
    public final void sendPikeMessage(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ea6b4a7e7a22259298cfaea9f1ccb67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ea6b4a7e7a22259298cfaea9f1ccb67");
            return;
        }
        kotlin.jvm.internal.h.b(bArr, "speechData");
        this.requestTime = System.currentTimeMillis();
        g gVar = new g();
        gVar.b(this.ASR_BZ_ID);
        gVar.a(bArr);
        gVar.c(this.uuid);
        gVar.a(this.MESSAGE_TIMEOUT_TIME);
        d dVar = this.pikeClient;
        if (dVar != null) {
            dVar.a(gVar, new c());
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/meituan/ai/speech/base/net/base/BaseWebSocketRequest$sendPikeMessage$1", "Lcom/dianping/sdk/pike/CommonCallback;", "onFailed", "", "code", "", "message", "", "onSuccess", "response", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class c implements com.dianping.sdk.pike.a {
        public static ChangeQuickRedirect a;

        public c() {
            Object[] objArr = {BaseWebSocketRequest.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d543ae5dc1608e5be3be7ba4d7d23d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d543ae5dc1608e5be3be7ba4d7d23d");
            }
        }

        @Override // com.dianping.sdk.pike.a
        public final void a(int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6db18ac94f0c42335499dedd4ae7c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6db18ac94f0c42335499dedd4ae7c4");
                return;
            }
            int abs = Math.abs(i);
            IWebSocketCallback<R> callback = BaseWebSocketRequest.this.getCallback();
            if (callback != null) {
                callback.onFailed(com.meituan.ai.speech.base.net.base.a.PIKE_ERROR.N + abs, com.meituan.ai.speech.base.net.base.a.PIKE_ERROR.O + CommonConstant.Symbol.MINUS + str);
            }
            String str2 = "[sendPikeMessage Failed]errorCode=" + abs + ", msg=" + str;
            String simpleName = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName + ']', str2);
            }
        }

        @Override // com.dianping.sdk.pike.a
        public final void a(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8461a591b12ac48d935e574abecf65b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8461a591b12ac48d935e574abecf65b");
                return;
            }
            String simpleName = getClass().getSimpleName();
            kotlin.jvm.internal.h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(simpleName);
                sb.append(']');
            }
        }
    }

    private final void getDeviceInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b516abd4243478dd54d434907fa0c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b516abd4243478dd54d434907fa0c83");
            return;
        }
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String packageName = AppUtilsKt.getPackageName(this.context);
        String versionName = AppUtilsKt.getVersionName(this.context);
        this.osStr = "\"os\":\"android\",\"osVersion\":\"" + str2 + "\",\"brand\":\"" + str3 + "\",\"deviceMode\":\"" + str4 + "\",\"appIdentifier\":\"" + packageName + "\",\"appVersion\":\"" + versionName + "\",\"sdkVersion\":\"" + str + '\"';
    }
}
