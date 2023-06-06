package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedScrollerTagProcessor extends ScrollerTagProcessor {
    public static final String TAG_NAME = "nestedscroller";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor, com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return TAG_NAME;
    }

    @Override // com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor, com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac31e7d4e490f5acd7a3a07d1a474094", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac31e7d4e490f5acd7a3a07d1a474094") : new c();
    }
}
