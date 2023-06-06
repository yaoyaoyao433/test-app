package com.meituan.msc.modules.apploader;

import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PageNotFoundReporter extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface CanReloadScene {
        public static final int DEFAULT = -1;
        public static final int RECREATE_RUNTIME = 2;
        public static final int REFETCH_META_INFO = 1;
        public static final int RELOAD_WIDGET = 3;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface ShowErrorPageScene {
        public static final int DEFAULT = -1;
        public static final int NEW_PACKAGE_NO_PAGE = 3;
        public static final int NOT_RELOAD_WIDGET = 2;
        public static final int UNABLE_RELOAD = 1;
    }

    public PageNotFoundReporter(h hVar, String str) {
        super(com.meituan.msc.modules.reporter.a.a(hVar, null, str, null));
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af99457748544cc8531a16f437f023ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af99457748544cc8531a16f437f023ad");
        }
    }

    public final void a(@CanReloadScene int i, @ShowErrorPageScene int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c91757c7c5a6addcc21eda2e3526e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c91757c7c5a6addcc21eda2e3526e0c");
        } else {
            a(i, i2, false);
        }
    }

    public final void a(@CanReloadScene int i, @ShowErrorPageScene int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a634394737d304b46385d3e24fb5e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a634394737d304b46385d3e24fb5e84");
        } else {
            b("msc.page.not.found.count").a("canReloadScene", Integer.valueOf(i)).a("showErrorPageScene", Integer.valueOf(i2)).a("isUserHandled", Boolean.valueOf(z)).c();
        }
    }
}
