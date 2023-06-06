package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget.MemberLevelLogoView;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private MemberLevelLogoView b;
    @NonNull
    private h c;

    public c(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1af1f1eadf412bcafbb80759aeb07a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1af1f1eadf412bcafbb80759aeb07a");
        } else {
            this.c = hVar;
        }
    }

    public final boolean a(PoiMemberInfo poiMemberInfo) {
        Object[] objArr = {poiMemberInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41870538b1c578f91dd85dfdf4e2e940", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41870538b1c578f91dd85dfdf4e2e940")).booleanValue();
        }
        this.b.setMemberLevel(poiMemberInfo);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_dpp60ujr", this.b);
        bVar.a("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 1));
        bVar.a("poi_id", this.c.q().d());
        MemberLevelLogoView memberLevelLogoView = this.b;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = MemberLevelLogoView.a;
        if (PatchProxy.isSupport(objArr2, memberLevelLogoView, changeQuickRedirect2, false, "93befba4472948ba24ab8f1e1e5281a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, memberLevelLogoView, changeQuickRedirect2, false, "93befba4472948ba24ab8f1e1e5281a1");
        } else if (memberLevelLogoView.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) memberLevelLogoView.getContext(), bVar);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 1));
        hashMap.put("poi_id", this.c.q().d());
        MemberLevelLogoView memberLevelLogoView2 = this.b;
        memberLevelLogoView2.b = "b_kg39dn3c";
        memberLevelLogoView2.c = hashMap;
        return this.b.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00a2790f04ec592d1c51193fd8aeb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00a2790f04ec592d1c51193fd8aeb46");
            return;
        }
        super.onViewCreated();
        this.b = (MemberLevelLogoView) findView(R.id.poi_member_entrance);
    }
}
