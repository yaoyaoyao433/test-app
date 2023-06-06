package com.sankuai.waimai.store.im.poi.presenter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    com.sankuai.waimai.store.im.poi.contract.a c;
    public int d;
    public int e;
    public int f;
    private SessionId g;
    private String h;
    private SGCommonDataInfo i;
    private k j;

    public a(SessionId sessionId, String str, Activity activity, SGCommonDataInfo sGCommonDataInfo, com.sankuai.waimai.store.im.poi.contract.a aVar) {
        Object[] objArr = {sessionId, str, activity, sGCommonDataInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246ff418a05e4fbc3a122736601bec22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246ff418a05e4fbc3a122736601bec22");
            return;
        }
        this.d = 0;
        this.e = 30;
        this.g = sessionId;
        this.h = str;
        this.b = activity;
        this.i = sGCommonDataInfo;
        this.c = aVar;
    }

    public final void a(List<IMMessage> list) {
        SGCommonDataInfo m;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c2740d9f788f28b336f2980eea59fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c2740d9f788f28b336f2980eea59fb");
        } else if (this.c != null && (m = this.c.m()) != null && m.isUserDynamic && com.sankuai.waimai.foundation.utils.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null && iMMessage.getMsgType() == 17 && (iMMessage instanceof GeneralMessage)) {
                    int a2 = a((GeneralMessage) iMMessage);
                    for (SGCommonDataInfo.IMDynamicCard iMDynamicCard : this.i.mIMDynamicCards) {
                        if (iMDynamicCard != null && TextUtils.equals(iMDynamicCard.msgCode, String.valueOf(a2))) {
                            arrayList.add(new com.sankuai.waimai.store.im.poi.model.c(iMMessage, iMDynamicCard));
                        }
                    }
                }
            }
            b(arrayList);
        }
    }

    private void b(List<com.sankuai.waimai.store.im.poi.model.c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910d8cc74fd05ffeff848e60584d2864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910d8cc74fd05ffeff848e60584d2864");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            if (this.c != null) {
                this.c.aj_();
                return;
            }
            return;
        }
        int c = com.sankuai.waimai.foundation.utils.b.c(list);
        for (int i = 0; i < c; i++) {
            final com.sankuai.waimai.store.im.poi.model.c cVar = (com.sankuai.waimai.store.im.poi.model.c) com.sankuai.waimai.foundation.utils.b.a(list, i);
            if (cVar != null) {
                arrayList.add(rx.d.a((d.a) new d.a<com.sankuai.waimai.store.im.poi.model.c>() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        Map map;
                        j jVar = (j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfbf934a08900559d17cc2c3cde7774e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfbf934a08900559d17cc2c3cde7774e");
                            return;
                        }
                        IMMessage iMMessage = cVar.b;
                        SGCommonDataInfo.IMDynamicCard iMDynamicCard = cVar.c;
                        if (cVar == null || iMMessage == null || iMDynamicCard == null || a.this.b == null || f.a(a.this.b)) {
                            return;
                        }
                        a.C1015a c1015a = new a.C1015a();
                        c1015a.c = iMDynamicCard.templateId;
                        c1015a.b = iMDynamicCard.templateId;
                        c1015a.d = String.format("sm_mach_im_%s", iMDynamicCard.moduleId);
                        c1015a.e = "supermarket";
                        com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                        e a3 = com.sankuai.waimai.mach.manager.a.a().a(a2.b, a2.b, a2.d, a2.e);
                        if (a3 != null) {
                            if (iMDynamicCard.isAnalysisData) {
                                map = (Map) com.sankuai.waimai.store.im.util.b.a((GeneralMessage) iMMessage, Map.class);
                            } else {
                                map = (Map) com.sankuai.waimai.store.im.util.b.b((GeneralMessage) iMMessage, Map.class);
                            }
                            HashMap hashMap = new HashMap(map);
                            Mach.a aVar = new Mach.a();
                            aVar.b = a.this.b;
                            Mach a4 = aVar.a();
                            a4.initWithBundle(a.this.b, a3);
                            a4.syncPreRenderWithData(hashMap, 0, 0, new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(false, iMDynamicCard.templateId)), null);
                            if (a4.getRootNode() != null && a4.getRootNode().t() != 0 && a4.getRootNode().s() != 0) {
                                cVar.d = new com.sankuai.waimai.store.im.poi.model.a(a4.getRootNode().t(), a4.getRootNode().s());
                            } else {
                                cVar.d = new com.sankuai.waimai.store.im.poi.model.a(0, 0);
                            }
                        }
                        jVar.onNext(cVar);
                    }
                }).b(rx.schedulers.a.e()));
            }
        }
        this.j = rx.d.a((Iterable<? extends rx.d<?>>) arrayList, new rx.functions.k<List<com.sankuai.waimai.store.im.poi.model.c>>() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.k
            public final /* synthetic */ List<com.sankuai.waimai.store.im.poi.model.c> call(Object[] objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "ac2a1478b19d3edb36f1703b3d04f05e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "ac2a1478b19d3edb36f1703b3d04f05e");
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : objArr2) {
                    if (obj instanceof com.sankuai.waimai.store.im.poi.model.c) {
                        arrayList2.add((com.sankuai.waimai.store.im.poi.model.c) obj);
                    }
                }
                return arrayList2;
            }
        }).a(rx.android.schedulers.a.a()).a(new rx.functions.b<List<com.sankuai.waimai.store.im.poi.model.c>>() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(List<com.sankuai.waimai.store.im.poi.model.c> list2) {
                List<com.sankuai.waimai.store.im.poi.model.c> list3 = list2;
                Object[] objArr2 = {list3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "824e2ca9545320e8f88c660e9ea0959a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "824e2ca9545320e8f88c660e9ea0959a");
                    return;
                }
                if (com.sankuai.waimai.foundation.utils.b.a(list3)) {
                    for (com.sankuai.waimai.store.im.poi.model.c cVar2 : list3) {
                        if (cVar2 != null) {
                            a aVar = a.this;
                            Object[] objArr3 = {cVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7ab08ef3de135a0e6edd7b2b64bb4992", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7ab08ef3de135a0e6edd7b2b64bb4992");
                            } else if (cVar2.b != null && cVar2.c != null && cVar2.d != null) {
                                if (aVar.c.h().get(cVar2.c.templateId) == null) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(String.valueOf(cVar2.b.getMsgUuid()), cVar2.d);
                                    aVar.c.h().put(cVar2.c.templateId, hashMap);
                                } else {
                                    Map map = (Map) aVar.c.h().get(cVar2.c.templateId);
                                    map.put(String.valueOf(cVar2.b.getMsgUuid()), cVar2.d);
                                    aVar.c.h().put(cVar2.c.templateId, map);
                                }
                            }
                        }
                    }
                }
                if (a.this.c != null) {
                    a.this.c.aj_();
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "297d58094c0d461bb959cafbfe34f506", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "297d58094c0d461bb959cafbfe34f506");
                } else if (a.this.c != null) {
                    a.this.c.aj_();
                }
            }
        });
    }

    public final void a(final IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be54cb0a059ec844c4a7f7cea61686d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be54cb0a059ec844c4a7f7cea61686d");
        } else if (iMMessage != null && this.i != null && this.i.isUserDynamic && !com.sankuai.waimai.foundation.utils.b.b(this.i.mIMDynamicCards) && this.b != null && !f.a(this.b)) {
            GeneralMessage generalMessage = (GeneralMessage) iMMessage;
            int a2 = a(generalMessage);
            for (final SGCommonDataInfo.IMDynamicCard iMDynamicCard : this.i.mIMDynamicCards) {
                if (iMDynamicCard != null && TextUtils.equals(iMDynamicCard.msgCode, String.valueOf(a2))) {
                    final HashMap hashMap = new HashMap((Map) com.sankuai.waimai.store.im.util.b.a(generalMessage, Map.class));
                    a.C1015a c1015a = new a.C1015a();
                    c1015a.c = iMDynamicCard.templateId;
                    c1015a.b = iMDynamicCard.templateId;
                    c1015a.d = String.format("sm_mach_im_%s", iMDynamicCard.moduleId);
                    c1015a.e = "supermarket";
                    com.sankuai.waimai.mach.manager.load.a a3 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                    com.sankuai.waimai.mach.manager.a.a().a(a3.b, a3.c, a3.d, a3.e, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull CacheException cacheException) {
                        }

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull e eVar) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b4cc2e7d46cdb60456cd8fdc4c2a653", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b4cc2e7d46cdb60456cd8fdc4c2a653");
                                return;
                            }
                            a aVar = a.this;
                            SGCommonDataInfo.IMDynamicCard iMDynamicCard2 = iMDynamicCard;
                            Map<String, Object> map = hashMap;
                            IMMessage iMMessage2 = iMMessage;
                            Object[] objArr3 = {eVar, iMDynamicCard2, map, iMMessage2};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "892c83c13f24c35b3687a3f3b16c72d7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "892c83c13f24c35b3687a3f3b16c72d7");
                                return;
                            }
                            Mach.a aVar2 = new Mach.a();
                            aVar2.b = aVar.b;
                            Mach a4 = aVar2.a();
                            a4.initWithBundle(aVar.b, eVar);
                            a4.syncPreRenderWithData(map, 0, 0, new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(false, iMDynamicCard2.templateId)), null);
                            if (a4.getRootNode() != null) {
                                com.sankuai.waimai.mach.node.a rootNode = a4.getRootNode();
                                Object[] objArr4 = {rootNode, iMDynamicCard2, iMMessage2};
                                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "bc5b9f4db2b56ca97cf4db7ae7c0acc4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "bc5b9f4db2b56ca97cf4db7ae7c0acc4");
                                } else if (rootNode == null || rootNode.t() == 0 || rootNode.s() == 0 || iMMessage2 == null) {
                                } else {
                                    if (aVar.c.h().get(iMDynamicCard2.templateId) == null) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put(String.valueOf(iMMessage2.getMsgUuid()), new com.sankuai.waimai.store.im.poi.model.a(rootNode.t(), rootNode.s()));
                                        aVar.c.h().put(iMDynamicCard2.templateId, hashMap2);
                                        return;
                                    }
                                    Map map2 = (Map) aVar.c.h().get(iMDynamicCard2.templateId);
                                    map2.put(String.valueOf(iMMessage2.getMsgUuid()), new com.sankuai.waimai.store.im.poi.model.a(rootNode.t(), rootNode.s()));
                                    aVar.c.h().put(iMDynamicCard2.templateId, map2);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc825c9706c5f66abc785c795359cba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc825c9706c5f66abc785c795359cba")).intValue();
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return new JSONObject(new String(data, "utf-8")).optInt("type");
            }
            return -999;
        } catch (Exception unused) {
            return -999;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eed7fb3b4cbf61b52d47b046d555109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eed7fb3b4cbf61b52d47b046d555109");
        } else if (this.c == null || this.c.m() == null) {
        } else {
            IMClient.a().a(this.g, this.d, this.e, new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.waimai.store.im.poi.presenter.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(List<IMMessage> list) {
                    List<IMMessage> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64438c76bb08dd7e51d7e56965f99da3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64438c76bb08dd7e51d7e56965f99da3");
                    } else if (!com.sankuai.waimai.foundation.utils.b.b(list2)) {
                        a.this.a(list2);
                    } else if (a.this.c != null) {
                        a.this.c.aj_();
                    }
                }
            });
            this.d = this.e;
            this.e += this.d;
        }
    }

    public final boolean a(int i) {
        if (this.f == i) {
            return false;
        }
        this.f = i;
        return true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6ed66a71107c895bd1f424ed8c970a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6ed66a71107c895bd1f424ed8c970a");
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7ff0ac004af56e497f5901359e7779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7ff0ac004af56e497f5901359e7779");
        } else if (this.j == null || this.j.isUnsubscribed()) {
        } else {
            this.j.unsubscribe();
        }
    }
}
