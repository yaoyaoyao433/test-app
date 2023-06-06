package com.meituan.msi.api.extension.sgc.im;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IChat implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, PoiChatPageParam poiChatPageParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, ShowImEntranceParam showImEntranceParam, i<ShowImEntranceResponse> iVar);

    @MsiApiMethod(name = "isShowImEntrance", request = ShowImEntranceParam.class, response = ShowImEntranceResponse.class, scope = "sgc")
    public void msiIsShowImEntrance(ShowImEntranceParam showImEntranceParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {showImEntranceParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb2257fba31b907e0bb3b0bbbd721c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb2257fba31b907e0bb3b0bbbd721c3");
        } else {
            a(msiCustomContext, showImEntranceParam, new i<ShowImEntranceResponse>() { // from class: com.meituan.msi.api.extension.sgc.im.IChat.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(ShowImEntranceResponse showImEntranceResponse) {
                    ShowImEntranceResponse showImEntranceResponse2 = showImEntranceResponse;
                    Object[] objArr2 = {showImEntranceResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d654c3c1cc23dc81e72e126937d30b76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d654c3c1cc23dc81e72e126937d30b76");
                    } else {
                        msiCustomContext.onSuccess(showImEntranceResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f26edbb9a0ef49a45383fdd01590687", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f26edbb9a0ef49a45383fdd01590687");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "openPoiChatPage", request = PoiChatPageParam.class, scope = "sgc")
    public void msiOpenPoiChatPage(PoiChatPageParam poiChatPageParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {poiChatPageParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60951cc6fff1ea2803fa20dcb6b38126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60951cc6fff1ea2803fa20dcb6b38126");
        } else {
            a(msiCustomContext, poiChatPageParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.im.IChat.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76856829ab3a0c14066c2c81960f2906", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76856829ab3a0c14066c2c81960f2906");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be02025977c4f6bfdf55bf668833b077", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be02025977c4f6bfdf55bf668833b077");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
