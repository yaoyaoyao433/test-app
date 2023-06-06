package com.meituan.android.common.dfingerprint.collection.workers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Base64;
import com.meituan.android.common.dfingerprint.collection.utils.InstalledAppManager;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.dfingerprint.store.DfpSharedPref;
import com.meituan.android.common.dfingerprint.utils.CommonUtils;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class AppInfoWorker {
    private static String MTG_GUARD_BID = "Android-mtguard";
    private static int androidAppCntCache;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static InstalledAppManager installedAppManager;
    private static String nonSystemAppInfosCache;
    private static PackageManager pkgmgr;
    private static List<ApplicationInfo> sApplicationInstalled;
    private static AppInfoWorker sInstance;
    private static String systemAppInfosCache;
    private Context mContext;

    /* loaded from: classes2.dex */
    public static class BitMarker {
        public static ChangeQuickRedirect changeQuickRedirect;
        public byte[] bits;
        private int size;

        public BitMarker(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e18d1bc153fa9a0eee7cdcf6d3d6a4db", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e18d1bc153fa9a0eee7cdcf6d3d6a4db");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0478cfc0f3e6fca8e0fdb7ee75ee04d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0478cfc0f3e6fca8e0fdb7ee75ee04d")).booleanValue();
            }
            if (i >= this.size || i < 0) {
                return false;
            }
            int i2 = i / 8;
            this.bits[i2] = (byte) ((1 << (i % 8)) | this.bits[i2]);
            return true;
        }

        public String toString() {
            byte[] bArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "824ca3c5578e036a4a2dc86379bc6758", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "824ca3c5578e036a4a2dc86379bc6758");
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

    public AppInfoWorker(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce196b7cafec55017ab8ed5a2a84577", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce196b7cafec55017ab8ed5a2a84577");
        } else if (iDFPManager != null) {
            InstalledAppManager installedAppManager2 = new InstalledAppManager(iDFPManager);
            installedAppManager = installedAppManager2;
            installedAppManager2.updateAppList(false);
            pkgmgr = iDFPManager.getContext().getPackageManager();
            this.mContext = iDFPManager.getContext();
        }
    }

    public static int androidAppCnt(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2af58080aad5d311267bb7c71e6cce2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2af58080aad5d311267bb7c71e6cce2")).intValue();
        }
        if (androidAppCntCache != 0) {
            return androidAppCntCache;
        }
        if (context == null) {
            return 0;
        }
        if (pkgmgr == null) {
            return androidAppCntCache;
        }
        List<ApplicationInfo> list = sApplicationInstalled;
        if (list == null || list.size() == 0) {
            list = getApplicationInfos(context);
            sApplicationInstalled = list;
        }
        int size = list.size();
        androidAppCntCache = size;
        return size;
    }

    private static List<ApplicationInfo> getApplicationInfos(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b4367bd9dd6ae8610f287f6ec4b4e06", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b4367bd9dd6ae8610f287f6ec4b4e06");
        }
        ArrayList arrayList = new ArrayList();
        if (!"DLI-AL10".equals(Build.MODEL) && !"FIG-AL10".equals(Build.MODEL)) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                List<ResolveInfo> queryIntentActivities = Privacy.createPackageManager(context, MTG_GUARD_BID).queryIntentActivities(intent, 131072);
                if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        arrayList.add(resolveInfo.activityInfo.applicationInfo);
                    }
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
        return arrayList;
    }

    public static String getBid() {
        return MTG_GUARD_BID;
    }

    public static String getFirstLaunchTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73fba27e7e9140ffcbeb32395d377338", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73fba27e7e9140ffcbeb32395d377338");
        }
        if (context == null) {
            return "0";
        }
        DfpSharedPref dfpSharedPref = DfpSharedPref.getInstance(context);
        long firstLaunchTime = dfpSharedPref.getFirstLaunchTime();
        if (firstLaunchTime > 0) {
            return String.valueOf(firstLaunchTime);
        }
        long currentTimeMillis = System.currentTimeMillis();
        dfpSharedPref.setFirstLaunchTime(currentTimeMillis);
        return String.valueOf(currentTimeMillis);
    }

    public static AppInfoWorker getInstance(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6589d686e9ea16f26d29867f644a5d29", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppInfoWorker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6589d686e9ea16f26d29867f644a5d29");
        }
        if (sInstance == null) {
            synchronized (AppInfoWorker.class) {
                if (sInstance == null) {
                    sInstance = new AppInfoWorker(iDFPManager);
                }
            }
        }
        return sInstance;
    }

    public static synchronized String systeAppInfos(Context context, int i) {
        synchronized (AppInfoWorker.class) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "518ecf551a2cb00ef07c5b4bcccc415e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "518ecf551a2cb00ef07c5b4bcccc415e");
            } else if (systemAppInfosCache != null) {
                return systemAppInfosCache;
            } else if (context == null) {
                return "unknown";
            } else {
                ArrayList arrayList = new ArrayList();
                if (pkgmgr != null) {
                    List<ApplicationInfo> list = sApplicationInstalled;
                    if (list == null || list.size() == 0) {
                        list = getApplicationInfos(context);
                        sApplicationInstalled = list;
                    }
                    for (ApplicationInfo applicationInfo : list) {
                        if ((applicationInfo.flags & 1) > 0) {
                            arrayList.add(applicationInfo.packageName);
                            if (arrayList.size() >= i) {
                                break;
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    String join = StringUtils.join(arrayList, '-');
                    systemAppInfosCache = join;
                    return join;
                }
                return "unknown";
            }
        }
    }

    public int androidAppCnt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3191cf923e1be4febbf919ff0f785c3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3191cf923e1be4febbf919ff0f785c3")).intValue() : androidAppCnt(this.mContext);
    }

    public synchronized String localizers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1254a826180885957dc21e1bb7803c9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1254a826180885957dc21e1bb7803c9b");
        } else if (this.mContext == null) {
            return "";
        } else {
            if (CommonUtils.isNetworkConnected(this.mContext)) {
                if (installedAppManager.fetchFailed()) {
                    return "fetch list error";
                }
                List<String> applist = installedAppManager.applist();
                if (applist != null && applist.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    if (pkgmgr != null) {
                        List<ApplicationInfo> list = sApplicationInstalled;
                        if (list == null || list.size() == 0) {
                            list = getApplicationInfos(this.mContext);
                            sApplicationInstalled = list;
                        }
                        for (ApplicationInfo applicationInfo : list) {
                            arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
                        }
                        BitMarker bitMarker = new BitMarker(applist.size());
                        for (int i = 0; i < applist.size(); i++) {
                            if (arrayList.contains(applist.get(i).toLowerCase(Locale.getDefault()))) {
                                bitMarker.mark(i);
                            }
                        }
                        return Base64.encodeToString(bitMarker.bits, 0);
                    }
                    return "fetch list error";
                }
                return "empty list";
            }
            return "no network";
        }
    }

    public synchronized String nonSysteAppInfos(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8263e5cf67215000bd2322dc2eb65878", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8263e5cf67215000bd2322dc2eb65878");
        } else if (nonSystemAppInfosCache != null) {
            return nonSystemAppInfosCache;
        } else {
            ArrayList arrayList = new ArrayList();
            if (pkgmgr != null) {
                List<ApplicationInfo> list = sApplicationInstalled;
                if (list == null || list.size() == 0) {
                    list = getApplicationInfos(this.mContext);
                    sApplicationInstalled = list;
                }
                for (ApplicationInfo applicationInfo : list) {
                    if ((applicationInfo.flags & 1) == 0) {
                        arrayList.add(applicationInfo.packageName);
                        if (arrayList.size() >= i) {
                            break;
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                String join = StringUtils.join(arrayList, '-');
                nonSystemAppInfosCache = join;
                return join;
            }
            return "";
        }
    }

    public List<ApplicationInfo> pkls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44c04fde9102121714756ec2d89ee90e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44c04fde9102121714756ec2d89ee90e");
        }
        if (sApplicationInstalled == null || sApplicationInstalled.size() == 0) {
            if (pkgmgr != null) {
                try {
                    sApplicationInstalled = getApplicationInfos(this.mContext);
                } catch (Throwable th) {
                    MTGuardLog.setErrorLogan(th);
                }
            }
            return sApplicationInstalled;
        }
        return sApplicationInstalled;
    }

    public String systeAppInfos(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d384bc8c65dac76e14da7d5d89334e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d384bc8c65dac76e14da7d5d89334e8") : systeAppInfos(this.mContext, i);
    }
}
