package com.sankuai.waimai.rocks.page.block;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a<FrameLayout>, com.meituan.android.cube.pga.viewmodel.a, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;

    public d(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7337e6fd953bbca93010f890acdb960", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7337e6fd953bbca93010f890acdb960");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a<FrameLayout> z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591a39de2c0b4cc89f19db5a61880cd4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591a39de2c0b4cc89f19db5a61880cd4") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.rocks.page.block.d.1
            public static ChangeQuickRedirect d;

            @Override // com.meituan.android.cube.pga.view.a
            @Nullable
            public final /* synthetic */ View c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8964aa74a0a3bb468588cacb108a6987", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8964aa74a0a3bb468588cacb108a6987") : new FrameLayout(this.c);
            }
        };
    }
}
