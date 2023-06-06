package com.sankuai.xm.im.message.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.message.bean.SyncRead;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    private List<SyncRead> b;
    private Callback<List<com.sankuai.xm.im.session.entry.a>> c;
    private List<com.sankuai.xm.im.session.entry.a> d;
    private g e;

    public a(List<SyncRead> list, Callback<List<com.sankuai.xm.im.session.entry.a>> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675bedc3e5dacc93756e6e7d5fca2480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675bedc3e5dacc93756e6e7d5fca2480");
            return;
        }
        this.b = list;
        this.c = callback;
        this.d = new ArrayList();
        this.e = j.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01d6 A[Catch: all -> 0x02cf, TryCatch #2 {Throwable -> 0x02e9, blocks: (B:6:0x001b, B:8:0x0029, B:10:0x002d, B:11:0x0032, B:13:0x0038, B:15:0x004c, B:63:0x02c9, B:17:0x0051, B:62:0x02b7, B:18:0x006b, B:20:0x007a, B:21:0x007f, B:22:0x008b, B:24:0x0091, B:26:0x00a4, B:28:0x00b0, B:29:0x00c9, B:30:0x00d0, B:32:0x00fc, B:57:0x0235, B:34:0x0106, B:36:0x0119, B:37:0x012c, B:39:0x015a, B:40:0x0169, B:44:0x017f, B:46:0x0185, B:48:0x019a, B:53:0x01d0, B:55:0x01d6, B:56:0x0200, B:49:0x01ae, B:51:0x01b4, B:58:0x0240, B:60:0x025a, B:61:0x0276), top: B:75:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200 A[Catch: all -> 0x02cf, TryCatch #2 {Throwable -> 0x02e9, blocks: (B:6:0x001b, B:8:0x0029, B:10:0x002d, B:11:0x0032, B:13:0x0038, B:15:0x004c, B:63:0x02c9, B:17:0x0051, B:62:0x02b7, B:18:0x006b, B:20:0x007a, B:21:0x007f, B:22:0x008b, B:24:0x0091, B:26:0x00a4, B:28:0x00b0, B:29:0x00c9, B:30:0x00d0, B:32:0x00fc, B:57:0x0235, B:34:0x0106, B:36:0x0119, B:37:0x012c, B:39:0x015a, B:40:0x0169, B:44:0x017f, B:46:0x0185, B:48:0x019a, B:53:0x01d0, B:55:0x01d6, B:56:0x0200, B:49:0x01ae, B:51:0x01b4, B:58:0x0240, B:60:0x025a, B:61:0x0276), top: B:75:0x001b }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.syncread.a.run():void");
    }

    private Map<String, DBSyncRead> a(List<SyncRead> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa9cc663bff14ffa6ec917eddc8e757a", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa9cc663bff14ffa6ec917eddc8e757a");
        }
        if (list.size() > 100) {
            HashMap hashMap = new HashMap();
            int size = (list.size() / 100) + 1;
            while (i < size) {
                int i2 = i * 100;
                i++;
                int min = Math.min(list.size(), i * 100);
                if (i2 < min) {
                    ArrayList arrayList = new ArrayList();
                    while (i2 < min) {
                        arrayList.add(list.get(i2).getChatKey());
                        i2++;
                    }
                    Map<String, DBSyncRead> a2 = DBProxy.l().l.a(arrayList);
                    if (a2 != null) {
                        hashMap.putAll(a2);
                    }
                }
            }
            return hashMap;
        }
        ArrayList arrayList2 = new ArrayList();
        for (SyncRead syncRead : list) {
            arrayList2.add(syncRead.getChatKey());
        }
        return DBProxy.l().l.a(arrayList2);
    }
}
