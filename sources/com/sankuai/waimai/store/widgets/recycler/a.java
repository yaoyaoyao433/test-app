package com.sankuai.waimai.store.widgets.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<Holder extends e> extends g implements i<e> {
    public static ChangeQuickRedirect s;
    @NonNull
    protected final a<Holder>.b t;
    @NonNull
    protected final a<Holder>.b u;
    @NonNull
    protected final a<Holder>.b v;
    @NonNull
    protected final ItemInfo w;
    @NonNull
    protected final List<com.sankuai.waimai.store.widgets.recycler.c> x;
    @NonNull
    protected final List<Object> y;
    public int z;

    public abstract int a();

    public abstract int a(int i);

    public abstract e a(ViewGroup viewGroup, int i);

    public void a(View view) {
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    public void a(@NonNull e eVar) {
    }

    public abstract void a(Holder holder, int i);

    @Override // com.sankuai.waimai.store.widgets.recycler.f
    public void a(k kVar) {
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    /* renamed from: b */
    public void c(@NonNull e eVar) {
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    /* renamed from: c */
    public void b(@NonNull e eVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(Object obj, int i) {
        e eVar = (e) obj;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd361af8ec7bc22550404158752dc44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd361af8ec7bc22550404158752dc44");
            return;
        }
        a(i, this.w);
        int i2 = this.w.b;
        int i3 = this.w.c;
        switch (i2) {
            case -6:
                a((a<Holder>) eVar, i3);
                break;
            case -5:
                c.a((c) eVar, this.u.a(i3));
                break;
            case -4:
                c.a((c) eVar, this.t.a(i3));
                break;
        }
        a(eVar, i, i2, i3);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    public final /* synthetic */ e b(ViewGroup viewGroup, int i) {
        e a;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ae78f05f647bfe49cc68f6d5004cf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ae78f05f647bfe49cc68f6d5004cf6");
        }
        switch (i) {
            case -2147483647:
            case -2147483646:
                a = c.a(viewGroup, this.z);
                break;
            default:
                a = a(viewGroup, i);
                break;
        }
        if (a != null) {
            a.M = this;
        }
        return a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df48646e40f5175d546a01dd32444b12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df48646e40f5175d546a01dd32444b12");
            return;
        }
        this.t = new b();
        this.u = new b();
        this.v = new b();
        this.w = new ItemInfo();
        this.x = new ArrayList(1);
        this.y = new ArrayList(1);
        this.z = 1;
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1118268cf595357ccd0da8d8b6ce698d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1118268cf595357ccd0da8d8b6ce698d");
            return;
        }
        this.v.a(view);
        m();
    }

    public final void c(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472cc26edb8b9754183b5fd52029299c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472cc26edb8b9754183b5fd52029299c");
            return;
        }
        this.v.b.remove(0);
        m();
    }

    public final void d(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0a938f93dcc6953817d7beaa806dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0a938f93dcc6953817d7beaa806dc7");
            return;
        }
        this.t.b.remove(1);
        m();
    }

    public final List<C1342a> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ac12f96c5f61773274624dc98ff9ec", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ac12f96c5f61773274624dc98ff9ec") : this.v.b;
    }

    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f071d74b9b3921c5b7300160160f4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f071d74b9b3921c5b7300160160f4f9");
            return;
        }
        a(view);
        this.t.a(view);
        l();
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, 1};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ab7209c64793e2ced7e95d6cc603e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ab7209c64793e2ced7e95d6cc603e5");
            return;
        }
        a<Holder>.b bVar = this.t;
        Object[] objArr2 = {view, 1};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "96a718d96967a4bb63c57b08f1a8613f", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "96a718d96967a4bb63c57b08f1a8613f")).booleanValue();
        } else if (view != null) {
            bVar.b.add(1, new C1342a(view));
        }
        l();
    }

    public final void d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f68417b61cf8354a1557673ff46e147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f68417b61cf8354a1557673ff46e147");
            return;
        }
        this.u.a(view);
        l();
    }

    public final List<C1342a> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312f1de9968508f8adb6aa9fa3b8836a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312f1de9968508f8adb6aa9fa3b8836a") : this.t.b;
    }

    public final void e(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65359803eca81a2ad45e16e9db7a617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65359803eca81a2ad45e16e9db7a617");
            return;
        }
        this.t.a(view, true);
        l();
    }

    public final void f(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202475724f0788fe13402b1a442f0c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202475724f0788fe13402b1a442f0c43");
            return;
        }
        this.t.a(view, false);
        l();
    }

    public final void g(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb7b3e9316cbdc22e8a2aefb2619b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb7b3e9316cbdc22e8a2aefb2619b3c");
            return;
        }
        this.u.a(view, true);
        l();
    }

    public final void h(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a25a8a6943ac8ff7cb5228399909c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a25a8a6943ac8ff7cb5228399909c4");
            return;
        }
        this.u.a(view, false);
        l();
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a870a8e50ad8e38f549c43be92fe63e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a870a8e50ad8e38f549c43be92fe63e")).intValue() : this.t.a();
    }

    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58931c6b1bd64033aa51f722aadc7b71", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58931c6b1bd64033aa51f722aadc7b71")).intValue() : this.u.a();
    }

    public final void a(com.sankuai.waimai.store.widgets.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4192fa2c85e6b18eaadf4174faa0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4192fa2c85e6b18eaadf4174faa0fd");
        } else {
            this.x.add(cVar);
        }
    }

    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e7cab285a917ecef2d412ccb4fb3bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e7cab285a917ecef2d412ccb4fb3bb")).booleanValue() : j() == 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41037d971417d2057b1e88f6478791c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41037d971417d2057b1e88f6478791c5")).intValue() : a();
    }

    private ItemInfo a(int i, @NonNull ItemInfo itemInfo) {
        Object[] objArr = {Integer.valueOf(i), itemInfo};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd53221622bf50cfaba9b7687bf2da09", RobustBitConfig.DEFAULT_VALUE)) {
            return (ItemInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd53221622bf50cfaba9b7687bf2da09");
        }
        if (itemInfo == null) {
            return null;
        }
        if (i < 0) {
            itemInfo.a();
            return itemInfo;
        }
        int h = h();
        if (i >= h) {
            int a = a();
            int i2 = h + a;
            if (i >= i2) {
                if (i >= i2 + i()) {
                    itemInfo.a();
                    return itemInfo;
                }
                itemInfo.b = -5;
                itemInfo.c = (i - h) - a;
                return itemInfo;
            }
            itemInfo.b = -6;
            itemInfo.c = i - h;
            return itemInfo;
        }
        itemInfo.b = -4;
        itemInfo.c = i;
        return itemInfo;
    }

    public final void a(e eVar, View view) {
        Object[] objArr = {eVar, view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0abf542c1525b75a4664d97e84f0e048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0abf542c1525b75a4664d97e84f0e048");
        } else if (view.getVisibility() == 0 && !this.x.isEmpty()) {
            int adapterPosition = eVar.getAdapterPosition();
            a(adapterPosition, this.w);
            int i = this.w.b;
            int i2 = this.w.c;
            for (com.sankuai.waimai.store.widgets.recycler.c cVar : this.x) {
                cVar.a(this, eVar, adapterPosition, i, i2);
            }
            switch (i) {
                case -6:
                    for (com.sankuai.waimai.store.widgets.recycler.c cVar2 : this.x) {
                        cVar2.a(this, eVar, i2, adapterPosition);
                    }
                    return;
                case -5:
                    Iterator<com.sankuai.waimai.store.widgets.recycler.c> it = this.x.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                case -4:
                    Iterator<com.sankuai.waimai.store.widgets.recycler.c> it2 = this.x.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    public final int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b71e71b325e15efa6df6045e8b5620", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b71e71b325e15efa6df6045e8b5620")).intValue();
        }
        a(i, this.w);
        int i2 = this.w.b;
        int i3 = this.w.c;
        switch (i2) {
            case -6:
                int a = a(i3);
                if (a == -2147483647 || a == -2147483646) {
                    throw new RuntimeException("getItemViewType() should not return HEADER or FOOTER");
                }
                return a;
            case -5:
                return -2147483646;
            case -4:
                return -2147483647;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private void a(e eVar, int i, int i2, int i3) {
        Object[] objArr = {eVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1dcbb6ee54eb78e20ae2585aeab211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1dcbb6ee54eb78e20ae2585aeab211");
        } else if (this.y.isEmpty()) {
        } else {
            Iterator<Object> it = this.y.iterator();
            while (it.hasNext()) {
                it.next();
            }
            switch (i2) {
                case -6:
                    Iterator<Object> it2 = this.y.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                case -5:
                    Iterator<Object> it3 = this.y.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return;
                case -4:
                    Iterator<Object> it4 = this.y.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.i
    public final int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67339507ae2d1dd6846db5051fb8e67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67339507ae2d1dd6846db5051fb8e67")).intValue();
        }
        return h() + a() + i();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.recycler.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1342a {
        public static ChangeQuickRedirect a;
        @NonNull
        final View b;
        boolean c;

        public C1342a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0beb705e247fe2a848b71157307d85e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0beb705e247fe2a848b71157307d85e");
                return;
            }
            this.c = true;
            this.b = view;
            this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;
        final List<C1342a> b;

        private b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e94786034dc7d4a05cf26071963d40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e94786034dc7d4a05cf26071963d40");
            } else {
                this.b = new ArrayList();
            }
        }

        boolean a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a202a335efb2e00d185324fc17b5499", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a202a335efb2e00d185324fc17b5499")).booleanValue();
            }
            if (view == null) {
                return false;
            }
            this.b.add(new C1342a(view));
            return true;
        }

        boolean a(View view, boolean z) {
            Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81f8d125be47b150b362b8623560bae", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81f8d125be47b150b362b8623560bae")).booleanValue();
            }
            C1342a b = b(view);
            Object[] objArr2 = {b, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c5b99b56b03d6f9b5939a6c6b696a9f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c5b99b56b03d6f9b5939a6c6b696a9f")).booleanValue();
            }
            if (b == null || b.c == z) {
                return false;
            }
            b.c = z;
            return true;
        }

        private C1342a b(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d12f4ad17dcb26e17b2f01dad025c7", RobustBitConfig.DEFAULT_VALUE)) {
                return (C1342a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d12f4ad17dcb26e17b2f01dad025c7");
            }
            if (view == null) {
                return null;
            }
            for (C1342a c1342a : this.b) {
                if (c1342a.b == view) {
                    return c1342a;
                }
            }
            return null;
        }

        int a() {
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e780eb8ee5c4749db9cc8e8acf0ba463", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e780eb8ee5c4749db9cc8e8acf0ba463")).intValue();
            }
            for (C1342a c1342a : this.b) {
                if (c1342a.c) {
                    i++;
                }
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea68347fd802249a94c59c83e1477b7", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea68347fd802249a94c59c83e1477b7");
            }
            if (i < 0 || i >= this.b.size()) {
                return null;
            }
            for (C1342a c1342a : this.b) {
                if (c1342a.c) {
                    if (i == 0) {
                        return c1342a.b;
                    }
                    i--;
                }
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends e {
        public static ChangeQuickRedirect a;
        private FrameLayout b;
        private View c;

        public static /* synthetic */ c a(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fcd7c606e8852dcd75c4cd5ddb9fd2b", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fcd7c606e8852dcd75c4cd5ddb9fd2b");
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new RecyclerView.g(i == 1 ? -1 : -2, -2));
            return new c(frameLayout);
        }

        public static /* synthetic */ void a(c cVar, View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e8cf1c574f5a8b591b7d5ab454e57d0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e8cf1c574f5a8b591b7d5ab454e57d0f");
            } else if (view != null) {
                cVar.b.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(view);
                }
                cVar.b.addView(view, new FrameLayout.LayoutParams(-1, -2));
                cVar.c = view;
            }
        }

        private c(FrameLayout frameLayout) {
            super(frameLayout);
            Object[] objArr = {frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd105202a39cf3a76db6fb2ae4f41429", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd105202a39cf3a76db6fb2ae4f41429");
            } else {
                this.b = frameLayout;
            }
        }
    }
}
