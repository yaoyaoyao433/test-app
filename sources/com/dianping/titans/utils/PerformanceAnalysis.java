package com.dianping.titans.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.UriKit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PerformanceAnalysis {
    private static final String FRAME_FULL_PAGE_LOAD = "FullPage.Load";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Long mActivityCreateTime;
    private String mCurrentUrl;
    private long mKnbCreateTime;
    private Long mLoadUrlTime;
    private TimeStampParam mParam;
    private final com.sankuai.titans.EventReporter mReporter;

    public PerformanceAnalysis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "587fe72ffbd06f79771ab19b007c19ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "587fe72ffbd06f79771ab19b007c19ea");
        } else {
            this.mReporter = com.sankuai.titans.EventReporter.getInstance();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SingleHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final PerformanceAnalysis sInstance = new PerformanceAnalysis();
    }

    public static PerformanceAnalysis getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab9bf823e3c1841d7b2faa789bda04eb", RobustBitConfig.DEFAULT_VALUE) ? (PerformanceAnalysis) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab9bf823e3c1841d7b2faa789bda04eb") : SingleHolder.sInstance;
    }

    public void onKnbCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94573f4b5a3bb31b183b331aca037866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94573f4b5a3bb31b183b331aca037866");
        } else {
            this.mKnbCreateTime = System.currentTimeMillis();
        }
    }

    public void onActivityCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bab02ff443506a201ab63747dbee007b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bab02ff443506a201ab63747dbee007b");
        } else {
            this.mActivityCreateTime = Long.valueOf(System.currentTimeMillis());
        }
    }

    public void onLoadUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f95293309776df03f26e2ba7f31745b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f95293309776df03f26e2ba7f31745b2");
            return;
        }
        this.mLoadUrlTime = Long.valueOf(System.currentTimeMillis());
        this.mParam = new TimeStampParam(this.mActivityCreateTime, this.mLoadUrlTime);
        this.mActivityCreateTime = null;
    }

    public TimeStampParam getTimeStamp() {
        return this.mParam;
    }

    public void onKnbUrlReady(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95f327094d69d20f7d8d9ae706a3aae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95f327094d69d20f7d8d9ae706a3aae7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mCurrentUrl = UriKit.pureBasicURLString(Uri.parse(str));
        }
    }

    public void onKnbPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65762a02c0a4826c710a5cde98598a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65762a02c0a4826c710a5cde98598a63");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String pureBasicURLString = UriKit.pureBasicURLString(Uri.parse(str));
            if (TextUtils.isEmpty(pureBasicURLString) || !pureBasicURLString.equals(this.mCurrentUrl)) {
                return;
            }
            this.mReporter.reportTiming(FRAME_FULL_PAGE_LOAD, Uri.parse(str), System.currentTimeMillis() - this.mKnbCreateTime);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TimeStampParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("loadUrl")
        @Expose
        private Long loadUrl;
        @SerializedName("webviewCreate")
        @Expose
        private Long webViewCreate;

        public TimeStampParam(Long l, Long l2) {
            this.webViewCreate = l;
            this.loadUrl = l2;
        }
    }
}
