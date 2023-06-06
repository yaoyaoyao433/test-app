package com.sankuai.waimai.business.restaurant.base.shopcart;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2053fc7510a7c97371c104621e7479c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2053fc7510a7c97371c104621e7479c");
            return;
        }
        this.b = str;
        this.c = SystemClock.elapsedRealtime();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e6b68e7d4572ebe493326e6c6eb2993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e6b68e7d4572ebe493326e6c6eb2993");
        } else if (TextUtils.isEmpty(str) || str.equals(this.b)) {
        } else {
            this.b = str;
            this.c = SystemClock.elapsedRealtime();
        }
    }
}
