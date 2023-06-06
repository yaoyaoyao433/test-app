package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.AppInfoAdapter;
import com.huawei.updatesdk.service.otaupdate.UpdateParams;
import com.tencent.mapsdk.internal.y;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static void a() {
        d.a().a((CheckUpdateCallBack) null);
        List<AsyncTask> a = com.huawei.updatesdk.b.g.b.a();
        if (a == null || a.isEmpty()) {
            return;
        }
        for (AsyncTask asyncTask : a) {
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
        }
        a.clear();
    }

    private static void a(Context context) {
        com.huawei.updatesdk.a.b.a.a.a(context);
        new StringBuilder("UpdateSDK version is: 3.0.1.300 ,flavor: envrelease ,pkgName: ").append(context.getPackageName());
        if (com.huawei.updatesdk.b.c.b.a().b() == 3) {
            com.huawei.updatesdk.a.a.d.h.a.b(context);
        }
    }

    public static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, AppInfoAdapter appInfoAdapter) {
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName()) && !TextUtils.equals(f.f().c(), appInfoAdapter.getAppStorePkgName())) {
            f.f().d(appInfoAdapter.getAppStorePkgName());
        }
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
            f.f().c(appInfoAdapter.getBusiness());
        }
        a(context, apkUpgradeInfo, appInfoAdapter != null && appInfoAdapter.isMustBtnOne(), true);
    }

    public static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        a(context, apkUpgradeInfo, z, false);
    }

    private static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z, boolean z2) {
        StringBuilder sb;
        String securityException;
        if (context == null || apkUpgradeInfo == null) {
            return;
        }
        Intent intent = new Intent(context, AppUpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("app_update_parm", apkUpgradeInfo);
        bundle.putBoolean("app_must_btn", z);
        bundle.putBoolean("is_apptouch", z2);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(y.a);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            sb = new StringBuilder("go AppUpdateActivity error: ");
            securityException = e.toString();
            sb.append(securityException);
            Log.e("UpdateSdk", sb.toString());
        } catch (SecurityException e2) {
            sb = new StringBuilder("go AppUpdateActivity security error: ");
            securityException = e2.toString();
            sb.append(securityException);
            Log.e("UpdateSdk", sb.toString());
        }
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, AppInfoAdapter appInfoAdapter) {
        if (context == null) {
            return;
        }
        UpdateParams.Builder builder = new UpdateParams.Builder();
        String str = null;
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
            str = appInfoAdapter.getBusiness();
        }
        f.f().c(str);
        if (appInfoAdapter != null) {
            if (!TextUtils.isEmpty(appInfoAdapter.getServiceZone())) {
                builder.setServiceZone(appInfoAdapter.getServiceZone());
            }
            a(appInfoAdapter.getAppStorePkgName());
            builder.setTargetPkgName(appInfoAdapter.getTargetPkgName()).setPackageList(appInfoAdapter.getPackageList()).setMustBtnOne(appInfoAdapter.isMustBtnOne()).setIsShowImmediate(appInfoAdapter.isShowImmediate()).setMinIntervalDay(appInfoAdapter.getMinIntervalDay());
        }
        UpdateParams build = builder.build();
        build.resetParamList();
        a(context, build, checkUpdateCallBack, !TextUtils.isEmpty(str));
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, int i, boolean z2) {
        if (context == null || !com.huawei.updatesdk.a.a.d.i.a.d(context)) {
            return;
        }
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        long b = com.huawei.updatesdk.b.b.a.d().b();
        if (i == 0 || Math.abs(currentTimeMillis - b) >= i * 86400000) {
            com.huawei.updatesdk.b.b.a.d().a(currentTimeMillis);
            e eVar = new e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).setMinIntervalDay(i).build(), checkUpdateCallBack);
            eVar.b(true);
            com.sankuai.waimai.launcher.util.aop.b.a(eVar, com.huawei.updatesdk.b.g.c.b, new Void[0]);
        }
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, boolean z2) {
        if (context == null) {
            return;
        }
        if (com.huawei.updatesdk.a.a.d.i.a.d(context)) {
            a(context);
            com.sankuai.waimai.launcher.util.aop.b.a(new e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).build(), checkUpdateCallBack), com.huawei.updatesdk.b.g.c.b, new Void[0]);
            return;
        }
        if (checkUpdateCallBack != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent);
        }
        Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_no_available_network_prompt_toast"), 0).show();
    }

    public static void a(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || updateParams == null || checkUpdateCallBack == null) {
            return;
        }
        a(context);
        updateParams.resetParamList();
        b(context, updateParams, checkUpdateCallBack);
    }

    private static void a(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack, boolean z) {
        if (context == null || updateParams == null || checkUpdateCallBack == null) {
            return;
        }
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        long b = com.huawei.updatesdk.b.b.a.d().b();
        if (updateParams.getMinIntervalDay() == 0 || Math.abs(currentTimeMillis - b) >= updateParams.getMinIntervalDay() * 86400000) {
            if (!com.huawei.updatesdk.a.a.d.i.a.d(context)) {
                Intent intent = new Intent();
                intent.putExtra("status", 2);
                checkUpdateCallBack.onUpdateInfo(intent);
                return;
            }
            com.huawei.updatesdk.b.b.a.d().a(currentTimeMillis);
            e eVar = new e(context, updateParams, checkUpdateCallBack);
            eVar.a(z);
            com.sankuai.waimai.launcher.util.aop.b.a(eVar, com.huawei.updatesdk.b.g.c.b, new Void[0]);
        }
    }

    public static void a(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || TextUtils.isEmpty(str) || checkUpdateCallBack == null) {
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 1);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
        } else if (com.huawei.updatesdk.a.a.d.i.a.d(context)) {
            a(context);
            com.sankuai.waimai.launcher.util.aop.b.a(new e(context, new UpdateParams.Builder().setMustBtnOne(false).setTargetPkgName(str).build(), checkUpdateCallBack), com.huawei.updatesdk.b.g.c.b, new Void[0]);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent2);
        }
    }

    public static void a(String str) {
        f.f().d(str);
    }

    public static void b(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        a(context, updateParams, checkUpdateCallBack, false);
    }

    public static void b(String str) {
        f.f().b(str);
    }
}
