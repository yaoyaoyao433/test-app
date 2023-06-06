package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.drug.home.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends com.sankuai.waimai.store.drug.goods.list.base.e {
    public static ChangeQuickRedirect d;
    protected a e;
    protected BaseModuleDesc f;
    protected com.sankuai.waimai.mach.container.d g;

    public g(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, BaseModuleDesc baseModuleDesc) {
        super(cVar);
        Object[] objArr = {cVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858326950c3289154ee393aed78ef56f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858326950c3289154ee393aed78ef56f");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4bf5eaabae84c3bc41dd085fdbf2f75", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4bf5eaabae84c3bc41dd085fdbf2f75");
        }
        if (this.g != null) {
            this.e = new a(viewGroup.getContext(), this.a, this.g);
        } else {
            this.e = new a(viewGroup.getContext(), this.a);
        }
        return this.e.d;
    }

    public final void a(com.sankuai.waimai.mach.container.d dVar) {
        this.g = dVar;
    }

    public void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5bfa12b9c362106f54133c29094602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5bfa12b9c362106f54133c29094602");
            return;
        }
        this.f = baseModuleDesc;
        this.e.a(baseModuleDesc, i, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.store.drug.goods.list.delegate.c e;
        private com.sankuai.waimai.mach.container.d f;

        private a(@NonNull Context context, com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
            super(context);
            Object[] objArr = {g.this, context, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7d9f98be6dba9f5a99095114451afc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7d9f98be6dba9f5a99095114451afc");
            } else {
                this.e = cVar;
            }
        }

        private a(@NonNull g gVar, Context context, com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, com.sankuai.waimai.mach.container.d dVar) {
            this(context, cVar);
            Object[] objArr = {gVar, context, cVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8ef0ec613e7b0e46a98f5df3d54315", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8ef0ec613e7b0e46a98f5df3d54315");
            } else {
                this.f = dVar;
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57307fb9d9e4017cd9b8b860ed8cf589", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57307fb9d9e4017cd9b8b860ed8cf589");
            }
            HashMap hashMap = new HashMap();
            com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a aVar = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a(g.this.mContext, g.this.b, this.e);
            hashMap.put("supermarket_poi_coupon_button_click", aVar);
            hashMap.put("shop_header_logo_clicked", aVar);
            hashMap.put("shop_header_logo_story_clicked", aVar);
            hashMap.put("shop_header_score_clicked", aVar);
            hashMap.put("shop_header_rootview_clicked", aVar);
            hashMap.put("poi_header_coupon_receive_click", aVar);
            hashMap.put("drug_poi_header_coupon_receive_click", aVar);
            hashMap.put("poi_header_coupon_tab_dialog_click", aVar);
            hashMap.put("drug_poi_header_coupon_tab_dialog_click", aVar);
            hashMap.put("poi_click_foods_item", aVar);
            hashMap.put("poi_header_newuser_coupon_receive", aVar);
            hashMap.put("poi_load_shopcart_account", aVar);
            hashMap.put("jump", new OnJsEventJump());
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f39c9bf99df9108fc422e2eede1ada", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f39c9bf99df9108fc422e2eede1ada");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(g.this.b.g()));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, g.this.b.h());
            hashMap.put("stid", g.this.b.b.abExpInfo);
            hashMap.put("poi_type", Integer.valueOf(g.this.b.b.isNewPage));
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final com.sankuai.waimai.mach.container.d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa28f6896beb3c537464d521d41fcea", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.mach.container.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa28f6896beb3c537464d521d41fcea");
            }
            if (this.f != null) {
                return this.f;
            }
            return super.a();
        }
    }
}
