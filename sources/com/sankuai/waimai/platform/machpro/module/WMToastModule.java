package com.sankuai.waimai.platform.machpro.module;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMToastModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMToastModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34558fc90d300c25e18d4bd14f6729ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34558fc90d300c25e18d4bd14f6729ac");
        }
    }

    @JSMethod(methodName = "show")
    public void show(String str, Integer num, Boolean bool) {
        Context context;
        Object[] objArr = {str, num, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1943dc90384b2a05ea94d4c5a8e0b51a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1943dc90384b2a05ea94d4c5a8e0b51a");
            return;
        }
        if (getMachContext() != null && getMachContext().getContext() != null) {
            context = getMachContext().getContext();
        } else {
            context = b.a;
        }
        if (bool == null || !bool.booleanValue()) {
            ae.b(context, str);
        } else {
            ae.a((Activity) context, str);
        }
    }
}
