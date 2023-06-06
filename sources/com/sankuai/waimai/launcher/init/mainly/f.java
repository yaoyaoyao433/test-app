package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CodeLogInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b9f9fd71440bc90fc93e5787c69aa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b9f9fd71440bc90fc93e5787c69aa9");
        } else {
            com.dianping.codelog.b.a(application, new com.dianping.codelog.a() { // from class: com.sankuai.waimai.launcher.init.mainly.f.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.codelog.a
                public final JSONObject c() {
                    return null;
                }

                @Override // com.dianping.codelog.a
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c9b4134cd7534c0f6f35be88bc092e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c9b4134cd7534c0f6f35be88bc092e");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.sankuai.waimai.config.a.a().d());
                    return sb.toString();
                }

                @Override // com.dianping.codelog.a
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92672367e5a0f3c30b25bf5b73c4f990", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92672367e5a0f3c30b25bf5b73c4f990") : com.sankuai.waimai.platform.b.A().c();
                }
            });
        }
    }
}
