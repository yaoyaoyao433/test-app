package com.sankuai.waimai.touchmatrix.rebuild.message;

import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.utils.g;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private final String b;
    private final List<com.sankuai.waimai.touchmatrix.data.a> c;

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6a3f1c221f63ff2adfa8991163c426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6a3f1c221f63ff2adfa8991163c426");
            return;
        }
        this.c = new LinkedList();
        this.b = str;
    }

    public final synchronized void a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c2ce9fd76ef1a9602683fe04e8ac83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c2ce9fd76ef1a9602683fe04e8ac83");
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("start to check and enqueueMessage:" + aVar, new Object[0]);
        String a2 = g.a(aVar);
        JudasManualManager.a a3 = JudasManualManager.b("b_waimai_j1dhyri2_mv").a("message_id", aVar.c).a("biz", a2);
        a3.b = AppUtil.generatePageInfoKey(a.c(aVar));
        a3.b(aVar.e()).a();
        if (!com.sankuai.waimai.touchmatrix.rebuild.utils.b.a(aVar)) {
            j.a().c(13002);
            j.a().b(12001, "wmtm_msg_no_id");
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("msg is invalid, abandon!", new Object[0]);
            if (aVar.k != null && !g.a(aVar.k.bizId)) {
                com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
            }
            return;
        }
        for (com.sankuai.waimai.touchmatrix.data.a aVar2 : this.c) {
            if (aVar.c.equals(aVar2.c)) {
                j.a().c(13002);
                j.a().b(12001, "wmtm_msg_repeat");
                HashMap hashMap = new HashMap();
                hashMap.put("biz", g.a(aVar2));
                hashMap.put("message_id", aVar2.c);
                hashMap.put("failure_status", "超过展现频次");
                hashMap.put("status_code", 12003);
                hashMap.put("biz", a2);
                hashMap.putAll(aVar2.e());
                j.a().a(hashMap);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("msg(%s) is repeat, abandon!", aVar.c);
                if (aVar.k != null && !g.a(aVar.k.bizId)) {
                    com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
                }
                return;
            }
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("进队消息(%s)  消息类型  is %d. (1->页面曝光;2->页面离开;4->实时消息)", aVar.c, Integer.valueOf(aVar.d));
        this.c.add(aVar);
        if (aVar.d == 4) {
            b a4 = b.a();
            com.sankuai.waimai.touchmatrix.event.a a5 = com.sankuai.waimai.touchmatrix.event.a.a(4);
            a5.c = this.b;
            a4.a(a5);
        }
    }

    public final synchronized List<com.sankuai.waimai.touchmatrix.data.a> a(com.sankuai.waimai.touchmatrix.event.a aVar) {
        boolean z;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9119960e8e28c1e97f90c749e7f4178e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9119960e8e28c1e97f90c749e7f4178e");
        } else if (aVar == null) {
            return Collections.emptyList();
        } else {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (com.sankuai.waimai.touchmatrix.data.a aVar2 : this.c) {
                if (aVar2 != null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.touchmatrix.data.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "9610fbd0cf3ac39ca4f8f3d2a4cabbd9", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "9610fbd0cf3ac39ca4f8f3d2a4cabbd9")).booleanValue();
                    } else {
                        if (aVar2.g != 0 && com.meituan.android.time.c.b() > aVar2.e + aVar2.g) {
                            z = true;
                        }
                        z = false;
                    }
                    if (z) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("biz", g.a(aVar2));
                        hashMap.put("message_id", aVar2.c);
                        hashMap.put("failure_status", "消息已过期");
                        hashMap.put("status_code", 12004);
                        hashMap.putAll(aVar2.e());
                        j.a().a(hashMap);
                        linkedList.add(aVar2);
                        com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("dequeue, msg(%s)  is expired.", aVar2.c);
                        if (aVar2 != null && aVar2.k != null && !g.a(aVar2.k.bizId)) {
                            com.sankuai.waimai.touchmatrix.a.a().b(aVar2.k.bizId);
                        }
                    } else if (aVar2.d == aVar.b) {
                        linkedList2.add(aVar2);
                    }
                }
            }
            if (linkedList.size() > 0) {
                this.c.removeAll(linkedList);
            }
            if (linkedList2.size() > 0) {
                this.c.removeAll(linkedList2);
            }
            Collections.sort(linkedList2, new Comparator<com.sankuai.waimai.touchmatrix.data.a>() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.e.1
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(com.sankuai.waimai.touchmatrix.data.a aVar3, com.sankuai.waimai.touchmatrix.data.a aVar4) {
                    return aVar4.h - aVar3.h;
                }
            });
            return linkedList2;
        }
    }
}
