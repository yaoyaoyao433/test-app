package com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.SendPlugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTSendPlugin extends SendPlugin {
    public static ChangeQuickRedirect a;

    public PTSendPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5884b1002c13a6614f43a3b6105212a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5884b1002c13a6614f43a3b6105212a5");
        }
    }

    public PTSendPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082549e8d3b9d7d0d72e5ca2ff0435cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082549e8d3b9d7d0d72e5ca2ff0435cd");
        }
    }

    public PTSendPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d715fd2d0a1976662b65ef34d5e3fce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d715fd2d0a1976662b65ef34d5e3fce");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e67b06db225dd617c8168744a3806a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e67b06db225dd617c8168744a3806a");
            return;
        }
        super.ae_();
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7dc9c2e65edcf6ffbda2af047f29acb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7dc9c2e65edcf6ffbda2af047f29acb9");
        } else {
            Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_qxsukwsp_mc", f.a(context), "c_group_hjkzttqg");
        }
    }
}
