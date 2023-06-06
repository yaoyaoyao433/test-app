package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class x extends n {
    @Override // com.huawei.hms.availableupdate.n
    public void a(o oVar) {
        HMSLog.i("HiappWizard", "Enter onCancel.");
        if (oVar instanceof y) {
            d();
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void b(o oVar) {
        HMSLog.i("HiappWizard", "Enter onDoWork.");
        if (oVar instanceof y) {
            oVar.b();
            if (c()) {
                return;
            }
            if (!a(false)) {
                c(8, this.f);
            } else {
                a(8, this.f);
            }
        }
    }

    public final boolean c() {
        Activity b = b();
        if (b == null || b.isFinishing() || TextUtils.isEmpty(this.g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.g);
            if (SystemUtils.isTVDevice()) {
                int packageVersionCode = new PackageManagerHelper(b).getPackageVersionCode("com.hisilicon.android.hiRMService");
                HMSLog.i("HiappWizard", "version " + packageVersionCode);
                if (packageVersionCode == 1) {
                    HMSLog.i("HiappWizard", "startActivity");
                    intent.addFlags(com.tencent.mapsdk.internal.y.a);
                    a(intent);
                    b.startActivity(intent);
                    return true;
                }
            }
            HMSLog.i("HiappWizard", "startActivityForResult");
            a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e("HiappWizard", "can not open hiapp");
            return false;
        }
    }

    public void d() {
        c(13, this.f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2005;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.c;
        if (updateBean == null) {
            return;
        }
        this.f = 5;
        if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
            a(y.class);
        } else if (c()) {
        } else {
            if (!a(false)) {
                c(8, this.f);
            } else {
                a(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f == 5 && i == getRequestCode()) {
            if (a(this.g, this.i)) {
                c(0, this.f);
                return true;
            }
            c(8, this.f);
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.i("HiappWizard", "In onKeyUp, Call finish.");
            Activity b = b();
            if (b == null || b.isFinishing()) {
                return;
            }
            b.setResult(0, null);
            b.finish();
        }
    }

    public final void a(Intent intent) {
        List<ResolveInfo> queryIntentActivities = b().getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_TV);
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_CAR);
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        if (queryIntentActivities.size() == 1) {
            return;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                intent.setPackage(resolveInfo.activityInfo.packageName);
                return;
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void a(Class<? extends o> cls) {
        a();
        try {
            o newInstance = cls.newInstance();
            if (!TextUtils.isEmpty(this.h) && (newInstance instanceof y)) {
                this.h = ResourceLoaderUtil.getString("hms_update_title");
                ((y) newInstance).a(this.h);
            }
            newInstance.a(this);
            this.d = newInstance;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
