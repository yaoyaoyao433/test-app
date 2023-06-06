package com.sankuai.waimai.irmo.canvas.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MachCanvasProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "infinite-canvas";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88732e4dc39928b60fd4746d6e30bc0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88732e4dc39928b60fd4746d6e30bc0") : new b();
    }
}
