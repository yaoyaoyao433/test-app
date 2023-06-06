package com.sankuai.android.share.common.filter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public ShareBaseBean b;

    public a(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a1f13751e1ae50dc4339b349537d7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a1f13751e1ae50dc4339b349537d7f");
        } else {
            this.b = shareBaseBean;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec9f99f52ff342202e2972924f6131c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec9f99f52ff342202e2972924f6131c")).booleanValue();
        }
        if (appBean != null && appBean.getId() == 2048) {
            if (this.b == null) {
                return true;
            }
            if (TextUtils.isEmpty(this.b.getUrl()) && TextUtils.isEmpty(this.b.getTitle()) && TextUtils.isEmpty(this.b.getContent())) {
                return true;
            }
        }
        return false;
    }
}
