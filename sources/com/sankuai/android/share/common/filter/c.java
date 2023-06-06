package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public c(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5c43f11c9571527ed74cf272a3bfc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5c43f11c9571527ed74cf272a3bfc7");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295381fff4559c694923edd4d5e5deee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295381fff4559c694923edd4d5e5deee")).booleanValue() : appBean != null && appBean.getId() == 4096 && (this.b == null || TextUtils.isEmpty(this.b.getPasswordUrl()));
    }
}
