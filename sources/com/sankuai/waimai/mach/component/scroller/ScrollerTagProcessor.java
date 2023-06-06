package com.sankuai.waimai.mach.component.scroller;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScrollerTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "scroller";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "020860f4998442c697857c8351a2f56b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "020860f4998442c697857c8351a2f56b") : new b();
    }
}
