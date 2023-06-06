package com.sankuai.waimai.machpro.bundle;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.mach.manager.cache.d;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager_new.b;
import com.sankuai.waimai.mach.manager_new.d;
import com.sankuai.waimai.mach.manager_new.ioq.j;
import com.sankuai.waimai.machpro.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.manager_new.ioq.b<Boolean> {
    public static ChangeQuickRedirect g;
    public c h;
    public Map<b.C1016b, a> i;

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "TaskLoadMachPro";
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final int d() {
        return 10;
    }

    public b(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae85507330d9c9a377210c8f3bf3f1e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae85507330d9c9a377210c8f3bf3f1e1");
        } else {
            this.i = new HashMap();
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() throws Exception {
        DevSettings devSettings;
        DevSettings devSettings2;
        DevSettings devSettings3;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67de796b3d878f653136cdda7a9a7e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67de796b3d878f653136cdda7a9a7e07");
            return;
        }
        super.f();
        BundleInfo c = c();
        if (f.a().i.i && (devSettings3 = i.a().f) != null && devSettings3.a(c.getMachId()) != null) {
            z = true;
        }
        boolean b = this.b.b("load_for_future");
        if (!h() && !b && !z && d.a().c(b())) {
            com.sankuai.waimai.mach.manager_new.common.c.k("非Future | 已经缓存" + b());
            this.f = true;
            return;
        }
        String str = com.sankuai.waimai.mach.manager_new.download.d.b() + File.separator + c.getMachId();
        if ("1".equals(c.getBundleType())) {
            if (f.a().i.i && (devSettings2 = i.a().f) != null && devSettings2.a(c.getMachId()) != null) {
                this.i = a(devSettings2.a(c.getMachId()).bundleDir, devSettings2.a(c.getMachId()).version, c);
                a((b) Boolean.TRUE);
                return;
            }
            this.i = a(c, str);
        } else {
            String str2 = str + File.separator + com.sankuai.waimai.mach.manager_new.common.a.b(c);
            String bundleVersion = c.getBundleVersion();
            if (f.a().i.i && (devSettings = i.a().f) != null && devSettings.a(c.getMachId()) != null) {
                str2 = devSettings.a(c.getMachId()).bundleDir;
                bundleVersion = devSettings.a(c.getMachId()).version;
            }
            this.h = a(str2, c.getMachId(), bundleVersion);
        }
        a((b) Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<com.sankuai.waimai.mach.manager_new.b.C1016b, com.sankuai.waimai.machpro.bundle.b.a> a(com.sankuai.waimai.mach.manager.download.update.BundleInfo r23, java.lang.String r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.bundle.b.a(com.sankuai.waimai.mach.manager.download.update.BundleInfo, java.lang.String):java.util.Map");
    }

    public static boolean a(b.C1016b c1016b, String str, String str2) {
        Object[] objArr = {c1016b, str, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f802c86caf86bced5faab61b29d58794", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f802c86caf86bced5faab61b29d58794")).booleanValue();
        }
        if (c1016b == null || c1016b.d == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (c1016b.d.f == null || com.sankuai.waimai.machpro.util.b.c((List) c1016b.d.f.c)) {
            return true;
        }
        boolean z = false;
        for (d.a aVar : c1016b.d.f.c) {
            if (aVar != null && TextUtils.equals(aVar.d, str)) {
                if (com.sankuai.waimai.machpro.util.b.a(aVar.b, str2) >= 0 && com.sankuai.waimai.machpro.util.b.a(aVar.c, str2) <= 0) {
                    return true;
                }
                z = true;
            }
        }
        return !z;
    }

    private Map<b.C1016b, a> a(String str, String str2, BundleInfo bundleInfo) {
        c cVar;
        Object[] objArr = {str, str2, bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17a52453369fc5ae09ca3cd6640501a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17a52453369fc5ae09ca3cd6640501a");
        }
        LinkedList<b.C1016b> linkedList = new LinkedList();
        if (com.sankuai.waimai.mach.manager_new.b.a().a(bundleInfo.getMachId()) != null) {
            linkedList.addAll(com.sankuai.waimai.mach.manager_new.b.a().a(bundleInfo.getMachId()));
        }
        if (linkedList.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            cVar = a(str, bundleInfo.getMachId(), str2);
        } catch (Exception e) {
            e.printStackTrace();
            cVar = null;
        }
        for (b.C1016b c1016b : linkedList) {
            hashMap.put(c1016b, new a(bundleInfo, cVar));
        }
        return hashMap;
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad182261e13ffa3aee5a82254d7657b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad182261e13ffa3aee5a82254d7657b")).booleanValue();
        }
        BundleInfo c = c();
        return c != null && "1".equals(c.getBundleType());
    }

    private c a(String str, String str2, String str3) throws Exception {
        byte[] a2;
        boolean z = false;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd9fa5e89c8ba07ff847ee784f8bc019", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd9fa5e89c8ba07ff847ee784f8bc019");
        }
        File file = new File(str);
        if (!file.exists()) {
            com.sankuai.waimai.mach.manager_new.monitor.a.a(str, "文件目录不存在");
            throw new Exception("文件目录不存在");
        }
        c cVar = new c();
        cVar.d = str2;
        cVar.e = str3;
        cVar.a = str2;
        cVar.g = str;
        Gson gson = new Gson();
        com.sankuai.waimai.mach.manager.cache.d dVar = (com.sankuai.waimai.mach.manager.cache.d) gson.fromJson(com.sankuai.waimai.mach.manager_new.common.a.c(str + File.separator + "meta.json"), (Class<Object>) com.sankuai.waimai.mach.manager.cache.d.class);
        if (dVar == null || dVar.a == null) {
            a(file);
            throw new Exception("bundle文件损坏-->缺少meta.json");
        } else if (!TextUtils.equals(dVar.b, "2021-03-27")) {
            a(file);
            throw new Exception("MachPro 加载Bundle异常-->quickjs版本号不一致");
        } else {
            cVar.f = dVar;
            String a3 = com.sankuai.waimai.mach.manager_new.common.b.a(str + "/bundle.css.json.zip");
            if (TextUtils.isEmpty(a3)) {
                a3 = com.sankuai.waimai.mach.manager_new.common.a.c(str + File.separator + "bundle.css.json");
            }
            if (a3 != null) {
                a3 = a3.trim();
            }
            if (TextUtils.isEmpty(a3)) {
                a(file);
                throw new Exception("MachPro 加载Bundle异常-->缺少css文件");
            }
            String a4 = com.sankuai.waimai.mach.utils.a.a(a3);
            if (!TextUtils.isEmpty(a4) && !TextUtils.equals(dVar.a.b, a4)) {
                a(file);
                throw new Exception("MachPro 加载Bundle异常-->css文件md5校验失败");
            }
            cVar.b = (Map) new Gson().fromJson(a3, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.machpro.bundle.b.2
            }.getType());
            InputStream b = com.sankuai.waimai.mach.manager_new.common.b.b(str + "/bundle.qbc.zip");
            if (b != null) {
                a2 = com.sankuai.waimai.machpro.util.b.a(b);
                if (a2 == null || a2.length <= 0) {
                    a(file);
                    throw new Exception("MachPro 加载Bundle异常-->字节码文件为空");
                } else if (!com.sankuai.waimai.mach.utils.a.a(a2).equals(dVar.a.a)) {
                    a(file);
                    throw new Exception("MachPro 加载Bundle异常-->字节码文件md5校验失败");
                }
            } else {
                File file2 = new File(str + File.separator + "bundle.qbc");
                if (!file2.exists()) {
                    a(file);
                    throw new Exception("MachPro 加载Bundle异常-->缺少字节码文件");
                }
                String str4 = dVar.a.a;
                Object[] objArr2 = {file2, str4};
                ChangeQuickRedirect changeQuickRedirect2 = g;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c01415c13a15b6d3294a4dba80b753e", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c01415c13a15b6d3294a4dba80b753e")).booleanValue();
                } else {
                    String a5 = com.sankuai.waimai.mach.utils.a.a(file2);
                    if (TextUtils.isEmpty(a5) || TextUtils.equals(a5, str4)) {
                        z = true;
                    }
                }
                if (!z) {
                    a(file);
                    throw new Exception("MachPro 加载Bundle异常-->字节码文件md5校验失败");
                }
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        a2 = com.sankuai.waimai.machpro.util.b.a((InputStream) fileInputStream2);
                        com.sankuai.waimai.mach.manager_new.common.b.a(fileInputStream2);
                        if (a2 == null || a2.length <= 0) {
                            a(file);
                            throw new Exception("MachPro 加载Bundle异常-->字节码文件为空");
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        com.sankuai.waimai.mach.manager_new.common.b.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            cVar.c = a2;
            l.a(com.meituan.android.singleton.b.a, "mach_template", cVar.j, Long.valueOf(System.currentTimeMillis()));
            com.sankuai.waimai.mach.manager_new.b.a().f.add(cVar.j);
            return cVar;
        }
    }

    private void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608357d6e5e29be3ba70727749c06380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608357d6e5e29be3ba70727749c06380");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.b.c(file);
        com.sankuai.waimai.mach.manager_new.d.a().a(c(), 1);
        com.sankuai.waimai.mach.manager_new.common.c.j("IOTaskLoadMachPro | " + com.sankuai.waimai.mach.manager_new.common.a.b(c()) + "加载错误，删除本地文件");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public c a;
        public BundleInfo b;

        public a(BundleInfo bundleInfo, c cVar) {
            this.b = bundleInfo;
            this.a = cVar;
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979bc5601f114af77aafd9e8d8ed66a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979bc5601f114af77aafd9e8d8ed66a5");
            return;
        }
        if (!this.f) {
            com.sankuai.waimai.mach.manager_new.d.a().a(b(), 4);
        }
        super.g();
    }
}
