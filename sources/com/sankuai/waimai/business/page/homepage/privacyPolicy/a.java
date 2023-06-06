package com.sankuai.waimai.business.page.homepage.privacyPolicy;

import android.content.Context;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public UserCenter b;
    public WMPrivacyPolicyDialog c;
    private Context d;
    private ai e;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f123b4b6a69fff35906945c177e2f4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f123b4b6a69fff35906945c177e2f4a");
            return;
        }
        this.d = context;
        Context context2 = this.d;
        Object[] objArr2 = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = ai.a;
        this.e = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64ac8edc967e427cd43bf51dff2a2f23", RobustBitConfig.DEFAULT_VALUE) ? (ai) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64ac8edc967e427cd43bf51dff2a2f23") : new ai(context2);
        this.b = UserCenter.getInstance(context);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400990c85d8194ba9ddd87522561cd47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400990c85d8194ba9ddd87522561cd47")).booleanValue() : this.e.a();
    }
}
