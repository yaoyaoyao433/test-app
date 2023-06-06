package com.sankuai.waimai.touchmatrix.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.monitor.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends a.AbstractC1349a {
        @Override // com.sankuai.waimai.touchmatrix.monitor.a.AbstractC1349a
        public final String a() {
            return "waimai_dynamic_dialog";
        }
    }

    public static void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09f738719892e650045fadde1f4baddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09f738719892e650045fadde1f4baddf");
            return;
        }
        a.AbstractC1349a b = new a().a("dynamic_dialog").b("dialog_failed_to_show");
        k.c(b.d("input_param_error_count:" + i + ", load_bundle_failed_count:" + i2 + ", render_failed_count:" + i3 + ", business_failed_count:" + i4).b());
    }
}
