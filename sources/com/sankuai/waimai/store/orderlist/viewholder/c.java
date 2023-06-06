package com.sankuai.waimai.store.orderlist.viewholder;

import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    public TextView b;
    public ImageView c;
    private View d;

    public c(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3344607e6cd88faf10db6c9534db8989", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3344607e6cd88faf10db6c9534db8989");
            return;
        }
        this.d = view.findViewById(R.id.sg_order_recommend_header_root);
        int a2 = h.a(view.getContext(), 6.0f);
        this.d.setPadding(0, a2, 0, a2);
        this.b = (TextView) view.findViewById(R.id.sg_order_detail_recommend_title);
        this.c = (ImageView) view.findViewById(R.id.sg_order_detail_recommend_title_iv);
    }
}
