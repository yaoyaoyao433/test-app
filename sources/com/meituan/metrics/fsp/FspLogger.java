package com.meituan.metrics.fsp;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.kitefly.SLACounter;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspLogger {
    private static final String CATEGORY_FSP = "p4";
    private static final String TAG = "MetricsFspDetector";
    private static final String TAG_START = "FSP_Start";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void log(FspBean fspBean) {
        Object[] objArr = {fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "033291ea2433448364927179ca42ba70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "033291ea2433448364927179ca42ba70");
        } else if (Metrics.debug) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < fspBean.getList().size(); i++) {
                if (fspBean.getList().get(i).getViewList().size() > 0) {
                    jSONArray2.put(fspBean.getList().get(i).getViewList().size());
                    jSONArray3.put(fspBean.getList().get(i).getViewArea());
                    jSONArray.put(fspBean.getList().get(i).getSampleTime());
                }
            }
            PrintStream printStream = System.out;
            printStream.println("MetricsFspDetector activityName=" + fspBean.getActivityName());
            PrintStream printStream2 = System.out;
            printStream2.println("MetricsFspDetector isSuccess=" + (fspBean.isSuccess() ? 1 : 0));
            PrintStream printStream3 = System.out;
            printStream3.println("MetricsFspDetector isFirstLaunch=" + (fspBean.isFirstLaunch() ? 1 : 0));
            PrintStream printStream4 = System.out;
            printStream4.println("MetricsFspDetector finishReason=" + fspBean.getReason());
            PrintStream printStream5 = System.out;
            printStream5.println("MetricsFspDetector onCreateTime=" + fspBean.getOnCreateTime());
            PrintStream printStream6 = System.out;
            printStream6.println("MetricsFspDetector stableTime=" + fspBean.getStableTime());
            PrintStream printStream7 = System.out;
            printStream7.println("MetricsFspDetector fspTime=" + fspBean.getFspTime());
            PrintStream printStream8 = System.out;
            printStream8.println("MetricsFspDetector newFspTime=" + fspBean.getNewFspTime());
            PrintStream printStream9 = System.out;
            printStream9.println("MetricsFspDetector reachBottomTime=" + fspBean.getReachBottomTime());
            PrintStream printStream10 = System.out;
            printStream10.println("MetricsFspDetector calculateTime=" + fspBean.getCalculateTime());
            PrintStream printStream11 = System.out;
            printStream11.println("MetricsFspDetector onTouchDownTime=" + fspBean.getOnTouchDownTime());
            if (fspBean.getExecStartActivityTime() > 0) {
                PrintStream printStream12 = System.out;
                printStream12.println("MetricsFspDetector execStartTime=" + (fspBean.getOnCreateTime() - fspBean.getExecStartActivityTime()));
                PrintStream printStream13 = System.out;
                printStream13.println("MetricsFspDetector newActivityTime=" + (fspBean.getOnCreateTime() - fspBean.getNewActivityTime()));
            }
            if (fspBean.getExtraFspInfo() != null) {
                for (Map.Entry<String, Object> entry : fspBean.getExtraFspInfo().entrySet()) {
                    PrintStream printStream14 = System.out;
                    printStream14.println("MetricsFspDetector " + entry.getKey() + "=" + entry.getValue());
                }
            }
            PrintStream printStream15 = System.out;
            printStream15.println("MetricsFspDetector viewSize=" + fspBean.getViewSize());
            PrintStream printStream16 = System.out;
            printStream16.println("MetricsFspDetector sampleTimes=" + jSONArray.toString());
            PrintStream printStream17 = System.out;
            printStream17.println("MetricsFspDetector viewArray=" + jSONArray2.toString());
            PrintStream printStream18 = System.out;
            printStream18.println("MetricsFspDetector areaArray=" + jSONArray3.toString());
        }
    }

    public static void reportByBabel(FspBean fspBean) {
        Object[] objArr = {fspBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d484a551c09c0f29dab6b045ab207d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d484a551c09c0f29dab6b045ab207d00");
            return;
        }
        Environment environment = Metrics.getEnvironment();
        if (environment == null || environment.getToken() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (fspBean.isSuccess()) {
            hashMap.put("FSPException", 0);
        } else if (fspBean.getReason() == 1 && fspBean.getCalculateTime() < 500) {
            hashMap.put("FSPException", 2);
        } else {
            hashMap.put("FSPException", 3);
        }
        hashMap.put("triggerType", Integer.valueOf(fspBean.getReason() == 0 ? 0 : 1));
        hashMap.put("viewSize", Integer.valueOf(fspBean.getViewSize()));
        hashMap.put("schemeUrl", fspBean.getActivityName());
        hashMap.put("isFirstLaunch", Boolean.valueOf(fspBean.isFirstLaunch()));
        hashMap.put("onCreateTime", Long.valueOf(fspBean.getOnCreateTime()));
        hashMap.put("stableTime", Long.valueOf(fspBean.getStableTime()));
        if (fspBean.getExecStartActivityTime() > 0) {
            hashMap.put("execStartActivityTime", Long.valueOf(fspBean.getOnCreateTime() - fspBean.getExecStartActivityTime()));
            hashMap.put("newActivityTime", Long.valueOf(fspBean.getOnCreateTime() - fspBean.getNewActivityTime()));
        }
        hashMap.put("calculateTime", Long.valueOf(fspBean.getCalculateTime()));
        hashMap.put("newFspTime", Long.valueOf(fspBean.getNewFspTime()));
        hashMap.put("reachBottomTime", Long.valueOf(fspBean.getReachBottomTime()));
        hashMap.put("finishReason", Integer.valueOf(fspBean.getReason()));
        if (fspBean.getExtraFspInfo() != null) {
            hashMap.putAll(fspBean.getExtraFspInfo());
        }
        hashMap.put("metricsSdkVersion", environment.sdkVersion);
        hashMap.put(Constants.Environment.KEY_CH, environment.getCh());
        hashMap.put("lx_sid", environment.getSession());
        SeqIdFactory.getInstance(Metrics.getInstance().getContext()).setSequenceId(com.meituan.metrics.common.Constants.FSP, hashMap);
        SLACounter.getInstance().incrementMetricsCount(1);
        DeviceUtil.addDeviceInfo(hashMap, null, Metrics.getInstance().getContext());
        Log.Builder optional = new Log.Builder("").reportChannel("p4").token(environment.getToken()).lv4LocalStatus(true).newLogStatus(false).optional(hashMap);
        Babel.log(optional.tag(com.meituan.metrics.common.Constants.FSP).value(fspBean.getFspTime()).build());
        if (fspBean.isDetectReachBottom()) {
            Babel.log(optional.tag(com.meituan.metrics.common.Constants.REACH_BOTTOM_FSP).value(fspBean.getNewFspTime()).build());
        }
    }

    public static void reportOnCreateByBabel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "996b58f802746dff072dd07140c801ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "996b58f802746dff072dd07140c801ca");
            return;
        }
        Environment environment = Metrics.getEnvironment();
        if (environment == null || environment.getToken() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("schemeUrl", str);
        hashMap.put("deviceLevel", String.valueOf(DeviceUtil.getDeviceLevel(Metrics.getInstance().getContext())));
        Babel.log(new Log.Builder("").tag(TAG_START).reportChannel("p4").optional(hashMap).token(environment.getToken()).lv4LocalStatus(true).newLogStatus(false).build());
    }
}
