package com.sankuai.waimai.pouch.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    String f;
    boolean g;
    boolean h;
    boolean i;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f78543bdc2d22c5e2c8554791612850a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f78543bdc2d22c5e2c8554791612850a");
            return;
        }
        this.d = "default";
        this.i = true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.pouch.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1114a {
        public static ChangeQuickRedirect a;
        protected a b;

        public abstract String a();

        public AbstractC1114a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9378377e04d13cbdf694714e6e11c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9378377e04d13cbdf694714e6e11c1");
                return;
            }
            this.b = new a();
            this.b.c = a();
        }

        public final AbstractC1114a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8ea516e3f870e7a1267ced94d39bee", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8ea516e3f870e7a1267ced94d39bee");
            }
            this.b.b = str;
            return this;
        }

        public final AbstractC1114a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c49377efc18469f828f0ccfe530dcd97", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c49377efc18469f828f0ccfe530dcd97");
            }
            this.b.d = str;
            return this;
        }

        public final AbstractC1114a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90822589026f7f75bc5e849dca5c683f", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90822589026f7f75bc5e849dca5c683f");
            }
            this.b.e = str;
            return this;
        }

        public final AbstractC1114a d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb865cadbc30a9c1fcc2bbc2c70e6b01", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb865cadbc30a9c1fcc2bbc2c70e6b01");
            }
            this.b.f = str;
            return this;
        }

        public final AbstractC1114a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56e2af6e447cc2899c94bb124dd0a89", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56e2af6e447cc2899c94bb124dd0a89");
            }
            this.b.g = z;
            return this;
        }

        public final AbstractC1114a b(boolean z) {
            Object[] objArr = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfc67a1346cf3a0efc7083fd1a37827", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1114a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfc67a1346cf3a0efc7083fd1a37827");
            }
            this.b.i = false;
            return this;
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a01b021bfc422f0c58728cf48a999a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a01b021bfc422f0c58728cf48a999a5");
            }
            if (this.b == null || TextUtils.isEmpty(this.b.b)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.b;
        }
    }
}
