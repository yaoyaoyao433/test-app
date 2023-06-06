package com.sankuai.waimai.business.page.home.head.theme;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.platform.dynamic.g;
import com.sankuai.waimai.platform.dynamic.j;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private boolean b;

    public b(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d918c82766ea6160f3861027f70ce8fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d918c82766ea6160f3861027f70ce8fa");
        }
    }

    public final void a(g gVar, Rect rect) {
        int height;
        Object[] objArr = {gVar, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24d9530e1de13fdbc15a109b88666a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24d9530e1de13fdbc15a109b88666a9");
        } else if (!this.b && "waimai-user-center-theme-area-style-2".equals(((j) gVar.G()).p) && gVar.i() != null && (height = gVar.i().getHeight()) > 0 && gVar.i().getTop() + (height / 2) < ((rect.bottom - rect.top) / 2) + rect.top) {
            this.b = true;
            HashMap hashMap = new HashMap();
            hashMap.put("show_gif_product_pic", Boolean.TRUE);
            gVar.a("product_pic_type_change", (Map<String, Object>) hashMap);
        }
    }
}
