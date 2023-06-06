package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.bi;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes6.dex */
public final class bj implements Runnable {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String[] strArr;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 4612);
            bi.a(this.a);
            bi.a(this.a, packageInfo);
            Context context = this.a;
            HashSet hashSet = new HashSet();
            String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
            hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
            if (packageInfo.permissions != null) {
                for (PermissionInfo permissionInfo : packageInfo.permissions) {
                    if (str.equals(permissionInfo.name)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                throw new bi.a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
            }
            if (packageInfo.requestedPermissions != null) {
                for (String str2 : packageInfo.requestedPermissions) {
                    if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                        hashSet.remove(str2);
                        if (hashSet.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                throw new bi.a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
            }
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
