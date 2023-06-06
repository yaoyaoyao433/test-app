package com.meituan.android.privacy.impl;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c implements com.meituan.android.privacy.interfaces.c {
    public static ChangeQuickRedirect a;
    private static c d;
    public Set<String> b;
    public volatile b c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        long a();

        String b();

        boolean c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        a a(@NonNull String str);

        Set<C0350c> a(@NonNull Set<String> set);

        boolean a();

        boolean b();

        boolean b(@NonNull String str);

        String c();
    }

    @VisibleForTesting
    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf1d529ca73b6b655c135def19db599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf1d529ca73b6b655c135def19db599");
        } else {
            this.b = Collections.emptySet();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4de7a6e38442bb301fcea57c91f8779", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4de7a6e38442bb301fcea57c91f8779");
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.privacy.impl.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0350c {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "663a2fd856d8c8931e617dd597f48be3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "663a2fd856d8c8931e617dd597f48be3")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.b.equals(((C0350c) obj).b);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a6f6be9cec509ab52740b4b1186edc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a6f6be9cec509ab52740b4b1186edc")).intValue() : Objects.hash(this.b);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.c
    public final long a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614b0c88c577d1e518610fba16dcf1e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614b0c88c577d1e518610fba16dcf1e7")).longValue();
        }
        if (str == null || this.c == null || this.c.a()) {
            return 0L;
        }
        com.meituan.android.privacy.interfaces.monitor.b bVar = com.meituan.android.privacy.interfaces.monitor.c.a;
        String c = c(str);
        com.meituan.android.privacy.interfaces.def.netfilter.a aVar = new com.meituan.android.privacy.interfaces.def.netfilter.a();
        aVar.e = str;
        if (c == null) {
            if (bVar != null) {
                aVar.b = -101;
                bVar.b(aVar, 0);
            }
            return 0L;
        } else if (this.c.b(c)) {
            if (bVar != null) {
                aVar.b = -2;
                bVar.b(aVar, 0);
            }
            return 0L;
        } else {
            for (String str2 : this.b) {
                if (c.contains(str2)) {
                    return Long.MAX_VALUE;
                }
            }
            a a2 = this.c.a(c);
            aVar.h = a2.b();
            aVar.c = a2.a();
            if (a2.a() == 0 && this.c.b()) {
                return Long.MAX_VALUE;
            }
            return a2.a();
        }
    }

    private static String c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81df01828b72714603919bb6f0ea41a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81df01828b72714603919bb6f0ea41a7");
        }
        int indexOf = str.indexOf("://");
        if (indexOf == -1) {
            return null;
        }
        int i = indexOf + 3;
        int indexOf2 = str.indexOf(63, i);
        if (indexOf2 == -1 && (indexOf2 = str.indexOf(35, i)) == -1) {
            indexOf2 = str.length();
        }
        return str.substring(i, indexOf2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.meituan.android.privacy.interfaces.c$a] */
    @Override // com.meituan.android.privacy.interfaces.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.android.privacy.interfaces.c.a b(@android.support.annotation.NonNull java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.privacy.impl.c.b(java.lang.String):com.meituan.android.privacy.interfaces.c$a");
    }
}
