package com.sankuai.waimai.business.page.homepage.view.tab;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.view.TitleIndicator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private TitleIndicator b;

    public a(@NonNull TitleIndicator titleIndicator) {
        Object[] objArr = {titleIndicator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c0f745910a20c5f2dfb65c1aed6698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c0f745910a20c5f2dfb65c1aed6698");
        } else {
            this.b = titleIndicator;
        }
    }

    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a95081103d086ba57a11fc7116be9dc", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a95081103d086ba57a11fc7116be9dc") : this.b.b(i);
    }
}
