package com.sankuai.waimai.store.orderlist.view.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.base.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect d;
    public com.sankuai.waimai.store.orderlist.viewholder.b e;

    public abstract int a();

    public abstract void a(View view);

    public abstract void a(Order order);

    public abstract void a(Order order, int i);

    public abstract void b(Order order);

    public a(@NonNull Context context, com.sankuai.waimai.store.orderlist.viewholder.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1303d07180e11b18ceddc5e1934519", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1303d07180e11b18ceddc5e1934519");
        } else {
            this.e = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208fa65c1942eccfb85635c11683c8de", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208fa65c1942eccfb85635c11683c8de");
        }
        super.onCreateView(layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(a(), viewGroup, false);
        a(inflate);
        return inflate;
    }
}
