package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.dialogs.UserPhoneBindedErrorFragment;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends b<User> {
    public static ChangeQuickRedirect b;
    private a e;
    private String f;
    private String g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        rx.d<User> a(rx.d<Integer> dVar);
    }

    public g(FragmentActivity fragmentActivity, a aVar, String str, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744dea9f72bbe0773c406eb3a96caf88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744dea9f72bbe0773c406eb3a96caf88");
            return;
        }
        this.e = aVar;
        this.f = str2;
        this.g = str;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<User> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db48f485d1027d3e481540580fff703e", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db48f485d1027d3e481540580fff703e");
        }
        if (apiException.code == 101055 && this.e != null) {
            p.a().a(fragmentActivity, apiException.code, this.g, this.f);
            p.a().c(fragmentActivity, this.g, this.f, apiException.code);
            p.a().b(fragmentActivity, this.g, this.f, apiException.code);
            return this.e.a(UserPhoneBindedErrorFragment.a(apiException.getMessage(), fragmentActivity));
        }
        return rx.d.a((Throwable) apiException);
    }
}
