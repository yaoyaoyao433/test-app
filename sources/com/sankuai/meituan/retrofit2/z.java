package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class z {
    public static ChangeQuickRedirect a;
    StringBuilder b;

    public z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b163a4a5c48b403341b91ee5a4609509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b163a4a5c48b403341b91ee5a4609509");
        } else {
            this.b = new StringBuilder();
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e248b1fe253e5f62442ba10b78d7be40", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e248b1fe253e5f62442ba10b78d7be40")).booleanValue();
        }
        long length = this.b.length();
        if (length > 4096 || length + str.length() > 4096) {
            return false;
        }
        this.b.append(str);
        return true;
    }

    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ecfbacd745b75c661fc33feb699441f", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ecfbacd745b75c661fc33feb699441f")).longValue() : this.b.length();
    }

    public final void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352a21437f794a14d2c955df3533b2f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352a21437f794a14d2c955df3533b2f8");
        } else {
            this.b.setLength(0);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda2fb8de990eb3ba20a4113a611b374", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda2fb8de990eb3ba20a4113a611b374") : this.b.toString();
    }
}
