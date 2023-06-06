package com.meituan.android.legwork.monitor;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.monitor.Link;
import com.meituan.android.legwork.bean.monitor.LinkMonitorConfigBean;
import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.android.legwork.monitor.a;
import com.meituan.android.legwork.utils.g;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    ConcurrentHashMap<String, Map<String, Link>> b;
    public LinkMonitorConfigBean c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c402902d41081422f71e9f3e0dc7d9b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c402902d41081422f71e9f3e0dc7d9b9");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20295e830ae4eb0fbdd83573c610662f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20295e830ae4eb0fbdd83573c610662f") : a.a;
    }

    public final synchronized void a(String str, String str2, int i) {
        long j;
        LinkNode linkNode;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae432589959d5a6690a98111c968c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae432589959d5a6690a98111c968c55");
        } else if (a(str)) {
        } else {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                e();
                Map<String, Link> map = this.b.get(str);
                if (map != null && !map.isEmpty()) {
                    Link link = map.get(str2);
                    if (link == null) {
                        return;
                    }
                    if (i == 2 && link.linkNodes != null && link.linkNodes.size() > 0 && (linkNode = link.linkNodes.get(link.linkNodes.size() - 1)) != null) {
                        linkNode.linkPause = "1";
                    }
                    link.status = i;
                    link.updateTimestamp = com.meituan.android.time.c.b() / 1000;
                    z.a(com.meituan.android.legwork.a.a()).a("monitor", new Gson().toJson(this.b));
                    switch (i) {
                        case 1:
                            com.meituan.android.legwork.monitor.a a2 = com.meituan.android.legwork.monitor.a.a();
                            Object[] objArr2 = {str2};
                            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.monitor.a.a;
                            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "636584d23453959249822daef10eac1a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "636584d23453959249822daef10eac1a");
                                break;
                            } else {
                                ScheduledFuture scheduledFuture = a2.b.get(str2);
                                a.b bVar = a2.c.get(str2);
                                if (scheduledFuture != null && bVar != null) {
                                    scheduledFuture.cancel(false);
                                    ScheduledExecutorService scheduledExecutorService = a2.d;
                                    j = bVar.e;
                                    a2.b.put(str2, scheduledExecutorService.schedule(bVar, j, TimeUnit.SECONDS));
                                    a2.c.put(str2, bVar);
                                    return;
                                }
                            }
                            break;
                        case 2:
                            com.meituan.android.legwork.monitor.a a3 = com.meituan.android.legwork.monitor.a.a();
                            Object[] objArr3 = {str2};
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.monitor.a.a;
                            if (!PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "3e178d21de028659d07fc44feee7277f", RobustBitConfig.DEFAULT_VALUE)) {
                                ScheduledFuture scheduledFuture2 = a3.b.get(str2);
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    break;
                                }
                            } else {
                                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "3e178d21de028659d07fc44feee7277f");
                                return;
                            }
                            break;
                    }
                }
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911e851363f44413476910451d430b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911e851363f44413476910451d430b53");
        } else if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public final synchronized Link a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149255a16b7848518fd4652ede096732", RobustBitConfig.DEFAULT_VALUE)) {
            return (Link) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149255a16b7848518fd4652ede096732");
        } else if (a(str)) {
            return null;
        } else {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                e();
                Map<String, Link> map = this.b.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    this.b.put(str, map);
                }
                Link link = map.get(str2);
                if (link == null) {
                    link = new Link(str, str2, str3);
                    map.put(str2, link);
                    z.a(com.meituan.android.legwork.a.a()).a("monitor", new Gson().toJson(this.b));
                }
                return link;
            }
            return null;
        }
    }

    public final synchronized void b() {
        List<LinkNode> list;
        LinkNode linkNode;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8335cf0bc8471209b07a42575900be2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8335cf0bc8471209b07a42575900be2f");
            return;
        }
        List<Link> a2 = a(1);
        if (a2 != null && a2.size() != 0) {
            for (Link link : a2) {
                if (link != null && (list = link.linkNodes) != null && list.size() != 0 && (linkNode = list.get(list.size() - 1)) != null) {
                    linkNode.lastOpreateScreanTimestamp = com.meituan.android.time.c.b() / 1000;
                }
            }
        }
    }

    private synchronized List<Link> a(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60dac44f9983218d8fdbe45fc39b7d28", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60dac44f9983218d8fdbe45fc39b7d28");
        } else if (a((String) null)) {
            return null;
        } else {
            e();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Map<String, Link>> entry : this.b.entrySet()) {
                Map<String, Link> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    for (Map.Entry<String, Link> entry2 : value.entrySet()) {
                        Link value2 = entry2.getValue();
                        if (value2 != null && value2.status == 1) {
                            arrayList.add(value2);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0270, code lost:
        a(r12);
        h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(java.lang.String r29, java.lang.String r30, com.meituan.android.legwork.bean.monitor.LinkNode r31) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.monitor.b.a(java.lang.String, java.lang.String, com.meituan.android.legwork.bean.monitor.LinkNode):boolean");
    }

    private void a(Link link) {
        Object[] objArr = {link};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7916e22913ab731c8a06ad9dbf2fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7916e22913ab731c8a06ad9dbf2fee");
        } else if (link != null) {
            HashMap hashMap = new HashMap();
            if (link.linkNodes != null && link.linkNodes.size() > 0) {
                StringBuilder sb = new StringBuilder();
                int size = link.linkNodes.size();
                for (int i = 0; i < size; i++) {
                    LinkNode linkNode = link.linkNodes.get(i);
                    if (linkNode != null) {
                        if (i != 0) {
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                        sb.append(linkNode.nodeName);
                        sb.append(CommonConstant.Symbol.COLON);
                        sb.append(linkNode.timestamp);
                        sb.append(CommonConstant.Symbol.COLON);
                        sb.append(linkNode.duration);
                    }
                }
                hashMap.put("funcLink", sb.toString());
            }
            hashMap.put("timeout", link.status == 16 ? "1" : "2");
            hashMap.put("biz", link.bizName);
            hashMap.put("identifier", link.identifier);
            hashMap.put("parentIdentifier", link.parentIdentifier);
            hashMap.put("updateTimestamp", String.valueOf(link.updateTimestamp));
            hashMap.put("status", String.valueOf(link.status));
            q.a("legwork_link", 2048, hashMap);
        }
    }

    synchronized void c() {
        int intValue;
        List<LinkNode> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30de8db5bbc46bd751fe3bdcb794f1e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30de8db5bbc46bd751fe3bdcb794f1e6");
            return;
        }
        if (this.b != null && !this.b.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, Link>>> it = this.b.entrySet().iterator();
            int i = 1;
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<String, Map<String, Link>> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    Map<String, Link> value = next.getValue();
                    if (value != null && !value.isEmpty()) {
                        String key = next.getKey();
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = key;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1353658fae59d36d6fcd2938e121e855", RobustBitConfig.DEFAULT_VALUE)) {
                            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1353658fae59d36d6fcd2938e121e855")).intValue();
                        } else {
                            intValue = (this.c == null || this.c.config == null || !(this.c.config.get(key) instanceof Map) || !(((Map) this.c.config.get(key)).get("pauseTimes") instanceof Double)) ? 0 : ((Double) ((Map) this.c.config.get(key)).get("pauseTimes")).intValue();
                            if (intValue < 0) {
                                intValue = 0;
                            }
                        }
                        HashMap hashMap = new HashMap();
                        Iterator<Map.Entry<String, Link>> it2 = value.entrySet().iterator();
                        boolean z2 = z;
                        while (it2.hasNext()) {
                            Map.Entry<String, Link> next2 = it2.next();
                            if (next2 == null) {
                                it2.remove();
                                z2 = true;
                            } else {
                                Link value2 = next2.getValue();
                                if (value2 != null && value2.status == 2 && (list = value2.linkNodes) != null && list.size() != 0) {
                                    LinkNode linkNode = list.get(list.size() - 1);
                                    if (linkNode != null) {
                                        String str = linkNode.nodeName;
                                        List list2 = (List) hashMap.get(str);
                                        if (list2 == null) {
                                            list2 = new ArrayList();
                                            hashMap.put(str, list2);
                                        }
                                        list2.add(value2);
                                    }
                                }
                            }
                        }
                        z = z2;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (entry != null) {
                                List<Link> list3 = (List) entry.getValue();
                                if (intValue > 0 && list3 != null && list3.size() > intValue) {
                                    for (Link link : list3) {
                                        if (link != null) {
                                            a(link);
                                            value.remove(link.identifier);
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                        i = 1;
                    }
                    it.remove();
                    i = 1;
                }
                z = true;
            }
            if (z) {
                z.a(com.meituan.android.legwork.a.a()).a("monitor", new Gson().toJson(this.b));
            }
        }
    }

    synchronized void d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1911f762fe74085e378c75268f95a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1911f762fe74085e378c75268f95a7");
            return;
        }
        if (this.b != null && !this.b.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, Link>>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Map<String, Link>> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    long f = f();
                    Map<String, Link> value = next.getValue();
                    if (value != null && !value.isEmpty()) {
                        Iterator<Map.Entry<String, Link>> it2 = value.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, Link> next2 = it2.next();
                            if (next2 == null) {
                                it2.remove();
                            } else if ((next2.getValue().updateTimestamp + f) * 1000 < com.meituan.android.time.c.b()) {
                                it2.remove();
                            }
                            z = true;
                        }
                    }
                    it.remove();
                }
                z = true;
            }
            if (z) {
                z.a(com.meituan.android.legwork.a.a()).a("monitor", new Gson().toJson(this.b));
            }
        }
    }

    private boolean a(String str, Map<String, Link> map, Link link) {
        int intValue;
        Object[] objArr = {str, map, link};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7757cdd3df2b18ca69722f76824963c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7757cdd3df2b18ca69722f76824963c8")).booleanValue();
        }
        if (map == null || map.isEmpty() || link == null || TextUtils.isEmpty(str) || link.linkNodes == null || link.linkNodes.size() <= 0 || link.linkNodes.get(link.linkNodes.size() - 1) == null) {
            return false;
        }
        Iterator<Map.Entry<String, Link>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Link> next = it.next();
            if (next == null) {
                it.remove();
            } else if ((f() + next.getValue().updateTimestamp) * 1000 < com.meituan.android.time.c.b()) {
                it.remove();
            }
        }
        String str2 = link.identifier;
        String str3 = link.linkNodes.get(link.linkNodes.size() - 1).nodeName;
        Iterator<Map.Entry<String, Link>> it2 = map.entrySet().iterator();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(link.identifier);
        int i = 1;
        while (it2.hasNext()) {
            Map.Entry<String, Link> next2 = it2.next();
            if (next2 == null) {
                it2.remove();
            } else {
                Link value = next2.getValue();
                if (value == null || value.linkNodes == null || value.linkNodes.size() <= 0 || value.linkNodes.get(value.linkNodes.size() - 1) == null) {
                    it2.remove();
                } else {
                    String str4 = value.linkNodes.get(value.linkNodes.size() - 1).nodeName;
                    if (8 == value.status && TextUtils.equals(str3, str4) && !TextUtils.equals(str2, value.identifier)) {
                        i++;
                        arrayList.add(value.identifier);
                    }
                }
            }
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dbc0c907df946a604eba3afa473b543", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dbc0c907df946a604eba3afa473b543")).intValue();
        } else {
            intValue = (this.c == null || this.c.config == null || !(this.c.config.get(str) instanceof Map) || !(((Map) this.c.config.get(str)).get("cancelTimes") instanceof Double)) ? 0 : ((Double) ((Map) this.c.config.get(str)).get("cancelTimes")).intValue();
            if (intValue < 0) {
                intValue = 0;
            }
        }
        if (intValue <= 0 || i <= intValue) {
            return false;
        }
        for (String str5 : arrayList) {
            map.remove(str5);
        }
        return true;
    }

    private long f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba21d4b6ecb91d4f74cc0ebbca725ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba21d4b6ecb91d4f74cc0ebbca725ee")).longValue();
        }
        long longValue = (this.c == null || this.c.config == null || !(this.c.config.get("expireDuration") instanceof Double)) ? 600L : ((Double) this.c.config.get("expireDuration")).longValue();
        if (longValue < 1) {
            return 600L;
        }
        return longValue;
    }

    boolean a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115728e997806403e06411104b77e02d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115728e997806403e06411104b77e02d")).booleanValue();
        }
        if (this.c == null || this.c.config == null) {
            return true;
        }
        if (this.c.config.get("switchOff") instanceof Boolean) {
            boolean booleanValue = ((Boolean) this.c.config.get("switchOff")).booleanValue();
            if (booleanValue) {
                return true;
            }
            z = booleanValue;
        }
        return ((this.c.config.get(str) instanceof Map) && (((Map) this.c.config.get(str)).get("switchOff") instanceof Boolean)) ? ((Boolean) ((Map) this.c.config.get("buyPreview")).get("switchOff")).booleanValue() : z;
    }

    private boolean g() {
        long j;
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81322fb6e92a0a461952889507160b5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81322fb6e92a0a461952889507160b5d")).booleanValue();
        }
        if (this.c == null || this.c.config == null) {
            j = 3600;
            z = false;
        } else {
            z = this.c.config.get("autoUploadLog") instanceof Boolean ? ((Boolean) this.c.config.get("autoUploadLog")).booleanValue() : false;
            j = this.c.config.get("uploadLogIntervalTime") instanceof Double ? ((Double) this.c.config.get("uploadLogIntervalTime")).longValue() : 3600L;
        }
        if (z) {
            return z.b(com.meituan.android.legwork.a.a(), "autoUploadLogTime", 0L) + (j >= 0 ? j : 3600L) < com.meituan.android.time.c.b() / 1000;
        }
        return false;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d275603326537c0b646c9ededd84a324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d275603326537c0b646c9ededd84a324");
        } else if (g()) {
            long b = com.meituan.android.time.c.b();
            com.dianping.networklog.c.a(new String[]{g.a("yyyy-MM-dd", b)}, com.meituan.android.legwork.common.hostInfo.b.e().f(), "legwork");
            z.a(com.meituan.android.legwork.a.a(), "autoUploadLogTime", b / 1000);
        }
    }
}
