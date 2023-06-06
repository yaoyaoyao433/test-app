package com.sankuai.waimai.platform.mach.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends a.AbstractC1040a {
        @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
        public final String a() {
            return "waimai_dynamic_dialog";
        }
    }

    public static void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28b2ee9c3c0646de68bf298f25481a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28b2ee9c3c0646de68bf298f25481a72");
            return;
        }
        a.AbstractC1040a b = new a().a("dynamic_dialog").b("dialog_failed_to_show");
        com.sankuai.waimai.platform.capacity.log.i.c(b.d("input_param_error_count:" + i + ", load_bundle_failed_count:" + i2 + ", render_failed_count:" + i3 + ", business_failed_count:" + i4).b());
    }
}
