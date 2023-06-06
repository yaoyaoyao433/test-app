package com.meituan.android.common.unionid.oneid.appid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DESHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PackageUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashSet<String> mPackageNameBlackList = new HashSet<String>() { // from class: com.meituan.android.common.unionid.oneid.appid.PackageUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            add("com.sankuai.hardware.");
            add("com.sankuai.mtra_");
        }
    };
    private static final Map<String, WeakReference<PackageInfo>> providerPackageInfoMap = new ConcurrentHashMap();
    private static final List<String> ENCRYPTED_DEFAULT_PACKAGES = Arrays.asList("Swx5MhmpsUWrzFF8cxvhVr5m5JEuFJXZ", "Swx5MhmpsUWrzFF8cxvhVsr/9+LU12ie1BlGJO01/Fs=", "9KS4FZP/RfAQ/zKFPcCF4A==", "Swx5MhmpsUWrzFF8cxvhVgl+0+HHsKjZOPL5bscjIgr/bHJ+EtBCHw==", "Swx5MhmpsUWrzFF8cxvhVgl+0+HHsKjZEzVgbKqPjLi6iC6eSMb6SbNhxETPGGW9", "Swx5MhmpsUWrzFF8cxvhVs0YNI177aTlGGpzSY4YHdREHUwEgvb2yyFcdwnCgrUa", "Swx5MhmpsUWrzFF8cxvhVvdRx6HaYtb9SY1sUCToqXw=", "Swx5MhmpsUVxI5kRwsr9uzh8GVShuc4R", "9KS4FZP/RfAx+n+5o26Pys0KrjexB3XU", "sa0WpZpDt+uchVVhi36Os9hUbqWqhzQk4fRwhChyT48=", "sa0WpZpDt+uchVVhi36Os489I/EbaX2L");
    public static final List<String> packageList = new ArrayList();

    static {
        if (ENCRYPTED_DEFAULT_PACKAGES != null) {
            for (String str : ENCRYPTED_DEFAULT_PACKAGES) {
                String decrypt = DESHelper.decrypt(str, "hqNc7zdG");
                if (!TextUtils.isEmpty(decrypt)) {
                    packageList.add(decrypt);
                }
            }
        }
    }

    public static List<String> getPackageNameList(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69d08505e074c2b7c2a40f8a572f3a8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69d08505e074c2b7c2a40f8a572f3a8b");
        }
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!packageList.contains(context.getPackageName())) {
                packageList.add(context.getPackageName());
            }
            for (String str : packageList) {
                WeakReference<PackageInfo> weakReference = providerPackageInfoMap.get(str);
                PackageInfo packageInfo = weakReference != null ? weakReference.get() : null;
                if (packageInfo == null) {
                    try {
                        packageInfo = packageManager.getPackageInfo(str, 8);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (packageInfo != null) {
                        providerPackageInfoMap.put(str, new WeakReference<>(packageInfo));
                    }
                }
                if (!filterBlackList(str) && isUUIDProviderExist(packageInfo, str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable unused2) {
        }
        arrayList.remove(context.getPackageName());
        return arrayList;
    }

    private static boolean isUUIDProviderExist(PackageInfo packageInfo, String str) {
        ProviderInfo[] providerInfoArr;
        Object[] objArr = {packageInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "694ead505e00cacf775da9dbd604bc1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "694ead505e00cacf775da9dbd604bc1a")).booleanValue();
        }
        if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (!TextUtils.isEmpty(providerInfo.authority)) {
                    if (providerInfo.authority.contains(str + ".AppIdProvider")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean filterBlackList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca01c0ef09610365a995d0e07e2934d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca01c0ef09610365a995d0e07e2934d1")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator<String> it = mPackageNameBlackList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                return str.startsWith(next);
            }
        }
        return false;
    }
}
