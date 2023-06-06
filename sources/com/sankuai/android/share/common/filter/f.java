package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public f(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7819b6e0294153df909b7b39a353eb26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7819b6e0294153df909b7b39a353eb26");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30478e7479b9476b134fba0ce5fa4538", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30478e7479b9476b134fba0ce5fa4538")).booleanValue();
        }
        if (appBean != null && appBean.getId() == 2) {
            if (this.b == null) {
                return true;
            }
            if (TextUtils.isEmpty(this.b.getUrl()) && !this.b.isLocalImage()) {
                return true;
            }
            if (!TextUtils.isEmpty(this.b.getUrl()) && TextUtils.isEmpty(this.b.getTitle()) && !this.b.isLocalImage()) {
                return true;
            }
            if (this.b.isLocalImage() && TextUtils.isEmpty(this.b.getImgUrl())) {
                return true;
            }
        }
        return false;
    }
}
