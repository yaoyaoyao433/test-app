package com.meituan.msc.modules.api;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    private String c;
    private String[] d;
    private c<?> e;

    public a(String str, int i, String[] strArr, c<?> cVar) {
        Object[] objArr = {str, Integer.valueOf(i), strArr, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9923e0eeab4bf842526fab9a98955175", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9923e0eeab4bf842526fab9a98955175");
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
            this.e = cVar;
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d65c17528c8da95c17e14ffbfd6867", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d65c17528c8da95c17e14ffbfd6867")).intValue() : this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752d6de647e0a4acb58e47474ea7ab6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752d6de647e0a4acb58e47474ea7ab6f")).booleanValue();
        }
        if (obj instanceof a) {
            return this.b.equals(((a) obj).b);
        }
        return false;
    }
}
