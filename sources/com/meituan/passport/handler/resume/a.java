package com.meituan.passport.handler.resume;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends b<User> {
    public static ChangeQuickRedirect b;
    private String e;
    private String f;

    public a(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d557fe5fa6c74e859d0adb35cdb2508", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d557fe5fa6c74e859d0adb35cdb2508");
        } else {
            this.f = str;
        }
    }

    public a(FragmentActivity fragmentActivity, String str, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceac0f1fff0b31f3c7de4cde0a1c667c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceac0f1fff0b31f3c7de4cde0a1c667c");
            return;
        }
        this.f = str;
        this.e = str2;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bb2d5359c6c782e4c153b85690d944", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bb2d5359c6c782e4c153b85690d944");
        }
        if (apiException.code == 101155 && !TextUtils.isEmpty(apiException.data)) {
            p.a().a(fragmentActivity, apiException.code, this.f, "-999");
            p.a().c(fragmentActivity, this.f, "-999", apiException.code);
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            try {
                JsonObject asJsonObject = new JsonParser().parse(apiException.data).getAsJsonObject();
                if (asJsonObject.has("ticket")) {
                    String asString = asJsonObject.get("ticket").getAsString();
                    if (fragmentActivity != null && !fragmentActivity.isFinishing() && !TextUtils.isEmpty(asString)) {
                        Intent intent = new Intent("com.meituan.android.intent.action.passport_bind_phone");
                        intent.setPackage(fragmentActivity.getPackageName());
                        intent.putExtra("ticket", asString);
                        intent.putExtra("loginType", this.f);
                        intent.putExtra("currentPage", this.e);
                        intent.putExtra("code", apiException.code);
                        if (intent.resolveActivity(fragmentActivity.getPackageManager()) != null) {
                            fragmentActivity.startActivityForResult(intent, 11);
                            return rx.d.b();
                        }
                    }
                }
            } catch (Exception e) {
                com.meituan.passport.utils.m.a(e);
            }
        }
        return rx.d.a((Throwable) apiException);
    }
}
