package com.sankuai.waimai.irmo.resource.loader;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.d;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.l;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.c;
import com.sankuai.waimai.irmo.resource.api.b;
import com.sankuai.waimai.irmo.resource.bean.IrmoResource;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    final d b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b268470b91b7073f9a2037d8ba3f2e48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b268470b91b7073f9a2037d8ba3f2e48");
            return;
        }
        g.a(com.meituan.android.singleton.b.a, new l() { // from class: com.sankuai.waimai.irmo.resource.loader.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUuid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db6312ea25034aa8d1dba3b349caa3d2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db6312ea25034aa8d1dba3b349caa3d2") : com.sankuai.waimai.irmo.a.a().c != null ? com.sankuai.waimai.irmo.a.a().c.h : "";
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "264c479ab6c2c54c397c0ce0d7b6774e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "264c479ab6c2c54c397c0ce0d7b6774e") : com.sankuai.waimai.irmo.a.a().c != null ? com.sankuai.waimai.irmo.a.a().c.l : "";
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f8e564cf1aa457384eecc8219861ba7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f8e564cf1aa457384eecc8219861ba7") : com.sankuai.waimai.irmo.a.a().c != null ? com.sankuai.waimai.irmo.a.a().c.k : "";
            }

            @Override // com.meituan.met.mercury.load.core.l
            public final int getMobileAppId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "822b85566478a409e4e8cbe1e9406c9c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "822b85566478a409e4e8cbe1e9406c9c")).intValue() : c.a(com.meituan.android.singleton.b.a);
            }
        });
        this.b = g.a("irmo");
        if (this.b != null) {
            boolean c = com.sankuai.waimai.irmo.resource.a.a().c();
            this.b.c = c;
            com.sankuai.waimai.irmo.utils.d.c("DDIrmoLoader & cat  设置test环境: " + c, new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.irmo.resource.api.b
    public final void a(String str, com.sankuai.waimai.irmo.resource.api.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec134d8deeced0db450c1f1389f0881a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec134d8deeced0db450c1f1389f0881a");
        } else if (this.b == null) {
            com.sankuai.waimai.irmo.utils.d.e("DDIrmoLoader loadIrmoResource error , loader == null , bundleId: " + str, new Object[0]);
            if (aVar != null) {
                aVar.a(10003, null);
            }
        } else if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.a(10001, null);
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            IrmoResource build = new IrmoResource.Builder().irmoBundleId(str).rootPath(IrmoResource.getUnZipPath(str)).fromCache(true).build();
            boolean a2 = com.sankuai.waimai.irmo.utils.c.a(build);
            com.sankuai.waimai.foundation.utils.log.a.b("INF_LOG", "检查资源耗时: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            if (a2) {
                if (aVar != null) {
                    aVar.a(build);
                }
            } else if (aVar != null) {
                aVar.a(10006, null);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.resource.api.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6b56f88f7d0bb878ac7e2e9184f6c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6b56f88f7d0bb878ac7e2e9184f6c3");
        } else if (this.b == null) {
        } else {
            this.b.b(new n() { // from class: com.sankuai.waimai.irmo.resource.loader.a.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.n
                public final void onSuccess(@Nullable List<DDResource> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e18fa358724211d9970f2bdd111c060f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e18fa358724211d9970f2bdd111c060f");
                    } else if (list == null || list.isEmpty()) {
                        com.sankuai.waimai.irmo.utils.d.d("预加载 请求 远端 所有 Bundle信息为空 ", new Object[0]);
                    } else {
                        HashSet hashSet = new HashSet();
                        for (DDResource dDResource : list) {
                            IrmoResource convert = IrmoResource.convert(dDResource);
                            if (convert == null) {
                                com.sankuai.waimai.irmo.utils.d.d("预加载 请求  Bundle信息 为null  或 bundle没有  bundleName信息 ", new Object[0]);
                                c.a(false, "", 10001, "1000");
                            } else if (convert.isExpired()) {
                                com.sankuai.waimai.irmo.utils.d.d("处理DD 预加载资源 irmobundleId: " + convert.irmoBundleId + "  资源已经过期,删除本地解压资源文件 : " + convert.rootPath, new Object[0]);
                                com.sankuai.waimai.irmo.utils.c.c(convert);
                                c.a(true, convert.irmoBundleId, 10002, "1000");
                            } else {
                                hashSet.add(convert.irmoBundleId);
                            }
                        }
                        if (hashSet.isEmpty()) {
                            com.sankuai.waimai.irmo.utils.d.d("预加载 过滤后 Bundle信息为空 ", new Object[0]);
                            return;
                        }
                        com.sankuai.waimai.irmo.utils.d.a("预加载 资源拉取  " + hashSet.toString(), new Object[0]);
                        final a aVar = a.this;
                        Object[] objArr3 = {hashSet};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "057ca84d23a3e0bafda2adb5bdf3125e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "057ca84d23a3e0bafda2adb5bdf3125e");
                        } else if (aVar.b == null) {
                            com.sankuai.waimai.irmo.utils.d.e("DDIrmoLoader preloadIrmoResources error , loader == null ", new Object[0]);
                        } else {
                            aVar.b.a(hashSet, DDLoadStrategy.NET_FIRST, new k() { // from class: com.sankuai.waimai.irmo.resource.loader.a.2
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.met.mercury.load.core.k
                                public final void onSuccess(@Nullable DDResource dDResource2) {
                                    Object[] objArr4 = {dDResource2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "72eb90040d809635d72fa178a4d20dfa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "72eb90040d809635d72fa178a4d20dfa");
                                        return;
                                    }
                                    a aVar2 = a.this;
                                    Object[] objArr5 = {dDResource2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "26be80611c083b2c334f6d6459d0aef1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "26be80611c083b2c334f6d6459d0aef1");
                                        return;
                                    }
                                    IrmoResource convert2 = IrmoResource.convert(dDResource2);
                                    if (convert2 == null) {
                                        com.sankuai.waimai.foundation.utils.log.a.b("INF_LOG", "processDDResponse error  irmoResource == null ", new Object[0]);
                                        c.a(false, "", 10001, "1000");
                                    } else if (com.sankuai.waimai.irmo.utils.c.b(convert2)) {
                                        com.sankuai.waimai.irmo.utils.d.c("processDDResponse " + convert2.irmoBundleId + " 资源已准备完毕 , 路径： " + convert2.rootPath, new Object[0]);
                                        c.a(true, convert2.irmoBundleId, 0, "1000");
                                    } else {
                                        com.sankuai.waimai.irmo.utils.d.e("processDDResponse " + convert2.irmoBundleId + " 资源解压失败", new Object[0]);
                                        c.a(false, convert2.irmoBundleId, 10004, "1000");
                                    }
                                }

                                @Override // com.meituan.met.mercury.load.core.k
                                public final void onFail(Exception exc) {
                                    Object[] objArr4 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b47d30836545b4d1e6c9fc5d84e39074", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b47d30836545b4d1e6c9fc5d84e39074");
                                        return;
                                    }
                                    String str = exc instanceof f ? ((f) exc).d : "";
                                    StringBuilder sb = new StringBuilder(" 处理DD 预加载资源  id: ");
                                    sb.append(str);
                                    sb.append(" 异常: ");
                                    sb.append(exc != null ? exc.getMessage() : "");
                                    com.sankuai.waimai.irmo.utils.d.e(sb.toString(), new Object[0]);
                                    c.a(false, str, 10003, "1000");
                                }
                            });
                        }
                    }
                }

                @Override // com.meituan.met.mercury.load.core.n
                public final void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "191f3ee8a7074e12756fed42973a861e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "191f3ee8a7074e12756fed42973a861e");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("预加载 请求 失败    info: ");
                    sb.append(exc != null ? exc.getMessage() : "");
                    com.sankuai.waimai.irmo.utils.d.e(sb.toString(), new Object[0]);
                    c.a(false, "", 10005, "1000");
                }
            });
        }
    }
}
