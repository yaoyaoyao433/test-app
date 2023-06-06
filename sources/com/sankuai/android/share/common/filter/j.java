package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public j(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ee20f129b10e882c4620fdc020125a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ee20f129b10e882c4620fdc020125a");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4aef89dda6e19aec3b295cae7245b3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4aef89dda6e19aec3b295cae7245b3e")).booleanValue();
        }
        if (appBean != null && appBean.getId() == 128) {
            if (this.b == null) {
                return true;
            }
            if (TextUtils.isEmpty(this.b.getUrl()) && TextUtils.isEmpty(this.b.getImgUrl()) && TextUtils.isEmpty(this.b.getContent())) {
                return true;
            }
            if (!TextUtils.isEmpty(this.b.getUrl()) && TextUtils.isEmpty(this.b.getTitle()) && TextUtils.isEmpty(this.b.getContent()) && !this.b.isLocalImage()) {
                return true;
            }
            if (this.b.isLocalImage() && TextUtils.isEmpty(this.b.getImgUrl())) {
                return true;
            }
        }
        return false;
    }
}
