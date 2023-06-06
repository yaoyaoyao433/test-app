package com.sankuai.waimai.mmp.modules.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.msi.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.e;
import com.meituan.msi.a;
import com.meituan.msi.adapter.mtlogin.IMtLogin;
import com.meituan.msi.adapter.mtlogin.MtCheckSessionResponse;
import com.meituan.msi.adapter.mtlogin.MtLoginResponse;
import com.meituan.msi.adapter.mtlogin.MtLogoutParam;
import com.meituan.msi.adapter.mtlogin.MtUserInfoResponse;
import com.meituan.msi.api.g;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.ILogoutCallback;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mmp.modules.user.WMUserModule;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMSIUserApi extends IMtLogin implements b, g {
    public static ChangeQuickRedirect b;
    private e c;

    @Override // com.meituan.mmp.lib.msi.b
    public final void a(e eVar) {
        this.c = eVar;
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7392b5ad43d3baefb5148e16231a6d17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7392b5ad43d3baefb5148e16231a6d17");
        } else if (-1 != i) {
            msiContext.onError("");
        }
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public final void a(MsiCustomContext msiCustomContext, final i<MtLoginResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b6243961f67a28ea28b1e8d23b8cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b6243961f67a28ea28b1e8d23b8cfc");
            return;
        }
        Context f = a.f();
        UserCenter userCenter = UserCenter.getInstance(f);
        WMUserModule.a aVar = new WMUserModule.a(f, new IApiCallback() { // from class: com.sankuai.waimai.mmp.modules.api.WMMSIUserApi.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.main.IApiCallback
            public final Event getEvent() {
                return null;
            }

            @Override // com.meituan.mmp.main.IApiCallback
            public final void onCancel() {
            }

            @Override // com.meituan.mmp.main.IApiCallback
            public final void onFail(JSONObject jSONObject) {
            }

            @Override // com.meituan.mmp.main.IApiCallback
            public final void onSuccess(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034424c99e40c4e712845ba0f3d285fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034424c99e40c4e712845ba0f3d285fc");
                    return;
                }
                MtLoginResponse mtLoginResponse = new MtLoginResponse();
                mtLoginResponse.code = jSONObject.optString("code", "");
                iVar.a(mtLoginResponse);
            }

            @Override // com.meituan.mmp.main.IApiCallback
            public final void onFail() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc0c0230c7f8ee57a21c9a4065e23c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc0c0230c7f8ee57a21c9a4065e23c9");
                } else {
                    iVar.a(500, "login fail");
                }
            }
        });
        aVar.d = userCenter.loginEventObservable().c(aVar);
        if (userCenter.isLogin()) {
            User user = userCenter.getUser();
            if (user != null) {
                MtLoginResponse mtLoginResponse = new MtLoginResponse();
                mtLoginResponse.code = user.token;
                iVar.a(mtLoginResponse);
                return;
            }
            iVar.a(500, "login activity returns success, but login check failed");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a(f, new BaseUserManager.b());
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public final void a(MsiCustomContext msiCustomContext, MtLogoutParam mtLogoutParam, final i iVar) {
        boolean a;
        int i;
        ab b2;
        String c;
        Object[] objArr = {msiCustomContext, mtLogoutParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9413a1725d6c45b3c5f616a8b8a595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9413a1725d6c45b3c5f616a8b8a595");
            return;
        }
        Context f = a.f();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "629a3a264cfb7ed90f4a6f9081e6b54c", RobustBitConfig.DEFAULT_VALUE)) {
            a = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "629a3a264cfb7ed90f4a6f9081e6b54c")).booleanValue();
        } else {
            a = (this.c == null || this.c.c() == null) ? false : this.c.c().a();
        }
        if (a) {
            if (TextUtils.equals("user", mtLogoutParam.eventFrom)) {
                UserCenter.getInstance(f).positiveLogout();
                iVar.a("");
                return;
            }
            String str = "";
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c8223649784cde46489cad48ec7b2b2", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = (ab) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c8223649784cde46489cad48ec7b2b2");
            } else {
                b2 = this.c != null ? this.c.b() : null;
            }
            if (b2 != null && b2.e() != null) {
                str = b2.e().getPagePath();
            }
            try {
                UserCenter userCenter = UserCenter.getInstance(MMPEnvHelper.getContext());
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d67b9c919ffe66c0b3f74430ab4a96f6", RobustBitConfig.DEFAULT_VALUE)) {
                    c = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d67b9c919ffe66c0b3f74430ab4a96f6");
                } else {
                    c = (this.c == null || this.c.c() == null) ? null : this.c.c().c();
                }
                userCenter.negativeLogout(new LogoutInfo("com.sankuai.waimai.platform", new LogoutInfo.MMPData(c, str), (HashMap<String, String>) null), new ILogoutCallback() { // from class: com.sankuai.waimai.mmp.modules.api.WMMSIUserApi.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.api.ILogoutCallback
                    public final void onSuccess() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7979c3d51dbec357c7197e9b645389fe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7979c3d51dbec357c7197e9b645389fe");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.c("MTMMPUserCenter", "log out success");
                        iVar.a("");
                    }

                    @Override // com.meituan.passport.api.ILogoutCallback
                    public final void onFailed() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fa4b95a81c8ccbdb7210c4d384b26da6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fa4b95a81c8ccbdb7210c4d384b26da6");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.c("MTMMPUserCenter", "log out failed");
                        iVar.a(500, "log out failed");
                    }
                });
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.c("MTMMPUserCenter", "ignored exception when log out: " + e.toString());
                i = 500;
                iVar.a(500, "ignored exception when log out: " + e.toString());
            }
        }
        i = 500;
        iVar.a(i, "not supported");
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public final MtUserInfoResponse b(MsiCustomContext msiCustomContext, i<MtUserInfoResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84da1d30a61d817894009954986e6e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtUserInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84da1d30a61d817894009954986e6e7");
        }
        UserCenter userCenter = UserCenter.getInstance(a.f());
        if (!userCenter.isLogin()) {
            iVar.a(500, "获取userId失败");
            return new MtUserInfoResponse();
        }
        User user = userCenter.getUser();
        com.sankuai.meituan.city.a a = com.meituan.android.singleton.a.a();
        MtUserInfoResponse.MTUserInfo mTUserInfo = new MtUserInfoResponse.MTUserInfo();
        mTUserInfo.nickName = user.username;
        mTUserInfo.avatarUrl = user.avatarurl;
        mTUserInfo.gender = 0;
        if (a != null) {
            mTUserInfo.city = a.a();
            mTUserInfo.province = a.a();
        }
        mTUserInfo.country = "中国";
        mTUserInfo.language = "zh_CN";
        mTUserInfo.token = user.token;
        mTUserInfo.userId = user.id;
        mTUserInfo.userChannel = user.userChannel;
        MtUserInfoResponse mtUserInfoResponse = new MtUserInfoResponse();
        mtUserInfoResponse.userInfo = mTUserInfo;
        mtUserInfoResponse.uuid = a.a().b();
        iVar.a(mtUserInfoResponse);
        return mtUserInfoResponse;
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public MtUserInfoResponse getMTUserInfoSync(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff301614067b788dcb5ff83bfea74c8d", RobustBitConfig.DEFAULT_VALUE) ? (MtUserInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff301614067b788dcb5ff83bfea74c8d") : b(msiCustomContext, new i<MtUserInfoResponse>() { // from class: com.sankuai.waimai.mmp.modules.api.WMMSIUserApi.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.i
            public final /* synthetic */ void a(MtUserInfoResponse mtUserInfoResponse) {
                MtUserInfoResponse mtUserInfoResponse2 = mtUserInfoResponse;
                Object[] objArr2 = {mtUserInfoResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68e67031e06c2e6f489c16e405a64a96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68e67031e06c2e6f489c16e405a64a96");
                } else {
                    msiCustomContext.onSuccess(mtUserInfoResponse2);
                }
            }

            @Override // com.meituan.msi.api.i
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ebc0b0180d83ec57dba90d40d1fd328", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ebc0b0180d83ec57dba90d40d1fd328");
                } else {
                    msiCustomContext.onError(i, str);
                }
            }
        });
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public final void c(MsiCustomContext msiCustomContext, i iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94735d1a524379743b3ec1edb469686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94735d1a524379743b3ec1edb469686");
        } else if (UserCenter.getInstance(a.f()).isLogin()) {
            msiCustomContext.onSuccess(null);
        } else {
            msiCustomContext.onError(500, "没有获取到用户信息");
        }
    }

    @Override // com.meituan.msi.adapter.mtlogin.IMtLogin
    public final MtCheckSessionResponse a(MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7691844b21c9b9e6818ac94cd72762e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtCheckSessionResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7691844b21c9b9e6818ac94cd72762e");
        }
        UserCenter userCenter = UserCenter.getInstance(a.f());
        MtCheckSessionResponse mtCheckSessionResponse = new MtCheckSessionResponse();
        mtCheckSessionResponse.isLogin = userCenter.isLogin();
        return mtCheckSessionResponse;
    }
}
