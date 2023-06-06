package com.meituan.android.cube.debug;

import android.util.Log;
import com.meituan.android.cube.debug.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements b.a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cube.debug.b.a
    public final void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "80c37962e1ecb3600268e38fee9af76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "80c37962e1ecb3600268e38fee9af76a");
        } else if (b.a()) {
            c(str, objArr);
        }
    }

    @Override // com.meituan.android.cube.debug.b.a
    public final void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "90414b28fe15cd3c550430b94b1afb4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "90414b28fe15cd3c550430b94b1afb4f");
            return;
        }
        if (b.a()) {
            Log.e("Cube", c(str, objArr));
        }
        RuntimeException runtimeException = new RuntimeException(c(str, objArr));
        Object[] objArr3 = {runtimeException};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "0142abed06fffec15ea1c933ae71a5fe", RobustBitConfig.DEFAULT_VALUE)) {
            throw runtimeException;
        }
        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "0142abed06fffec15ea1c933ae71a5fe");
    }

    private String c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "778c8e427a8ffa80ff56670490986619", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "778c8e427a8ffa80ff56670490986619");
        }
        if (objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "ef1cae49bfc717d7f44769d23438fa7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "ef1cae49bfc717d7f44769d23438fa7c");
                } else if (b.a()) {
                    Log.e("Cube", "", th);
                }
            }
        }
        return str;
    }
}
