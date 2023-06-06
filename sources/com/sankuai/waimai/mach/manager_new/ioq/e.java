package com.sankuai.waimai.mach.manager_new.ioq;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends b {
    public static ChangeQuickRedirect g;

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "TaskClearDeleteFlagFile";
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final int d() {
        return 30;
    }

    public e(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d32038e0fae7b3301fab75e3683c8ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d32038e0fae7b3301fab75e3683c8ea");
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08723a7c6e3b8bef8e25ed1bcabc5e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08723a7c6e3b8bef8e25ed1bcabc5e91");
            return;
        }
        super.f();
        com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_clear_task");
        a(com.sankuai.waimai.mach.manager_new.download.d.a());
        a(com.sankuai.waimai.mach.manager_new.download.d.b());
        aVar.a("clear_task");
        com.sankuai.waimai.mach.common.i.a().e().a(aVar);
    }

    private void a(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a91a1718c1b7031268a297e187e09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a91a1718c1b7031268a297e187e09b");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.j("_IOTaskClearDeleteFlagFile | 开始");
        File[] listFiles2 = new File(str).listFiles();
        if (listFiles2 != null && listFiles2.length > 0) {
            for (File file : listFiles2) {
                if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        a(file2);
                    }
                }
            }
        }
        com.sankuai.waimai.mach.manager_new.common.c.j("_IOTaskClearDeleteFlagFile | 结束");
    }

    private void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195dec0e186e5ab83b5a6fcdf72d311b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195dec0e186e5ab83b5a6fcdf72d311b");
        } else if (file != null && file.exists() && file.isDirectory() && com.sankuai.waimai.mach.utils.e.b(file)) {
            String name = file.getName();
            boolean z = name.startsWith("mach_pro") ? !com.sankuai.waimai.mach.manager_new.b.a().e.containsKey(name) : true;
            if (z) {
                com.sankuai.waimai.mach.manager_new.c a = com.sankuai.waimai.mach.manager_new.d.a().a(file.getName());
                z = a == com.sankuai.waimai.mach.manager_new.c.b || a.a() < 6;
            }
            if (z) {
                File parentFile = file.getParentFile();
                com.sankuai.waimai.mach.manager_new.common.b.b(file);
                com.sankuai.waimai.mach.manager_new.common.c.j("_IOTaskClearDeleteFlagFile成功删除 | " + file.getName());
                if (parentFile != null) {
                    if (parentFile.listFiles() == null || parentFile.listFiles().length <= 0) {
                        com.sankuai.waimai.mach.manager_new.common.b.b(parentFile);
                    }
                }
            }
        }
    }
}
