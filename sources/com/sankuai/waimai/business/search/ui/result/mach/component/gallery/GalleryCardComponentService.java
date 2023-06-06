package com.sankuai.waimai.business.search.ui.result.mach.component.gallery;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.search.common.mach.component.IBuildMachTagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GalleryCardComponentService implements IBuildMachTagProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.search.common.mach.component.IBuildMachTagProcessor
    public ITagProcessor getMachTagProcessor(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f454ab5390bd67d61bf9282b49cddd9", RobustBitConfig.DEFAULT_VALUE) ? (ITagProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f454ab5390bd67d61bf9282b49cddd9") : new GalleryCardTagProcessor();
    }
}
