package com.sankuai.waimai.platform.widget.filterbar.implement.injection;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static b a(Context context, Object obj) {
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfa49f2a4ee0be9b2caf77ef33518e26", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfa49f2a4ee0be9b2caf77ef33518e26") : new com.sankuai.waimai.platform.widget.filterbar.implement.storage.a(context, obj);
    }

    public static b a(Context context, c cVar, Object obj) {
        Object[] objArr = {context, cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e05042a486998ea13ba466fd1e4805b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e05042a486998ea13ba466fd1e4805b") : new com.sankuai.waimai.platform.widget.filterbar.implement.storage.a(context, cVar, obj);
    }
}
