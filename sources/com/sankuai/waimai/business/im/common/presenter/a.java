package com.sankuai.waimai.business.im.common.presenter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.q;
import com.sankuai.waimai.business.im.model.s;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
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
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    com.sankuai.waimai.business.im.common.contract.a c;
    public int d;
    public int e;
    public int f;
    private SessionId g;
    private WMCommonDataInfo h;
    private k i;

    public a(SessionId sessionId, Activity activity, WMCommonDataInfo wMCommonDataInfo, com.sankuai.waimai.business.im.common.contract.a aVar) {
        Object[] objArr = {sessionId, activity, wMCommonDataInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f7bcf6728ecd5b9b9cfa5d229fead0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f7bcf6728ecd5b9b9cfa5d229fead0");
            return;
        }
        this.d = 0;
        this.e = 30;
        this.g = sessionId;
        this.b = activity;
        this.h = wMCommonDataInfo;
        this.c = aVar;
    }

    public final void a(List<IMMessage> list) {
        WMCommonDataInfo j;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce9d5a0610ebe723c779f3a27ed32c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce9d5a0610ebe723c779f3a27ed32c1");
        } else if (this.c != null && (j = this.c.j()) != null && j.a && b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null && iMMessage.getMsgType() == 17 && (iMMessage instanceof GeneralMessage)) {
                    int a2 = a((GeneralMessage) iMMessage);
                    for (WMCommonDataInfo.IMDynamicCard iMDynamicCard : this.h.c) {
                        if (iMDynamicCard != null && TextUtils.equals(iMDynamicCard.msgCode, String.valueOf(a2))) {
                            arrayList.add(new s(iMMessage, iMDynamicCard));
                        }
                    }
                }
            }
            b(arrayList);
        }
    }

    private void b(List<s> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f37ff0fc30abeea6a484c13a5facd69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f37ff0fc30abeea6a484c13a5facd69");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (b.b(list)) {
            if (this.c != null) {
                this.c.aj_();
                return;
            }
            return;
        }
        int c = b.c(list);
        for (int i = 0; i < c; i++) {
            final s sVar = (s) b.a(list, i);
            if (sVar != null) {
                arrayList.add(d.a((d.a) new d.a<s>() { // from class: com.sankuai.waimai.business.im.common.presenter.a.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        Map map;
                        j jVar = (j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ac4768b0e4f435f9c3dcdbead1fcc64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ac4768b0e4f435f9c3dcdbead1fcc64");
                            return;
                        }
                        IMMessage iMMessage = sVar.b;
                        WMCommonDataInfo.IMDynamicCard iMDynamicCard = sVar.c;
                        if (sVar == null || iMMessage == null || iMDynamicCard == null || a.this.b == null || f.a(a.this.b)) {
                            return;
                        }
                        a.C1015a c1015a = new a.C1015a();
                        c1015a.c = iMDynamicCard.templateId;
                        c1015a.b = iMDynamicCard.templateId;
                        c1015a.d = String.format("waimai_im_%s", iMDynamicCard.moduleId);
                        c1015a.e = "waimai";
                        com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                        e a3 = com.sankuai.waimai.mach.manager.a.a().a(a2.b, a2.b, a2.d, a2.e);
                        if (a3 != null) {
                            if (iMDynamicCard.isAnalysisData) {
                                map = (Map) com.sankuai.waimai.business.im.common.utils.d.a((GeneralMessage) iMMessage, Map.class);
                            } else {
                                map = (Map) com.sankuai.waimai.business.im.common.utils.d.b((GeneralMessage) iMMessage, Map.class);
                            }
                            HashMap hashMap = new HashMap(map);
                            Mach.a aVar = new Mach.a();
                            aVar.b = a.this.b;
                            Mach a4 = aVar.a();
                            a4.initWithBundle(a.this.b, a3);
                            a4.syncPreRenderWithData(hashMap, 0, 0, new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(false, iMDynamicCard.templateId)), null);
                            if (a4.getRootNode() == null || a4.getRootNode().t() == 0 || a4.getRootNode().s() == 0) {
                                return;
                            }
                            sVar.d = new q(a4.getRootNode().t(), a4.getRootNode().s());
                            jVar.onNext(sVar);
                        }
                    }
                }).b(rx.schedulers.a.e()));
            }
        }
        this.i = d.a((Iterable<? extends d<?>>) arrayList, new rx.functions.k<List<s>>() { // from class: com.sankuai.waimai.business.im.common.presenter.a.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.k
            public final /* synthetic */ List<s> call(Object[] objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "b60e0053f710715352d715e0f7ffc37c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "b60e0053f710715352d715e0f7ffc37c");
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : objArr2) {
                    if (obj instanceof s) {
                        arrayList2.add((s) obj);
                    }
                }
                return arrayList2;
            }
        }).a(rx.android.schedulers.a.a()).a(new rx.functions.b<List<s>>() { // from class: com.sankuai.waimai.business.im.common.presenter.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(List<s> list2) {
                List<s> list3 = list2;
                Object[] objArr2 = {list3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a2368863bd3d6312dc3151269e22014", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a2368863bd3d6312dc3151269e22014");
                    return;
                }
                if (b.a(list3)) {
                    for (s sVar2 : list3) {
                        if (sVar2 != null) {
                            a aVar = a.this;
                            Object[] objArr3 = {sVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "19b82d235e23a95d7421de6c389f50fb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "19b82d235e23a95d7421de6c389f50fb");
                            } else if (sVar2.b != null && sVar2.c != null && sVar2.d != null) {
                                if (aVar.c.h().get(sVar2.c.templateId) == null) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(String.valueOf(sVar2.b.getMsgUuid()), sVar2.d);
                                    aVar.c.h().put(sVar2.c.templateId, hashMap);
                                } else {
                                    Map map = (Map) aVar.c.h().get(sVar2.c.templateId);
                                    map.put(String.valueOf(sVar2.b.getMsgUuid()), sVar2.d);
                                    aVar.c.h().put(sVar2.c.templateId, map);
                                }
                            }
                        }
                    }
                }
                if (a.this.c != null) {
                    a.this.c.aj_();
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.business.im.common.presenter.a.3
            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(Throwable th) {
            }
        });
    }

    public final void a(final IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dfc80fe8f9afa43bc0e77bcb057b1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dfc80fe8f9afa43bc0e77bcb057b1ca");
        } else if (iMMessage != null && this.h != null && this.h.a && !b.b(this.h.c) && this.b != null && !f.a(this.b)) {
            GeneralMessage generalMessage = (GeneralMessage) iMMessage;
            int a2 = a(generalMessage);
            for (final WMCommonDataInfo.IMDynamicCard iMDynamicCard : this.h.c) {
                if (iMDynamicCard != null && TextUtils.equals(iMDynamicCard.msgCode, String.valueOf(a2))) {
                    final HashMap hashMap = new HashMap((Map) com.sankuai.waimai.business.im.common.utils.d.a(generalMessage, Map.class));
                    a.C1015a c1015a = new a.C1015a();
                    c1015a.c = iMDynamicCard.templateId;
                    c1015a.b = iMDynamicCard.templateId;
                    c1015a.d = String.format("waimai_im_%s", iMDynamicCard.moduleId);
                    c1015a.e = "supermarket";
                    com.sankuai.waimai.mach.manager.load.a a3 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                    com.sankuai.waimai.mach.manager.a.a().a(a3.b, a3.c, a3.d, a3.e, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.business.im.common.presenter.a.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull CacheException cacheException) {
                        }

                        @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                        public final void a(@NonNull e eVar) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2c7e2a6a13041b558235aef91f53cba", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2c7e2a6a13041b558235aef91f53cba");
                                return;
                            }
                            a aVar = a.this;
                            WMCommonDataInfo.IMDynamicCard iMDynamicCard2 = iMDynamicCard;
                            Map<String, Object> map = hashMap;
                            IMMessage iMMessage2 = iMMessage;
                            Object[] objArr3 = {eVar, iMDynamicCard2, map, iMMessage2};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "4508c37031f9a456da825d8b7b562f51", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "4508c37031f9a456da825d8b7b562f51");
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
                                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "23d0a56d711b9e7caa000453a16aaef3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "23d0a56d711b9e7caa000453a16aaef3");
                                } else if (rootNode == null || rootNode.t() == 0 || rootNode.s() == 0 || iMMessage2 == null) {
                                } else {
                                    if (aVar.c.h().get(iMDynamicCard2.templateId) == null) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put(String.valueOf(iMMessage2.getMsgUuid()), new q(rootNode.t(), rootNode.s()));
                                        aVar.c.h().put(iMDynamicCard2.templateId, hashMap2);
                                        return;
                                    }
                                    Map map2 = (Map) aVar.c.h().get(iMDynamicCard2.templateId);
                                    map2.put(String.valueOf(iMMessage2.getMsgUuid()), new q(rootNode.t(), rootNode.s()));
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76aa78b8a4e8e14850eb5e104839f57", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76aa78b8a4e8e14850eb5e104839f57")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c43f470485b5bab983c7b2ca0c491f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c43f470485b5bab983c7b2ca0c491f0");
        } else if (this.c == null || this.c.j() == null) {
        } else {
            IMClient.a().a(this.g, this.d, this.e, new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.waimai.business.im.common.presenter.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(List<IMMessage> list) {
                    List<IMMessage> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d61575306026e887366c82202f352aaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d61575306026e887366c82202f352aaf");
                    } else {
                        a.this.a(list2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a4dc9742bf9649e9a891e4fdde584f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a4dc9742bf9649e9a891e4fdde584f");
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44677d4cc47da6e4e36911ed53ad5c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44677d4cc47da6e4e36911ed53ad5c06");
        } else if (this.i == null || this.i.isUnsubscribed()) {
        } else {
            this.i.unsubscribe();
        }
    }
}
