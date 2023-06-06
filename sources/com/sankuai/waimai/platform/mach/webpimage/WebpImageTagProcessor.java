package com.sankuai.waimai.platform.mach.webpimage;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.mach.component.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WebpImageTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "wm-webp-image";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d00513fab0c4eb38a0288fe14b508bb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d00513fab0c4eb38a0288fe14b508bb") : new c();
    }
}
