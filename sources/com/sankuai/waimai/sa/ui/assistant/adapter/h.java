package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.content.res.TypedArray;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.sa.ui.assistant.chat.i;
import com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonStatisticsItemView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends g<com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.b b;
    private final com.sankuai.waimai.sa.ui.assistant.a e;
    private String f;
    private i g;
    private MultiPersonStatisticsItemView h;
    private int i;

    public h(com.sankuai.waimai.sa.ui.assistant.a aVar, i iVar, String str, MultiPersonStatisticsItemView multiPersonStatisticsItemView, int i) {
        Object[] objArr = {aVar, iVar, str, multiPersonStatisticsItemView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbb075c9243a2e821035037fea0b35f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbb075c9243a2e821035037fea0b35f");
            return;
        }
        this.e = aVar;
        this.g = iVar;
        this.f = str;
        this.h = multiPersonStatisticsItemView;
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: b */
    public com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60ae481ff65b08d3b68a5e931f911f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60ae481ff65b08d3b68a5e931f911f7");
        }
        if (this.i == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_multi_person_meal_horizontal_item_base, viewGroup, false);
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_multi_person_meal_vertical_item_base, viewGroup, false);
        }
        View view = inflate;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.food_list_container_stub);
        viewStub.setInflatedId(R.id.food_list_container_stub);
        if (i > 6) {
            i = 6;
        } else if (i <= 0) {
            i = 1;
        }
        TypedArray obtainTypedArray = viewGroup.getContext().getResources().obtainTypedArray(R.array.wm_smart_assistant_multi_person_item_layout);
        viewStub.setLayoutResource(obtainTypedArray.getResourceId(i - 1, R.layout.wm_smart_assistant_multi_person_meal_item_product_item_1));
        obtainTypedArray.recycle();
        viewStub.setInflatedId(R.id.wm_smart_assistant_multi_person_meal_item_product_item);
        viewStub.inflate();
        return new com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b(view, this.e, this.g, this.f, this.h, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void onBindViewHolder(com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb133a2920e3d577af839f24958e1d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb133a2920e3d577af839f24958e1d3e");
            return;
        }
        com.sankuai.waimai.sa.model.b bVar2 = this.b;
        Object[] objArr2 = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a8cf1efc5d7cee5d9ff34aed7e226e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a8cf1efc5d7cee5d9ff34aed7e226e3d");
            return;
        }
        bVar.c = bVar2;
        bVar.d = i;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "60f86b22f4c36ade311b3f76218a09a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "60f86b22f4c36ade311b3f76218a09a3");
            return;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.sa.ui.assistant.chat.multiperson.b.a;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e6fd8eacf91ec8b6680d1dbf96a4da47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e6fd8eacf91ec8b6680d1dbf96a4da47");
        } else if (bVar.c == null || bVar.c.p == null || bVar.c.p.size() <= bVar.d || bVar.c.p.get(bVar.d) == null || com.sankuai.waimai.foundation.utils.d.a(bVar.c.p.get(bVar.d).n)) {
            bVar.f.setVisibility(8);
        } else {
            bVar.f.setVisibility(0);
            bVar.a(bVar.c.p.get(bVar.d));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b805fc824c7e84b28a3b258dd3216cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b805fc824c7e84b28a3b258dd3216cd")).intValue();
        }
        if (this.b == null || this.b.p == null) {
            return 0;
        }
        return this.b.p.size();
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb58f5a06cd757341fb8493fd73cc41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb58f5a06cd757341fb8493fd73cc41")).intValue();
        }
        if (this.b == null || com.sankuai.waimai.foundation.utils.d.a(this.b.p) || this.b.p.get(i) == null || com.sankuai.waimai.foundation.utils.d.a(this.b.p.get(i).n)) {
            return 1;
        }
        int size = this.b.p.get(i).n.size();
        if (size > 5) {
            return 6;
        }
        return size;
    }
}
