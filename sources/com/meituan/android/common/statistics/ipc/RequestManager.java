package com.meituan.android.common.statistics.ipc;

import android.content.Context;
import android.os.Looper;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.ipc.DataResponse;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class RequestManager implements ConnectionListener {
    private static final String TAG = "com.meituan.android.common.statistics.ipc.RequestManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ConnectionHelper mConnector;
    private volatile LinkedBlockingQueue mQueue;

    @Override // com.meituan.android.common.statistics.ipc.ConnectionListener
    public final void onConnectionFail(int i, String str) {
    }

    public RequestManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72da66a1551fd147e99308c56b5bfc81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72da66a1551fd147e99308c56b5bfc81");
        } else {
            this.mConnector = new ConnectionHelper();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SingletonHolder {
        private static final RequestManager INSTANCE = new RequestManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static RequestManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34733069cdcb3ea6a821def35436164a", 6917529027641081856L) ? (RequestManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34733069cdcb3ea6a821def35436164a") : SingletonHolder.INSTANCE;
    }

    public final void checkConnection(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e842576f8582a2a1377f48ba63bf8a10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e842576f8582a2a1377f48ba63bf8a10");
        } else if (this.mConnector.isConnectionAlive()) {
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.ipc.RequestManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e19be4fb37b37426456473dc221a1ec2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e19be4fb37b37426456473dc221a1ec2");
                        return;
                    }
                    LogUtil.log("RequestManager checkConnection init build connection :");
                    if (RequestManager.this.mConnector != null) {
                        RequestManager.this.mConnector.connect(context, RequestManager.this);
                    }
                }
            });
        }
    }

    public final <V> DataResponse<V> request(Context context, DataRequest dataRequest) {
        Object[] objArr = {context, dataRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5140ed28188132d289d3a7a9a9be5a46", 6917529027641081856L)) {
            return (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5140ed28188132d289d3a7a9a9be5a46");
        }
        if (dataRequest == null) {
            throw new IllegalArgumentException();
        }
        checkThread();
        if (dataRequest.isInJustRouteLocal()) {
            return null;
        }
        return sendRequest(context, dataRequest);
    }

    private DataResponse sendRequest(Context context, DataRequest dataRequest) {
        Object[] objArr = {context, dataRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca66b5dccd9852b4271b4dd7dddadb0", 6917529027641081856L)) {
            return (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca66b5dccd9852b4271b4dd7dddadb0");
        }
        StringBuilder sb = new StringBuilder("RequestManager sendRequest optype:");
        sb.append(dataRequest.getOptions() != null ? ((String) dataRequest.getOptions()).toString() : "");
        LogUtil.log(sb.toString());
        if (this.mConnector.isConnectionAlive()) {
            return sendData(dataRequest);
        }
        if (this.mConnector.connect(context, this)) {
            return sendData(dataRequest);
        }
        enqueRequest(dataRequest);
        return DataResponse.error("start service async.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRequestInQueueList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6d42e9df8e89089164437f403cc0176", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6d42e9df8e89089164437f403cc0176");
        } else if (this.mQueue == null || this.mQueue.size() <= 0) {
        } else {
            Iterator it = this.mQueue.iterator();
            while (it.hasNext()) {
                DataRequest dataRequest = (DataRequest) it.next();
                if (dataRequest != null) {
                    try {
                        if (this.mConnector != null && this.mConnector.getRouteConnection() != null) {
                            this.mConnector.getRouteConnection().sendData(dataRequest);
                            it.remove();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    private void enqueRequest(DataRequest dataRequest) {
        Object[] objArr = {dataRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f3e9987599de165b0a522d8b3fea85d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f3e9987599de165b0a522d8b3fea85d");
            return;
        }
        if (this.mQueue == null) {
            this.mQueue = new LinkedBlockingQueue();
        }
        if (this.mQueue != null) {
            try {
                this.mQueue.put(dataRequest);
            } catch (Throwable unused) {
            }
        }
    }

    private DataResponse sendData(DataRequest dataRequest) {
        Object[] objArr = {dataRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71bbf03f92fc689718a1ecd84e401fae", 6917529027641081856L)) {
            return (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71bbf03f92fc689718a1ecd84e401fae");
        }
        sendRequestInQueueList();
        try {
            IServiceBinder routeConnection = this.mConnector.getRouteConnection();
            if (routeConnection != null) {
                return routeConnection.sendData(dataRequest);
            }
            return new DataResponse.Builder().error("remote binder is null").code(1).result(null).build();
        } catch (Throwable th) {
            LogUtil.log("RequestManager remote exception:");
            th.printStackTrace();
            enqueRequest(dataRequest);
            ProcessController.getInstance().checkConnection(Statistics.getContext());
            return new DataResponse.Builder().error(th.getMessage()).code(1).result(null).build();
        }
    }

    private void checkThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b368ddac9e48e187b832c99f2bdaba6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b368ddac9e48e187b832c99f2bdaba6b");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException();
        }
    }

    @Override // com.meituan.android.common.statistics.ipc.ConnectionListener
    public final void onConnectSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c32bc57240fda900feaff9a4140b92a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c32bc57240fda900feaff9a4140b92a");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.ipc.RequestManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62c17f5dcfc2ebc86abcf7a2def5c890", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62c17f5dcfc2ebc86abcf7a2def5c890");
                    } else {
                        RequestManager.this.sendRequestInQueueList();
                    }
                }
            });
        }
    }
}
