package com.sankuai.waimai.store.msi.apis;

import android.os.Build;
import android.os.Bundle;
import com.meituan.msi.api.extension.sgc.chat.IChat;
import com.meituan.msi.api.extension.sgc.chat.IsShowIMEntryParam;
import com.meituan.msi.api.extension.sgc.chat.IsShowIMEntryResponse;
import com.meituan.msi.api.extension.sgc.chat.OpenIMPageParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.manager.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIChatNew extends IChat {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.chat.IChat
    public final void a(MsiCustomContext msiCustomContext, OpenIMPageParam openIMPageParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, openIMPageParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a96bc470ae1ffcabff4c9d122f5f335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a96bc470ae1ffcabff4c9d122f5f335");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "openIMPage msiCustomContext.getActivity() is dead or null");
        } else {
            try {
                Bundle bundle = new Bundle();
                if (Build.BRAND.equals("HUAWEI")) {
                    bundle.putInt("sg_cancel_loading", 1);
                }
                com.sankuai.waimai.business.im.api.a.a().a(msiCustomContext.getActivity(), null, openIMPageParam.source, 0L, r.a(openIMPageParam.poiID, 0L), openIMPageParam.poiIDStr, r.a(openIMPageParam.spuID, 0L), 10, com.sankuai.waimai.store.msi.listener.a.a(msiCustomContext.getActivity()), false, bundle);
                iVar.a(EmptyResponse.INSTANCE);
            } catch (Exception e) {
                iVar.a(1000, e.getMessage());
            }
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.chat.IChat
    public final void a(MsiCustomContext msiCustomContext, IsShowIMEntryParam isShowIMEntryParam, i<IsShowIMEntryResponse> iVar) {
        Object[] objArr = {msiCustomContext, isShowIMEntryParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fd2d8de5ddd665fd007e45237169d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fd2d8de5ddd665fd007e45237169d2");
            return;
        }
        try {
            boolean b2 = b.a().b();
            IsShowIMEntryResponse isShowIMEntryResponse = new IsShowIMEntryResponse();
            isShowIMEntryResponse.isShow = b2;
            iVar.a(isShowIMEntryResponse);
        } catch (Throwable th) {
            iVar.a(1000, th.getMessage());
        }
    }
}
