package com.sankuai.waimai.mach.manager_new.ioq;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends b<com.sankuai.waimai.mach.manager.cache.e> {
    public static ChangeQuickRedirect g;
    public com.sankuai.waimai.mach.manager.cache.e h;

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "TaskLoad";
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final int d() {
        return 10;
    }

    public g(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1be3ba193091c6149bf8b4df3ee173", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1be3ba193091c6149bf8b4df3ee173");
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d764c8bc9819df149bfa4550514bb86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d764c8bc9819df149bfa4550514bb86");
        } else {
            super.e();
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() throws Exception {
        DevSettings devSettings;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c955d41b128ba817451308da4c605a4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c955d41b128ba817451308da4c605a4a");
            return;
        }
        try {
            com.sankuai.waimai.mach.manager_new.common.c.a("bundle-load");
            com.sankuai.waimai.mach.model.data.a aVar = new com.sankuai.waimai.mach.model.data.a("mach_io_load_task");
            if (!this.b.b("load_for_future") && com.sankuai.waimai.mach.manager_new.d.a().c(b())) {
                com.sankuai.waimai.mach.manager_new.common.c.k("非Future | 已经缓存" + b());
                this.f = true;
                return;
            }
            BundleInfo c = c();
            String a = com.sankuai.waimai.mach.manager_new.download.d.a(c);
            if (com.sankuai.waimai.mach.common.i.a().h() && (devSettings = com.sankuai.waimai.mach.common.i.a().f) != null && devSettings.a(c.getMachId()) != null) {
                a = devSettings.a(c.getMachId()).bundleDir;
            }
            File file = new File(a);
            if (!file.exists()) {
                com.sankuai.waimai.mach.manager_new.monitor.a.a(a, "文件目录不存在");
                throw new Exception("文件目录不存在");
            }
            com.sankuai.waimai.mach.manager.cache.a a2 = a(file, c);
            if (a2 != null) {
                com.sankuai.waimai.mach.manager_new.common.c.k("本地bundle有效，加载到缓存 | " + com.sankuai.waimai.mach.manager_new.common.a.b(c));
                try {
                    if (!TextUtils.isEmpty(a2.f)) {
                        String a3 = com.sankuai.waimai.mach.manager_new.common.b.a(a + "/template.json.zip");
                        String a4 = com.sankuai.waimai.mach.manager_new.common.b.a(a + "/app.js.zip");
                        if (!TextUtils.isEmpty(a3)) {
                            this.h = new com.sankuai.waimai.mach.manager.cache.e(a2, c().getMachId(), a3, a4, false);
                        }
                    }
                } catch (Exception unused) {
                    com.dianping.codelog.b.b(g.class, "readZipTemplateFail", a2.b + "@" + a2.c);
                }
                if (this.h == null) {
                    this.h = new com.sankuai.waimai.mach.manager.cache.e(a2, c().getMachId(), false);
                }
                if (!this.h.c()) {
                    throw new a(10001, "bundle文件损坏");
                }
                if (!com.sankuai.waimai.mach.utils.e.c(this.h.k)) {
                    throw new Exception("模板不包含表达式3.0代码，请升级模板");
                }
                a((g) this.h);
                aVar.a("load_task");
                com.sankuai.waimai.mach.common.i.a().e().a(aVar);
                l.a(com.meituan.android.singleton.b.a, "mach_template", c.getMachId(), Long.valueOf(System.currentTimeMillis()));
                com.sankuai.waimai.mach.manager_new.b.a().f.add(c.getMachId());
                return;
            }
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d3f238168702f51e86d6b6f6d0d68e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d3f238168702f51e86d6b6f6d0d68e6");
            } else {
                com.sankuai.waimai.mach.manager_new.common.b.c(file);
                com.sankuai.waimai.mach.manager_new.d.a().a(c(), 1);
                com.sankuai.waimai.mach.manager_new.common.c.j("_IOTaskLoad | " + com.sankuai.waimai.mach.manager_new.common.a.b(c()) + "加载错误，删除本地文件");
            }
            com.sankuai.waimai.mach.manager_new.monitor.a.a(a, "读取内存缓存错误");
            throw new Exception("读取内存缓存错误");
        } finally {
            com.sankuai.waimai.mach.manager_new.common.c.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
        if (r13.length() > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
        if (r13.length() > 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.waimai.mach.manager.cache.a a(java.io.File r13, com.sankuai.waimai.mach.manager.download.update.BundleInfo r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.manager_new.ioq.g.a(java.io.File, com.sankuai.waimai.mach.manager.download.update.BundleInfo):com.sankuai.waimai.mach.manager.cache.a");
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13a476098d83ba51b446a969b3f4289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13a476098d83ba51b446a969b3f4289");
            return;
        }
        if (!this.f) {
            com.sankuai.waimai.mach.manager_new.d.a().a(b(), 4);
        }
        if (this.h != null) {
            com.meituan.crashreporter.c.a("mach").b(this.h.j, this.h.a());
        }
        super.g();
    }
}
