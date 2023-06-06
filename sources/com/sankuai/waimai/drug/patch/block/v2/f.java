package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.model.a;
import com.sankuai.waimai.store.drug.newwidgets.SGAutoSizeTextView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    TextView d;
    SGAutoSizeTextView e;
    public com.sankuai.waimai.drug.patch.adapter.a f;
    final com.sankuai.waimai.drug.patch.contract.a g;
    View h;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a i;

    public f(@NonNull @NotNull Context context, com.sankuai.waimai.drug.patch.contract.a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55a70a260264602ab09877c60e03c14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55a70a260264602ab09877c60e03c14");
            return;
        }
        this.g = aVar;
        this.i = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb4ece336c761ae6d98f3ac5ae1051d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb4ece336c761ae6d98f3ac5ae1051d") : layoutInflater.inflate(R.layout.wm_drug_shopcart_patchwork_layout_combination_new, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eadd88bb814ca0c00aaca51ea3ed04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eadd88bb814ca0c00aaca51ea3ed04a");
            return;
        }
        View view = this.mView;
        SCRecyclerView sCRecyclerView = (SCRecyclerView) view.findViewById(R.id.combination_layout_spu_list);
        this.f = new com.sankuai.waimai.drug.patch.adapter.a(this.i, this.g) { // from class: com.sankuai.waimai.drug.patch.block.v2.f.1
            @Override // com.sankuai.waimai.drug.patch.adapter.a
            public final int a() {
                return R.layout.wm_drug_shopcart_patchwork_layout_combination_list_item_new;
            }
        };
        sCRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        sCRecyclerView.setAdapter(this.f);
        this.b = (TextView) view.findViewById(R.id.wm_st_shopcart_patchwork_layout_combination_buy);
        this.c = (TextView) view.findViewById(R.id.wm_st_shopcart_patchwork_layout_combination_origin_price);
        this.e = (SGAutoSizeTextView) view.findViewById(R.id.wm_st_shopcart_patchwork_layout_combination_price);
        this.d = (TextView) view.findViewById(R.id.wm_st_shopcart_patchwork_layout_tag_detail);
        this.h = view.findViewById(R.id.base_line);
        this.b.setBackground(com.sankuai.waimai.store.util.e.a(view.getContext(), new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_24));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(com.sankuai.waimai.drug.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09bb9952515f3b69bef74248af0dfe48", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09bb9952515f3b69bef74248af0dfe48");
        }
        List<a.C0936a> list = aVar.b;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        for (a.C0936a c0936a : list) {
            if (c0936a != null && !TextUtils.isEmpty(c0936a.b)) {
                return c0936a.b;
            }
        }
        return "";
    }
}
