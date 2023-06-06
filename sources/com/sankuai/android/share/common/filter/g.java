package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public g(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb6e433cb0f49d3ad61ebaf8cf9d307", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb6e433cb0f49d3ad61ebaf8cf9d307");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f852f8952033b12875d7ab0f9079f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f852f8952033b12875d7ab0f9079f8")).booleanValue();
        }
        if (appBean == null || appBean.getId() != 1024) {
            return false;
        }
        if (this.b == null) {
            return true;
        }
        return (!this.b.isLocalImage() || TextUtils.isEmpty(this.b.getImgUrl())) && TextUtils.isEmpty(this.b.getContent()) && TextUtils.isEmpty(this.b.getTitle());
    }
}
