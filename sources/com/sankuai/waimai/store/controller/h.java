package com.sankuai.waimai.store.controller;

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
    public static ChangeQuickRedirect p;
    private TextView q;
    private UniversalImageView r;

    public h(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e16966784ac95c5afea7e5b343a81a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e16966784ac95c5afea7e5b343a81a7");
        }
    }

    @Override // com.sankuai.waimai.store.controller.c
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d59771be5fb1256038dc8c85fc9f636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d59771be5fb1256038dc8c85fc9f636");
            return;
        }
        this.r = (UniversalImageView) view.findViewById(R.id.more_button);
        this.r.setColorFraction(1.0f);
        this.r.setOnClickListener(this.j);
        this.q = (TextView) view.findViewById(R.id.unread_message_count);
    }

    @Override // com.sankuai.waimai.store.controller.c
    public final View b() {
        return this.r;
    }

    @Override // com.sankuai.waimai.store.controller.c
    public final TextView c() {
        return this.q;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6099fc6a75215153b2202a0264dc8788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6099fc6a75215153b2202a0264dc8788");
        } else {
            this.r.setColorFraction(1.0f - f);
        }
    }
}
