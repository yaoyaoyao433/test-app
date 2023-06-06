package com.meituan.passport.handler.resume;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.passport.IdentityVerificationFragment;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.bindphone.BindPhoneActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.ab;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends b<User> {
    public static ChangeQuickRedirect b;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private com.meituan.passport.converter.m k;
    private String l;

    public d(FragmentActivity fragmentActivity, String str, String str2, String str3, com.meituan.passport.converter.m mVar, String str4) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str, str2, str3, mVar, str4};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2ff9655ca3c7ae16c30870cb3dc837", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2ff9655ca3c7ae16c30870cb3dc837");
            return;
        }
        this.g = true;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.k = mVar;
        this.l = str4;
    }

    public d(FragmentActivity fragmentActivity, String str, com.meituan.passport.converter.m mVar, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str, mVar, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0e0db585dba6e2d70eb7703790d2a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0e0db585dba6e2d70eb7703790d2a0");
            return;
        }
        this.g = true;
        this.h = str;
        this.k = mVar;
        this.l = str2;
    }

    public d(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeecc70461c947da9fa1914581e84ab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeecc70461c947da9fa1914581e84ab0");
            return;
        }
        this.g = true;
        this.g = false;
        this.l = str;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b7197a32f0ba0c55ba524d29570e4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b7197a32f0ba0c55ba524d29570e4d");
        }
        if (apiException.code == 101159) {
            p.a().a(fragmentActivity, apiException.code, this.h, this.l);
            p.a().c(fragmentActivity, this.h, this.l, 1);
            if (fragmentActivity != null && !(fragmentActivity instanceof com.meituan.passport.m)) {
                p.a().b(fragmentActivity, this.h, this.l, apiException.code);
            }
            if (!this.g) {
                return rx.d.b();
            }
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                IdentityVerificationFragment identityVerificationFragment = new IdentityVerificationFragment();
                Bundle bundle = new Bundle();
                bundle.putString("ticket", a(apiException));
                if (!TextUtils.isEmpty(this.e)) {
                    bundle.putString("mobile", this.e);
                }
                if (!TextUtils.isEmpty(this.f)) {
                    bundle.putString(Constant.KEY_COUNTRY_CODE, this.f);
                }
                bundle.putString(DataConstants.LOGIN_TYPE, this.h);
                bundle.putString("accessToken", this.i);
                bundle.putString("appidParam", this.j);
                bundle.putInt("code", apiException.code);
                bundle.putString("action", this.l);
                identityVerificationFragment.setArguments(bundle);
                identityVerificationFragment.d = this.k;
                if ((ab.a() != 3 && (fragmentActivity instanceof LoginActivity)) || (fragmentActivity instanceof BindPhoneActivity)) {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_identify, identityVerificationFragment, "identify").commitAllowingStateLoss();
                } else {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(identityVerificationFragment, "identify").commitAllowingStateLoss();
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = IdentityVerificationFragment.a;
                return PatchProxy.isSupport(objArr2, identityVerificationFragment, changeQuickRedirect2, false, "2015b3c31bf9cf71c23e8cf20dab1a74", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, identityVerificationFragment, changeQuickRedirect2, false, "2015b3c31bf9cf71c23e8cf20dab1a74") : identityVerificationFragment.c.c();
            }
        }
        return rx.d.a((Throwable) apiException);
    }

    private String a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52255c7342da01e61a08444a857d8cb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52255c7342da01e61a08444a857d8cb6");
        }
        if (apiException == null || TextUtils.isEmpty(apiException.data)) {
            return "";
        }
        try {
            JsonElement parse = new JsonParser().parse(apiException.data);
            JsonObject asJsonObject = parse != null ? parse.getAsJsonObject() : null;
            JsonElement jsonElement = asJsonObject != null ? asJsonObject.get("userTicket") : null;
            return jsonElement != null ? jsonElement.getAsString() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
