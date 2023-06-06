package com.meituan.android.common.dfingerprint;

import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.dfingerprint.network.ContentType;
import com.meituan.android.common.dfingerprint.store.DfpSharedPref;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.a;
import com.meituan.android.common.mtguard.collect.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* loaded from: classes2.dex */
public class DFPConfigs {
    public static final String API_NOT_SUPPORT = "api_not_support";
    public static final String API_RET_NULL = "err_n";
    private static final String ApplistConfigPath = "/v1/scfg";
    private static final String BioPath = "/fingerprint/v1/app/bio/info/report";
    public static final String DFP_VN = "5.17.4";
    public static final String HORN_CACHE_KEY_BACK = "7";
    public static final String HORN_CACHE_KEY_BIO_CONFIG = "11";
    public static final String HORN_CACHE_KEY_BIO_FIELD = "13";
    public static final String HORN_CACHE_KEY_BLK = "4";
    public static final String HORN_CACHE_KEY_ENC_SALT = "8";
    public static final String HORN_CACHE_KEY_ENV = "1";
    public static final String HORN_CACHE_KEY_ENV_BLK = "6";
    public static final String HORN_CACHE_KEY_FUNCS = "10";
    public static final String HORN_CACHE_KEY_ROM_CHECK = "9";
    public static final String HORN_CACHE_KEY_SIG = "5";
    public static final String HORN_CACHE_KEY_SIUA = "2";
    public static final String HORN_CACHE_KEY_VMP = "12";
    public static final String HORN_CACHE_KEY_XID = "3";
    private static final String HOST = "appsec-mobile.meituan.com";
    public static final String JAVA_EXCEPTION = "err_e";
    public static final String KEY_DEVICE_INFO_LAST_REPORT_TIME = "dfp_last_report_v2";
    public static final String KEY_DEVICE_INFO_REPORT_INTERVAL = "device_info_report_interval";
    public static final String KEY_DFPID = "dfp_id";
    public static final String KEY_DFPID_EXPIRE_TIME = "dfp_expire_time";
    public static final String KEY_FIRST_LAUNCHTIME = "dfp_flt";
    public static final String KEY_IMEI = "dfp_imei";
    public static final String KEY_INTERVAL_TIME = "dfp_interval_time";
    public static final String KEY_LAST_BATTERY = "dfp_lastB";
    public static final String KEY_LAST_REPORT_V2 = "dfp_last_report_v2";
    public static final String KEY_LAST_UPDATE_TIME = "dfp_last_update_time";
    public static final String KEY_LOAD_SO = "v5_load_so";
    public static final String KEY_LOCAL_ID = "dfp_local_id";
    public static final String KEY_XID_EXPIRED_TIME = "xid_expired_time";
    public static final String KEY_XID_ID = "xid_id";
    public static final String KEY_XID_REPORT_INTERVAL = "xid_report_interval";
    private static int LUCKY_NUMBER = 10000;
    private static final String MINI_FAMA_HOST = "timeservice.meituan.com";
    private static final String MINI_FAMA_TEST_HOST = "timeservice.inf.test.sankuai.com";
    public static final String MTDFP_CONFIG = "sec_dfp_settings";
    public static final String MTGUARD_REQ_APPLIST_OPEN = "4";
    public static final String MTGUARD_REQ_BIO = "6";
    public static final String MTGUARD_REQ_DEVICE_INFO = "3";
    public static final String MTGUARD_REQ_FAMA = "2";
    public static final String MTGUARD_REQ_FAMA_MINI = "5";
    public static final String MTGUARD_REQ_XID = "1";
    public static final String NO_PERMISSION = "err_p";
    public static int ONE_HOUR = 3600000;
    private static int POPULATION = 10000;
    public static final String PREFIX = "dfp_5.17.4_";
    public static final String SETUP_EMPTY = "setup_empty";
    public static final String SYS_FAILURE = "err_f";
    private static final String TEST_HOST = "appsec-mobile.sec.test.sankuai.com";
    private static int TIME_OUT = 30;
    private static final String UPLOAD_CT_JSON = "application/json";
    private static final String UPLOAD_CT_TEXT = "text/plain; charset=ISO-8859-1";
    private static final String XidPath = "/fingerprint/v1/info/report";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String deviceInfoPath = "/v5/device-info";
    private static final String dfpIDPath = "/v5/sign";
    public static boolean isDfpidFirst = true;
    public static boolean isMiniFamaFirst = true;
    public static boolean isMtgsigFirst = true;
    public static boolean isXidFirst = true;
    private static final String miniFamaPath = "/ntp";
    public static int reportFlag;

    public static String getApplistConfigPath() {
        return ApplistConfigPath;
    }

    public static String getBioPath() {
        return BioPath;
    }

    public static String getContentType(ContentType contentType) {
        return contentType == ContentType.application_json ? "application/json" : contentType == ContentType.plain_text ? UPLOAD_CT_TEXT : "";
    }

    public static String getDFPIDPath() {
        return dfpIDPath;
    }

    public static String getDeviceInfoPath() {
        return deviceInfoPath;
    }

    public static String getHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fdeb0201e31938894583de25b1eca32", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fdeb0201e31938894583de25b1eca32") : a.h.booleanValue() ? TEST_HOST : HOST;
    }

    public static String getMiniFamaHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "821229a3ebc937aa91e57fd3cb6a673e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "821229a3ebc937aa91e57fd3cb6a673e") : a.h.booleanValue() ? MINI_FAMA_TEST_HOST : MINI_FAMA_HOST;
    }

    public static String getMiniFamaPath() {
        return miniFamaPath;
    }

    public static int getPort() {
        return 443;
    }

    public static int getReportFlag(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "827f8b3522468b501c4fb3de532bcc99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "827f8b3522468b501c4fb3de532bcc99")).intValue();
        }
        if (iDFPManager == null) {
            return 0;
        }
        DfpSharedPref dfpSharedPref = DfpSharedPref.getInstance(iDFPManager);
        Xid xid = dfpSharedPref.getXid();
        int i = ((xid == null || xid.isEmpty()) && TextUtils.isEmpty(NBridge.main1(57, new Object[]{KEY_XID_EXPIRED_TIME}))) ? 1 : 0;
        if (isXidFirst) {
            i |= 2;
        }
        String main1 = NBridge.main1(57, new Object[]{KEY_DFPID_EXPIRE_TIME});
        if (dfpSharedPref.getLastUpdateTime() == -1 && TextUtils.isEmpty(main1)) {
            i |= 4;
        }
        if (dfpSharedPref.readLong("dfp_last_report_v2") == -1) {
            i |= 8;
        }
        return iDFPManager.getIdStore().getLocalId().isEmpty() ? i | 16 : i;
    }

    public static String getScheme() {
        return "https";
    }

    public static int getTimeOut() {
        return TIME_OUT;
    }

    public static String getXidPath() {
        return XidPath;
    }

    public static boolean isReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aed19591140e0edabc5354afbaf80f3f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aed19591140e0edabc5354afbaf80f3f")).booleanValue() : new Random().nextInt(POPULATION) + 1 == LUCKY_NUMBER;
    }

    public static int updateReportWithBio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf1d63766e9406618f34b69903c120e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf1d63766e9406618f34b69903c120e6")).intValue();
        }
        if (b.a()) {
            return b.b;
        }
        int i = reportFlag;
        return isXidFirst ? i | 2 : i & (-3);
    }
}
