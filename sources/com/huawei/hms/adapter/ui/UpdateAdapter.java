package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {
    public WeakReference<Activity> a;
    public int b;
    public UpdateBean c;
    public String d;

    public final void a() {
        Activity b = b();
        if (b == null || b.isFinishing()) {
            return;
        }
        b.finish();
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        this.b = f.a(intent, CommonCode.MapKey.UPDATE_VERSION, 0);
        if (this.b == 0) {
            c();
        } else if (f.a(intent, CommonCode.MapKey.NEW_UPDATE, false)) {
            HMSLog.i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
            String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
            Intent intent2 = new Intent();
            intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
            intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
            intent2.setComponent(componentName);
            activity.startActivityForResult(intent2, 1001);
        } else {
            this.d = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            HMSLog.i("UpdateAdapter", "target HMS Core packageName is " + this.d);
            updateBean.setClientPackageName(this.d);
            updateBean.setClientVersionCode(this.b);
            updateBean.setClientAppId("C10132067");
            if (ResourceLoaderUtil.getmContext() == null && activity != null) {
                ResourceLoaderUtil.setmContext(activity.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            this.c = updateBean;
            HMSLog.i("UpdateAdapter", "old framework HMSCore upgrade process");
            UpdateManager.startUpdate(activity, 1001, updateBean);
            this.c = null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("UpdateAdapter", "onBridgeActivityDestroy");
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            this.c = null;
            return false;
        }
        HMSLog.i("UpdateAdapter", "onBridgeActivityResult");
        if (i2 == 1214) {
            HMSLog.i("UpdateAdapter", "Enter update escape route");
            Activity b = b();
            if (b == null) {
                HMSLog.e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.c = null;
                return true;
            }
            UpdateManager.startUpdate(b, 1001, this.c);
            this.c = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                if (f.a(intent, KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.c = null;
                    a();
                    return true;
                }
                int a = f.a(intent, BridgeActivity.EXTRA_RESULT, -1);
                if (a == 0) {
                    HMSLog.i("UpdateAdapter", "Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                } else if (a == 13) {
                    HMSLog.i("UpdateAdapter", "Resolve error process canceled by user!");
                    SystemManager.getInstance().notifyUpdateResult(13);
                } else if (a == 8) {
                    HMSLog.i("UpdateAdapter", "Internal error occurred, recommended retry.");
                    SystemManager.getInstance().notifyUpdateResult(8);
                } else {
                    HMSLog.i("UpdateAdapter", "Other error codes.");
                    SystemManager.getInstance().notifyUpdateResult(a);
                }
            }
        } else if (i2 == 0) {
            HMSLog.i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.c = null;
            Activity b2 = b();
            if (b2 == null) {
                return true;
            }
            if (a(b2, HMSPackageManager.getInstance(b2.getApplicationContext()).getHMSPackageName(), this.b)) {
                HMSLog.i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("UpdateAdapter", "On key up when resolve conn error");
    }

    public final boolean a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str) && i != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i) {
                return true;
            }
        }
        return false;
    }
}
