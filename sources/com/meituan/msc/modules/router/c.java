package com.meituan.msc.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect d = null;
    public static String e = "msc_mmp_routing_converter_config";

    public c(Context context, Uri uri) {
        super(context, uri);
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423b8ddec97928a8f85142bd29a29145", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423b8ddec97928a8f85142bd29a29145");
            return;
        }
        String str = e;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb13e46df2e924aa128f06bdb8a98704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb13e46df2e924aa128f06bdb8a98704");
            return;
        }
        a(Horn.accessCache(str));
        Horn.register(str, new HornCallback() { // from class: com.meituan.msc.modules.router.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str2) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf4f34496e412f672332b3adaba91796", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf4f34496e412f672332b3adaba91796");
                } else if (z) {
                    this.a(str2);
                } else {
                    this.a(null);
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.router.a
    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46398dd40b6771e355be42d82d2d3188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46398dd40b6771e355be42d82d2d3188");
        } else {
            b.a(str);
        }
    }

    @Override // com.meituan.msc.modules.router.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2676a28135f50c2442cceedb20d829", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2676a28135f50c2442cceedb20d829")).booleanValue() : b.a();
    }

    @Override // com.meituan.msc.modules.router.a
    public final boolean a(Context context, Uri uri, Intent intent, boolean z) {
        Object[] objArr = {context, uri, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2227c26afeb8f20439d39fba56517b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2227c26afeb8f20439d39fba56517b1")).booleanValue() : b.a(context, uri, intent, z);
    }
}
