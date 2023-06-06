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
public class QQBindJSHandler extends QQBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.passport.converter.b failedCallbacks;
    private m<BindStatus> successCallBacks;

    public static /* synthetic */ com.meituan.passport.oauthlogin.model.a lambda$doOAuthSuccess$0(com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54eee822f620568f82f4971a6d0cc46e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.oauthlogin.model.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54eee822f620568f82f4971a6d0cc46e") : aVar;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "YbXNXhK1t1Wl/XzsxaiCZ5S6mQmr+QEMh9rHa/S3mL3GzVpi7yTrbhRvbBWxuyhLwulUS6tKhux5F+9e48kYOA==";
    }

    public QQBindJSHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5ad359f66a89566506a39d269a8f6ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5ad359f66a89566506a39d269a8f6ca");
            return;
        }
        this.failedCallbacks = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.oauthlogin.jsbridge.QQBindJSHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b58dd1f1a8be3a0b7905365b0f51c8a5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b58dd1f1a8be3a0b7905365b0f51c8a5")).booleanValue();
                }
                if (apiException != null) {
                    n.a("QQBindJSHandler.failedCallbacks", "failed", apiException.getMessage());
                }
                QQBindJSHandler.this.doJsStatusCallback("status", "fail");
                return true;
            }
        };
        this.successCallBacks = new m<BindStatus>() { // from class: com.meituan.passport.oauthlogin.jsbridge.QQBindJSHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(BindStatus bindStatus) {
                BindStatus bindStatus2 = bindStatus;
                Object[] objArr2 = {bindStatus2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9e145900da5305dee144a14eb53dd203", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9e145900da5305dee144a14eb53dd203");
                    return;
                }
                if (bindStatus2 != null) {
                    n.a("QQBindJSHandler.successCallBacks", "onSuccess", bindStatus2.nickName);
                }
                QQBindJSHandler.this.doJsStatusCallback("status", "success");
            }
        };
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.QQBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95f69b6c8509f8a5552f07177e1db6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95f69b6c8509f8a5552f07177e1db6bf");
        } else {
            super.exec();
        }
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.QQBaseJSHandler
    public void doOAuthSuccess(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87c51b61aa3da82787660430ae2f18ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87c51b61aa3da82787660430ae2f18ed");
            return;
        }
        super.doOAuthSuccess(fragmentActivity, aVar);
        com.meituan.passport.oauthlogin.service.b bVar = new com.meituan.passport.oauthlogin.service.b();
        bVar.a(fragmentActivity);
        bVar.g = this.failedCallbacks;
        bVar.f = this.successCallBacks;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        bVar.a((com.meituan.passport.oauthlogin.service.b) new g(d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "79bbd5b3fd7e6e9d4150c3e2178b1750", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "79bbd5b3fd7e6e9d4150c3e2178b1750") : new a(aVar))));
        bVar.b();
    }
}
