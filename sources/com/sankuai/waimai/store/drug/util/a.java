package com.sankuai.waimai.store.drug.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(com.sankuai.waimai.store.repository.net.b bVar) {
        ErrorCode errorCode;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccc30328c8a605dcdf8cb1830deb2a93", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccc30328c8a605dcdf8cb1830deb2a93");
        }
        if (com.sankuai.waimai.store.config.d.h().a("drug_common_config/pageCode", true) && bVar != null) {
            com.sankuai.waimai.platform.modular.network.error.a c = c(bVar);
            if (c.b() == 0) {
                errorCode = com.sankuai.waimai.monitor.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), c).b("13032").b;
            } else {
                errorCode = com.sankuai.waimai.monitor.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), c.b()).b("13032").b;
            }
            com.sankuai.waimai.monitor.b.a(errorCode, "com.sankuai.wmcustomfront.diting.report");
            return errorCode.buildErrorCodeStr();
        }
        return "";
    }

    public static void b(com.sankuai.waimai.store.repository.net.b bVar) {
        ErrorCode errorCode;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2af37aece30b8f1c1d38c057290894c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2af37aece30b8f1c1d38c057290894c");
        } else if (com.sankuai.waimai.store.config.d.h().a("drug_common_config/pageCodeReport", true) && bVar != null) {
            com.sankuai.waimai.platform.modular.network.error.a c = c(bVar);
            if (c.b() == 0) {
                errorCode = com.sankuai.waimai.monitor.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), c).b("13032").b;
            } else {
                errorCode = com.sankuai.waimai.monitor.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), c.b()).b("13032").b;
            }
            com.sankuai.waimai.monitor.b.a(errorCode, "com.sankuai.wmcustomfront.diting.report");
        }
    }

    public static com.sankuai.waimai.platform.modular.network.error.a c(final com.sankuai.waimai.store.repository.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8012e6fdca51d462c61225114512c689", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.modular.network.error.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8012e6fdca51d462c61225114512c689");
        }
        if (bVar == null) {
            return new com.sankuai.waimai.platform.modular.network.error.a("");
        }
        return new com.sankuai.waimai.platform.modular.network.error.a(bVar.g) { // from class: com.sankuai.waimai.store.drug.util.a.1
            public static ChangeQuickRedirect d = null;
            private static final long serialVersionUID = 2865600478255563834L;

            @Override // com.sankuai.waimai.platform.modular.network.error.a, java.lang.Throwable
            public final String getMessage() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3b640dc00024c42dcc89485a2ed2e31", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3b640dc00024c42dcc89485a2ed2e31") : bVar.getMessage();
            }

            @Override // com.sankuai.waimai.platform.modular.network.error.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84c851fee4b725d15d4a12b4d622bb54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84c851fee4b725d15d4a12b4d622bb54") : bVar.b;
            }

            @Override // com.sankuai.waimai.platform.modular.network.error.a
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f85a196ce41e675d4adbf22908ca3304", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f85a196ce41e675d4adbf22908ca3304")).intValue() : bVar.c;
            }

            @Override // com.sankuai.waimai.platform.modular.network.error.a
            public final Throwable d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06d272c0c519f9056cf4ea46042d5fb6", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06d272c0c519f9056cf4ea46042d5fb6") : bVar.g;
            }
        };
    }
}
