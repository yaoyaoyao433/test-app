package com.meituan.android.common.weaver.impl.listener;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ReportEvent implements FFPReportListener.IReportEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long endTimeInMs;
    private final String finishResult;
    private Map<String, Object> mExtra;
    private final String nPage;
    private final String pageUrl;
    private final long startTimeInMs;
    private final String tType;
    private final long value;

    public ReportEvent(long j, long j2, Map<String, Object> map, long j3) {
        Object[] objArr = {new Long(j), new Long(j2), map, new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7103aa89f18942bac31d44b04f6019c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7103aa89f18942bac31d44b04f6019c6");
            return;
        }
        this.startTimeInMs = j;
        this.endTimeInMs = j2;
        this.finishResult = (String) map.get("fType");
        this.tType = (String) map.get("tType");
        this.nPage = (String) map.get("nPage");
        this.pageUrl = (String) map.get("pageUrl");
        this.value = j3;
        this.mExtra = Collections.unmodifiableMap(map);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    public long startTimeInMs() {
        return this.startTimeInMs;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    public long endTimeInMs() {
        return this.endTimeInMs;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    @NonNull
    public String finishResult() {
        return this.finishResult;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    @NonNull
    public String pageType() {
        return this.tType;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    @NonNull
    public String activityClass() {
        return this.nPage;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    @Nullable
    public String pageUrl() {
        return this.pageUrl;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    public long ffpInMs() {
        return this.value;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener.IReportEvent
    public Map<String, Object> extraMap() {
        return this.mExtra;
    }
}
