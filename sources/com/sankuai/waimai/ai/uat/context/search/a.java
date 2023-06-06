package com.sankuai.waimai.ai.uat.context.search;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.ai.uat.context.a {
    public static ChangeQuickRedirect f;
    public List<String> g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3662b1eb3b549337ff6eb68dce4d914b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3662b1eb3b549337ff6eb68dce4d914b");
        } else {
            this.g = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fb20a4ef5aa3e293f38eedd25d7232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fb20a4ef5aa3e293f38eedd25d7232");
        } else if ((obj instanceof String) && "query_key".equals(str)) {
            this.g.add((String) obj);
        }
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final a.EnumC0684a a() {
        return a.EnumC0684a.WMUATContextSearch;
    }
}
