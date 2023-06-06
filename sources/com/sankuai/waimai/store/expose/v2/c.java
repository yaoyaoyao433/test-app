package com.sankuai.waimai.store.expose.v2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.j;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    boolean b;
    Handler c;
    ViewTreeObserver d;
    ViewTreeObserver.OnPreDrawListener e;
    public SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> f;
    public Set<String> g;
    public Set<String> h;
    long i;
    private boolean j;
    private View k;

    public c(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5381e59fb54708d30e331373bf1757c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5381e59fb54708d30e331373bf1757c7");
            return;
        }
        this.b = false;
        this.e = new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.store.expose.v2.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62bc2014a9c1a5cb783e19dddc0f8633", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62bc2014a9c1a5cb783e19dddc0f8633")).booleanValue();
                }
                if (c.this.d != null && c.this.d.isAlive() && c.this.b) {
                    if (c.this.c.hasMessages(100)) {
                        c.this.c.removeMessages(100);
                    }
                    if (SystemClock.uptimeMillis() - c.this.i > 1000) {
                        c.this.c.sendEmptyMessage(100);
                        c.this.i = SystemClock.uptimeMillis();
                        return true;
                    }
                    c.this.c.sendEmptyMessageDelayed(100, 500L);
                    return true;
                }
                return true;
            }
        };
        this.f = new SparseArray<>();
        this.g = new HashSet();
        this.h = new HashSet();
        this.j = false;
        if (view == null) {
            return;
        }
        this.k = view;
        this.j = j.h().a("store_hidden_expose/open_store_card_hidden_expose", false);
        this.c = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.expose.v2.c.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50d332723a7a6f307de1155b790cacbb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50d332723a7a6f307de1155b790cacbb");
                    return;
                }
                super.handleMessage(message);
                c.this.i = SystemClock.uptimeMillis();
                if (100 == message.what && c.this.b) {
                    c.this.b(view);
                    c.this.a(false);
                }
            }
        };
        view.post(new Runnable() { // from class: com.sankuai.waimai.store.expose.v2.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e612799dbc8df19cbdb689b1f72ecf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e612799dbc8df19cbdb689b1f72ecf");
                    return;
                }
                c.this.d = view.getViewTreeObserver();
                c.this.d.addOnPreDrawListener(c.this.e);
                c.this.i = SystemClock.uptimeMillis();
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216b4235a0f256093f290fc314b8995c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216b4235a0f256093f290fc314b8995c");
        } else {
            b(this.k);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3556283df9d6a51f55f1e9faddad92e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3556283df9d6a51f55f1e9faddad92e");
        } else {
            a(true);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93607bcd3cf541c2c657dcea4870e4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93607bcd3cf541c2c657dcea4870e4cf");
            return;
        }
        this.b = false;
        b();
        f();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be89cb48971a098f01f4ff0b359c217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be89cb48971a098f01f4ff0b359c217");
            return;
        }
        this.b = false;
        this.c.removeMessages(100);
        if (this.d != null && this.d.isAlive()) {
            this.d.removeOnPreDrawListener(this.e);
        }
        this.f.clear();
        this.g.clear();
        this.h.clear();
    }

    public final void a(com.sankuai.waimai.store.expose.v2.entity.b bVar) {
        View c;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5d60368a7d09304a3a6abf49d7f6d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5d60368a7d09304a3a6abf49d7f6d3");
        } else if (bVar == null || TextUtils.isEmpty(bVar.d()) || (c = bVar.c()) == null) {
        } else {
            this.f.put(c.hashCode(), bVar);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61eea0aa45c98c54fba2aa13429d1c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61eea0aa45c98c54fba2aa13429d1c51");
            return;
        }
        SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> sparseArray = new SparseArray<>();
        for (int i = 0; i < this.f.size(); i++) {
            com.sankuai.waimai.store.expose.v2.entity.b valueAt = this.f.valueAt(i);
            if (valueAt != null && valueAt.c() != null) {
                sparseArray.put(this.f.keyAt(i), valueAt);
            }
        }
        this.f = sparseArray;
    }

    public final com.sankuai.waimai.store.expose.v2.entity.b a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8c090cfe71e665aa71800283276aee", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.expose.v2.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8c090cfe71e665aa71800283276aee");
        }
        if (view == null) {
            return null;
        }
        return this.f.get(view.hashCode());
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca92f6bbdb3ced6de2916dc75cd23f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca92f6bbdb3ced6de2916dc75cd23f3");
            return;
        }
        this.g.clear();
        this.h.clear();
    }

    public final void a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28593960a3550c020b9c08eb7f4b6d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28593960a3550c020b9c08eb7f4b6d63");
        } else if (strArr != null && strArr.length != 0) {
            for (int i = 0; i < this.f.size(); i++) {
                com.sankuai.waimai.store.expose.v2.entity.b valueAt = this.f.valueAt(i);
                String a2 = valueAt.a();
                if (!TextUtils.isEmpty(a2) && a(a2, strArr)) {
                    this.g.remove(valueAt.d());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> boolean a(T t, T... tArr) {
        Object[] objArr = {t, tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba17f45e89a16800f42da26f1b2bb51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba17f45e89a16800f42da26f1b2bb51")).booleanValue();
        }
        if (t == null || tArr == null || tArr.length == 0) {
            return false;
        }
        for (T t2 : tArr) {
            if (t2 != null && t2.equals(t)) {
                return true;
            }
        }
        return false;
    }

    void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8cb7de94120c2070e2eec2ba50d1ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8cb7de94120c2070e2eec2ba50d1ec6");
        } else if (view != null && this.f.size() != 0) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.f.get(view.hashCode());
            if (bVar != null && !this.g.contains(bVar.d())) {
                if (!com.sankuai.waimai.store.expose.v2.utils.a.a(view, com.sankuai.waimai.store.expose.v2.utils.a.a(this.k))) {
                    return;
                }
                if (bVar.e()) {
                    this.g.add(bVar.d());
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    b(viewGroup.getChildAt(i));
                }
            }
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4fce034ab9355447551f5375ba43a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4fce034ab9355447551f5375ba43a0");
        } else if (this.j) {
            for (int i = 0; i < this.f.size(); i++) {
                com.sankuai.waimai.store.expose.v2.entity.b valueAt = this.f.valueAt(i);
                if (valueAt != null && valueAt.c() != null && !t.a(valueAt.g)) {
                    String d = valueAt.d();
                    if (this.g.contains(d) && !this.h.contains(d) && ((z || !com.sankuai.waimai.store.expose.v2.utils.a.a(valueAt.c(), com.sankuai.waimai.store.expose.v2.utils.a.a(this.k))) && valueAt.f())) {
                        this.h.add(d);
                    }
                }
            }
        }
    }
}
