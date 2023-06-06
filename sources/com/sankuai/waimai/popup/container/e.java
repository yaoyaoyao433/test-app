package com.sankuai.waimai.popup.container;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends com.sankuai.waimai.platform.mach.dialog.e {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.mach.d a;

    public e(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a4441026e230655d87d261de4162cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a4441026e230655d87d261de4162cb");
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void a(com.sankuai.waimai.mach.d dVar) {
        this.a = dVar;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.e, com.sankuai.waimai.platform.mach.a
    public com.sankuai.waimai.mach.d d() {
        return this.a;
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b36ddf50b27d69043ef8c46fbbb3c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b36ddf50b27d69043ef8c46fbbb3c6f");
        } else {
            super.b(aVar);
        }
    }
}
