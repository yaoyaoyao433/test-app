package com.sankuai.waimai.platform.preload;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f<T> {
    public static ChangeQuickRedirect a;
    @NonNull
    public a b;
    public T c;
    public boolean d;
    public final long e;
    c f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN),
        LOADING("LOADING"),
        SUCCESS("SUCCESS"),
        FAILED("FAILED");
        
        public static ChangeQuickRedirect a;
        public final String f;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2ba27eacf6de3be3d757c4341d3d21b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2ba27eacf6de3be3d757c4341d3d21b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b21b5c56dbfcd6fcb0775095aff316e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b21b5c56dbfcd6fcb0775095aff316e") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ae2c11bc042ba0b067712eee4b21a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ae2c11bc042ba0b067712eee4b21a1");
            } else {
                this.f = str;
            }
        }
    }

    public f(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62d42bb21540602d5aa75f785c4dde8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62d42bb21540602d5aa75f785c4dde8");
            return;
        }
        this.b = a.UNKNOWN;
        this.e = j;
    }

    public final boolean a(final a aVar, final T t, final boolean z) {
        Object[] objArr = {aVar, t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2502ccea72b82d11f46561ea31ab6d45", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2502ccea72b82d11f46561ea31ab6d45")).booleanValue();
        }
        this.b = aVar;
        this.c = t;
        this.d = z;
        final c cVar = this.f;
        if (cVar == null) {
            return false;
        }
        if (z) {
            this.f = null;
        }
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.platform.preload.f.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Type[] genericInterfaces;
                Type type;
                Type[] actualTypeArguments;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5527031b36e45eebd240b66f9eb4608", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5527031b36e45eebd240b66f9eb4608");
                    return;
                }
                f fVar = f.this;
                c cVar2 = cVar;
                Object obj = t;
                boolean z2 = true;
                Object[] objArr3 = {cVar2, obj};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "43673a59bb05aeb518de01da2aa11d69", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "43673a59bb05aeb518de01da2aa11d69")).booleanValue();
                } else if (cVar2 != null && obj != null && (genericInterfaces = cVar2.getClass().getGenericInterfaces()) != null && genericInterfaces.length != 0 && (type = genericInterfaces[0]) != null && (type instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments()) != null && actualTypeArguments.length != 0) {
                    Type type2 = actualTypeArguments[0];
                    if (type2 instanceof Class) {
                        z2 = ((Class) type2).isAssignableFrom(obj.getClass());
                    } else if (type2 instanceof ParameterizedType) {
                        Type rawType = ((ParameterizedType) type2).getRawType();
                        if (rawType instanceof Class) {
                            z2 = ((Class) rawType).isAssignableFrom(obj.getClass());
                        }
                    }
                }
                if (!z2) {
                    a.AbstractC1040a b = new h().a("PreloadManager").b("preload_callback_type_mismatch");
                    i.d(b.c(String.valueOf(t) + "<!=>" + cVar).b());
                    cVar.a(new f<>(0L));
                    return;
                }
                f<T> fVar2 = new f<>(f.this.e);
                fVar2.c = (T) t;
                fVar2.b = aVar;
                fVar2.d = z;
                cVar.a(fVar2);
            }
        };
        if (aVar == a.SUCCESS) {
            ad.c(runnable);
        } else {
            ad.a(runnable);
        }
        return true;
    }

    public final void a(final c<T> cVar, Activity activity) {
        Object[] objArr = {cVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5c5b00c8d4cedcc780791ba6e30c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5c5b00c8d4cedcc780791ba6e30c84");
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.platform.preload.f.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6adb453e543440d2f2a00f7498e3149", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6adb453e543440d2f2a00f7498e3149");
                } else {
                    cVar.a(f.this);
                }
            }
        };
        if (this.b == a.LOADING || !this.d) {
            this.f = cVar;
            com.sankuai.waimai.platform.preload.a.a(activity, this);
            ad.a(runnable);
        } else if (this.b == a.SUCCESS) {
            final f fVar = new f(this.e);
            fVar.b = a.LOADING;
            ad.a(new Runnable() { // from class: com.sankuai.waimai.platform.preload.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24e66914a15e874d467be8cdc16bab47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24e66914a15e874d467be8cdc16bab47");
                        return;
                    }
                    cVar.a(fVar);
                    ad.c(runnable);
                }
            });
        } else {
            ad.c(runnable);
        }
    }
}
