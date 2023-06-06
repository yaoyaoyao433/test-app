package com.meituan.msi.adapter.mtlogin;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IMtLogin implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract MtCheckSessionResponse a(MsiCustomContext msiCustomContext);

    public abstract void a(MsiCustomContext msiCustomContext, MtLogoutParam mtLogoutParam, i iVar);

    public abstract void a(MsiCustomContext msiCustomContext, i<MtLoginResponse> iVar);

    public abstract MtUserInfoResponse b(MsiCustomContext msiCustomContext, i<MtUserInfoResponse> iVar);

    public abstract void c(MsiCustomContext msiCustomContext, i iVar);

    @MsiApiMethod(name = "mtLogin", response = MtLoginResponse.class)
    public void msiMtLogin(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0edb462a89df29c00dc0f14b16a135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0edb462a89df29c00dc0f14b16a135");
        } else {
            a(msiCustomContext, new i<MtLoginResponse>() { // from class: com.meituan.msi.adapter.mtlogin.IMtLogin.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(MtLoginResponse mtLoginResponse) {
                    MtLoginResponse mtLoginResponse2 = mtLoginResponse;
                    Object[] objArr2 = {mtLoginResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "037ae989fa0f481d2c9467c999b48998", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "037ae989fa0f481d2c9467c999b48998");
                    } else {
                        msiCustomContext.onSuccess(mtLoginResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f203016d5f44fed905d4465bfa0f82da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f203016d5f44fed905d4465bfa0f82da");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "mtLogout", request = MtLogoutParam.class)
    public void msiMtLogout(MtLogoutParam mtLogoutParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {mtLogoutParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f64cdba034321c0fc4309887657ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f64cdba034321c0fc4309887657ed9");
        } else {
            a(msiCustomContext, mtLogoutParam, new i() { // from class: com.meituan.msi.adapter.mtlogin.IMtLogin.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e239b8569dbb2bd64f1d39158d5aadad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e239b8569dbb2bd64f1d39158d5aadad");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c5204d554c0b2076435f7e1b7a5492b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c5204d554c0b2076435f7e1b7a5492b");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "mtGetUserInfo", response = MtUserInfoResponse.class)
    public void getMTUserInfo(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c40590264ea364d9ae9a07f0d5d361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c40590264ea364d9ae9a07f0d5d361");
        } else {
            b(msiCustomContext, new i<MtUserInfoResponse>() { // from class: com.meituan.msi.adapter.mtlogin.IMtLogin.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(MtUserInfoResponse mtUserInfoResponse) {
                    MtUserInfoResponse mtUserInfoResponse2 = mtUserInfoResponse;
                    Object[] objArr2 = {mtUserInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f730d10e3d148aa2323113b671f96f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f730d10e3d148aa2323113b671f96f7");
                    } else {
                        msiCustomContext.onSuccess(mtUserInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91baf6e2122442d0dabc3858579cfa43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91baf6e2122442d0dabc3858579cfa43");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "mtGetUserInfoSync", response = MtUserInfoResponse.class)
    public MtUserInfoResponse getMTUserInfoSync(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ae35367afd70ad35530287a0926139", RobustBitConfig.DEFAULT_VALUE) ? (MtUserInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ae35367afd70ad35530287a0926139") : b(msiCustomContext, new i<MtUserInfoResponse>() { // from class: com.meituan.msi.adapter.mtlogin.IMtLogin.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.i
            public final /* synthetic */ void a(MtUserInfoResponse mtUserInfoResponse) {
                MtUserInfoResponse mtUserInfoResponse2 = mtUserInfoResponse;
                Object[] objArr2 = {mtUserInfoResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c1023844d7ea7f8e657e635c584a5c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c1023844d7ea7f8e657e635c584a5c7");
                } else {
                    msiCustomContext.onSuccess(mtUserInfoResponse2);
                }
            }

            @Override // com.meituan.msi.api.i
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12d1f59556b48564fd4ee28bf0ecd266", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12d1f59556b48564fd4ee28bf0ecd266");
                } else {
                    msiCustomContext.onError(i, str);
                }
            }
        });
    }

    @MsiApiMethod(name = "mtCheckSession")
    public void mtCheckSession(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8ed05ba67cb972f38cdb9b25903714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8ed05ba67cb972f38cdb9b25903714");
        } else {
            c(msiCustomContext, new i() { // from class: com.meituan.msi.adapter.mtlogin.IMtLogin.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7727b3bf6912a44c5f412abd5a5e2532", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7727b3bf6912a44c5f412abd5a5e2532");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75d7b31f6f86cc628ac6d89e8a6fcec7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75d7b31f6f86cc628ac6d89e8a6fcec7");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "mtCheckSessionSync", response = MtCheckSessionResponse.class)
    public MtCheckSessionResponse checkSessionSync(MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339f2b71facd23623076287a7e9c1282", RobustBitConfig.DEFAULT_VALUE) ? (MtCheckSessionResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339f2b71facd23623076287a7e9c1282") : a(msiCustomContext);
    }
}
