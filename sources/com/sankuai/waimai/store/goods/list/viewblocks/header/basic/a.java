package com.sankuai.waimai.store.goods.list.viewblocks.header.basic;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.goods.list.base.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d {
    public static ChangeQuickRedirect c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    private com.sankuai.waimai.store.expose.v2.entity.b g;

    public a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41468695f28521f82f853515cf96d887", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41468695f28521f82f853515cf96d887");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b781b1a4280472b882fb530f5ae69a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b781b1a4280472b882fb530f5ae69a") : layoutInflater.inflate(R.layout.wm_sc_goods_list_layout_header_item_board, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed70b93cd543f189829d0d47496faa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed70b93cd543f189829d0d47496faa9");
            return;
        }
        super.onViewCreated();
        this.f = (ImageView) findView(R.id.wm_sc_goods_list_header_item_board_icon);
        this.d = (TextView) findView(R.id.wm_sc_goods_list_header_item_board_sub_description);
        this.e = (ImageView) findView(R.id.wm_sc_goods_list_layout_header_item_board_arrow);
        this.e.setBackground(com.sankuai.waimai.store.view.a.a(getContext(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_7, (int) R.color.wm_sg_color_c9c5c2, a.EnumC1338a.RIGHT));
        this.g = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_hvz2d6r3_mv", this.mView);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.g);
        }
    }

    public final void a(final Poi.RecommendRank recommendRank) {
        Object[] objArr = {recommendRank};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec0bdaabb5d23b182a9cf1b2bc778b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec0bdaabb5d23b182a9cf1b2bc778b3");
        } else if (recommendRank == null) {
            this.mView.setVisibility(8);
        } else {
            this.mView.setVisibility(0);
            if (recommendRank.icon != null) {
                this.f.setVisibility(0);
                b.C0608b a = m.a(recommendRank.icon);
                a.b = getContext();
                a.a(this.f);
            } else {
                this.f.setVisibility(8);
            }
            this.d.setText(recommendRank.rank);
            if (TextUtils.isEmpty(recommendRank.url)) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3974280cbab3a12f8c5478392b63990", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3974280cbab3a12f8c5478392b63990");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(a.this.mContext, "b_waimai_hvz2d6r3_mc").a("poi_id", a.this.a.d().b.getOfficialPoiId()).a("stid", a.this.a.d().b.abExpInfo).a();
                        com.sankuai.waimai.store.router.d.a(view.getContext(), recommendRank.url);
                    }
                });
            }
            this.g.a("poi_id", this.a.d().b.getOfficialPoiId()).a("stid", this.a.d().b.abExpInfo);
        }
    }
}
