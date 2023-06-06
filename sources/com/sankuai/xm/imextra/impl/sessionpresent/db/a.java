package com.sankuai.xm.imextra.impl.sessionpresent.db;

import android.database.Cursor;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.tinyorm.f;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.im.cache.e;
import com.sankuai.xm.im.cache.j;
import com.sankuai.xm.imextra.db.IMExtraDBProxy;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final IMExtraDBProxy b;

    public static /* synthetic */ List a(a aVar, j[] jVarArr) {
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "62088a3a3500b970728ded4fd3652ede", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "62088a3a3500b970728ded4fd3652ede");
        }
        List<DBSessionMsgSpecialTag> a2 = aVar.a(jVarArr);
        if (b.a(a2) || aVar.b.bR_().a(DBSessionMsgSpecialTag.TABLE, e.a(" AND ", jVarArr), null) > 0) {
            return a2;
        }
        return null;
    }

    public a(IMExtraDBProxy iMExtraDBProxy) {
        Object[] objArr = {iMExtraDBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f6a9a1c522c0dd5c7ba8848e8b4093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f6a9a1c522c0dd5c7ba8848e8b4093");
        } else {
            this.b = iMExtraDBProxy;
        }
    }

    public final void a(final List<DBSessionMsgSpecialTag> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0faf17a4c53cabefd1fc269023652563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0faf17a4c53cabefd1fc269023652563");
        } else if (b.a(list)) {
        } else {
            this.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c14e0affc1c6e39777b21dfda416f36", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c14e0affc1c6e39777b21dfda416f36");
                        return;
                    }
                    c bR_ = a.this.b.bR_();
                    try {
                        a.this.b.a(bR_);
                        for (DBSessionMsgSpecialTag dBSessionMsgSpecialTag : list) {
                            f.a().a(bR_, dBSessionMsgSpecialTag);
                        }
                        a.this.b.b(bR_);
                    } finally {
                        a.this.b.c(bR_);
                    }
                }
            }, (com.sankuai.xm.im.a<Void>) null);
        }
    }

    public final List<DBSessionMsgSpecialTag> a(final Set<String> set, final int i) {
        Object[] objArr = {set, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3959e6aaf6eb91ebe8c664cc16958147", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3959e6aaf6eb91ebe8c664cc16958147");
        }
        if (b.a(set)) {
            return null;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, T] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "709656bc9dee17b4decc94cfd9146422", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "709656bc9dee17b4decc94cfd9146422");
                    return;
                }
                j a2 = j.a(DBSessionMsgSpecialTag.CHAT, (Set<String>) set, true);
                if (i != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    bVar.c = a.a(a.this, new j[]{a2, j.a("source", sb.toString(), false)});
                    return;
                }
                bVar.c = a.a(a.this, new j[]{a2});
            }
        }, (com.sankuai.xm.im.a<Void>) null);
        return (List) bVar.c;
    }

    List<DBSessionMsgSpecialTag> a(@NonNull j... jVarArr) {
        Throwable th;
        Cursor cursor;
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366f24b40c963a241b6e55a613c49b80", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366f24b40c963a241b6e55a613c49b80");
        }
        try {
            cursor = this.b.bR_().a(DBSessionMsgSpecialTag.TABLE, null, e.a(" AND ", jVarArr), null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        LinkedList linkedList = new LinkedList();
                        while (cursor.moveToNext()) {
                            linkedList.add((DBSessionMsgSpecialTag) f.a().a(DBSessionMsgSpecialTag.class, cursor));
                        }
                        m.a(cursor);
                        return linkedList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m.a(cursor);
                    throw th;
                }
            }
            m.a(cursor);
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }
}
