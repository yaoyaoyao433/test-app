package com.sankuai.waimai.store.msi.apis;

import android.os.Build;
import android.os.Bundle;
import com.meituan.msi.api.extension.sgc.im.IChat;
import com.meituan.msi.api.extension.sgc.im.PoiChatPageParam;
import com.meituan.msi.api.extension.sgc.im.ShowImEntranceParam;
import com.meituan.msi.api.extension.sgc.im.ShowImEntranceResponse;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIChat extends IChat {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.im.IChat
    public final void a(MsiCustomContext msiCustomContext, ShowImEntranceParam showImEntranceParam, i<ShowImEntranceResponse> iVar) {
        Object[] objArr = {msiCustomContext, showImEntranceParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1a81a397bdb452476cbcde071cd485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1a81a397bdb452476cbcde071cd485");
            return;
        }
        try {
            boolean b2 = b.a().b();
            ShowImEntranceResponse showImEntranceResponse = new ShowImEntranceResponse();
            showImEntranceResponse.result = b2;
            iVar.a(showImEntranceResponse);
        } catch (Throwable th) {
            iVar.a(1000, th.getMessage());
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.im.IChat
    public final void a(MsiCustomContext msiCustomContext, PoiChatPageParam poiChatPageParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, poiChatPageParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa7c4b07467f60f27a63a8b46c96a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa7c4b07467f60f27a63a8b46c96a76");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "openPoiChatPage msiCustomContext.getActivity() is dead or null");
        } else {
            try {
                Bundle bundle = new Bundle();
                if (Build.BRAND.equals("HUAWEI")) {
                    bundle.putInt("sg_cancel_loading", 1);
                }
                com.sankuai.waimai.business.im.api.a.a().a(msiCustomContext.getActivity(), (SessionId) null, poiChatPageParam.source, 0L, r.a(poiChatPageParam.poiID, 0L), r.a(poiChatPageParam.spuID, 0L), 10, com.sankuai.waimai.store.msi.listener.a.a(msiCustomContext.getActivity()), false, bundle);
                iVar.a(EmptyResponse.INSTANCE);
            } catch (Exception e) {
                iVar.a(1000, e.getMessage());
            }
        }
    }
}
