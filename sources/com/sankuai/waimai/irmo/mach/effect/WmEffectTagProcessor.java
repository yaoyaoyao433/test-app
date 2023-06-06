package com.sankuai.waimai.irmo.mach.effect;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WmEffectTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "wm-effect";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public /* synthetic */ com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b06c14db10ce07b45c095201e2408b9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b06c14db10ce07b45c095201e2408b9") : new a();
    }
}
