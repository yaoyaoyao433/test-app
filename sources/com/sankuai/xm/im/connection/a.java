package com.sankuai.xm.im.connection;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.d;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.datamigrate.a;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.message.opposite.OppositeController;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.login.manager.g;
import com.sankuai.xm.login.manager.h;
import com.sankuai.xm.network.NetCheckManager;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class a extends h implements com.sankuai.xm.base.component.a, d, g, NetCheckManager.a {
    public static ChangeQuickRedirect a;
    private b b;
    private final Object c;
    private e d;
    private c g;
    private long h;
    private e i;
    private e j;
    private final ConcurrentHashMap<String, Object> k;
    private final Object l;

    private e d() {
        if (this.i == null) {
            synchronized (this.l) {
                if (this.i == null) {
                    this.i = new e(l.class, "mListenerService", this);
                }
            }
        }
        return this.i;
    }

    private e e() {
        if (this.j == null) {
            synchronized (this.l) {
                if (this.j == null) {
                    this.j = new e(C1386a.class, "mSyncListener", this);
                }
            }
        }
        return this.j;
    }

    @Override // com.sankuai.xm.login.manager.h, com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object obj;
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b8d4f28f634d50fee91857555e6a28", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b8d4f28f634d50fee91857555e6a28");
        }
        if ("mConnectionClient".equals(str) && cls == com.sankuai.xm.login.c.class) {
            obj = com.sankuai.xm.login.c.a();
        } else if ("mSyncListener".equals(str) && cls == C1386a.class) {
            Object[] objArr2 = (Object[]) this.k.remove("mSyncListener");
            obj = new C1386a();
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = super.a(str, cls, bVar);
        }
        if (obj instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) obj).a(bVar);
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // com.sankuai.xm.login.manager.h, com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f3ff2a6e1f931295b2561e1be3cca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f3ff2a6e1f931295b2561e1be3cca5");
        } else if (bVar != null) {
            b().a(bVar);
            d().a(bVar);
            e().a(bVar);
        }
    }

    public final e b() {
        if (this.d == null) {
            synchronized (this.l) {
                if (this.d == null) {
                    this.d = new e(com.sankuai.xm.login.c.class, "mConnectionClient", this);
                }
            }
        }
        return this.d;
    }

    public static /* synthetic */ void a(a aVar, Boolean bool, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        com.sankuai.xm.im.datamigrate.a aVar2;
        boolean z4;
        Object[] objArr = {bool, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d9b967c2d34abd3bf4dc55dfac534b0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d9b967c2d34abd3bf4dc55dfac534b0c");
        } else if (j != 0) {
            boolean a2 = com.sankuai.xm.im.cache.a.c().a(j);
            if (a2) {
                com.sankuai.xm.im.message.b c = com.sankuai.xm.im.message.b.c();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.b.h;
                if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "33d41a8259e5df5df571a2bd551f9cc2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "33d41a8259e5df5df571a2bd551f9cc2");
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.message.b.h;
                    if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "259f76faf9e82d1226e21809ac452006", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "259f76faf9e82d1226e21809ac452006");
                    } else {
                        c.a(com.sankuai.xm.im.message.b.d(), true, false);
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.im.message.b.h;
                    if (PatchProxy.isSupport(objArr4, c, changeQuickRedirect4, false, "2c5873a45894917dff8fd9a64af6b943", 6917529027641081856L)) {
                        z4 = ((Boolean) PatchProxy.accessDispatch(objArr4, c, changeQuickRedirect4, false, "2c5873a45894917dff8fd9a64af6b943")).booleanValue();
                    } else {
                        String e = c.e();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.im.message.b.h;
                        z4 = (TextUtils.isEmpty(e) || TextUtils.equals(e, PatchProxy.isSupport(objArr5, c, changeQuickRedirect5, false, "15f06d96cda05bddce4ae4a081a7bc59", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr5, c, changeQuickRedirect5, false, "15f06d96cda05bddce4ae4a081a7bc59") : com.sankuai.xm.im.utils.b.a().getString(com.sankuai.xm.im.message.b.d(), ""))) ? false : true;
                    }
                    if (z4) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.im.message.b.h;
                        if (PatchProxy.isSupport(objArr6, c, changeQuickRedirect6, false, "667b4662e5bc457abd53664df4e9b808", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr6, c, changeQuickRedirect6, false, "667b4662e5bc457abd53664df4e9b808");
                        } else {
                            com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a(com.sankuai.xm.im.message.b.d(), c.e()));
                        }
                        IMClient.a().a(-1);
                    }
                }
            } else {
                com.sankuai.xm.im.cache.a.c().d();
            }
            if (!bool.booleanValue()) {
                IMClient a3 = IMClient.a();
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = IMClient.a;
                if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "0478bb42a3e86e1535c88ce4493a5fd7", 6917529027641081856L)) {
                    aVar2 = (com.sankuai.xm.im.datamigrate.a) PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "0478bb42a3e86e1535c88ce4493a5fd7");
                } else {
                    a3.A();
                    aVar2 = (com.sankuai.xm.im.datamigrate.a) a3.G().a();
                }
                Object[] objArr8 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.xm.im.datamigrate.a.a;
                if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "8b20fcfc1ed59dca390713960f4fafb4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "8b20fcfc1ed59dca390713960f4fafb4");
                } else {
                    if (com.sankuai.xm.base.db.g.a().c()) {
                        com.sankuai.xm.im.utils.a.b("DataMigrateProcessor::onEnd migrate clear cache", new Object[0]);
                        aVar2.c();
                        com.sankuai.xm.base.db.g.a().d();
                    }
                    if (com.sankuai.xm.login.a.a().m() != 1) {
                        com.sankuai.xm.im.utils.b a4 = com.sankuai.xm.im.utils.b.a();
                        if (a4.getLong("xm_sdk_db_upgrade_12_init_" + j, 0L) > 0) {
                            DBProxy.l().a(new a.C1387a(DBProxy.l().bR_(), j).a(LocationStrategy.LOCATION_TIMEOUT));
                        }
                    }
                }
                com.sankuai.xm.im.message.d i = IMClient.a().i();
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.xm.im.message.d.a;
                if (PatchProxy.isSupport(objArr9, i, changeQuickRedirect9, false, "6bed77ea840fcb2b143a5d73a1897081", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr9, i, changeQuickRedirect9, false, "6bed77ea840fcb2b143a5d73a1897081");
                } else {
                    i.h().e();
                }
            }
            aVar.a(a2, false, j);
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, aVar, changeQuickRedirect10, false, "e2bf26240f40b547bd6405dee8976954", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr10, aVar, changeQuickRedirect10, false, "e2bf26240f40b547bd6405dee8976954");
                return;
            }
            IMClient.a().j().d();
            com.sankuai.xm.im.message.d i2 = IMClient.a().i();
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr11, i2, changeQuickRedirect11, false, "8133a6470b0c4bcf09f6c7db78a44dd3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr11, i2, changeQuickRedirect11, false, "8133a6470b0c4bcf09f6c7db78a44dd3");
            } else {
                i2.a(1);
                i2.a(2);
            }
            com.sankuai.xm.im.message.d i3 = IMClient.a().i();
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr12, i3, changeQuickRedirect12, false, "b459d8a0ccc4e6fd2ffee9d18eac00b5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr12, i3, changeQuickRedirect12, false, "b459d8a0ccc4e6fd2ffee9d18eac00b5");
            } else {
                OppositeController e2 = i3.e();
                Object[] objArr13 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect13 = OppositeController.b;
                if (PatchProxy.isSupport(objArr13, e2, changeQuickRedirect13, false, "7df3753113670b959ccdf684b192de22", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr13, e2, changeQuickRedirect13, false, "7df3753113670b959ccdf684b192de22");
                } else {
                    e2.g();
                    e2.e();
                    e2.f();
                    Object[] objArr14 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect14 = OppositeController.b;
                    if (PatchProxy.isSupport(objArr14, e2, changeQuickRedirect14, false, "410c9686d4ce055dfd7cc3bf0a571f48", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr14, e2, changeQuickRedirect14, false, "410c9686d4ce055dfd7cc3bf0a571f48");
                    } else if (com.sankuai.xm.im.c.a(c.b.PEER_CHAT)) {
                        Object[] objArr15 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect15 = OppositeController.b;
                        if (PatchProxy.isSupport(objArr15, e2, changeQuickRedirect15, false, "5dd8b1aff6176ea94b8ef7d8c19099f8", 6917529027641081856L)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr15, e2, changeQuickRedirect15, false, "5dd8b1aff6176ea94b8ef7d8c19099f8")).booleanValue();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Object[] objArr16 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect16 = OppositeController.b;
                            long longValue = PatchProxy.isSupport(objArr16, e2, changeQuickRedirect16, false, "ac65accfca82737dd11a830862dcf2a2", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr16, e2, changeQuickRedirect16, false, "ac65accfca82737dd11a830862dcf2a2")).longValue() : com.sankuai.xm.base.e.a().getLong(e2.c(), 0L);
                            z = currentTimeMillis <= longValue || currentTimeMillis - longValue >= DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
                        }
                        if (z) {
                            e2.d();
                            String a5 = com.sankuai.xm.im.http.a.a("/msg/api/read/v1/config/im/opposite");
                            HashMap hashMap = new HashMap();
                            hashMap.put("ai", Short.valueOf(IMClient.a().g()));
                            com.sankuai.xm.im.utils.a.b("OppositeController::requestConfig url:%s", a5);
                            com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a5, hashMap, new OppositeController.a());
                            dVar.b(1);
                            com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                        }
                    }
                    e2.a();
                }
                PubOppositeController f = i3.f();
                Object[] objArr17 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect17 = PubOppositeController.b;
                if (PatchProxy.isSupport(objArr17, f, changeQuickRedirect17, false, "d72fee5fc75e2da5e70287b7e998f57e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr17, f, changeQuickRedirect17, false, "d72fee5fc75e2da5e70287b7e998f57e");
                } else {
                    f.h();
                    f.f();
                    f.g();
                    Object[] objArr18 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect18 = PubOppositeController.b;
                    if (PatchProxy.isSupport(objArr18, f, changeQuickRedirect18, false, "3fe860a0e34ec8cb54e7683ac1f3a29f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr18, f, changeQuickRedirect18, false, "3fe860a0e34ec8cb54e7683ac1f3a29f");
                    } else if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
                        Object[] objArr19 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect19 = PubOppositeController.b;
                        if (PatchProxy.isSupport(objArr19, f, changeQuickRedirect19, false, "71106121c11e7bf283fe1aa8b7a537a8", 6917529027641081856L)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr19, f, changeQuickRedirect19, false, "71106121c11e7bf283fe1aa8b7a537a8")).booleanValue();
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            Object[] objArr20 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect20 = PubOppositeController.b;
                            long longValue2 = PatchProxy.isSupport(objArr20, f, changeQuickRedirect20, false, "5dd1e431e1ab74ab3da14469b56badbd", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr20, f, changeQuickRedirect20, false, "5dd1e431e1ab74ab3da14469b56badbd")).longValue() : com.sankuai.xm.base.e.a().getLong(f.e(), 0L);
                            z2 = currentTimeMillis2 <= longValue2 || currentTimeMillis2 - longValue2 >= DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
                        }
                        if (z2) {
                            String a6 = com.sankuai.xm.im.http.a.a("/pubread/v1/user/chat/config/tenant/opposite");
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("appid", Short.valueOf(IMClient.a().g()));
                            hashMap2.put("svid", (short) 410);
                            com.sankuai.xm.im.utils.a.b("PubOppositeController::requestConfig url:%s", a6);
                            com.sankuai.xm.base.d dVar2 = new com.sankuai.xm.base.d(a6, hashMap2, new PubOppositeController.a());
                            dVar2.b(1);
                            com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar2, 0L);
                        }
                    }
                    f.d();
                }
                GroupOppositeController g = i3.g();
                Object[] objArr21 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect21 = GroupOppositeController.b;
                if (PatchProxy.isSupport(objArr21, g, changeQuickRedirect21, false, "9dab1f35278e0b673bf55d9037adb99f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr21, g, changeQuickRedirect21, false, "9dab1f35278e0b673bf55d9037adb99f");
                } else {
                    com.sankuai.xm.im.utils.a.b("%s::loginSuccessHandle", "GroupOppositeController");
                    g.c();
                    g.d();
                    Object[] objArr22 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect22 = GroupOppositeController.b;
                    if (PatchProxy.isSupport(objArr22, g, changeQuickRedirect22, false, "e3a4e4fa0f9298fedbd14c03d81049d8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr22, g, changeQuickRedirect22, false, "e3a4e4fa0f9298fedbd14c03d81049d8");
                    } else {
                        if (com.sankuai.xm.im.c.a(c.b.GROUP_CHAT)) {
                            Object[] objArr23 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect23 = GroupOppositeController.b;
                            if (PatchProxy.isSupport(objArr23, g, changeQuickRedirect23, false, "cdc522ad0caf2b00dab9f9cf19d14014", 6917529027641081856L)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr23, g, changeQuickRedirect23, false, "cdc522ad0caf2b00dab9f9cf19d14014")).booleanValue();
                            } else {
                                long currentTimeMillis3 = System.currentTimeMillis();
                                Object[] objArr24 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect24 = GroupOppositeController.b;
                                long longValue3 = PatchProxy.isSupport(objArr24, g, changeQuickRedirect24, false, "bc926e8c3a4ce784136afa93c04c859a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr24, g, changeQuickRedirect24, false, "bc926e8c3a4ce784136afa93c04c859a")).longValue() : com.sankuai.xm.base.e.a().getLong(g.e(), 0L);
                                z3 = currentTimeMillis3 <= longValue3 || currentTimeMillis3 - longValue3 >= DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
                            }
                            if (z3) {
                                String a7 = com.sankuai.xm.im.http.a.a("/receipt/api/v1/group/config");
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("appid", Short.valueOf(IMClient.a().g()));
                                com.sankuai.xm.im.utils.a.b("%s::requestConfig url:%s appid:%d", "GroupOppositeController", a7, Short.valueOf(IMClient.a().g()));
                                com.sankuai.xm.base.d dVar3 = new com.sankuai.xm.base.d(a7, hashMap3, new GroupOppositeController.b());
                                dVar3.b(1);
                                com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar3, 0L);
                            }
                        }
                        com.sankuai.xm.im.utils.a.b("%s::requestConfig not reach time", "GroupOppositeController");
                    }
                    g.a();
                }
            }
            com.sankuai.xm.file.proxy.b b = com.sankuai.xm.file.proxy.b.b();
            Object[] objArr25 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect25 = com.sankuai.xm.file.proxy.b.a;
            if (PatchProxy.isSupport(objArr25, b, changeQuickRedirect25, false, "a407730f655542a6b7170ca94c8c560a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr25, b, changeQuickRedirect25, false, "a407730f655542a6b7170ca94c8c560a");
            } else if (b.e) {
                b.c();
            }
            com.sankuai.xm.im.message.api.b b2 = com.sankuai.xm.im.message.api.b.b();
            Object[] objArr26 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect26 = com.sankuai.xm.im.message.api.b.a;
            if (PatchProxy.isSupport(objArr26, b2, changeQuickRedirect26, false, "8ca16623b438beb6cb2f03ba4b158e70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr26, b2, changeQuickRedirect26, false, "8ca16623b438beb6cb2f03ba4b158e70");
                return;
            }
            b2.c();
            Object[] objArr27 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect27 = com.sankuai.xm.im.message.api.b.a;
            long longValue4 = PatchProxy.isSupport(objArr27, b2, changeQuickRedirect27, false, "bea2590861d73f5585949a702600fa04", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr27, b2, changeQuickRedirect27, false, "bea2590861d73f5585949a702600fa04")).longValue() : com.sankuai.xm.base.e.a().getLong(b2.a("time"), 0L);
            if (longValue4 == 0 || System.currentTimeMillis() - longValue4 >= 86400000) {
                b2.b(System.currentTimeMillis());
                b2.a(com.sankuai.xm.im.http.a.a("/msg/api/pub/v1/addition/config"), longValue4, 3);
                b2.a(com.sankuai.xm.im.http.a.a("/msg/api/chat/v1/addition/config"), longValue4, 1, 2);
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1131baceeba8e1302967ecc9fe2e5c52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1131baceeba8e1302967ecc9fe2e5c52");
            return;
        }
        this.k = new ConcurrentHashMap<>();
        this.l = new Object();
        this.c = new Object();
        this.b = b.DISCONNECTED;
        this.d = null;
        this.k.put("mSyncListener", com.sankuai.xm.base.component.c.a(this, null));
        this.j = null;
        ((l) d().a()).a(g.class).a((l.a) this);
        ((l) d().a()).a(IMClient.n.class).a(Integer.MAX_VALUE).a((l.a) ((C1386a) e().a()));
        NetCheckManager.a().a(this);
        this.i = null;
    }

    private c c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f6c3e64f71b436853ca03d58284daf", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f6c3e64f71b436853ca03d58284daf");
        }
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = new c();
                }
            }
        }
        return this.g;
    }

    public final b a() {
        b bVar;
        synchronized (this.c) {
            bVar = this.b;
        }
        return bVar;
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void c(int i) {
        b bVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879ef604f2d267796a8e27ef8c54182e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879ef604f2d267796a8e27ef8c54182e");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4ef697987823e0f1f1e04b2608bc5ed", 6917529027641081856L)) {
            bVar = null;
            switch (i) {
                case -7:
                case -6:
                case -1:
                case 0:
                    bVar = b.DISCONNECTED;
                    break;
                case -5:
                case 1:
                case 2:
                case 3:
                case 5:
                    bVar = b.CONNECTING;
                    break;
                case -4:
                    bVar = b.AUTH_FAILURE;
                    break;
                case -3:
                    bVar = b.LOGOFF;
                    break;
                case -2:
                    bVar = b.KICKOFF;
                    break;
                case 4:
                    bVar = b.CONNECTED;
                    break;
            }
        } else {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4ef697987823e0f1f1e04b2608bc5ed");
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(final int i, final byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0079e7ff6dfe643d68e5cc99d519d569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0079e7ff6dfe643d68e5cc99d519d569");
            return;
        }
        if (i != 196717 ? c().a(i, bArr) : true) {
            return;
        }
        ((l) m.a(l.class)).b(IMClient.h.class).a(new b.a<IMClient.h>() { // from class: com.sankuai.xm.im.connection.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.h hVar) {
                Object[] objArr2 = {hVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93cdc16c27245e33bd60dbdf9b23730c", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93cdc16c27245e33bd60dbdf9b23730c")).booleanValue();
                }
                return false;
            }
        });
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c29fda7c8853e478fe4fbca772467a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c29fda7c8853e478fe4fbca772467a6");
        } else if (cVar == null) {
            com.sankuai.xm.im.utils.a.d("ConnectManager::onAuth error null", new Object[0]);
        } else if (cVar.a() == 0) {
            if (b(0)) {
                a(cVar.b(), cVar.c(), cVar.e(), cVar.d());
                return;
            }
            com.sankuai.xm.im.utils.b.a().a(f.m().g(), 0L, ((com.sankuai.xm.login.c) b().a()).d());
            DBProxy.l().q();
            b(cVar.b(), cVar.c(), cVar.e(), cVar.d());
        } else {
            e(cVar.a());
        }
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7071ecd26824c69c6c3f456336ae0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7071ecd26824c69c6c3f456336ae0b");
            return;
        }
        IMClient.a().a((String) null);
        com.sankuai.xm.monitor.c.a(0L);
        if (!z) {
            DBProxy.l().q();
        }
        ((l) d().a()).b(IMClient.d.class).a(new b.a<IMClient.d>() { // from class: com.sankuai.xm.im.connection.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.d dVar) {
                IMClient.d dVar2 = dVar;
                Object[] objArr2 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "384392944423b86f77196d94c2c97293", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "384392944423b86f77196d94c2c97293")).booleanValue();
                }
                dVar2.a(z);
                return false;
            }
        });
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(final long j, final int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b4f885a4638b845102614d4e89d814", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b4f885a4638b845102614d4e89d814");
            return;
        }
        if (j == this.h) {
            IMClient.a().a((String) null);
        }
        ((l) d().a()).b(IMClient.d.class).a(new b.a<IMClient.d>() { // from class: com.sankuai.xm.im.connection.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.d dVar) {
                IMClient.d dVar2 = dVar;
                Object[] objArr2 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ebf77dbc5a698b696ab4516152ec56f", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ebf77dbc5a698b696ab4516152ec56f")).booleanValue();
                }
                dVar2.a(j, i);
                return false;
            }
        });
    }

    @Override // com.sankuai.xm.network.NetCheckManager.a
    public final void a(NetworkInfo networkInfo) {
        Object[] objArr = {networkInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045e4269acc693826205b8f0da248e98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045e4269acc693826205b8f0da248e98");
        } else if (networkInfo == null || !networkInfo.isConnected()) {
            a(b.NONE_NET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6d873166ae773aee7b092a900482be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6d873166ae773aee7b092a900482be");
        } else {
            ((l) d().a()).b(IMClient.d.class).a(new b.a<IMClient.d>() { // from class: com.sankuai.xm.im.connection.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.d dVar) {
                    IMClient.d dVar2 = dVar;
                    Object[] objArr2 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "784318e19d92836d598e95b81786f410", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "784318e19d92836d598e95b81786f410")).booleanValue();
                    }
                    dVar2.a(i);
                    dVar2.a(b.AUTH_FAILURE);
                    return false;
                }
            });
        }
    }

    public void a(final long j, final String str, final String str2, final String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923e611cc479176f7eccb580824ec49b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923e611cc479176f7eccb580824ec49b");
            return;
        }
        a(j);
        com.sankuai.xm.im.utils.b.a().a(IMClient.a().f(), j, IMClient.a().g());
        com.sankuai.xm.im.transfer.upload.b.a().setUidAndToken(j, com.sankuai.xm.login.a.a().f(), com.sankuai.xm.login.a.a().k(), str);
        com.sankuai.xm.file.proxy.d.c().d();
        DBProxy.l().a(com.sankuai.xm.login.a.a().d() ? 0L : j, false, new Callback<Boolean>() { // from class: com.sankuai.xm.im.connection.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            @Trace(name = "db_load", type = i.normal)
            public final /* synthetic */ void onSuccess(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5708ffa5dca9349cbedc2e1de5be0524", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5708ffa5dca9349cbedc2e1de5be0524");
                    return;
                }
                try {
                    j.a(i.normal, "db_load", (String[]) null, new Object[]{bool2});
                    a.a(a.this, bool2, j);
                    a.this.b(j, str, str2, str3);
                    j.a((Object) null);
                } catch (Throwable th) {
                    j.a(th);
                    throw th;
                }
            }

            @Override // com.sankuai.xm.base.callback.Callback
            @Trace(name = "db_load", type = i.normal)
            public final void onFailure(@TraceStatus int i, String str4) {
                Object[] objArr2 = {Integer.valueOf(i), str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c22d9e688722eff721c6c2d038ee05bc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c22d9e688722eff721c6c2d038ee05bc");
                    return;
                }
                try {
                    j.a(i.normal, "db_load", (String[]) null, new Object[]{new Integer(i), str4});
                    j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                    com.sankuai.xm.im.utils.a.d("ConnectManager::onAuth, open db failure, err = " + str4, new Object[0]);
                    a.this.e(i);
                    j.a((Object) null);
                } catch (Throwable th) {
                    j.a(th);
                    throw th;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final long j, final String str, final String str2, final String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8ed2dd9dbaf96886751740faa8edbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8ed2dd9dbaf96886751740faa8edbe");
        } else {
            ((l) d().a()).b(IMClient.d.class).a(new b.a<IMClient.d>() { // from class: com.sankuai.xm.im.connection.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.d dVar) {
                    IMClient.d dVar2 = dVar;
                    Object[] objArr2 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24a67bb9548ce3f90626d54d3565a901", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24a67bb9548ce3f90626d54d3565a901")).booleanValue();
                    }
                    dVar2.a(j, str, str2, str3);
                    dVar2.a(b.CONNECTED);
                    return false;
                }
            });
        }
    }

    private void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8269f778970c1d9ac74027bf15fd64ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8269f778970c1d9ac74027bf15fd64ae");
            return;
        }
        synchronized (this.c) {
            if (this.b == bVar) {
                return;
            }
            this.b = bVar;
            if (bVar == b.CONNECTED || bVar == b.AUTH_FAILURE) {
                com.sankuai.xm.im.utils.a.b("ConnectManager::onStatusChanged, receive login listener, %s", bVar);
            } else {
                ((l) d().a()).b(IMClient.d.class).a(new b.a<IMClient.d>() { // from class: com.sankuai.xm.im.connection.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(IMClient.d dVar) {
                        IMClient.d dVar2 = dVar;
                        Object[] objArr2 = {dVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0aed0b89b59e2a1656474cd4318002b", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0aed0b89b59e2a1656474cd4318002b")).booleanValue();
                        }
                        dVar2.a(bVar);
                        return false;
                    }
                });
            }
        }
    }

    public final void a(boolean z, boolean z2, long j) {
        boolean z3 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f888ecabf798ba33fe5bca15c6e3d957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f888ecabf798ba33fe5bca15c6e3d957");
            return;
        }
        boolean p = com.sankuai.xm.login.a.a().p();
        boolean e = IMClient.a().j().e();
        if (e && z2) {
            com.sankuai.xm.im.utils.a.b("ConnectManager::syncRemoteMsgData do not try to sync remote data when firstLogin.", new Object[0]);
            return;
        }
        if (z2) {
            p = false;
        } else {
            IMClient.a().j().a(p || e, false);
            ((C1386a) e().a()).b = z && !e;
        }
        IMClient.a().i().a(j, (p || e) ? true : true, z2);
        a(z, p);
    }

    private void a(boolean z, boolean z2) {
        short s = 2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514a188cd61a59392ea78ea2ff3acb2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514a188cd61a59392ea78ea2ff3acb2c");
            return;
        }
        if (!z) {
            s = 1;
        } else if (!z2) {
            s = 3;
        }
        IMClient.a().j().a(0, s);
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d878462b250b217b18d77109a0765e3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d878462b250b217b18d77109a0765e3b");
            return;
        }
        b(j);
        if (j == 0) {
            j = this.h;
        }
        this.h = j;
        IMClient.a().a(this.h);
    }

    private void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1959aaf322b6394a5c672c59b3e37ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1959aaf322b6394a5c672c59b3e37ed");
        } else if (this.h == 0 || this.h == j) {
        } else {
            o.b.a.a();
            IMClient.a().i().a();
            IMClient.a().j().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.connection.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1386a implements IMClient.n {
        public static ChangeQuickRedirect a;
        boolean b;

        @Override // com.sankuai.xm.im.IMClient.n
        public final void a(boolean z) {
        }

        private C1386a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594ec0fe06dd7ffbc00ce7b3b099632c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594ec0fe06dd7ffbc00ce7b3b099632c");
            }
        }

        @Override // com.sankuai.xm.im.IMClient.n
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dbc928d45e6dfb96d71e0822f8c6260", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dbc928d45e6dfb96d71e0822f8c6260");
            } else if (a.this.a() != b.CONNECTED) {
            } else {
                com.sankuai.xm.im.session.c j = IMClient.a().j();
                boolean z = this.b;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
                if (PatchProxy.isSupport(objArr2, j, changeQuickRedirect2, false, "cdae66825dce68d5112f3b38d319bd16", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, j, changeQuickRedirect2, false, "cdae66825dce68d5112f3b38d319bd16");
                    return;
                }
                ((com.sankuai.xm.im.session.b) j.f().a()).a(z, 1);
                ((com.sankuai.xm.im.session.b) j.f().a()).a(z, 2);
            }
        }
    }
}
