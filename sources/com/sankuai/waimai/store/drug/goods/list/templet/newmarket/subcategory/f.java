package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.goods.list.templet.market.view.custom.BorderTextView;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends com.sankuai.waimai.store.newwidgets.list.g<e, d> {
    public static ChangeQuickRedirect b;
    private View a;
    private BorderTextView c;
    private ImageView d;
    private TextView e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_goods_list_tmp_v6_tab_normal_item;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(e eVar, final int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca3d43992baddecb6c0bca346e4149c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca3d43992baddecb6c0bca346e4149c");
        } else if (eVar != null) {
            if (eVar.b == 0) {
                if (eVar.a != null) {
                    this.c.setSelected(eVar.a.isSelected());
                    this.c.setRedPointStatus(((d) this.o).a(eVar));
                    this.c.setInText(eVar.a.name);
                }
                this.d.setVisibility(8);
                boolean isSelected = eVar.a.isSelected();
                Object[] objArr2 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dee1bf1c7ef3c110db78704b8eeeaaa1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dee1bf1c7ef3c110db78704b8eeeaaa1");
                } else if (isSelected) {
                    this.a.setBackground(com.sankuai.waimai.store.util.e.b(this.a.getContext(), (int) R.color.wm_sg_color_FFF8E1, (int) R.dimen.wm_sc_common_dimen_16));
                } else {
                    this.a.setBackgroundResource(R.drawable.wm_drug_goods_list_border_text_view_unselect_back_color);
                }
            } else {
                this.c.setSelected(false);
                this.c.setText(R.string.wm_sc_common_more);
                this.d.setVisibility(0);
                this.c.setRedPointStatus(((d) this.o).a(null));
            }
            this.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a851ad65b8d17bf99ce4b230c9d39574", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a851ad65b8d17bf99ce4b230c9d39574");
                    } else {
                        ((d) f.this.o).a(i, view);
                    }
                }
            });
            u.a(this.e, eVar.a.getSubName());
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac45b7e96fe1e1f563a9e53e2b52a896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac45b7e96fe1e1f563a9e53e2b52a896");
            return;
        }
        this.a = view.findViewById(R.id.ll_title_container);
        this.c = (BorderTextView) view.findViewById(R.id.tv_aggregation_select);
        this.d = (ImageView) view.findViewById(R.id.iv_aggregation_select);
        this.e = (TextView) view.findViewById(R.id.tv_sub_title);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33d18ecdf220075f6e0f083e627d4dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33d18ecdf220075f6e0f083e627d4dd6");
        } else {
            this.c.setSelectedBackground(0);
            this.c.setUnselectedBackground(0);
            this.c.setSelectedTextColor(R.color.wm_sg_color_FF8002);
            this.c.setUnselectedTextColor(R.color.wm_sg_color_575859);
            this.c.setRedPointPaddingTop(h.a(this.c.getContext(), 2.5f));
            this.c.setRedPointPaddingLeft(h.a(this.c.getContext(), 2.0f));
        }
        if (this.d != null) {
            this.d.setImageDrawable(com.sankuai.waimai.store.view.a.a(view.getContext(), R.dimen.wm_sc_common_dimen_8, R.dimen.wm_sc_common_dimen_5, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.DOWN));
        }
    }
}
