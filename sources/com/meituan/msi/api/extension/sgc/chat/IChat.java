package com.meituan.msi.api.extension.sgc.chat;

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

    public abstract void a(MsiCustomContext msiCustomContext, IsShowIMEntryParam isShowIMEntryParam, i<IsShowIMEntryResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, OpenIMPageParam openIMPageParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "openIMPage", request = OpenIMPageParam.class, scope = "sgc")
    public void msiOpenIMPage(OpenIMPageParam openIMPageParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {openIMPageParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93364af143912329ea633c06ee682cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93364af143912329ea633c06ee682cd");
        } else {
            a(msiCustomContext, openIMPageParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.chat.IChat.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b817643d092288e3e961257760117485", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b817643d092288e3e961257760117485");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58a6496937ae3d873668aa1b1265bcd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58a6496937ae3d873668aa1b1265bcd1");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "isShowIMEntry", request = IsShowIMEntryParam.class, response = IsShowIMEntryResponse.class, scope = "sgc")
    public void msiIsShowIMEntry(IsShowIMEntryParam isShowIMEntryParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {isShowIMEntryParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c27ea89a3221ee674aee34d2c26ae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c27ea89a3221ee674aee34d2c26ae7");
        } else {
            a(msiCustomContext, isShowIMEntryParam, new i<IsShowIMEntryResponse>() { // from class: com.meituan.msi.api.extension.sgc.chat.IChat.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(IsShowIMEntryResponse isShowIMEntryResponse) {
                    IsShowIMEntryResponse isShowIMEntryResponse2 = isShowIMEntryResponse;
                    Object[] objArr2 = {isShowIMEntryResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47bf0b2ad95ba7f73f7478a7d021de4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47bf0b2ad95ba7f73f7478a7d021de4b");
                    } else {
                        msiCustomContext.onSuccess(isShowIMEntryResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4cf8cfcedce8a82f05c17192ae423ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4cf8cfcedce8a82f05c17192ae423ad");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
