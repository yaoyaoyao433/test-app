package com.sankuai.waimai.business.ugc.live;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.SoftReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    final HashMap<String, SoftReference<a>> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9beabe4379cd86d32ed036e178bb2835", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9beabe4379cd86d32ed036e178bb2835");
        } else {
            this.b = new HashMap<>();
        }
    }

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a799acda10d21e0244e515fbb93c00c", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a799acda10d21e0244e515fbb93c00c");
            }
            if (c == null) {
                c = new b();
            }
            return c;
        }
    }

    public final a a(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc8f2506d661119095907e9e91a1171", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc8f2506d661119095907e9e91a1171");
        }
        if (TextUtils.isEmpty(str)) {
            return b(context, str);
        }
        SoftReference<a> softReference = this.b.get(str);
        if (softReference == null || softReference.get() == null) {
            return b(context, str);
        }
        return softReference.get();
    }

    private a b(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21f8497f602b49f6b681e2dfaf8728b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21f8497f602b49f6b681e2dfaf8728b");
        }
        a aVar = new a(context);
        if (!TextUtils.isEmpty(str)) {
            this.b.put(str, new SoftReference<>(aVar));
        }
        return aVar;
    }

    public final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b847dec6dc0956f50481fa6d10457ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b847dec6dc0956f50481fa6d10457ed");
        }
        SoftReference<a> remove = this.b.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }
}
