package com.sankuai.waimai.mach.manager_new.download;

import android.os.SystemClock;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.manager.download.exception.DownloadException;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager_new.common.h;
import com.sankuai.waimai.mach.utils.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements f {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d848168a9198f5ab9942c618df76d0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d848168a9198f5ab9942c618df76d0d");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a = null;
        public static int b = 0;
        public static int c = 1;
        public static int d = 2;
        public static int e = 3;
        public static int f = 4;
        public static int g = 5;
        public static int h = 6;
        public static int i = 7;
        public static int j = 8;
        public static int k = 9;
        public static int l = 10;
        long[] m;
        private com.sankuai.waimai.mach.model.data.a n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3aa5336bb407a9809e6ea01c7a9e44", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3aa5336bb407a9809e6ea01c7a9e44");
            } else {
                this.m = new long[l];
            }
        }

        public final com.sankuai.waimai.mach.model.data.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e20fc7a71d13b1b160ba14d311ed00d", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.mach.model.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e20fc7a71d13b1b160ba14d311ed00d");
            }
            if (this.n == null) {
                this.n = new com.sankuai.waimai.mach.model.data.a("mach_download_v2_pef");
            }
            return this.n;
        }

        public final void a(int i2) {
            Object[] objArr = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb58583ace0dff76229746a20449990", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb58583ace0dff76229746a20449990");
            } else if (i2 < 0 || i2 > this.m.length - 1) {
            } else {
                this.m[i2] = SystemClock.elapsedRealtime();
            }
        }

        public final long b() {
            return this.m[d] - this.m[c];
        }

        public final long c() {
            return this.m[k] - this.m[b];
        }
    }

    private void a(BundleInfo bundleInfo, int i, String str) {
        Object[] objArr = {bundleInfo, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdfe94c93cd8f47f4b96987147c81433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdfe94c93cd8f47f4b96987147c81433");
            return;
        }
        a aVar = this.b.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (aVar != null) {
            aVar.a(i);
            aVar.a().a(str);
        }
    }

    public final void a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f429aa5b300cfe6a5531aa09ecc380d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f429aa5b300cfe6a5531aa09ecc380d8");
        } else {
            this.b.remove(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        }
    }

    private long m(BundleInfo bundleInfo) {
        a aVar;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b7bf6275bf9a20c963427b79c9d013", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b7bf6275bf9a20c963427b79c9d013")).longValue();
        }
        a aVar2 = this.b.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (aVar2 != null) {
            if (i.a().h()) {
                String b = com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo);
                Object[] objArr2 = {b};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "e6ec11cbfbf2177d2815fd9ae00360e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "e6ec11cbfbf2177d2815fd9ae00360e5");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("download", aVar2.b());
                        jSONObject.put(PayLabelConstants.KEY_LABEL_CHECK, aVar2.m[a.f] - aVar2.m[a.e]);
                        jSONObject.put("unzip", aVar2.m[a.h] - aVar2.m[a.g]);
                        jSONObject.put("move", aVar2.m[a.j] - aVar2.m[a.i]);
                        jSONObject.put("total", aVar2.c());
                        jSONObject.put("bname", b);
                        com.sankuai.waimai.mach.manager_new.common.c.c(jSONObject.toString());
                    } catch (Exception unused) {
                    }
                }
            }
            long c = aVar2.c();
            if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo) && com.sankuai.waimai.machpro.monitor.c.a() != null) {
                com.sankuai.waimai.machpro.monitor.c a2 = com.sankuai.waimai.machpro.monitor.c.a();
                String name = bundleInfo.getName();
                String bundleVersion = bundleInfo.getBundleVersion();
                Object[] objArr3 = {name, bundleVersion, new Long(c)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.monitor.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "6888f937da14316542ca8472c837c9da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "6888f937da14316542ca8472c837c9da");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("MPBundleDownloadTime", Long.valueOf(c));
                    Map<String, String> b2 = a2.b();
                    b2.put("bundle_name", name);
                    b2.put("bundle_version", bundleVersion);
                    b2.put("biz", a2.a(name));
                    if (a2.b != null) {
                        a2.b.a(hashMap, b2);
                    }
                }
                aVar = aVar2;
            } else {
                String machId = bundleInfo.getMachId();
                String bundleVersion2 = bundleInfo.getBundleVersion();
                String b3 = h.a().b();
                Object[] objArr4 = {new Long(c), machId, bundleVersion2, b3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                aVar = aVar2;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6592b361df5bd50908fc1806a8c96fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6592b361df5bd50908fc1806a8c96fc");
                } else if (i.a().h() || g.a(com.sankuai.waimai.mach.manager.monitor.a.a)) {
                    HashMap hashMap2 = new HashMap();
                    if (i.a().h()) {
                        hashMap2.put("MachDownloadTemplateTime_Test", Long.valueOf(c));
                    } else {
                        hashMap2.put("MachDownloadTemplateTime", Long.valueOf(c));
                    }
                    Map<String, String> c2 = i.a().c();
                    c2.put("template_id", machId);
                    c2.put("template_version", bundleVersion2);
                    c2.put(NetLogConstants.Tags.NETWORK_TYPE, b3);
                    i.a().e().a(hashMap2, c2);
                }
            }
            i.a().e().a(aVar.a());
            return c;
        }
        return 0L;
    }

    public final void a(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a33bc0ba99f8229eadbea79cbb14d48b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a33bc0ba99f8229eadbea79cbb14d48b");
        } else if (i.a().h() || g.a(com.sankuai.waimai.mach.manager.monitor.a.a)) {
            HashMap hashMap = new HashMap();
            if (z && !z2) {
                if (i.a().h()) {
                    hashMap.put("MachRetryDownloadTemplate_Test", Integer.valueOf(i));
                } else {
                    hashMap.put("MachRetryDownloadTemplate", Integer.valueOf(i));
                }
            } else if (i.a().h()) {
                hashMap.put("MachDownloadTemplate_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachDownloadTemplate", Integer.valueOf(i));
            }
            Map<String, String> c = i.a().c();
            c.put("template_id", str);
            c.put("template_version", str2);
            c.put(NetLogConstants.Tags.NETWORK_TYPE, str3);
            c.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, str4);
            i.a().e().a(hashMap, c);
        }
    }

    public final int b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5fc91977afe073e28f39e904df6a7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5fc91977afe073e28f39e904df6a7e")).intValue();
        }
        a aVar = this.b.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (aVar != null) {
            return (int) aVar.c();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void c(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3066a66810595de22a23054e87aeb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3066a66810595de22a23054e87aeb00");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.e("onDownStart | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a aVar = new a();
        aVar.a(a.b);
        this.b.put(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo), aVar);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void d(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadca2f1eb8735675969226aaa85b92a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadca2f1eb8735675969226aaa85b92a");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onDownLoadStepStart | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.c, "download_start");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void e(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b924921baf6f3cb4f56d427bffaa69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b924921baf6f3cb4f56d427bffaa69");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onDownloadStepSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.d, "download_success");
        Object[] objArr2 = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93c66355af3fd7cc3c99a428dc064b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93c66355af3fd7cc3c99a428dc064b90");
            return;
        }
        a aVar = this.b.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (aVar != null) {
            long b = aVar.b();
            String machId = bundleInfo.getMachId();
            String bundleVersion = bundleInfo.getBundleVersion();
            String b2 = h.a().b();
            Object[] objArr3 = {new Long(b), machId, bundleVersion, b2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c967464597063696c683eb181f71696", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c967464597063696c683eb181f71696");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("MachDownloadTemplateTimeJustDownload", Long.valueOf(b));
            Map<String, String> c = i.a().c();
            c.put("template_id", machId);
            c.put("template_version", bundleVersion);
            c.put(NetLogConstants.Tags.NETWORK_TYPE, b2);
            i.a().e().a(hashMap, c);
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void a(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda0f194bc75b2f99ed1484e91fc063b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda0f194bc75b2f99ed1484e91fc063b");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.f("onDownloadStepFail | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        e(bundleInfo, downloadException);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void f(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df5caa6a54cb1e2cae246e91e973b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df5caa6a54cb1e2cae246e91e973b3c");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onCheckStepStart | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.e, "check_start");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void g(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac8c036822322986b374f02581601c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac8c036822322986b374f02581601c0");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onCheckStepSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.f, "check_success");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void b(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5202944adda2da7782d642eb2395cb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5202944adda2da7782d642eb2395cb3b");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.f("onCheckStepFail | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        e(bundleInfo, downloadException);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void h(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a530715acd23b942ee0c19d71461a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a530715acd23b942ee0c19d71461a6");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onUnZipStepStart | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.g, "unzip_start");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void i(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4bac313e0b294b4f097519f7d06111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4bac313e0b294b4f097519f7d06111");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onUnZipStepSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.h, "unzip_success");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void c(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee72d6b65e654ee504cac04b292217fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee72d6b65e654ee504cac04b292217fa");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.f("onUnZipStepFail | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        e(bundleInfo, downloadException);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void j(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7e5f611304c7a490dc6e81630dc6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7e5f611304c7a490dc6e81630dc6bf");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onMoveStepStart | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.i, "move_start");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void k(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56187a7fabf78e2ed8f58b3320879fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56187a7fabf78e2ed8f58b3320879fc");
            return;
        }
        com.sankuai.waimai.mach.manager_new.d.a().a(bundleInfo, 3);
        com.sankuai.waimai.mach.manager_new.common.c.h("onMoveStepSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.j, "move_success");
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public final void d(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042152d114375d2b8fd2e9b14c604272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042152d114375d2b8fd2e9b14c604272");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.h("onMoveStepFail | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        e(bundleInfo, downloadException);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public void l(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be42011d4adcb4695d3cdedc931abb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be42011d4adcb4695d3cdedc931abb7");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.e("onDownSuccess | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a(bundleInfo, a.k, "finish");
        m(bundleInfo);
    }

    @Override // com.sankuai.waimai.mach.manager_new.download.f
    public void e(BundleInfo bundleInfo, DownloadException downloadException) {
        Object[] objArr = {bundleInfo, downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2bb73238a74d34af3d196ea47300305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2bb73238a74d34af3d196ea47300305");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.b("onDownFail | 下载失败 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        a aVar = this.b.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (aVar != null) {
            aVar.a(a.k);
        }
    }
}
