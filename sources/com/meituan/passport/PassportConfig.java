package com.meituan.passport;

import android.support.annotation.RestrictTo;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.passport.pojo.LogoutPath;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportConfig {
    public static ChangeQuickRedirect a = null;
    private static PassportConfig q = null;
    private static int s = 4;
    public String b;
    public int c;
    private int d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private String p;
    private int r;
    private boolean t;
    private boolean u;
    private String v;
    private boolean w;
    private ArrayDeque<LogoutPath> x;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface VerificationCodeLength {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean q() {
        return false;
    }

    public static /* synthetic */ void a(PassportConfig passportConfig, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "49c47f7dff13ba2a29c9483789723e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "49c47f7dff13ba2a29c9483789723e7e");
            return;
        }
        d().k = str;
        StorageUtil.putSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.JoinKey", str, 0);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, passportConfig, changeQuickRedirect2, false, "39307947b10d35bb84a34a918b7ad96e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, passportConfig, changeQuickRedirect2, false, "39307947b10d35bb84a34a918b7ad96e");
        } else {
            StorageUtil.putSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.PublicKey", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCRD8YahHualjGxPMzeIWnAqVGMIrWrrkr5L7gw+5XT55iIuYXZYLaUFMTOD9iSyfKlL9mvD3ReUX6Lieph3ajJAPPGEuSHwoj5PN1UiQXK3wzAPKcpwrrA2V4Agu1/RZsyIuzboXgcPexyUYxYUTJH48DeYBGJe2GrYtsmzuIu6QIDAQAB", 0);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, passportConfig, changeQuickRedirect3, false, "eb422ec9d06f03407b72ad009171b77f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, passportConfig, changeQuickRedirect3, false, "eb422ec9d06f03407b72ad009171b77f");
        } else {
            StorageUtil.putSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.SDKVersion", "5.52.9.1-beta", 0);
        }
    }

    public static /* synthetic */ void a(PassportConfig passportConfig, ArrayDeque arrayDeque) {
        Object[] objArr = {arrayDeque};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "7055d79dac3c015638761b4201c73655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "7055d79dac3c015638761b4201c73655");
        } else {
            d().x = arrayDeque;
        }
    }

    public static /* synthetic */ void b(PassportConfig passportConfig, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "ff482de04c782e593f59066fe6bcb490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "ff482de04c782e593f59066fe6bcb490");
        } else {
            d().o = str;
        }
    }

    public static /* synthetic */ void b(PassportConfig passportConfig, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "b4fe91602f6978e83e2c04989bc15942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "b4fe91602f6978e83e2c04989bc15942");
        } else {
            d().l = z;
        }
    }

    public static /* synthetic */ void c(PassportConfig passportConfig, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "c8db62d308699eb66c277c2fcfddbadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "c8db62d308699eb66c277c2fcfddbadc");
            return;
        }
        StorageUtil.putSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.AppKey", str, 0);
        d().p = str;
    }

    public static /* synthetic */ void d(PassportConfig passportConfig, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportConfig, changeQuickRedirect, false, "a0513482e80fd85af049bf5e0a98aa30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, passportConfig, changeQuickRedirect, false, "a0513482e80fd85af049bf5e0a98aa30");
        } else {
            d().v = str;
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd7c8c72492cb3c34d74accca6e5924b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd7c8c72492cb3c34d74accca6e5924b")).intValue() : d().c;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dad84b2a90304f0f90c393af95953cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dad84b2a90304f0f90c393af95953cd")).booleanValue() : d().t;
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e623d0f83b8f8742a26929f3b2038ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e623d0f83b8f8742a26929f3b2038ddf");
        } else {
            d().t = false;
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c3f8202ac246713382c2f60a819f8ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c3f8202ac246713382c2f60a819f8ea")).booleanValue() : d().u;
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "266a6d3591f891387f0d35d226a0927e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "266a6d3591f891387f0d35d226a0927e");
        } else {
            d().u = z;
        }
    }

    public static void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14f65c13dba2d3faaf331b5e72277177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14f65c13dba2d3faaf331b5e72277177");
        } else {
            d().w = true;
        }
    }

    public static PassportConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6699296eacf747328c23219a91af4ef5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PassportConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6699296eacf747328c23219a91af4ef5");
        }
        if (q == null) {
            q = new PassportConfig();
        }
        return q;
    }

    public PassportConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f985454e17471bc25a15bac74c1be7dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f985454e17471bc25a15bac74c1be7dc");
            return;
        }
        this.d = -1;
        this.e = false;
        this.f = "com.meituan.android.intent.action.login";
        this.g = true;
        this.h = true;
        this.i = -1;
        this.j = -1;
        this.k = "";
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = AbsApiFactory.PASSPORT_ONLINE_URL;
        this.p = "login_mtapp";
        this.r = 6;
        this.t = false;
        this.u = false;
        this.v = "";
        this.w = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8884f66404d4711a8cd82944878c929", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8884f66404d4711a8cd82944878c929")).booleanValue() : d().g && d().h;
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32e42781a6e66e9d76419fdd14d0d70d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32e42781a6e66e9d76419fdd14d0d70d") : d().o;
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22d70485a3e35395a13efd18e8def80b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22d70485a3e35395a13efd18e8def80b") : d().p;
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce43da273698245e8428f7365fd3f6a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce43da273698245e8428f7365fd3f6a1") : d().b;
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff4f4d706f468edc453430bdf67dae15", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff4f4d706f468edc453430bdf67dae15")).booleanValue() : d().n;
    }

    public static void d(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "678112c4b3153d9a1abf2a7a55723f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "678112c4b3153d9a1abf2a7a55723f4d");
        } else {
            d().h = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd3a363be6b00fe48ad4668de025b980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd3a363be6b00fe48ad4668de025b980");
        } else {
            d().d = i;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7674364899cb376ff53d4fc791189582", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7674364899cb376ff53d4fc791189582")).intValue();
        }
        if (d().d == -1) {
            return d().i;
        }
        return d().d;
    }

    public static ArrayDeque<LogoutPath> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8ef89b4bcfe8acc09474b29dbcd5f16", RobustBitConfig.DEFAULT_VALUE) ? (ArrayDeque) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8ef89b4bcfe8acc09474b29dbcd5f16") : d().x;
    }

    public static String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a369e784921924857472461b12bb6ac7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a369e784921924857472461b12bb6ac7") : d().v;
    }

    public static String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe36b9fcd301b75e19390935d6fdd78e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe36b9fcd301b75e19390935d6fdd78e") : d().k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c4b8b8f5783e9e88fb384842dc1e159", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c4b8b8f5783e9e88fb384842dc1e159")).booleanValue() : j() == 4;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30ba9e8cc2e50a437b7cd1cd7606f03a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30ba9e8cc2e50a437b7cd1cd7606f03a")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f6836e2a19f5d70fce2521753977fbc9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f6836e2a19f5d70fce2521753977fbc9")).intValue() : d().r) == 6 && s == 6;
    }

    public static void b(int i) {
        s = 6;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af50364b573ebfdeba03e15011e513f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af50364b573ebfdeba03e15011e513f1");
        } else {
            d().e = z;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a944fdc3b528403a3120830d800ddfe7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a944fdc3b528403a3120830d800ddfe7")).booleanValue() : d().e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94293d4802afb580eb357d882fb0ec26", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94293d4802afb580eb357d882fb0ec26")).booleanValue() : d().m;
    }

    public static a s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f25954ed608740a5362f14a2299565b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f25954ed608740a5362f14a2299565b") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a<T extends a> {
        public static ChangeQuickRedirect a;
        public T b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e286c549d0e83ada4a9b9e06dd9ad1df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e286c549d0e83ada4a9b9e06dd9ad1df");
            } else {
                this.b = this;
            }
        }
    }
}
