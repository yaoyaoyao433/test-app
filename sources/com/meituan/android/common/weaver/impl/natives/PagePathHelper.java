package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.weaver.impl.IMRNFinder;
import com.meituan.android.common.weaver.impl.Inner;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.android.common.weaver.impl.utils.FFPTopPageImpl;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN;
import com.meituan.android.common.weaver.interfaces.ffp.IgnoreMRN;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class PagePathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    protected final Activity activity;
    protected String pagePath;
    protected double sample;

    public boolean fullPage() {
        return true;
    }

    public abstract boolean hasSpecialPagePath();

    public PagePathHelper(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50752e2e21d8f3bc874b0a6cd3258060", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50752e2e21d8f3bc874b0a6cd3258060");
            return;
        }
        this.sample = 1.0d;
        this.activity = activity;
    }

    public String getActivityClassName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ab00af0b0bc88c3c2152d95c26daa6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ab00af0b0bc88c3c2152d95c26daa6b") : this.activity.getClass().getName();
    }

    public double getSample() {
        return this.sample;
    }

    public void withSample(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "700fed7f0693a20858c8dd3c48de613c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "700fed7f0693a20858c8dd3c48de613c");
        } else {
            this.sample = d;
        }
    }

    @NonNull
    public Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public View getRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ad63eb7c06ca85e9b78d8de3fef52f1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ad63eb7c06ca85e9b78d8de3fef52f1") : this.activity.findViewById(16908290);
    }

    public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f987424af037a40619440b4f8f324454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f987424af037a40619440b4f8f324454");
            return;
        }
        if (this.sample < 1.0d) {
            nativeFFPEvent.with("$sr", Double.valueOf(this.sample));
        }
        nativeFFPEvent.with("pagePath", getPagePath());
        nativeFFPEvent.with("nPage", getActivityClassName());
    }

    public String getConfigPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23e0c96d7d9ff32cadbb1b5612de432f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23e0c96d7d9ff32cadbb1b5612de432f") : getPagePath();
    }

    @CallSuper
    public void fillBlankPagePathInfo(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "271885e539f819f8d75a2f7acd8a6e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "271885e539f819f8d75a2f7acd8a6e91");
            return;
        }
        if (this.sample < 1.0d) {
            map.put("$sr", Double.valueOf(this.sample));
        }
        map.put("nPage", getActivityClassName());
        map.put("pagePath", getPagePath());
    }

    public void fillFFPTags(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a4662e05820a6970a61d4464282c97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a4662e05820a6970a61d4464282c97d");
        } else if (this.activity instanceof FFPTags) {
            try {
                Map<String, Object> ffpTags = ((FFPTags) this.activity).ffpTags();
                for (String str : ffpTags.keySet()) {
                    nativeFFPEvent.with(str, ffpTags.get(str));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Nullable
    public String getPagePath() {
        return this.pagePath;
    }

    public List<? extends AbstractViewMatcher> getExternalViewMatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ea7d403b13aa85afad6e6fc80d83d8", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ea7d403b13aa85afad6e6fc80d83d8") : Collections.emptyList();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class NativePathHelper extends PagePathHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static Class<?> sMRNClazz;
        private boolean isMRN;
        private final AbstractViewMatcher mMRNMatcher;
        private final Uri pageUrl;

        public static String constructMRNPagePath(@NonNull Uri uri) {
            Object[] objArr = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7413ff2c945a6e06514c80dc3e289128", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7413ff2c945a6e06514c80dc3e289128");
            }
            return "rn|" + uri.getQueryParameter("mrn_biz") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + uri.getQueryParameter("mrn_entry") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + uri.getQueryParameter("mrn_component");
        }

        public static void appendMRNInfo(@NonNull NativeFFPEvent nativeFFPEvent, @NonNull Uri uri) {
            Object[] objArr = {nativeFFPEvent, uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62bae000185249e3cec8c6f9d0acdcb7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62bae000185249e3cec8c6f9d0acdcb7");
                return;
            }
            String[] strArr = {"mrn_biz", "mrn_entry", "mrn_component"};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                nativeFFPEvent.with(str, uri.getQueryParameter(str));
            }
        }

        public NativePathHelper(@NonNull Activity activity) {
            super(activity);
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4380360cf4e0fbb0e1a7cf800c874f3a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4380360cf4e0fbb0e1a7cf800c874f3a");
                return;
            }
            this.isMRN = false;
            Intent intent = activity.getIntent();
            AbstractViewMatcher abstractViewMatcher = null;
            if (intent != null) {
                this.pageUrl = intent.getData();
                if (this.pageUrl != null) {
                    checkIsMRN();
                    if (this.isMRN) {
                        this.pagePath = constructMRNPagePath(this.pageUrl);
                        FFPTopPageImpl.pagePath = this.pagePath;
                    } else {
                        this.pagePath = this.pageUrl.getScheme() + "://" + this.pageUrl.getHost() + this.pageUrl.getPath();
                    }
                } else {
                    this.pagePath = getActivityClassName();
                }
            } else {
                this.pagePath = getActivityClassName();
                this.pageUrl = null;
            }
            if (FFPTopPageImpl.pagePath == null) {
                FFPTopPageImpl.pagePath = getActivityClassName();
            }
            if (!(activity instanceof IgnoreMRN) && !"com.sankuai.waimai.store.goods.list.SCSuperMarketActivity".equals(getActivityClassName()) && !this.isMRN) {
                abstractViewMatcher = Inner.shell.newMRNRootFinder();
            }
            this.mMRNMatcher = abstractViewMatcher;
        }

        private void checkIsMRN() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241ca1f4dfe73e645b94cf5c43312f70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241ca1f4dfe73e645b94cf5c43312f70");
            } else if (this.activity instanceof IFFPPageMRN) {
                this.isMRN = true;
            } else if (sMRNClazz != null && sMRNClazz.isInstance(this.activity)) {
                this.isMRN = true;
            } else if (getActivityClassName().contains("hotel")) {
                if (this.pageUrl.getQueryParameter("mrn_biz") != null && this.pageUrl.getQueryParameter("mrn_entry") != null) {
                    z = true;
                }
                this.isMRN = z;
            }
        }

        @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
        public void fillBlankPagePathInfo(@NonNull Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8270045bee6aacece6e50f137bb6a3a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8270045bee6aacece6e50f137bb6a3a3");
                return;
            }
            super.fillBlankPagePathInfo(map);
            if (this.isMRN && (this.activity instanceof IFFPPageMRN)) {
                this.isMRN = ((IFFPPageMRN) this.activity).isMRNPage();
            }
            map.put("tType", this.isMRN ? "mrn" : "native");
            map.put("source", "native");
        }

        @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
        public List<? extends AbstractViewMatcher> getExternalViewMatcher() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febcbdf6b50bfceffb5fd0dbe0f3cf81", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febcbdf6b50bfceffb5fd0dbe0f3cf81");
            }
            if (this.mMRNMatcher != null) {
                return Collections.singletonList(this.mMRNMatcher);
            }
            return Collections.emptyList();
        }

        public static void init() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4864e64ed1082dca44414c42a6bbbf14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4864e64ed1082dca44414c42a6bbbf14");
                return;
            }
            try {
                sMRNClazz = Class.forName("com.meituan.android.mrn.container.MRNBaseActivity");
            } catch (Throwable unused) {
            }
        }

        @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
        public boolean hasSpecialPagePath() {
            return this.isMRN;
        }

        @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
        public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
            String[] mRNInfo;
            Object[] objArr = {nativeFFPEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a758499df069b9a47bd0c23a6a6578f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a758499df069b9a47bd0c23a6a6578f");
                return;
            }
            super.fillPagePathInfo(nativeFFPEvent);
            if (this.isMRN && (this.activity instanceof IFFPPageMRN)) {
                this.isMRN = ((IFFPPageMRN) this.activity).isMRNPage();
                if (!this.isMRN && this.pageUrl != null) {
                    this.pagePath = this.pageUrl.getScheme() + "://" + this.pageUrl.getHost() + this.pageUrl.getPath();
                }
            }
            if (this.isMRN) {
                nativeFFPEvent.with("tType", "mrn");
                if ((this.activity instanceof IFFPPageMRN) && !TextUtils.isEmpty(((IFFPPageMRN) this.activity).mrnBiz()) && !TextUtils.isEmpty(((IFFPPageMRN) this.activity).mrnEntry()) && !TextUtils.isEmpty(((IFFPPageMRN) this.activity).mrnComponent())) {
                    IFFPPageMRN iFFPPageMRN = (IFFPPageMRN) this.activity;
                    nativeFFPEvent.with("mrn_biz", iFFPPageMRN.mrnBiz());
                    nativeFFPEvent.with("mrn_entry", iFFPPageMRN.mrnEntry());
                    nativeFFPEvent.with("mrn_component", iFFPPageMRN.mrnComponent());
                    this.pagePath = "rn|" + iFFPPageMRN.mrnBiz() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + iFFPPageMRN.mrnEntry() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + iFFPPageMRN.mrnComponent();
                } else if (this.pageUrl != null) {
                    appendMRNInfo(nativeFFPEvent, this.pageUrl);
                }
            } else if ((this.mMRNMatcher instanceof IMRNFinder) && (mRNInfo = ((IMRNFinder) this.mMRNMatcher).getMRNInfo()) != null) {
                nativeFFPEvent.with("tType", "mrn");
                nativeFFPEvent.with("mrn_biz", mRNInfo[0]);
                nativeFFPEvent.with("mrn_entry", mRNInfo[1]);
                nativeFFPEvent.with("mrn_component", mRNInfo[2]);
            }
            if (this.pageUrl != null) {
                nativeFFPEvent.withPageUrl(this.pageUrl.toString());
            }
            nativeFFPEvent.withPagePath(this.pagePath);
        }
    }
}
