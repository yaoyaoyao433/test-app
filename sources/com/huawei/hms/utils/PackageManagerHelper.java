package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PackageManagerHelper {
    public final PackageManager a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public PackageManagerHelper(Context context) {
        this.a = context.getPackageManager();
    }

    public final byte[] a(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e.getMessage());
        }
        HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getPackageSignature(String str) {
        byte[] a = a(str);
        if (a == null || a.length == 0) {
            return null;
        }
        return HEX.encodeHexString(SHA256.digest(a), true);
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            return PackageStates.NOT_INSTALLED;
        }
        try {
            if (this.a.getApplicationInfo(str, 0).enabled) {
                return PackageStates.ENABLED;
            }
            return PackageStates.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    public String getPackageVersionName(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            return (packageInfo == null || packageInfo.versionName == null) ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 8);
            if (packageInfo != null && packageInfo.providers != null) {
                for (ProviderInfo providerInfo : packageInfo.providers) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        Exception e;
        InputStream inputStream;
        PackageInfo packageArchiveInfo = this.a.getPackageArchiveInfo(str, 64);
        if (packageArchiveInfo == null || packageArchiveInfo.signatures.length <= 0 || !str2.equals(packageArchiveInfo.packageName)) {
            return false;
        }
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
            } catch (IOException | CertificateException e2) {
                e = e2;
                inputStream = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean equalsIgnoreCase = str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance("X.509").generateCertificate(inputStream).getEncoded()), true));
            IOUtils.closeQuietly(inputStream);
            return equalsIgnoreCase;
        } catch (IOException | CertificateException e3) {
            e = e3;
            Exception exc = e;
            inputStream2 = inputStream;
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + exc.getMessage());
            IOUtils.closeQuietly(inputStream2);
            return false;
        } catch (Throwable th2) {
            inputStream2 = inputStream;
            th = th2;
            IOUtils.closeQuietly(inputStream2);
            throw th;
        }
    }
}
