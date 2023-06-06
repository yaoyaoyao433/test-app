package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public Context b;
    public GoodsSpu c;
    public GoodsSku d;
    public GoodsAttr[] e;

    public abstract int a();

    public abstract void a(int i, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr);

    public abstract void a(GoodsSpu goodsSpu);

    public void a(GoodsSpu goodsSpu, GoodsSku goodsSku) {
    }

    public abstract void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr);

    public abstract void a(GoodsSpu goodsSpu, boolean z, GoodsSku goodsSku);

    public void b(GoodsSpu goodsSpu, GoodsSku goodsSku) {
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6306714307b27eb08c231f19c827bfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6306714307b27eb08c231f19c827bfe");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca71cce40edd0ae1157a0400083677c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca71cce40edd0ae1157a0400083677c") : layoutInflater.inflate(a(), viewGroup, true);
    }
}
