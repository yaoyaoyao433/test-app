package com.meituan.msc.modules.api.auth;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPAuthGroup extends c {
    public static ChangeQuickRedirect h;
    public int i;
    public List<c> j;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AuthGroupId {
    }

    public MMPAuthGroup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff1f19c2673fbf5af6fa1de92109963e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff1f19c2673fbf5af6fa1de92109963e");
        } else {
            this.j = new ArrayList();
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e0f6392f36fb9f8c9df0814526238d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e0f6392f36fb9f8c9df0814526238d");
        }
        if (this.j.size() != 0) {
            return a.a(this.j.get(0).e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d589bf614a89661f8b33f51993004d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d589bf614a89661f8b33f51993004d3")).intValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -653473286) {
            if (hashCode == 421939912 && str.equals("scope.userLocationBackground")) {
                c = 1;
            }
        } else if (str.equals("scope.userLocation")) {
            c = 0;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            default:
                return 0;
        }
    }
}
