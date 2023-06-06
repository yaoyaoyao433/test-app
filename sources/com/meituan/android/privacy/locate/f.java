package com.meituan.android.privacy.locate;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.locate.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f b;
    private volatile q c;

    @NonNull
    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70fb394ed64963f7deef38f6254bdbb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70fb394ed64963f7deef38f6254bdbb2");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public final MtLocation a(String str) {
        MtLocation mtLocation;
        com.meituan.android.privacy.interfaces.e createPermissionGuard;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5de5e442dbb64f2822b6c850bb0d3da6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5de5e442dbb64f2822b6c850bb0d3da6");
        }
        a a2 = a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9060ade81c17b0f9d14fda8d7b3dc8f6", RobustBitConfig.DEFAULT_VALUE)) {
            mtLocation = (MtLocation) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9060ade81c17b0f9d14fda8d7b3dc8f6");
        } else {
            c.a aVar = c.a;
            if (aVar != null) {
                a2.b = aVar.a(a2.b);
            }
            mtLocation = a2.b;
        }
        if (mtLocation == null || (createPermissionGuard = Privacy.createPermissionGuard()) == null) {
            return null;
        }
        if (createPermissionGuard.a(null, "Locate.once", PermissionGuard.BUSINESS_CHECK_ONLY) != -13) {
            a.a().b = null;
            return null;
        }
        return mtLocation;
    }

    public final MtLocation a(String str, Context context) {
        MtLocation a2;
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a6095fc0afced8f65cffb7985a5285", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a6095fc0afced8f65cffb7985a5285");
        }
        MtLocation a3 = a(str);
        if (a3 != null) {
            return a3;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76bf5dfb09a3d93c0eb0d09032a9a7a7", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (MtLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76bf5dfb09a3d93c0eb0d09032a9a7a7");
        } else {
            q qVar = this.c;
            if (qVar == null) {
                qVar = q.a(context, "privacy_location_channel", 2);
                this.c = qVar;
            }
            a2 = a.a().a(qVar);
        }
        MtLocation a4 = a(str);
        Object[] objArr3 = {a2, a4};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "83706f49cb0e15cef0ef1e24e76869bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "83706f49cb0e15cef0ef1e24e76869bb");
        } else {
            if ((a2 == null ? -1L : a2.getTime()) > (a4 != null ? a4.getTime() : -1L)) {
                a.a().b = a2;
            }
        }
        return a(str);
    }
}
