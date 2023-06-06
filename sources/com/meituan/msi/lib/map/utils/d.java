package com.meituan.msi.lib.map.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements InvocationHandler {
    public static ChangeQuickRedirect a;
    private final a b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(MapLocation mapLocation);
    }

    public d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4c99b9bb691adf45b06ea2cccd360c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4c99b9bb691adf45b06ea2cccd360c");
        } else {
            this.b = aVar;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "7398148a2d76cdc46b9f78e8a6ae078f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "7398148a2d76cdc46b9f78e8a6ae078f");
        }
        if (this.b != null && method.getName().equals("getUserLocationChangedListener") && objArr != null && (objArr[0] instanceof MapLocation)) {
            this.b.a((MapLocation) objArr[0]);
        }
        return null;
    }
}
