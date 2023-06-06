package com.sankuai.xm.imui.session.event;

import android.content.Intent;
import android.support.annotation.IntRange;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    @IntRange(from = 0, to = 255)
    public int b;
    public int c;
    public Intent d;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26c538903b018df430fa3ff0d05ad4d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26c538903b018df430fa3ff0d05ad4d");
        }
        return "ActivityResultEvent{requestCode=" + this.b + ", resultCode=" + this.c + ", data=" + this.d + '}';
    }

    public static a a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bbe506fc6d715231437c6a7c72b73c0", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bbe506fc6d715231437c6a7c72b73c0");
        }
        a aVar = new a();
        aVar.b = i;
        aVar.c = i2;
        aVar.d = intent;
        return aVar;
    }
}
