package com.dianping.nvnetwork.httpdns;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    static Random c = new Random();
    String b;
    List<String> d;

    public final boolean a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65687d25d5dcffb384b97f2410fe297c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65687d25d5dcffb384b97f2410fe297c")).booleanValue();
        }
        if (!TextUtils.isEmpty(this.b)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b52dd27f71bf07b769ae12deb2ac0e8c", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b52dd27f71bf07b769ae12deb2ac0e8c")).booleanValue();
            } else {
                z = (this.d == null || this.d.isEmpty()) ? false : true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
