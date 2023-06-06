package com.sankuai.waimai.store.controller;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect e;
    private UniversalImageView f;
    private float g;

    public d(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a362f19cdc00d68b9b8a6b59f2b33b9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a362f19cdc00d68b9b8a6b59f2b33b9d");
        }
    }

    @Override // com.sankuai.waimai.store.controller.a, com.sankuai.waimai.store.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5560a905bd97a1011148e5523f36a663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5560a905bd97a1011148e5523f36a663");
            return;
        }
        this.f = (UniversalImageView) view.findViewById(R.id.collect);
        this.f.setColorFraction(1.0f);
        this.g = 1.0f;
        this.f.setOnClickListener(this.d);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a545293a9b425923b0dd9e43f1759321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a545293a9b425923b0dd9e43f1759321");
            return;
        }
        this.g = 1.0f - f;
        this.f.setColorFraction(this.g);
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c8cf2e3ea651f3a58bd3b573d9e4486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c8cf2e3ea651f3a58bd3b573d9e4486");
        } else {
            this.f.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.sankuai.waimai.store.controller.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530c4f5f94f0adb13e646b78474df8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530c4f5f94f0adb13e646b78474df8bb");
        } else if (z) {
            this.f.setNeedChangeColor(false);
            this.f.setImageResource(R.drawable.wm_sc_super_drugstore_collected);
        } else {
            this.f.setNeedChangeColor(true);
            this.f.setImageResource(R.drawable.wm_sc_super_drugstore_collect);
            this.f.setColorFraction(this.g);
        }
    }
}
