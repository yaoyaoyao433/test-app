package com.sankuai.waimai.business.search.ui.result.mach.component.gallery;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GalleryCardTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "wm-search-gallery-card";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557404c01573d9ff996f655f2cfca8bc", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557404c01573d9ff996f655f2cfca8bc") : new b();
    }
}
