package com.huawei.hms.common.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hmf.tasks.g;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import com.meituan.robust.common.CommonConstant;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HuaweiApiManager implements Handler.Callback {
    private static final String HANDLER_NAME = "HuaweiApiHandler";
    private static final Object LOCK_OBJECT = new Object();
    private static final int MSG_RECEIVE_SEND_REQ = 4;
    private static final String TAG = "HuaweiApiManager";
    private static HuaweiApiManager mInstance;
    private final Handler mHandler;
    private final AtomicInteger mSerial = new AtomicInteger(0);
    private final Map<ConnectionManagerKey<?>, ConnectionManager<?>> mConnectionCache = new ConcurrentHashMap(5, 0.75f, 1);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ConnectionManager<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private final ConnectionManagerKey mConnectionManagerKey;
        private ResolveClientBean mResolveClientBean;
        private final Queue<TaskApiCallbackWrapper> callbackQueue = new LinkedList();
        private ConnectionResult mConnectionResult = null;

        ConnectionManager(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(HuaweiApiManager.this.mHandler.getLooper(), this);
            this.mConnectionManagerKey = huaweiApi.getConnectionManagerKey();
        }

        private String errorReason(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.mApi.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode != 3) {
                        if (errorCode != 8) {
                            if (errorCode != 10) {
                                if (errorCode != 13) {
                                    if (errorCode != 21) {
                                        switch (errorCode) {
                                            case 25:
                                                return "failed to get update result";
                                            case 26:
                                                return "update failed, because no activity incoming, can't pop update page";
                                            case 27:
                                                return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                                            default:
                                                return "unknown errorReason";
                                        }
                                    }
                                    return "device is too old to be support";
                                }
                                return "update cancelled";
                            }
                            return "application configuration error, please developer check configuration";
                        }
                        return "internal error";
                    }
                    return "HuaWei Mobile Service is disabled";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            return errorCode2 != -1 ? errorCode2 != 8 ? errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
        }

        private String getTransactionId(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.mApi.getAppID(), str2) : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnected() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = null;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackQueue.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionFailed(ConnectionResult connectionResult) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + errorReason(connectionResult) + CommonConstant.Symbol.BRACKET_LEFT + connectionResult.getErrorCode() + CommonConstant.Symbol.BRACKET_RIGHT);
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                b.a(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    z = false;
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionSuspended(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        private void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.mApi.getSubAppID());
            requestHeader.setPkgName(this.mApi.getContext().getPackageName());
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), taskApiCallbackWrapper.getCallBack());
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.1
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e(HuaweiApiManager.TAG, "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e(HuaweiApiManager.TAG, "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        b.a(ConnectionManager.this.mApi.getContext(), responseHeader, String.valueOf(ConnectionManager.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(ConnectionManager.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        synchronized void connect(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            if (this.mClient.isConnected()) {
                HMSLog.d(HuaweiApiManager.TAG, "client is connected");
            } else if (this.mClient.isConnecting()) {
                HMSLog.d(HuaweiApiManager.TAG, "client is isConnecting");
            } else {
                if (this.mApi.getActivity() != null) {
                    if (this.mResolveClientBean == null) {
                        this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                        HMSLog.i(HuaweiApiManager.TAG, "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.mResolveClientBean);
                }
                this.mClient.connect(i);
            }
        }

        boolean disconnect() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mClient.disconnect();
            return true;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.d(HuaweiApiManager.TAG, "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() != HuaweiApiManager.this.mHandler.getLooper()) {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnected();
                    }
                });
            } else {
                innerConnected();
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i(HuaweiApiManager.TAG, "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() != HuaweiApiManager.this.mHandler.getLooper()) {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnectionFailed(connectionResult);
                    }
                });
            } else {
                innerConnectionFailed(connectionResult);
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(final int i) {
            HMSLog.i(HuaweiApiManager.TAG, "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() != HuaweiApiManager.this.mHandler.getLooper()) {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnectionSuspended(i);
                    }
                });
            } else {
                innerConnectionSuspended(i);
            }
        }

        void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i(HuaweiApiManager.TAG, "sendRequest");
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            TaskApiCallbackWrapper wrapperRequest = wrapperRequest(taskApiCallWrapper);
            int minApkVersion = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
            if (this.mClient.isConnected()) {
                if (HMSPackageManager.getInstance(this.mApi.getContext()).hmsVerHigherThan(minApkVersion)) {
                    postMessage(wrapperRequest);
                    return;
                }
                disconnect();
                this.callbackQueue.add(wrapperRequest);
                connect(minApkVersion);
                return;
            }
            this.callbackQueue.add(wrapperRequest);
            ConnectionResult connectionResult = this.mConnectionResult;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                onConnectionFailed(this.mConnectionResult);
            } else {
                connect(minApkVersion);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    private HuaweiApiManager(Context context, Looper looper, HuaweiApiAvailability huaweiApiAvailability) {
        this.mHandler = new Handler(looper, this);
    }

    private void connectAndSendRequest(HandlerMessageWrapper handlerMessageWrapper) {
        HuaweiApi<?> huaweiApi = handlerMessageWrapper.mApi;
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            connectionManager = new ConnectionManager<>(huaweiApi);
            this.mConnectionCache.put(huaweiApi.getConnectionManagerKey(), connectionManager);
        }
        connectionManager.sendRequest((TaskApiCallWrapper) handlerMessageWrapper.mContentWrapper);
    }

    public static HuaweiApiManager getInstance(Context context) {
        synchronized (LOCK_OBJECT) {
            if (mInstance == null) {
                HandlerThread handlerThread = new HandlerThread(TAG);
                handlerThread.start();
                mInstance = new HuaweiApiManager(context.getApplicationContext(), handlerThread.getLooper(), HuaweiApiAvailability.getInstance());
            }
        }
        return mInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void innerDisconnect(HuaweiApi<?> huaweiApi, g<Boolean> gVar) {
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            gVar.a((g<Boolean>) Boolean.FALSE);
        } else {
            gVar.a((g<Boolean>) Boolean.valueOf(connectionManager.disconnect()));
        }
    }

    public void disconnectService(final HuaweiApi<?> huaweiApi, final g<Boolean> gVar) {
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            innerDisconnect(huaweiApi, gVar);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.1
                @Override // java.lang.Runnable
                public void run() {
                    HuaweiApiManager.this.innerDisconnect(huaweiApi, gVar);
                }
            });
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 4) {
            HMSLog.w(TAG, "Unknown message id: " + message.what);
            return false;
        }
        connectAndSendRequest((HandlerMessageWrapper) message.obj);
        return true;
    }

    public final <TOption extends Api.ApiOptions, TResult> void sendRequest(HuaweiApi<TOption> huaweiApi, TaskApiCall<? extends AnyClient, TResult> taskApiCall, g<TResult> gVar) {
        TaskApiCallWrapper taskApiCallWrapper = new TaskApiCallWrapper(taskApiCall, gVar);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new HandlerMessageWrapper(taskApiCallWrapper, this.mSerial.getAndIncrement(), huaweiApi)));
    }
}
