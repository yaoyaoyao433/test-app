package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.j;
import com.meituan.android.cipstorage.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends j.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "clean.cache";
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3feed98fe5736f091438fce62ae5100f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3feed98fe5736f091438fce62ae5100f")).booleanValue();
        }
        return true;
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final void b(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1243786e4d795897b1ed6e8971a133b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1243786e4d795897b1ed6e8971a133b4");
            return;
        }
        b();
        String a2 = y.a(false);
        String a3 = y.a(true);
        String parent = new File(a2).getParent();
        String parent2 = new File(a3).getParent();
        List<String> c = afVar.c();
        new a(parent, 604800L, c, this).a(true);
        b();
        new a(parent2, 604800L, c, this).a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final long b;
        final long c;
        final j.c d;
        private final String e;
        private final List<String> f;

        public a(String str, long j, List<String> list, j.c cVar) {
            Object[] objArr = {str, new Long(j), list, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de9bd962ce272b54f192678dbbf1f72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de9bd962ce272b54f192678dbbf1f72");
                return;
            }
            this.b = System.currentTimeMillis() / 1000;
            this.e = str;
            this.c = j;
            this.f = list;
            this.d = cVar;
        }

        public final boolean a(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb6679a2801e9a8eabbdce5e193fb88", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb6679a2801e9a8eabbdce5e193fb88")).booleanValue() : !ab.a(this.f, file);
        }

        public final long a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b265e675567c86ceb23566dbd3e5ad18", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b265e675567c86ceb23566dbd3e5ad18")).longValue();
            }
            final long[] jArr = new long[1];
            m.a(new File(this.e), true, new m.a() { // from class: com.meituan.android.cipstorage.e.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.m.a
                public final boolean a(File file) {
                    Object[] objArr2 = {file};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0dc24d3d5246b41c6d3a97b0dee144b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0dc24d3d5246b41c6d3a97b0dee144b")).booleanValue();
                    }
                    if (a.this.d != null) {
                        a.this.d.b();
                    }
                    return a.this.a(file);
                }

                @Override // com.meituan.android.cipstorage.m.a
                public final void a(File file, Map<File, i> map) {
                    Object[] objArr2 = {file, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2be00d86bf3b5cbc37e0bfc54b0e87e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2be00d86bf3b5cbc37e0bfc54b0e87e1");
                        return;
                    }
                    int size = map.size();
                    for (Map.Entry<File, i> entry : map.entrySet()) {
                        if (Math.abs(a.this.b - entry.getValue().b()) >= a.this.c) {
                            File key = entry.getKey();
                            if (a.this.a(key)) {
                                long[] jArr2 = jArr;
                                jArr2[0] = jArr2[0] + key.length();
                                size--;
                                key.delete();
                            }
                        }
                    }
                    if (size <= 0) {
                        ab.b(file);
                    }
                }
            });
            if (z) {
                v.a("cache", jArr[0], null);
            }
            return jArr[0];
        }
    }
}
