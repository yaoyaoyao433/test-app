package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public List<q> b;

    private r(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f940394b23bf50aa47e1722536f7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f940394b23bf50aa47e1722536f7bf");
            return;
        }
        this.b = aVar.b;
        if (this.b == null) {
            this.b = new ArrayList();
        }
    }

    public r(List<q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d1765bf1d17d8878c33ce149f25e52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d1765bf1d17d8878c33ce149f25e52");
            return;
        }
        this.b = list;
        if (this.b == null) {
            this.b = new ArrayList();
        }
    }

    public final List<q> a() {
        return this.b;
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533c82d91f6bdc21ede9dbf5074b922b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533c82d91f6bdc21ede9dbf5074b922b");
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            q qVar = this.b.get(i);
            if (str.equalsIgnoreCase(qVar.b)) {
                return qVar.c;
            }
        }
        return null;
    }

    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e858f1f5e1d30b11e3996bf2cbe40d2c", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e858f1f5e1d30b11e3996bf2cbe40d2c");
        }
        a aVar = new a();
        aVar.b.addAll(this.b);
        return aVar;
    }

    public static r a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d80d08d9cd0c16f1e843ffb253d51ef", 6917529027641081856L)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d80d08d9cd0c16f1e843ffb253d51ef");
        }
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String trim = entry.getKey().trim();
            String trim2 = entry.getValue().trim();
            if (trim.length() == 0 || trim.indexOf(0) != -1 || trim2.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + trim + ": " + trim2);
            }
            arrayList.add(new q(trim, trim2));
        }
        return new r(arrayList);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        final List<q> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90663ecbd558abd16bd284c14e9d94f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90663ecbd558abd16bd284c14e9d94f");
            } else {
                this.b = new ArrayList(20);
            }
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a503f591859cbbe44511f4124acaea1", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a503f591859cbbe44511f4124acaea1");
            }
            c(str, str2);
            this.b.add(new q(str, str2.trim()));
            return this;
        }

        public final a a(List<q> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48642ceff1daf0a53c6c43ceb22d119", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48642ceff1daf0a53c6c43ceb22d119");
            }
            if (list == null) {
                throw new NullPointerException("headers == null");
            }
            this.b.addAll(list);
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2044e71503d878a70354d5360042b659", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2044e71503d878a70354d5360042b659");
            }
            Iterator<q> it = this.b.iterator();
            while (it.hasNext()) {
                if (it.next().b.equalsIgnoreCase(str)) {
                    it.remove();
                }
            }
            return this;
        }

        public final a b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0e97a8714f96b757a75c92d84e4244", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0e97a8714f96b757a75c92d84e4244");
            }
            c(str, str2);
            a(str);
            this.b.add(new q(str, str2.trim()));
            return this;
        }

        private void c(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a864bd7cc75193f31330a3bb3bc6b49", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a864bd7cc75193f31330a3bb3bc6b49");
            } else if (str == null) {
                throw new NullPointerException("name == null");
            } else {
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("name is empty");
                }
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(g.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                int length2 = str2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = str2.charAt(i2);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(g.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                    }
                }
            }
        }

        public final r a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dcdc1b44a8055c0b8a26fca91972551", 6917529027641081856L) ? (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dcdc1b44a8055c0b8a26fca91972551") : new r(this);
        }
    }
}
