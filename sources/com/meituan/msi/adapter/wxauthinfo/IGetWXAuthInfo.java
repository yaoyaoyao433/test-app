package com.meituan.msi.adapter.wxauthinfo;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IGetWXAuthInfo implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getWXAuthInfo", response = WXAuthInfoResult.class)
    public void msiGetWXAuthInfo(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d7c2e5909925d5683fd1579bd15d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d7c2e5909925d5683fd1579bd15d5c");
        } else {
            new i<WXAuthInfoResult>() { // from class: com.meituan.msi.adapter.wxauthinfo.IGetWXAuthInfo.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(WXAuthInfoResult wXAuthInfoResult) {
                    WXAuthInfoResult wXAuthInfoResult2 = wXAuthInfoResult;
                    Object[] objArr2 = {wXAuthInfoResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68eb384fd5d18eeb9496f6e06e007103", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68eb384fd5d18eeb9496f6e06e007103");
                    } else {
                        msiCustomContext.onSuccess(wXAuthInfoResult2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b92987ff44354258e2a3490b2cdba86d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b92987ff44354258e2a3490b2cdba86d");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }

    @MsiApiMethod(name = "bindWXAccount", response = WXAuthInfoResult.class)
    public void msiBindWXAccount(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ace45f43fade7e90b3c016c9f0f47f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ace45f43fade7e90b3c016c9f0f47f");
        } else {
            new i<WXAuthInfoResult>() { // from class: com.meituan.msi.adapter.wxauthinfo.IGetWXAuthInfo.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(WXAuthInfoResult wXAuthInfoResult) {
                    WXAuthInfoResult wXAuthInfoResult2 = wXAuthInfoResult;
                    Object[] objArr2 = {wXAuthInfoResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6117ad2e5910031895e1580a28bd037f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6117ad2e5910031895e1580a28bd037f");
                    } else {
                        msiCustomContext.onSuccess(wXAuthInfoResult2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "244ab0281cdf434d16466a161a5f9e6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "244ab0281cdf434d16466a161a5f9e6a");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
