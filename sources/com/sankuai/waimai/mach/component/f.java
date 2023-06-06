package com.sankuai.waimai.mach.component;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends a<MachViewGroup> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae32b1c11bf9d6ab8f1a5eaf3cc0006", RobustBitConfig.DEFAULT_VALUE) ? (MachViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae32b1c11bf9d6ab8f1a5eaf3cc0006") : new MachViewGroup(context);
    }
}
