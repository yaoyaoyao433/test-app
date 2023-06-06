package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.adapter.NPSMultiChoiceViewAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a {
    public static ChangeQuickRedirect u;
    private RecyclerView A;
    List<String> v;
    NPSMultiChoiceViewAdapter w;

    public f(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f84ecb1187f719bc3d338fdfcb7d61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f84ecb1187f719bc3d338fdfcb7d61");
        } else {
            this.v = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1945114c88efbc4ecd39689e8b96c983", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1945114c88efbc4ecd39689e8b96c983");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_nps_multi_choice_block, viewGroup, false);
        super.a(inflate);
        this.w = new NPSMultiChoiceViewAdapter(f());
        this.A = (RecyclerView) inflate.findViewById(R.id.multi_choice_container);
        this.A.setAdapter(this.w);
        ((aq) this.A.getItemAnimator()).setSupportsChangeAnimations(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(f(), 2);
        this.A.setLayoutManager(gridLayoutManager);
        gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.f.1
            public static ChangeQuickRedirect b;
            public int c = 1;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9187d4eaeba05ce7fdd8101daef40c42", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9187d4eaeba05ce7fdd8101daef40c42")).intValue();
                }
                switch (f.this.w.getItemViewType(i)) {
                    case 0:
                    case 2:
                        this.c = 2;
                        break;
                    case 1:
                        this.c = 1;
                        break;
                }
                return this.c;
            }
        };
        this.A.addItemDecoration(new com.sankuai.waimai.bussiness.order.base.feedback.adapter.a(this.y));
        return inflate;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f3408b9b6936d7385a1042dfcfb43f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f3408b9b6936d7385a1042dfcfb43f");
            return;
        }
        super.a(bVar);
        this.v.clear();
        if (com.sankuai.waimai.foundation.utils.d.a(bVar.f)) {
            return;
        }
        NPSMultiChoiceViewAdapter nPSMultiChoiceViewAdapter = this.w;
        List<c.C0753c> list = bVar.f;
        String str = bVar.b;
        boolean d = d(bVar);
        Object[] objArr2 = {list, str, Byte.valueOf(d ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = NPSMultiChoiceViewAdapter.a;
        if (PatchProxy.isSupport(objArr2, nPSMultiChoiceViewAdapter, changeQuickRedirect2, false, "5873cfec7e98a23086d600c8c929d8a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nPSMultiChoiceViewAdapter, changeQuickRedirect2, false, "5873cfec7e98a23086d600c8c929d8a8");
        } else {
            nPSMultiChoiceViewAdapter.d = d;
            nPSMultiChoiceViewAdapter.c = 0;
            nPSMultiChoiceViewAdapter.e = str;
            nPSMultiChoiceViewAdapter.b.clear();
            if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                nPSMultiChoiceViewAdapter.b.addAll(list);
                nPSMultiChoiceViewAdapter.a();
            }
            nPSMultiChoiceViewAdapter.notifyDataSetChanged();
        }
        this.w.f = new NPSMultiChoiceViewAdapter.a() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.feedback.adapter.NPSMultiChoiceViewAdapter.a
            public final void a(View view, int i, c.C0753c c0753c) {
                Object[] objArr3 = {view, Integer.valueOf(i), c0753c};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b349d7c791a935f105f28986dc20424", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b349d7c791a935f105f28986dc20424");
                    return;
                }
                view.setSelected(!view.isSelected());
                f fVar = f.this;
                boolean isSelected = view.isSelected();
                Object[] objArr4 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0), c0753c};
                ChangeQuickRedirect changeQuickRedirect4 = f.u;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "d78da9a545ab81b4253c49312f3f2d9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "d78da9a545ab81b4253c49312f3f2d9d");
                } else if (isSelected) {
                    fVar.v.add(c0753c.a);
                } else {
                    fVar.v.remove(c0753c.a);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.base.feedback.adapter.NPSMultiChoiceViewAdapter.a
            public final void a(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aff70e0680e68a759300876f9b56416e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aff70e0680e68a759300876f9b56416e");
                } else if (view.isEnabled()) {
                    f.this.a();
                }
            }
        };
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9b542205f18802587926d13d0b691f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9b542205f18802587926d13d0b691f");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.v.size() > 0) {
            for (int i = 0; i < this.v.size(); i++) {
                sb.append(this.v.get(i));
                if (i != this.v.size() - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        this.k = sb.toString();
    }
}
