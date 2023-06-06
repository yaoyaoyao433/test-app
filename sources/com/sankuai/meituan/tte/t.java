package com.sankuai.meituan.tte;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.w;
import com.sankuai.meituan.tte.x;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class t {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile t b;
    private final Context c;

    public static t a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f239d59522d2b9f4ebb6b65f6f9dd08", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f239d59522d2b9f4ebb6b65f6f9dd08");
        }
        if (b == null) {
            synchronized (t.class) {
                if (b == null) {
                    b = new t(context);
                }
            }
        }
        return b;
    }

    private t(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7298e864cb44564d86979cc528495bb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7298e864cb44564d86979cc528495bb4");
        } else {
            this.c = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d3b815736a348dc5b920908a715b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d3b815736a348dc5b920908a715b0b")).booleanValue();
        }
        if (e.a(this.c).a(lVar.c).a()) {
            u.b("TKeyStore", "remove: disable");
            return false;
        }
        try {
            return b().b(a().a(lVar.b, lVar.c));
        } catch (Throwable th) {
            u.b("TKeyStore", "remove", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public l a(x.d dVar, x.c cVar) {
        p<?> a2;
        String b2;
        String str;
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b3efc27660b4c0e6ee4838ce8e133c", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b3efc27660b4c0e6ee4838ce8e133c");
        }
        if (e.a(this.c).a(cVar).a()) {
            u.b("TKeyStore", "get: disable");
            return null;
        }
        w.a a3 = w.a("tte.keyStore.read", "keyStore");
        try {
            try {
                try {
                    try {
                        a2 = a();
                        a3.a("algo", cVar.e);
                        a3.a("code", "0");
                        a3.a("backend", a2.c);
                        b2 = b().b(a2.a(dVar, cVar), "");
                    } catch (KeyStoreException e) {
                        a3.a("code", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
                        u.b("TKeyStore", "get", e);
                    }
                } catch (JSONException e2) {
                    a3.a("code", "1003");
                    u.b("TKeyStore", "get", e2);
                }
            } catch (GeneralSecurityException e3) {
                a3.a("code", "1004");
                u.b("TKeyStore", "get", e3);
            } catch (Throwable th) {
                a3.a("code", "1100");
                u.b("TKeyStore", "get", th);
            }
            if (!TextUtils.isEmpty(b2)) {
                l lVar = new l(new JSONObject(b2));
                byte[] bArr = lVar.d;
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect2 = p.a;
                lVar.d = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a7e5ad7d6f8cac584b3de8d41cef660c", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a7e5ad7d6f8cac584b3de8d41cef660c") : a2.b(bArr, a2.a());
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "d0d3a079d6ccd2bfbac1a2e51aea2a8b", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "d0d3a079d6ccd2bfbac1a2e51aea2a8b");
                } else if (lVar.d == null) {
                    str = "null dk";
                } else if (lVar.d.length != 16) {
                    str = "invalid dk len: " + lVar.d.length;
                } else {
                    str = null;
                }
                if (str != null) {
                    u.b("TKeyStore", str, null);
                    a3.a("code", "1005");
                    return null;
                }
                return lVar;
            }
            a3.a("code", "1002");
            return null;
        } finally {
            a3.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(l lVar) {
        JSONObject jSONObject;
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ab3f91d67a07ec0cc7262ec5be8a6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ab3f91d67a07ec0cc7262ec5be8a6c")).booleanValue();
        }
        if (e.a(this.c).a(lVar.c).a()) {
            u.b("TKeyStore", "set: disable");
            return false;
        }
        w.a a2 = w.a("tte.keyStore.write", "keyStore");
        try {
            try {
                try {
                    try {
                        p<?> a3 = a();
                        a2.a("algo", lVar.c.e);
                        a2.a("code", "0");
                        a2.a("backend", a3.c);
                        byte[] bArr = lVar.d;
                        Object[] objArr2 = {bArr};
                        ChangeQuickRedirect changeQuickRedirect2 = p.a;
                        byte[] a4 = PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "14a710b6931356eae46c56aa5e313077", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "14a710b6931356eae46c56aa5e313077") : a3.a(bArr, (byte[]) a3.a());
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = l.a;
                        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "d10cf9f8538929e3f5608beaac769599", RobustBitConfig.DEFAULT_VALUE)) {
                            jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "d10cf9f8538929e3f5608beaac769599");
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("env", lVar.b.ordinal());
                            jSONObject.put("cipherType", lVar.c.d);
                            jSONObject.put("dk", y.a(lVar.d));
                            jSONObject.put("edk", y.a(lVar.e));
                            jSONObject.put("retrievedAt", lVar.f);
                        }
                        jSONObject.put("dk", y.a(a4));
                        b().a(a3.a(lVar.b, lVar.c), jSONObject.toString());
                        a2.b();
                        return true;
                    } catch (JSONException e) {
                        a2.a("code", "1003");
                        u.b("TKeyStore", "set", e);
                        return false;
                    }
                } catch (KeyStoreException e2) {
                    a2.a("code", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
                    u.b("TKeyStore", "set", e2);
                    return false;
                }
            } catch (GeneralSecurityException e3) {
                a2.a("code", "1004");
                u.b("TKeyStore", "set", e3);
                return false;
            }
        } finally {
            a2.b();
        }
    }

    @VisibleForTesting
    private p<?> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5711d9d05b886697d04289fa787b11", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5711d9d05b886697d04289fa787b11") : p.a(this.c);
    }

    private com.meituan.android.cipstorage.q b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd27656274bbc0322dcf225d4b923233", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd27656274bbc0322dcf225d4b923233") : y.a(this.c, "ks");
    }
}
