package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.share.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class t extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ShareInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        b.a b;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0162c43857fdef2baaac5672b6b89fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0162c43857fdef2baaac5672b6b89fe");
            return;
        }
        com.sankuai.waimai.kit.share.d.a().b = new com.sankuai.waimai.kit.share.c() { // from class: com.sankuai.waimai.launcher.init.secondary.t.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.share.c
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a38932516fb8054d37156dd01e6a51d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a38932516fb8054d37156dd01e6a51d");
                } else if (i == 13201) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_failed").b("error").b());
                } else if (i == 13200) {
                    com.sankuai.waimai.platform.capacity.log.i.c(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_failed").b());
                } else if (i == 13202) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_failed").b("cancel").b());
                }
            }

            @Override // com.sankuai.waimai.kit.share.c
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ff4d2e6907d902d085bdbda7acfdf95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ff4d2e6907d902d085bdbda7acfdf95");
                } else if (i == 13301) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qq_failed").b("error").b());
                } else if (i == 13300) {
                    com.sankuai.waimai.platform.capacity.log.i.c(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qq_failed").b());
                } else if (i == 13302) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qq_failed").b("cancel").b());
                }
            }

            @Override // com.sankuai.waimai.kit.share.c
            public final void c(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "247a736d00ec660f2b78db1f3ca7debe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "247a736d00ec660f2b78db1f3ca7debe");
                } else if (i == 13201) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_friends_failed").b("error").b());
                } else if (i == 13200) {
                    com.sankuai.waimai.platform.capacity.log.i.c(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_friends_failed").b());
                } else if (i == 13202) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_weixin_friends_failed").b("cancel").b());
                }
            }

            @Override // com.sankuai.waimai.kit.share.c
            public final void d(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d818f1bd82e7241ba75045d0be363e6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d818f1bd82e7241ba75045d0be363e6c");
                } else if (i == 13301) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qzone_failed").b());
                } else if (i == 13300) {
                    com.sankuai.waimai.platform.capacity.log.i.c(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qzone_failed").b());
                } else if (i == 13302) {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.capacity.log.h().a("share_to_qzone_failed").b("cancel").b());
                }
            }
        };
        com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.config.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d0ed268d18bb8a1629d7c5b24f6cfdda", RobustBitConfig.DEFAULT_VALUE)) {
            b = (b.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d0ed268d18bb8a1629d7c5b24f6cfdda");
        } else {
            b = a2.b != null ? a2.b.b() : null;
        }
        com.sankuai.waimai.share.b.b = b;
    }
}
