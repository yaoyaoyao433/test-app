package com.meituan.metrics.traffic;

import android.content.Context;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.traffic.report.ReportDetailManager;
import com.meituan.metrics.util.ScheduleHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficRecordProcessHandler extends ScheduleHandler {
    public static final int NEW_TRAFFIC_RECORD_JAVA = 1000;
    public static final int NEW_TRAFFIC_RECORD_NATIVE = 1001;
    public static final int REPORT_RECORD_DETAIL = 1002;
    public static final int REQUEST_URL = 1003;
    private static final String TAG = "TrafficProcessor";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TrafficRecordProcessThread {
    }

    public TrafficRecordProcessHandler(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Object[] objArr = {scheduledExecutorService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d20a3ffe966f874c4a16781a0325b42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d20a3ffe966f874c4a16781a0325b42");
        }
    }

    @Override // com.meituan.metrics.util.ScheduleHandler
    public void handleMessage(ScheduleHandler.Task task) {
        TrafficRecord trafficRecord;
        Object[] objArr = {task};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92a34026919cba66567effae8ce1142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92a34026919cba66567effae8ce1142");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        if (context == null || (trafficRecord = (TrafficRecord) task.obj) == null) {
            return;
        }
        switch (task.what) {
            case 1000:
            case 1001:
                TrafficInterceptedManager.getInstance().handleNewRecord(context, trafficRecord, task.what);
                return;
            case 1002:
                if (trafficRecord.detail != null) {
                    ReportDetailManager.getInstance().send(trafficRecord);
                    return;
                }
                return;
            case 1003:
                TrafficInterceptedManager.getInstance().detectUrlException(trafficRecord);
                return;
            default:
                return;
        }
    }
}
