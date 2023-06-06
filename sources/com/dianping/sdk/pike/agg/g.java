package com.dianping.sdk.pike.agg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends com.dianping.sdk.pike.message.d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public a d;
    long e;
    boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        ORDINARY(1),
        IMPORTENT(2);
        
        public static ChangeQuickRedirect a;
        int d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c1a9113c07d1422a8e6a31ece54a2ea", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c1a9113c07d1422a8e6a31ece54a2ea") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab26dc56c33794ea3b1c1c682bb756a1", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab26dc56c33794ea3b1c1c682bb756a1") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4513ddd48957acbd8890c08b29ac679e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4513ddd48957acbd8890c08b29ac679e");
            } else {
                this.d = i;
            }
        }
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad3c25c1336e3a7a325203138bd4319c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad3c25c1336e3a7a325203138bd4319c");
            return;
        }
        super.a(com.dianping.sdk.pike.message.a.a().b());
        this.d = a.ORDINARY;
    }

    @Override // com.dianping.sdk.pike.message.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b7a211d8b6daeb58ec0d3af7fe6abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b7a211d8b6daeb58ec0d3af7fe6abb");
        } else if (com.dianping.sdk.pike.f.d()) {
            throw new IllegalArgumentException("message id not support to set by biz.");
        }
    }
}
