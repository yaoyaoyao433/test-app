package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.passport.UserCenter;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.proxy.util.Constants;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloadUpload;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.FileProvider;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.TbsLogClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class QbSdk {
    public static final int CORE_VER_ENABLE_202112 = 45912;
    public static final int EXTENSION_INIT_FAILURE = -99999;
    public static final String FILERADER_MENUDATA = "menuData";
    public static final String KEY_SET_SENDREQUEST_AND_UPLOAD = "SET_SENDREQUEST_AND_UPLOAD";
    public static final String KEY_THIRD_PARTY_TURING = "turing";
    public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
    public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
    public static final String PARAM_KEY_FEATUREID = "param_key_featureid";
    public static final String PARAM_KEY_FUNCTIONID = "param_key_functionid";
    public static final String PARAM_KEY_POSITIONID = "param_key_positionid";
    public static final int QBMODE = 2;
    public static final String SHARE_PREFERENCES_NAME = "tbs_file_open_dialog_config";
    public static final String SVNVERSION = "jnizz";
    public static final int TBSMODE = 1;
    public static final String TID_QQNumber_Prefix = "QQ:";
    public static final int VERSION = 1;
    static boolean b = false;
    static boolean c = true;
    static String d = null;
    static boolean e = false;
    static long f = 0;
    static long g = 0;
    private static int p = 0;
    private static String q = "";
    private static Class<?> r = null;
    private static Object s = null;
    public static boolean sIsVersionPrinted = false;
    private static boolean t = false;
    private static String[] u = null;
    private static String v = "NULL";
    private static String w = "UNKNOWN";
    static Object h = new Object();
    public static boolean isDefaultDialog = false;
    private static boolean x = false;
    static boolean i = true;
    static boolean j = true;
    static boolean k = false;
    static boolean l = false;
    private static int y = 0;
    private static int z = TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE;
    private static String A = null;
    private static String B = null;
    static boolean a = false;
    static volatile boolean m = a;
    public static boolean mDisableUseHostBackupCore = false;
    private static boolean C = false;
    private static boolean D = true;
    private static TbsListener E = null;
    private static TbsListener F = null;
    private static boolean G = false;
    private static boolean H = false;
    static TbsListener n = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.7
        @Override // com.tencent.smtt.sdk.TbsListener
        public final void onDownloadFinish(int i2) {
            if (TbsDownloader.needDownloadDecoupleCore()) {
                TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is true", true);
                TbsDownloader.a = true;
                return;
            }
            TbsLog.i("QbSdk", "onDownloadFinish needDownloadDecoupleCore is false", true);
            TbsDownloader.a = false;
            if (QbSdk.E != null) {
                QbSdk.E.onDownloadFinish(i2);
            }
            if (QbSdk.F != null) {
                QbSdk.F.onDownloadFinish(i2);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public final void onDownloadProgress(int i2) {
            if (QbSdk.F != null) {
                QbSdk.F.onDownloadProgress(i2);
            }
            if (QbSdk.E != null) {
                QbSdk.E.onDownloadProgress(i2);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public final void onInstallFinish(int i2) {
            if (i2 == 243 && QbSdk.F != null) {
                QbSdk.F.onInstallFinish(i2);
                return;
            }
            TbsLog.i("QbSdk", "onInstallFinish errCode is " + i2, true);
            QbSdk.setTBSInstallingStatus(false);
            TbsDownloader.a = false;
            if (TbsDownloader.startDecoupleCoreIfNeeded()) {
                TbsDownloader.a = true;
            } else {
                TbsDownloader.a = false;
            }
            if (QbSdk.E != null) {
                QbSdk.E.onInstallFinish(i2);
            }
            if (QbSdk.F != null) {
                QbSdk.F.onInstallFinish(i2);
            }
        }
    };
    static Map<String, Object> o = null;
    @Deprecated
    public static final String USER_ID_FROM_APP_IMSI = TbsPrivacyAccess.ConfigurablePrivacy.IMSI.a;
    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_ID = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_ID.a;
    @Deprecated
    public static final String USER_ID_FROM_APP_MAC = TbsPrivacyAccess.ConfigurablePrivacy.MAC.a;
    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_VERSION = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_VERSION.a;
    @Deprecated
    public static final String USER_ID_FROM_APP_DEVICE_MODEL = TbsPrivacyAccess.ConfigurablePrivacy.DEVICE_MODEL.a;
    public static final String USER_ID_FROM_APP_QIMEI36 = TbsPrivacyAccess.ConfigurablePrivacy.QIMEI36.a;
    private static int I = -1;

    /* loaded from: classes6.dex */
    public interface PreInitCallback {
        void onCoreInitFinished();

        void onViewInitFinished(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(Context context, Bundle bundle) throws Exception {
        TbsLogReport tbsLogReport;
        String str;
        if (a(context)) {
            Object a2 = com.tencent.smtt.utils.i.a(s, "incrUpdate", new Class[]{Context.class, Bundle.class}, context, bundle);
            if (a2 != null) {
                return (Bundle) a2;
            }
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "incrUpdate return null!";
        } else {
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "initForPatch return false!";
        }
        tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.INCR_UPDATE_ERROR, str);
        return null;
    }

    private static Bundle a(Context context, Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("style", map.get("style") == null ? "0" : map.get("style"));
            try {
                bundle.putInt("topBarBgColor", Color.parseColor(map.get("topBarBgColor")));
            } catch (Exception unused) {
            }
            if (map != null && map.containsKey(FILERADER_MENUDATA)) {
                JSONObject jSONObject = new JSONObject(map.get(FILERADER_MENUDATA));
                JSONArray jSONArray = jSONObject.getJSONArray("menuItems");
                if (jSONArray != null) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < jSONArray.length() && i2 < 5; i2++) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                            arrayList.add(i2, com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), jSONObject2.getInt("iconResId")));
                            jSONObject2.put("iconResId", i2);
                        } catch (Exception unused2) {
                        }
                    }
                    bundle.putParcelableArrayList("resArray", arrayList);
                }
                bundle.putString(FILERADER_MENUDATA, jSONObject.toString());
            }
            return bundle;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Context context, String str, Bundle bundle) {
        if (a(context)) {
            Object a2 = com.tencent.smtt.utils.i.a(s, "miscCall", new Class[]{String.class, Bundle.class}, str, bundle);
            if (a2 != null) {
                return a2;
            }
            return null;
        }
        return Integer.valueOf((int) EXTENSION_INIT_FAILURE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return q;
    }

    private static void a(Context context, File file, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, Integer num, Map<Integer, String> map) {
        if (a(context)) {
            com.tencent.smtt.utils.i.a(s, "dispatchEmergencyCommand", new Class[]{Integer.class, Map.class}, num, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context, String str) {
        synchronized (QbSdk.class) {
            if (a) {
                return;
            }
            a = true;
            w = "forceSysWebViewInner: " + str;
            TbsLog.e("QbSdk", "forceSysWebViewInner", "Reason:" + w);
            TbsLog.e("QbSdk", "forceSysWebViewInner", Log.getStackTraceString(new Throwable("#")));
            TbsCoreLoadStat.getInstance().a(context, 401);
        }
    }

    static boolean a(Context context) {
        try {
            if (r != null) {
                return true;
            }
            File r2 = p.a().r(context);
            if (r2 == null) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) optDir == null");
                return false;
            }
            File file = new File(r2, "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
                return false;
            }
            TbsLog.i("QbSdk", "new DexLoader #3 dexFile is " + file.getAbsolutePath());
            x.a().b(context);
            com.tencent.smtt.utils.m.a(context);
            r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, r2.getAbsolutePath(), getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (isEnableSensitiveApi() || com.tencent.smtt.utils.i.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) != null) {
                loadTBSSDKExtension(context, file.getParent());
                return true;
            }
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "initExtension sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, int i2) {
        return a(context, i2, (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
    }

    static boolean a(Context context, int i2, int i3) {
        if (o != null && o.containsKey(KEY_SET_SENDREQUEST_AND_UPLOAD) && o.get(KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("QbSdk", "[QbSdk.isX5Disabled] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return true;
        } else if (!isEnableSensitiveApi() && com.tencent.smtt.utils.i.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        } else {
            p.a().b(context, g.a == 0);
            if (c(context)) {
                Object a2 = com.tencent.smtt.utils.i.a(s, "isX5Disabled", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i2), 44165, Integer.valueOf(i3));
                if (a2 == null && (a2 = com.tencent.smtt.utils.i.a(s, "isX5Disabled", new Class[]{Integer.TYPE, Integer.TYPE}, Integer.valueOf(i2), 44165)) == null) {
                    return true;
                }
                return ((Boolean) a2).booleanValue();
            }
            return true;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean a(Context context, boolean z2) {
        int i2;
        File file;
        TbsLog.initIfNeed(context);
        if (!sIsVersionPrinted) {
            TbsLog.i("QbSdk", "svn revision: jnizz; SDK_VERSION_CODE: 44165; SDK_VERSION_NAME: 4.3.0.265");
            sIsVersionPrinted = true;
        }
        if (a && !z2) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED);
            TbsLog.e("QbSdk", "init", "Force WebView Inner, " + w);
            return false;
        } else if (b) {
            TbsCoreLoadStat.getInstance().a(context, 402);
            TbsLog.e("QbSdk", "init", "QbSdk init mIsSysWebViewForcedByOuter = true, " + v);
            return false;
        } else if (!com.tencent.smtt.utils.b.b()) {
            TbsCoreLoadStat.getInstance().a(context, 402);
            TbsLog.i("QbSdk", "init", "cpu is invalid: " + com.tencent.smtt.utils.b.c);
            return false;
        } else {
            if (!D) {
                d(context);
            }
            try {
                File r2 = p.a().r(context);
                if (r2 == null) {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_TBSCORE_SHARE_DIR, new Throwable("QbSdk.init (false) TbsCoreShareDir is null"));
                    return false;
                }
                if (TbsShareManager.isThirdPartyApp(context)) {
                    if (p != 0 && p != TbsShareManager.d(context)) {
                        r = null;
                        s = null;
                        TbsCoreLoadStat.getInstance().a(context, 302);
                        TbsLog.w("QbSdk", "init", "return false, thirdParty not match TBS core ver, details:sTbsVersion: " + p + "; AvailableTbsCoreVersion: " + TbsShareManager.d(context));
                        return false;
                    }
                    i2 = TbsShareManager.d(context);
                } else if (p != 0) {
                    i2 = p.a().a(true, context);
                    if (p != i2) {
                        r = null;
                        s = null;
                        TbsCoreLoadStat tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
                        tbsCoreLoadStat.a(context, 303, new Throwable("sTbsVersion: " + p + "; tbsCoreInstalledVer: " + i2));
                        return false;
                    }
                } else {
                    i2 = 0;
                }
                p = i2;
                if (TbsDownloader.a(context, p)) {
                    TbsLog.i("QbSdk", "init", "version " + p + " is in blacklist,can not load! return");
                    return false;
                } else if (r == null || s == null) {
                    if (!TbsShareManager.isThirdPartyApp(context)) {
                        file = new File(p.a().r(context), "tbs_sdk_extension_dex.jar");
                    } else if (!TbsShareManager.j(context)) {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE, new Throwable("isShareTbsCoreAvailable false!"));
                        return false;
                    } else {
                        file = new File(TbsShareManager.c(context), "tbs_sdk_extension_dex.jar");
                    }
                    if (!file.exists()) {
                        int j2 = p.a().j(context);
                        File file2 = new File(file.getParentFile(), "tbs_jars_fusion_dex.jar");
                        TbsCoreLoadStat.getInstance().a(context, 403);
                        TbsLog.w("QbSdk", "init", "[loadMsg] extension is miss, fusion exist is " + file2.exists() + ", core is " + j2 + ", dexPath is " + file.getPath());
                        return false;
                    }
                    String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : r2.getAbsolutePath();
                    TbsLog.i("QbSdk", "init", "optDirExtension #1 is " + hostCorePathAppDefined);
                    TbsLog.i("QbSdk", "init", "new DexLoader #1 dexFile is " + file.getAbsolutePath());
                    x.a().b(context);
                    com.tencent.smtt.utils.m.a(context);
                    r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, hostCorePathAppDefined, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                    if (!isEnableSensitiveApi() && com.tencent.smtt.utils.i.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                        TbsLog.e("QbSdk", "init", "isSuiteableGetSensitative check failed, can not use x5");
                        return false;
                    }
                    loadTBSSDKExtension(context, file.getParent());
                    com.tencent.smtt.utils.i.a(s, "setClientVersion", new Class[]{Integer.TYPE}, 1);
                    return true;
                } else {
                    return true;
                }
            } catch (Throwable th) {
                TbsLog.e("QbSdk", "QbSdk init Throwable: " + Log.getStackTraceString(th));
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.THROWABLE_QBSDK_INIT, th);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:90|91)|(1:93)(6:114|(1:116)|95|96|97|(2:99|100)(3:101|(1:110)|(2:106|107)))|94|95|96|97|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ae, code lost:
        com.tencent.smtt.sdk.QbSdk.p = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.a(android.content.Context, boolean, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b() {
        Object invokeStaticMethod;
        x a2 = x.a();
        if (a2 == null || !a2.b() || (invokeStaticMethod = a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0])) == null || !(invokeStaticMethod instanceof String)) {
            return null;
        }
        return (String) invokeStaticMethod;
    }

    static boolean b(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return false;
        }
        try {
            if (context.getApplicationInfo().packageName.contains("com.tencent.portfolio")) {
                TbsLog.i("QbSdk", "clearPluginConfigFile #1");
                String string = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null);
                String str = context.getPackageManager().getPackageInfo("com.tencent.portfolio", 0).versionName;
                TbsLog.i("QbSdk", "clearPluginConfigFile oldAppVersionName is " + string + " newAppVersionName is " + str);
                if (string == null || string.contains(str) || (sharedPreferences = context.getSharedPreferences("plugin_setting", 0)) == null) {
                    return true;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.commit();
                TbsLog.i("QbSdk", "clearPluginConfigFile done");
                return true;
            }
            return true;
        } catch (Throwable th) {
            TbsLog.i("QbSdk", "clearPluginConfigFile error is " + th.getMessage());
            return false;
        }
    }

    private static boolean c(Context context) {
        File file;
        try {
            if (r != null) {
                return true;
            }
            File r2 = p.a().r(context);
            if (r2 == null) {
                TbsLog.e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
                return false;
            }
            if (!TbsShareManager.isThirdPartyApp(context)) {
                file = new File(p.a().r(context), "tbs_sdk_extension_dex.jar");
            } else if (!TbsShareManager.j(context)) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
                return false;
            } else {
                file = new File(TbsShareManager.c(context), "tbs_sdk_extension_dex.jar");
            }
            if (!file.exists()) {
                TbsCoreLoadStat.getInstance().a(context, 406, new Exception("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!"));
                return false;
            }
            String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : r2.getAbsolutePath();
            TbsLog.i("QbSdk", "QbSdk init optDirExtension #3 is " + hostCorePathAppDefined);
            TbsLog.i("QbSdk", "new DexLoader #4 dexFile is " + file.getAbsolutePath());
            x.a().b(context);
            com.tencent.smtt.utils.m.a(context);
            r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, hostCorePathAppDefined, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (!isEnableSensitiveApi() && com.tencent.smtt.utils.i.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
                return false;
            }
            loadTBSSDKExtension(context, file.getParent());
            com.tencent.smtt.utils.i.a(s, "setClientVersion", new Class[]{Integer.TYPE}, 1);
            return true;
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "initForX5DisableConfig sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    @Deprecated
    public static void canGetAndroidId(boolean z2) {
        TbsPrivacyAccess.AndroidId.setEnabled(z2);
    }

    @Deprecated
    public static void canGetDeviceId(boolean z2) {
        TbsPrivacyAccess.DeviceId.setEnabled(z2);
    }

    @Deprecated
    public static void canGetSubscriberId(boolean z2) {
        TbsPrivacyAccess.Imsi.setEnabled(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canLoadVideo(android.content.Context r6) {
        /*
            java.lang.Object r0 = com.tencent.smtt.sdk.QbSdk.s
            java.lang.String r1 = "canLoadVideo"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5 = 0
            r3[r5] = r4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r5] = r4
            java.lang.Object r0 = com.tencent.smtt.utils.i.a(r0, r1, r3, r2)
            if (r0 == 0) goto L2a
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L33
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r2 = 313(0x139, float:4.39E-43)
            goto L30
        L2a:
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r2 = 314(0x13a, float:4.4E-43)
        L30:
            r1.a(r6, r2)
        L33:
            if (r0 != 0) goto L36
            return r5
        L36:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.canLoadVideo(android.content.Context):boolean");
    }

    public static boolean canLoadX5(Context context) {
        return a(context, false, false);
    }

    public static boolean canLoadX5FirstTimeThirdApp(Context context) {
        try {
            if (context.getApplicationInfo().packageName.contains("com.moji.mjweather") && Build.VERSION.SDK_INT == 19) {
                return true;
            }
            if (r == null) {
                File r2 = p.a().r(context);
                if (r2 == null) {
                    TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) optDir == null");
                    return false;
                }
                File file = new File(TbsShareManager.c(context), "tbs_sdk_extension_dex.jar");
                if (!file.exists()) {
                    TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) dexFile.exists()=false", true);
                    return false;
                }
                String hostCorePathAppDefined = TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : r2.getAbsolutePath();
                TbsLog.i("QbSdk", "QbSdk init optDirExtension #2 is " + hostCorePathAppDefined);
                TbsLog.i("QbSdk", "new DexLoader #2 dexFile is " + file.getAbsolutePath());
                x.a().b(context);
                com.tencent.smtt.utils.m.a(context);
                r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, hostCorePathAppDefined, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                if (s == null) {
                    if (TbsShareManager.e(context) == null && TbsShareManager.getHostCorePathAppDefined() == null) {
                        TbsLogReport.getInstance(context.getApplicationContext()).setLoadErrorCode(TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, "host context is null!");
                        return false;
                    } else if (!isEnableSensitiveApi() && com.tencent.smtt.utils.i.a(r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                        TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
                        return false;
                    } else {
                        loadTBSSDKExtension(context, file.getParent());
                    }
                }
            }
            Object a2 = com.tencent.smtt.utils.i.a(s, "canLoadX5CoreForThirdApp", new Class[0], new Object[0]);
            if (a2 == null || !(a2 instanceof Boolean)) {
                return false;
            }
            return ((Boolean) a2).booleanValue();
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "canLoadX5FirstTimeThirdApp sys WebView: " + Log.getStackTraceString(th));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.smtt.sdk.QbSdk$1] */
    public static void canOpenFile(final Context context, final String str, final ValueCallback<Boolean> valueCallback) {
        new Thread() { // from class: com.tencent.smtt.sdk.QbSdk.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                x a2 = x.a();
                a2.a(context);
                final boolean a3 = a2.b() ? a2.c().a(context, str) : false;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.smtt.sdk.QbSdk.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        valueCallback.onReceiveValue(Boolean.valueOf(a3));
                    }
                });
            }
        }.start();
    }

    public static boolean canOpenMimeFileType(Context context, String str) {
        if (!a(context, false)) {
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean canOpenWebPlus(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.canOpenWebPlus(android.content.Context):boolean");
    }

    public static boolean canUseVideoFeatrue(Context context, int i2) {
        Object a2 = com.tencent.smtt.utils.i.a(s, "canUseVideoFeatrue", new Class[]{Integer.TYPE}, Integer.valueOf(i2));
        if (a2 == null || !(a2 instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    public static boolean checkApkExist(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean checkContentProviderPrivilage(Context context) {
        if (context == null || context.getApplicationInfo().targetSdkVersion < 24 || Build.VERSION.SDK_INT < 24 || "com.tencent.mobileqq".equals(context.getApplicationInfo().packageName)) {
            return true;
        }
        try {
            if (!TextUtils.isEmpty(context.getPackageManager().getProviderInfo(new ComponentName(context.getPackageName(), "android.support.v4.content.FileProvider"), 0).authority)) {
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(context.getApplicationInfo().packageName + ".provider", 128);
        if (resolveContentProvider == null) {
            Log.e("QbSdk", "Must declare com.tencent.smtt.utils.FileProvider in AndroidManifest above Android 7.0,please view document in x5.tencent.com");
        }
        return resolveContentProvider != null;
    }

    public static void checkTbsValidity(Context context) {
        if (context == null || com.tencent.smtt.utils.m.b(context)) {
            return;
        }
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedBy checkTbsValidity");
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CORE_CHECK_VALIDITY_FALSE);
        forceSysWebView();
    }

    public static void clear(Context context) {
    }

    public static void clearAllDefaultBrowser(Context context) {
        context.getSharedPreferences(SHARE_PREFERENCES_NAME, 0).edit().clear().commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void clearAllWebViewCache(android.content.Context r6, boolean r7) {
        /*
            java.lang.String r0 = "QbSdk"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "clearAllWebViewCache("
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.smtt.utils.TbsLog.i(r0, r1)
            r0 = 1
            r1 = 0
            com.tencent.smtt.sdk.WebView r2 = new com.tencent.smtt.sdk.WebView     // Catch: java.lang.Throwable -> L45
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L45
            com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension r2 = r2.getWebViewClientExtension()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L60
            com.tencent.smtt.sdk.x r1 = com.tencent.smtt.sdk.x.a()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L40
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L40
            com.tencent.smtt.sdk.y r1 = r1.c()     // Catch: java.lang.Throwable -> L42
            r1.a(r6, r7)     // Catch: java.lang.Throwable -> L42
        L40:
            r1 = 1
            goto L60
        L42:
            r1 = move-exception
            r2 = 1
            goto L48
        L45:
            r2 = move-exception
            r1 = r2
            r2 = 0
        L48:
            java.lang.String r3 = "QbSdk"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "clearAllWebViewCache exception 2 -- "
            r4.<init>(r5)
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.smtt.utils.TbsLog.e(r3, r1)
            r1 = r2
        L60:
            if (r1 == 0) goto L6a
            java.lang.String r6 = "QbSdk"
            java.lang.String r7 = "is_in_x5_mode --> no need to clear system webview!"
            com.tencent.smtt.utils.TbsLog.i(r6, r7)
            return
        L6a:
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lb7
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb7
            r3 = 11
            if (r2 < r3) goto L84
            java.lang.String r2 = "searchBoxJavaBridge_"
            r1.removeJavascriptInterface(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "accessibility"
            r1.removeJavascriptInterface(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "accessibilityTraversal"
            r1.removeJavascriptInterface(r2)     // Catch: java.lang.Throwable -> Lb7
        L84:
            r1.clearCache(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L93
            android.webkit.CookieSyncManager.createInstance(r6)     // Catch: java.lang.Throwable -> Lb7
            android.webkit.CookieManager r7 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> Lb7
            r7.removeAllCookie()     // Catch: java.lang.Throwable -> Lb7
        L93:
            android.webkit.WebViewDatabase r7 = android.webkit.WebViewDatabase.getInstance(r6)     // Catch: java.lang.Throwable -> Lb7
            r7.clearUsernamePassword()     // Catch: java.lang.Throwable -> Lb7
            android.webkit.WebViewDatabase r7 = android.webkit.WebViewDatabase.getInstance(r6)     // Catch: java.lang.Throwable -> Lb7
            r7.clearHttpAuthUsernamePassword()     // Catch: java.lang.Throwable -> Lb7
            android.webkit.WebViewDatabase r6 = android.webkit.WebViewDatabase.getInstance(r6)     // Catch: java.lang.Throwable -> Lb7
            r6.clearFormData()     // Catch: java.lang.Throwable -> Lb7
            android.webkit.WebStorage r6 = android.webkit.WebStorage.getInstance()     // Catch: java.lang.Throwable -> Lb7
            r6.deleteAllData()     // Catch: java.lang.Throwable -> Lb7
            android.webkit.WebIconDatabase r6 = android.webkit.WebIconDatabase.getInstance()     // Catch: java.lang.Throwable -> Lb7
            r6.removeAllIcons()     // Catch: java.lang.Throwable -> Lb7
            return
        Lb7:
            r6 = move-exception
            java.lang.String r7 = "QbSdk"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "clearAllWebViewCache exception 1 -- "
            r0.<init>(r1)
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.smtt.utils.TbsLog.e(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.clearAllWebViewCache(android.content.Context, boolean):void");
    }

    public static void clearDefaultBrowser(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARE_PREFERENCES_NAME, 0);
        String d2 = com.tencent.smtt.sdk.ui.dialog.e.d(str);
        if (TextUtils.isEmpty(d2)) {
            d2 = "*/*";
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("key_tbs_picked_default_browser_" + d2).commit();
    }

    public static void closeFileReader(Context context) {
        x a2 = x.a();
        a2.a(context);
        if (a2.b()) {
            a2.c().p();
        }
    }

    public static String closeNetLogAndSavaToLocal() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return "";
        }
        try {
            Object invokeStaticMethod = a2.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "closeNetLogAndSavaToLocal", new Class[0], new Object[0]);
            return (invokeStaticMethod == null || !(invokeStaticMethod instanceof String)) ? "" : (String) invokeStaticMethod;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void configurePrivacy(Context context, TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy, String str) {
        TbsPrivacyAccess.configurePrivacy(context, configurablePrivacy, str);
    }

    public static void continueLoadSo(Context context) {
        if ("com.tencent.mm".equals(getCurrentProcessName(context)) && WebView.mWebViewCreated) {
            com.tencent.smtt.utils.i.a(s, "continueLoadSo", new Class[0], new Object[0]);
        }
    }

    public static boolean createMiniQBShortCut(Context context, String str, String str2, Drawable drawable) {
        x a2;
        if (context != null && !TbsDownloader.getOverSea(context) && !isMiniQBShortCutExist(context, str, str2) && (a2 = x.a()) != null && a2.b()) {
            Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            DexLoader b2 = a2.c().b();
            TbsLog.e("QbSdk", "qbsdk createMiniQBShortCut");
            Object invokeStaticMethod = b2.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[]{Context.class, String.class, String.class, Bitmap.class}, context, str, str2, bitmap);
            TbsLog.e("QbSdk", "qbsdk after createMiniQBShortCut ret: " + invokeStaticMethod);
            if (invokeStaticMethod != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.d(android.content.Context):void");
    }

    public static boolean deleteMiniQBShortCut(Context context, String str, String str2) {
        x a2;
        return (context == null || TbsDownloader.getOverSea(context) || (a2 = x.a()) == null || !a2.b() || a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[]{Context.class, String.class, String.class}, context, str, str2) == null) ? false : true;
    }

    public static void deleteStableCore(Context context, int i2) {
        try {
            TbsLog.i("QbSdk", "QbSdk deleteStableCore #00");
            if (!com.tencent.smtt.utils.r.b(context)) {
                TbsLog.i("QbSdk", "QbSdk deleteStableCore switch stable core close");
            } else if (context.getApplicationInfo().packageName.contains("com.tencent.mm")) {
                Context packageContext = TbsShareManager.getPackageContext(context, "com.tencent.mm", false);
                File file = packageContext == null ? new File(FileUtil.a(context, "com.tencent.mm", 4, true)) : new File(FileUtil.a(packageContext, 4));
                TbsLog.i("QbSdk", "QbSdk deleteStableCore mFilePathStable is " + file.getAbsolutePath());
                if (TbsShareManager.getTbsStableCoreVersion(context, 32) == i2) {
                    a(context, file, 32, i2);
                }
                if (TbsShareManager.getTbsStableCoreVersion(context, 64) == i2) {
                    a(context, file, 64, i2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void disAllowThirdAppDownload() {
        c = false;
    }

    public static void disableAutoCreateX5Webview() {
        j = false;
    }

    @Deprecated
    public static void disableSensitiveApi() {
        TbsPrivacyAccess.disableSensitiveApi();
    }

    public static void fileInfoDetect(Context context, String str, android.webkit.ValueCallback<String> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return;
        }
        try {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[]{Context.class, String.class, android.webkit.ValueCallback.class}, context, str, valueCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void forceSysWebView() {
        b = true;
        v = "SysWebViewForcedByOuter: " + Log.getStackTraceString(new Throwable());
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
    }

    public static long getApkFileSize(Context context) {
        if (context != null) {
            return TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, 0L);
        }
        return 0L;
    }

    public static int getCoreMinVersion() {
        return I;
    }

    public static String getCurrentProcessName(Context context) {
        FileInputStream fileInputStream;
        byte[] bArr;
        int i2;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/self/cmdline");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                bArr = new byte[256];
                i2 = 0;
                while (true) {
                    int read = fileInputStream.read();
                    if (read <= 0 || i2 >= 256) {
                        break;
                    }
                    bArr[i2] = (byte) read;
                    i2++;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        if (i2 <= 0) {
            fileInputStream.close();
            return null;
        }
        String str = new String(bArr, 0, i2, "UTF-8");
        try {
            fileInputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return str;
    }

    public static String[] getDexLoaderFileList(Context context, Context context2, String str) {
        if (!(u instanceof String[])) {
            Object a2 = com.tencent.smtt.utils.i.a(s, "getJarFiles", new Class[]{Context.class, Context.class, String.class}, context, context2, str);
            if (!(a2 instanceof String[])) {
                a2 = new String[]{""};
            }
            return (String[]) a2;
        }
        int length = u.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = str + u[i2];
        }
        return strArr;
    }

    public static boolean getDownloadWithoutWifi() {
        return G;
    }

    public static boolean getIsInitX5Environment() {
        return k;
    }

    public static boolean getIsSysWebViewForcedByOuter() {
        return b;
    }

    public static boolean getJarFilesAndLibraryPath(Context context) {
        if (s == null) {
            TbsLog.i("QbSdk", "getJarFilesAndLibraryPath sExtensionObj is null");
            return false;
        }
        Bundle bundle = (Bundle) com.tencent.smtt.utils.i.a(s, "canLoadX5CoreAndNotLoadSo", new Class[]{Integer.TYPE}, 44165);
        if (bundle != null) {
            u = bundle.getStringArray("tbs_jarfiles");
            d = bundle.getString("tbs_librarypath");
            return true;
        }
        TbsLog.i("QbSdk", "getJarFilesAndLibraryPath bundle is null and coreverison is " + p.a().a(true, context));
        return false;
    }

    public static String getMiniQBVersion(Context context) {
        x a2 = x.a();
        a2.a(context);
        if (a2 == null || !a2.b()) {
            return null;
        }
        return a2.c().f();
    }

    public static boolean getOnlyDownload() {
        return l;
    }

    public static String getQQBuildNumber() {
        return B;
    }

    public static Map<String, Object> getSettings() {
        return o;
    }

    public static boolean getTBSInstalling() {
        return H;
    }

    public static String getTID() {
        return A;
    }

    public static File getTbsFolderDir(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (com.tencent.smtt.utils.b.c()) {
                return context.getDir("tbs_64", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return context.getDir("tbs", 0);
    }

    public static String getTbsResourcesPath(Context context) {
        return TbsShareManager.g(context);
    }

    public static int getTbsSdkVersion() {
        return 44165;
    }

    public static int getTbsVersion(Context context) {
        int a2;
        return (!TbsShareManager.isThirdPartyApp(context) || (a2 = TbsShareManager.a(context, false)) <= 0) ? p.a().j(context) : a2;
    }

    public static int getTbsVersionForCrash(Context context) {
        if (TbsShareManager.isThirdPartyApp(context)) {
            return TbsShareManager.a(context, false);
        }
        int k2 = p.a().k(context);
        if (k2 == 0 && n.a(context).c() == 3) {
            reset(context);
        }
        return k2;
    }

    public static int getTmpDirTbsVersion(Context context) {
        if (n.a(context).c() == 2) {
            return p.a().e(context, 0);
        }
        if (n.a(context).b("copy_status") == 1) {
            return p.a().e(context, 1);
        }
        return 0;
    }

    public static void initBuglyAsync(boolean z2) {
        i = z2;
    }

    public static void initForinitAndNotLoadSo(Context context) {
        String str;
        String str2;
        if (r == null) {
            File r2 = p.a().r(context);
            if (r2 == null) {
                str = "QbSdk";
                str2 = "QbSdk initForinitAndNotLoadSo optDir == null";
            } else {
                File file = new File(r2, "tbs_sdk_extension_dex.jar");
                if (file.exists()) {
                    String absolutePath = r2.getAbsolutePath();
                    x.a().b(context);
                    com.tencent.smtt.utils.m.a(context);
                    r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                    return;
                }
                str = "QbSdk";
                str2 = "QbSdk initForinitAndNotLoadSo dexFile.exists()=false";
            }
            Log.e(str, str2);
        }
    }

    public static void initTbsSettings(Map<String, Object> map) {
        if (o == null) {
            o = map;
            return;
        }
        try {
            o.putAll(map);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void initX5Environment(final Context context, final PreInitCallback preInitCallback) {
        com.tencent.smtt.utils.q.a().a("init_tbs_Start");
        TbsLog.initIfNeed(context);
        if (context == null) {
            TbsLog.e("QbSdk", "initX5Environment,context=null");
            return;
        }
        b(context);
        F = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.5
            @Override // com.tencent.smtt.sdk.TbsListener
            public final void onDownloadFinish(int i2) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public final void onDownloadProgress(int i2) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public final void onInstallFinish(int i2) {
                QbSdk.preInit(context, preInitCallback);
            }
        };
        if (TbsShareManager.isThirdPartyApp(context)) {
            p.a().b(context, g.a == 0);
        }
        TbsDownloader.needDownload(context, false, false, true, new TbsDownloader.TbsDownloaderCallback() { // from class: com.tencent.smtt.sdk.QbSdk.6
            @Override // com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback
            public final void onNeedDownloadFinish(boolean z2, int i2) {
                if (TbsShareManager.findCoreForThirdPartyApp(context) == 0 && !TbsShareManager.getCoreDisabled()) {
                    TbsShareManager.forceToLoadX5ForThirdApp(context, false);
                }
                if (QbSdk.i && TbsShareManager.isThirdPartyApp(context)) {
                    TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(context);
                }
                QbSdk.preInit(context, preInitCallback);
            }
        });
        k = true;
    }

    public static boolean installLocalQbApk(Context context, String str, String str2, Bundle bundle) {
        g a2 = g.a(true);
        a2.a(context, false, false);
        if (a2 == null || !a2.b()) {
            return false;
        }
        return a2.a().a(context, str, str2, bundle);
    }

    public static void installLocalTbsCore(Context context, int i2, String str) {
        p.a().a(context, str, i2);
    }

    public static boolean intentDispatch(WebView webView, Intent intent, String str, String str2) {
        if (webView == null) {
            return false;
        }
        if (str.startsWith("mttbrowser://miniqb/ch=icon?")) {
            Context context = webView.getContext();
            int indexOf = str.indexOf("url=");
            str = indexOf > 0 ? str.substring(indexOf + 4) : null;
            HashMap hashMap = new HashMap();
            String str3 = "unknown";
            try {
                str3 = context.getApplicationInfo().packageName;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            hashMap.put("ChannelID", str3);
            hashMap.put("PosID", "14004");
            if (MttLoader.loadUrl(context, "miniqb://home".equals(str) ? "qb://navicard/addCard?cardId=168&cardName=168" : str, hashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
                x a2 = x.a();
                if (a2 != null && a2.b() && a2.c().a(context, str, null, str2, null) == 0) {
                    return true;
                }
            }
            return false;
        }
        webView.loadUrl(str);
        return false;
    }

    public static boolean isCoreVerEnabled(Context context, int i2) {
        if (i2 >= I || i2 == 0 || !com.tencent.smtt.utils.r.p(context)) {
            return true;
        }
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, new Throwable("QbSdk.setCoreMinVersion"));
        return false;
    }

    @Deprecated
    public static boolean isEnableCanGetSubscriberId() {
        return TbsPrivacyAccess.Imsi.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetAndroidID() {
        return TbsPrivacyAccess.AndroidId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetDeviceID() {
        return TbsPrivacyAccess.DeviceId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return TbsPrivacyAccess.isEnableSensitiveApi();
    }

    public static boolean isInDefaultBrowser(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARE_PREFERENCES_NAME, 0);
        String d2 = com.tencent.smtt.sdk.ui.dialog.e.d(str);
        if (TextUtils.isEmpty(d2)) {
            d2 = "*/*";
        }
        return sharedPreferences.contains("key_tbs_picked_default_browser_" + d2);
    }

    public static boolean isMiniQBShortCutExist(Context context, String str, String str2) {
        x a2;
        Object invokeStaticMethod;
        if (context == null || TbsDownloader.getOverSea(context) || (a2 = x.a()) == null || !a2.b() || (invokeStaticMethod = a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[]{Context.class, String.class}, context, str)) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        if (invokeStaticMethod instanceof Boolean) {
            bool = (Boolean) invokeStaticMethod;
        }
        return bool.booleanValue();
    }

    public static boolean isNeedInitX5FirstTime() {
        return x;
    }

    public static boolean isSuportOpenFile(String str, int i2) {
        List asList;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {"rar", "zip", "tar", "bz2", "gz", "7z", "doc", "docx", "ppt", "pptx", "xls", "xlsx", CommonConstant.File.TXT, "pdf", "epub", "chm", Constants.KEY_CONTENT_TYPE_HTML, "htm", CommonConstant.File.XML, "mht", "url", "ini", SnifferDBHelper.COLUMN_LOG, "bat", "php", "js", "lrc", CommonConstant.File.JPG, CommonConstant.File.JPEG, "png", CommonConstant.File.GIF, "bmp", "tiff", "webp", "mp3", "m4a", "aac", "amr", "wav", "ogg", MessageStatisticsEntry.PARAM_MSG_ID, "ra", "wma", "mpga", "ape", "flac", "RTSP", "RTP", "SDP", "RTMP", "mp4", "flv", "avi", "3gp", "3gpp", "webm", "ts", "ogv", IjkMediaMeta.IJKM_KEY_M3U8, "asf", "wmv", "rmvb", "rm", "f4v", "dat", "mov", "mpg", "mkv", "mpeg", "mpeg1", "mpeg2", "xvid", "dvd", "vcd", "vob", "divx"};
        String[] strArr2 = {"doc", "docx", "ppt", "pptx", "xls", "xlsx", CommonConstant.File.TXT, "pdf", "epub"};
        switch (i2) {
            case 1:
                asList = Arrays.asList(strArr2);
                break;
            case 2:
                asList = Arrays.asList(strArr);
                break;
            default:
                return false;
        }
        return asList.contains(str.toLowerCase());
    }

    public static boolean isTbsCoreInited() {
        g a2 = g.a(false);
        return a2 != null && a2.g();
    }

    public static boolean isX5DisabledSync(Context context) {
        if (n.a(context).c() == 2) {
            return false;
        }
        if (c(context)) {
            Object a2 = com.tencent.smtt.utils.i.a(s, "isX5DisabledSync", new Class[]{Integer.TYPE, Integer.TYPE}, Integer.valueOf(p.a().j(context)), 44165);
            if (a2 != null) {
                return ((Boolean) a2).booleanValue();
            }
            return true;
        }
        return true;
    }

    public static void loadTBSSDKExtension(Context context, String str) {
        Constructor<?> constructor;
        boolean z2;
        Object newInstance;
        if (s != null) {
            return;
        }
        synchronized (QbSdk.class) {
            if (s != null) {
                return;
            }
            if (r == null) {
                TbsLog.i("QbSdk", "QbSdk loadTBSSDKExtension sExtensionClass is null");
            }
            try {
                constructor = r.getConstructor(Context.class, Context.class, String.class, String.class, String.class);
                z2 = true;
            } catch (Throwable unused) {
                constructor = null;
                z2 = false;
            }
            if (TbsShareManager.isThirdPartyApp(context)) {
                Context e2 = TbsShareManager.e(context);
                if (e2 == null && TbsShareManager.getHostCorePathAppDefined() == null) {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL);
                    TbsLog.w("QbSdk", "loadTBSSDKExtension", "[LoadWarn] host is context is null.");
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                if (!z2) {
                    if (e2 == null) {
                        constructor = r.getConstructor(Context.class, Context.class, String.class);
                    } else {
                        newInstance = r.getConstructor(Context.class, Context.class).newInstance(context, e2);
                    }
                }
                newInstance = constructor.newInstance(context, e2, TbsShareManager.getHostCorePathAppDefined(), str, null);
            } else if (z2) {
                String str2 = (!"com.tencent.mm".equals(getCurrentProcessName(context)) || WebView.mWebViewCreated) ? null : "notLoadSo";
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                newInstance = constructor.newInstance(context, context, null, str, str2);
            } else {
                Constructor<?> constructor2 = r.getConstructor(Context.class, Context.class);
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                newInstance = constructor2.newInstance(context, context);
            }
            s = newInstance;
        }
    }

    public static void openBrowserList(Context context, String str, Bundle bundle, final ValueCallback<String> valueCallback) {
        String str2;
        if (context == null) {
            return;
        }
        String string = bundle != null ? bundle.getString("ChannelId") : "";
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse(str));
        String d2 = com.tencent.smtt.sdk.ui.dialog.e.d(str);
        isDefaultDialog = false;
        com.tencent.smtt.sdk.ui.dialog.d dVar = new com.tencent.smtt.sdk.ui.dialog.d(context, "选择其它应用打开", intent, bundle, valueCallback, d2, string);
        String a2 = dVar.a();
        if (a2 != null && !TextUtils.isEmpty(a2)) {
            if (TbsConfig.APP_QB.equals(a2)) {
                intent.putExtra("ChannelID", context.getApplicationContext().getPackageName());
                intent.putExtra("PosID", "4");
            }
            intent.setPackage(a2);
            intent.putExtra("big_brother_source_key", string);
            context.startActivity(intent);
            if (valueCallback == null) {
                return;
            }
            str2 = "default browser:" + a2;
        } else if (!isDefaultDialog) {
            dVar.show();
            dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.smtt.sdk.QbSdk.2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (ValueCallback.this != null) {
                        ValueCallback.this.onReceiveValue("TbsReaderDialogClosed");
                    }
                }
            });
            return;
        } else {
            new AlertDialog.Builder(context).setTitle("提示").setMessage("此文件无法打开").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.tencent.smtt.sdk.QbSdk.10
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                }
            }).show();
            if (valueCallback == null) {
                return;
            }
            str2 = "can not open";
        }
        valueCallback.onReceiveValue(str2);
    }

    public static void openBrowserList(Context context, String str, ValueCallback<String> valueCallback) {
        openBrowserList(context, str, null, valueCallback);
    }

    public static int openFileReader(Context context, String str, HashMap<String, String> hashMap, ValueCallback<String> valueCallback) {
        String str2;
        String str3;
        TbsLog.i("QbSdk", "Open file reader filepath = " + str);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (!checkContentProviderPrivilage(context)) {
            TbsLog.e("QbSdk", "Got an unexpected result when check content provider privilege above api 24");
            return -5;
        } else if (TextUtils.isEmpty(str)) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("filepath error");
            }
            TbsLog.e("QbSdk", "open openFileReader filepath error ret -1");
            return -1;
        } else {
            String lowerCase = str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT) + 1).toLowerCase();
            String str4 = hashMap.get("fileext");
            String str5 = !TextUtils.isEmpty(str4) ? str4 : lowerCase;
            if (str5 == null) {
                TbsLog.e("QbSdk", "open openFileReader null file type");
            }
            if (CommonConstant.File.APK.equalsIgnoreCase(str5)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                if (context != null && context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24) {
                    intent.addFlags(1);
                }
                Uri a2 = FileProvider.a(context, str);
                if (a2 == null) {
                    valueCallback.onReceiveValue("uri failed");
                    return -6;
                }
                intent.setDataAndType(a2, "application/vnd.android.package-archive");
                context.startActivity(intent);
                TbsLog.e("QbSdk", "open openFileReader ret = 4");
                return 4;
            }
            if (!MttLoader.isBrowserInstalled(context)) {
                str2 = "QbSdk";
                str3 = "openFileReader QQ browser not installed";
            } else if (!isSuportOpenFile(str5, 2)) {
                TbsLog.e("QbSdk", "Open file reader in qq browser, isQBSupport: false  ret = 3");
                openFileReaderListWithQBDownload(context, str, valueCallback);
                return 3;
            } else if (startQBForDoc(context, str, 4, 0, str5, a(context, hashMap))) {
                if (valueCallback != null) {
                    valueCallback.onReceiveValue("open QB");
                }
                TbsLog.e("QbSdk", "open openFileReader open QB ret = 1");
                return 1;
            } else {
                str2 = "QbSdk";
                str3 = "openFileReader startQBForDoc return false";
            }
            TbsLog.i(str2, str3);
            hashMap.put(PackageLoadReporter.LoadType.LOCAL, "true");
            TbsLog.setWriteLogJIT(true);
            int startMiniQBToLoadUrl = startMiniQBToLoadUrl(context, str, hashMap, valueCallback);
            if (startMiniQBToLoadUrl == 0) {
                TbsLog.i("QbSdk", "openFileReader open in MiniQB");
                return 2;
            }
            openFileReaderListWithQBDownload(context, str, valueCallback);
            TbsLog.i("QbSdk", "openFileReader open filereader list startMiniQBToLoadUrl ret = " + startMiniQBToLoadUrl);
            return 3;
        }
    }

    public static void openFileReaderListWithQBDownload(Context context, String str, Bundle bundle, final ValueCallback<String> valueCallback) {
        String str2;
        if (context == null || context.getApplicationInfo().packageName.equals(com.tencent.connect.common.Constants.PACKAGE_QIM) || context.getApplicationInfo().packageName.equals("com.tencent.androidqqmail")) {
            return;
        }
        String string = bundle != null ? bundle.getString("ChannelId") : "";
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        String d2 = com.tencent.smtt.sdk.ui.dialog.e.d(str);
        if (context != null && context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
        }
        Uri a2 = FileProvider.a(context, str);
        if (a2 == null) {
            TbsLog.i("QbSdk", "openFileReaderListWithQBDownload,uri failed");
            valueCallback.onReceiveValue("uri failed");
            return;
        }
        TbsLog.i("QbSdk", "openFileReaderListWithQBDownload,fileUri:" + str + ",mimeType:" + d2);
        intent.setDataAndType(a2, d2);
        isDefaultDialog = false;
        com.tencent.smtt.sdk.ui.dialog.d dVar = new com.tencent.smtt.sdk.ui.dialog.d(context, "选择其它应用打开", intent, bundle, valueCallback, d2, string);
        String a3 = dVar.a();
        TbsLog.i("QbSdk", "openFileReaderListWithQBDownload,defaultBrowser:" + a3);
        if (a3 != null && !TextUtils.isEmpty(a3) && a3.startsWith("extraMenuEvent:")) {
            TbsLog.i("QbSdk", "openFileReaderListWithQBDownload, is default extra menu action");
            valueCallback.onReceiveValue(a3);
        } else if (a3 != null && !TextUtils.isEmpty(a3) && checkApkExist(context, a3)) {
            TbsLog.i("QbSdk", "openFileReaderListWithQBDownload, is default normal menu action");
            if (TbsConfig.APP_QB.equals(a3)) {
                intent.putExtra("ChannelID", context.getApplicationContext().getPackageName());
                intent.putExtra("PosID", "4");
            }
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra("big_brother_source_key", string);
            }
            intent.setPackage(a3);
            context.startActivity(intent);
            if (valueCallback != null) {
                valueCallback.onReceiveValue("default browser:" + a3);
            }
        } else if ("com.tencent.rtxlite".equalsIgnoreCase(context.getApplicationContext().getPackageName()) && isDefaultDialog) {
            new AlertDialog.Builder(context).setTitle("提示").setMessage("此文件无法打开").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.tencent.smtt.sdk.QbSdk.8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                }
            }).show();
        } else {
            if (isDefaultDialog) {
                TbsLog.i("QbSdk", "isDefaultDialog=true");
                if (valueCallback != null) {
                    TbsLog.i("QbSdk", "isDefaultDialog=true, can not open");
                    str2 = "can not open";
                    valueCallback.onReceiveValue(str2);
                }
            } else {
                try {
                    TbsLog.i("QbSdk", "isDefaultDialog=false,try to open dialog");
                    dVar.show();
                    dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.smtt.sdk.QbSdk.9
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (ValueCallback.this != null) {
                                ValueCallback.this.onReceiveValue("TbsReaderDialogClosed");
                            }
                        }
                    });
                } catch (Exception e2) {
                    e2.printStackTrace();
                    TbsLog.i("QbSdk", "isDefaultDialog=false,try to open dialog, but failed");
                    str2 = "TbsReaderDialogClosed";
                }
            }
            TbsLog.i("QbSdk", "unexpected return, dialogBuilder not show!");
        }
    }

    public static void openFileReaderListWithQBDownload(Context context, String str, ValueCallback<String> valueCallback) {
        openFileReaderListWithQBDownload(context, str, null, valueCallback);
    }

    public static int openFileWithQB(Context context, String str, String str2) {
        TbsLog.i("QbSdk", "open openFileReader startMiniQBToLoadUrl filepath = " + str);
        if (checkContentProviderPrivilage(context)) {
            if (str == null) {
                TbsLog.i("QbSdk", "open openFileReader filepath error");
                return -5;
            }
            String lowerCase = str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT) + 1).toLowerCase();
            if (!MttLoader.isBrowserInstalled(context)) {
                TbsLog.i("QbSdk", "openFileReader QQ browser not installed");
                return -4;
            } else if (!isSuportOpenFile(lowerCase, 2)) {
                TbsLog.i("QbSdk", "openFileReader open in QB isQBSupport: false");
                return -2;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("ChannelID", context.getApplicationContext().getApplicationInfo().processName);
                hashMap.put("PosID", Integer.toString(4));
                if (MttLoader.openDocWithQb(context, str, 0, lowerCase, str2, hashMap, null)) {
                    return 0;
                }
                TbsLog.i("QbSdk", "openFileReader startQBForDoc return false");
                return -3;
            }
        }
        return -1;
    }

    public static void openNetLog(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return;
        }
        try {
            a2.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "openNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void pauseDownload() {
        TbsDownloader.pauseDownload();
    }

    public static synchronized void preInit(Context context) {
        synchronized (QbSdk.class) {
            preInit(context, null);
        }
    }

    public static synchronized void preInit(final Context context, final PreInitCallback preInitCallback) {
        synchronized (QbSdk.class) {
            com.tencent.smtt.utils.q.a().a("preinit_start");
            TbsLog.initIfNeed(context);
            TbsLog.i("QbSdk", "preInit", "processName: " + getCurrentProcessName(context));
            TbsLog.i("QbSdk", "preInit", "stack trace: " + Log.getStackTraceString(new Throwable("PreInit Detect:")));
            m = a;
            if (!t) {
                TbsLog.i("QbSdk", "preInit", "#1# Start new thread to preInit");
                final Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.tencent.smtt.sdk.QbSdk.3
                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        switch (message.what) {
                            case 1:
                                com.tencent.smtt.utils.q.a().a("preinit_finish");
                                boolean unused = QbSdk.C = TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.DISABLE_UNPREINIT);
                                if (QbSdk.j) {
                                    com.tencent.smtt.utils.q.a().a("create_webview_start");
                                    y c2 = x.a().c();
                                    if (c2 != null) {
                                        c2.a(context);
                                    }
                                    com.tencent.smtt.utils.q.a().a("create_webview_end");
                                }
                                if (preInitCallback != null) {
                                    preInitCallback.onViewInitFinished(true);
                                    com.tencent.smtt.utils.q.a().a("init_tbs_end");
                                }
                                com.tencent.smtt.utils.q.a().a(context);
                                TbsLog.writeLogToDisk();
                                return;
                            case 2:
                                com.tencent.smtt.utils.q.a().a("preinit_finish");
                                if (preInitCallback != null) {
                                    preInitCallback.onViewInitFinished(false);
                                    com.tencent.smtt.utils.q.a().a("init_tbs_end");
                                }
                                TbsLog.writeLogToDisk();
                                com.tencent.smtt.utils.q.a().a(context);
                                return;
                            case 3:
                                if (preInitCallback != null) {
                                    preInitCallback.onCoreInitFinished();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                };
                Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.QbSdk.4
                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        int a2 = p.a().a(true, context);
                        TbsDownloader.setAppContext(context);
                        TbsLog.i("QbSdk", "QbSdk preinit ver is " + a2);
                        p.a().b(context, g.a == 0);
                        TbsLog.i("QbSdk", "preInit", "#2-1# prepare initAndLoadSo");
                        g.a(true).a(context, false, false);
                        TbsLog.i("QbSdk", "preInit", "#2-2# SDKEngine init finish");
                        x a3 = x.a();
                        a3.a(context);
                        TbsLog.i("QbSdk", "preInit", "#2-3# X5CoreEngine init finish");
                        boolean b2 = a3.b();
                        handler.sendEmptyMessage(3);
                        if (b2) {
                            handler.sendEmptyMessage(1);
                        } else {
                            handler.sendEmptyMessage(2);
                        }
                    }
                };
                thread.setName("tbs_preinit");
                thread.setPriority(10);
                thread.start();
                t = true;
            }
        }
    }

    public static void reset(Context context) {
        reset(context, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: Throwable -> 0x007b, TryCatch #0 {Throwable -> 0x007b, blocks: (B:3:0x0008, B:5:0x000e, B:7:0x0014, B:12:0x002e, B:14:0x005b, B:16:0x0060), top: B:21:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: Throwable -> 0x007b, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007b, blocks: (B:3:0x0008, B:5:0x000e, B:7:0x0014, B:12:0x002e, B:14:0x005b, B:16:0x0060), top: B:21:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void reset(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "QbSdk"
            java.lang.String r1 = "QbSdk reset!"
            r2 = 1
            com.tencent.smtt.utils.TbsLog.e(r0, r1, r2)
            com.tencent.smtt.sdk.TbsDownloader.stopDownload()     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            if (r5 == 0) goto L2d
            boolean r5 = com.tencent.smtt.sdk.TbsShareManager.isThirdPartyApp(r4)     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L2d
            com.tencent.smtt.sdk.p r5 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L7b
            int r5 = r5.i(r4)     // Catch: java.lang.Throwable -> L7b
            com.tencent.smtt.sdk.p r1 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L7b
            int r1 = r1.j(r4)     // Catch: java.lang.Throwable -> L7b
            r3 = 43300(0xa924, float:6.0676E-41)
            if (r5 <= r3) goto L2d
            if (r5 == r1) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            com.tencent.smtt.sdk.TbsDownloader.c(r4)     // Catch: java.lang.Throwable -> L7b
            java.io.File r1 = getTbsFolderDir(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "core_share_decouple"
            com.tencent.smtt.utils.FileUtil.a(r1, r0, r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "QbSdk"
            java.lang.String r3 = "delete downloaded apk success"
            com.tencent.smtt.utils.TbsLog.i(r1, r3, r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.ThreadLocal<java.lang.Integer> r1 = com.tencent.smtt.sdk.p.a     // Catch: java.lang.Throwable -> L7b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7b
            r1.set(r2)     // Catch: java.lang.Throwable -> L7b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7b
            java.io.File r2 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "bugly_switch.txt"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L5e
            r1.delete()     // Catch: java.lang.Throwable -> L7b
        L5e:
            if (r5 == 0) goto L7a
            com.tencent.smtt.sdk.p r5 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L7b
            java.io.File r5 = r5.q(r4)     // Catch: java.lang.Throwable -> L7b
            com.tencent.smtt.sdk.p r1 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L7b
            java.io.File r0 = r1.f(r4, r0)     // Catch: java.lang.Throwable -> L7b
            com.tencent.smtt.utils.FileUtil.b(r5, r0)     // Catch: java.lang.Throwable -> L7b
            com.tencent.smtt.sdk.p r5 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L7b
            r5.c(r4)     // Catch: java.lang.Throwable -> L7b
        L7a:
            return
        L7b:
            r4 = move-exception
            java.lang.String r5 = "QbSdk"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QbSdk reset exception:"
            r0.<init>(r1)
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.tencent.smtt.utils.TbsLog.e(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.reset(android.content.Context, boolean):void");
    }

    public static void resetDecoupleCore(Context context) {
        TbsLog.e("QbSdk", "QbSdk resetDecoupleCore!", true);
        try {
            if (!com.tencent.smtt.utils.r.b(context)) {
                FileUtil.b(p.a().q(context));
                return;
            }
            Context packageContext = TbsShareManager.getPackageContext(context, "com.tencent.mm", false);
            File file = packageContext == null ? new File(FileUtil.a(context, "com.tencent.mm", 4, true)) : new File(FileUtil.a(packageContext, 4));
            TbsLog.e("QbSdk", "QbSdk resetDecoupleCore! mFilePathStable is " + file.getAbsolutePath(), true);
            File[] listFiles = file.listFiles();
            Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(false));
            for (File file2 : listFiles) {
                if (compile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                    TbsLog.i(TbsDownloader.LOGTAG, "QbSdk resetDecoupleCore file is " + file2.getAbsolutePath(), true);
                    file2.delete();
                }
            }
            File file3 = new File(file, TbsDownloader.getBackupFileName(false));
            TbsLog.i(TbsDownloader.LOGTAG, "QbSdk resetDecoupleCore file is " + file3.getAbsolutePath(), true);
            file3.delete();
        } catch (Throwable th) {
            TbsLog.e("QbSdk", "QbSdk resetDecoupleCore exception:" + Log.getStackTraceString(th));
        }
    }

    public static void resumeDownload() {
        TbsDownloader.resumeDownload();
    }

    public static void setAppList(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        TbsPrivacyAccess.configureAllPrivacy(context, TextUtils.join(CommonConstant.Symbol.COMMA, list));
    }

    public static void setCoreMinVersion(int i2) {
        TbsLog.i("QbSdk", "setCoreMinVersion: " + i2);
        I = i2;
    }

    public static void setCurrentID(String str) {
        if (str != null && str.startsWith(TID_QQNumber_Prefix)) {
            String substring = str.substring(3);
            A = "0000000000000000".substring(substring.length()) + substring;
        }
    }

    public static void setDisableUnpreinitBySwitch(boolean z2) {
        C = z2;
        TbsLog.i("QbSdk", "setDisableUnpreinitBySwitch -- mDisableUnpreinitBySwitch is " + C);
    }

    public static void setDisableUseHostBackupCoreBySwitch(boolean z2) {
        mDisableUseHostBackupCore = z2;
        TbsLog.i("QbSdk", "setDisableUseHostBackupCoreBySwitch -- mDisableUseHostBackupCore is " + mDisableUseHostBackupCore);
    }

    public static void setDownloadWithoutWifi(boolean z2) {
        G = z2;
    }

    public static void setEnableForThirdParty(Context context, Bundle bundle) {
        com.tencent.smtt.utils.r.a(context, bundle);
    }

    public static void setNeedInitX5FirstTime(boolean z2) {
        x = z2;
    }

    public static void setNetLogEncryptionKey(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return;
        }
        try {
            a2.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "setNetLogEncryptionKey", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setNewDnsHostList(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return;
        }
        try {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setNewDnsHostList", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setOnlyDownload(boolean z2) {
        l = z2;
    }

    public static void setQQBuildNumber(String str) {
        B = str;
    }

    public static void setTBSInstallingStatus(boolean z2) {
        H = z2;
    }

    public static void setTbsListener(TbsListener tbsListener) {
        E = tbsListener;
    }

    public static void setTbsLogClient(TbsLogClient tbsLogClient) {
        TbsLog.setTbsLogClient(tbsLogClient);
    }

    public static void setUploadCode(Context context, int i2) {
        if (i2 >= 130 && i2 <= 139) {
            TbsDownloadUpload tbsDownloadUpload = TbsDownloadUpload.getInstance(context);
            tbsDownloadUpload.a.put(TbsDownloadUpload.TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, Integer.valueOf(i2));
            tbsDownloadUpload.commit();
        } else if (i2 < 150 || i2 > 159) {
        } else {
            TbsDownloadUpload tbsDownloadUpload2 = TbsDownloadUpload.getInstance(context);
            tbsDownloadUpload2.a.put(TbsDownloadUpload.TbsUploadKey.KEY_STARTDOWNLOAD_CODE, Integer.valueOf(i2));
            tbsDownloadUpload2.commit();
        }
    }

    public static void setUserID(Context context, Bundle bundle) {
        TbsPrivacyAccess.configureAllPrivacy(context, bundle);
    }

    public static int startMiniQBToLoadUrl(Context context, String str, HashMap<String, String> hashMap, android.webkit.ValueCallback<String> valueCallback) {
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS);
        if (context == null) {
            return -100;
        }
        x a2 = x.a();
        a2.a(context);
        if (!a2.b()) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE);
            Log.e("QbSdk", "startMiniQBToLoadUrl  ret = -102");
            return -102;
        } else if (context == null || !context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") || getTbsVersion(context) >= 25487) {
            int a3 = a2.c().a(context, str, hashMap, null, valueCallback);
            if (a3 == 0) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_SUCCESS);
            } else {
                TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
                StringBuilder sb = new StringBuilder();
                sb.append(a3);
                tbsLogReport.setLoadErrorCode(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_FAILED, sb.toString());
            }
            Log.e("QbSdk", "startMiniQBToLoadUrl  ret = " + a3);
            return a3;
        } else {
            return -101;
        }
    }

    public static boolean startQBForDoc(Context context, String str, int i2, int i3, String str2, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationContext().getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i2));
        return MttLoader.openDocWithQb(context, str, i3, str2, hashMap, bundle);
    }

    public static boolean startQBForVideo(Context context, String str, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i2));
        return MttLoader.openVideoWithQb(context, str, hashMap);
    }

    public static boolean startQBToLoadurl(Context context, String str, int i2, WebView webView) {
        x a2;
        Object invokeStaticMethod;
        IX5WebViewBase iX5WebViewBase;
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i2));
        if (webView == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                if ((str2 == "com.tencent.mm" || str2 == "com.tencent.mobileqq") && (a2 = x.a()) != null && a2.b() && (invokeStaticMethod = a2.c().b().invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0])) != null && (iX5WebViewBase = (IX5WebViewBase) invokeStaticMethod) != null) {
                    webView = (WebView) iX5WebViewBase.getView().getParent();
                }
            } catch (Exception unused) {
            }
        }
        return MttLoader.loadUrl(context, str, hashMap, "QbSdk.startQBToLoadurl", webView) == 0;
    }

    public static boolean startQBWithBrowserlist(Context context, String str, int i2) {
        boolean startQBToLoadurl = startQBToLoadurl(context, str, i2, null);
        if (!startQBToLoadurl) {
            openBrowserList(context, str, null);
        }
        return startQBToLoadurl;
    }

    public static boolean startQbOrMiniQBToLoadUrl(Context context, String str, HashMap<String, String> hashMap, ValueCallback<String> valueCallback) {
        if (context == null) {
            return false;
        }
        x a2 = x.a();
        a2.a(context);
        if (hashMap != null && "5".equals(hashMap.get("PosID")) && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getAdWebViewInfoFromX5Core", new Class[0], new Object[0]);
        }
        if (MttLoader.loadUrl(context, str, hashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
            return a2.b() && (context == null || !context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") || getTbsVersion(context) >= 25487) && a2.c().a(context, str, hashMap, null, valueCallback) == 0;
        }
        return true;
    }

    public static void unForceSysWebView() {
        b = false;
        TbsLog.e("QbSdk", "sys WebView: unForceSysWebView called");
    }

    public static synchronized boolean unPreInit(Context context) {
        synchronized (QbSdk.class) {
        }
        return true;
    }

    public static void uploadNetLog(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            return;
        }
        try {
            a2.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "uploadNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static boolean useSoftWare() {
        if (s == null) {
            return false;
        }
        Object a2 = com.tencent.smtt.utils.i.a(s, "useSoftWare", new Class[0], new Object[0]);
        if (a2 == null) {
            a2 = com.tencent.smtt.utils.i.a(s, "useSoftWare", new Class[]{Integer.TYPE}, Integer.valueOf(a.a()));
        }
        if (a2 == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }
}
