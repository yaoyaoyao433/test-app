package com.meituan.mmp.lib.api.wx;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.utils.m;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.mmp.main.h;
import com.meituan.passport.UserCenter;
import com.meituan.passport.clickaction.c;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.oauthlogin.b;
import com.meituan.passport.oauthlogin.model.a;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.request.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.oauth.e;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({b.class})
/* loaded from: classes3.dex */
public class WXAuthInfoApi extends ActivityApi {
    @SupportApiNames
    public static String[] API_NAMES = {"getWXAuthInfo", "bindWXAccount"};
    public static ChangeQuickRedirect h;
    private boolean i;
    private boolean j;

    public WXAuthInfoApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e43d98952e9526896cc5f7e5ff6b67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e43d98952e9526896cc5f7e5ff6b67");
            return;
        }
        this.i = false;
        this.j = false;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964389227bc01bad92e516c31f9aefee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964389227bc01bad92e516c31f9aefee");
        } else if (!isInnerApp()) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "当前小程序不支持该功能"));
        } else if (!m.a(new m.a() { // from class: com.meituan.mmp.lib.api.wx.WXAuthInfoApi.1
            @Override // com.meituan.mmp.lib.utils.m.a
            public final Class<?> a() {
                return b.class;
            }
        })) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "当前小程序不支持该功能"));
        } else if (this.i) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "操作进行中"));
        } else {
            this.i = true;
            if ("getWXAuthInfo".equals(str)) {
                a(iApiCallback);
            } else if ("bindWXAccount".equals(str)) {
                Object[] objArr2 = {iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de05e1d606c6d5b92f2c0b91daf11bae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de05e1d606c6d5b92f2c0b91daf11bae");
                    return;
                }
                this.j = true;
                a(iApiCallback);
            }
        }
    }

    private void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9096a63a06f94c1ff634110bb9166376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9096a63a06f94c1ff634110bb9166376");
        } else {
            startActivityForResult(b.a().a(UserCenter.OAUTH_TYPE_WEIXIN), iApiCallback);
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, final IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b069a879374526b7d5f7e8baa142724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b069a879374526b7d5f7e8baa142724");
            return;
        }
        if (i == -1) {
            if (intent != null && (f.c(intent, "oauth_result") instanceof e)) {
                final e eVar = (e) f.c(intent, "oauth_result");
                if (this.j) {
                    Object[] objArr2 = {eVar, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3963d5e826d07b2ee71c963c952c570c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3963d5e826d07b2ee71c963c952c570c");
                    } else {
                        h mMPUserCenter = MMPEnvHelper.getMMPUserCenter();
                        if (mMPUserCenter == null || !mMPUserCenter.a()) {
                            iApiCallback.onFail(AbsApi.codeJson(-1, "用户未登陆美团"));
                        } else {
                            final a aVar = new a(eVar.b(), eVar.c());
                            com.meituan.passport.oauthlogin.service.b bVar = new com.meituan.passport.oauthlogin.service.b();
                            if (getActivity() != null) {
                                bVar.a((FragmentActivity) getActivity());
                                bVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.mmp.lib.api.wx.WXAuthInfoApi.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.passport.converter.b
                                    public final boolean a(ApiException apiException, boolean z) {
                                        Object[] objArr3 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3b4e48806c69490096d53ad73e03772", RobustBitConfig.DEFAULT_VALUE)) {
                                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3b4e48806c69490096d53ad73e03772")).booleanValue();
                                        }
                                        iApiCallback.onFail(AbsApi.codeJson(-1, apiException.getMessage()));
                                        return false;
                                    }
                                };
                                bVar.f = new com.meituan.passport.converter.m<BindStatus>() { // from class: com.meituan.mmp.lib.api.wx.WXAuthInfoApi.3
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.passport.converter.m
                                    public final /* synthetic */ void a(BindStatus bindStatus) {
                                        BindStatus bindStatus2 = bindStatus;
                                        Object[] objArr3 = {bindStatus2};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "29895bcfc575d01d79a6b569f646bd54", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "29895bcfc575d01d79a6b569f646bd54");
                                        } else if (bindStatus2 == null) {
                                            iApiCallback.onFail(AbsApi.codeJson(-1, "绑定微信账号失败"));
                                        } else {
                                            try {
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put("code", eVar.c());
                                                jSONObject.put("type", eVar.b());
                                                jSONObject.put("nickName", bindStatus2.nickName);
                                                iApiCallback.onSuccess(jSONObject);
                                            } catch (JSONException unused) {
                                                iApiCallback.onFail(AbsApi.codeJson(-1, "绑定微信账号失败"));
                                            }
                                        }
                                    }
                                };
                                bVar.a((com.meituan.passport.oauthlogin.service.b) new g(com.meituan.passport.clickaction.d.a((c) new c<a>() { // from class: com.meituan.mmp.lib.api.wx.WXAuthInfoApi.4
                                    @Override // com.meituan.passport.clickaction.c
                                    public final /* bridge */ /* synthetic */ a getParam() {
                                        return aVar;
                                    }
                                })));
                                bVar.b();
                            } else {
                                iApiCallback.onFail(AbsApi.codeJson(-1, "绑定微信账号失败"));
                            }
                        }
                    }
                } else {
                    Object[] objArr3 = {eVar, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = h;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5cd95a815395147634d7b620bde25656", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5cd95a815395147634d7b620bde25656");
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", eVar.c());
                            jSONObject.put("type", eVar.b());
                            iApiCallback.onSuccess(jSONObject);
                        } catch (JSONException unused) {
                            iApiCallback.onFail(AbsApi.codeJson(-1, "获取微信账号信息失败"));
                        }
                    }
                }
            } else {
                iApiCallback.onFail(AbsApi.codeJson(-1, "获取微信账号信息失败"));
            }
        } else {
            iApiCallback.onFail(AbsApi.codeJson(i == 0 ? -2 : -3, b.a().b(intent)));
        }
        this.j = false;
        this.i = false;
    }
}
