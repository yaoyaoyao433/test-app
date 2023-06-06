package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f0 extends n implements f {
    public e j;
    public g k;
    public int l = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ f a;
        public final /* synthetic */ int b;
        public final /* synthetic */ g c;

        public a(f fVar, int i, g gVar) {
            this.a = fVar;
            this.b = i;
            this.c = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements CheckUpdateCallBack {
        public final /* synthetic */ f a;

        public b(f fVar) {
            this.a = fVar;
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            HMSLog.e("UpdateWizard", "onMarketStoreError responseCode: " + i);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent != null) {
                f0.this.a(intent, this.a);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            HMSLog.e("UpdateWizard", "onUpdateStoreError responseCode: " + i);
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void b(o oVar) {
        HMSLog.i("UpdateWizard", "Enter onDoWork.");
        if (oVar instanceof y) {
            oVar.b();
            a(q.class);
            a(this);
        } else if (oVar instanceof v) {
            oVar.b();
            g();
        } else if (oVar instanceof u) {
            a(w.class);
            f();
        } else if (oVar instanceof t) {
            a(w.class);
            f();
        } else if (oVar instanceof b0) {
            e();
        } else if (oVar instanceof c0) {
            e();
        } else if (oVar instanceof d0) {
            e();
        }
    }

    public final void c() {
        e eVar = this.j;
        if (eVar != null) {
            eVar.a();
            this.j = null;
        }
    }

    public final void d() {
        Activity b2 = b();
        String netType = b2 != null ? SystemUtils.getNetType(b2.getBaseContext()) : "";
        HMSLog.i("UpdateWizard", "current network is " + netType);
        if ("WIFI".equals(netType)) {
            a(w.class);
            f();
            HMSLog.i("UpdateWizard", "current network is wifi");
            return;
        }
        a(t.class);
        HMSLog.i("UpdateWizard", "current network is not wifi");
    }

    public final void e() {
        if (!a(false)) {
            c(8, this.f);
        } else {
            a(8, this.f);
        }
    }

    public final void f() {
        Activity b2 = b();
        if (b2 != null && !b2.isFinishing()) {
            if (a(b2)) {
                c();
                this.j = new c(new d(b2));
                this.j.a(this, this.k);
                return;
            }
            return;
        }
        a(c0.class);
    }

    public void g() {
        c(13, this.f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.c == null) {
            return;
        }
        this.f = 6;
        if (a(activity)) {
            if (this.c.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
                a(y.class);
                return;
            }
            a(q.class);
            a(this);
        }
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        c();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f == 6 && i == getRequestCode()) {
            if (a(this.g, this.i)) {
                c(0, this.f);
                return true;
            }
            e();
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.i("UpdateWizard", "In onKeyUp, Call finish.");
            Activity b2 = b();
            if (b2 == null || b2.isFinishing()) {
                return;
            }
            b2.setResult(0, null);
            b2.finish();
        }
    }

    public static Uri a(Context context, File file) {
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String str = packageName + UpdateProvider.AUTHORITIES_SUFFIX;
        if (Build.VERSION.SDK_INT > 23 && (context.getApplicationInfo().targetSdkVersion > 23 || packageManagerHelper.hasProvider(packageName, str))) {
            return UpdateProvider.getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }

    public static void a(f fVar, int i, g gVar) {
        if (fVar != null) {
            new Handler(Looper.getMainLooper()).post(new a(fVar, i, gVar));
        }
    }

    public final boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.c.c())) {
            return true;
        }
        a();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a(int i, g gVar) {
        HMSLog.i("UpdateWizard", "Enter onCheckUpdate, status: " + h.a(i));
        if (i != 1000) {
            switch (i) {
                case 1201:
                case 1202:
                case 1203:
                    a(b0.class);
                    return;
                default:
                    a(b0.class);
                    return;
            }
        }
        this.k = gVar;
        d();
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a(int i, int i2, int i3, File file) {
        HMSLog.i("UpdateWizard", "Enter onDownloadPackage, status: " + h.a(i) + ", reveived: " + i2 + ", total: " + i3);
        if (i == 2000) {
            a();
            if (file == null) {
                e();
            } else if (FileUtil.verifyHash(this.k.e, file)) {
                a(file);
            } else {
                HMSLog.i("UpdateWizard", "Hash value mismatch for download file");
            }
        } else if (i != 2100) {
            if (i != 2101) {
                switch (i) {
                    case PushConstants.ON_TIME_NOTIFICATION /* 2201 */:
                        a(c0.class);
                        return;
                    case PushConstants.DELAY_NOTIFICATION /* 2202 */:
                        a(u.class);
                        return;
                    case 2203:
                    case 2204:
                        a(d0.class);
                        return;
                    default:
                        return;
                }
            }
        } else {
            o oVar = this.d;
            if (oVar == null || !(oVar instanceof w)) {
                return;
            }
            int i4 = 0;
            if (i2 >= 0 && i3 > 0) {
                i4 = (int) ((i2 * 100) / i3);
            }
            this.l = i4;
            ((w) this.d).b(i4);
        }
    }

    public final void a(File file) {
        Activity b2 = b();
        if (b2 == null || b2.isFinishing()) {
            return;
        }
        Uri a2 = a(b2, file);
        if (a2 == null) {
            HMSLog.e("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
            e();
        } else if (a(b2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(a2, "application/vnd.android.package-archive");
            intent.setFlags(3);
            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            try {
                b2.startActivityForResult(intent, getRequestCode());
            } catch (ActivityNotFoundException e) {
                HMSLog.e("UpdateWizard", "In startInstaller, Failed to start package installer." + e.getMessage());
                e();
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void a(o oVar) {
        HMSLog.i("UpdateWizard", "Enter onCancel.");
        if (oVar instanceof y) {
            g();
        } else if (oVar instanceof q) {
            c();
            g();
        } else if (oVar instanceof w) {
            c();
            a(v.class);
        } else if (oVar instanceof v) {
            a(w.class);
            f();
        } else if (oVar instanceof u) {
            g();
        } else if (oVar instanceof t) {
            g();
        } else {
            e();
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void a(Class<? extends o> cls) {
        if (a(b())) {
            a();
            try {
                o newInstance = cls.newInstance();
                if (!TextUtils.isEmpty(this.h) && (newInstance instanceof y)) {
                    this.h = ResourceLoaderUtil.getString("hms_update_title");
                    ((y) newInstance).a(this.h);
                }
                if (this.l > 0 && (newInstance instanceof w)) {
                    ((w) newInstance).a(this.l);
                }
                newInstance.a(this);
                this.d = newInstance;
            } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
                HMSLog.e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            }
        }
    }

    public final void a(f fVar) {
        if (fVar == null) {
            return;
        }
        Activity b2 = b();
        if (b2 != null && !b2.isFinishing()) {
            if (a(b2)) {
                UpdateSdkAPI.checkTargetAppUpdate(b2, this.c.b(), new b(fVar));
                return;
            }
            return;
        }
        a(fVar, 1201, (g) null);
    }

    public final void a(Intent intent, f fVar) {
        try {
            int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "status", -99);
            HMSLog.i("UpdateWizard", "CheckUpdateCallBack status is " + a2);
            String a3 = com.sankuai.waimai.platform.utils.f.a(intent, UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(a3)) {
                HMSLog.e("UpdateWizard", "checkTargetAppUpdate reason is " + a3);
            }
            if (a2 != 7) {
                if (a2 == 3) {
                    a(fVar, 1202, (g) null);
                    return;
                } else {
                    a(fVar, 1201, (g) null);
                    return;
                }
            }
            Serializable c = com.sankuai.waimai.platform.utils.f.c(intent, UpdateKey.INFO);
            if (c instanceof ApkUpgradeInfo) {
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) c;
                String package_ = apkUpgradeInfo.getPackage_();
                int versionCode_ = apkUpgradeInfo.getVersionCode_();
                String downurl_ = apkUpgradeInfo.getDownurl_();
                int size_ = apkUpgradeInfo.getSize_();
                String sha256_ = apkUpgradeInfo.getSha256_();
                if (!TextUtils.isEmpty(package_) && package_.equals(this.c.b())) {
                    if (versionCode_ < this.c.c()) {
                        HMSLog.e("UpdateWizard", "CheckUpdateCallBack versionCode is " + versionCode_ + "bean.getClientVersionCode() is " + this.c.c());
                        a(fVar, 1203, (g) null);
                        return;
                    } else if (!TextUtils.isEmpty(downurl_) && !TextUtils.isEmpty(sha256_)) {
                        a(fVar, 1000, new g(package_, versionCode_, downurl_, size_, sha256_));
                        return;
                    } else {
                        a(fVar, 1201, (g) null);
                        return;
                    }
                }
                a(fVar, 1201, (g) null);
            }
        } catch (Exception e) {
            HMSLog.e("UpdateWizard", "intent has some error" + e.getMessage());
            a(fVar, 1201, (g) null);
        }
    }
}
