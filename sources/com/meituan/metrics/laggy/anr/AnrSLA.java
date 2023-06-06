package com.meituan.metrics.laggy.anr;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AnrSLA {
    private static final String CIPS_CHANNEL_ANR = "metricx_anr";
    public static final String CIPS_KEY_ANR_DISCARD_COUNT = "anrDiscardCount";
    public static final String CIPS_KEY_ANR_RECORD_COUNT = "anrRecordCount";
    public static final String CIPS_KEY_ANR_REPORT_COUNT = "anrReportCount";
    public static final String CIPS_KEY_CHECK_PASS_COUNT = "checkPassCount";
    public static final String CIPS_KEY_ENABLE_EMPTY_PROCESS_INFO = "enableEmptyProcessErrorStateInfo";
    public static final String CIPS_KEY_EXIT_FAIL_COUNT = "exitInfoFailCount";
    public static final String CIPS_KEY_EXIT_REPEAT_COUNT = "exitInfoRepeatCount";
    public static final String CIPS_KEY_INVALID_THRESHOLD_COUNT = "invalidThresholdCount";
    public static final String CIPS_KEY_MAIN_CHECK_FAIL_COUNT = "mainCheckFailCount";
    public static final String CIPS_KEY_MONITOR_AVAILABLE_COUNT = "monitorAvailableCount";
    public static final String CIPS_KEY_OTHER_CHECK_FAIL_COUNT = "otherCheckFailCount";
    public static final String CIPS_KEY_SAME_ANR_COUNT = "sameAnrCount";
    public static final String CIPS_KEY_USE_SIGNAL = "lastUseSignal";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;
    private static volatile AnrSLA sInstance;
    private q anrStorage;
    private HashMap<String, Object> lastCacheSLA;

    public AnrSLA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7504fa2712629adf4f797fce0df5d56b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7504fa2712629adf4f797fce0df5d56b");
        } else {
            this.lastCacheSLA = new HashMap<>();
        }
    }

    public static AnrSLA getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2215304902faa4e8cdf23e07687dde95", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnrSLA) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2215304902faa4e8cdf23e07687dde95");
        }
        if (sInstance == null) {
            synchronized (AnrSLA.class) {
                if (sInstance == null) {
                    sInstance = new AnrSLA();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b86f359b0d3d209c594e63c0d86c5d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b86f359b0d3d209c594e63c0d86c5d6");
            return;
        }
        this.anrStorage = q.a(context, CIPS_CHANNEL_ANR, 2);
        getLastCacheSLA();
        isInit = true;
    }

    public void setAnrCIPS(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58d40d36867f0bd07cd44866ac9138a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58d40d36867f0bd07cd44866ac9138a7");
        } else if (isInit) {
            this.anrStorage.a(str, z);
        }
    }

    public void updateAnrCIPS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61bed813b57bf38f78c505451babc4fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61bed813b57bf38f78c505451babc4fb");
        } else if (isInit) {
            this.anrStorage.a(str, this.anrStorage.b(str, 0) + 1);
        }
    }

    public void updateLastAnrSLA(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76a2591ea0e69be71fe1ff1bf2e088e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76a2591ea0e69be71fe1ff1bf2e088e5");
        } else if (isInit) {
            try {
                if (this.lastCacheSLA.containsKey(str)) {
                    this.lastCacheSLA.put(str, Integer.valueOf(((Integer) this.lastCacheSLA.get(str)).intValue() + 1));
                } else {
                    this.lastCacheSLA.put(str, 1);
                }
            } catch (ClassCastException unused) {
            }
        }
    }

    private void getLastCacheSLA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b8d69171ee2f878ff189852e2596b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b8d69171ee2f878ff189852e2596b8");
            return;
        }
        addOptional(this.lastCacheSLA, CIPS_KEY_MONITOR_AVAILABLE_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_ANR_RECORD_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_ANR_REPORT_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_CHECK_PASS_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_MAIN_CHECK_FAIL_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_OTHER_CHECK_FAIL_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_SAME_ANR_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_INVALID_THRESHOLD_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_ANR_DISCARD_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_EXIT_FAIL_COUNT);
        addOptional(this.lastCacheSLA, CIPS_KEY_EXIT_REPEAT_COUNT);
        this.lastCacheSLA.put(CIPS_KEY_USE_SIGNAL, Boolean.valueOf(this.anrStorage.b(CIPS_KEY_USE_SIGNAL, false)));
        this.lastCacheSLA.put(CIPS_KEY_ENABLE_EMPTY_PROCESS_INFO, Boolean.valueOf(this.anrStorage.b(CIPS_KEY_ENABLE_EMPTY_PROCESS_INFO, false)));
        this.anrStorage.c();
    }

    public void reportLastAnrSLA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed38bbad6107ae8655d8d2d2d419c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed38bbad6107ae8655d8d2d2d419c59");
        } else {
            Babel.log(new Log.Builder("").generalChannelStatus(true).optional(this.lastCacheSLA).tag("anrSLA").build());
        }
    }

    private void addOptional(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95f1448d74f1ec52aa71ae0ec1be637f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95f1448d74f1ec52aa71ae0ec1be637f");
        } else {
            hashMap.put(str, Integer.valueOf(this.anrStorage.b(str, 0)));
        }
    }
}
