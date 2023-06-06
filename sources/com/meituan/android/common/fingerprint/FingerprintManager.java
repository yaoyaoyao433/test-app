package com.meituan.android.common.fingerprint;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.fingerprint.encrypt.DESHelper;
import com.meituan.android.common.fingerprint.info.CellInfo;
import com.meituan.android.common.fingerprint.info.ConnectWifiInfo;
import com.meituan.android.common.fingerprint.info.FingerprintInfo;
import com.meituan.android.common.fingerprint.info.HashInfoWithNumber;
import com.meituan.android.common.fingerprint.info.InstalledAppManager;
import com.meituan.android.common.fingerprint.info.LocationInfo;
import com.meituan.android.common.fingerprint.info.WifiMacInfo;
import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.fingerprint.utils.AudioHashUtils;
import com.meituan.android.common.fingerprint.utils.CommonFingerItemCache;
import com.meituan.android.common.fingerprint.utils.DataStore;
import com.meituan.android.common.fingerprint.utils.FingerItemSerializer;
import com.meituan.android.common.fingerprint.utils.ImageHashUtils;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.android.common.fingerprint.utils.LifecycleManager;
import com.meituan.android.common.fingerprint.utils.Permissions;
import com.meituan.android.common.fingerprint.utils.StringUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FingerprintManager {
    public static final boolean DEBUG_MODE = false;
    public static final String TAG = "fingerprint";
    private static final String TOKEN = "Android-OWL";
    public static final String UNKNOW = "unknown";
    private static final String VERSION = "3.14159265358979323846264338327950288419716939937510";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Integer isRoot;
    private static DataStore mStore;
    private List<CellInfo> cellInfoList;
    private Runnable cellInfoRunnable;
    private Context context;
    private Executor executor;
    private InstalledAppManager installedAppManager;
    private FingerprintInfoProvider provider;

    private static long caculateBytes(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67975aa1e447d19f2afe4d84bdf98f8d", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67975aa1e447d19f2afe4d84bdf98f8d")).longValue() : j * j2;
    }

    public static String getOwlToken() {
        return TOKEN;
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$1() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2686f93e3f3171d4e0542c4bef72deab", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2686f93e3f3171d4e0542c4bef72deab") : "android";
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$10(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "877ee78978ed811e6a6c9de95b1c8019", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "877ee78978ed811e6a6c9de95b1c8019") : str;
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$50() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ce9f390ba9f19ec7e036e765085af78", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ce9f390ba9f19ec7e036e765085af78") : VERSION;
    }

    public FingerprintManager(final Context context, FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {context, fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c48841a4cab2a271463ec39867dc937", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c48841a4cab2a271463ec39867dc937");
            return;
        }
        this.installedAppManager = new InstalledAppManager();
        this.executor = c.a("FingerPrint-cellInfoCollector");
        this.cellInfoList = new ArrayList();
        this.cellInfoRunnable = new Runnable() { // from class: com.meituan.android.common.fingerprint.FingerprintManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                FingerprintManager.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d69085a1959cffab992f48ea82032ee", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d69085a1959cffab992f48ea82032ee");
                    return;
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    FingerprintManager.this.cellInfoList = FingerprintManager.cellInfo(FingerprintManager.this.context);
                    if (FingerprintManager.this.cellInfoList.size() == 0) {
                        StringUtils.setLogan("cell info list is empty, cost: " + (System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    Iterator it = FingerprintManager.this.cellInfoList.iterator();
                    while (it.hasNext()) {
                        int cid = ((CellInfo) it.next()).getCid();
                        if (Integer.MAX_VALUE != cid && !hashMap.containsKey(Integer.valueOf(cid))) {
                            hashMap.put(Integer.valueOf(cid), Boolean.TRUE);
                        }
                        it.remove();
                    }
                    if (FingerprintManager.this.cellInfoList.size() > 10) {
                        for (int size = FingerprintManager.this.cellInfoList.size() - 1; size > 9; size--) {
                            FingerprintManager.this.cellInfoList.remove(size);
                        }
                    }
                    StringUtils.setLogan("cell info list cost: " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    StringUtils.setErrorLogan(th);
                }
            }
        };
        long currentTimeMillis = System.currentTimeMillis();
        this.context = context;
        LifecycleManager.register(context);
        mStore = DataStore.getInstance(context);
        this.installedAppManager.updateAppList(true);
        b.a(this.executor, new Runnable() { // from class: com.meituan.android.common.fingerprint.FingerprintManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                FingerprintManager.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf21331bda6bbf1fa968bf77546aa78f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf21331bda6bbf1fa968bf77546aa78f");
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = context.getSharedPreferences("mtcx", 0);
                if (!sharedPreferences.contains("firstLaunchTime")) {
                    sharedPreferences.edit().putLong("firstLaunchTime", System.currentTimeMillis()).apply();
                }
                StringUtils.setLogan("SharedPreferences_runnable cost: " + (System.currentTimeMillis() - currentTimeMillis2));
            }
        });
        b.a(this.executor, this.cellInfoRunnable);
        this.provider = fingerprintInfoProvider;
        StringUtils.setLogan("owl init finished cost: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public FingerprintManager(Context context, FingerprintInfoProvider fingerprintInfoProvider, HttpClient httpClient) {
        this(context, fingerprintInfoProvider);
        Object[] objArr = {context, fingerprintInfoProvider, httpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba240e5b61e4dfb84f66009f0d4f19a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba240e5b61e4dfb84f66009f0d4f19a");
        } else {
            this.installedAppManager.setClient(httpClient);
        }
    }

    private static <T> T safeLoad(InfoGetter<T> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6284084ae404feefa85eb49df096c16f", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6284084ae404feefa85eb49df096c16f");
        }
        try {
            return infoGetter.get();
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return null;
        }
    }

    public String fingerprint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ad7c559c78c0cf07300c7ccef05c60", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ad7c559c78c0cf07300c7ccef05c60");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            FingerprintInfo fingerprintInfo = new FingerprintInfo();
            if (this.context != null && DataStore.getAppCount() == 0) {
                DataStore.initAppList(this.context);
            }
            setFingerprintInfo(fingerprintInfo);
            String generateFingerprintString = generateFingerprintString(fingerprintInfo, this.provider.key());
            if (TextUtils.isEmpty(generateFingerprintString)) {
                if (isReport(1000)) {
                    MTGlibInterface.raptorFakeAPI("owl_collect_time", 9401, System.currentTimeMillis() - currentTimeMillis);
                }
                StringUtils.setLogan("owl fingerprint finished, result is empty");
            } else {
                if (isReport(1000)) {
                    MTGlibInterface.raptorFakeAPI("owl_collect_time", 200, System.currentTimeMillis() - currentTimeMillis);
                }
                StringUtils.setLogan("owl fingerprint finished, result is not empty");
            }
            return generateFingerprintString;
        } catch (Throwable th) {
            if (isReport(1000)) {
                MTGlibInterface.raptorFakeAPI("owl_collect_time", 9405, System.currentTimeMillis() - currentTimeMillis);
            }
            StringUtils.setErrorLogan(th);
            return StringUtils.getStackTrace(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L13;
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFingerprintInfo(com.meituan.android.common.fingerprint.info.FingerprintInfo r12) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.fingerprint.FingerprintManager.setFingerprintInfo(com.meituan.android.common.fingerprint.info.FingerprintInfo):void");
    }

    public /* synthetic */ ConnectivityManager lambda$setFingerprintInfo$0() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f29c181aac9d959011e2d23842a252e7", 6917529027641081856L) ? (ConnectivityManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f29c181aac9d959011e2d23842a252e7") : (ConnectivityManager) this.context.getSystemService("connectivity");
    }

    public static /* synthetic */ Long lambda$setFingerprintInfo$2(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0737a6801409c31415c67914365cdbe9", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0737a6801409c31415c67914365cdbe9") : Long.valueOf(fingerprintInfoProvider.serverCurrentTimeMillions());
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$3() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "995b12302a4c0d6c2002a5bc30522520", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "995b12302a4c0d6c2002a5bc30522520") : CommonFingerItemCache.CpuStyle;
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$4(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "456437b9fd6539990de19ac26f3421a7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "456437b9fd6539990de19ac26f3421a7") : fingerprintInfoProvider.getPushToken();
    }

    public /* synthetic */ String lambda$setFingerprintInfo$5() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5327817dedf3f798c894aaecb817045", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5327817dedf3f798c894aaecb817045");
        }
        try {
            if (Permissions.isPermissionGrantedFromPrivacy(PermissionGuard.PERMISSION_PHONE_READ, this.context, TOKEN)) {
                String simSerialNumber = Privacy.createTelephonyManager(this.context, TOKEN).getSimSerialNumber();
                return TextUtils.isEmpty(simSerialNumber) ? "unknown" : simSerialNumber;
            }
            return "unknown";
        } catch (Exception e) {
            StringUtils.setErrorLogan(e);
            return "unknown";
        }
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$6() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73c33f6233a894850ab6cd042299ff3b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73c33f6233a894850ab6cd042299ff3b") : Build.DISPLAY;
    }

    public /* synthetic */ String lambda$setFingerprintInfo$7() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02144e273df365aa4e403867ffafc46c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02144e273df365aa4e403867ffafc46c") : CommonFingerItemCache.getMacAddress(this.context, TOKEN);
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$8() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9f2d8d91f581b713ded4cc6ecfb1327", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9f2d8d91f581b713ded4cc6ecfb1327") : Build.BRAND;
    }

    public /* synthetic */ String lambda$setFingerprintInfo$9(ConnectivityManager connectivityManager) {
        Object[] objArr = {connectivityManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "820ceec578d5024b125e0e01d84cf690", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "820ceec578d5024b125e0e01d84cf690") : network(connectivityManager, this.context);
    }

    public /* synthetic */ String lambda$setFingerprintInfo$11() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "014a759d671172478b4e929f81183bf7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "014a759d671172478b4e929f81183bf7");
        }
        if (Permissions.isPermissionGrantedFromPrivacy(PermissionGuard.PERMISSION_PHONE_READ, this.context, TOKEN)) {
            String line1Number = Privacy.createTelephonyManager(this.context, TOKEN).getLine1Number();
            return !TextUtils.isEmpty(line1Number) ? line1Number : "unknown";
        }
        return "unknown";
    }

    public /* synthetic */ String lambda$setFingerprintInfo$12() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e406c2ddefb48f16e2618b24e45219", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e406c2ddefb48f16e2618b24e45219") : detection(this.context);
    }

    public /* synthetic */ String lambda$setFingerprintInfo$13() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e412a0eff091347bd7a70e920d89dea7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e412a0eff091347bd7a70e920d89dea7") : Privacy.createTelephonyManager(this.context, TOKEN).getNetworkOperator();
    }

    public /* synthetic */ Float lambda$setFingerprintInfo$14() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b823d103b8568908548af152c855658b", 6917529027641081856L) ? (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b823d103b8568908548af152c855658b") : Float.valueOf(batteryLevel(this.context));
    }

    public /* synthetic */ List lambda$setFingerprintInfo$15() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9537bb6f991fb479960ffd414e5556c5", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9537bb6f991fb479960ffd414e5556c5") : scanResultToWifiMacInfo();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$16() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2902e1dbca6ccd5ea95c5296c59a14c6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2902e1dbca6ccd5ea95c5296c59a14c6") : Build.MODEL;
    }

    public /* synthetic */ Integer lambda$setFingerprintInfo$17() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77004c2826af4c9c08102e09e3242612", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77004c2826af4c9c08102e09e3242612") : Integer.valueOf(CommonFingerItemCache.getDensityDpi(this.context));
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$18() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87f60f35fed9ac24d9b8ee4ce7f00f64", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87f60f35fed9ac24d9b8ee4ce7f00f64") : CommonFingerItemCache.getCpuMaxFreq();
    }

    public /* synthetic */ String lambda$setFingerprintInfo$19() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05ceed68ebe795d574f6a77f2e52ddcd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05ceed68ebe795d574f6a77f2e52ddcd") : batteryState(this.context);
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$20() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70370f57613a1c47437d0b8113891581", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70370f57613a1c47437d0b8113891581") : Build.VERSION.RELEASE;
    }

    public /* synthetic */ String lambda$setFingerprintInfo$21() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76e194e329b52249732ebe2b0a72aaca", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76e194e329b52249732ebe2b0a72aaca");
        }
        if (!Permissions.isPermissionGrantedFromPrivacy(PermissionGuard.PERMISSION_PHONE_READ, this.context, TOKEN) || this.context.getApplicationInfo().targetSdkVersion >= 29) {
            return "unknown";
        }
        String deviceId = Privacy.createTelephonyManager(this.context, TOKEN).getDeviceId();
        return TextUtils.isEmpty(deviceId) ? "unknown" : deviceId;
    }

    public /* synthetic */ List lambda$setFingerprintInfo$22() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1656dcd7003eb0a80a946b0e79f1d20", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1656dcd7003eb0a80a946b0e79f1d20");
        }
        b.a(this.executor, this.cellInfoRunnable);
        return this.cellInfoList;
    }

    public /* synthetic */ String lambda$setFingerprintInfo$23() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "691201092e8a5c2448e4f215eca8adfd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "691201092e8a5c2448e4f215eca8adfd") : CommonFingerItemCache.getDevicePixels(this.context);
    }

    public /* synthetic */ Float lambda$setFingerprintInfo$24() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d030675a2bd323d0233ff506f7e43c", 6917529027641081856L) ? (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d030675a2bd323d0233ff506f7e43c") : Float.valueOf(systemVolume(this.context));
    }

    public static /* synthetic */ Long lambda$setFingerprintInfo$25() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b987cbab00cd29f77fad7be173d627ed", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b987cbab00cd29f77fad7be173d627ed") : Long.valueOf(Calendar.getInstance().getTimeInMillis());
    }

    public static /* synthetic */ Long lambda$setFingerprintInfo$26() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1941e0fccddd28325f9f0e7ecd8d7ffb", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1941e0fccddd28325f9f0e7ecd8d7ffb") : Long.valueOf((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
    }

    public /* synthetic */ HashInfoWithNumber lambda$setFingerprintInfo$27() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "435971bd276f8d3c625d1b5f2981d7a5", 6917529027641081856L)) {
            return (HashInfoWithNumber) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "435971bd276f8d3c625d1b5f2981d7a5");
        }
        if (mStore.getMusicHashInfo() != null) {
            return mStore.getMusicHashInfo();
        }
        HashInfoWithNumber audioHashList = AudioHashUtils.getAudioHashList(this.context);
        mStore.setMusicHashInfo(audioHashList);
        return audioHashList;
    }

    public /* synthetic */ List lambda$setFingerprintInfo$28() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a8d45c9cb2f184bebb6ed03cac584bd", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a8d45c9cb2f184bebb6ed03cac584bd");
        }
        ConnectWifiInfo connectedWifiMac = connectedWifiMac(this.context);
        return connectedWifiMac == null ? new ArrayList() : Collections.singletonList(connectedWifiMac);
    }

    public static /* synthetic */ List lambda$setFingerprintInfo$29() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e94e705cc3477308ccbf99ef4a94eeb", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e94e705cc3477308ccbf99ef4a94eeb") : new ArrayList();
    }

    public static /* synthetic */ Integer lambda$setFingerprintInfo$30() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1dea8350610bd8d47a6deb92bf506df5", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1dea8350610bd8d47a6deb92bf506df5") : Integer.valueOf(CommonFingerItemCache.getCpuCore());
    }

    public /* synthetic */ String lambda$setFingerprintInfo$31() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d8b2dc76674b9ce8ee0abbc130ea296", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d8b2dc76674b9ce8ee0abbc130ea296");
        }
        if (!Permissions.isPermissionGrantedFromPrivacy(PermissionGuard.PERMISSION_PHONE_READ, this.context, TOKEN) || this.context.getApplicationInfo().targetSdkVersion >= 29) {
            return "unknown";
        }
        String subscriberId = Privacy.createTelephonyManager(this.context, TOKEN).getSubscriberId();
        return TextUtils.isEmpty(subscriberId) ? "unknown" : subscriberId;
    }

    public /* synthetic */ HashInfoWithNumber lambda$setFingerprintInfo$32() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37a34023b16ba0c85bbd46e11656b388", 6917529027641081856L)) {
            return (HashInfoWithNumber) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37a34023b16ba0c85bbd46e11656b388");
        }
        if (mStore.getImageHashInfo() != null) {
            return mStore.getImageHashInfo();
        }
        HashInfoWithNumber imageHashList = ImageHashUtils.getImageHashList(this.context);
        mStore.setImageHashInfo(imageHashList);
        return imageHashList;
    }

    public static /* synthetic */ LocationInfo lambda$setFingerprintInfo$33(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f89e5437a5b64168612785a3e9260fc0", 6917529027641081856L)) {
            return (LocationInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f89e5437a5b64168612785a3e9260fc0");
        }
        if (new Random().nextInt(20) + 1 == 20) {
            raptorMtLocation();
        }
        return fingerprintInfoProvider.getCachedLocation();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$34() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0a868a0e5fb9944bdcb59eb3b58953a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0a868a0e5fb9944bdcb59eb3b58953a") : DataStore.getSystemAppInfos();
    }

    public static /* synthetic */ Integer lambda$setFingerprintInfo$35() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca2a4e62dbae8dd063082885ddffecf6", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca2a4e62dbae8dd063082885ddffecf6") : Integer.valueOf(DataStore.getAppCount());
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$36() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "037f1e06430a4e90c5a460898ad7463f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "037f1e06430a4e90c5a460898ad7463f") : DataStore.getNonSystemAppInfos();
    }

    public /* synthetic */ Long lambda$setFingerprintInfo$37() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f48a605e31e9c6c04f7cfbdec3694d94", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f48a605e31e9c6c04f7cfbdec3694d94") : Long.valueOf(CommonFingerItemCache.getFirstLaunchTime(this.context));
    }

    public /* synthetic */ Long lambda$setFingerprintInfo$38() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12ef49c9356f420b5e1d29795d9d5a0", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12ef49c9356f420b5e1d29795d9d5a0") : Long.valueOf(CommonFingerItemCache.getInstallTime(this.context));
    }

    public /* synthetic */ Integer lambda$setFingerprintInfo$39() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b6b2bddd948f40b28b5886623c395fa", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b6b2bddd948f40b28b5886623c395fa") : Integer.valueOf(Privacy.createLocationManager(this.context, TOKEN).c("gps") ? 1 : 0);
    }

    public /* synthetic */ Integer lambda$setFingerprintInfo$40() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc7c4f79b13a17c8dbe952455ca98f8", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc7c4f79b13a17c8dbe952455ca98f8") : Integer.valueOf(Privacy.createTelephonyManager(this.context, TOKEN).isNetworkRoaming() ? 1 : 0);
    }

    public /* synthetic */ Integer lambda$setFingerprintInfo$41() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bf854ab19fc72380a0ee17c24d2864c", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bf854ab19fc72380a0ee17c24d2864c") : Integer.valueOf(Privacy.createTelephonyManager(this.context, TOKEN).getSimState());
    }

    public /* synthetic */ String lambda$setFingerprintInfo$42() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09355700a46ba10ca604488e64504437", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09355700a46ba10ca604488e64504437") : localizers();
    }

    public /* synthetic */ String lambda$setFingerprintInfo$43() {
        WifiInfo connectionInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afb66a8290fb8ecc7712436b71d88099", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afb66a8290fb8ecc7712436b71d88099");
        }
        if (Permissions.isPermissionGranted("android.permission.ACCESS_WIFI_STATE", this.context) && Permissions.isPermissionGrantedFromPrivacy("Locate.once", this.context, TOKEN) && Privacy.createWifiManager(this.context, TOKEN).getWifiState() == 3 && (connectionInfo = Privacy.createWifiManager(this.context, TOKEN).getConnectionInfo()) != null) {
            int ipAddress = connectionInfo.getIpAddress();
            return (ipAddress & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 8) & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 16) & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 24) & 255);
        }
        return "unknown";
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$44() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dac0d6f7017914aadb7bef6472b5d3c6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dac0d6f7017914aadb7bef6472b5d3c6") : Build.FINGERPRINT;
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$45(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83ef05fef9a859d551822dffacf4749b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83ef05fef9a859d551822dffacf4749b") : fingerprintInfoProvider.source();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$46(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86a13135ef18bf808aa287ce13ff85b3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86a13135ef18bf808aa287ce13ff85b3") : fingerprintInfoProvider.getUUID();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$47(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3dbfb6fb329130c7a016a8f609c23956", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3dbfb6fb329130c7a016a8f609c23956") : fingerprintInfoProvider.business();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$48(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d800c42828f04848f4c55cee313f93d3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d800c42828f04848f4c55cee313f93d3") : fingerprintInfoProvider.dpid();
    }

    public /* synthetic */ String lambda$setFingerprintInfo$49() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "731c99b698d6afb389368a320890fe1c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "731c99b698d6afb389368a320890fe1c") : CommonFingerItemCache.getAppVersion(this.context);
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$51(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf245baec56bb169b1ab5ec78ce70978", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf245baec56bb169b1ab5ec78ce70978") : fingerprintInfoProvider.getMagicNumber();
    }

    public static /* synthetic */ String lambda$setFingerprintInfo$52(FingerprintInfoProvider fingerprintInfoProvider) {
        Object[] objArr = {fingerprintInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d8102d0c546f418e7794d9b34a2982f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d8102d0c546f418e7794d9b34a2982f") : fingerprintInfoProvider.getChannel();
    }

    private static String detection(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd618de1d5a60fb8e0bc9082088c8c35", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd618de1d5a60fb8e0bc9082088c8c35");
        }
        PackageManager packageManager = context.getPackageManager();
        BitMarker bitMarker = new BitMarker(8);
        String[] strArr = {"com.doubee.ig", "com.soft.apk008v", "com.soft.controllers", "de.robv.android.xposed.installer", "biz.bokhorst.xprivacy"};
        for (int i = 0; i < 5; i++) {
            if (isInstalledApp(packageManager, strArr[i])) {
                bitMarker.mark(i);
            }
        }
        return Base64.encodeToString(bitMarker.bits, 0);
    }

    public static boolean isInstalledApp(PackageManager packageManager, String str) {
        Object[] objArr = {packageManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71600d175c9dddd177865bf82a2ce1f8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71600d175c9dddd177865bf82a2ce1f8")).booleanValue() : packageManager.getPackageInfo(str, 128) != null;
    }

    public static String storage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e19cb4f7645ba6639fcbbf72ba7bd207", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e19cb4f7645ba6639fcbbf72ba7bd207");
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return "unknown";
        }
        StatFs statFs = new StatFs(externalStorageDirectory.getPath());
        long caculateBytes = caculateBytes(statFs.getAvailableBlocks(), statFs.getBlockSize());
        long caculateBytes2 = caculateBytes(statFs.getBlockCount(), statFs.getBlockSize());
        return caculateBytes + "@" + caculateBytes2;
    }

    @SuppressLint({"MissingPermission"})
    private static String network(ConnectivityManager connectivityManager, Context context) {
        Object[] objArr = {connectivityManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "905489f5eafd621b4b471415632ed06d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "905489f5eafd621b4b471415632ed06d");
        }
        if (connectivityManager == null || !Permissions.isPermissionGranted("android.permission.ACCESS_NETWORK_STATE", context)) {
            return "unknown";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        String typeName = activeNetworkInfo == null ? "" : activeNetworkInfo.getTypeName();
        String subtypeName = activeNetworkInfo == null ? "" : activeNetworkInfo.getSubtypeName();
        return (!"MOBILE".equals(typeName) || TextUtils.isEmpty(subtypeName)) ? typeName : subtypeName;
    }

    public static int root() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97bb78cbafb2553314fae1286185a73d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97bb78cbafb2553314fae1286185a73d")).intValue();
        }
        if (isRoot == null) {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                String str = strArr[i];
                if (new File(str + "su").exists()) {
                    Integer num = 1;
                    isRoot = num;
                    return num.intValue();
                }
            }
            Integer num2 = 0;
            isRoot = num2;
            return num2.intValue();
        }
        return isRoot.intValue();
    }

    public static String generateFingerprintString(FingerprintInfo fingerprintInfo, String str) throws Exception {
        Object[] objArr = {fingerprintInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39abad4353a2a8740d7648a01b110067", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39abad4353a2a8740d7648a01b110067");
        }
        String json = new GsonBuilder().serializeNulls().registerTypeAdapter(FingerprintInfo.FingerItem.class, new FingerItemSerializer()).create().toJson(fingerprintInfo);
        StringUtils.setLogan(json);
        return DESHelper.encryptByPublic(json, str);
    }

    public boolean newerThanGingerbread() {
        return Build.VERSION.SDK_INT >= 9;
    }

    public static String batteryState(Context context) {
        int a;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bd21c9e3626da2fce635aa0a2ec814b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bd21c9e3626da2fce635aa0a2ec814b");
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (registerReceiver == null || (a = f.a(registerReceiver, "status", -1)) == -1) ? "unknown" : a != 2 ? a != 5 ? "Unplugged" : "Fully Charged" : "Charging";
    }

    public String localizers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d31dd49774eeba520defccd22f1fa5e1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d31dd49774eeba520defccd22f1fa5e1");
        }
        if (this.installedAppManager.fetchFailed()) {
            return "fetch list error";
        }
        List<String> applist = this.installedAppManager.applist();
        if (applist == null || applist.size() <= 0) {
            return "empty list";
        }
        try {
            BitMarker bitMarker = new BitMarker(applist.size());
            for (int i = 0; i < applist.size(); i++) {
                if (DataStore.getAppList().contains(applist.get(i).toLowerCase())) {
                    bitMarker.mark(i);
                }
            }
            return Base64.encodeToString(bitMarker.bits, 0);
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return "unknown";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class BitMarker {
        public static ChangeQuickRedirect changeQuickRedirect;
        private byte[] bits;
        private int size;

        public BitMarker(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d8aba4438934452ab5bbd199a41710c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d8aba4438934452ab5bbd199a41710c");
                return;
            }
            this.bits = null;
            this.size = 0;
            this.bits = new byte[(i + 7) / 8];
            this.size = this.bits.length * 8;
        }

        public boolean mark(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abcf58eddc170c3a636243e8f68f62b7", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abcf58eddc170c3a636243e8f68f62b7")).booleanValue();
            }
            if (i >= this.size || i < 0) {
                return false;
            }
            int i2 = i / 8;
            this.bits[i2] = (byte) ((1 << (i % 8)) | this.bits[i2]);
            return true;
        }

        public byte[] current() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c6075e3ea68784a7bb66260983cbe66", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c6075e3ea68784a7bb66260983cbe66") : Arrays.copyOf(this.bits, this.bits.length);
        }

        public String toString() {
            byte[] bArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a8c922341890f4ab62f6def73185429", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a8c922341890f4ab62f6def73185429");
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : this.bits) {
                for (int i = 0; i < 8; i++) {
                    sb.append(Integer.toString((b >> i) & 1));
                }
            }
            return sb.toString();
        }
    }

    private static float batteryLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07f8f4c67faa0378deef9e4a7cbe3902", 6917529027641081856L)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07f8f4c67faa0378deef9e4a7cbe3902")).floatValue();
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 0.0f;
        }
        return (f.a(registerReceiver, "level", 0) * 100) / f.a(registerReceiver, "scale", 100);
    }

    private static long localDate(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "184e7531625db06355979faa7d3c7992", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "184e7531625db06355979faa7d3c7992")).longValue() : Calendar.getInstance().getTimeInMillis();
    }

    private static long documentCreationDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf7fd89e65a66d392f1d5ca5689e1f80", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf7fd89e65a66d392f1d5ca5689e1f80")).longValue();
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/");
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles(new FileFilter() { // from class: com.meituan.android.common.fingerprint.FingerprintManager.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        Object[] objArr2 = {file2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7fc7de6618ea5d8047a286f3cf04ddae", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7fc7de6618ea5d8047a286f3cf04ddae")).booleanValue() : file2.getAbsolutePath().contains(".mtuuid_");
                    }
                });
                if (listFiles.length == 1) {
                    return listFiles[0].lastModified();
                }
                return 0L;
            }
            return 0L;
        } catch (Exception e) {
            StringUtils.setErrorLogan(e);
            return 0L;
        }
    }

    private static float systemVolume(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "714b1f09f3cc155a6aa8a54f0a0bbb7f", 6917529027641081856L)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "714b1f09f3cc155a6aa8a54f0a0bbb7f")).floatValue();
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return (audioManager.getStreamVolume(1) * 100) / audioManager.getStreamMaxVolume(1);
    }

    private static long totalCapacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c85f13b773c93f049f20a44f0f652542", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c85f13b773c93f049f20a44f0f652542")).longValue() : totalCapacity(Environment.getDataDirectory()) + totalCapacity(Environment.getExternalStorageDirectory());
    }

    private static long availableCapacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49059e359418bab2c09c3953d0ee82a2", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49059e359418bab2c09c3953d0ee82a2")).longValue() : availableCapacity(Environment.getDataDirectory()) + availableCapacity(Environment.getExternalStorageDirectory());
    }

    private static long totalCapacity(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6524f0ccf4edf438b385a4eed0ed48fc", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6524f0ccf4edf438b385a4eed0ed48fc")).longValue();
        }
        if (file.exists()) {
            StatFs statFs = new StatFs(file.getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        }
        return 0L;
    }

    private static long availableCapacity(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4deded46ba934c4d4624cf0289d1f915", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4deded46ba934c4d4624cf0289d1f915")).longValue();
        }
        if (file.exists()) {
            StatFs statFs = new StatFs(file.getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return 0L;
    }

    private static ConnectWifiInfo connectedWifiMac(Context context) {
        WifiInfo connectionInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a180385e0c6ea47514b17f944424528b", 6917529027641081856L)) {
            return (ConnectWifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a180385e0c6ea47514b17f944424528b");
        }
        if (context == null || !Permissions.isPermissionGranted("android.permission.ACCESS_WIFI_STATE", context) || !Permissions.isPermissionGrantedFromPrivacy("Locate.once", context, TOKEN) || (connectionInfo = Privacy.createWifiManager(context, TOKEN).getConnectionInfo()) == null || connectionInfo.getBSSID() == null) {
            return null;
        }
        return new ConnectWifiInfo(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi());
    }

    private List<ScanResult> loadScanResult(Context context) {
        List<ScanResult> scanResults;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f808500d54792fcd1486c22a8c2da955", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f808500d54792fcd1486c22a8c2da955");
        }
        ArrayList arrayList = new ArrayList();
        return (context == null || !Permissions.isPermissionGrantedFromPrivacy("Locate.once", this.context, TOKEN) || (scanResults = Privacy.createWifiManager(context, TOKEN).getScanResults()) == null) ? arrayList : scanResults;
    }

    private List<WifiMacInfo> scanResultToWifiMacInfo() {
        Comparator comparator;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f085ae38a330df79a7fb23c27b3eb693", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f085ae38a330df79a7fb23c27b3eb693");
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (mStore.getWifis() == null) {
                List<ScanResult> loadScanResult = loadScanResult(this.context);
                if (loadScanResult != null && loadScanResult.size() > 0) {
                    comparator = FingerprintManager$$Lambda$61.instance;
                    Collections.sort(loadScanResult, comparator);
                    for (int i = 0; i < 3 && i < loadScanResult.size(); i++) {
                        arrayList.add(new WifiMacInfo(loadScanResult.get(i).SSID, loadScanResult.get(i).BSSID));
                    }
                    mStore.setWifis(arrayList);
                    return arrayList;
                }
                return arrayList;
            }
            return mStore.getWifis();
        } catch (Exception e) {
            StringUtils.setErrorLogan(e);
            return arrayList;
        }
    }

    public static /* synthetic */ int lambda$scanResultToWifiMacInfo$53(ScanResult scanResult, ScanResult scanResult2) {
        Object[] objArr = {scanResult, scanResult2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8698da3f26fff4ab4f44ead5019643f0", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8698da3f26fff4ab4f44ead5019643f0")).intValue() : scanResult2.level - scanResult.level;
    }

    public static ConnectWifiInfo connectedWifiMacBridge(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eadd43985faffbb66d000b8f6e6c3330", 6917529027641081856L) ? (ConnectWifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eadd43985faffbb66d000b8f6e6c3330") : connectedWifiMac(context);
    }

    public List<ScanResult> loadScanResultBridge(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f8b1b2c010d448670c4ad9142c0e77", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f8b1b2c010d448670c4ad9142c0e77") : loadScanResult(context);
    }

    public List<WifiMacInfo> scanResultToJsonBridge(List<ScanResult> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c60f8cee175e8203413b816dd146f514", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c60f8cee175e8203413b816dd146f514") : scanResultToWifiMacInfo();
    }

    public static String procLastModifiedTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca35dd35db700af56b72e0952b049c9c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca35dd35db700af56b72e0952b049c9c");
        }
        try {
            File file = new File("/system/build.prop");
            return !file.exists() ? "" : String.valueOf(file.lastModified());
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return "unknown";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static List<CellInfo> cellInfo(Context context) {
        CellLocation cellLocation;
        CdmaCellLocation cdmaCellLocation;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20191c036f5283f3de1275d120e538f1", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20191c036f5283f3de1275d120e538f1");
        }
        ArrayList arrayList = new ArrayList();
        if (Permissions.isPermissionGrantedFromPrivacy("Locate.once", context, TOKEN) && (cellLocation = Privacy.createTelephonyManager(context, TOKEN).getCellLocation()) != null) {
            int networkType = Privacy.createTelephonyManager(context, TOKEN).getNetworkType();
            String networkOperator = Privacy.createTelephonyManager(context, TOKEN).getNetworkOperator();
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                if (gsmCellLocation == null || networkOperator == null || networkOperator.length() == 0) {
                    return arrayList;
                }
                CellInfo cellInfo = new CellInfo();
                try {
                    cellInfo.setMcc(Integer.parseInt(networkOperator.substring(0, 3)));
                    cellInfo.setMnc(Integer.parseInt(networkOperator.substring(3, 5)));
                } catch (Throwable th) {
                    cellInfo.setMcc(460);
                    if (networkType == 1 || networkType == 2) {
                        cellInfo.setMnc(0);
                    } else {
                        cellInfo.setMnc(1);
                    }
                    StringUtils.setErrorLogan(th);
                }
                String str = (networkType == 1 || networkType == 2) ? "gsm" : "wcdma";
                cellInfo.setCid(gsmCellLocation.getCid());
                cellInfo.setLac(gsmCellLocation.getLac());
                cellInfo.setRadioType(str);
                arrayList.add(cellInfo);
                try {
                    List<android.telephony.CellInfo> allCellInfo = Privacy.createTelephonyManager(context, TOKEN).getAllCellInfo();
                    if (allCellInfo != null) {
                        for (android.telephony.CellInfo cellInfo2 : allCellInfo) {
                            CellInfo cellInfo3 = new CellInfo();
                            if (cellInfo2 instanceof CellInfoGsm) {
                                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo2).getCellIdentity();
                                cellInfo3.setCid(cellIdentity.getCid());
                                cellInfo3.setMcc(cellIdentity.getMcc());
                                cellInfo3.setMnc(cellIdentity.getMnc());
                                cellInfo3.setLac(cellIdentity.getLac());
                                cellInfo3.setRadioType("gsm");
                                arrayList.add(cellInfo3);
                            } else if (cellInfo2 instanceof CellInfoWcdma) {
                                CellIdentityWcdma cellIdentity2 = ((CellInfoWcdma) cellInfo2).getCellIdentity();
                                cellInfo3.setCid(cellIdentity2.getCid());
                                cellInfo3.setMcc(cellIdentity2.getMcc());
                                cellInfo3.setMnc(cellIdentity2.getMnc());
                                cellInfo3.setLac(cellIdentity2.getLac());
                                cellInfo3.setRadioType("wcdma");
                                arrayList.add(cellInfo3);
                            } else if (cellInfo2 instanceof CellInfoLte) {
                                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo2).getCellIdentity();
                                cellInfo3.setCid(cellIdentity3.getCi());
                                cellInfo3.setMcc(cellIdentity3.getMcc());
                                cellInfo3.setMnc(cellIdentity3.getMnc());
                                cellInfo3.setLac(cellIdentity3.getTac());
                                cellInfo3.setRadioType("wcdma");
                                arrayList.add(cellInfo3);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    StringUtils.setErrorLogan(th2);
                }
            } else if (!(cellLocation instanceof CdmaCellLocation) || (cdmaCellLocation = (CdmaCellLocation) cellLocation) == null || networkOperator == null || networkOperator.length() == 0) {
                return arrayList;
            } else {
                CellInfo cellInfo4 = new CellInfo();
                try {
                    cellInfo4.setMcc(Integer.parseInt(networkOperator));
                } catch (Throwable th3) {
                    cellInfo4.setMcc(460);
                    StringUtils.setErrorLogan(th3);
                }
                cellInfo4.setCid(cdmaCellLocation.getBaseStationId());
                cellInfo4.setLac(cdmaCellLocation.getNetworkId());
                cellInfo4.setMnc(cdmaCellLocation.getSystemId());
                cellInfo4.setRadioType("cdma");
                arrayList.add(cellInfo4);
            }
            return arrayList;
        }
        return arrayList;
    }

    private static void raptorMtLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43a1c6604496dd56dd12c072f07caf44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43a1c6604496dd56dd12c072f07caf44");
            return;
        }
        MtLocation a = com.meituan.android.privacy.locate.f.a().a(TOKEN);
        if (a == null || !isReport(10)) {
            return;
        }
        MTGlibInterface.raptorFakeAPI("owl_location_cache_time", 200, System.currentTimeMillis() - a.getTime());
    }

    public static boolean isReport(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "140254d11f4019971c19704f6d14dc3b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "140254d11f4019971c19704f6d14dc3b")).booleanValue() : new Random().nextInt(i) + 1 == i;
    }
}
