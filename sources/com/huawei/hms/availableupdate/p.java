package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class p extends n {
    @Override // com.huawei.hms.availableupdate.n
    public void a(o oVar) {
        HMSLog.i("AppTouchWizard", "Enter onCancel.");
        if (oVar instanceof y) {
            d();
        }
    }

    @Override // com.huawei.hms.availableupdate.n
    public void b(o oVar) {
        HMSLog.i("AppTouchWizard", "Enter onDoWork.");
        if (oVar instanceof y) {
            oVar.b();
            if (c()) {
                return;
            }
            a(8, this.f);
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
            a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e("AppTouchWizard", "can not open AppTouch detail page");
            return false;
        }
    }

    public void d() {
        c(13, this.f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2007;
    }

    @Override // com.huawei.hms.availableupdate.n, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.c;
        if (updateBean == null) {
            return;
        }
        this.f = 7;
        if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
            a(y.class);
        } else if (c()) {
        } else {
            a(8, this.f);
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
        if (this.f == 7 && i == getRequestCode()) {
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
            HMSLog.i("AppTouchWizard", "In onKeyUp, Call finish.");
            Activity b = b();
            if (b == null || b.isFinishing()) {
                return;
            }
            b.setResult(0, null);
            b.finish();
        }
    }

    public final void a(Intent intent) {
        String str;
        List<ResolveInfo> queryIntentServices = b().getPackageManager().queryIntentServices(new Intent("com.apptouch.intent.action.update_hms"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    str = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        }
        str = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        intent.setPackage(str);
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
            HMSLog.e("AppTouchWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
