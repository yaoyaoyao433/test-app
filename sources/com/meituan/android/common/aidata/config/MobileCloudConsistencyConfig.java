package com.meituan.android.common.aidata.config;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MobileCloudConsistencyConfig {
    private static final int DEFAULT_MAX_GAP_COUNT_PER_LOG = 500;
    private static final int DEFAULT_REPORT_DELAY_TIME = 60;
    private static final String TAG = "MobileCloudConsistencyConfig";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mGestureCollectIdFilterEnabled;
    private boolean mGestureReportEnabled;
    private boolean mGestureReportIdFilterEnabled;
    private boolean mLXReportEnabled;
    private int mMaxGapCountPerLog;
    private double mReportDelayTime;
    private int mStmEndOffset;
    private int mStmStartOffset;

    public MobileCloudConsistencyConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "012f8589b8af19c0f964ec127610fd09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "012f8589b8af19c0f964ec127610fd09");
            return;
        }
        this.mReportDelayTime = 60.0d;
        this.mMaxGapCountPerLog = 500;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MobileCloudConsistencyConfigHolder {
        private static final MobileCloudConsistencyConfig INSTANCE = new MobileCloudConsistencyConfig();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static MobileCloudConsistencyConfig getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "433b362c90cc5b90ec7d224e8c63f151", RobustBitConfig.DEFAULT_VALUE) ? (MobileCloudConsistencyConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "433b362c90cc5b90ec7d224e8c63f151") : MobileCloudConsistencyConfigHolder.INSTANCE;
    }

    public void updateConfig(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb44e5aa1fe7d89d8240a7386c010e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb44e5aa1fe7d89d8240a7386c010e70");
            return;
        }
        new StringBuilder("updateConfig to \n").append(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            new StringBuilder("config is not valid: ").append(e);
        }
        if (jSONObject == null) {
            return;
        }
        synchronized (this) {
            this.mReportDelayTime = jSONObject.optDouble("delay_interval", 60.0d);
            this.mLXReportEnabled = jSONObject.optBoolean("lx_need_report", false);
            this.mGestureReportEnabled = jSONObject.optBoolean("gesture_need_report", false);
            this.mMaxGapCountPerLog = jSONObject.optInt("max_gap_count_per_log", 500);
            this.mStmStartOffset = jSONObject.optInt("stm_start_offset", 0);
            this.mStmEndOffset = jSONObject.optInt("stm_end_offset", 0);
            this.mGestureReportIdFilterEnabled = jSONObject.optBoolean("gesture_report_id_filter", false);
            this.mGestureCollectIdFilterEnabled = jSONObject.optBoolean("gesture_collect_id_filter", false);
        }
    }

    public boolean isLXReportEnabled() {
        return this.mLXReportEnabled;
    }

    public boolean isGestureReportEnabled() {
        return this.mGestureReportEnabled;
    }

    public double getReportDelayTime() {
        double d = this.mReportDelayTime;
        if (d > 0.0d) {
            return d;
        }
        return 60.0d;
    }

    public int getMaxGapCountPerLog() {
        int i = this.mMaxGapCountPerLog;
        if (i > 0) {
            return i;
        }
        return 500;
    }

    public int getStmStartOffset() {
        return this.mStmStartOffset;
    }

    public int getStmEndOffset() {
        return this.mStmEndOffset;
    }

    public boolean isGestureReportIdFilterEnabled() {
        return this.mGestureReportIdFilterEnabled;
    }

    public boolean isGestureCollectIdFilterEnabled() {
        return this.mGestureCollectIdFilterEnabled;
    }
}
