package com.meituan.passport.oauthlogin.handler;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.passport.converter.m;
import com.meituan.passport.dialogs.WarningDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.request.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.passport.handler.resume.b<BindStatus> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<BindStatus> e;
    g<com.meituan.passport.oauthlogin.model.a> f;
    m<BindStatus> g;
    com.meituan.passport.converter.b h;
    String i;

    public a(FragmentActivity fragmentActivity, g<com.meituan.passport.oauthlogin.model.a> gVar, m<BindStatus> mVar, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, gVar, mVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fda287531eb6ee7c44157c567c2dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fda287531eb6ee7c44157c567c2dc1");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = gVar;
        this.g = mVar;
        this.h = bVar;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final d<BindStatus> a(ApiException apiException, final FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d8604ac06294c824377a074bd2ab10", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d8604ac06294c824377a074bd2ab10");
        }
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && apiException.code == 101147) {
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            try {
                JsonObject asJsonObject = new JsonParser().parse(apiException.data).getAsJsonObject();
                if (asJsonObject != null && asJsonObject.has("userTicket")) {
                    this.i = asJsonObject.get("userTicket").getAsString();
                }
            } catch (Exception unused) {
            }
            String message = apiException.getMessage();
            Object[] objArr2 = {message, fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "142436ac63a800763eb1bb31c0e0bb0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "142436ac63a800763eb1bb31c0e0bb0f");
            } else {
                WarningDialog.a a = WarningDialog.a.a();
                a.b = message;
                a.d = fragmentActivity.getString(R.string.passport_bind_cancel);
                a.f = new View.OnClickListener() { // from class: com.meituan.passport.oauthlogin.handler.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fda698d4b0c307aee59563c499478cf8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fda698d4b0c307aee59563c499478cf8");
                        } else {
                            a.this.e.onError(new ApiException("", 4, ""));
                        }
                    }
                };
                a.c = fragmentActivity.getString(R.string.passport_bind_current_account);
                a.e = new View.OnClickListener() { // from class: com.meituan.passport.oauthlogin.handler.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c16314ac5496c30c36db7b4ef17a4411", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c16314ac5496c30c36db7b4ef17a4411");
                            return;
                        }
                        a aVar = a.this;
                        FragmentActivity fragmentActivity2 = fragmentActivity;
                        Object[] objArr4 = {fragmentActivity2};
                        ChangeQuickRedirect changeQuickRedirect4 = a.b;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e1f033565a363c4e90c35b82056a8f0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e1f033565a363c4e90c35b82056a8f0b");
                            return;
                        }
                        com.meituan.passport.oauthlogin.service.a aVar2 = new com.meituan.passport.oauthlogin.service.a(aVar.i);
                        aVar2.a(fragmentActivity2);
                        aVar2.g = aVar.h;
                        aVar2.f = aVar.g;
                        aVar2.a((com.meituan.passport.oauthlogin.service.a) aVar.f);
                        aVar2.b();
                    }
                };
                a.h = 2;
                a.b().show(fragmentActivity.getSupportFragmentManager(), "tips");
            }
            return this.e;
        }
        return d.a((Throwable) apiException);
    }
}
