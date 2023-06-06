package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes6.dex */
public enum TbsPrivacyAccess {
    DeviceId(false),
    Imsi(false),
    AndroidId(false),
    MacAddress(false),
    AndroidVersion(true),
    DeviceModel(true),
    AppList(true);
    
    @Deprecated
    private static boolean a = true;
    private static String c = "";
    private boolean b;

    /* loaded from: classes6.dex */
    public enum ConfigurablePrivacy {
        IMSI(Constants.Environment.KEY_IMSI),
        ANDROID_ID("android_id"),
        MAC("mac"),
        ANDROID_VERSION("android_version"),
        DEVICE_MODEL("device_model"),
        APP_LIST("app_list"),
        QIMEI36("q36"),
        MODEL("model"),
        OAID("oaid"),
        SERIAL(AppUtil.CacheKey.SERIAL),
        ACTION("action"),
        QB_INSTALLED("qb_installed");
        
        String a;

        ConfigurablePrivacy(String str) {
            this.a = str;
        }
    }

    TbsPrivacyAccess(boolean z) {
        this.b = z;
    }

    private static void a(SharedPreferences.Editor editor, ConfigurablePrivacy configurablePrivacy, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TbsLog.i("TbsPrivacy", "doConfigPrivacy  " + configurablePrivacy.a + " is " + str);
        if (!TextUtils.isEmpty(configurablePrivacy.a) && configurablePrivacy.a.equals("action")) {
            a(str);
            return;
        }
        editor.putString(configurablePrivacy.a, str);
        TbsLog.i("TbsPrivacy", "configurePrivacy " + configurablePrivacy.a + " is " + str);
    }

    private static void a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.equals("deleteQBApk")) {
                String str2 = Environment.getExternalStorageDirectory() + File.separator;
                if (!str2.equals("")) {
                    str2 = str2 + "Android" + File.separator + "data" + File.separator + c + File.separator + "files" + File.separator + "Download";
                }
                File file = new File(str2);
                TbsLog.i("TbsPrivacy", "doActionByApp QbApkDir is " + file.getAbsolutePath());
                FileUtil.b(file);
            }
        } catch (Throwable th) {
            TbsLog.i("TbsPrivacy", "doActionByApp stack is " + Log.getStackTraceString(th));
        }
    }

    public static void configureAllPrivacy(Context context, Bundle bundle) {
        ConfigurablePrivacy[] values;
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.containsKey("qimei36")) {
                bundle.putString(ConfigurablePrivacy.QIMEI36.a, bundle.getString("qimei36"));
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                TbsLog.i("TbsPrivacy", "configureAllPrivacy bundle key is " + it.next());
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
            c = context.getApplicationInfo().packageName;
            for (ConfigurablePrivacy configurablePrivacy : ConfigurablePrivacy.values()) {
                if (bundle.containsKey(configurablePrivacy.a)) {
                    a(edit, configurablePrivacy, bundle.getString(configurablePrivacy.a));
                }
            }
            edit.putString("app_call", "done");
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void configureAllPrivacy(Context context, String str) {
        if (str == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
            edit.putString("app_list", str);
            edit.putString("app_call", "done");
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void configurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
        a(edit, configurablePrivacy, str);
        edit.commit();
    }

    @Deprecated
    public static void disableSensitiveApi() {
        a = false;
        HashMap hashMap = new HashMap();
        hashMap.put(TbsCoreSettings.NO_SENSITIVE_API, Boolean.TRUE);
        QbSdk.initTbsSettings(hashMap);
    }

    public static String getConfigurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        return context.getSharedPreferences("uifa", 0).getString(configurablePrivacy.a, str);
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return a;
    }

    public final boolean isDisabled() {
        return !this.b;
    }

    public final boolean isEnabled() {
        return this.b;
    }

    public final void setEnabled(boolean z) {
        this.b = z;
        TbsLog.i("TbsPrivacy", name() + " is " + z);
    }
}
