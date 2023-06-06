package com.sankuai.waimai.business.ugc.mach.live;

import android.support.annotation.NonNull;
import com.dianping.live.live.mrn.MLivePlayerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.component.base.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MachLivePlayerTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public String getTagName() {
        return MLivePlayerModule.REACT_CLASS;
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ca446019ea35ca7589fb062f8fbe4d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ca446019ea35ca7589fb062f8fbe4d0");
        }
        long nanoTime = System.nanoTime();
        MachLivePlayerComponent machLivePlayerComponent = new MachLivePlayerComponent(nanoTime);
        MachLivePlayerNativeMethod.registerComponent(nanoTime, machLivePlayerComponent);
        return machLivePlayerComponent;
    }
}
