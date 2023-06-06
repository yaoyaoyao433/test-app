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
public final class e implements b {
    public static ChangeQuickRedirect a;
    public Context b;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f407004f31eb29ae6664f09f01897b0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f407004f31eb29ae6664f09f01897b0d");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.android.share.common.filter.b
    public final boolean a(AppBean appBean) {
        boolean booleanValue;
        Object[] objArr = {appBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16febf5d085914082b9cff3b556ebbd3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16febf5d085914082b9cff3b556ebbd3")).booleanValue();
        }
        if (appBean == null) {
            return true;
        }
        if (appBean.getId() == 512 || appBean.getId() == 2) {
            Context context = this.b;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.util.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "229ae51ec79dbbd82993d5f238b4b92c", RobustBitConfig.DEFAULT_VALUE)) {
                booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "229ae51ec79dbbd82993d5f238b4b92c")).booleanValue();
            } else {
                Object a2 = com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", null, "1"), LyingkitKernel_share.SHARE_UTILSERVICE_ISQQINSTALL, context);
                booleanValue = a2 instanceof Boolean ? ((Boolean) a2).booleanValue() : false;
            }
            return (booleanValue && com.sankuai.android.share.common.util.c.d(this.b)) ? false : true;
        }
        return false;
    }
}
