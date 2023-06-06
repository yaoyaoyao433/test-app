package com.sankuai.waimai.ai.uat.context.global;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.ai.uat.context.a {
    public static ChangeQuickRedirect f;
    public List<WMUATRestaurantContext> g;
    public List<com.sankuai.waimai.ai.uat.context.a> h;
    public List<com.sankuai.waimai.ai.uat.context.search.a> i;
    public JSONArray j;

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(String str, Object obj) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4132a8b089d51936917e912ea2acc59d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4132a8b089d51936917e912ea2acc59d");
            return;
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final a.EnumC0684a a() {
        return a.EnumC0684a.WMUATContextGlobal;
    }
}
