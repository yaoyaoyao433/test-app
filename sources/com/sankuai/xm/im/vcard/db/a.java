package com.sankuai.xm.im.vcard.db;

import android.database.Cursor;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.BaseDBProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.tinyorm.b;
import com.sankuai.xm.base.tinyorm.f;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.cache.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Object b;
    public BaseDBProxy c;
    public LinkedHashMap<String, VCard> d;
    public boolean e;

    public a(BaseDBProxy baseDBProxy) {
        Object[] objArr = {baseDBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da8d9b9b9abcff1a0bf4899c5eac169", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da8d9b9b9abcff1a0bf4899c5eac169");
            return;
        }
        this.b = new Object();
        this.e = false;
        this.c = baseDBProxy;
        this.d = new LinkedHashMap<String, VCard>() { // from class: com.sankuai.xm.im.vcard.db.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, VCard> entry) {
                Object[] objArr2 = {entry};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb508680312d8299f36cbf829899bc7", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb508680312d8299f36cbf829899bc7")).booleanValue() : ((long) size()) > 200;
            }
        };
    }

    public final VCard a(final long j, final int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ef5930f85696f90fcd0fe3d20776d6", 6917529027641081856L)) {
            return (VCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ef5930f85696f90fcd0fe3d20776d6");
        }
        String b = b(j, i);
        synchronized (this.b) {
            if (this.d.containsKey(b)) {
                return this.d.get(b);
            } else if (this.e) {
                return null;
            } else {
                final b bVar = new b();
                this.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.db.a.2
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        T t;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cacbdd85dd6b413419e130d6f82a715f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cacbdd85dd6b413419e130d6f82a715f");
                            return;
                        }
                        a aVar = a.this;
                        long j2 = j;
                        int i2 = i;
                        Object[] objArr3 = {new Long(j2), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0fadb956e9d8a8ac3f93adaf7db83db4", 6917529027641081856L)) {
                            t = (VCard) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0fadb956e9d8a8ac3f93adaf7db83db4");
                        } else {
                            List<VCard> a2 = aVar.a((Collection<Long>) Collections.singletonList(Long.valueOf(j2)), i2);
                            t = !com.sankuai.xm.base.util.b.a(a2) ? a2.get(0) : 0;
                        }
                        bVar.c = t;
                        if (t != 0) {
                            synchronized (a.this.b) {
                                a.this.d.put(a.this.b(j, i), t);
                            }
                        }
                    }
                }), true, null);
                return (VCard) bVar.c;
            }
        }
    }

    @Nullable
    public final com.sankuai.xm.base.entity.a<VCard, Long> a(List<Long> list, final int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64910d69252cde07e11658081aeebc4e", 6917529027641081856L)) {
            return (com.sankuai.xm.base.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64910d69252cde07e11658081aeebc4e");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return null;
        }
        final com.sankuai.xm.base.entity.a<VCard, Long> aVar = new com.sankuai.xm.base.entity.a<>();
        aVar.a(new ArrayList());
        aVar.b(new ArrayList());
        synchronized (this.b) {
            for (Long l : list) {
                String b = b(l.longValue(), i);
                if (this.d.containsKey(b)) {
                    aVar.a().add(this.d.get(b));
                } else {
                    aVar.b().add(l);
                }
            }
        }
        if (this.e || aVar.b().isEmpty()) {
            return aVar;
        }
        this.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.db.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8810be7dc739404347870ab38d99bb1e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8810be7dc739404347870ab38d99bb1e");
                    return;
                }
                List<VCard> a2 = a.this.a(aVar.b(), i);
                if (com.sankuai.xm.base.util.b.a(a2)) {
                    return;
                }
                aVar.a().addAll(a2);
                synchronized (this) {
                    for (VCard vCard : a2) {
                        aVar.b().remove(Long.valueOf(vCard.getInfoId()));
                        a.this.d.put(vCard.getVCardKey(), vCard);
                    }
                }
            }
        }), true, null);
        return aVar;
    }

    public final void a(final VCard vCard, final String[] strArr, final Callback<VCard> callback) {
        Object[] objArr = {vCard, strArr, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a024b0405e5e848dfef08c48b2f5493a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a024b0405e5e848dfef08c48b2f5493a");
        } else if (this.e) {
            synchronized (this.b) {
                this.d.put(b(vCard.getInfoId(), vCard.getType()), vCard);
            }
            callback.onSuccess(null);
        } else {
            this.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.db.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7cd54dcfafe308fa0215221d888f31b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7cd54dcfafe308fa0215221d888f31b");
                        return;
                    }
                    c bR_ = a.this.c.bR_();
                    b<Object> bVar = new b<>();
                    if (f.a().b(bR_, vCard, strArr, bVar)) {
                        VCard vCard2 = (VCard) bVar.c;
                        if (vCard2 == null) {
                            vCard2 = vCard;
                        }
                        synchronized (a.this.b) {
                            a.this.d.put(a.this.b(vCard.getInfoId(), vCard.getType()), vCard2);
                        }
                        if (callback != null) {
                            callback.onSuccess(vCard2);
                        }
                    } else if (callback != null) {
                        callback.onFailure(10019, "数据库插入DB操作失败");
                    }
                }
            }), callback);
        }
    }

    public final void a(final List<VCard> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a22ee32bf25eb4456ed35ac3c7bf0e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a22ee32bf25eb4456ed35ac3c7bf0e4");
        } else if (list != null && !list.isEmpty()) {
            if (this.e) {
                synchronized (this.b) {
                    for (VCard vCard : list) {
                        this.d.put(b(vCard.getInfoId(), vCard.getType()), vCard);
                    }
                }
                return;
            }
            this.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.db.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "661f1decffc220fe70012ca94eb26d51", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "661f1decffc220fe70012ca94eb26d51");
                        return;
                    }
                    c bR_ = a.this.c.bR_();
                    try {
                        try {
                            bR_.b();
                            for (VCard vCard2 : list) {
                                if (f.a().d(bR_, vCard2)) {
                                    synchronized (a.this.b) {
                                        a.this.d.put(a.this.b(vCard2.getInfoId(), vCard2.getType()), vCard2);
                                    }
                                }
                            }
                            bR_.d();
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        } catch (Exception e) {
                            com.sankuai.xm.monitor.statistics.a.a("imui", "VCardDBProxy::add", e);
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        }
                    } catch (Throwable th) {
                        if (bR_.g() && bR_.e()) {
                            bR_.c();
                        }
                        throw th;
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e634205fc1ae0fc60ebbad50fb229a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e634205fc1ae0fc60ebbad50fb229a");
            return;
        }
        synchronized (this.b) {
            this.d.clear();
        }
    }

    List<VCard> a(Collection<Long> collection, int i) {
        Object[] objArr = {collection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414a39e4555b377272159539fd293c06", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414a39e4555b377272159539fd293c06");
        }
        HashSet hashSet = new HashSet(collection.size());
        for (Long l : collection) {
            hashSet.add(l.toString());
        }
        Cursor a2 = this.c.bR_().a(VCard.TABLE_NAME, null, e.a(" AND ", com.sankuai.xm.im.cache.j.a("type", String.valueOf(i), false), com.sankuai.xm.im.cache.j.a(VCard.INFO_ID, (Set<String>) hashSet, "in", false)), null, null, null, null);
        if (a2 == null) {
            return null;
        }
        try {
            if (a2.getCount() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add((VCard) f.a().a(VCard.class, a2));
            }
            return arrayList;
        } catch (Exception e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "VCardDBProxy::getOnQueue", e);
            return null;
        } finally {
            a2.close();
        }
    }

    public String b(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0341389d546248e40eab2f2d71e289", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0341389d546248e40eab2f2d71e289");
        }
        return j + CommonConstant.Symbol.UNDERLINE + i;
    }
}
