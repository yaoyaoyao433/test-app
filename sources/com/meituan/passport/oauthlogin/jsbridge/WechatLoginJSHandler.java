package com.meituan.passport.oauthlogin.jsbridge;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.UserCenter;
import com.meituan.passport.clickaction.d;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.s;
import com.meituan.passport.oauthlogin.service.c;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.request.g;
import com.meituan.passport.successcallback.f;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WechatLoginJSHandler extends WechatBaseJSHandler {
    private static final String TYPE_WECHAT_BRIDGE = "wx_bridge";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "jiqE0qNPdNaDKAK4ruMhRlnCQ1qX5r1x7MFVp+H4ER6cg+TbGHMnTgYaOKwFg7BlMbeGN9NTlgJN5Gmp/HvVpQ==";
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b21786c0bd38c26d93ac047206332a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b21786c0bd38c26d93ac047206332a");
            return;
        }
        if (jsHost() != null) {
            p.a().a(jsHost().getActivity(), true, "桥SDK微信登录");
        }
        super.exec();
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler
    public void doOAuthSuccess(final FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "272e60b8df36b30fdea948d29d5a6b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "272e60b8df36b30fdea948d29d5a6b5b");
            return;
        }
        super.doOAuthSuccess(fragmentActivity, aVar);
        c cVar = new c();
        cVar.c = TYPE_WECHAT_BRIDGE;
        cVar.a(fragmentActivity);
        cVar.f = new a(fragmentActivity);
        cVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.oauthlogin.jsbridge.WechatLoginJSHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6c71dc46ee0aef417abd00442775a48", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6c71dc46ee0aef417abd00442775a48")).booleanValue();
                }
                if (apiException == null) {
                    return false;
                }
                ai.a().b(fragmentActivity, "", UserCenter.OAUTH_TYPE_WEIXIN, apiException.code);
                if (apiException.code != 101144) {
                    ((s) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_binded")).a(apiException, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE);
                }
                p.a().a((Activity) fragmentActivity, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login");
                p.a().a(fragmentActivity, apiException.code, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login");
                if ((apiException.code < 401 || apiException.code > 405) && apiException.code != 101157 && apiException.code != 101155) {
                    p.a().c(fragmentActivity, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login", apiException.code);
                }
                return false;
            }
        };
        cVar.a((c) new g(d.a(aVar)));
        cVar.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends f<User> {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.passport.successcallback.f
        public final /* bridge */ /* synthetic */ void a(User user, Fragment fragment) {
        }

        @Override // com.meituan.passport.successcallback.f
        public final /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
            User user2 = user;
            Object[] objArr = {user2, fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fde5fdea66904328bf1ff88a755557", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fde5fdea66904328bf1ff88a755557");
            } else if (user2 == null && WechatLoginJSHandler.this.jsHost() == null && WechatLoginJSHandler.this.jsHost().getActivity() == null) {
            } else {
                UserCenter userCenter = UserCenter.getInstance(WechatLoginJSHandler.this.jsHost().getActivity());
                if (user2 != null) {
                    userCenter.loginSuccess(user2, 300);
                    WechatLoginJSHandler.this.doJsStatusCallback("succeed, userid: ", Long.valueOf(user2.id));
                    ((s) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_binded")).a(null);
                    p.a().a(fragmentActivity, 1, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login");
                }
                p.a().a((Activity) fragmentActivity, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login");
                if (this.f) {
                    p.a().c(fragmentActivity, WechatLoginJSHandler.TYPE_WECHAT_BRIDGE, "login", 1);
                }
            }
        }

        public a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            Object[] objArr = {WechatLoginJSHandler.this, fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba1ebb15e26ad2c1ba580fe69407684", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba1ebb15e26ad2c1ba580fe69407684");
            }
        }
    }
}
