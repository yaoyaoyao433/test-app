package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public d(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0a3c5667988fbd0a706cba26dc6902", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0a3c5667988fbd0a706cba26dc6902");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8397364561ea37ee5341a0b40a375c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8397364561ea37ee5341a0b40a375c")).booleanValue();
        }
        if (appBean != null && appBean.getId() == 512) {
            if (this.b == null) {
                return true;
            }
            if (TextUtils.isEmpty(this.b.getUrl()) && !this.b.isLocalImage() && TextUtils.isEmpty(this.b.getContent())) {
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
