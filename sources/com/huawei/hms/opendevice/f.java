package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f implements Runnable {
    public Context a;

    public f(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        ApplicationInfo applicationInfo;
        try {
            int internalCode = ErrorEnum.SUCCESS.getInternalCode();
            try {
                str = HmsInstanceId.getInstance(this.a).getToken(Util.getAppId(this.a), null);
                try {
                    HMSLog.i("AutoInit", "Push init succeed");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                } catch (ApiException e) {
                    e = e;
                    internalCode = e.getStatusCode();
                    HMSLog.e("AutoInit", "Push init failed");
                    applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
                    if (applicationInfo.metaData == null) {
                    }
                    HMSLog.i("AutoInit", "push kit sdk not exists");
                }
            } catch (ApiException e2) {
                e = e2;
                str = null;
            }
            try {
                applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
                if (applicationInfo.metaData == null && applicationInfo.metaData.getString("com.huawei.hms.client.service.name:push") != null) {
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.a.getPackageName());
                    Bundle bundle = new Bundle();
                    bundle.putString(RemoteMessageConst.MSGTYPE, "new_token");
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, str);
                    bundle.putInt("error", internalCode);
                    if (new h().a(this.a, bundle, intent)) {
                        return;
                    }
                    HMSLog.e("AutoInit", "start service failed");
                    return;
                }
                HMSLog.i("AutoInit", "push kit sdk not exists");
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.i("AutoInit", "push kit sdk not exists");
            }
        } catch (Exception e3) {
            HMSLog.e("AutoInit", "Push init failed", e3);
        }
    }
}
