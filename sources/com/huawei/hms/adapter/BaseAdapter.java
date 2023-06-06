package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.BaseResolutionAdapter;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.Util;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseAdapter {
    private static final String TAG = "BaseAdapter";
    private WeakReference<Activity> activityWeakReference;
    private WeakReference<ApiClient> api;
    private Context appContext;
    private BaseCallBack baseCallBackReplay;
    private BaseCallBack callback;
    private String jsonHeaderReplay;
    private String jsonObjectReplay;
    private SystemObserver observer;
    private Parcelable parcelableReplay;
    private RequestHeader requestHeader = new RequestHeader();
    private ResponseHeader responseHeader = new ResponseHeader();
    private String transactionId;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {
        private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void handleSolutionIntent(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            HMSLog.i(BaseAdapter.TAG, "baseCallBack.onComplete");
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
                return;
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intent);
            } else {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            BaseCallBack callBack = BaseAdapter.this.getCallBack();
            if (callBack == null) {
                HMSLog.e(BaseAdapter.TAG, "onResult baseCallBack null");
            } else if (resolveResult == null) {
                HMSLog.e(BaseAdapter.TAG, "result null");
                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
            } else {
                CoreBaseResponse value = resolveResult.getValue();
                if (value == null) {
                    HMSLog.e(BaseAdapter.TAG, "response null");
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                } else if (!TextUtils.isEmpty(value.getJsonHeader())) {
                    JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.responseHeader);
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        BaseAdapter baseAdapter = BaseAdapter.this;
                        baseAdapter.biReportRequestReturnIpc(baseAdapter.appContext, BaseAdapter.this.responseHeader);
                    }
                    if ("intent".equals(BaseAdapter.this.responseHeader.getResolution())) {
                        Activity cpActivity = BaseAdapter.this.getCpActivity();
                        HMSLog.i(BaseAdapter.TAG, "activity is " + cpActivity);
                        if (cpActivity != null && !cpActivity.isFinishing()) {
                            PendingIntent pendingIntent = value.getPendingIntent();
                            if (pendingIntent != null) {
                                if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                                    BaseAdapter.this.startResolution(cpActivity, pendingIntent);
                                    return;
                                } else {
                                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                                    return;
                                }
                            }
                            Intent intent = value.getIntent();
                            if (intent != null) {
                                if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                                    BaseAdapter.this.startResolution(cpActivity, intent);
                                    return;
                                } else {
                                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                                    return;
                                }
                            }
                            HMSLog.e(BaseAdapter.TAG, "hasResolution is true but NO_SOLUTION");
                            callBack.onError(BaseAdapter.this.getResponseHeaderForError(-4));
                            return;
                        }
                        HMSLog.e(BaseAdapter.TAG, "activity null");
                        handleSolutionIntent(callBack, value);
                        return;
                    }
                    handleSolutionIntent(callBack, value);
                } else {
                    HMSLog.e(BaseAdapter.TAG, "jsonHeader null");
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MPendingResultImpl extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public MPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.api = new WeakReference<>(apiClient);
    }

    private void biReportRequestEntryIpc(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put("direction", HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    private void biReportRequestEntrySolution(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put("direction", HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void biReportRequestReturnIpc(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put("direction", HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void biReportRequestReturnSolution(Context context, ResponseHeader responseHeader, long j) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put("direction", HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildBodyStr(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            HMSLog.e(TAG, "buildBodyStr failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseWrap buildResponseWrap(int i, String str) {
        setResponseHeader(i);
        ResponseWrap responseWrap = new ResponseWrap(this.responseHeader);
        responseWrap.setBody(str);
        return responseWrap;
    }

    private BaseCallBack getBaseCallBackReplay() {
        return this.baseCallBackReplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCallBack getCallBack() {
        BaseCallBack baseCallBack = this.callback;
        if (baseCallBack == null) {
            HMSLog.e(TAG, "callback null");
            return null;
        }
        return baseCallBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getCpActivity() {
        if (this.activityWeakReference == null) {
            HMSLog.i(TAG, "activityWeakReference is " + this.activityWeakReference);
            return null;
        }
        ApiClient apiClient = this.api.get();
        if (apiClient == null) {
            HMSLog.i(TAG, "tmpApi is " + apiClient);
            return null;
        }
        HMSLog.i(TAG, "activityWeakReference has " + this.activityWeakReference.get());
        return Util.getActiveActivity(this.activityWeakReference.get(), apiClient.getContext());
    }

    private String getJsonHeaderReplay() {
        return this.jsonHeaderReplay;
    }

    private String getJsonObjectReplay() {
        return this.jsonObjectReplay;
    }

    private Parcelable getParcelableReplay() {
        return this.parcelableReplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getResponseHeaderForError(int i) {
        setResponseHeader(i);
        return this.responseHeader.toJson();
    }

    private void initObserver() {
        this.observer = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(BaseAdapter.this.transactionId)) {
                        HMSLog.i(BaseAdapter.TAG, "onSolutionResult + id is :" + str);
                        BaseCallBack callBack = BaseAdapter.this.getCallBack();
                        if (callBack == null) {
                            HMSLog.e(BaseAdapter.TAG, "onResult baseCallBack null");
                            return true;
                        }
                        long j = 0;
                        if (intent == null) {
                            HMSLog.e(BaseAdapter.TAG, "onSolutionResult but data is null");
                            String responseHeaderForError = BaseAdapter.this.getResponseHeaderForError(-7);
                            BaseAdapter baseAdapter = BaseAdapter.this;
                            baseAdapter.biReportRequestReturnSolution(baseAdapter.appContext, BaseAdapter.this.responseHeader, 0L);
                            callBack.onError(responseHeaderForError);
                            return true;
                        } else if (intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
                            int a = f.a(intent, KpmsConstant.KIT_UPDATE_RESULT, 0);
                            HMSLog.i(BaseAdapter.TAG, "kit_update_result is " + a);
                            if (a == 1) {
                                HMSLog.e(BaseAdapter.TAG, "kit update success,replay request");
                                BaseAdapter.this.replayRequest();
                            } else {
                                HMSLog.e(BaseAdapter.TAG, "kit update failed");
                                BaseAdapter baseAdapter2 = BaseAdapter.this;
                                callBack.onError(baseAdapter2.buildResponseWrap(-10, baseAdapter2.buildBodyStr(a)).toJson());
                            }
                            return true;
                        } else {
                            HMSLog.e(BaseAdapter.TAG, "onComplete for on activity result");
                            String a2 = f.a(intent, CommonCode.MapKey.JSON_HEADER);
                            String a3 = f.a(intent, CommonCode.MapKey.JSON_BODY);
                            Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(a2, "status_code");
                            Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(a2, AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE);
                            if (intent.hasExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI)) {
                                Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(f.a(intent, CommonCode.MapKey.HMS_FOREGROUND_RES_UI), "uiDuration");
                                if (infoFromJsonobject3 instanceof Long) {
                                    j = ((Long) infoFromJsonobject3).longValue();
                                }
                            }
                            if (!(infoFromJsonobject instanceof Integer) || !(infoFromJsonobject2 instanceof Integer)) {
                                BaseAdapter.this.getResponseHeaderForError(-8);
                                BaseAdapter baseAdapter3 = BaseAdapter.this;
                                baseAdapter3.biReportRequestReturnSolution(baseAdapter3.appContext, BaseAdapter.this.responseHeader, j);
                            } else {
                                int intValue = ((Integer) infoFromJsonobject).intValue();
                                BaseAdapter.this.getResponseHeaderForError(((Integer) infoFromJsonobject2).intValue());
                                BaseAdapter.this.responseHeader.setStatusCode(intValue);
                                BaseAdapter baseAdapter4 = BaseAdapter.this;
                                baseAdapter4.biReportRequestReturnSolution(baseAdapter4.appContext, BaseAdapter.this.responseHeader, j);
                            }
                            callBack.onComplete(a2, a3, null);
                            return true;
                        }
                    }
                    return false;
                }
                HMSLog.e(BaseAdapter.TAG, "onSolutionResult but id is null");
                BaseCallBack callBack2 = BaseAdapter.this.getCallBack();
                if (callBack2 != null) {
                    callBack2.onError(BaseAdapter.this.getResponseHeaderForError(-6));
                    return true;
                }
                HMSLog.e(BaseAdapter.TAG, "onSolutionResult baseCallBack null");
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i) {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replayRequest() {
        if (this.jsonHeaderReplay == null || this.baseCallBackReplay == null) {
            return;
        }
        this.responseHeader = null;
        this.responseHeader = new ResponseHeader();
        baseRequest(getJsonHeaderReplay(), getJsonObjectReplay(), getParcelableReplay(), getBaseCallBackReplay());
    }

    private void setBaseCallBackReplay(BaseCallBack baseCallBack) {
        this.baseCallBackReplay = baseCallBack;
    }

    private void setJsonHeaderReplay(String str) {
        this.jsonHeaderReplay = str;
    }

    private void setJsonObjectReplay(String str) {
        this.jsonObjectReplay = str;
    }

    private void setParcelableReplay(Parcelable parcelable) {
        this.parcelableReplay = parcelable;
    }

    private void setReplayData(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setJsonHeaderReplay(str);
        setJsonObjectReplay(str2);
        setParcelableReplay(parcelable);
        setBaseCallBackReplay(baseCallBack);
    }

    private void setResponseHeader(int i) {
        this.responseHeader.setTransactionId(this.requestHeader.getTransactionId());
        this.responseHeader.setAppID(this.requestHeader.getAppID());
        this.responseHeader.setApiName(this.requestHeader.getApiName());
        this.responseHeader.setSrvName(this.requestHeader.getSrvName());
        this.responseHeader.setPkgName(this.requestHeader.getPkgName());
        this.responseHeader.setStatusCode(1);
        this.responseHeader.setErrorCode(i);
        this.responseHeader.setErrorReason("Core error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startResolution(Activity activity, Parcelable parcelable) {
        HMSLog.i(TAG, "startResolution");
        RequestHeader requestHeader = this.requestHeader;
        if (requestHeader != null) {
            biReportRequestEntrySolution(this.appContext, requestHeader);
        }
        if (this.observer == null) {
            initObserver();
        }
        SystemManager.getSystemNotifier().registerObserver(this.observer);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.transactionId);
        activity.startActivity(intentStartBridgeActivity);
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setReplayData(str, str2, parcelable, baseCallBack);
        if (this.api == null) {
            HMSLog.e(TAG, "client is null");
            baseCallBack.onError(getResponseHeaderForError(-2));
            return;
        }
        this.callback = baseCallBack;
        JsonUtil.jsonToEntity(str, this.requestHeader);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.requestHeader.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.e(TAG, "get uri null");
            baseCallBack.onError(getResponseHeaderForError(-5));
            return;
        }
        this.transactionId = this.requestHeader.getTransactionId();
        if (TextUtils.isEmpty(this.transactionId)) {
            HMSLog.e(TAG, "get transactionId null");
            baseCallBack.onError(getResponseHeaderForError(-6));
            return;
        }
        HMSLog.i(TAG, "in baseRequest + uri is :" + apiName + ", transactionId is : " + this.transactionId);
        biReportRequestEntryIpc(this.appContext, this.requestHeader);
        baseRequest(this.api.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.api = new WeakReference<>(apiClient);
        this.activityWeakReference = new WeakReference<>(activity);
        this.appContext = activity.getApplicationContext();
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> baseRequest(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new MPendingResultImpl(apiClient, str, coreBaseRequest);
    }
}
