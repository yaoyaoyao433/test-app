package com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b {
    public static ChangeQuickRedirect d;
    public float e;
    private Map<String, Object> k;
    private RecyclerView l;
    private com.sankuai.waimai.bussiness.order.confirm.a m;

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b, com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_mach_container_layout;
    }

    public c(Context context, String str, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(context, str, aVar);
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539cec765fe5078bbcd1e78650ffaea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539cec765fe5078bbcd1e78650ffaea2");
        } else {
            this.m = aVar;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b, com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44a75a554c768fc03bee882ceceb67b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44a75a554c768fc03bee882ceceb67b");
            return;
        }
        super.b();
        a(0, 0, 0, 0);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b
    public final void a(com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d155762f082d92ed38af9b9a54a9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d155762f082d92ed38af9b9a54a9f2");
        } else {
            super.a(cVar);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95636ffd6c6393f0e73bf893a08fb789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95636ffd6c6393f0e73bf893a08fb789");
            return;
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        if (this.e == f) {
            return;
        }
        this.e = f;
        if (f < 0.5d) {
            this.k.put("show_address", Boolean.FALSE);
        } else {
            this.k.put("show_address", Boolean.TRUE);
        }
        this.g.b("refresh_address_event", this.k);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d7ac037445c1a2eef0adde401c6d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d7ac037445c1a2eef0adde401c6d48");
            return;
        }
        super.a(str, map);
        char c = 65535;
        if (str.hashCode() == 1717103273 && str.equals("scroller_position_event")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        if (this.l == null) {
            this.l = this.m.R.a().b;
        }
        this.l.smoothScrollToPosition(0);
    }
}
