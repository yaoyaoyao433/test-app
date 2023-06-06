package com.sankuai.android.share.common.filter;

import android.content.Context;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements b {
    public static ChangeQuickRedirect a;
    public Context b;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0040d1967781c521882e082415d690d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0040d1967781c521882e082415d690d9");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        boolean booleanValue;
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6233464a69e3bb173f5ebf5b3d8ce761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6233464a69e3bb173f5ebf5b3d8ce761")).booleanValue();
        }
        if (appBean == null) {
            return true;
        }
        if (appBean.getId() == 128 || appBean.getId() == 256) {
            Context context = this.b;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.util.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bbc572a632fe75f6960db9d086539c9d", RobustBitConfig.DEFAULT_VALUE)) {
                booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bbc572a632fe75f6960db9d086539c9d")).booleanValue();
            } else {
                Object a2 = com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", null, "1"), LyingkitKernel_share.SHARE_UTILSERVICE_ISWEIXININSTALL, context);
                booleanValue = a2 instanceof Boolean ? ((Boolean) a2).booleanValue() : false;
            }
            return (booleanValue && com.sankuai.android.share.common.util.c.c(this.b)) ? false : true;
        }
        return false;
    }
}
