package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.meituan.passport.UserCenter;
import com.vivo.push.PushClientConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e0 extends n {
    public BroadcastReceiver j;
    public Handler k = new Handler();
    public int l = 0;
    public Handler m = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SafeBundle safeBundle = new SafeBundle((Bundle) message.obj);
            switch (message.what) {
                case 101:
                    e0.this.a(safeBundle);
                    return;
                case 102:
                    e0.this.b(safeBundle);
                    return;
                case 103:
                    e0.this.c(safeBundle);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.c(14);
        }

        public /* synthetic */ b(e0 e0Var, a aVar) {
            this();
        }
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver;
        Activity b2 = b();
        if (b2 == null || (broadcastReceiver = this.j) == null) {
            return;
        }
        b2.unregisterReceiver(broadcastReceiver);
        this.j = null;
    }

    public void e() {
        c(13, this.f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2000;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.c == null) {
            return;
        }
        this.f = 0;
        if (a(activity)) {
            return;
        }
        if (!a(true)) {
            c(8, this.f);
        } else {
            a(8, this.f);
        }
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.k.removeCallbacksAndMessages(null);
        d();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        HMSLog.i("SilentUpdateWizard", "onBridgeActivityResult requestCode is " + i + "resultCode is " + i2);
        if (i == getRequestCode()) {
            if (i2 == 0) {
                c();
                b(UserCenter.TYPE_LOGOUT_NEGATIVE);
                return true;
            } else if (i2 == 4) {
                e();
                return true;
            } else {
                if (!a(true)) {
                    c(i2, this.f);
                } else {
                    a(i2, this.f);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
    }

    public final void b(int i) {
        this.k.removeCallbacksAndMessages(null);
        this.k.postDelayed(new b(this, null), i);
    }

    public final void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.progress.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.installerservice.Receiver");
        this.j = new m(this.m);
        Activity b2 = b();
        if (b2 != null) {
            b2.registerReceiver(this.j, intentFilter);
        }
    }

    public final boolean a(Activity activity) {
        if (TextUtils.isEmpty(this.g)) {
            return false;
        }
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.g);
            jSONObject.put("versioncode", this.i);
            jSONArray.put(jSONObject);
            intent.putExtra("params", jSONArray.toString());
            intent.putExtra("isHmsOrApkUpgrade", this.c.d());
            intent.putExtra("buttonDlgY", ResourceLoaderUtil.getString("hms_install"));
            intent.putExtra("buttonDlgN", ResourceLoaderUtil.getString("hms_cancel"));
            intent.putExtra("upgradeDlgContent", ResourceLoaderUtil.getString("hms_update_message_new", "%P"));
            try {
                HMSLog.i("SilentUpdateWizard", "start silent activity of AppMarket");
                activity.startActivityForResult(intent, getRequestCode());
                HMSLog.i("SilentUpdateWizard", "start silent activity finished");
                return true;
            } catch (ActivityNotFoundException unused) {
                HMSLog.e("SilentUpdateWizard", "ActivityNotFoundException");
                return false;
            }
        } catch (JSONException e) {
            HMSLog.e("SilentUpdateWizard", "create hmsJsonObject fail" + e.getMessage());
            return false;
        }
    }

    public final void b(SafeBundle safeBundle) {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.g) && safeBundle.containsKey("UpgradeDownloadProgress") && safeBundle.containsKey("UpgradeAppName")) {
            int i = safeBundle.getInt("UpgradeDownloadProgress");
            HMSLog.i("SilentUpdateWizard", "handlerDownloadProgress-progress is " + i);
            b(UserCenter.TYPE_LOGOUT_NEGATIVE);
            if (i >= 99) {
                i = 99;
            }
            this.l = i;
            if (this.d == null) {
                a(w.class);
            }
            o oVar = this.d;
            if (oVar != null) {
                ((w) oVar).b(i);
            }
        }
    }

    public final void c(int i) {
        this.k.removeCallbacksAndMessages(null);
        d();
        a();
        if (!a(false)) {
            c(i, this.f);
        } else {
            a(i, this.f);
        }
    }

    public final void c(SafeBundle safeBundle) {
        if (safeBundle.containsKey("packagename") && safeBundle.containsKey("status")) {
            String string = safeBundle.getString("packagename");
            int i = safeBundle.getInt("status");
            HMSLog.i("SilentUpdateWizard", "handlerInstallStatus-status is " + i);
            if (string == null || !string.equals(this.g)) {
                return;
            }
            if (i == 2) {
                this.k.removeCallbacksAndMessages(null);
                o oVar = this.d;
                if (oVar != null) {
                    ((w) oVar).b(100);
                }
                c(0, this.f);
            } else if (i != -1 && i != -2) {
                b(60000);
            } else {
                c(i);
            }
        }
    }

    public final void a(SafeBundle safeBundle) {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.g) && safeBundle.containsKey("downloadtask.status")) {
            int i = safeBundle.getInt("downloadtask.status");
            HMSLog.i("SilentUpdateWizard", "handleDownloadStatus-status is " + i);
            if (i == 3 || i == 5 || i == 6 || i == 8) {
                c(i);
            } else if (i == 4) {
                b(60000);
            } else {
                b(UserCenter.TYPE_LOGOUT_NEGATIVE);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void a(Class<? extends o> cls) {
        try {
            o newInstance = cls.newInstance();
            if (this.l > 0 && (newInstance instanceof w)) {
                ((w) newInstance).a(this.l);
            }
            newInstance.a(this);
            this.d = newInstance;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
