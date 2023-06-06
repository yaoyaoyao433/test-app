package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BindingFailedResolution implements ServiceConnection, IBridgeActivityDelegate {
    private static final Object f = new Object();
    private Activity a;
    private d c;
    private boolean b = true;
    private Handler d = null;
    private Handler e = null;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            BindingFailedResolution.this.a(8);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.e("BindingFailedResolution", "In connect, bind core try timeout");
            BindingFailedResolution.this.a(false);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class c implements AbstractDialog.Callback {
        c() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.a(8);
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.a(8);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d extends AbstractPromptDialog {
        private d() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message", Util.getAppName(context, null), Util.getAppName(context, HMSPackageManager.getInstance(context).getHMSPackageName()));
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private void b() {
        synchronized (f) {
            if (this.d != null) {
                this.d.removeMessages(2);
                this.d = null;
            }
        }
    }

    private void c() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.d = new Handler(Looper.getMainLooper(), new b());
        }
        this.d.sendEmptyMessageDelayed(2, MetricsAnrManager.ANR_THRESHOLD);
    }

    private void d() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.e = new Handler(Looper.getMainLooper(), new a());
        }
        this.e.sendEmptyMessageDelayed(3, 4000L);
    }

    private void e() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            this.c = new d(null);
        } else {
            dVar.dismiss();
        }
        HMSLog.i("BindingFailedResolution", "showPromptdlg to resolve conn error");
        this.c.show(activity, new c());
    }

    protected Activity getActivity() {
        return this.a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2003;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = activity;
        com.huawei.hms.api.a.b.a(this.a);
        d();
        a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        b();
        com.huawei.hms.api.a.b.b(this.a);
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i("BindingFailedResolution", "onBridgeActivityResult");
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(3);
            this.e = null;
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.c == null) {
            return;
        }
        HMSLog.i("BindingFailedResolution", "re show prompt dialog");
        e();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("BindingFailedResolution", "On key up when resolve conn error");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b();
        a(true);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        Util.unBindServiceCatchException(activity, this);
        HMSLog.i("BindingFailedResolution", "test connect success, try to reConnect and reply message");
        BindResolveClients.getInstance().notifyClientReconnect();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    protected void onStartResult(boolean z) {
        if (getActivity() == null) {
            return;
        }
        if (z) {
            a(0);
        } else {
            e();
        }
    }

    private void a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName(), HuaweiApiAvailability.ACTIVITY_NAME);
        HMSLog.i("BindingFailedResolution", "onBridgeActivityCreate：try to start HMS");
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (Throwable th) {
            HMSLog.e("BindingFailedResolution", "ActivityNotFoundException：" + th.getMessage());
            Handler handler = this.e;
            if (handler != null) {
                handler.removeMessages(3);
                this.e = null;
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.b) {
            this.b = false;
            onStartResult(z);
        }
    }

    private void a() {
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.e("BindingFailedResolution", "In connect, bind core try fail");
            a(false);
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.aidlservice");
        intent.setPackage(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        synchronized (f) {
            if (activity.bindService(intent, this, 1)) {
                c();
                return;
            }
            HMSLog.e("BindingFailedResolution", "In connect, bind core try fail");
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        HMSLog.i("BindingFailedResolution", "finishBridgeActivity：" + i);
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_RESULT, i);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
