package com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    final com.sankuai.waimai.bussiness.order.confirm.adapter.a e;
    ImageView f;
    AdditionalBargain g;
    private LinearLayout h;
    private TextView i;
    private TextView j;
    private StatisticsRecyclerView k;
    private LinearLayout l;
    private ImageView m;
    private View n;
    private f o;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_additional_bargain;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c611de243521ea05729e0995e8edf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c611de243521ea05729e0995e8edf4");
            return;
        }
        this.o = fVar;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_additional_bargain_item_left_width);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_confirm_additional_bargain_item_space_width);
        this.e = new com.sankuai.waimai.bussiness.order.confirm.adapter.a(context, this.o);
        this.k.setAdapter(this.e);
        this.k.addItemDecoration(new com.sankuai.waimai.bussiness.order.confirm.adapter.d(dimensionPixelOffset2, dimensionPixelOffset));
        this.k.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.b.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efc726901b92b3aa32607b8f5a5bd5ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efc726901b92b3aa32607b8f5a5bd5ee");
                } else {
                    super.onScrollStateChanged(recyclerView, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c65368d72af32e4a2a0b91fefdd7f006", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c65368d72af32e4a2a0b91fefdd7f006");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (i > 0 && findLastCompletelyVisibleItemPosition == linearLayoutManager.getItemCount() - 1 && b.this.f.getVisibility() == 0) {
                    b.this.f.setVisibility(8);
                } else if (8 == b.this.f.getVisibility()) {
                    b.this.f.setVisibility(0);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9db02ae1889a22f0814ba6d46b2acee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9db02ae1889a22f0814ba6d46b2acee");
            return;
        }
        super.b();
        this.h = (LinearLayout) this.b.findViewById(R.id.layout_additional_bargain);
        this.f = (ImageView) this.b.findViewById(R.id.additional_bargain_item_cover);
        this.l = (LinearLayout) this.b.findViewById(R.id.additional_title_ll);
        this.i = (TextView) this.h.findViewById(R.id.additional_title);
        this.j = (TextView) this.h.findViewById(R.id.additional_description);
        this.m = (ImageView) this.h.findViewById(R.id.additional_icon);
        this.n = this.b.findViewById(R.id.divider_view);
        this.k = (StatisticsRecyclerView) this.h.findViewById(R.id.additional_recycler_view);
        this.k.setLayoutManager(new LinearLayoutManager(this.c, 0, false));
    }

    public final void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae0cfed5e44c6fd6d3cc5bd900f4d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae0cfed5e44c6fd6d3cc5bd900f4d81");
            return;
        }
        this.g = cVar.b;
        if (this.g != null) {
            this.h.setVisibility(0);
            this.n.setVisibility(cVar.a ? 0 : 8);
            if (!TextUtils.isEmpty(this.g.iconUrl)) {
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = this.c;
                a.c = this.g.iconUrl;
                a.a(this.m);
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.g.title) || TextUtils.isEmpty(this.g.description)) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(0);
                ah.a(this.i, this.g.title);
                ah.a(this.j, this.g.description);
            }
            if (!com.sankuai.waimai.foundation.utils.d.a(this.g.bargainList)) {
                this.h.setVisibility(0);
                this.e.a(this.g.bargainList);
                return;
            }
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(8);
        this.n.setVisibility(8);
    }
}
