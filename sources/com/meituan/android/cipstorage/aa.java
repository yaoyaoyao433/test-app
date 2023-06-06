package com.meituan.android.cipstorage;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa {
    public static ChangeQuickRedirect a;
    b b;
    a c;
    int d;
    public Stack<a> e;
    public Stack<Integer> f;
    int g;
    private final b h;
    private final String i;
    private final List<String> j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface c {
        void a(File file, String str, long j, String str2, int i);

        void a(String str, long j);

        void a(String str, long j, String str2, int i);
    }

    public aa(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4487cee04a2e59a5c9ca3845a3e531a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4487cee04a2e59a5c9ca3845a3e531a");
            return;
        }
        this.j = a(str);
        this.h = new b(null, "");
        this.i = this.j.get(this.j.size() - 1);
        this.h.a(this.i, new b(this.h, this.i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5718196c62e761b7434e10acb4d0d7", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5718196c62e761b7434e10acb4d0d7") : this.h.a(this.i);
    }

    public final void a(String str, int i) {
        b a2;
        b a3;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4c6b062454c3d369edea2131cab97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4c6b062454c3d369edea2131cab97d");
        } else if (!TextUtils.isEmpty(str)) {
            List<String> a4 = a(str);
            if (a4.size() < this.j.size()) {
                return;
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (!TextUtils.equals(a4.get(i2), this.j.get(i2))) {
                    return;
                }
            }
            if (a4.size() == this.j.size()) {
                a2 = null;
                a3 = a();
            } else {
                a2 = a(a4, this.j.size(), a4.size() - 2);
                a3 = a2.a(a4.get(a4.size() - 1));
            }
            if (a3 == null) {
                String str2 = a4.get(a4.size() - 1);
                a aVar = new a(a2, str2, str, i);
                if (a2 != null) {
                    a2.a(str2, aVar);
                }
            } else if (a3.a()) {
                ((a) a3).a(i);
            } else {
                a.a(a3, str, i);
            }
        }
    }

    private b a(List<String> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a265512388a7affa40fe9a1477dcb17", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a265512388a7affa40fe9a1477dcb17");
        }
        b a2 = a();
        while (i <= i2) {
            String str = list.get(i);
            b a3 = a2.a(str);
            if (a3 == null) {
                a3 = new b(a2, str);
                a2.a(str, a3);
            }
            a2 = a3;
            i++;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16d7030b8cd0436b1ebbd9330b37d6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16d7030b8cd0436b1ebbd9330b37d6d8");
            return;
        }
        if (bVar.i != null) {
            for (b bVar2 : bVar.i.values()) {
                a(bVar2);
            }
        }
        if (bVar.a()) {
            a((a) bVar, bVar, 0);
        }
    }

    private static void a(a aVar, b bVar, int i) {
        Object[] objArr = {aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07ce5da988787d1ea6faa09a0de7eb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07ce5da988787d1ea6faa09a0de7eb4a");
        } else if (i <= aVar.d) {
            if (i != 0 && bVar.a()) {
                for (Integer num : aVar.c) {
                    int intValue = num.intValue() - i;
                    if (intValue >= 0) {
                        a aVar2 = (a) bVar;
                        aVar2.a(intValue);
                        aVar2.a(intValue, aVar.b, num.intValue());
                    }
                }
            }
            if (bVar.i != null) {
                for (b bVar2 : bVar.i.values()) {
                    a(aVar, bVar2, i + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect g;
        public String h;
        public Map<String, b> i;
        public b j;

        public boolean a() {
            return false;
        }

        public b(b bVar, String str) {
            Object[] objArr = {bVar, str};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703f4a456767dcb44bd0e1715de68f5e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703f4a456767dcb44bd0e1715de68f5e");
                return;
            }
            this.j = bVar;
            this.h = str;
        }

        public final b a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bd447dfd8ed37ff73eeab2d99b921c", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bd447dfd8ed37ff73eeab2d99b921c");
            }
            if (this.i == null) {
                return null;
            }
            return this.i.get(str);
        }

        public final void a(String str, b bVar) {
            Object[] objArr = {str, bVar};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e52f337932cbca9e23e8b8d00a14df1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e52f337932cbca9e23e8b8d00a14df1c");
                return;
            }
            if (this.i == null) {
                this.i = new HashMap();
            }
            this.i.put(str, bVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends b {
        public static ChangeQuickRedirect a;
        public String b;
        public Set<Integer> c;
        public int d;
        public Map<Integer, String> e;
        public Map<Integer, Integer> f;

        @Override // com.meituan.android.cipstorage.aa.b
        public final boolean a() {
            return true;
        }

        public a(b bVar, String str, String str2, int i) {
            super(bVar, str);
            Object[] objArr = {bVar, str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43c98f46620b7d211bed6ea19b9f78e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43c98f46620b7d211bed6ea19b9f78e");
                return;
            }
            this.b = str2;
            this.c = new HashSet();
            this.c.add(Integer.valueOf(i));
            this.d = i;
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1c3bcd3053d613f77fb40e3f6ab325", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1c3bcd3053d613f77fb40e3f6ab325");
            } else if (this.c.contains(Integer.valueOf(i))) {
            } else {
                this.c.add(Integer.valueOf(i));
                this.d = Math.max(this.d, i);
            }
        }

        public final void a(int i, String str, int i2) {
            Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f9a307e83b1d60a886c9386cfbd65d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f9a307e83b1d60a886c9386cfbd65d");
                return;
            }
            a(i);
            if (this.f == null) {
                this.f = new HashMap();
            }
            if (this.e == null) {
                this.e = new HashMap();
            }
            this.f.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.e.put(Integer.valueOf(i), str);
        }

        public final Pair<String, Integer> b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3398f3fcc60758140584913c479f82", RobustBitConfig.DEFAULT_VALUE)) {
                return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3398f3fcc60758140584913c479f82");
            }
            if (this.e == null) {
                return new Pair<>(this.b, Integer.valueOf(i));
            }
            String str = this.e.get(Integer.valueOf(i));
            if (str == null) {
                return new Pair<>(this.b, Integer.valueOf(i));
            }
            return new Pair<>(str, this.f.get(Integer.valueOf(i)));
        }

        public static void a(b bVar, String str, int i) {
            Object[] objArr = {bVar, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54524317f9874dc8fd5c1a29752b3448", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54524317f9874dc8fd5c1a29752b3448");
            } else if (!bVar.a()) {
                a aVar = new a(bVar.j, bVar.h, str, i);
                aVar.i = bVar.i;
                b bVar2 = bVar.j;
                if (bVar2 != null) {
                    bVar2.a(bVar.h, aVar);
                }
                if (bVar.i != null) {
                    for (Map.Entry<String, b> entry : bVar.i.entrySet()) {
                        entry.getValue().j = aVar;
                    }
                }
            }
        }
    }

    private static List<String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f804e2c63cafe246eb05516fb81e4757", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f804e2c63cafe246eb05516fb81e4757");
        }
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        String[] split = str.split(File.separator);
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
