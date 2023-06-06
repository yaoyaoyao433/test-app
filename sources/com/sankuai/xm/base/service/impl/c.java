package com.sankuai.xm.base.service.impl;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.lifecycle.d;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.service.a implements l {
    public static ChangeQuickRedirect a;
    private final Map<String, C1376c> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65156aa1a9235eb55006505f39c8052c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65156aa1a9235eb55006505f39c8052c");
        } else {
            this.b = new HashMap();
        }
    }

    @Override // com.sankuai.xm.base.service.l
    @NonNull
    public final <T> l.a<T> a(@NonNull Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8a1e0294406db7ce7ced2ab964ebb0", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8a1e0294406db7ce7ced2ab964ebb0") : a(cls.getName());
    }

    @Override // com.sankuai.xm.base.service.l
    @NonNull
    public final <T> l.a<T> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f473648b3e0847745df8e88161303b9", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f473648b3e0847745df8e88161303b9") : c(str);
    }

    @Override // com.sankuai.xm.base.service.l
    @NonNull
    public final <T> l.b<T> b(@NonNull Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19660c28269cd55a0c0a128544ee134", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19660c28269cd55a0c0a128544ee134") : b(cls.getName());
    }

    @Override // com.sankuai.xm.base.service.l
    @NonNull
    public final <T> l.b<T> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9dbdad17eab411c86d2671cf90caaa", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9dbdad17eab411c86d2671cf90caaa") : c(str);
    }

    private <T> C1376c<T> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee343cd1a32b4f5156b36bf85c10373", 6917529027641081856L)) {
            return (C1376c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee343cd1a32b4f5156b36bf85c10373");
        }
        C1376c<T> c1376c = this.b.get(str);
        return c1376c == null ? d(str) : c1376c;
    }

    private synchronized <T> C1376c<T> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc57752fa5e9da41a06c64837448c0e0", 6917529027641081856L)) {
            return (C1376c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc57752fa5e9da41a06c64837448c0e0");
        }
        C1376c<T> c1376c = this.b.get(str);
        if (c1376c == null) {
            c1376c = new C1376c<>();
            this.b.put(str, c1376c);
        }
        return c1376c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<T> implements l.a<T> {
        public static ChangeQuickRedirect a;
        final s<T> b;
        private final HashSet<Short> c;
        private Context d;
        private boolean e;
        private int f;

        public a(@NonNull s<T> sVar) {
            Object[] objArr = {sVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eeff98af291c0296800dbb7095a7508", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eeff98af291c0296800dbb7095a7508");
                return;
            }
            this.c = new HashSet<>();
            this.e = false;
            this.f = 0;
            this.b = sVar;
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final void a(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83dc2fcb258a182fc8d89d6896c89e4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83dc2fcb258a182fc8d89d6896c89e4e");
                return;
            }
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9587f52992e5fe8dad304326307333b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9587f52992e5fe8dad304326307333b");
            } else if (t != null && this.d != null) {
                d.a(this.d, new com.sankuai.xm.base.lifecycle.c<T>(t) { // from class: com.sankuai.xm.base.service.impl.c.a.1
                    public static ChangeQuickRedirect c;

                    @Override // com.sankuai.xm.base.lifecycle.c, com.sankuai.xm.base.lifecycle.b
                    public final void g(Context context) {
                        Object[] objArr3 = {context};
                        ChangeQuickRedirect changeQuickRedirect3 = c;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c004380041782c3e6cd27211d7907f58", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c004380041782c3e6cd27211d7907f58");
                            return;
                        }
                        s<T> sVar = a.this.b;
                        T t2 = this.b;
                        Object[] objArr4 = {t2};
                        ChangeQuickRedirect changeQuickRedirect4 = s.a;
                        if (PatchProxy.isSupport(objArr4, sVar, changeQuickRedirect4, false, "b7d0e023607fec573a9906b82afc38db", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, sVar, changeQuickRedirect4, false, "b7d0e023607fec573a9906b82afc38db");
                        } else {
                            sVar.a((Short) null, (Short) t2, true);
                        }
                        super.g(context);
                    }
                });
            }
            if (this.c.size() > 0) {
                Iterator<Short> it = this.c.iterator();
                while (it.hasNext()) {
                    this.b.a((s<T>) t, this.f, Short.valueOf(it.next().shortValue()), this.e);
                }
                return;
            }
            this.b.a((s<T>) t, this.f, (Short) null, this.e);
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final boolean d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a3f350835c8ec452bcadd25bcd02b9b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a3f350835c8ec452bcadd25bcd02b9b")).booleanValue() : this.b.a();
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final void b(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b22d672b7d4c3b0d04cb6319cc8dfd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b22d672b7d4c3b0d04cb6319cc8dfd5");
            } else if (this.c.size() > 0) {
                Iterator<Short> it = this.c.iterator();
                while (it.hasNext()) {
                    this.b.a(Short.valueOf(it.next().shortValue()), (Short) t);
                }
            } else {
                s<T> sVar = this.b;
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = s.a;
                if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "cd945ae095d984747aafda1a5d64f907", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "cd945ae095d984747aafda1a5d64f907");
                } else {
                    sVar.a((Short) null, (Short) t);
                }
            }
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(Context context) {
            this.d = context;
            return this;
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(short s) {
            Object[] objArr = {Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "251e6a45a73480e9a6997220a6eb8f12", 6917529027641081856L)) {
                return (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "251e6a45a73480e9a6997220a6eb8f12");
            }
            this.c.add(Short.valueOf(s));
            return this;
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a() {
            this.e = true;
            return this;
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(@IntRange(from = 0) int i) {
            this.f = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b<T> implements l.b<T> {
        public static ChangeQuickRedirect a;
        private final HashSet<Short> b;
        private boolean c;
        private boolean d;
        private final s<T> e;

        private b(@NonNull s<T> sVar) {
            Object[] objArr = {sVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30665e4a65df4ad4d5e6f02f2f251f15", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30665e4a65df4ad4d5e6f02f2f251f15");
                return;
            }
            this.b = new HashSet<>();
            this.c = false;
            this.d = false;
            this.e = sVar;
        }

        @Override // com.sankuai.xm.base.service.l.d
        public final void a(b.a<T> aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f17775a0465ec7bd28a6d2aec0c851c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f17775a0465ec7bd28a6d2aec0c851c");
                return;
            }
            try {
                if (this.d) {
                    this.e.a(aVar, this.c);
                    return;
                }
                if (this.b.size() > 0) {
                    short[] sArr = new short[this.b.size()];
                    Iterator<Short> it = this.b.iterator();
                    while (it.hasNext()) {
                        sArr[0] = it.next().shortValue();
                    }
                    this.e.a(aVar, this.c, sArr);
                }
                this.e.a(aVar, this.c, new short[0]);
            } catch (Throwable th) {
                com.sankuai.xm.monitor.statistics.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "ListenerService::safeNotify", th);
            }
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> a(short... sArr) {
            Object[] objArr = {sArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4005e953733f1667e7ba73f9da0d69ea", 6917529027641081856L)) {
                return (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4005e953733f1667e7ba73f9da0d69ea");
            }
            if (sArr != null && sArr.length > 0) {
                for (short s : sArr) {
                    this.b.add(Short.valueOf(s));
                }
            }
            return this;
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> b() {
            this.d = true;
            return this;
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> c() {
            this.c = true;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.service.impl.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1376c<T> implements l.a<T>, l.b<T> {
        public static ChangeQuickRedirect a;
        private final s<T> b;

        public C1376c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9bf78205de66e11e5e4debf646c055", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9bf78205de66e11e5e4debf646c055");
            } else {
                this.b = new s<>();
            }
        }

        private l.a<T> e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1334b55c44c07da8f0ae2df09bda4c3", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1334b55c44c07da8f0ae2df09bda4c3") : new a(this.b);
        }

        private l.b<T> f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ce6ae9f54623266ddca803cb4e9b63", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ce6ae9f54623266ddca803cb4e9b63") : new b(this.b);
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final void a(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d8b2eadebb3dd63bbe6eca1096a046", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d8b2eadebb3dd63bbe6eca1096a046");
            } else {
                e().a((l.a<T>) t);
            }
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final boolean d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412a077f09f1c4c0eea5ae8d7e0e8c66", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412a077f09f1c4c0eea5ae8d7e0e8c66")).booleanValue() : e().d();
        }

        @Override // com.sankuai.xm.base.service.l.c
        public final void b(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9079066938ff1286d9b095c290ddbde", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9079066938ff1286d9b095c290ddbde");
            } else {
                e().b(t);
            }
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0a425468c13cb6d3d765597e083c0e", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0a425468c13cb6d3d765597e083c0e") : e().a(context);
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(short s) {
            Object[] objArr = {Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6797ff740e7ce60ebd1247e5669d68d", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6797ff740e7ce60ebd1247e5669d68d") : e().a(s);
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf9d77c58fa152a6581e121b37a327e", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf9d77c58fa152a6581e121b37a327e") : e().a();
        }

        @Override // com.sankuai.xm.base.service.l.a
        public final l.a<T> a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd452627341e18237c93678b8a8bf74a", 6917529027641081856L) ? (l.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd452627341e18237c93678b8a8bf74a") : e().a(i);
        }

        @Override // com.sankuai.xm.base.service.l.d
        public final void a(b.a<T> aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3bf07c1c238c18c21cfbb3b0be72502", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3bf07c1c238c18c21cfbb3b0be72502");
            } else {
                f().a(aVar);
            }
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> a(short... sArr) {
            Object[] objArr = {sArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2401497ccc4760cfba7d801deec6f0ba", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2401497ccc4760cfba7d801deec6f0ba") : f().a(sArr);
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24d0583e0a93320abef914c2c3fbd75", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24d0583e0a93320abef914c2c3fbd75") : f().b();
        }

        @Override // com.sankuai.xm.base.service.l.b
        public final l.b<T> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b82989f249ee37b17ca33570f0c743e", 6917529027641081856L) ? (l.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b82989f249ee37b17ca33570f0c743e") : f().c();
        }
    }
}
