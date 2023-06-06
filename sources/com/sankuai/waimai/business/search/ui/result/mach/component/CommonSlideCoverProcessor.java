package com.sankuai.waimai.business.search.ui.result.mach.component;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CommonSlideCoverProcessor implements ITagProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "wm-search-slide-cover";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6604360acab28be37c293809c92d22ae", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6604360acab28be37c293809c92d22ae") : new a();
    }
}
