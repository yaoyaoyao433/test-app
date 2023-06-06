package com.meituan.android.paybase.fingerprint.soter.sotercore.external;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.t;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "SOTER_ASK_" + Process.myUid();
    private static boolean c = false;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eddb8385beea23a2bbb7b6c9acb351fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eddb8385beea23a2bbb7b6c9acb351fa")).booleanValue();
        }
        if (!c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            try {
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2bcf79f9b02a483dab2522bd1cc9b4ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2bcf79f9b02a483dab2522bd1cc9b4ba");
                } else {
                    try {
                        try {
                            try {
                                Method method = Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new Class[0]);
                                method.setAccessible(true);
                                method.invoke(null, new Object[0]);
                            } catch (NoSuchMethodException e) {
                                com.meituan.android.paybase.common.analyse.a.a(e, "SoterCore_setUp", (Map<String, Object>) null);
                            }
                        } catch (ClassNotFoundException e2) {
                            com.meituan.android.paybase.common.analyse.a.a(e2, "SoterCore_setUp", (Map<String, Object>) null);
                        }
                    } catch (IllegalAccessException e3) {
                        com.meituan.android.paybase.common.analyse.a.a(e3, "SoterCore_setUp", (Map<String, Object>) null);
                    } catch (InvocationTargetException e4) {
                        com.meituan.android.paybase.common.analyse.a.a(e4, "SoterCore_setUp", (Map<String, Object>) null);
                    }
                }
            } finally {
                c = true;
            }
        }
        Provider[] providers = Security.getProviders();
        if (providers == null) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ff4agou8_mv", new a.c().a("isSuppportSoter", "noProvider").b);
            return false;
        }
        for (Provider provider : providers) {
            if ("SoterKeyStore".equals(provider.getName())) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_ff4agou8_mv", new a.c().a("isSuppportSoter", "support").b);
                return true;
            }
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ff4agou8_mv", new a.c().a("isSuppportSoter", "notSupport").b);
        return false;
    }

    @SuppressLint({"TrulyRandom"})
    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae903560694a7085452ec665c597bb47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae903560694a7085452ec665c597bb47")).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        t.a("SoterCore", "generateAppGlobalSecureKey", "start generate ask");
        if (a()) {
            try {
                KeyStore.getInstance("AndroidKeyStore").load(null);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
                keyPairGenerator.initialize(com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a.a(b + ".addcounter.auto_signed_when_get_pubkey_attk", 4).a("SHA-256").b("PSS").a());
                keyPairGenerator.generateKeyPair();
                com.meituan.android.paybase.common.analyse.a.a("b_pay_4k1t762h_mc", new a.c().a("generateAppGlobalSecureKeyTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).a("generateAppGlobalSecureKey", "successfully").b);
                return 0;
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_generateAppGlobalSecureKey").a("message", e.getMessage()).b);
                t.a("SoterCore", "generateAppGlobalSecureKey", "generate fail", e.toString());
                return 1;
            }
        }
        t.a("SoterCore", "generateAppGlobalSecureKey", "not support soter");
        return 3;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa7d4906cccf4e8b6256ef2b4f627542", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa7d4906cccf4e8b6256ef2b4f627542")).booleanValue();
        }
        t.a("SoterCore", "removeAppGlobalSecureKey", "start remove app global secure key");
        if (a()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("SoterKeyStore");
                keyStore.load(null);
                keyStore.deleteEntry(b);
                return true;
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_removeAppGlobalSecureKey").a("message", e.getMessage()).b);
                t.a("SoterCore", "removeAppGlobalSecureKey ", e.toString());
            }
        } else {
            t.a("SoterCore", "removeAppGlobalSecureKey", "not support soter");
        }
        return false;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "699b97f635d720a3747c810fee796d1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "699b97f635d720a3747c810fee796d1d")).booleanValue();
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getCertificate(b) != null;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_hasAppBlobalSecureKey").a("message", e.getMessage()).b);
            t.a("SoterCore", "hasAppBlobalSecureKey", e.toString());
            return false;
        }
    }

    public static b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "768e155a28b2548c8457875cd407b740", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "768e155a28b2548c8457875cd407b740");
        }
        t.a("SoterCore", "getAppGlobalSecureKeyModel", "start get app global secure key pub");
        if (a()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("SoterKeyStore");
                keyStore.load(null);
                try {
                    Key key = keyStore.getKey(b, "from_soter_ui".toCharArray());
                    if (key != null) {
                        return c(key.getEncoded());
                    }
                    t.a("SoterCore", "getAppGlobalSecureKeyModel", "key can not be retrieved");
                    return null;
                } catch (ClassCastException e) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAppGlobalSecureKeyModel").a("message", e.getMessage()).b);
                    t.a("SoterCore", "getAppGlobalSecureKeyModel", "cast error");
                    return null;
                }
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAppGlobalSecureKeyModel").a("message", e2.getMessage()).b);
            }
        } else {
            t.a("SoterCore", "getAppGlobalSecureKeyModel", "not support soter");
        }
        return null;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e467b158073903848e7eb86c35b9ed0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e467b158073903848e7eb86c35b9ed0c")).intValue();
        }
        t.a("SoterCore", "generateAuthKey", "start to generate authKey");
        long currentTimeMillis = System.currentTimeMillis();
        if (f(str)) {
            t.a("SoterCore", "generateAuthKey", "auth key name is null or nil. abort.");
            return 2;
        } else if (a()) {
            try {
                if (d()) {
                    KeyStore.getInstance("AndroidKeyStore").load(null);
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
                    try {
                        keyPairGenerator.initialize(com.meituan.android.paybase.fingerprint.soter.sotercore.keystore.a.a(str + String.format(".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign", b), 4).a("SHA-256").a(true).b("PSS").a());
                        keyPairGenerator.generateKeyPair();
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_4k1t762h_mc", new a.c().a("generateAuthKeyTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).a("generateAuthKey", "successfully").b);
                        return 0;
                    } catch (Exception e) {
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_generateAuthKey").a("message", e.getMessage()).b);
                        t.a("SoterCore", "generateAuthKey", "generate fail", e.toString());
                        return 1;
                    }
                }
                return 4;
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_generateAuthKey").a("message", e2.getMessage()).b);
                t.a("SoterCore", "generateAuthKey", "generate fail", e2.toString());
                return 1;
            }
        } else {
            t.a("SoterCore", "not support soter");
            return 3;
        }
    }

    public static boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "378acfd2159c140835e7523e6ae8710b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "378acfd2159c140835e7523e6ae8710b")).booleanValue();
        }
        if (f(str)) {
            t.a("SoterCore", "auth key name is null or nil. abort.");
            return false;
        }
        t.a("SoterCore", "removeAuthKey", "start remove key");
        if (a()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("SoterKeyStore");
                keyStore.load(null);
                keyStore.deleteEntry(str);
                if (z) {
                    t.a("SoterCore", "removeAuthKey", "auto delete ask");
                    if (d()) {
                        c();
                    }
                }
                return true;
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_removeAuthKey").a("message", e.getMessage()).b);
                t.a("SoterCore", "removeAuthKey " + e.toString());
            }
        } else {
            t.a("SoterCore", "removeAuthKey", "not support soter");
        }
        return false;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e81441f9655303623c7a0655daf5489", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e81441f9655303623c7a0655daf5489")).booleanValue();
        }
        if (f(str)) {
            t.a("SoterCore", "hasAuthKey", "authkey name not correct");
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getCertificate(str) != null;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_hasAuthKey").a("message", e.getMessage()).b);
            t.a("SoterCore", "hasAuthKey", e.toString());
            return false;
        }
    }

    public static boolean b(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "407584562356d3a769eb4e4447e938f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "407584562356d3a769eb4e4447e938f1")).booleanValue();
        }
        t.a("SoterCore", "isAuthKeyValid");
        if (f(str)) {
            t.a("SoterCore", "isAuthKeyValid", "checking key valid: authkey name not correct");
            return false;
        }
        try {
            e(str);
            t.a("SoterCore", "isAuthKeyValid", "key valid");
            return true;
        } catch (InvalidKeyException | UnrecoverableEntryException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_isAuthKeyValid").a("message", e.getMessage()).b);
            t.a("SoterCore", "isAuthKeyValid", "key invalid.");
            a(str, false);
            return false;
        } catch (Exception unused) {
            t.a("SoterCore", "isAuthKeyValid", "occurs other exceptions");
            return false;
        }
    }

    public static b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89604bd419a9c771981b0a3a7c7cd7ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89604bd419a9c771981b0a3a7c7cd7ae");
        }
        t.a("SoterCore", "getAuthKeyModel");
        if (f(str)) {
            t.a("SoterCore", "getAuthKeyModel", "auth key name is null or nil. abort.");
            return null;
        }
        if (a()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("SoterKeyStore");
                keyStore.load(null);
                try {
                    Key key = keyStore.getKey(str, "from_soter_ui".toCharArray());
                    if (key != null) {
                        return c(key.getEncoded());
                    }
                    t.a("SoterCore", "getAuthKeyModel", "key can not be retrieved");
                    return null;
                } catch (ClassCastException e) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAuthKeyModel").a("message", e.getMessage()).b);
                    t.a("SoterCore", "getAuthKeyModel", "cast error");
                    return null;
                }
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAuthKeyModel").a("message", e2.getMessage()).b);
            }
        } else {
            t.a("SoterCore", "getAuthKeyModel", "not support soter");
        }
        return null;
    }

    public static Signature d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad69e567a8b85940198deac6c2983f57", RobustBitConfig.DEFAULT_VALUE)) {
            return (Signature) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad69e567a8b85940198deac6c2983f57");
        }
        t.a("SoterCore", "getAuthInitAndSign");
        if (f(str)) {
            t.a("SoterCore", "auth key name is null or nil. abort.");
            return null;
        } else if (a()) {
            try {
                return e(str);
            } catch (InvalidKeyException | UnrecoverableEntryException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAuthInitAndSign").a("message", e.getMessage()).b);
                t.a("SoterCore", "getAuthInitAndSign", "key invalid");
                return null;
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterCore_getAuthInitAndSign").a("message", e2.getMessage()).b);
                t.a("SoterCore", "getAuthInitAndSign", e2.toString());
                return null;
            }
        } else {
            t.a("SoterCore", "getAuthInitAndSign", "not support soter");
            return null;
        }
    }

    private static Signature e(String str) throws InvalidKeyException, NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff82f01edcd333a6090c51aac2e438a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Signature) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff82f01edcd333a6090c51aac2e438a5");
        }
        if (f(str)) {
            t.a("SoterCore", "getAuthInitAndSign", "auth key name is null or nil. abort.");
            return null;
        }
        Signature signature = Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
        KeyStore keyStore = KeyStore.getInstance("SoterKeyStore");
        keyStore.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
        if (privateKeyEntry != null) {
            signature.initSign(privateKeyEntry.getPrivateKey());
            return signature;
        }
        t.a("SoterCore", "getAuthInitAndSign", "entry not exists");
        return null;
    }

    private static int b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c15bb02e8261b8b38686b33ae864bd6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c15bb02e8261b8b38686b33ae864bd6a")).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    private static b c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89c6b565b0590d72be0af010a158e889", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89c6b565b0590d72be0af010a158e889");
        }
        if (bArr == null) {
            t.a("SoterCore", "retriveJsonFromExportedData", "raw data is null");
            return null;
        }
        if (bArr.length < 4) {
            t.a("SoterCore", "retriveJsonFromExportedData", "raw data length smaller than RAW_LENGTH_PREFIX");
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int b2 = b(bArr2);
        byte[] bArr3 = new byte[b2];
        int i = b2 + 4;
        if (bArr.length <= i) {
            t.a("SoterCore", "retriveJsonFromExportedData", "length not correct 2");
            return null;
        }
        System.arraycopy(bArr, 4, bArr3, 0, b2);
        b bVar = new b(new String(bArr3), "");
        int length = bArr.length - i;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, i, bArr4, 0, length);
        bVar.c = Base64.encodeToString(bArr4, 2);
        return bVar;
    }

    private static boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8b278716cc2299803e5dde8d0b32dfc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8b278716cc2299803e5dde8d0b32dfc")).booleanValue() : str == null || str.length() <= 0;
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4952a289c1b57a6f3f4f926e88aeaed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4952a289c1b57a6f3f4f926e88aeaed");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<deviceinfo>");
        sb.append("<MANUFACTURER name=\"");
        sb.append(Build.MANUFACTURER);
        sb.append("\">");
        sb.append("<MODEL name=\"");
        sb.append(Build.MODEL);
        sb.append("\">");
        sb.append("<VERSION_RELEASE name=\"");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\">");
        sb.append("<VERSION_INCREMENTAL name=\"");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\">");
        sb.append("<DISPLAY name=\"");
        sb.append(Build.DISPLAY);
        sb.append("\">");
        sb.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        t.a("SoterCore", "model_key", sb.toString());
        return sb.toString();
    }

    public static c a(byte[] bArr) {
        boolean z = true;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c544413d41e5b5843d2f4557a20b7be", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c544413d41e5b5843d2f4557a20b7be");
        }
        if (bArr != null && bArr.length > 0) {
            z = false;
        }
        if (z) {
            t.a("SoterCore", "convertFromBytesToSignatureResult", "origin is null or nil. abort");
            return null;
        } else if (bArr.length < 4) {
            t.a("SoterCore", "convertFromBytesToSignatureResult", "length not correct 1");
            return null;
        } else {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            int b2 = b(bArr2);
            byte[] bArr3 = new byte[b2];
            int i = b2 + 4;
            if (bArr.length <= i) {
                t.a("SoterCore", "convertFromBytesToSignatureResult", "length not correct 2");
                return null;
            }
            System.arraycopy(bArr, 4, bArr3, 0, b2);
            c a2 = c.a(new String(bArr3));
            int length = bArr.length - i;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i, bArr4, 0, length);
            if (a2 != null) {
                a2.c = Base64.encodeToString(bArr4, 2);
            }
            return a2;
        }
    }
}
