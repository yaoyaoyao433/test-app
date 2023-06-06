package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.templet.market.view.custom.BorderTextView;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends com.sankuai.waimai.store.newwidgets.list.g<f, e> {
    public static ChangeQuickRedirect b;
    private View a;
    private BorderTextView c;
    private ImageView d;
    private TextView e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_goods_list_tmp_v6_tab_normal_item;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(f fVar, final int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c05bd58e046d19679dc83b43af7e3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c05bd58e046d19679dc83b43af7e3d6");
        } else if (fVar != null) {
            if (fVar.b == 0) {
                if (fVar.a != null) {
                    this.c.setSelected(fVar.a.isSelected());
                    this.c.setRedPointStatus(((e) this.o).a(fVar));
                    this.c.setInText(fVar.a.name);
                }
                this.d.setVisibility(8);
                boolean isSelected = fVar.a.isSelected();
                Object[] objArr2 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f4525cb0bc08abb201d27826398395c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f4525cb0bc08abb201d27826398395c");
                } else if (isSelected) {
                    this.a.setBackground(com.sankuai.waimai.store.util.e.b(this.a.getContext(), (int) R.color.wm_sg_color_FFF2CC, (int) R.dimen.wm_sc_common_dimen_4));
                } else {
                    this.a.setBackgroundResource(R.drawable.wm_sc_border_text_view_unselect_back_color);
                }
            } else {
                this.c.setSelected(false);
                this.c.setText(R.string.wm_sc_common_more);
                this.d.setVisibility(0);
                this.c.setRedPointStatus(((e) this.o).a(null));
            }
            this.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.g.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f69ba21f3d19ad44121ec32732b69b0b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f69ba21f3d19ad44121ec32732b69b0b");
                    } else {
                        ((e) g.this.o).a(i, view);
                    }
                }
            });
            u.a(this.e, fVar.a.getSubName());
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8f281d254f4025b092b19de7be7ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8f281d254f4025b092b19de7be7ca3");
            return;
        }
        this.a = view.findViewById(R.id.ll_title_container);
        this.c = (BorderTextView) view.findViewById(R.id.tv_aggregation_select);
        this.d = (ImageView) view.findViewById(R.id.iv_aggregation_select);
        this.e = (TextView) view.findViewById(R.id.tv_sub_title);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d8168bd971f81936c8571fccc665bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d8168bd971f81936c8571fccc665bc0");
        } else {
            this.c.setSelectedBackground(0);
            this.c.setUnselectedBackground(0);
            this.c.setSelectedTextColor(R.color.wm_sg_color_222426);
            this.c.setUnselectedTextColor(R.color.wm_sg_color_575859);
            this.c.setRedPointPaddingTop(com.sankuai.shangou.stone.util.h.a(this.c.getContext(), 2.5f));
            this.c.setRedPointPaddingLeft(com.sankuai.shangou.stone.util.h.a(this.c.getContext(), 2.0f));
        }
        if (this.d != null) {
            this.d.setImageDrawable(com.sankuai.waimai.store.view.a.a(view.getContext(), R.dimen.wm_sc_common_dimen_8, R.dimen.wm_sc_common_dimen_5, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.DOWN));
        }
    }
}
