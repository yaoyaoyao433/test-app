package com.sankuai.waimai.drug.patch.block;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.w;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.drug.model.g;
import com.sankuai.waimai.drug.patch.adapter.b;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.drug.patch.adapter.b b;
    com.sankuai.waimai.drug.contract.b c;
    private com.sankuai.waimai.drug.patch.contract.c d;
    private com.sankuai.waimai.store.shopping.cart.contract.a e;
    private com.sankuai.waimai.drug.patch.contract.a f;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;

    public b(@NonNull Context context, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.drug.patch.contract.c cVar, com.sankuai.waimai.drug.contract.b bVar, com.sankuai.waimai.store.shopping.cart.contract.a aVar2, com.sankuai.waimai.drug.patch.contract.a aVar3) {
        super(context);
        Object[] objArr = {context, aVar, cVar, bVar, aVar2, aVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be93d1cc55cce672e25749133163fbb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be93d1cc55cce672e25749133163fbb0");
            return;
        }
        this.d = cVar;
        this.g = aVar;
        this.c = bVar;
        this.e = aVar2;
        this.f = aVar3;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        w wVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770a4d749b8845000e74a2821d3b87f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770a4d749b8845000e74a2821d3b87f9");
            return;
        }
        super.onViewCreated();
        RecyclerView recyclerView = (RecyclerView) findView(R.id.new_rv_patchwork_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.b = new com.sankuai.waimai.drug.patch.adapter.b(this.g, this.d, this.e, this.f);
        recyclerView.setAdapter(new l(this.b));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0a4bda927ae97386862bdedd70a1d20", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0a4bda927ae97386862bdedd70a1d20");
        } else {
            wVar = new w(this.mContext, 1);
            e.a aVar = new e.a();
            aVar.e(h.a(getContext(), 8.0f)).c(ContextCompat.getColor(this.mContext, R.color.wm_st_shopcart_bg_gray_f5));
            Drawable a2 = aVar.a();
            if (a2 != null) {
                wVar.a(a2);
            }
        }
        recyclerView.addItemDecoration(wVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb07a4f570dc2f33cb7499c35f56f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb07a4f570dc2f33cb7499c35f56f05");
            return;
        }
        super.hide();
        this.b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b.a> a(com.sankuai.waimai.drug.model.d dVar, int i, int i2) {
        List<com.sankuai.waimai.drug.model.a> list;
        int a2;
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2211b4614b95f8ac3314f4ee9c1dae08", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2211b4614b95f8ac3314f4ee9c1dae08");
        }
        ArrayList arrayList = new ArrayList();
        g gVar = dVar.e;
        StringBuilder sb = new StringBuilder();
        if (gVar != null && (a2 = com.sankuai.shangou.stone.util.a.a((List) (list = gVar.c))) > 0) {
            if (!TextUtils.isEmpty(gVar.a)) {
                b.a aVar = new b.a();
                aVar.d = gVar.a;
                aVar.a = 2;
                arrayList.add(aVar);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < a2; i4++) {
                com.sankuai.waimai.drug.model.a aVar2 = list.get(i4);
                if (aVar2 != null) {
                    if (i3 == 0) {
                        sb.append(aVar2.a);
                    } else {
                        sb.append(CommonConstant.Symbol.COMMA + aVar2.a);
                    }
                    b.a aVar3 = new b.a();
                    aVar3.c = aVar2;
                    aVar3.a = 0;
                    aVar3.e = i3;
                    arrayList.add(aVar3);
                    i3++;
                }
            }
            this.f.b(sb.toString(), a2);
        }
        com.sankuai.waimai.drug.model.c cVar = dVar.f;
        if (cVar != null && com.sankuai.shangou.stone.util.a.a((List) cVar.b) > 0) {
            if (!TextUtils.isEmpty(cVar.a)) {
                b.a aVar4 = new b.a();
                aVar4.d = cVar.a;
                aVar4.a = 2;
                arrayList.add(aVar4);
            }
            b.a aVar5 = new b.a();
            aVar5.b = cVar.b;
            aVar5.a = 1;
            aVar5.f = dVar.i;
            arrayList.add(aVar5);
        }
        return arrayList;
    }
}
