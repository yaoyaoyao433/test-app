package com.meituan.android.mrn.utils.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect f;
    public static final d g = new d() { // from class: com.meituan.android.mrn.utils.config.a.1
        @Override // com.meituan.android.mrn.utils.config.d
        public final boolean a(Object obj) {
            return obj != null;
        }
    };
    public static final d h = new d() { // from class: com.meituan.android.mrn.utils.config.a.2
        @Override // com.meituan.android.mrn.utils.config.d
        public final boolean a(Object obj) {
            return true;
        }
    };
    protected Map<String, g> i;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5932eae4f433268875fd21adc3a77c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5932eae4f433268875fd21adc3a77c");
        } else {
            this.i = new ConcurrentHashMap();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2045e3062e6700019ddaa87c0715dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2045e3062e6700019ddaa87c0715dd");
        }
        b bVar = new b();
        bVar.a = true;
        bVar.b = g;
        return bVar;
    }

    public final void a(@NonNull String str, @Nullable String str2, @NonNull Type type, @NonNull Object obj, @NonNull List<e> list, @Nullable b bVar) {
        Object[] objArr = {str, str2, type, obj, list, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef1dfa176c019ffb0e6126127901c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef1dfa176c019ffb0e6126127901c2c");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6636bdba6dbbc504c21dc995ae2804f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6636bdba6dbbc504c21dc995ae2804f");
        } else {
            g gVar = this.i.get(str);
            if (gVar != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "83aa97912da49913e9c6be7b162b0faa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "83aa97912da49913e9c6be7b162b0faa");
                } else {
                    for (e eVar : gVar.d) {
                        eVar.d();
                    }
                }
                this.i.remove(str);
            }
        }
        g gVar2 = new g(type, str2, obj, list, bVar == null ? a() : bVar);
        this.i.put(str, gVar2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        if (PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect4, false, "51881056175157eabd7abf2b72abfe6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect4, false, "51881056175157eabd7abf2b72abfe6c");
            return;
        }
        for (e eVar2 : gVar2.d) {
            eVar2.e = gVar2;
            eVar2.c();
        }
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803f17c88f03077da9328399591f858b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803f17c88f03077da9328399591f858b");
        }
        g gVar = this.i.get(str);
        if (gVar == null) {
            throw new IllegalArgumentException("Unregistered key: " + str);
        } else if (gVar.a() == null) {
            com.facebook.common.logging.a.d("MRNConfig", "horn getValue null " + str);
            return gVar.c;
        } else {
            return gVar.a();
        }
    }
}
