package com.sankuai.waimai.mach.manager_new.ioq;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class h extends b<Boolean> {
    public static ChangeQuickRedirect g = null;
    public static String h = "move_from";
    public static String i = "move_to";

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "TaskMove";
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final int d() {
        return 10;
    }

    public h(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa232576af82fb55cf616f3336835884", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa232576af82fb55cf616f3336835884");
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb2f4e0eca8fe2cf76c9a3d84b00b73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb2f4e0eca8fe2cf76c9a3d84b00b73");
            return;
        }
        try {
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-move");
            com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_move_task");
            BundleInfo c = c();
            String a = this.b.a(h);
            String a2 = this.b.a(i);
            if (TextUtils.isEmpty(a)) {
                com.sankuai.waimai.mach.utils.e.a(h.class, "MoveBundleException_fromPathNull", com.sankuai.waimai.mach.manager_new.common.a.b(c));
                throw new Exception("fromPath为空，bundle move失败 | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
            } else if (TextUtils.isEmpty(a2)) {
                com.sankuai.waimai.mach.utils.e.a(h.class, "MoveBundleException_toPathNull", com.sankuai.waimai.mach.manager_new.common.a.b(c));
                throw new Exception("toPath为空，bundle move失败 | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
            } else {
                File file = new File(a);
                if (!file.exists()) {
                    com.sankuai.waimai.mach.utils.e.a(h.class, "MoveBundleException_fromFileNotExist", com.sankuai.waimai.mach.manager_new.common.a.b(c));
                    throw new Exception("bundle move失败，原bundle不存在 | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
                }
                File file2 = new File(a2);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        com.sankuai.waimai.mach.manager_new.common.b.b(file2);
                    } else {
                        com.sankuai.waimai.mach.manager_new.common.b.c(file2);
                    }
                } else if (!com.sankuai.waimai.mach.manager_new.common.b.a(file2)) {
                    com.sankuai.waimai.mach.utils.e.a(h.class, "MoveBundleException_mkdirsFail", com.sankuai.waimai.mach.manager_new.common.a.b(c));
                    throw new Exception("目标文件路径创建失败失败  | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
                }
                if (!file.renameTo(file2)) {
                    com.sankuai.waimai.mach.utils.e.a(h.class, "MoveBundleException_renameToFail", com.sankuai.waimai.mach.manager_new.common.a.b(c));
                    throw new Exception("bundle move失败 | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
                }
                aVar.a("move_task");
                com.sankuai.waimai.mach.common.i.a().e().a(aVar);
            }
        } finally {
            com.sankuai.waimai.mach.manager_new.common.c.a();
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8345f7ab3b6f63727993a0ebacd9eae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8345f7ab3b6f63727993a0ebacd9eae7");
            return;
        }
        super.g();
        a((h) Boolean.TRUE);
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c733795c5e6bd81c59f7b05b1e85507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c733795c5e6bd81c59f7b05b1e85507");
            return;
        }
        super.a(exc);
        a((h) Boolean.FALSE);
    }
}
