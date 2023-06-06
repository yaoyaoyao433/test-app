package com.meituan.android.common.fingerprint.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.meituan.android.common.fingerprint.info.HashInfoWithNumber;
import com.meituan.android.common.fingerprint.info.WifiMacInfo;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataStore {
    private static final int APP_LIMIT = 10;
    private static final String TOKEN = "Android-mtguard";
    private static final String UNKNOWN = "unknown";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int mAppCount = 0;
    private static String mNonSystemAppInfos = "unknown";
    private static String mSystemAppInfos = "unknown";
    private HashInfoWithNumber imageHashInfo;
    private HashInfoWithNumber musicHashInfo;
    private List<WifiMacInfo> wifis;
    private static List<String> mAppList = new ArrayList();
    private static volatile DataStore instance = null;

    public DataStore(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f45255757d56efc4797d3240a8993b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f45255757d56efc4797d3240a8993b5");
            return;
        }
        this.wifis = null;
        this.musicHashInfo = null;
        this.imageHashInfo = null;
    }

    public static DataStore getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb3f16311ba34359e4c7ff8424917577", 6917529027641081856L)) {
            return (DataStore) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb3f16311ba34359e4c7ff8424917577");
        }
        if (instance == null) {
            synchronized (DataStore.class) {
                if (instance == null) {
                    instance = new DataStore(context);
                }
            }
        }
        return instance;
    }

    public static synchronized void initAppList(Context context) {
        synchronized (DataStore.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e35ace651669c1c7252b174047512464", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e35ace651669c1c7252b174047512464");
                return;
            }
            List<ApplicationInfo> applicationInfos = getApplicationInfos(context);
            if (applicationInfos != null && applicationInfos.size() != 0) {
                mAppCount = applicationInfos.size();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                mAppList = new ArrayList();
                for (ApplicationInfo applicationInfo : applicationInfos) {
                    mAppList.add(applicationInfo.packageName.toLowerCase());
                    if ((applicationInfo.flags & 1) > 0) {
                        if (arrayList.size() < 10) {
                            arrayList.add(applicationInfo.packageName);
                        }
                    } else if (arrayList2.size() < 10) {
                        arrayList2.add(applicationInfo.packageName);
                    }
                }
                if (arrayList.size() > 0) {
                    mSystemAppInfos = stringJoiner(arrayList, '-');
                }
                if (arrayList2.size() > 0) {
                    mNonSystemAppInfos = stringJoiner(arrayList2, '-');
                }
            }
        }
    }

    private static List<ApplicationInfo> getApplicationInfos(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9bda117ec15d9fdc35cbbc0862a1a52", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9bda117ec15d9fdc35cbbc0862a1a52");
        }
        ArrayList arrayList = new ArrayList();
        if ("DLI-AL10".equals(Build.MODEL) || "FIG-AL10".equals(Build.MODEL)) {
            return arrayList;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = Privacy.createPackageManager(context, TOKEN).queryIntentActivities(intent, 131072);
            if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    arrayList.add(resolveInfo.activityInfo.applicationInfo);
                }
            }
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
        }
        return arrayList;
    }

    public static List<String> getAppList() {
        return mAppList;
    }

    public static String getNonSystemAppInfos() {
        return mNonSystemAppInfos;
    }

    public static String getSystemAppInfos() {
        return mSystemAppInfos;
    }

    public static int getAppCount() {
        return mAppCount;
    }

    public List<WifiMacInfo> getWifis() {
        return this.wifis;
    }

    public HashInfoWithNumber getMusicHashInfo() {
        return this.musicHashInfo;
    }

    public HashInfoWithNumber getImageHashInfo() {
        return this.imageHashInfo;
    }

    public void setWifis(List<WifiMacInfo> list) {
        this.wifis = list;
    }

    public void setMusicHashInfo(HashInfoWithNumber hashInfoWithNumber) {
        this.musicHashInfo = hashInfoWithNumber;
    }

    public void setImageHashInfo(HashInfoWithNumber hashInfoWithNumber) {
        this.imageHashInfo = hashInfoWithNumber;
    }

    private static String stringJoiner(Collection<String> collection, char c) {
        Object[] objArr = {collection, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f0f082e241f8579d7a3c0fe1f945e20", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f0f082e241f8579d7a3c0fe1f945e20");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append(str);
            sb.append(c);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
