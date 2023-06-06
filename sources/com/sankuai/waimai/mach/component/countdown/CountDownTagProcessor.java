package com.sankuai.waimai.mach.component.countdown;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CountDownTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "countdown";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffde156207c5184641e91e1c43d2d937", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffde156207c5184641e91e1c43d2d937") : new a();
    }
}
