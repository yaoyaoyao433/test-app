package com.meituan.robust.assistant;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchManipulate;
import com.meituan.robust.RobustApkHashUtils;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.resource.util.ProcessUtil;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchManipulateImpl extends PatchManipulate implements RobustCallBack {
    private static final String LOCAL_PATCH_DIR = "patch";
    static final int USE_LAST_RESULT = 1002;
    static final int USE_LOCAL_PATCH_LIST = 1003;
    static final int USE_NONE = 1001;
    private static transient List<Patch> patches;
    String apkHash;
    String appVersion;
    String channel;
    RobustCallBack realCallBack;
    int useStrategy;
    long userId;
    String uuid;

    public PatchManipulateImpl(String str, String str2, long j, String str3, String str4, int i, RobustCallBack robustCallBack) {
        this.channel = str2;
        this.appVersion = str;
        this.userId = j;
        this.apkHash = str3;
        this.uuid = str4;
        this.useStrategy = i;
        this.realCallBack = robustCallBack;
    }

    @Override // com.meituan.robust.PatchManipulate
    public List<Patch> fetchPatchList(Context context) {
        Collection<? extends Patch> collection;
        List<Patch> list;
        String str;
        Throwable th;
        String str2;
        if (1002 == this.useStrategy && patches != null) {
            return patches;
        }
        List<Patch> arrayList = new ArrayList<>();
        List list2 = null;
        if (1003 == this.useStrategy) {
            try {
                collection = PatchHelper.getLocalPatchList(this.apkHash);
            } catch (Throwable th2) {
                th2.printStackTrace();
                exceptionNotify(th2, "PatchManipulateImpl fetchPatchList line:72");
                collection = null;
            }
            if (collection != null) {
                arrayList.addAll(collection);
            }
        } else {
            int length = HostConfig.PATCH_LIST_BASE_URLS.length;
            String str3 = null;
            String str4 = null;
            for (int i = 0; isNetworkConnected(context) && i < length; i++) {
                try {
                    str2 = getUrl(context, i);
                    try {
                        str = OkHttpUtils.simpleGet(str2);
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                list = (List) new Gson().fromJson(str, new TypeToken<List<Patch>>() { // from class: com.meituan.robust.assistant.PatchManipulateImpl.1
                                }.getType());
                                break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th.printStackTrace();
                            StringBuilder sb = new StringBuilder("PatchManipulateImpl fetchPatchList simpleGet");
                            sb.append(",url:");
                            sb.append(str2 == null ? StringUtil.NULL : str2);
                            sb.append(",response:");
                            sb.append(str == null ? StringUtil.NULL : str);
                            sb.append(",requestTimes:");
                            sb.append(i + 1);
                            exceptionNotify(th, sb.toString());
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (Throwable th4) {
                        str = str3;
                        th = th4;
                    }
                } catch (Throwable th5) {
                    String str5 = str4;
                    str = str3;
                    th = th5;
                    str2 = str5;
                }
                str3 = str;
                str4 = str2;
            }
            list = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Patch patch : list) {
                    Patch m13clone = patch.m13clone();
                    if (m13clone != null) {
                        m13clone.setLocalPath(getPatchDirPath(context) + patch.getMd5() + CommonConstant.Symbol.UNDERLINE + this.apkHash);
                        arrayList2.add(m13clone);
                    }
                }
                PatchHelper.getInstance(context).updateLocalPatchListDelay(arrayList2, this.apkHash, this.realCallBack);
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            collection = null;
            list2 = list;
        }
        if (patches == null) {
            patches = new ArrayList();
        }
        setInfoAndMergePatches(context, arrayList);
        if (collection != null) {
            onPatchListFetched(true, false, patches);
        }
        if (list2 != null) {
            onPatchListFetched(true, true, patches);
        } else {
            onPatchListFetched(false, OkHttpUtils.isNetworkConnected(context), patches);
        }
        return patches;
    }

    public static List<Patch> getSortedPatches() {
        if (patches == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(patches);
        Collections.sort(arrayList, new Comparator<Patch>() { // from class: com.meituan.robust.assistant.PatchManipulateImpl.2
            @Override // java.util.Comparator
            public final int compare(Patch patch, Patch patch2) {
                if (patch == patch2) {
                    return 0;
                }
                if (patch == null) {
                    return -1;
                }
                if (patch2 == null) {
                    return 1;
                }
                String name = patch.getName();
                String name2 = patch2.getName();
                if (name == name2) {
                    return 0;
                }
                if (name == null) {
                    return -1;
                }
                return name.compareTo(name2);
            }
        });
        return arrayList;
    }

    private void setInfoAndMergePatches(Context context, List<Patch> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Patch patch : list) {
            patch.setLocalPath(getPatchDirPath(context) + patch.getMd5() + CommonConstant.Symbol.UNDERLINE + this.apkHash);
            if (TextUtils.isEmpty(patch.getAppHash())) {
                patch.setAppHash(RobustApkHashUtils.readRobustApkHash(context));
            }
            if (TextUtils.isEmpty(patch.getPatchesInfoImplClassFullName())) {
                patch.setPatchesInfoImplClassFullName("com.meituan.robust.patch.PatchesInfoImpl");
            }
            if (!isPatchesContains(patch)) {
                patches.add(patch);
            }
        }
    }

    private boolean isPatchesContains(Patch patch) {
        for (Patch patch2 : patches) {
            if (TextUtils.equals(patch.getLocalPath(), patch2.getLocalPath())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.robust.PatchManipulate
    public boolean verifyPatch(Context context, Patch patch) {
        return VerifyUtils.decryptPatch(context, patch.getLocalPath(), patch.getTempPath());
    }

    @Override // com.meituan.robust.PatchManipulate
    public boolean ensurePatchExist(Patch patch) {
        File file = new File(patch.getLocalPath());
        new StringBuilder("补丁是否存在 in  ensurePatchExist").append(file.exists());
        if (file.exists() && VerifyUtils.isLocalPatchValid(patch.getMd5(), file)) {
            onPatchFetched(true, false, patch);
            return true;
        }
        boolean downloadPatchSafe = PatchHelper.downloadPatchSafe(patch.getUrl(), file);
        onPatchFetched(downloadPatchSafe, true, patch);
        return downloadPatchSafe;
    }

    private String getUrl(Context context, int i) {
        String patchListBaseUrl = HostConfig.getPatchListBaseUrl(context, i);
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        if (TextUtils.isEmpty(this.appVersion)) {
            try {
                this.appVersion = getVersionName(context);
            } catch (Throwable unused) {
            }
        }
        try {
            sb.append("apiLevel=");
            sb.append(Build.VERSION.SDK_INT);
        } catch (Throwable unused2) {
        }
        try {
            sb.append("&dev=");
            sb.append(URLEncoder.encode(Build.DEVICE));
        } catch (Throwable unused3) {
        }
        try {
            sb.append("&devModel=");
            sb.append(URLEncoder.encode(Build.MODEL));
        } catch (Throwable unused4) {
        }
        try {
            sb.append("&brand=");
            sb.append(URLEncoder.encode(Build.BRAND));
        } catch (Throwable unused5) {
        }
        try {
            sb.append("&jvmVersion=");
            sb.append(URLEncoder.encode(System.getProperty("java.vm.version")));
        } catch (Throwable unused6) {
        }
        try {
            sb.append("&userId=");
            sb.append(this.userId);
        } catch (Throwable unused7) {
        }
        try {
            sb.append("&channel=");
            sb.append(URLEncoder.encode(this.channel));
        } catch (Throwable unused8) {
        }
        try {
            sb.append("&cpuArc=");
            sb.append(URLEncoder.encode(Build.CPU_ABI));
        } catch (Throwable unused9) {
        }
        try {
            sb.append("&robustVersion=");
            sb.append(URLEncoder.encode(String.valueOf(RobustVersion.computeVersionCode())));
        } catch (Throwable unused10) {
        }
        try {
            sb.append("&apkHash=");
            sb.append(URLEncoder.encode(this.apkHash));
        } catch (Throwable unused11) {
        }
        try {
            sb.append("&applicationId=");
            sb.append(context.getPackageName());
        } catch (Throwable unused12) {
        }
        try {
            sb.append("&uuid=");
            sb.append(URLEncoder.encode(this.uuid));
        } catch (Throwable unused13) {
        }
        try {
            sb.append("&appVersion=");
            sb.append(URLEncoder.encode(this.appVersion));
        } catch (Throwable unused14) {
        }
        return patchListBaseUrl + sb.toString();
    }

    public static String getPatchDirPath(Context context) {
        String str = context.getFilesDir() + File.separator + LOCAL_PATCH_DIR + File.separator;
        ensureDirExist(str);
        return str;
    }

    public static String getPatchTempDirPath(Context context) {
        String str = context.getCacheDir() + File.separator + LOCAL_PATCH_DIR + File.separator;
        ensureDirExist(str);
        return str + CommonConstant.Symbol.UNDERLINE + ProcessUtil.getCurrentProcessName(context).replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE);
    }

    private static void ensureDirExist(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchListFetched(boolean z, boolean z2, List<Patch> list) {
        if (this.realCallBack != null) {
            try {
                this.realCallBack.onPatchListFetched(z, z2, list);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchFetched(boolean z, boolean z2, Patch patch) {
        if (this.realCallBack != null) {
            try {
                this.realCallBack.onPatchFetched(z, z2, patch);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchApplied(boolean z, Patch patch) {
        if (z && 1003 == this.useStrategy) {
            RobustCrashHandler.setClosingTime();
        }
        if (!z) {
            FailedPatchManipulateImpl.failedPatches.add(patch);
        }
        if (this.realCallBack != null) {
            try {
                this.realCallBack.onPatchApplied(z, patch);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void logNotify(String str, String str2) {
        if (this.realCallBack != null) {
            try {
                this.realCallBack.logNotify(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void exceptionNotify(Throwable th, String str) {
        if (this.realCallBack != null) {
            try {
                this.realCallBack.exceptionNotify(th, str);
            } catch (Throwable unused) {
            }
        }
    }

    private String getVersionName(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean isNetworkConnected(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
