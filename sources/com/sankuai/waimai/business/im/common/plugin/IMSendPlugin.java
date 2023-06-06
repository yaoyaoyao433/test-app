package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.SendPlugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMSendPlugin extends SendPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.SendPlugin
    public int getSendBtnBackgroundResource() {
        return R.drawable.wm_im_bg_send_btn;
    }

    public IMSendPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b250aa5be79ecd738469472f4b6733", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b250aa5be79ecd738469472f4b6733");
        }
    }

    public IMSendPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1986e00ec2f2513331835e6c063c033", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1986e00ec2f2513331835e6c063c033");
        }
    }

    public IMSendPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c3871c2cf4d500cc1a459c1258c4a4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c3871c2cf4d500cc1a459c1258c4a4a");
        }
    }
}
