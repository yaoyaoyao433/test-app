package com.meituan.android.cipstorage;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public long a;
        public ae b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6818711bbcc8876d378408e8ea692f25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6818711bbcc8876d378408e8ea692f25")).intValue();
        }
        ?? r0 = this.d;
        int i = r0;
        if (this.b != null) {
            i = r0 + (this.b.hashCode() * 31);
        }
        return this.c != null ? i + (this.c.hashCode() * 31) : i;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b29480a2c961612f95f1fbe657aa5bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b29480a2c961612f95f1fbe657aa5bb")).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.d == lVar.d && TextUtils.equals(this.b, lVar.b) && TextUtils.equals(this.c, lVar.c);
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0cc8af77f37fd9a6c774add2391227c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0cc8af77f37fd9a6c774add2391227c");
        }
        return "channel: " + this.b + " group:" + this.c + " external:" + this.d;
    }
}
