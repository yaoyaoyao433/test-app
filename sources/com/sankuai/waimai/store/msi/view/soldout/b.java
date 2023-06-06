package com.sankuai.waimai.store.msi.view.soldout;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.d;
import com.sankuai.waimai.store.util.h;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends g<GoodsSpu, e> implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect a;
    private a b;
    private final View c;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
        GoodsSpu goodsSpu2 = goodsSpu;
        Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62dbfdb7f5a5495bc4e3069d713756f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62dbfdb7f5a5495bc4e3069d713756f");
        } else if (goodsSpu2 == null) {
        } else {
            ((e) this.o).a(goodsSpu2, i, this.b);
            this.b.a(goodsSpu2, i);
        }
    }

    public b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc718ac367dee69427b6162b58b3be40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc718ac367dee69427b6162b58b3be40");
        } else {
            this.c = view;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        this.b = (a) view;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e52c20a13c529ded6654c532a2874164", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e52c20a13c529ded6654c532a2874164");
        }
        a aVar = new a(viewGroup.getContext());
        aVar.setPoiHelper(((e) this.o).g());
        aVar.setActionCallback(this);
        return aVar;
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad9eff06005c6d2cce1f7391a59eea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad9eff06005c6d2cce1f7391a59eea7");
            return;
        }
        ((e) this.o).b(goodsSpu, i);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = ((e) this.o).f();
        com.sankuai.waimai.store.router.g.a(this.b.getContext(), goodsSpu, ((e) this.o).g().b, hVar);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(final GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa93ab8a862b3b983d6f8db8297e95f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa93ab8a862b3b983d6f8db8297e95f");
            return;
        }
        ((e) this.o).a(goodsSpu, this.b.getPosition());
        final com.sankuai.waimai.store.goods.subscribe.a a2 = com.sankuai.waimai.store.goods.subscribe.a.a();
        final View view = this.c;
        final Activity activity = (Activity) this.b.getContext();
        final long f = ((e) this.o).g().f();
        final String h = ((e) this.o).g().h();
        final GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
        Object[] objArr2 = {view, activity, new Long(f), h, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.subscribe.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b997177daab296d7e79b9e8d03c132b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b997177daab296d7e79b9e8d03c132b3");
        } else {
            com.sankuai.waimai.store.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.goods.subscribe.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5688f6f787504495caaaf3bcf6bff8a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5688f6f787504495caaaf3bcf6bff8a5");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("wm_poi_id", String.valueOf(f));
                    hashMap.put("spu_id", String.valueOf(goodsSpu.getId()));
                    hashMap.put("spu_name", goodsSpu.getName());
                    hashMap.put("sku_id", String.valueOf(goodsSku.getSkuId()));
                    final Dialog a3 = d.a(activity);
                    com.sankuai.waimai.store.g.a(activity.getClass().getSimpleName() + activity.hashCode()).c(hashMap, new k<SpuSubscribeResponse>() { // from class: com.sankuai.waimai.store.goods.subscribe.a.1.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            SpuSubscribeResponse spuSubscribeResponse = (SpuSubscribeResponse) obj;
                            Object[] objArr4 = {spuSubscribeResponse};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f3df11f226f6ffd5e0893a78fa74a5a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f3df11f226f6ffd5e0893a78fa74a5a");
                                return;
                            }
                            am.a(view, spuSubscribeResponse.subTitle);
                            a2.b.a(f, h, goodsSpu.getId(), goodsSku.getSkuId(), 2);
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr4 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "204472d2d6933b2a8c04fbdd9c081f53", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "204472d2d6933b2a8c04fbdd9c081f53");
                            } else {
                                am.a(view, activity.getString(R.string.wm_sg_spu_subscribe_failed));
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void b() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b751f2dc526dbd5cdcdf224376325a7f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b751f2dc526dbd5cdcdf224376325a7f");
                            } else {
                                d.a(a3);
                            }
                        }
                    });
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a extends InnerCellView {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final int getLayoutId() {
            return R.layout.wm_st_poi_market_sold_out_item;
        }

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad95f62a1106c3edfb23a393f585ead9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad95f62a1106c3edfb23a393f585ead9");
            }
        }

        public final int getPosition() {
            return this.ag;
        }
    }
}
