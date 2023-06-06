package com.sankuai.waimai.business.page.homepage.bubble;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends c {
    public static ChangeQuickRedirect c;

    public static f b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86c165c818a411e4163e6881a2e5d569", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86c165c818a411e4163e6881a2e5d569") : new f(context);
    }

    private f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617e50b765cd5af2937057aa9e5ff8de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617e50b765cd5af2937057aa9e5ff8de");
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf59d447ac501f207781f830625c015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf59d447ac501f207781f830625c015");
        } else if (this.b != null) {
            this.b.a();
        }
    }
}
