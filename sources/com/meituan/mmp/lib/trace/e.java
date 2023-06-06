package com.meituan.mmp.lib.trace;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    String b;
    String c;

    public e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8086dc15fded751d182b44bea1cc3a75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8086dc15fded751d182b44bea1cc3a75");
            return;
        }
        this.c = str;
        this.b = com.meituan.mmp.lib.config.a.p(str2);
        if (TextUtils.isEmpty(this.b)) {
            this.b = "path_not_found";
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1157dc192b20ce77cf7dbd2c1053a0bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1157dc192b20ce77cf7dbd2c1053a0bd");
        }
        return "id=" + this.c + ",path=" + this.b + "\\n";
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8a898aa207dd49f05890909e7f562c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8a898aa207dd49f05890909e7f562c")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.c, eVar.c) && Objects.equals(this.b, eVar.b);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a40f60f9bc32bcda427358c376cfa1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a40f60f9bc32bcda427358c376cfa1")).intValue() : Objects.hash(this.b, this.c);
    }
}
