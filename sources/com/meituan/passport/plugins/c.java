package com.meituan.passport.plugins;

import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c extends d {
    public static ChangeQuickRedirect a;
    private d b;
    private d c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25af9c473d19d1680413f8492ab9379d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25af9c473d19d1680413f8492ab9379d");
            return;
        }
        this.b = new a();
        this.c = new b();
    }

    @Override // com.meituan.passport.plugins.d
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3918f28b85e35710832f22773aa9e0e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3918f28b85e35710832f22773aa9e0e3") : this.b.a(str);
    }

    @Override // com.meituan.passport.plugins.d
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3abdb1a7ba00c1a75bde9a9e02f1e105", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3abdb1a7ba00c1a75bde9a9e02f1e105");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!c(str)) {
            if (com.meituan.passport.utils.f.a()) {
                throw new RuntimeException("encodeStr must be encode value");
            }
            return str;
        }
        String str2 = null;
        if (this.c.c(str)) {
            str2 = this.c.b(str);
        } else if (this.b.c(str)) {
            str2 = this.b.b(str);
        }
        if (str2 == null) {
            if (com.meituan.passport.utils.f.a()) {
                throw new RuntimeException("values can not decode user");
            }
            return str;
        }
        return str2;
    }

    @Override // com.meituan.passport.plugins.d
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00beaec7fdf55ecf31993459d6803575", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00beaec7fdf55ecf31993459d6803575")).booleanValue() : this.b.c(str) || this.c.c(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a extends d {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.passport.plugins.d
        public final String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1f13de88e3e1ed61c9e841c03fb72e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1f13de88e3e1ed61c9e841c03fb72e");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String a2 = com.meituan.passport.plugins.a.a(str, "S1Z6.mt.passport");
            if (a2 == null) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("values can not encode user");
                }
                return str;
            }
            return "aesEncode" + a2;
        }

        @Override // com.meituan.passport.plugins.d
        public final String b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e45273dabcbecfaec00f4b7050166f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e45273dabcbecfaec00f4b7050166f");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!c(str)) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("encodeStr must be encode value");
                }
                return str;
            } else if (str.length() < 9) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("values len error");
                }
                return str;
            } else {
                String substring = str.substring(9);
                if (TextUtils.isEmpty(substring)) {
                    if (com.meituan.passport.utils.f.a()) {
                        throw new RuntimeException("values can not pre decode user");
                    }
                    return substring;
                }
                String b = com.meituan.passport.plugins.a.b(substring, "S1Z6.mt.passport");
                if (b == null) {
                    if (com.meituan.passport.utils.f.a()) {
                        throw new RuntimeException("values can not decode user");
                    }
                    return null;
                }
                return b;
            }
        }

        @Override // com.meituan.passport.plugins.d
        public final boolean c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313eaa57265664c27cd1074683a99941", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313eaa57265664c27cd1074683a99941")).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith("aesEncode");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends d {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.passport.plugins.d
        public final String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82368ce415a8423cf2ef5a6558b6b478", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82368ce415a8423cf2ef5a6558b6b478");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            byte[] encode = Base64.encode(str.getBytes(Charset.forName("UTF-8")), 0);
            if (encode == null) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("values can not encode user");
                }
                return "encodeStr" + str;
            }
            return "encodeStr" + new String(encode, Charset.forName("UTF-8"));
        }

        @Override // com.meituan.passport.plugins.d
        public final String b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5e0bd495ad76eeb493e0c72ff1c571", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5e0bd495ad76eeb493e0c72ff1c571");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!c(str)) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("encodeStr must be encode value");
                }
                return str;
            } else if (str.length() < 9) {
                if (com.meituan.passport.utils.f.a()) {
                    throw new RuntimeException("values len error");
                }
                return str;
            } else {
                String substring = str.substring(9);
                if (TextUtils.isEmpty(substring)) {
                    if (com.meituan.passport.utils.f.a()) {
                        throw new RuntimeException("values can not pre decode user");
                    }
                    return substring;
                }
                byte[] decode = Base64.decode(substring, 0);
                if (decode == null) {
                    if (com.meituan.passport.utils.f.a()) {
                        throw new RuntimeException("values can not decode user");
                    }
                    return null;
                }
                return new String(decode, Charset.forName("UTF-8"));
            }
        }

        @Override // com.meituan.passport.plugins.d
        public final boolean c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ce014c715ef831841c409dd6079603", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ce014c715ef831841c409dd6079603")).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith("encodeStr");
        }
    }
}
