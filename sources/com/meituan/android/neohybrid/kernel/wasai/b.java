package com.meituan.android.neohybrid.kernel.wasai;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.bridge.RecceInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends RecceCustomApi {
    public static ChangeQuickRedirect a;
    private final String b;
    private final Object e;
    private final Method f;

    public b(String str, Object obj, Method method) {
        Object[] objArr = {str, obj, method};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e7e4c5ddfe1a71e80e5432b6b593d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e7e4c5ddfe1a71e80e5432b6b593d8");
            return;
        }
        this.b = str;
        this.e = obj;
        this.f = method;
    }

    @RecceInterface
    public final byte[] call(@NonNull String str, @Nullable String str2, @Nullable String str3, final com.meituan.android.recce.bridge.c cVar) {
        Object[] objArr = {str, str2, str3, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9975138441af095d7598ddf8582d8fd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9975138441af095d7598ddf8582d8fd2");
        }
        try {
            Object invoke = this.f.invoke(this.e, str, str2, str3, new com.meituan.android.neohybrid.protocol.kernel.a() { // from class: com.meituan.android.neohybrid.kernel.wasai.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.neohybrid.protocol.kernel.a
                public final void a(String str4) {
                    Object[] objArr2 = {str4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f257ab3c3d9c3b9872dcfac8e891100a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f257ab3c3d9c3b9872dcfac8e891100a");
                    } else if (cVar != null) {
                        cVar.onSuccess(str4);
                    }
                }
            });
            if (invoke != null) {
                return invoke.toString().getBytes();
            }
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
