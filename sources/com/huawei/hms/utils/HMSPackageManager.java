package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.device.a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HMSPackageManager {
    public static HMSPackageManager f;
    public static final Object g = new Object();
    public static final Object h = new Object();
    public final Context a;
    public final PackageManagerHelper b;
    public String c;
    public String d;
    public int e;

    public HMSPackageManager(Context context) {
        this.a = context;
        this.b = new PackageManagerHelper(context);
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (g) {
            if (f == null) {
                if (context.getApplicationContext() != null) {
                    f = new HMSPackageManager(context.getApplicationContext());
                } else {
                    f = new HMSPackageManager(context);
                }
                f.b();
            }
        }
        return f;
    }

    public final Pair<String, String> a() {
        List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
        if (queryIntentServices.size() == 0) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for metadata is null");
            } else if (!bundle.containsKey("hms_app_signer")) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no signer");
            } else if (bundle.containsKey("hms_app_cert_chain")) {
                String packageSignature = this.b.getPackageSignature(str);
                if (!a(str + "&" + packageSignature, bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    HMSLog.e("HMSPackageManager", "checkSinger failed");
                } else {
                    return new Pair<>(str, packageSignature);
                }
            } else {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            }
        }
        return null;
    }

    public final void b() {
        synchronized (h) {
            Pair<String, String> a = a();
            if (a == null) {
                HMSLog.e("HMSPackageManager", "Failed to find HMS apk");
                this.c = null;
                this.d = null;
                this.e = 0;
                return;
            }
            this.c = (String) a.first;
            this.d = (String) a.second;
            this.e = this.b.getPackageVersionCode(getHMSPackageName());
            HMSLog.i("HMSPackageManager", "Succeed to find HMS apk: " + this.c + " version: " + this.e);
        }
    }

    public final boolean c() {
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        }
        return true;
    }

    public String getHMSFingerprint() {
        String str = this.d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        refresh();
        String str = this.c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                b();
            }
            String str2 = this.c;
            if (str2 != null) {
                return str2;
            }
        }
        return (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates("com.huawei.hwid")) || this.b.getPackageSignature("com.huawei.hwid").equalsIgnoreCase("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05")) ? "com.huawei.hwid" : "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d)) {
            PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.c);
            return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.d.equals(this.b.getPackageSignature(this.c))) ? packageStates : PackageManagerHelper.PackageStates.NOT_INSTALLED;
        }
        b();
        return this.b.getPackageStates(this.c);
    }

    public int getHmsVersionCode() {
        return this.b.getPackageVersionCode(getHMSPackageName());
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.e >= i || !c()) {
            return true;
        }
        this.e = this.b.getPackageVersionCode(getHMSPackageName());
        return this.e >= i;
    }

    public boolean isApkUpdateNecessary(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        return c() && hmsVersionCode < i;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            b();
        }
    }

    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> b = a.b(str3);
            if (b.size() == 0) {
                HMSLog.e("HMSPackageManager", "certChain is empty");
                return false;
            } else if (!a.a(a.a(this.a), b)) {
                HMSLog.e("HMSPackageManager", "failed to verify cert chain");
                return false;
            } else {
                X509Certificate x509Certificate = b.get(b.size() - 1);
                if (!a.a(x509Certificate, "Huawei CBG HMS")) {
                    HMSLog.e("HMSPackageManager", "CN is invalid");
                    return false;
                } else if (!a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                    HMSLog.e("HMSPackageManager", "OU is invalid");
                    return false;
                } else if (a.a(x509Certificate, str, str2)) {
                    return true;
                } else {
                    HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
                    return false;
                }
            }
        }
        HMSLog.e("HMSPackageManager", "args is invalid");
        return false;
    }
}
