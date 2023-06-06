package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.capacity.network.interceptor.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "BusinessInterceptorInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7531fd28e437f18c65893320fd280f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7531fd28e437f18c65893320fd280f5b");
        } else {
            com.sankuai.waimai.platform.capacity.network.interceptor.a.a().b = new a.InterfaceC1041a() { // from class: com.sankuai.waimai.launcher.init.secondary.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.interceptor.a.InterfaceC1041a
                public final boolean a(Context context, aj ajVar, BaseResponse baseResponse) {
                    Object[] objArr2 = {context, ajVar, baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba49a85ad6400ca70275f18f9c0c7eb6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba49a85ad6400ca70275f18f9c0c7eb6")).booleanValue();
                    }
                    if (baseResponse == null) {
                        return false;
                    }
                    com.sankuai.waimai.launcher.ui.interceptortask.b bVar = null;
                    try {
                        switch (baseResponse.code) {
                            case TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE /* 410 */:
                            case TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON /* 411 */:
                                bVar = new com.sankuai.waimai.launcher.ui.interceptortask.b(context, ajVar, baseResponse);
                                break;
                        }
                        if (bVar != null) {
                            bVar.a();
                            return true;
                        }
                        return false;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            };
        }
    }
}
