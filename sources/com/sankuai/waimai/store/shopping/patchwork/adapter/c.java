package com.sankuai.waimai.store.shopping.patchwork.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.market.view.custom.BorderTextView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.widgets.recycler.e {
    public static ChangeQuickRedirect a;
    protected BorderTextView b;
    @NonNull
    protected final com.sankuai.waimai.store.expose.a<Integer> c;
    @NonNull
    private final f d;

    public c(View view, @NonNull com.sankuai.waimai.store.expose.a<Integer> aVar, @NonNull f fVar) {
        super(view);
        Object[] objArr = {view, aVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137fd57f8cf465ae598b9267385504db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137fd57f8cf465ae598b9267385504db");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f274bfb11136de58b51126df570dad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f274bfb11136de58b51126df570dad2");
        } else {
            this.b = (BorderTextView) view.findViewById(R.id.tv_price_range);
        }
        this.c = aVar;
        this.d = fVar;
    }

    public final void a(com.sankuai.waimai.store.shopping.patchwork.model.c cVar, int i) {
        boolean z = false;
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df207d895d7f8c3b3c784ba80b3b68c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df207d895d7f8c3b3c784ba80b3b68c4");
        } else if (cVar != null) {
            this.b.setText(cVar.a);
            this.b.setSelected(cVar.b);
            this.c.b(this.b, Integer.valueOf(i));
            BorderTextView borderTextView = this.b;
            List<GoodsSpu> list = cVar.c;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c30adb3b8cab6b0e5640f9bacbe1208", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c30adb3b8cab6b0e5640f9bacbe1208")).booleanValue();
            } else {
                com.sankuai.waimai.store.platform.domain.core.shopcart.b d = com.sankuai.waimai.store.order.a.e().d(this.d.i());
                if (d != null && d.c(list)) {
                    z = true;
                }
            }
            borderTextView.setRedPointStatus(z);
        }
    }
}
