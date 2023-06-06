package com.meituan.mmp;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.mmp.b;
import com.meituan.mmp.main.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.main.f
    public final void a(Context context, String str, Map<String, String> map) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c9cde6efdd3cd549c4cd512247f570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c9cde6efdd3cd549c4cd512247f570");
            return;
        }
        b a2 = b.a();
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3498c04442d4217f053083d90303eb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3498c04442d4217f053083d90303eb96");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            b.a aVar = new b.a(str);
            a2.b.put(context, aVar);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "72d862001bc6adc6c5c01b569e586a0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "72d862001bc6adc6c5c01b569e586a0e");
                return;
            }
            aVar.c = false;
            aVar.d.postDelayed(aVar.e, 20000L);
        }
    }

    @Override // com.meituan.mmp.main.f
    public final void b(Context context, String str, Map<String, String> map) {
        b.a remove;
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d158ab450f5cda4e5777dee59b6734f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d158ab450f5cda4e5777dee59b6734f");
            return;
        }
        b a2 = b.a();
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d16362fdba6b19e2a73b43e3ba619fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d16362fdba6b19e2a73b43e3ba619fd1");
        } else if (context == null || TextUtils.isEmpty(str) || (remove = a2.b.remove(context)) == null) {
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, remove, changeQuickRedirect3, false, "ca0ecfb132540984b2e7084b68872038", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, remove, changeQuickRedirect3, false, "ca0ecfb132540984b2e7084b68872038");
                return;
            }
            remove.c = true;
            remove.d.removeCallbacks(remove.e);
        }
    }

    @Override // com.meituan.mmp.main.f
    public final void c(Context context, String str, Map<String, String> map) {
        b.a remove;
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20fdbe3f0edeb4bdb23ca70b9f48899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20fdbe3f0edeb4bdb23ca70b9f48899");
            return;
        }
        b a2 = b.a();
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "322665c72c269604058cc0cddcfab3f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "322665c72c269604058cc0cddcfab3f5");
        } else if (context == null || TextUtils.isEmpty(str) || (remove = a2.b.remove(context)) == null) {
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, remove, changeQuickRedirect3, false, "87ffa00ca335c4a887cf513b8ee6b925", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, remove, changeQuickRedirect3, false, "87ffa00ca335c4a887cf513b8ee6b925");
                return;
            }
            remove.c = true;
            remove.d.removeCallbacks(remove.e);
        }
    }
}
