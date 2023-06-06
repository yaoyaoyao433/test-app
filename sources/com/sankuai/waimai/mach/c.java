package com.sankuai.waimai.mach;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.imageloader.c;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {
    void a(a aVar, k kVar);

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public com.sankuai.waimai.mach.node.a<?> a;
        public C1000a b;
        public C1000a c;
        public C1000a d;
        @Nullable
        public c.b e;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.mach.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1000a {
            public static ChangeQuickRedirect a;
            public int b;
            public String c;
            public int d;
            @Nullable
            public int[] e;
            public boolean f;
            public int g;
            public boolean h;

            public C1000a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f46ca5e47a2c99e55eeb9ebf25b6f41", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f46ca5e47a2c99e55eeb9ebf25b6f41");
                } else {
                    this.g = -1;
                }
            }

            public final boolean equals(Object obj) {
                Object[] objArr = {obj};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6ffac2d7f93ca901674da440547e43", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6ffac2d7f93ca901674da440547e43")).booleanValue();
                }
                if (this.h) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C1000a c1000a = (C1000a) obj;
                return this.g == c1000a.g && Objects.equals(this.c, c1000a.c) && Arrays.equals(this.e, c1000a.e);
            }

            public final int hashCode() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0180629e3912a83d126ce8b4940693a7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0180629e3912a83d126ce8b4940693a7")).intValue() : (Objects.hash(this.c, Integer.valueOf(this.g)) * 31) + Arrays.hashCode(this.e);
            }

            public static boolean a(C1000a c1000a) {
                Object[] objArr = {c1000a};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd9bd69e095b75f7f01da1181895c2f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd9bd69e095b75f7f01da1181895c2f3")).booleanValue() : (c1000a == null || TextUtils.isEmpty(c1000a.c)) ? false : true;
            }
        }
    }
}
