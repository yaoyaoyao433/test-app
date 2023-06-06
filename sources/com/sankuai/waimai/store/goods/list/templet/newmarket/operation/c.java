package com.sankuai.waimai.store.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
import com.sankuai.waimai.store.goods.list.viewblocks.header.widget.MemberLevelLogoView;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private MemberLevelLogoView b;
    @NonNull
    private e c;

    public c(@NonNull Context context, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca7e6b2f471b36c0b4951291c3ff1f2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca7e6b2f471b36c0b4951291c3ff1f2c");
        } else {
            this.c = eVar;
        }
    }

    public final boolean a(PoiMemberInfo poiMemberInfo) {
        Object[] objArr = {poiMemberInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e55a340126a783a7c4ac70a2a5e0bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e55a340126a783a7c4ac70a2a5e0bd")).booleanValue();
        }
        this.b.setMemberLevel(poiMemberInfo);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_dpp60ujr", this.b);
        bVar.a("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 1));
        bVar.a("poi_id", this.c.x().d());
        this.b.a(bVar);
        HashMap hashMap = new HashMap();
        hashMap.put("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 1));
        hashMap.put("poi_id", this.c.x().d());
        this.b.a("b_kg39dn3c", hashMap);
        return this.b.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d051c794ccc4f356c6a264953906ab8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d051c794ccc4f356c6a264953906ab8d");
            return;
        }
        super.onViewCreated();
        this.b = (MemberLevelLogoView) findView(R.id.poi_member_entrance);
    }
}
