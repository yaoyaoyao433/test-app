package com.meituan.msc.modules.reporter;

import android.text.TextUtils;
import com.meituan.msc.common.utils.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    String b;
    String c;

    public l(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732b7994e06f78bc7c452bc91b6ad84e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732b7994e06f78bc7c452bc91b6ad84e");
            return;
        }
        this.c = str;
        this.b = am.b(str2);
        if (TextUtils.isEmpty(this.b)) {
            this.b = "path_not_found";
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6e361a4984fcaf5b0e5306db623bb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6e361a4984fcaf5b0e5306db623bb8");
        }
        return "id=" + this.c + ",path=" + this.b + "\\n";
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daed7dd0d9f558bbb60aaee3a2bf7a98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daed7dd0d9f558bbb60aaee3a2bf7a98")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.c, lVar.c) && Objects.equals(this.b, lVar.b);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9796bdc5a16667d68b00a58bb08a004", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9796bdc5a16667d68b00a58bb08a004")).intValue() : Objects.hash(this.b, this.c);
    }
}
