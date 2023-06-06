package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.base.i;
import com.sankuai.waimai.store.im.poi.model.SGIMGoodsListData;
import com.sankuai.waimai.store.view.a;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends i implements com.sankuai.waimai.store.im.poi.listener.c {
    public static ChangeQuickRedirect i;
    public LinearLayout j;
    public TextView k;
    public TextView l;
    public boolean m;
    private com.sankuai.waimai.store.im.poi.adapter.a n;
    private RecyclerView o;
    private TextView p;
    private ImageView q;
    private SGIMGoodsListData r;

    public a(@NonNull Context context, String str, @NonNull com.sankuai.waimai.store.expose.v2.a aVar) {
        super(context, str, aVar);
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eace0152a733108d5f19131198f8d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eace0152a733108d5f19131198f8d34");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1fbf237564adbf21ffdb2c90457c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1fbf237564adbf21ffdb2c90457c87");
            return;
        }
        super.onViewCreated();
        this.o = (RecyclerView) findView(R.id.wm_sc_im_common_good_list);
        this.p = (TextView) findView(R.id.wm_sc_im_see_all_good);
        this.q = (ImageView) findView(R.id.iv_sc_im_see_all_good);
        this.j = (LinearLayout) findView(R.id.ll_sc_im_good_see_all);
        this.n = new com.sankuai.waimai.store.im.poi.adapter.a(this.mContext, this, this);
        this.n.e = this.c;
        RecyclerView recyclerView = this.o;
        final Context context = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.sankuai.waimai.store.im.poi.block.SGIMGoodListInfoBlock$1
            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.o.setAdapter(this.n);
        this.q.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.mContext, (int) R.dimen.wm_sc_common_dimen_8, (int) R.dimen.wm_sc_common_dimen_4, c() ? R.color.wm_sg_color_999999 : R.color.wm_sg_color_FF8000, a.EnumC1338a.DOWN));
        this.k = (TextView) findView(R.id.sg_im_related_title);
        this.l = (TextView) findView(R.id.sg_im_related_tips);
        View findView = findView(R.id.ll_praise_root);
        if (findView != null) {
            a(findView);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20565660a6aba79ddae3754f5e4183e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20565660a6aba79ddae3754f5e4183e4")).booleanValue() : com.sankuai.waimai.store.im.util.b.a(this.c);
    }

    public final void a(SGIMGoodsListData sGIMGoodsListData, boolean z) {
        Object[] objArr = {sGIMGoodsListData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eddf5412d0c898f243283f27aaaa9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eddf5412d0c898f243283f27aaaa9db");
        } else if (sGIMGoodsListData == null || sGIMGoodsListData.mProductInfo == null || com.sankuai.shangou.stone.util.a.b(sGIMGoodsListData.mProductInfo.spus)) {
        } else {
            try {
                com.sankuai.waimai.store.manager.judas.b.b(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_0rq5kpgr_mv").a();
            } catch (Throwable unused) {
            }
            this.r = sGIMGoodsListData;
            this.n.f = sGIMGoodsListData.msgId;
            if (!sGIMGoodsListData.isShowMore && com.sankuai.shangou.stone.util.a.a((List) sGIMGoodsListData.mProductInfo.spus) > 3) {
                this.n.a(com.sankuai.shangou.stone.util.a.a(sGIMGoodsListData.mProductInfo.spus, 0, 3));
                u.a(this.j);
                if (c()) {
                    this.o.setPadding(0, 0, 0, 0);
                }
            } else {
                this.n.a(sGIMGoodsListData.mProductInfo.spus);
                u.c(this.j);
                if (c()) {
                    this.o.setPadding(0, 0, 0, h.a(this.mContext, 12.0f));
                }
            }
            if (c()) {
                SGIMGoodsListData.IMProductInfo iMProductInfo = sGIMGoodsListData.mProductInfo;
                Object[] objArr2 = {iMProductInfo};
                ChangeQuickRedirect changeQuickRedirect2 = i;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0d402c3b4e91d0cfb8c644fb8b1918d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0d402c3b4e91d0cfb8c644fb8b1918d");
                } else if (this.l != null && this.k != null) {
                    if (!t.a(iMProductInfo.productsRecommendTip)) {
                        u.a(this.l, iMProductInfo.productsRecommendTip);
                    }
                    if (!t.a(iMProductInfo.productsRecommendTitle)) {
                        u.a(this.k, iMProductInfo.productsRecommendTitle);
                    }
                }
            }
            if (z) {
                a(sGIMGoodsListData.mPoiId, NumberUtils.parseLong(sGIMGoodsListData.msgId, 0L), sGIMGoodsListData.robotPraiseOperation);
            } else {
                b();
            }
        }
    }

    public final void a(SGIMGoodsListData sGIMGoodsListData) {
        Object[] objArr = {sGIMGoodsListData};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6066df66cb7c708ec3eb941bbd1416e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6066df66cb7c708ec3eb941bbd1416e3");
        } else if (sGIMGoodsListData == null || sGIMGoodsListData.mProductInfo == null || com.sankuai.shangou.stone.util.a.b(sGIMGoodsListData.mProductInfo.spus)) {
        } else {
            if (sGIMGoodsListData.isShowMore) {
                this.n.a(sGIMGoodsListData.mProductInfo.spus);
                u.c(this.j);
                if (c()) {
                    this.o.setPadding(0, 0, 0, h.a(this.mContext, 12.0f));
                }
            }
            a(sGIMGoodsListData.mPoiId, NumberUtils.parseLong(sGIMGoodsListData.msgId, 0L), sGIMGoodsListData.robotPraiseOperation);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.c
    public final void a(SGIMGoodsListData.IMProductInfo.IMProductSpu iMProductSpu) {
        Object[] objArr = {iMProductSpu};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc18852f0836f9468168614bfb78af26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc18852f0836f9468168614bfb78af26");
        } else if (iMProductSpu == null || t.a(iMProductSpu.poiId) || t.a(iMProductSpu.spuId)) {
        } else {
            com.sankuai.waimai.store.im.util.b.a(iMProductSpu.spuId, iMProductSpu.poiId, this.e, this.mContext);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Object obj, int i2, Map<String, Object> map, View view) {
        String str;
        String str2;
        Object[] objArr = {obj, Integer.valueOf(i2), map, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e16ee2d9e00dfbafd943ace9e57518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e16ee2d9e00dfbafd943ace9e57518");
        } else if (this.b == null) {
        } else {
            if (c()) {
                str = "b_waimai_3vrm48uu_mv";
                com.sankuai.waimai.store.im.util.b.a(map, this.c, p.a(this.r) ? -999 : this.r.subType);
            } else {
                str = "b_waimai_7sj2l2xu_mv";
            }
            map.put("message_id", this.r.msgId);
            if (this.m) {
                str2 = "c_waimai_4pe066t1";
                map.put("tag", com.sankuai.waimai.store.im.util.b.a(true, this.d != null ? this.d.groupId : "-999"));
            } else {
                str2 = com.sankuai.waimai.business.im.utils.d.a;
                map.put("tag", com.sankuai.waimai.store.im.util.b.a(false, "-999"));
            }
            com.sankuai.waimai.store.expose.v2.entity.c cVar = new com.sankuai.waimai.store.expose.v2.entity.c(str2, str, view);
            cVar.e = obj + CommonConstant.Symbol.UNDERLINE + this.r.msgId;
            cVar.b(map);
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b, cVar);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Map<String, Object> map) {
        String str;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2899a7a53f2da95a305eab4cd887f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2899a7a53f2da95a305eab4cd887f7f");
            return;
        }
        if (c()) {
            str = "b_waimai_3vrm48uu_mc";
            com.sankuai.waimai.store.im.util.b.a(map, this.c, p.a(this.r) ? -999 : this.r.subType);
        } else {
            str = "b_waimai_7sj2l2xu_mc";
        }
        map.put("message_id", this.r.msgId);
        if (this.m) {
            map.put("tag", com.sankuai.waimai.store.im.util.b.a(true, this.d != null ? this.d.groupId : "-999"));
            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", str).b(map).a();
            return;
        }
        map.put("tag", com.sankuai.waimai.store.im.util.b.a(false, "-999"));
        com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, str).b(map).a();
    }
}
