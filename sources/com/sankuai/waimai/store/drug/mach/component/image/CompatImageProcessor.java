package com.sankuai.waimai.store.drug.mach.component.image;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.component.base.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CompatImageProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "universal-image-view";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public /* synthetic */ a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9b8029b06d14f0098ea43de7f44ffe", RobustBitConfig.DEFAULT_VALUE) ? (CompatImageComponent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9b8029b06d14f0098ea43de7f44ffe") : new CompatImageComponent();
    }
}
