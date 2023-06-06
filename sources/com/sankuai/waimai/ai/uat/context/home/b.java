package com.sankuai.waimai.ai.uat.context.home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.ai.uat.context.a {
    public static ChangeQuickRedirect f;
    public a g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64623f34ccc70af6f6296ef6415cc55b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64623f34ccc70af6f6296ef6415cc55b");
        } else {
            this.g = new a();
        }
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final a.EnumC0684a a() {
        return a.EnumC0684a.WMUATContextHome;
    }

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7d34ecc59ea24e134116956e20fc43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7d34ecc59ea24e134116956e20fc43");
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2044208974) {
            if (hashCode == 910634771 && str.equals("POI_CLICK_KEY")) {
                c = 0;
            }
        } else if (str.equals("UPDATE_RANK_TRACE_ID_KEY")) {
            c = 1;
        }
        switch (c) {
            case 0:
            case 1:
                Object[] objArr2 = {str, obj};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8c61971399dec5de6db620bb9b53005", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8c61971399dec5de6db620bb9b53005");
                    return;
                } else {
                    this.g.a(str, obj);
                    return;
                }
            default:
                return;
        }
    }
}
