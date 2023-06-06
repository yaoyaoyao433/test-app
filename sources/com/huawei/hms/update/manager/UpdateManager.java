package com.huawei.hms.update.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.availableupdate.n;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.StringUtil;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UpdateManager {
    public static boolean a(Context context, String str) {
        PackageManagerHelper.PackageStates packageStates = new PackageManagerHelper(context).getPackageStates(str);
        HMSLog.i("UpdateManager", "app is: " + str + ";status is:" + packageStates);
        return PackageManagerHelper.PackageStates.ENABLED == packageStates;
    }

    public static void b(Context context, ArrayList<Integer> arrayList) {
        if (!a(context, PackageConstants.SERVICES_PACKAGE_APPMARKET) || PackageConstants.SERVICES_PACKAGE_APPMARKET.equals(context.getPackageName())) {
            return;
        }
        arrayList.add(5);
    }

    public static void c(Context context, ArrayList<Integer> arrayList) {
        if (a(context, PackageConstants.SERVICES_PACKAGE_APPMARKET) && !PackageConstants.SERVICES_PACKAGE_APPMARKET.equals(context.getPackageName()) && c(context)) {
            arrayList.add(5);
        } else if (d(context)) {
            arrayList.add(7);
        } else if (a(context)) {
        } else {
            arrayList.add(6);
        }
    }

    public static boolean d(Context context) {
        String str;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.apptouch.intent.action.update_hms"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    str = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str) && SystemUtils.isSystemApp(context.getApplicationContext(), str)) {
                        break;
                    }
                }
            }
        }
        str = null;
        return str != null;
    }

    public static Intent getStartUpdateIntent(Activity activity, UpdateBean updateBean) {
        if (activity == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        } else {
            a(activity, (ArrayList<Integer>) arrayList);
        }
        int i = -2;
        if (arrayList.size() > 0) {
            i = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, n.a(i));
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }

    public static void startUpdate(Activity activity, int i, UpdateBean updateBean) {
        Intent startUpdateIntent = getStartUpdateIntent(activity, updateBean);
        if (startUpdateIntent != null) {
            activity.startActivityForResult(startUpdateIntent, i);
        }
    }

    public static Intent startUpdateIntent(Activity activity) {
        Intent intentStartBridgeActivity;
        if (activity == null) {
            return null;
        }
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        updateBean.setClientVersionCode(HMSPackageManager.getInstance(activity.getApplicationContext()).getHmsVersionCode());
        updateBean.setClientAppId("C10132067");
        updateBean.setNeedConfirm(false);
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        } else {
            a(activity, (ArrayList<Integer>) arrayList);
        }
        updateBean.setTypeList(arrayList);
        if (arrayList.size() > 1) {
            intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, n.a(((Integer) arrayList.get(1)).intValue()));
        } else {
            int i = -2;
            if (arrayList.size() > 0) {
                i = ((Integer) arrayList.get(0)).intValue();
            } else {
                HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
            }
            intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, n.a(i));
        }
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }

    public static boolean b(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        HMSLog.i("UpdateManager", "getHiappVersion is " + packageVersionCode);
        return ((long) packageVersionCode) >= 70203000;
    }

    public static void a(Context context, ArrayList<Integer> arrayList) {
        if (SystemUtils.isTVDevice()) {
            arrayList.add(5);
        } else if (SystemUtils.isSystemApp(context.getApplicationContext(), PackageConstants.SERVICES_PACKAGE_APPMARKET) && b(context) && SystemUtils.isChinaROM()) {
            arrayList.add(0);
            arrayList.add(6);
        } else {
            c(context, arrayList);
        }
    }

    public static boolean c(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            HMSLog.i("UpdateManager", "In isAgNewVersion, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
            return false;
        }
        try {
            applicationInfo = packageManager.getPackageInfo(PackageConstants.SERVICES_PACKAGE_APPMARKET, 128).applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("UpdateManager", "In isAgNewVersion, Failed to read meta data from base version setting channel.");
        }
        if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("com.huawei.hms.client.service.name:base")) {
            String string = applicationInfo.metaData.getString("com.huawei.hms.client.service.name:base");
            if (!TextUtils.isEmpty(string) && string.split(CommonConstant.Symbol.COLON).length == 2) {
                if (StringUtil.convertVersion2Integer(string.split(CommonConstant.Symbol.COLON)[1]) >= 50004100) {
                    return true;
                }
                HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
                return false;
            }
            HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
            return false;
        }
        HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
        return false;
    }

    public static void a(Activity activity, ArrayList<Integer> arrayList) {
        if (!a(activity, PackageConstants.SERVICES_PACKAGE_APPMARKET) || PackageConstants.SERVICES_PACKAGE_APPMARKET.equals(activity.getPackageName())) {
            return;
        }
        arrayList.add(5);
    }

    public static boolean a(Context context) {
        if (context == null) {
            HMSLog.e("UpdateManager", "In getAndroidMarketSetting, context is null.");
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.i("UpdateManager", "In getAndroidMarketSetting, configuration not found for android channel market setting.");
            return true;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("com.huawei.hms.client.channel.androidMarket")) {
                return applicationInfo.metaData.getBoolean("com.huawei.hms.client.channel.androidMarket", true);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("UpdateManager", "In getAndroidMarketSetting, Failed to read meta data from android market channel.");
        }
        HMSLog.i("UpdateManager", "In getAndroidMarketSetting, configuration not found for android channel market setting.");
        return true;
    }

    public static Intent getStartUpdateIntent(Context context, UpdateBean updateBean) {
        if (context == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a(context, arrayList);
        } else {
            b(context, arrayList);
        }
        int i = -2;
        if (arrayList.size() > 0) {
            i = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(context, n.a(i));
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }
}
