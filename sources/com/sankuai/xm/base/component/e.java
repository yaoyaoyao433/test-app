package com.sankuai.xm.base.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e<T> {
    public static ChangeQuickRedirect a;
    public volatile b b;
    private volatile T c;
    private final Class<T> d;
    private final String e;
    private final d f;

    public e(Class<T> cls, String str, d dVar) {
        this(cls, str, null, dVar);
        Object[] objArr = {cls, str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8501423f3695a0910d31ae286367e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8501423f3695a0910d31ae286367e9");
        }
    }

    private e(Class<T> cls, String str, b bVar, d dVar) {
        Object[] objArr = {cls, str, null, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650c329822f4d3274060e8c33a911543", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650c329822f4d3274060e8c33a911543");
            return;
        }
        this.d = cls;
        this.e = str;
        this.b = null;
        this.f = dVar;
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    public final T a() {
        T cast;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23686007249e4b5345cef191c8bdce44", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23686007249e4b5345cef191c8bdce44");
        }
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            b bVar = null;
            if (this.c == null && this.b != null) {
                b bVar2 = this.b;
                Class<T> cls = this.d;
                String str = this.e;
                Object[] objArr2 = {cls, str, null};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "23266d269cc7a80a5d1b50b4f0300935", 6917529027641081856L)) {
                    cast = (T) PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "23266d269cc7a80a5d1b50b4f0300935");
                } else {
                    if (str == null) {
                        str = cls.getName();
                    }
                    Object obj = bVar2.b.get(str);
                    if (cls.isInstance(obj)) {
                        cast = cls.cast(obj);
                    } else {
                        Object obj2 = bVar2.c.get(cls);
                        cast = cls.isInstance(obj2) ? cls.cast(obj2) : null;
                    }
                }
                this.c = cast;
            }
            if (this.c == null && this.f != null) {
                d dVar = this.f;
                String str2 = this.e;
                Class<T> cls2 = this.d;
                if (this.b != null) {
                    b bVar3 = this.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    bVar = PatchProxy.isSupport(objArr3, bVar3, changeQuickRedirect3, false, "62d4473277acf01587dc8cfcac0c178a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr3, bVar3, changeQuickRedirect3, false, "62d4473277acf01587dc8cfcac0c178a") : new b(null, bVar3.c);
                }
                this.c = (T) dVar.a(str2, cls2, bVar);
            }
            if (this.c == null) {
                this.c = (T) m.a(this.d);
            }
            if (this.c == null) {
                try {
                    this.c = this.d.newInstance();
                } catch (Exception e) {
                    com.sankuai.xm.log.a.a(e, "Lazy::get failed for %s:%s", this.d, this.e);
                }
            }
        }
        return this.c;
    }
}
