package com.sankuai.waimai.business.page.home.head.promotionbg;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.business.page.home.model.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements c {
    public static ChangeQuickRedirect a = null;
    public static String b = "scene_type";
    private static c e;
    private final Context c;
    private final String d;

    public static c a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbff97b845c15848becd8ae77a33df03", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbff97b845c15848becd8ae77a33df03");
        }
        if (e == null) {
            e = new d(context);
        }
        return e;
    }

    private d(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca46329271fbaf0bab34ff2cb4e86e27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca46329271fbaf0bab34ff2cb4e86e27");
            return;
        }
        this.c = context.getApplicationContext();
        this.d = b;
    }

    @Override // com.sankuai.waimai.business.page.home.head.promotionbg.c
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7259e3dff68d6852e5ab58a66662d57", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7259e3dff68d6852e5ab58a66662d57")).intValue();
        }
        h resource = new ResourceHelper(this.c).getResource(this.d);
        if (resource != null) {
            try {
                return Integer.valueOf(resource.g).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return 1;
    }
}
