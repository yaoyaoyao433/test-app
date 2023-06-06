package com.sankuai.waimai.store.drug.goods.list.viewblocks;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.delegate.impl.l;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c {
    public static ChangeQuickRedirect c;
    private final a w;

    public c(@NonNull @NotNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar, false);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3850aa48f771dd94b45770dc96b9bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3850aa48f771dd94b45770dc96b9bc");
        } else {
            this.w = new a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf29dbc75590714deebd37b37311ebfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf29dbc75590714deebd37b37311ebfb");
            return;
        }
        a aVar = this.w;
        com.sankuai.waimai.store.drug.goods.list.delegate.d d = d();
        Object[] objArr2 = {d, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ac5d04f172cb34fba9dbbc59fd4e75f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ac5d04f172cb34fba9dbbc59fd4e75f6");
            return;
        }
        aVar.c = viewGroup;
        aVar.b.add(new b(d));
        aVar.b.add(new g(d));
        for (DrugComposeShopPageBlock drugComposeShopPageBlock : aVar.b) {
            viewGroup.addView(drugComposeShopPageBlock.createView(viewGroup));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c, com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6481b3fe45d1519fc6ba6eb8ab1651d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6481b3fe45d1519fc6ba6eb8ab1651d");
            return;
        }
        if (l.e(restMenuResponse)) {
            this.m = this.w.a(b.class);
        } else {
            this.m = this.w.a(g.class);
        }
        if (this.m == null) {
            super.a(this.w.c);
        }
        super.a(restMenuResponse);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public static ChangeQuickRedirect a;
        final List<DrugComposeShopPageBlock> b;
        ViewGroup c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30becfacbb45ba9a999b50e776fc7b8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30becfacbb45ba9a999b50e776fc7b8e");
            } else {
                this.b = new ArrayList();
            }
        }

        public final DrugComposeShopPageBlock a(Class<? extends DrugComposeShopPageBlock> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018a63bfc008cccb6bfaf72c197a663c", RobustBitConfig.DEFAULT_VALUE)) {
                return (DrugComposeShopPageBlock) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018a63bfc008cccb6bfaf72c197a663c");
            }
            this.c.removeAllViews();
            DrugComposeShopPageBlock drugComposeShopPageBlock = null;
            for (DrugComposeShopPageBlock drugComposeShopPageBlock2 : this.b) {
                if (drugComposeShopPageBlock2.getClass() == cls) {
                    this.c.addView(drugComposeShopPageBlock2.getView());
                    drugComposeShopPageBlock = drugComposeShopPageBlock2;
                } else {
                    drugComposeShopPageBlock2.onDestroy();
                }
            }
            return drugComposeShopPageBlock;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends g {
        public static ChangeQuickRedirect a;

        public b(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar) {
            super(dVar);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae2a43e70624227086034ad70cb07ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae2a43e70624227086034ad70cb07ea");
            }
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
        public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c108bb389380c857a58254b3b7a36e1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c108bb389380c857a58254b3b7a36e1") : layoutInflater.inflate(R.layout.wm_drug_shop_content_drug_compose_page_block_new, viewGroup, false);
        }
    }
}
