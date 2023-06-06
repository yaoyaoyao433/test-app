package com.sankuai.xm.imui.listener;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private ConcurrentHashMap<String, List<com.sankuai.xm.imui.session.listener.b>> c;
    private ConcurrentHashMap<String, Object> d;
    private ConcurrentHashMap<String, Object> e;
    private ConcurrentHashMap<String, com.sankuai.xm.imui.session.listener.a> f;
    private ConcurrentHashMap<String, com.sankuai.xm.im.vcard.b> g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21488b02e6ea22b80622d4dd73176e06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21488b02e6ea22b80622d4dd73176e06");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b15598048ed989127307ce80971171ba", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b15598048ed989127307ce80971171ba");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final synchronized void a(String str, com.sankuai.xm.imui.session.listener.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23e357dd557b69b17436155113fdac6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23e357dd557b69b17436155113fdac6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            List<com.sankuai.xm.imui.session.listener.b> list = this.c.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.c.put(str, list);
            }
            list.add(bVar);
        }
    }

    public final synchronized void b(String str, com.sankuai.xm.imui.session.listener.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8421340814c07dc095efcd3a477efe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8421340814c07dc095efcd3a477efe");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            List<com.sankuai.xm.imui.session.listener.b> list = this.c.get(str);
            if (list != null) {
                list.remove(bVar);
                if (list.size() == 0) {
                    this.c.remove(str);
                }
            }
        }
    }

    public final synchronized List<com.sankuai.xm.imui.session.listener.b> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daab7754795d5054aa1857a3d6478afb", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daab7754795d5054aa1857a3d6478afb");
        }
        ArrayList arrayList = new ArrayList();
        List<com.sankuai.xm.imui.session.listener.b> list = this.c.get(str);
        if (!com.sankuai.xm.base.util.b.a(list)) {
            arrayList.addAll(list);
        }
        List<com.sankuai.xm.imui.session.listener.b> list2 = this.c.get("IMUI_GLOBAL_KEY");
        if (!com.sankuai.xm.base.util.b.a(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final synchronized Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c20d35ad58506007ed7fbb4468dbb89", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c20d35ad58506007ed7fbb4468dbb89");
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.d);
        return hashMap;
    }

    public final synchronized void a(String str, com.sankuai.xm.imui.session.listener.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ed0c0b495a99ce11dfb5c9181e5a27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ed0c0b495a99ce11dfb5c9181e5a27");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f.put(str, aVar);
        }
    }

    public final synchronized com.sankuai.xm.imui.session.listener.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9734f10320ccfd9150f8c550e8ef90", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9734f10320ccfd9150f8c550e8ef90");
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return this.f.remove(str);
        }
    }

    public final synchronized com.sankuai.xm.imui.session.listener.a c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea69e79c08e421e5968364521b0a612", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea69e79c08e421e5968364521b0a612");
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (this.f.containsKey(str)) {
                return this.f.get(str);
            }
            return null;
        }
    }

    public final synchronized ConcurrentHashMap<String, Object> c() {
        return this.e;
    }

    public final synchronized ConcurrentHashMap<String, com.sankuai.xm.im.vcard.b> d() {
        return this.g;
    }
}
