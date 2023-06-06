package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.im.base.h;
import com.sankuai.waimai.store.im.poi.model.SGIMRelatedCouponListData;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends h {
    public static ChangeQuickRedirect g;
    public com.sankuai.waimai.store.im.poi.adapter.c h;
    public SGIMRelatedCouponListData i;
    public TextView j;
    public TextView k;
    public boolean l;
    private RecyclerView m;

    public d(@NonNull Context context, @NonNull com.sankuai.waimai.store.expose.v2.a aVar, boolean z) {
        super(context, aVar);
        Object[] objArr = {context, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b28c568dc1d6ff8d274bd58d785ba3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b28c568dc1d6ff8d274bd58d785ba3d");
        } else {
            this.l = z;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b721de408765bf8c3847ba6300aebb8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b721de408765bf8c3847ba6300aebb8b");
            return;
        }
        super.onViewCreated();
        this.m = (RecyclerView) findView(R.id.wm_sc_im_coupon_list);
        this.h = new com.sankuai.waimai.store.im.poi.adapter.c(this.mContext, this, a());
        RecyclerView recyclerView = this.m;
        final Context context = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.sankuai.waimai.store.im.poi.block.SGIMRelatedCouponListBlock$1
            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.m.setAdapter(this.h);
        this.j = (TextView) findView(R.id.sg_im_related_title);
        this.k = (TextView) findView(R.id.sg_im_related_tips);
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Object obj, int i, Map<String, Object> map, View view) {
        String str;
        Object[] objArr = {obj, Integer.valueOf(i), map, view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a76ab2a4c1aeb00b974bcc2fdf5526c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a76ab2a4c1aeb00b974bcc2fdf5526c");
        } else if (this.b == null || map == null) {
        } else {
            if (this.l) {
                str = "c_waimai_4pe066t1";
                map.put("tag", com.sankuai.waimai.store.im.util.b.a(true, this.d != null ? this.d.groupId : "-999"));
            } else {
                str = com.sankuai.waimai.business.im.utils.d.a;
                map.put("tag", com.sankuai.waimai.store.im.util.b.a(false, ""));
            }
            map.put("message_id", this.i.msgId);
            com.sankuai.waimai.store.im.util.b.a(map, this.c, p.a(this.i) ? -999 : this.i.subType);
            com.sankuai.waimai.store.expose.v2.entity.c cVar = new com.sankuai.waimai.store.expose.v2.entity.c(str, "b_waimai_tr31geak_mv", view);
            cVar.e = obj + CommonConstant.Symbol.UNDERLINE + this.i.msgId;
            cVar.b(map);
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b, cVar);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6363db20edc35b5ca6e4e3267dca86e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6363db20edc35b5ca6e4e3267dca86e7");
            return;
        }
        com.sankuai.waimai.store.im.util.b.a(map, this.c, p.a(this.i) ? -999 : this.i.subType);
        map.put("message_id", this.i.msgId);
        if (this.l) {
            map.put("tag", com.sankuai.waimai.store.im.util.b.a(true, this.d != null ? this.d.groupId : "-999"));
            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", "b_waimai_tr31geak_mc").b(map).a();
            return;
        }
        map.put("tag", com.sankuai.waimai.store.im.util.b.a(false, ""));
        com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_tr31geak_mc").b(map).a();
    }
}
