package com.sankuai.waimai.store.controller;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends b {
    public static ChangeQuickRedirect b;
    private UniversalImageView c;

    public f(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6626c7876fa6ff67e0ef6b7c2e0d7c5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6626c7876fa6ff67e0ef6b7c2e0d7c5d");
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5255185a7f7d8f5a650510dee5ec4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5255185a7f7d8f5a650510dee5ec4e");
        } else {
            this.c.setColorFraction(1.0f - f);
        }
    }

    @Override // com.sankuai.waimai.store.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e8107f49aee5c7bdeda7aa45bbaa50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e8107f49aee5c7bdeda7aa45bbaa50");
            return;
        }
        super.a(view);
        this.c = (UniversalImageView) view.findViewById(R.id.back);
        this.c.setContentDescription(com.sankuai.waimai.store.util.b.a(view.getContext(), (int) R.string.wm_sg_back));
        this.c.setColorFraction(1.0f);
        this.c.setOnClickListener(this.a);
    }
}
