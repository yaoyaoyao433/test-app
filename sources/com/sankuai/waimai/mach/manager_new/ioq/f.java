package com.sankuai.waimai.mach.manager_new.ioq;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends b {
    public static ChangeQuickRedirect g = null;
    public static String h = "delete_mode";
    public static int i = 1;
    public static int j = 2;
    public static int k = 3;
    private List<String> l;

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "TaskDelete";
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final int d() {
        return 20;
    }

    public f(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1e6fe5f7a2d53a956aede9678723dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1e6fe5f7a2d53a956aede9678723dc");
        } else {
            this.l = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179ddb3ebe274642ed0846081fbe7494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179ddb3ebe274642ed0846081fbe7494");
            return;
        }
        try {
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-delete");
            com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_delete_task");
            BundleInfo c = c();
            if (com.sankuai.waimai.mach.manager_new.common.a.d(c)) {
                Object[] objArr2 = {c, 3};
                ChangeQuickRedirect changeQuickRedirect2 = g;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f377983c51df7e6991ebbe329913d79d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f377983c51df7e6991ebbe329913d79d");
                } else if (c != null) {
                    File[] listFiles = new File(com.sankuai.waimai.mach.manager_new.download.d.b() + File.separator + c.getMachId()).listFiles();
                    if (listFiles.length > 1) {
                        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.sankuai.waimai.mach.manager_new.ioq.f.1
                            public static ChangeQuickRedirect a;

                            @Override // java.util.Comparator
                            public final /* synthetic */ int compare(File file, File file2) {
                                File file3 = file;
                                File file4 = file2;
                                Object[] objArr3 = {file3, file4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c9bbebcbaf3d5e77a68d83dd83d6247", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c9bbebcbaf3d5e77a68d83dd83d6247")).intValue();
                                }
                                if (file3 == null || TextUtils.isEmpty(file3.getName()) || file4 == null || TextUtils.isEmpty(file4.getName())) {
                                    return 0;
                                }
                                String[] split = file3.getName().split("@");
                                String[] split2 = file4.getName().split("@");
                                if (split.length == 2 && split2.length == 2) {
                                    return com.sankuai.waimai.machpro.util.b.a(split2[1], split[1]);
                                }
                                return 0;
                            }
                        });
                    }
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (i2 >= 3 && !com.sankuai.waimai.mach.manager_new.b.a().e.containsKey(listFiles[i2].getName())) {
                            com.sankuai.waimai.mach.utils.e.a(listFiles[i2]);
                        }
                    }
                }
            } else {
                j jVar = this.b;
                String str = h;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = j.a;
                int intValue = PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "8f8eaf6df31d0f0f53e7efd8428d8479", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "8f8eaf6df31d0f0f53e7efd8428d8479")).intValue() : jVar.c.getInt(str, -1);
                if (intValue == i) {
                    if (c != null) {
                        a(c.getMachId(), com.sankuai.waimai.mach.manager_new.common.a.b(c), false);
                    }
                } else if (intValue == j) {
                    if (c != null) {
                        a(c);
                    }
                } else if (intValue == k && c != null) {
                    b(c);
                }
            }
            aVar.a("delete_task");
            com.sankuai.waimai.mach.common.i.a().e().a(aVar);
        } finally {
            com.sankuai.waimai.mach.manager_new.common.c.a();
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856c9b7aceebde922b0c0a0d34041066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856c9b7aceebde922b0c0a0d34041066");
            return;
        }
        if (this.l != null && this.l.size() > 0) {
            for (String str : this.l) {
                if (com.sankuai.waimai.mach.manager_new.d.a().a(str) != com.sankuai.waimai.mach.manager_new.c.b) {
                    com.sankuai.waimai.mach.manager_new.d.a().a(str, -1);
                }
            }
        }
        super.g();
        a((f) Boolean.TRUE);
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437c6b7486b4bbc0562726cb1e730953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437c6b7486b4bbc0562726cb1e730953");
            return;
        }
        String a = com.sankuai.waimai.mach.manager_new.download.d.a();
        if (str.startsWith("mach_pro")) {
            a = com.sankuai.waimai.mach.manager_new.download.d.b();
        }
        File file = new File(a + File.separator + str + File.separator + str2);
        com.sankuai.waimai.mach.manager_new.c a2 = com.sankuai.waimai.mach.manager_new.d.a().a(str2);
        if (a2 != com.sankuai.waimai.mach.manager_new.c.b && a2.a() >= 6) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 1) {
                com.sankuai.waimai.mach.utils.e.a(file);
            }
            com.sankuai.waimai.mach.manager_new.common.c.k(str2 + " | 正在使用中，不能被删除");
            return;
        }
        File parentFile = file.getParentFile();
        String name = file.getName();
        if (com.sankuai.waimai.mach.manager_new.common.b.b(file)) {
            this.l.add(name);
            if (parentFile != null && (parentFile.listFiles() == null || parentFile.listFiles().length <= 0)) {
                com.sankuai.waimai.mach.manager_new.common.b.b(parentFile);
            }
            com.sankuai.waimai.mach.manager_new.common.c.k(str2 + " | 删除成功");
        }
        if (com.sankuai.waimai.mach.manager_new.config.a.g.contains(c().getMachId()) || !z) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("template_id", com.sankuai.waimai.mach.manager_new.common.a.b(c()));
        hashMap.put("delete_template", name);
        hashMap.put("checkupdata_json", com.sankuai.waimai.mach.manager_new.config.a.f);
        com.sankuai.waimai.mach.e e = com.sankuai.waimai.mach.common.i.a().e();
        e.a("mach_delete_high_bundle", "误删更高版本Bundle", "bundle id | " + com.sankuai.waimai.mach.manager_new.common.a.b(c()), hashMap);
    }

    private void a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d3396d379edf413bfe0a8e5ac01570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d3396d379edf413bfe0a8e5ac01570");
        } else if (bundleInfo != null) {
            String a = com.sankuai.waimai.mach.manager_new.download.d.a();
            if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo)) {
                a = com.sankuai.waimai.mach.manager_new.download.d.b();
            }
            File[] listFiles = new File(a + File.separator + bundleInfo.getMachId()).listFiles();
            if (listFiles != null && listFiles.length > 1) {
                for (File file : listFiles) {
                    if (!TextUtils.equals(file.getName(), com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo))) {
                        a(bundleInfo.getMachId(), file.getName(), file.getName().compareTo(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo)) > 0);
                    }
                }
                return;
            }
            com.sankuai.waimai.mach.manager_new.common.c.j(bundleInfo.getMachId() + " | 没有过期bundle，不需要删除");
        }
    }

    private void b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d10389263be57824466aed7d5b7398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d10389263be57824466aed7d5b7398");
        } else if (bundleInfo != null) {
            String a = com.sankuai.waimai.mach.manager_new.download.d.a();
            if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo)) {
                a = com.sankuai.waimai.mach.manager_new.download.d.b();
            }
            File[] listFiles = new File(a + File.separator + bundleInfo.getMachId()).listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                a(bundleInfo.getMachId(), file.getName(), false);
            }
        }
    }
}
