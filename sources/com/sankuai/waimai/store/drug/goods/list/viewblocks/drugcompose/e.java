package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends DrugComposeShopPageBlock {
    public static ChangeQuickRedirect a;

    public e(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61613c264ccd807544805bd8ba47190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61613c264ccd807544805bd8ba47190");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugComposeShopPageBlock, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7643f7cd24bfd46d217a631521769923", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7643f7cd24bfd46d217a631521769923") : layoutInflater.inflate(R.layout.wm_drug_shop_content_drug_compose_page_block_new, viewGroup, false);
    }
}
