package com.meituan.msi.api;

import android.os.SystemClock;
import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ApiResponse<T> {
    public static int API_EXCEPTION = 405;
    public static final int CANCEL = 101;
    public static int EMPTY = 204;
    public static int FORBIDDEN = 403;
    public static final int INNER_ERROR = 500;
    public static final int INVALID_PARAM = 400;
    public static int NOT_FUND = 404;
    public static int NOT_IMPLEMENT = 502;
    public static final int NO_PERMISSION = 401;
    public static int OK = 200;
    public static int TIME_OUT = 504;
    public static ChangeQuickRedirect changeQuickRedirect;
    private transient String apiName;
    private com.meituan.msi.context.c apiReporter;
    private transient String apiScope;
    private transient Throwable apiThrowable;
    private String callbackId;
    private transient String env;
    private Map innerData;
    @SerializedName("type")
    private String invokeType;
    protected transient boolean isNewApi;
    private MetricsParam metrics;
    private transient long msiDuration;
    public final transient boolean originBack;
    private transient String pagePath;
    private transient String refer;
    @SerializedName("data")
    private T responseBody;
    private transient int sampleRate;
    @SerializedName("code")
    private int statusCode;
    @SerializedName("msg")
    private String statusMsg;
    private Map uiData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class MetricsParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long msiEndTime;
        public long msiStartTime;
    }

    public com.meituan.msi.context.c getApiReporter() {
        return this.apiReporter;
    }

    public ApiResponse(ApiRequest<?> apiRequest) {
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce4c29f1e743b8f0f1595a7d13ed1c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce4c29f1e743b8f0f1595a7d13ed1c2");
        } else if (apiRequest != null) {
            this.apiName = apiRequest.getName();
            this.apiScope = apiRequest.getScope();
            if (this.metrics == null) {
                this.metrics = new MetricsParam();
            }
            this.metrics.msiStartTime = apiRequest.getCurrentMsiStartTimeMillis();
            this.metrics.msiEndTime = System.currentTimeMillis();
            this.msiDuration = SystemClock.elapsedRealtime() - apiRequest.msiStartInnerTime();
            this.callbackId = apiRequest.getCallbackId();
            this.env = apiRequest.getSource();
            this.refer = apiRequest.getReferrer();
            com.meituan.msi.context.h hVar = apiRequest.getContainerContext().h;
            if (hVar != null) {
                this.pagePath = hVar.b();
            }
            if (apiRequest instanceof GsonApiRequest) {
                this.originBack = false;
                JsonObject uIArgs = ((GsonApiRequest) apiRequest).getUIArgs();
                if (uIArgs != null && (uIArgs.has("pageId") || uIArgs.has("viewId"))) {
                    this.uiData = new HashMap();
                    this.uiData.put("pageId", uIArgs.get("pageId"));
                    this.uiData.put("viewId", uIArgs.get("viewId"));
                }
            } else {
                this.originBack = true;
            }
            if (apiRequest.defaultCall != null) {
                this.isNewApi = apiRequest.defaultCall.e;
            }
            int i = -1;
            if (apiRequest.defaultCall != null && apiRequest.defaultCall.a() >= 0) {
                i = apiRequest.defaultCall.a();
            }
            this.apiReporter = apiRequest.getContainerContext().e;
            if (this.apiReporter != null && i < 0) {
                i = this.apiReporter.a(apiRequest.getScope(), this.apiName);
            }
            if (i >= 0 && i <= 10000) {
                this.sampleRate = i;
            } else if (apiRequest.defaultCall != null) {
                com.meituan.msi.api.a aVar = apiRequest.defaultCall;
                this.sampleRate = (int) ((aVar.c == null ? 1.0f : aVar.c.n) * 10000.0f);
            } else {
                this.sampleRate = 10000;
            }
        } else {
            this.originBack = false;
        }
    }

    public static <T> void notifyNegativeResultSync(ApiResponse<T> apiResponse) {
        Object[] objArr = {apiResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e92f11050cdf9e0c5be84189a16fa52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e92f11050cdf9e0c5be84189a16fa52");
            return;
        }
        com.meituan.msi.log.a.a((ApiResponse<?>) apiResponse);
        com.meituan.msi.log.a.b(apiResponse);
    }

    public static void notifyNegativeResult(c cVar, ApiResponse apiResponse) {
        Object[] objArr = {cVar, apiResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "303f00e5d1a17f0464452aab0a2702a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "303f00e5d1a17f0464452aab0a2702a3");
        } else if (cVar != null) {
            cVar.a(apiResponse.originBack ? apiResponse : apiResponse.toJson());
            com.meituan.msi.log.a.a(apiResponse);
            com.meituan.msi.log.a.b(apiResponse);
        }
    }

    private static <T> ApiResponse<T> createResponse(ApiRequest<T> apiRequest) {
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3185d3671444cecc94d9b2cd4223dc50", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3185d3671444cecc94d9b2cd4223dc50");
        }
        if (com.meituan.msi.a.i()) {
            return new DebugApiResponse(apiRequest);
        }
        return new ApiResponse<>(apiRequest);
    }

    public static <T> ApiResponse<T> positiveResponse(ApiRequest<T> apiRequest, T t, a aVar) {
        Object[] objArr = {apiRequest, t, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb53176be1843deb510a5676d554447e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb53176be1843deb510a5676d554447e");
        }
        ApiResponse<T> createResponse = createResponse(apiRequest);
        ((ApiResponse) createResponse).statusCode = OK;
        ((ApiResponse) createResponse).invokeType = aVar.e;
        if (t == EmptyResponse.INSTANCE || "".equals(t)) {
            t = null;
        }
        ((ApiResponse) createResponse).responseBody = t;
        StringBuilder sb = new StringBuilder();
        sb.append(apiRequest != null ? apiRequest.getName() : "");
        sb.append(":ok");
        ((ApiResponse) createResponse).statusMsg = sb.toString();
        return createResponse;
    }

    public static ApiResponse<?> negativeResponse(ApiRequest<?> apiRequest, int i, String str, a aVar) {
        String str2;
        Object[] objArr = {apiRequest, Integer.valueOf(i), str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8e260747ce76bd6b32d77d7e08a0453", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8e260747ce76bd6b32d77d7e08a0453");
        }
        ApiResponse<?> createResponse = createResponse(apiRequest);
        ((ApiResponse) createResponse).statusCode = i;
        ((ApiResponse) createResponse).invokeType = aVar.e;
        StringBuilder sb = new StringBuilder();
        if (apiRequest != null) {
            str2 = apiRequest.getName() + ":fail ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(str);
        ((ApiResponse) createResponse).statusMsg = sb.toString();
        return createResponse;
    }

    public static <T> ApiResponse<T> negativeResponse(ApiRequest<T> apiRequest, int i, String str, T t, a aVar) {
        String str2;
        Object[] objArr = {apiRequest, Integer.valueOf(i), str, t, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a822492314cc5350845251bbd7ec9c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a822492314cc5350845251bbd7ec9c7");
        }
        ApiResponse<T> createResponse = createResponse(apiRequest);
        ((ApiResponse) createResponse).statusCode = i;
        ((ApiResponse) createResponse).invokeType = aVar.e;
        StringBuilder sb = new StringBuilder();
        if (apiRequest != null) {
            str2 = apiRequest.getName() + ":fail ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(str);
        ((ApiResponse) createResponse).statusMsg = sb.toString();
        if (t == EmptyResponse.INSTANCE || "".equals(t)) {
            t = null;
        }
        ((ApiResponse) createResponse).responseBody = t;
        return createResponse;
    }

    public static ApiResponse<?> negativeResponse(ApiRequest<?> apiRequest, Throwable th, a aVar) {
        String str;
        Object[] objArr = {apiRequest, th, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "928d9ba8b709490bd3b771d6c7c53543", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "928d9ba8b709490bd3b771d6c7c53543");
        }
        ApiResponse<?> createResponse = createResponse(apiRequest);
        if (th instanceof ApiException) {
            ((ApiResponse) createResponse).statusCode = ((ApiException) th).getCode();
        } else if (th != null) {
            ((ApiResponse) createResponse).statusCode = API_EXCEPTION;
        } else {
            ((ApiResponse) createResponse).statusCode = 500;
        }
        if (((ApiResponse) createResponse).statusCode == API_EXCEPTION) {
            ((ApiResponse) createResponse).apiThrowable = th;
        }
        ((ApiResponse) createResponse).invokeType = aVar.e;
        StringBuilder sb = new StringBuilder();
        if (apiRequest != null) {
            str = apiRequest.getName() + ":fail ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(th != null ? th.getMessage() : "");
        ((ApiResponse) createResponse).statusMsg = sb.toString();
        return createResponse;
    }

    public String getEnv() {
        return this.env;
    }

    public String getRefer() {
        return this.refer;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public String getApiName() {
        return this.apiName;
    }

    public String getApiScope() {
        return this.apiScope;
    }

    public Throwable getApiThrowable() {
        return this.apiThrowable;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public long getMsiDuration() {
        return this.msiDuration;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c75ec663355d5ba2fa560e0414ea7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c75ec663355d5ba2fa560e0414ea7c") : w.a(this);
    }

    public void setInnerData(Map map) {
        this.innerData = map;
    }

    public String getPagePath() {
        return this.pagePath;
    }

    public boolean isNewApi() {
        return this.isNewApi;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        returnValue("return"),
        callbackValue("callback"),
        broadcastEvent("event");
        
        public static ChangeQuickRedirect a;
        public final String e;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "350f1d93240f62f21fcef24a69655696", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "350f1d93240f62f21fcef24a69655696") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "658c8dc9ceeca55f3ee553e0e22d09a0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "658c8dc9ceeca55f3ee553e0e22d09a0") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02170901df12c170219c15654d7f1362", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02170901df12c170219c15654d7f1362");
            } else {
                this.e = str;
            }
        }
    }
}
