package com.sankuai.waimai.platform.machpro.module;

import android.app.Dialog;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.widget.dialog.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMActivityIndicatorModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Dialog dialog;

    public WMActivityIndicatorModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c40e8364795ef8ff07a6f8df4ceb224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c40e8364795ef8ff07a6f8df4ceb224");
        }
    }

    @JSMethod(methodName = TitansBundle.PARAM_SHOW_LOADING)
    public void showLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab49fa880ae93759a64325946c0fa54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab49fa880ae93759a64325946c0fa54b");
            return;
        }
        a.b(this.dialog);
        if (getMachContext() != null && getMachContext().getContext() != null) {
            this.dialog = a.a(getMachContext().getContext());
        } else {
            this.dialog = a.a(b.a);
        }
    }

    @JSMethod(methodName = "hideLoading")
    public void hideLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b472520500d9b145496e45c09c8e0ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b472520500d9b145496e45c09c8e0ca6");
        } else {
            a.b(this.dialog);
        }
    }
}
