package com.sankuai.meituan.navigation.common;

import android.support.annotation.AnimRes;
import android.support.annotation.AnimatorRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    @IdRes
    public int b;
    public boolean c;
    @AnimRes
    @AnimatorRes
    public int d;
    @AnimRes
    @AnimatorRes
    public int e;
    @AnimRes
    @AnimatorRes
    public int f;
    @AnimRes
    @AnimatorRes
    public int g;
    private int h;

    public f(int i, @IdRes int i2, boolean z, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672fa00a14f3529f8c1b2ea8dd3690e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672fa00a14f3529f8c1b2ea8dd3690e4");
            return;
        }
        this.h = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean a() {
        return (this.h & 1) != 0;
    }

    @Deprecated
    public final boolean b() {
        return (this.h & 4) != 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        @IdRes
        public int c;
        public boolean d;
        @AnimRes
        @AnimatorRes
        public int e;
        @AnimRes
        @AnimatorRes
        public int f;
        @AnimRes
        @AnimatorRes
        public int g;
        @AnimRes
        @AnimatorRes
        public int h;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351619e0c4c82dd575227ebb8f684a2e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351619e0c4c82dd575227ebb8f684a2e");
                return;
            }
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
        }

        @NonNull
        public final a a(@IdRes int i, boolean z) {
            this.c = i;
            this.d = true;
            return this;
        }

        @NonNull
        public final f a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95172d4fb5e07fbda7a28d576b35688f", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95172d4fb5e07fbda7a28d576b35688f") : new f(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }
}
