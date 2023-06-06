package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog;
import com.sankuai.waimai.business.im.model.IMRedPacketData;
import com.sankuai.waimai.foundation.utils.ae;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public WMIMRedPacketDialog b;

    public final void a(Context context, com.sankuai.waimai.business.im.common.model.g gVar, IMRedPacketData iMRedPacketData) {
        Object[] objArr = {context, gVar, iMRedPacketData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87ddf1d48fe3d9b95a53d2ab4c523fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87ddf1d48fe3d9b95a53d2ab4c523fc");
        } else if (gVar == null || iMRedPacketData == null) {
            ae.a(context, context.getResources().getString(R.string.wm_im_red_packet_fail_response));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("poiURL", iMRedPacketData.poi_url);
            bundle.putString("poiName", iMRedPacketData.poi_name);
            bundle.putString("redPacketTitle", iMRedPacketData.title);
            bundle.putString("content", iMRedPacketData.content);
            bundle.putInt("amount", gVar.a);
            bundle.putString("userImgURL", gVar.i);
            bundle.putString("userName", gVar.h);
            bundle.putLong("takeTime", gVar.d);
            bundle.putLong("orderViewId", gVar.f);
            bundle.putString("walletURL", gVar.g);
            com.sankuai.waimai.foundation.router.a.a(context, context.getResources().getString(R.string.wm_im_red_packet_detail_scheme), bundle);
        }
    }
}
