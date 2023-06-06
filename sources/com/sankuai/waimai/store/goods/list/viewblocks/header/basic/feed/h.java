package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class h extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect d;
    protected a e;
    protected BaseModuleDesc f;

    public h(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, BaseModuleDesc baseModuleDesc) {
        super(dVar);
        Object[] objArr = {dVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865ccad6fe8e37b491b214dd0834a7b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865ccad6fe8e37b491b214dd0834a7b6");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f21c79152a357bce1f462725600b89", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f21c79152a357bce1f462725600b89");
        }
        this.e = new a(viewGroup.getContext(), this.a);
        return this.e.d;
    }

    public void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d529dded8f6698422199147ec2685d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d529dded8f6698422199147ec2685d53");
            return;
        }
        this.f = baseModuleDesc;
        this.e.a(baseModuleDesc, i, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.store.goods.list.delegate.d e;

        private a(@NonNull Context context, com.sankuai.waimai.store.goods.list.delegate.d dVar) {
            super(context);
            Object[] objArr = {h.this, context, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a543087e8faafed18bbb292624934dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a543087e8faafed18bbb292624934dc");
            } else {
                this.e = dVar;
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4603ebe98fb1ab0a557cbe4a11e7d179", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4603ebe98fb1ab0a557cbe4a11e7d179");
            }
            HashMap hashMap = new HashMap();
            com.sankuai.waimai.store.goods.list.viewblocks.header.basic.event.handler.a aVar = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.event.handler.a(h.this.mContext, h.this.b, this.e);
            hashMap.put("supermarket_poi_coupon_button_click", aVar);
            hashMap.put("shop_header_logo_clicked", aVar);
            hashMap.put("shop_header_poi_info_clicked", aVar);
            hashMap.put("shop_header_logo_story_clicked", aVar);
            hashMap.put("shop_header_score_clicked", aVar);
            hashMap.put("shop_header_rootview_clicked", aVar);
            hashMap.put("shop_header_fruit_cut_clicked", aVar);
            hashMap.put("poi_header_coupon_receive_click", aVar);
            hashMap.put("poi_header_coupon_tab_dialog_click", aVar);
            hashMap.put("jump", new OnJsEventJump());
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1482aab8a8a14f1606de2cd8e92ce3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1482aab8a8a14f1606de2cd8e92ce3");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(h.this.b.f()));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, h.this.b.d());
            hashMap.put("stid", h.this.b.b.abExpInfo);
            hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(h.this.b.v()));
            return hashMap;
        }
    }
}
