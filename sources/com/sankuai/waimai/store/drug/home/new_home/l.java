package com.sankuai.waimai.store.drug.home.new_home;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends com.sankuai.waimai.store.drug.home.newp.poilist.viewholders.a {
    public static ChangeQuickRedirect a;
    static final boolean b = com.sankuai.waimai.store.config.d.h().a("optimize/drug_home_poi_recycle_reset", false);
    j c;
    com.sankuai.waimai.mach.recycler.c d;
    SCBaseActivity e;
    private a g;

    public l(View view, a aVar, j jVar, SCBaseActivity sCBaseActivity) {
        super(view);
        Object[] objArr = {view, aVar, jVar, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d417467cb3b2ca8994667253bdb60b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d417467cb3b2ca8994667253bdb60b");
            return;
        }
        this.e = sCBaseActivity;
        this.g = aVar;
        this.c = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65392fa9dcc6b265ac1ed07340feb52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65392fa9dcc6b265ac1ed07340feb52");
            return;
        }
        Mach l = this.d.l();
        if (l != null) {
            l.registerJsEventCallback(m.a(this));
        }
    }

    public static /* synthetic */ void a(l lVar, String str, Map map) {
        Object[] objArr = {lVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2d3a7d7eab83e70cefacc25c66b3592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2d3a7d7eab83e70cefacc25c66b3592");
        } else if ("expose_group_reset_event".equals(str)) {
            Object obj = map != null ? map.get("group") : null;
            if (obj instanceof String) {
                com.sankuai.waimai.store.expose.v2.b.a().a(lVar.e, (String) obj);
            }
        } else {
            lVar.g.a(str, map);
        }
    }
}
