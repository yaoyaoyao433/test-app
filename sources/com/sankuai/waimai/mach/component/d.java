package com.sankuai.waimai.mach.component;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.mach.component.base.a<MachViewGroup> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(MachViewGroup machViewGroup) {
        MachViewGroup machViewGroup2 = machViewGroup;
        Object[] objArr = {machViewGroup2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886502718de3099cfe16c26b7e214e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886502718de3099cfe16c26b7e214e3f");
        } else {
            super.a((d) machViewGroup2);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ MachViewGroup b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbd436b09a4dc21067a74eede975798", RobustBitConfig.DEFAULT_VALUE) ? (MachViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbd436b09a4dc21067a74eede975798") : new MachViewGroup(context);
    }
}
