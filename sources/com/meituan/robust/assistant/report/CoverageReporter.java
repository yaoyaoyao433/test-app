package com.meituan.robust.assistant.report;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.robust.Patch;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.assistant.ThrowableReporter;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.util.ProcessUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverageReporter implements RobustCallBack {
    private static final String BABEL_TAG_ROBUST_COVERAGE = "robust_coverage";
    private static final String ROBUST_TOKEN = "58802eca9c5c6168cb478dfb";
    private static final String SP_ROBUST_COVERAGE_APPLIED = "robust_coverage_applied";
    private static final String SP_ROBUST_COVERAGE_DOWNLOADED = "robust_coverage_downloaded";
    static final int TYPE_APPLY_FAIL = 6;
    static final int TYPE_APPLY_SUCCESS = 5;
    static final int TYPE_DOWNLOAD_FAIL = 4;
    static final int TYPE_DOWNLOAD_SUCCESS = 3;
    @Deprecated
    private static final int TYPE_FIRST_APPLIED = 2;
    @Deprecated
    private static final int TYPE_FIRST_DOWNLOADED = 1;
    private static volatile CoverageReporter mInstance;
    private Context context;
    private PatchReportState patchReportState = new PatchReportState();
    private Map<String, Object> commonInfoMap = new HashMap();

    @Override // com.meituan.robust.RobustCallBack
    public void logNotify(String str, String str2) {
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchListFetched(boolean z, boolean z2, List<Patch> list) {
    }

    private CoverageReporter(Context context) {
        try {
            this.context = context;
            initCommonInfoMap(context);
            Babel.initSDK(context, BABEL_TAG_ROBUST_COVERAGE, "58802eca9c5c6168cb478dfb");
        } catch (Throwable th) {
            th.printStackTrace();
            ThrowableReporter.report(th);
        }
    }

    public static CoverageReporter getInstance(Context context) {
        if (mInstance == null) {
            synchronized (CoverageReporter.class) {
                if (mInstance == null) {
                    mInstance = new CoverageReporter(context);
                }
            }
        }
        return mInstance;
    }

    private void initCommonInfoMap(Context context) {
        try {
            this.commonInfoMap.put(PackageManageUtil.c, context.getPackageName());
        } catch (Throwable unused) {
        }
        try {
            this.commonInfoMap.put("appVersion", Robust.getRobustParamsProvider().getVersionName(context));
        } catch (Throwable unused2) {
        }
        try {
            this.commonInfoMap.put("robustVersion", "0.8.28");
        } catch (Throwable unused3) {
        }
    }

    private void reportDownload(Patch patch, boolean z) {
        if (patch == null || TextUtils.isEmpty(patch.getAppHash()) || TextUtils.isEmpty(patch.getMd5())) {
            return;
        }
        if (z) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(SP_ROBUST_COVERAGE_DOWNLOADED, 0);
            String str = patch.getAppHash() + CommonConstant.Symbol.UNDERLINE + patch.getMd5();
            int i = sharedPreferences.getInt(str, 0);
            if (i == 0) {
                report(patch, 1);
            } else {
                report(patch, 3);
            }
            sharedPreferences.edit().putInt(str, i + 1).apply();
            return;
        }
        report(patch, 4);
    }

    private void reportApply(Patch patch, boolean z) {
        if (patch == null || TextUtils.isEmpty(patch.getAppHash()) || TextUtils.isEmpty(patch.getMd5())) {
            return;
        }
        if (z) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(SP_ROBUST_COVERAGE_APPLIED, 0);
            String str = patch.getAppHash() + CommonConstant.Symbol.UNDERLINE + patch.getMd5();
            int i = sharedPreferences.getInt(str, 0);
            if (i == 0) {
                report(patch, 2);
            } else {
                report(patch, 5);
            }
            sharedPreferences.edit().putInt(str, i + 1).apply();
            return;
        }
        report(patch, 6);
    }

    private void report(Patch patch, int i) {
        try {
            Log.Builder builder = new Log.Builder("");
            HashMap hashMap = new HashMap(this.commonInfoMap);
            if (1 == i) {
                hashMap.put("type", Integer.valueOf(i));
                i = 3;
            } else if (2 == i) {
                hashMap.put("type", Integer.valueOf(i));
                i = 5;
            }
            if (this.patchReportState.hasReported(patch, i)) {
                return;
            }
            hashMap.put("patchReportType", Integer.valueOf(i));
            hashMap.put("patchId", patch.getName());
            hashMap.put("patchMd5", patch.getMd5());
            hashMap.put("robustApkHash", patch.getAppHash());
            builder.tag(BABEL_TAG_ROBUST_COVERAGE).optional(hashMap);
            Babel.logRT(builder.build());
            this.patchReportState.addReport(patch, i);
        } catch (Throwable th) {
            ThrowableReporter.report(th);
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchFetched(boolean z, boolean z2, Patch patch) {
        if (z2 && ProcessUtil.isMainProcess(this.context)) {
            reportDownload(patch, z);
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchApplied(boolean z, Patch patch) {
        if (ProcessUtil.isMainProcess(this.context)) {
            reportApply(patch, z);
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void exceptionNotify(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("key", "exception_normal");
        hashMap.put(Constants.SQLConstants.KEY_WHERE, str);
        hashMap.putAll(this.commonInfoMap);
        ThrowableReporter.report(th, hashMap);
    }
}
