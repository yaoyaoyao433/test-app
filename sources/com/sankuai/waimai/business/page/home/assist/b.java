package com.sankuai.waimai.business.page.home.assist;

import android.app.Activity;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends c {
    public static ChangeQuickRedirect v;
    private boolean w;

    public b(Activity activity) {
        super(activity, AppUtil.generatePageInfoKey(activity));
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0989b93956e216e8cb7421c6320c4d64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0989b93956e216e8cb7421c6320c4d64");
            return;
        }
        this.w = false;
        this.B = 2;
    }
}
