package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.utils.cache.DiskCache;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.ji;
import com.tencent.mapsdk.internal.jo;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jm {
    private static jk a = new jk();

    public static String a(String str) {
        return a.a.a(str);
    }

    public static <D extends jj> ji<D> a(Class<D> cls, ji.a... aVarArr) {
        if (cls == null || aVarArr == null || aVarArr.length == 0) {
            return null;
        }
        jl jlVar = new jl();
        boolean z = aVarArr.length > 1;
        ji<D> jiVar = null;
        for (ji.a aVar : aVarArr) {
            if (aVar instanceof MemoryCache.a) {
                jiVar = a.a(cls, (MemoryCache.a) aVar, MemoryCache.class);
            } else if (aVar instanceof jo.c) {
                jo.c cVar = (jo.c) aVar;
                if (cVar.i == jo.a.DISK) {
                    jiVar = a.a(cls, cVar, DiskCache.class);
                } else if (cVar.i == jo.a.DB) {
                    jiVar = a.a(cls, cVar, jn.class);
                }
            }
            if (z && jiVar != null) {
                jlVar.a.addAll(Arrays.asList(jiVar));
            }
        }
        return z ? jlVar : jiVar;
    }

    private static <D extends jj> jp<D> b(Class<D> cls, ji.a... aVarArr) {
        return a(a(cls, aVarArr));
    }

    public static <D extends jj> jp<D> a(ji<D> jiVar) {
        if (jiVar instanceof jp) {
            return (jp) jiVar;
        }
        return null;
    }

    private static <D extends jj> jg<D> c(Class<D> cls, ji.a... aVarArr) {
        ji a2 = a(cls, aVarArr);
        if (a2 instanceof jg) {
            return (jg) a2;
        }
        return null;
    }

    private static <D extends jj> jg<D> b(ji<D> jiVar) {
        if (jiVar instanceof jg) {
            return (jg) jiVar;
        }
        return null;
    }
}
