package com.meituan.passport.oauthlogin.jsbridge;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.clickaction.c;
import com.meituan.passport.clickaction.d;
import com.meituan.passport.converter.m;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.request.g;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WechatBindJSHandler extends WechatBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.passport.converter.b failedCallbacks;
    private m<BindStatus> successCallBacks;

    public static /* synthetic */ com.meituan.passport.oauthlogin.model.a lambda$doOAuthSuccess$1(com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49a3e6979879fb14c1e92ac935aabe2d", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.oauthlogin.model.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49a3e6979879fb14c1e92ac935aabe2d") : aVar;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "IeZtKVbCCOPzzN+vcnjT/dsdhW45pQe7P0Vsg5xSO+2Jby3kO8PcHraY44jx1iA9CxRbwHQ7jTvSBEEiU5rI9g==";
    }

    public WechatBindJSHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57be5d97b4d11c8cc1f31eed6bef5e25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57be5d97b4d11c8cc1f31eed6bef5e25");
            return;
        }
        this.failedCallbacks = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.oauthlogin.jsbridge.WechatBindJSHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9904751758f2404794784d4b52e8ebe", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9904751758f2404794784d4b52e8ebe")).booleanValue();
                }
                WechatBindJSHandler.this.doJsStatusCallback("status", "fail");
                if (apiException != null) {
                    n.a("WechatBindJSHandler.failedCallbacks", "failed", apiException.getMessage());
                }
                return true;
            }
        };
        this.successCallBacks = new m<BindStatus>() { // from class: com.meituan.passport.oauthlogin.jsbridge.WechatBindJSHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(BindStatus bindStatus) {
                BindStatus bindStatus2 = bindStatus;
                Object[] objArr2 = {bindStatus2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1adb0d367e13bed60d7f26dc4939242b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1adb0d367e13bed60d7f26dc4939242b");
                    return;
                }
                WechatBindJSHandler.this.doJsStatusCallback("status", "success");
                if (bindStatus2 != null) {
                    n.a("WechatBindJSHandler.successCallBacks", "onSuccess", bindStatus2.nickName);
                }
            }
        };
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2af59c31382268da909bc7bbd1e0340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2af59c31382268da909bc7bbd1e0340");
        } else {
            super.exec();
        }
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler
    public void doOAuthSuccess(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "915b20c80c513cebb04bac3299977a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "915b20c80c513cebb04bac3299977a20");
            return;
        }
        super.doOAuthSuccess(fragmentActivity, aVar);
        com.meituan.passport.oauthlogin.service.b bVar = new com.meituan.passport.oauthlogin.service.b();
        bVar.a(fragmentActivity);
        bVar.g = this.failedCallbacks;
        bVar.f = this.successCallBacks;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        bVar.a((com.meituan.passport.oauthlogin.service.b) new g(d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1d4a84d75f60cba4e33a22bfa120649e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1d4a84d75f60cba4e33a22bfa120649e") : new b(aVar))));
        bVar.b();
    }
}
