package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AvailableAdapter {
    public static AtomicBoolean d = new AtomicBoolean(false);
    public static int e = 0;
    public final int a;
    public AvailableCallBack b;
    public SystemObserver c = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface AvailableCallBack {
        void onComplete(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements SystemObserver {
        public a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.a();
            if (a == null) {
                HMSLog.e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            a.onComplete(i);
            int unused = AvailableAdapter.e = i;
            HMSLog.i("AvailableAdapter", "user response " + AvailableAdapter.e);
            AvailableAdapter.d.set(false);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.a = i;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        if (Build.VERSION.SDK_INT < 16) {
            HMSLog.i("AvailableAdapter", "HMS can not be supported under android 4.1");
            return 21;
        }
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(context);
        PackageManagerHelper.PackageStates hMSPackageStates = hMSPackageManager.getHMSPackageStates();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStates)) {
            HMSLog.i("AvailableAdapter", "HMS is not installed");
            return 1;
        } else if (PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStates)) {
            HMSLog.i("AvailableAdapter", "HMS is disabled");
            return 3;
        } else if (hMSPackageManager.isApkUpdateNecessary(this.a)) {
            HMSLog.i("AvailableAdapter", "The current version does not meet the minimum version requirements");
            return 2;
        } else {
            return 0;
        }
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else if (d.get() && Looper.getMainLooper() != Looper.myLooper()) {
            HMSLog.i("AvailableAdapter", "Another thread start to resolution.");
            a(availableCallBack);
        } else {
            if (d.compareAndSet(false, true)) {
                HMSLog.i("AvailableAdapter", "Start to resolution for the 1st time.");
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                HMSLog.i("AvailableAdapter", "main thread invokes resolution.");
            }
            HMSLog.i("AvailableAdapter", "startResolution");
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.c);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.a);
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, a(activity));
            activity.startActivity(intentStartBridgeActivity);
        }
    }

    public final void a(AvailableCallBack availableCallBack) {
        int i = 0;
        while (d.get()) {
            if (i >= 300) {
                HMSLog.i("AvailableAdapter", "Previous popup is not handled by user or download has not finished within 1min.");
                if (availableCallBack != null) {
                    availableCallBack.onComplete(27);
                    return;
                }
                return;
            }
            try {
                HMSLog.d("AvailableAdapter", "Concurrent startResolution thread is waiting.");
                Thread.sleep(200L);
                i++;
            } catch (InterruptedException unused) {
                HMSLog.d("AvailableAdapter", "Concurrent startResolution thread waiting is interrupted.");
            }
        }
        HMSLog.i("AvailableAdapter", "Concurrent startResolution thread waiting finished.");
        if (availableCallBack != null) {
            availableCallBack.onComplete(e);
        }
    }

    public final boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() >= 40000000) {
            HMSLog.i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
            return true;
        }
        return false;
    }

    public final AvailableCallBack a() {
        return this.b;
    }
}
