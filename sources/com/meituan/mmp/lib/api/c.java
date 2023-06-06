package com.meituan.mmp.lib.api;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    String c;
    String[] d;
    e<?> e;

    public c(String str, int i, String[] strArr, e<?> eVar) {
        Object[] objArr = {str, Integer.valueOf(i), strArr, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff8dfaa5fbed4e157eae879c5029682", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff8dfaa5fbed4e157eae879c5029682");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("name can not been empty");
        } else {
            this.c = str;
            switch (i) {
                case 0:
                    this.b = str;
                    break;
                case 1:
                    this.b = "customAPI_" + str;
                    break;
                case 2:
                    this.b = "privateAPI_" + str;
                    break;
                default:
                    throw new IllegalArgumentException("unknown type value");
            }
            this.d = strArr;
            this.e = eVar;
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faecaaa3c9fdcd864e0a2e2122c97e32", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faecaaa3c9fdcd864e0a2e2122c97e32")).intValue() : this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e363d29e397fd8d073d2a2e76e541509", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e363d29e397fd8d073d2a2e76e541509")).booleanValue();
        }
        if (obj instanceof c) {
            return this.b.equals(((c) obj).b);
        }
        return false;
    }
}
