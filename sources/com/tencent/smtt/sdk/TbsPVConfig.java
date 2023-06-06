package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public class TbsPVConfig extends TbsBaseConfig {
    private static TbsPVConfig b;
    public SharedPreferences mPreferences;

    /* loaded from: classes6.dex */
    public interface TbsPVConfigKey {
        public static final String KEY_DISABLED_CORE_VERSION = "disabled_core_version";
        public static final String KEY_EMERGENT_CORE_VERSION = "emergent_core_version";
        public static final String KEY_ENABLE_NO_SHARE_GRAY = "enable_no_share_gray";
        public static final String KEY_GET_LOCALCOREVERSION_MORETIMES = "get_localcoreversion_moretimes";
        public static final String KEY_IS_DISABLE_HOST_BACKUP_CORE = "disable_host_backup";
        public static final String KEY_READ_APK = "read_apk";
        public static final String KEY_TBS_CORE_SANDBOX_MODE_ENABLE = "tbs_core_sandbox_mode_enable";
    }

    private TbsPVConfig() {
    }

    public static synchronized TbsPVConfig getInstance(Context context) {
        TbsPVConfig tbsPVConfig;
        synchronized (TbsPVConfig.class) {
            if (b == null) {
                TbsPVConfig tbsPVConfig2 = new TbsPVConfig();
                b = tbsPVConfig2;
                tbsPVConfig2.init(context);
            }
            tbsPVConfig = b;
        }
        return tbsPVConfig;
    }

    public static synchronized void releaseInstance() {
        synchronized (TbsPVConfig.class) {
            b = null;
        }
    }

    @Override // com.tencent.smtt.sdk.TbsBaseConfig
    public String getConfigFileName() {
        return "tbs_pv_config";
    }

    public synchronized int getDisabledCoreVersion() {
        int i;
        i = 0;
        try {
            String str = this.a.get(TbsPVConfigKey.KEY_DISABLED_CORE_VERSION);
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public synchronized int getEmergentCoreVersion() {
        int i;
        i = 0;
        try {
            String str = this.a.get(TbsPVConfigKey.KEY_EMERGENT_CORE_VERSION);
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public synchronized int getLocalCoreVersionMoreTimes() {
        int i;
        i = 0;
        try {
            String str = this.a.get(TbsPVConfigKey.KEY_GET_LOCALCOREVERSION_MORETIMES);
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public synchronized int getReadApk() {
        int i;
        i = 0;
        try {
            String str = this.a.get(TbsPVConfigKey.KEY_READ_APK);
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public synchronized String getSyncMapValue(String str) {
        return this.a.get(str);
    }

    public synchronized boolean getTbsCoreSandboxModeEnable() {
        boolean z;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        z = "true".equals(this.a.get(TbsPVConfigKey.KEY_TBS_CORE_SANDBOX_MODE_ENABLE));
        return z;
    }

    public synchronized boolean isDisableHostBackupCore() {
        boolean z;
        String str;
        try {
            str = this.a.get(TbsPVConfigKey.KEY_IS_DISABLE_HOST_BACKUP_CORE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(str)) {
            z = str.equals("true");
        }
        return z;
    }

    public synchronized boolean isEnableNoCoreGray() {
        boolean z;
        String str;
        try {
            str = this.a.get(TbsPVConfigKey.KEY_ENABLE_NO_SHARE_GRAY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(str)) {
            z = str.equals("true");
        }
        return z;
    }

    public synchronized void putData(String str, String str2) {
        this.a.put(str, str2);
    }
}
