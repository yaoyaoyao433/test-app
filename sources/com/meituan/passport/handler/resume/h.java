package com.meituan.passport.handler.resume;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.dialogs.ConfirmDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.User;
import com.meituan.passport.service.al;
import com.meituan.passport.utils.ab;
import com.meituan.passport.utils.q;
import com.meituan.passport.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends b<User> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<User> e;
    com.meituan.passport.converter.m f;
    com.meituan.passport.converter.m g;
    String h;
    String i;
    String j;
    String k;
    String l;

    public h(FragmentActivity fragmentActivity, com.meituan.passport.converter.m mVar, com.meituan.passport.converter.m mVar2, String str, String str2, String str3) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, mVar, mVar2, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b877f3d0755c3d7c3d690ac759e07192", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b877f3d0755c3d7c3d690ac759e07192");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = mVar;
        this.g = mVar2;
        this.j = str;
        this.l = str2;
        this.k = str3;
    }

    public h(FragmentActivity fragmentActivity, com.meituan.passport.converter.m mVar, com.meituan.passport.converter.m mVar2, com.meituan.passport.clickaction.d<Mobile> dVar, String str, String str2, String str3) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, mVar, mVar2, dVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78aabf0d366cb08d882958fc122a34d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78aabf0d366cb08d882958fc122a34d9");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = mVar;
        this.g = mVar2;
        this.h = (dVar == null || dVar.b() == null) ? "" : dVar.b().number;
        this.i = (dVar == null || dVar.b() == null) ? "" : dVar.b().countryCode;
        this.j = str;
        this.l = str2;
        this.k = str3;
    }

    public h(FragmentActivity fragmentActivity, com.meituan.passport.converter.m mVar, com.meituan.passport.converter.m mVar2, String str, String str2, String str3, String str4, String str5) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, mVar, mVar2, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18484443f7cf257889106a5b8edd5636", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18484443f7cf257889106a5b8edd5636");
            return;
        }
        this.e = rx.subjects.b.g();
        this.f = mVar;
        this.g = mVar2;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.l = str4;
        this.k = str5;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, final FragmentActivity fragmentActivity) {
        String str;
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1271325aa12f79f4fef9aa085acf2b7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1271325aa12f79f4fef9aa085acf2b7f");
        }
        if (apiException != null && (apiException.code == 101235 || apiException.code == 101236)) {
            if (fragmentActivity == null) {
                return rx.d.a((Throwable) apiException);
            }
            String message = apiException.getMessage();
            if (apiException.code == 101235) {
                if (TextUtils.isEmpty(message)) {
                    message = fragmentActivity.getString(R.string.passport_reopen_silent_period);
                }
                new com.sankuai.meituan.android.ui.widget.a(fragmentActivity, message, 5000).a();
                if (this.e != null) {
                    this.e.onCompleted();
                }
            } else {
                final String str2 = "";
                String str3 = "";
                try {
                    JsonObject asJsonObject = new JsonParser().parse(apiException.data).getAsJsonObject();
                    if (asJsonObject != null && asJsonObject.has("userTicket")) {
                        String asString = asJsonObject.get("userTicket").getAsString();
                        try {
                            str3 = asJsonObject.get("toastInfo").getAsString();
                        } catch (Exception unused) {
                        }
                        str2 = asString;
                    }
                } catch (Exception unused2) {
                }
                if (TextUtils.isEmpty(message)) {
                    str = fragmentActivity.getString(R.string.passport_reopen_confirm_message, new Object[]{PassportConfig.l() + "App"});
                } else {
                    str = PassportConfig.l() + "App" + apiException.getMessage();
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = str;
                    str = null;
                }
                int i = R.layout.passport_fragment_privacy_agreement_dialog;
                if (ab.a() == 1) {
                    i = R.layout.passport_fragment_elder_privacy_agreement_dialog;
                }
                ConfirmDialog.a a = ConfirmDialog.a.a();
                a.b = str;
                a.c = str3;
                a.e = fragmentActivity.getString(R.string.passport_reopen_confirm);
                a.f = fragmentActivity.getString(R.string.passport_reopen_cancel);
                a.h = new View.OnClickListener() { // from class: com.meituan.passport.handler.resume.h.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d398b0303afeb3b90f71212b2de1ce5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d398b0303afeb3b90f71212b2de1ce5");
                            return;
                        }
                        final h hVar = h.this;
                        final FragmentActivity fragmentActivity2 = fragmentActivity;
                        String str4 = str2;
                        Object[] objArr3 = {fragmentActivity2, str4};
                        ChangeQuickRedirect changeQuickRedirect3 = h.b;
                        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "bb8a91935256596cd556a9d89221d024", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "bb8a91935256596cd556a9d89221d024");
                            return;
                        }
                        al alVar = new al(hVar.h, hVar.i, hVar.j, hVar.l, hVar.k);
                        alVar.a(fragmentActivity2);
                        alVar.a((al) new com.meituan.passport.pojo.request.g(com.meituan.passport.clickaction.d.a(str4)));
                        alVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.handler.resume.h.3
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.passport.converter.b
                            public final boolean a(ApiException apiException2, boolean z) {
                                Object[] objArr4 = {apiException2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "502085d55bf15d8560cd5f6989ba7722", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "502085d55bf15d8560cd5f6989ba7722")).booleanValue();
                                }
                                if (h.this.e != null) {
                                    h.this.e.onCompleted();
                                }
                                return true;
                            }
                        };
                        alVar.f = new com.meituan.passport.converter.m<User>() { // from class: com.meituan.passport.handler.resume.h.4
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.passport.converter.m
                            public final /* synthetic */ void a(User user) {
                                User user2 = user;
                                Object[] objArr4 = {user2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6f09b97f60f58cce7145687da5c83b5e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6f09b97f60f58cce7145687da5c83b5e");
                                    return;
                                }
                                if (h.this.f != null) {
                                    if (h.this.f instanceof com.meituan.passport.successcallback.f) {
                                        ((com.meituan.passport.successcallback.f) h.this.f).b(false);
                                        ((com.meituan.passport.successcallback.f) h.this.f).c(false);
                                        ((com.meituan.passport.successcallback.f) h.this.f).d(false);
                                    }
                                    h.this.f.a(user2);
                                    if (h.this.g == null) {
                                        q.a(fragmentActivity2);
                                    }
                                } else {
                                    UserCenter.getInstance(fragmentActivity2).loginSuccess(user2);
                                }
                                if (h.this.e != null) {
                                    h.this.e.onCompleted();
                                }
                            }
                        };
                        alVar.b();
                    }
                };
                a.i = new View.OnClickListener() { // from class: com.meituan.passport.handler.resume.h.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1251185298c029c707292ba501757450", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1251185298c029c707292ba501757450");
                        } else if (h.this.e != null) {
                            h.this.e.onCompleted();
                        }
                    }
                };
                a.k = 2;
                a.l = i;
                a.b().show(fragmentActivity.getSupportFragmentManager(), "reopenAgreementDialog");
                y.a(fragmentActivity);
                if (this.e != null) {
                    return this.e.c();
                }
            }
        }
        return rx.d.a((Throwable) apiException);
    }
}
