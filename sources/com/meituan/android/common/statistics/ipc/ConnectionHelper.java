package com.meituan.android.common.statistics.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.utils.DeviceUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConnectionHelper {
    public static final int CONNECT_TIME_OUT = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private AtomicBoolean mConnecting;
    public IBinder.DeathRecipient mDeathRecipient;
    private volatile IServiceBinder mRemoteBinder;
    private Condition mSyncCondition;
    private Lock mSyncLock;

    public ConnectionHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cf176511eecd8346e019f687845d44e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cf176511eecd8346e019f687845d44e");
            return;
        }
        this.mConnecting = new AtomicBoolean(false);
        this.mDeathRecipient = null;
        this.mSyncLock = new ReentrantLock();
        this.mSyncCondition = this.mSyncLock.newCondition();
    }

    public boolean connect(Context context, ConnectionListener connectionListener) {
        Object[] objArr = {context, connectionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bffe4aaf4113fde7daadbd24e0351eed", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bffe4aaf4113fde7daadbd24e0351eed")).booleanValue();
        }
        LogUtil.log("begin build connect");
        try {
            if (context == null) {
                return false;
            }
            try {
                this.mSyncLock.lock();
                if (this.mConnecting.compareAndSet(false, true) && !isConnectionAlive()) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.bindService(new Intent(applicationContext, LeaderService.class), new WideRouterServiceConnection(applicationContext, connectionListener), 1);
                    this.mSyncCondition.await(1000L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                LogUtil.log("connect error");
                e.printStackTrace();
            } catch (Throwable unused) {
            }
            LogUtil.log("connect end");
            return this.mRemoteBinder != null;
        } finally {
            this.mSyncLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5026c2ddc3b91a0e38e5f3d89fc9e0c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5026c2ddc3b91a0e38e5f3d89fc9e0c4");
            return;
        }
        try {
            this.mSyncLock.lock();
            this.mSyncCondition.signalAll();
        } finally {
            this.mSyncLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean attachDeathRecipient(Context context, IBinder iBinder) throws RemoteException {
        Object[] objArr = {context, iBinder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce1ffaa18c48fad45979d697510403b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce1ffaa18c48fad45979d697510403b")).booleanValue();
        }
        if (iBinder.isBinderAlive()) {
            this.mDeathRecipient = new ConnectDeathRecipient(context);
            iBinder.linkToDeath(this.mDeathRecipient, 0);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ConnectDeathRecipient implements IBinder.DeathRecipient {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Context mContext;

        public ConnectDeathRecipient(Context context) {
            Object[] objArr = {ConnectionHelper.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7919beae8f96e0b942b08a2aa87b9ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7919beae8f96e0b942b08a2aa87b9ef");
                return;
            }
            this.mContext = null;
            this.mContext = context;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32fa0aaee97b38b62ae6cb8cb601c22c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32fa0aaee97b38b62ae6cb8cb601c22c");
                return;
            }
            LogUtil.log("connect attachDeathRecipient died");
            try {
                if (ConnectionHelper.this.mRemoteBinder != null && ConnectionHelper.this.mRemoteBinder.asBinder() != null && ConnectionHelper.this.mDeathRecipient != null) {
                    ConnectionHelper.this.mRemoteBinder.asBinder().unlinkToDeath(ConnectionHelper.this.mDeathRecipient, 0);
                }
            } catch (Throwable unused) {
            }
            ConnectionHelper.this.mRemoteBinder = null;
            if (DeviceUtil.isXiaomiOS10and11()) {
                return;
            }
            ConnectionHelper.this.connect(this.mContext, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class WideRouterServiceConnection implements ServiceConnection {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Context context;
        private long mConnectBegin;
        private ConnectionListener mListener;

        public WideRouterServiceConnection(Context context, ConnectionListener connectionListener) {
            Object[] objArr = {ConnectionHelper.this, context, connectionListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "575fa98c19aba6ddf543723c0d8370da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "575fa98c19aba6ddf543723c0d8370da");
                return;
            }
            this.mListener = connectionListener;
            this.context = context.getApplicationContext();
            this.mConnectBegin = SystemClock.elapsedRealtime();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean z;
            Object[] objArr = {componentName, iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2618190ab0b1c1f4c79be5cb9fa0ae2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2618190ab0b1c1f4c79be5cb9fa0ae2");
                return;
            }
            ConnectionHelper.this.mConnecting.compareAndSet(true, false);
            LogUtil.log("connect onServiceConnected succeed");
            CatMonitorManager.getInstance().reportConnectionBuildDuration((int) (SystemClock.elapsedRealtime() - this.mConnectBegin), ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            try {
                z = ConnectionHelper.this.attachDeathRecipient(this.context, iBinder);
            } catch (RemoteException e) {
                LogUtil.log("onServiceConnected error");
                e.printStackTrace();
                z = false;
            }
            if (z) {
                ConnectionHelper.this.mRemoteBinder = LeaderServiceBinder.asInterface(iBinder);
            }
            CatMonitorManager.getInstance().reportConnectionBuildStatus(1, ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            ConnectionHelper.this.signalAll();
            if (this.mListener != null) {
                this.mListener.onConnectSuccess();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Object[] objArr = {componentName};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39c89ee62b765d9c4a3173b43c58329d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39c89ee62b765d9c4a3173b43c58329d");
                return;
            }
            ConnectionHelper.this.mConnecting.compareAndSet(true, false);
            ConnectionHelper.this.mRemoteBinder = null;
            LogUtil.log("connect onServiceConnected fail");
            if (this.mListener != null) {
                this.mListener.onConnectionFail(-1, "onServiceDisconnected");
            }
        }
    }

    public boolean isConnectionAlive() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bae822acff9ee50703cb28c258fd6fa8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bae822acff9ee50703cb28c258fd6fa8")).booleanValue();
        }
        try {
            if (this.mRemoteBinder == null || this.mRemoteBinder.asBinder() == null) {
                return false;
            }
            return this.mRemoteBinder.asBinder().isBinderAlive();
        } catch (Throwable unused) {
            return false;
        }
    }

    public IServiceBinder getRouteConnection() {
        return this.mRemoteBinder;
    }
}
