package com.sankuai.waimai.platform.capacity.network.cdn;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public final a b;
    private String d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f9e187b8347997a243412453683f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f9e187b8347997a243412453683f2");
        } else {
            this.b = new a();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d84d563be51b65d9deac4428e3c9d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d84d563be51b65d9deac4428e3c9d3d");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public void a(Context context, String str, HornCallback hornCallback) {
        Object[] objArr = {context, str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df090168628d0e82cc276ba37308c0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df090168628d0e82cc276ba37308c0e5");
            return;
        }
        HashMap hashMap = new HashMap();
        String a2 = e.a(context);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("operator", a2);
        }
        String b = e.b(context);
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("province", b);
        }
        Horn.register(str, hornCallback, hashMap);
    }
}
