package com.meituan.android.common.weaver.impl.listener;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LReport implements WithDispatch, FFPReportListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ExecutorService sReportService = c.a("lReport");
    private static final ErrorReporter sReport = new ErrorReporter("report", 1);

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener
    public void onFFPReport(@NonNull final FFPReportListener.IReportEvent iReportEvent) {
        Object[] objArr = {iReportEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86fea5fc9282f413d3a07697279c0406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86fea5fc9282f413d3a07697279c0406");
        } else {
            sReportService.execute(new Runnable() { // from class: com.meituan.android.common.weaver.impl.listener.LReport.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a248e039de1453e69cb266ab3d9c092c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a248e039de1453e69cb266ab3d9c092c");
                        return;
                    }
                    try {
                        LReportDispatch.instance.dispatch(iReportEvent);
                    } catch (Throwable th) {
                        LReport.sReport.report(th);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.weaver.impl.listener.WithDispatch
    public boolean withDispatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3716a3afd5ebdd68b9b30af572d5911", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3716a3afd5ebdd68b9b30af572d5911")).booleanValue() : LReportDispatch.instance.withDispatch();
    }

    public static void report(long j, long j2, @NonNull Map<String, Object> map, long j3) {
        Object[] objArr = {new Long(j), new Long(j2), map, new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e487f625fb79dd811035d24a5fc1f927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e487f625fb79dd811035d24a5fc1f927");
            return;
        }
        LReport lReport = new LReport();
        if (lReport.withDispatch()) {
            lReport.onFFPReport(new ReportEvent(j, j2, map, j3));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LReportDispatch extends ListenerDispatch<FFPReportListener, FFPReportListener.IReportEvent> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final LReportDispatch instance = new LReportDispatch();

        public LReportDispatch() {
            super(FFPReportListener.class);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "595fa7da12123c03a9c84a5659ca41a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "595fa7da12123c03a9c84a5659ca41a9");
            }
        }

        @Override // com.meituan.android.common.weaver.impl.listener.ListenerDispatch
        public void action(FFPReportListener fFPReportListener, FFPReportListener.IReportEvent iReportEvent) {
            Object[] objArr = {fFPReportListener, iReportEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a554ee52819cdbd0b954119774090bb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a554ee52819cdbd0b954119774090bb6");
                return;
            }
            try {
                fFPReportListener.onFFPReport(iReportEvent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
