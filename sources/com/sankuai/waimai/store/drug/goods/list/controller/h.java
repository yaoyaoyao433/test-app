package com.sankuai.waimai.store.drug.goods.list.controller;

import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends c {
    public static ChangeQuickRedirect o;
    UniversalImageView p;
    private TextView q;

    public h(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60738a0fc9ea871ae2c7771883b906b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60738a0fc9ea871ae2c7771883b906b5");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.c
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecc86bc013e90fcb9ea6cf4c0e54ebe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecc86bc013e90fcb9ea6cf4c0e54ebe5");
            return;
        }
        this.p = (UniversalImageView) view.findViewById(R.id.more_button);
        this.p.setColorFraction(1.0f);
        this.p.setOnClickListener(this.i);
        this.q = (TextView) view.findViewById(R.id.unread_message_count);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.c
    public final View b() {
        return this.p;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.c
    public final TextView c() {
        return this.q;
    }
}
