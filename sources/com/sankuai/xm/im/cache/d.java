package com.sankuai.xm.im.cache;

import android.database.Cursor;
import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    LruCache<Long, DBGroupOpposite> b;
    final Object c;
    public DBProxy d;

    public d(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d658f5ef6cdddcf92192b3e158959f12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d658f5ef6cdddcf92192b3e158959f12");
            return;
        }
        this.b = new LruCache<>(200);
        this.c = new Object();
        this.d = dBProxy;
    }

    public final void a(final List<Long> list, final Callback<List<DBGroupOpposite>> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46adbda31b2a50c00adc327a9f14c83c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46adbda31b2a50c00adc327a9f14c83c");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6497b01da5db50c71fcf2ad4eaefb921", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6497b01da5db50c71fcf2ad4eaefb921");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (Long l : list) {
                            DBGroupOpposite a2 = d.this.a(l.longValue());
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                    } finally {
                        callback.onSuccess(arrayList);
                    }
                }
            }), callback);
        }
    }

    DBGroupOpposite a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab115c35a40eeac8c7249ad49f9d1f0", 6917529027641081856L)) {
            return (DBGroupOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab115c35a40eeac8c7249ad49f9d1f0");
        }
        Cursor cursor = null;
        try {
            DBGroupOpposite b = b(j);
            if (b != null) {
                return b;
            }
            Cursor a2 = this.d.bR_().a(DBGroupOpposite.TABLE_NAME, null, "msgid=?", new String[]{String.valueOf(j)}, null, null, null, null);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            while (a2.moveToNext()) {
                try {
                    b = (DBGroupOpposite) com.sankuai.xm.base.tinyorm.f.a().a(DBGroupOpposite.class, a2);
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            a(b, (String[]) null);
            if (a2 != null) {
                a2.close();
            }
            return b;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private DBGroupOpposite b(long j) {
        DBGroupOpposite dBGroupOpposite;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9748bb2102b38951a099045bd8dc8ce9", 6917529027641081856L)) {
            return (DBGroupOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9748bb2102b38951a099045bd8dc8ce9");
        }
        try {
            synchronized (this.c) {
                dBGroupOpposite = this.b.get(Long.valueOf(j));
            }
            return dBGroupOpposite;
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e, "%s::cacheGet", "GroupOppositeDBProxy");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        r13.b.put(java.lang.Long.valueOf(r2.getMsgId()), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.sankuai.xm.im.cache.bean.DBGroupOpposite> r14, java.lang.String[] r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.im.cache.d.a
            java.lang.String r12 = "d6ce9ef82805c62688e60af784412a76"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = com.sankuai.xm.base.util.b.a(r14)     // Catch: java.lang.Exception -> Lab
            if (r1 == 0) goto L25
            return
        L25:
            java.lang.Object r1 = r13.c     // Catch: java.lang.Exception -> Lab
            monitor-enter(r1)     // Catch: java.lang.Exception -> Lab
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> La8
        L2c:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto La6
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> La8
            com.sankuai.xm.im.cache.bean.DBGroupOpposite r2 = (com.sankuai.xm.im.cache.bean.DBGroupOpposite) r2     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L2c
            android.support.v4.util.LruCache<java.lang.Long, com.sankuai.xm.im.cache.bean.DBGroupOpposite> r3 = r13.b     // Catch: java.lang.Throwable -> La8
            long r4 = r2.getMsgId()     // Catch: java.lang.Throwable -> La8
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> La8
            com.sankuai.xm.im.cache.bean.DBGroupOpposite r3 = (com.sankuai.xm.im.cache.bean.DBGroupOpposite) r3     // Catch: java.lang.Throwable -> La8
            if (r15 == 0) goto L96
            if (r3 != 0) goto L4f
            goto L96
        L4f:
            int r4 = r15.length     // Catch: java.lang.Throwable -> La8
            r5 = 0
        L51:
            if (r5 >= r4) goto L95
            r6 = r15[r5]     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = "readUids"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L65
            java.lang.String r6 = r2.getReadUids()     // Catch: java.lang.Throwable -> La8
            r3.setReadUids(r6)     // Catch: java.lang.Throwable -> La8
            goto L92
        L65:
            java.lang.String r7 = "unreadUids"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L75
            java.lang.String r6 = r2.getUnreadUids()     // Catch: java.lang.Throwable -> La8
            r3.setUnreadUids(r6)     // Catch: java.lang.Throwable -> La8
            goto L92
        L75:
            java.lang.String r7 = "updateTime"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L85
            long r6 = r2.getUpdateTime()     // Catch: java.lang.Throwable -> La8
            r3.setUpdateTime(r6)     // Catch: java.lang.Throwable -> La8
            goto L92
        L85:
            java.lang.String r7 = "%s::putCache: fail column:%s"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La8
            java.lang.String r11 = "GroupOppositeDBProxy"
            r8[r9] = r11     // Catch: java.lang.Throwable -> La8
            r8[r10] = r6     // Catch: java.lang.Throwable -> La8
            com.sankuai.xm.im.utils.a.b(r7, r8)     // Catch: java.lang.Throwable -> La8
        L92:
            int r5 = r5 + 1
            goto L51
        L95:
            r2 = r3
        L96:
            if (r2 == 0) goto L2c
            android.support.v4.util.LruCache<java.lang.Long, com.sankuai.xm.im.cache.bean.DBGroupOpposite> r3 = r13.b     // Catch: java.lang.Throwable -> La8
            long r4 = r2.getMsgId()     // Catch: java.lang.Throwable -> La8
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> La8
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> La8
            goto L2c
        La6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            goto Lb7
        La8:
            r14 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            throw r14     // Catch: java.lang.Exception -> Lab
        Lab:
            r14 = move-exception
            java.lang.String r15 = "%s::putCache"
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "GroupOppositeDBProxy"
            r0[r9] = r1
            com.sankuai.xm.im.utils.a.a(r14, r15, r0)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.d.a(java.util.List, java.lang.String[]):void");
    }

    void a(DBGroupOpposite dBGroupOpposite, String[] strArr) {
        Object[] objArr = {dBGroupOpposite, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc9665781bf122b4d7cf5974dff63792", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc9665781bf122b4d7cf5974dff63792");
        } else if (dBGroupOpposite == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dBGroupOpposite);
            a(arrayList, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d8e7ae6c25ea9cf80d0714389b2701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d8e7ae6c25ea9cf80d0714389b2701");
            return;
        }
        try {
            synchronized (this.c) {
                this.b.evictAll();
            }
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e, "%s::clearCache", "GroupOppositeDBProxy");
        }
    }
}
