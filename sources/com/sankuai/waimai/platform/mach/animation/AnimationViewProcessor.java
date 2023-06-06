package com.sankuai.waimai.platform.mach.animation;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.mach.component.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AnimationViewProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return "wm-animation-view";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff15048f335c36c724f47c04d838f0d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff15048f335c36c724f47c04d838f0d") : new f();
    }
}
