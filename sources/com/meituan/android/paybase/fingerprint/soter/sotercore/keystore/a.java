package com.meituan.android.paybase.fingerprint.soter.sotercore.keystore;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect a;

    public abstract a a(boolean z);

    public abstract a a(String... strArr);

    public abstract AlgorithmParameterSpec a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    public abstract a b(String... strArr);

    public a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748baff309528cd6041f0a7d1fd44fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748baff309528cd6041f0a7d1fd44fa0");
        }
    }

    public static a a(String str, int i) {
        Object[] objArr = {str, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "728b1fd2acae178d5a828c126452cb2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "728b1fd2acae178d5a828c126452cb2c");
        }
        if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a()) {
            if (Build.VERSION.SDK_INT >= 23) {
                return new b(str, 4);
            }
            return new c(str, 4);
        }
        return new C0333a(str, 4);
    }

    /* compiled from: ProGuard */
    @TargetApi(23)
    /* loaded from: classes2.dex */
    public static class b extends a {
        public static ChangeQuickRedirect b;
        private KeyGenParameterSpec.Builder c;

        public b(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0607aa9a618e1b2c8bca664f90f36c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0607aa9a618e1b2c8bca664f90f36c");
                return;
            }
            this.c = null;
            this.c = new KeyGenParameterSpec.Builder(str, i);
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final AlgorithmParameterSpec a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd46833b016906e8d4944fc98efdf96", RobustBitConfig.DEFAULT_VALUE) ? (AlgorithmParameterSpec) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd46833b016906e8d4944fc98efdf96") : this.c.build();
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9964a59667e779276a3cecab70ada39c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9964a59667e779276a3cecab70ada39c");
            }
            this.c.setDigests(strArr);
            return this;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a b(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3886b560e122f4b62c00f9de80119e2e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3886b560e122f4b62c00f9de80119e2e");
            }
            this.c.setSignaturePaddings(strArr);
            return this;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(boolean z) {
            Object[] objArr = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f03d007de6e89ff57d860f14a9590a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f03d007de6e89ff57d860f14a9590a");
            }
            this.c.setUserAuthenticationRequired(true);
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends a {
        public static ChangeQuickRedirect b;
        private final String c;
        private int d;
        private int e;
        private AlgorithmParameterSpec f;
        private X500Principal g;
        private BigInteger h;
        private Date i;
        private Date j;
        private Date k;
        private Date l;
        private Date m;
        private String[] n;
        private String[] o;
        private String[] p;
        private String[] q;
        private boolean r;
        private boolean s;
        private int t;

        public c(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1069a9c4ab7a231f5bc8999b6a45e3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1069a9c4ab7a231f5bc8999b6a45e3e");
                return;
            }
            this.e = -1;
            this.r = true;
            this.t = -1;
            if (str == null) {
                throw new NullPointerException("keystoreAlias == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("keystoreAlias must not be empty");
            }
            this.c = str;
            this.d = i;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec0e4ed6c2eb6f4690c7f741ac9228a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec0e4ed6c2eb6f4690c7f741ac9228a");
            }
            this.n = c(strArr);
            return this;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a b(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926ab9f3bdb47ac14248b6fe375dc227", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926ab9f3bdb47ac14248b6fe375dc227");
            }
            this.p = c(strArr);
            return this;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(boolean z) {
            this.s = true;
            return this;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final AlgorithmParameterSpec a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611f3596bc637f79b1308ca51e1c0df2", RobustBitConfig.DEFAULT_VALUE) ? (AlgorithmParameterSpec) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611f3596bc637f79b1308ca51e1c0df2") : (AlgorithmParameterSpec) Class.forName("android.security.keystore.KeyGenParameterSpec").getConstructor(String.class, Integer.TYPE, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, Integer.TYPE, String[].class, String[].class, String[].class, String[].class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE).newInstance(this.c, Integer.valueOf(this.e), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Integer.valueOf(this.d), this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(this.t));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0333a extends a {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(boolean z) {
            return null;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a a(String... strArr) {
            return null;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final AlgorithmParameterSpec a() {
            return null;
        }

        @Override // com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a
        public final a b(String... strArr) {
            return null;
        }

        public C0333a(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ab91a8ca82ff948b652d1f1caa50eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ab91a8ca82ff948b652d1f1caa50eb");
            }
        }
    }

    public static String[] c(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "777249b44acf57fe6ee30325ba95c326", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "777249b44acf57fe6ee30325ba95c326") : (strArr == null || strArr.length <= 0) ? strArr : (String[]) strArr.clone();
    }
}
