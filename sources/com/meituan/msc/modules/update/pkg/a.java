package com.meituan.msc.modules.update.pkg;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.preload.PackageDebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @Nullable
    public static C0476a b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.update.pkg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0476a {
        public static ChangeQuickRedirect a;
        @PackageDebugHelper.BasePackageEnv
        public String b;
        String c;
        public String d;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8725c5a15841107813789c8b974f2d82", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8725c5a15841107813789c8b974f2d82");
            }
            return "BasePackageInfo{env='" + this.b + "', name='" + this.c + "', version='" + this.d + "'}";
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1d49ccd2a123e7507a0e9ecdef21e0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1d49ccd2a123e7507a0e9ecdef21e0")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0476a c0476a = (C0476a) obj;
            return Objects.equals(this.b, c0476a.b) && Objects.equals(this.c, c0476a.c) && Objects.equals(this.d, c0476a.d);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211016a245136b971d933ab2c174bfae", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211016a245136b971d933ab2c174bfae")).intValue() : Objects.hash(this.b, this.c, this.d);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.msc.modules.update.pkg.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0477a {
            public static ChangeQuickRedirect a;
            @PackageDebugHelper.BasePackageEnv
            public String b;
            public String c;
            public String d;

            public final C0476a a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ba99966df35a0e4fdb8e5c0812f9f1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (C0476a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ba99966df35a0e4fdb8e5c0812f9f1");
                }
                C0476a c0476a = new C0476a();
                c0476a.b = this.b;
                c0476a.c = this.c;
                c0476a.d = this.d;
                return c0476a;
            }
        }
    }
}
