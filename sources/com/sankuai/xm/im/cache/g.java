package com.sankuai.xm.im.cache;

import android.database.Cursor;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public DBProxy b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94c4cb0dbad06cfea18c44e5d58a2e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94c4cb0dbad06cfea18c44e5d58a2e8");
        } else {
            this.b = DBProxy.l();
        }
    }

    public final void a(final Collection<MsgAddition> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5214b1e7532a7a15d2d31606ecb5401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5214b1e7532a7a15d2d31606ecb5401");
        } else if (com.sankuai.xm.base.util.b.a(collection)) {
        } else {
            this.b.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.g.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ccdca330d2c99d78226574e964c62d1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ccdca330d2c99d78226574e964c62d1");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = g.this.b.bR_();
                    try {
                        bR_.b();
                        for (MsgAddition msgAddition : collection) {
                            com.sankuai.xm.base.tinyorm.f.a().d(bR_, msgAddition);
                        }
                        bR_.d();
                        bR_.c();
                    } finally {
                        bR_.e();
                    }
                }
            }), (Callback) null);
        }
    }

    @Nullable
    public final List<MsgAddition> b(final Collection<Long> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5899ae7c4f59ad5d9da79e3746f4bb", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5899ae7c4f59ad5d9da79e3746f4bb");
        }
        if (com.sankuai.xm.base.util.b.a(collection)) {
            return null;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.b.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.g.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, T, java.util.ArrayList] */
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th;
                Cursor cursor;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40eaadfd1af37fc1c59a3556d4b921ea", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40eaadfd1af37fc1c59a3556d4b921ea");
                    return;
                }
                HashSet hashSet = new HashSet(collection.size());
                for (Long l : collection) {
                    hashSet.add(l.toString());
                }
                ?? arrayList = new ArrayList();
                try {
                    cursor = g.this.b.bR_().a(MsgAddition.TABLE, null, j.a("msgid", (Set<String>) hashSet, "in", false).a(), null, null, null, "msgid desc");
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0) {
                                while (cursor.moveToNext()) {
                                    arrayList.add((MsgAddition) com.sankuai.xm.base.tinyorm.f.a().a(MsgAddition.class, cursor));
                                }
                                bVar.c = arrayList;
                                com.sankuai.xm.base.util.m.a(cursor);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            com.sankuai.xm.base.util.m.a(cursor);
                            throw th;
                        }
                    }
                    com.sankuai.xm.base.util.m.a(cursor);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            }
        }));
        return (List) bVar.c;
    }
}
