package com.sankuai.xm.im.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.monitor.cat.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final Object b;
    HashMap<String, MessageStatisticsEntry> c;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352d47980b2bab66501f6df67433118f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352d47980b2bab66501f6df67433118f");
            return;
        }
        this.b = new Object();
        this.c = new HashMap<>();
    }

    public final void a(String str, IMMessage iMMessage) {
        Object[] objArr = {str, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71cde030bb7d783fb195417701c45b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71cde030bb7d783fb195417701c45b8");
            return;
        }
        synchronized (this.b) {
            if (!this.c.containsKey(str)) {
                MessageStatisticsEntry messageStatisticsEntry = new MessageStatisticsEntry(str);
                messageStatisticsEntry.initMessageEntryValue(iMMessage);
                this.c.put(str, messageStatisticsEntry);
            }
        }
    }

    public final void a(String str) {
        MessageStatisticsEntry messageStatisticsEntry;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b78e41b0198cc142f105b7941768fa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b78e41b0198cc142f105b7941768fa7");
            return;
        }
        synchronized (this.b) {
            messageStatisticsEntry = this.c.containsKey(str) ? this.c.get(str) : null;
        }
        if (messageStatisticsEntry != null) {
            messageStatisticsEntry.start();
        }
    }

    public final void a(String str, String str2, Object obj) {
        MessageStatisticsEntry messageStatisticsEntry;
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67044f8839852c6713fdbf8592a809c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67044f8839852c6713fdbf8592a809c3");
            return;
        }
        synchronized (this.b) {
            messageStatisticsEntry = this.c.containsKey(str) ? this.c.get(str) : null;
        }
        if (messageStatisticsEntry != null) {
            messageStatisticsEntry.addEntryValue(str2, obj);
        }
    }

    public final void b(String str) {
        MessageStatisticsEntry remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8557d09ecdcc642e13b6c69b343076a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8557d09ecdcc642e13b6c69b343076a7");
            return;
        }
        synchronized (this.b) {
            remove = this.c.containsKey(str) ? this.c.remove(str) : null;
        }
        if (remove != null) {
            com.sankuai.xm.monitor.c.a(MessageStatisticsEntry.EVENT_NAME, remove.getEntryValues());
            a(remove.getEntryValues());
            remove.destroy();
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1f33784dcb1dc431d6a536a23fc059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1f33784dcb1dc431d6a536a23fc059");
        } else if (hashMap.containsKey("result")) {
            com.sankuai.xm.monitor.cat.b bVar = new com.sankuai.xm.monitor.cat.b();
            bVar.c = a((Map<String, Object>) hashMap);
            bVar.d = 200;
            if (hashMap.containsKey("time")) {
                bVar.g = ((Long) hashMap.get("time")).longValue();
            } else {
                bVar.g = 0L;
            }
            bVar.b = com.sankuai.xm.im.http.a.a("/sdk/socket/message");
            c.a.a.a(bVar);
        }
    }

    private int a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f701462c32a90f154f4f4f59dbf4b03", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f701462c32a90f154f4f4f59dbf4b03")).intValue();
        }
        int intValue = ((Integer) map.get("result")).intValue();
        if (intValue != 0) {
            if (intValue == 3 && map.containsKey("code")) {
                return ((Integer) map.get("code")).intValue();
            }
            return intValue + 700;
        }
        return 0;
    }
}
