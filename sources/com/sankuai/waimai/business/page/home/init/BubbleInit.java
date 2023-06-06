package com.sankuai.waimai.business.page.home.init;

import android.app.Application;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BubbleInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "BubbleInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27839e7cd65076ff6afbbeb1e6b7b2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27839e7cd65076ff6afbbeb1e6b7b2d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.helper.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "e3fd2806291bd3152a866f216e67a95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "e3fd2806291bd3152a866f216e67a95e");
            return;
        }
        Map a = com.sankuai.waimai.business.page.home.helper.a.a();
        if (a != null) {
            Iterator it = a.entrySet().iterator();
            while (it.hasNext()) {
                if (c.b() > ((NavigateItem.a) ((Map.Entry) it.next()).getValue()).g * 1000) {
                    it.remove();
                }
            }
            com.sankuai.waimai.business.page.home.helper.a.a(a);
        }
    }
}
