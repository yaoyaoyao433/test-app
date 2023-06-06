package com.sankuai.titans.base.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PerformanceAnalysis {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Long mContainerCreateTime;
    private Long mLoadUrlTime;
    private TimeStampEvent mTimeEvent;

    public PerformanceAnalysis() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SingleTon {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final PerformanceAnalysis sInstance = new PerformanceAnalysis();
    }

    public static PerformanceAnalysis getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "367a32cebae66674dd3a6215f76f1540", RobustBitConfig.DEFAULT_VALUE) ? (PerformanceAnalysis) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "367a32cebae66674dd3a6215f76f1540") : SingleTon.sInstance;
    }

    public void onContainerCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6512ad5c36764f65c9360343b5b6b3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6512ad5c36764f65c9360343b5b6b3f1");
        } else {
            this.mContainerCreateTime = Long.valueOf(System.currentTimeMillis());
        }
    }

    public void onLoadUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5d7273db40fab162ddebeff55863b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5d7273db40fab162ddebeff55863b3");
            return;
        }
        this.mLoadUrlTime = Long.valueOf(System.currentTimeMillis());
        this.mTimeEvent = new TimeStampEvent(this.mContainerCreateTime, this.mLoadUrlTime);
        this.mContainerCreateTime = null;
    }

    public TimeStampEvent getTimeStamp() {
        return this.mTimeEvent;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class TimeStampEvent {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("loadUrl")
        @Expose
        private Long loadUrl;
        @SerializedName("webviewCreate")
        @Expose
        private Long webViewCreate;

        public TimeStampEvent(Long l, Long l2) {
            this.webViewCreate = l;
            this.loadUrl = l2;
        }
    }
}
