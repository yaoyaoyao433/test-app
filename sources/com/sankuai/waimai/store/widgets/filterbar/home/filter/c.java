package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.newwidgets.list.f<g, e> {
    public static ChangeQuickRedirect a;
    boolean b;

    public c(@NonNull e eVar) {
        super(eVar);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0b08723a6e28e123c140674bede60f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0b08723a6e28e123c140674bede60f");
        } else {
            this.b = false;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e604fc019cedd9d0d7e2bf77905ea4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e604fc019cedd9d0d7e2bf77905ea4");
        }
        switch (i) {
            case 100:
                return new i();
            case 101:
                this.b = true;
                return new f();
            case 102:
            default:
                return new h();
            case 103:
                this.b = true;
                return new f(2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea698fc5fe7af2e2cae9d36ca408266", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea698fc5fe7af2e2cae9d36ca408266")).intValue();
        }
        g h = h(i);
        if (h != null) {
            return h.b;
        }
        return 0;
    }
}
