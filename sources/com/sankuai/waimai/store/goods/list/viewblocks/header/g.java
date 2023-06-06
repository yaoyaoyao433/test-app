package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect c;
    View d;
    TextView e;
    TextView f;
    private int g;
    private int h;

    public g(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c553197764cebff02e6bc0506be131a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c553197764cebff02e6bc0506be131a");
            return;
        }
        this.g = 80;
        this.h = 160;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3da5e58afa692612321864eb00e4240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3da5e58afa692612321864eb00e4240");
            return;
        }
        super.onViewCreated();
        this.d = this.mView.findViewById(R.id.comment_layout);
        this.e = (TextView) this.mView.findViewById(R.id.txt_poi_rating_num);
        this.f = (TextView) this.mView.findViewById(R.id.txt_comment_number);
        this.d.setBackground(com.sankuai.waimai.store.util.e.a(this.d.getContext(), new int[]{R.color.wm_sg_good_list_header_logo_shadow}, (int) R.dimen.wm_sc_common_dimen_20));
    }
}
