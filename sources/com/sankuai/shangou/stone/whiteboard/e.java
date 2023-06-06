package com.sankuai.shangou.stone.whiteboard;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;
    private d d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0566f88f644b9355994d1c9da9e45d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0566f88f644b9355994d1c9da9e45d2");
            return;
        }
        this.b = new a();
        this.c = new b();
        this.d = new d();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4cafe9d87158cbe5f71686b2c77d2da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4cafe9d87158cbe5f71686b2c77d2da");
            return;
        }
        this.b.a(str, null);
        b bVar = this.c;
        Object[] objArr2 = {str, null};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a4bf21c2b8b93f2de29d5dea8569c010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a4bf21c2b8b93f2de29d5dea8569c010");
            return;
        }
        c cVar = new c();
        cVar.b = new Pair<>(str, null);
        bVar.c.add(cVar);
        bVar.a();
    }

    public final <T> T a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "350badd988a146d3deb6defbd61b4da3", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "350badd988a146d3deb6defbd61b4da3");
        }
        a aVar = this.b;
        Object[] objArr2 = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "00d53afbd7c3fb219ed7957ccac1677d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "00d53afbd7c3fb219ed7957ccac1677d");
        }
        T t = (T) aVar.b.get(str);
        if (t == null) {
            return null;
        }
        if (cls.isInstance(t)) {
            return t;
        }
        throw new ClassCastException("data is not class:" + cls.getSimpleName());
    }

    public final <T> void b(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af6cb736848186252008f50aa09b0d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af6cb736848186252008f50aa09b0d7");
        } else {
            this.b.a(str, t);
        }
    }

    public final <T> rx.d<T> b(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df46b296a5bb10cf75dcfc2db00e7c89", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df46b296a5bb10cf75dcfc2db00e7c89");
        }
        Object[] objArr2 = {str, cls, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46878c23ad41109347993c2d227b93d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46878c23ad41109347993c2d227b93d4");
        }
        b bVar = this.c;
        Object[] objArr3 = {str, cls};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a28d4c558cf58a6ea45894d2faed6b34", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a28d4c558cf58a6ea45894d2faed6b34");
        }
        if (bVar.b.get(str) == null) {
            bVar.b.put(str, rx.subjects.b.g());
        }
        return (rx.d<T>) bVar.b.get(str).c();
    }

    public final <T> void c(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172e3cc03ab726817c96d8c39fbfe8fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172e3cc03ab726817c96d8c39fbfe8fc");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = {str, t};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "745ac259585bdc128d8bbccdf9de6ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "745ac259585bdc128d8bbccdf9de6ad7");
        } else {
            dVar.b.put(str, t);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb27ad205f53746df3c4e0c8e95d1ce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb27ad205f53746df3c4e0c8e95d1ce4");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b305ef4de1b6d6ecfe2fcf640386050a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b305ef4de1b6d6ecfe2fcf640386050a");
        } else {
            dVar.b.remove(str);
        }
    }

    public final <T> T c(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce8ec110b997eeaeb55fe862ceee55c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce8ec110b997eeaeb55fe862ceee55c");
        }
        d dVar = this.d;
        Object[] objArr2 = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6c34093589dbd99167620c40d293cef2", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6c34093589dbd99167620c40d293cef2") : (T) dVar.b.get(str);
    }
}
