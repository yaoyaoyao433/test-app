package com.meituan.msc.modules.api.msi.api;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class ShareMenuApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    static class HideShareMenuParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String eventFrom = ShieldMonitorKey.TAG_BUSINESS;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    static class ShowShareMenuParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String eventFrom = ShieldMonitorKey.TAG_BUSINESS;
    }

    @MsiApiMethod(name = "hideShareMenu", onUiThread = true, request = HideShareMenuParams.class)
    public void hideShareMenu(HideShareMenuParams hideShareMenuParams, MsiContext msiContext) {
        Object[] objArr = {hideShareMenuParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f0ae5049beb00945603ba4bcc3fb93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f0ae5049beb00945603ba4bcc3fb93");
            return;
        }
        String str = hideShareMenuParams.eventFrom;
        if (!"framework".equals(str) || this.c.r.m()) {
            int d = d(msiContext);
            e b = this.c.b().b(d);
            if (b != null) {
                b.k().b(ShieldMonitorKey.TAG_BUSINESS.equals(str));
                msiContext.onSuccess(null);
                return;
            }
            msiContext.onError("can't find page by pageId:" + d);
            return;
        }
        msiContext.onError("invocation from framework is blocked, share button is disabled in appconfig");
    }

    @MsiApiMethod(name = "showShareMenu", onUiThread = true, request = ShowShareMenuParams.class)
    public void showShareMenu(ShowShareMenuParams showShareMenuParams, MsiContext msiContext) {
        Object[] objArr = {showShareMenuParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c18b9c56d75e3592b0b3061d990944c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c18b9c56d75e3592b0b3061d990944c");
            return;
        }
        String str = showShareMenuParams.eventFrom;
        if (!"framework".equals(str) || this.c.r.m()) {
            int d = d(msiContext);
            e b = this.c.b().b(d);
            if (b != null) {
                b.k().a(ShieldMonitorKey.TAG_BUSINESS.equals(str));
                msiContext.onSuccess(null);
                return;
            }
            msiContext.onError("can't find page by pageId:" + d);
            return;
        }
        msiContext.onError("invocation from framework is blocked, share button is disabled in appconfig");
    }
}
