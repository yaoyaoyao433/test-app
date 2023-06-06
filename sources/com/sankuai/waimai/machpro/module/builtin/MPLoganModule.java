package com.sankuai.waimai.machpro.module.builtin;

import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPLoganModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MPLoganModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c18b3d7411e84b941e6d095d0f151f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c18b3d7411e84b941e6d095d0f151f17");
        }
    }

    @JSMethod(methodName = SnifferDBHelper.COLUMN_LOG)
    public void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4e0e9d4ea72457b4b86d43af6e92c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4e0e9d4ea72457b4b86d43af6e92c31");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0f4818a521bec8d3beeb8ea5eb5a67da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0f4818a521bec8d3beeb8ea5eb5a67da");
            return;
        }
        com.sankuai.waimai.machpro.monitor.a aVar = f.a().j;
        if (aVar != null) {
            aVar.a(com.sankuai.waimai.mach.log.a.a, "machpro_log_custom", str);
        }
    }
}
