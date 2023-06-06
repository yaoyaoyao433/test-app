package com.sankuai.meituan.tte;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.tte.x;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.interfaces.RSAKey;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.security.auth.x500.X500Principal;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class p<K> {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile p<?> d;
    protected final Context b;
    final String c;
    private final String e;
    private final String f;
    private volatile K g;

    public abstract K a(String str) throws GeneralSecurityException;

    public abstract K a(KeyStore keyStore, String str) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException;

    public abstract byte[] a(byte[] bArr, K k) throws GeneralSecurityException;

    public abstract byte[] b(byte[] bArr, K k) throws GeneralSecurityException;

    public static p<?> a(Context context) {
        p<?> bVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a676ce4233f6a080ea49a16f251d8db3", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a676ce4233f6a080ea49a16f251d8db3");
        }
        if (d == null) {
            synchronized (p.class) {
                if (d == null) {
                    if (Build.VERSION.SDK_INT >= 23 && !e.a(context).c) {
                        bVar = new a(context);
                        d = bVar;
                    }
                    bVar = new b(context);
                    d = bVar;
                }
            }
        }
        return d;
    }

    public p(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce19d0c86d13f4b53098e61ccb1f4f11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce19d0c86d13f4b53098e61ccb1f4f11");
            return;
        }
        this.b = context;
        this.e = str;
        this.f = str2;
        this.c = str3;
    }

    public final String a(x.d dVar, x.c cVar) {
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6045abd74ba138c134df859d02a928", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6045abd74ba138c134df859d02a928");
        }
        return this.f + dVar + CommonConstant.Symbol.COLON + cVar.d;
    }

    @VisibleForTesting
    @NonNull
    public final K a() throws KeyStoreException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af06e98ba03658aed317730fb46114e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af06e98ba03658aed317730fb46114e4");
        }
        if (this.g == null) {
            synchronized (p.class) {
                if (this.g == null) {
                    this.g = b();
                }
            }
        }
        return this.g;
    }

    @VisibleForTesting
    @NonNull
    private K b() throws KeyStoreException {
        String str;
        boolean containsAlias;
        K a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac38c400a7755c131309c28c770d0bc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac38c400a7755c131309c28c770d0bc0");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c53392908fd154bea2a3ffc177076b7f", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c53392908fd154bea2a3ffc177076b7f");
        } else {
            str = this.e + ProcessUtils.getCurrentProcessName(this.b);
        }
        try {
            KeyStore c = c();
            c.load(null);
            try {
                containsAlias = c.containsAlias(str);
            } catch (NullPointerException unused) {
                u.a("SecureBox", "Keystore is temporarily unavailable.", null);
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException unused2) {
                }
                c = c();
                c.load(null);
                containsAlias = c.containsAlias(str);
            }
            u.c("SecureBox", "containsAlias[" + str + "]: " + containsAlias);
            if (containsAlias && (a2 = a(c, str)) != null) {
                u.b("SecureBox", "did get master key");
                return a2;
            }
        } catch (Throwable th) {
            u.b("SecureBox", "get master key", th);
        }
        try {
            u.b("SecureBox", "try gen master key");
            K a3 = a(str);
            u.b("SecureBox", "did gen master key");
            return a3;
        } catch (Throwable th2) {
            throw new KeyStoreException("gen master key", th2);
        }
    }

    @VisibleForTesting
    private KeyStore c() throws KeyStoreException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6046d553d3afcb60e51a9f5e1cbb3f0b", RobustBitConfig.DEFAULT_VALUE) ? (KeyStore) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6046d553d3afcb60e51a9f5e1cbb3f0b") : KeyStore.getInstance("AndroidKeyStore");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends p<KeyPair> {
        public static ChangeQuickRedirect d;

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ KeyPair a(String str) throws GeneralSecurityException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0687cb72afe25e5d784767c2683ee04e", RobustBitConfig.DEFAULT_VALUE)) {
                return (KeyPair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0687cb72afe25e5d784767c2683ee04e");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            KeyPairGenerator keyPairGenerator = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a162ac14910248edb0c148aec0938548", RobustBitConfig.DEFAULT_VALUE) ? (KeyPairGenerator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a162ac14910248edb0c148aec0938548") : KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 100);
            keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(this.b).setKeySize(2048).setAlias(str).setSubject(new X500Principal("CN=TTE")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
            return keyPairGenerator.generateKeyPair();
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ KeyPair a(KeyStore keyStore, String str) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException {
            Object[] objArr = {keyStore, str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1890c3d7dfced6dfc7a82ab90831057", RobustBitConfig.DEFAULT_VALUE)) {
                return (KeyPair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1890c3d7dfced6dfc7a82ab90831057");
            }
            Key key = keyStore.getKey(str, null);
            PrivateKey privateKey = ((key instanceof PrivateKey) && (key instanceof RSAKey)) ? (PrivateKey) key : null;
            Certificate certificate = keyStore.getCertificate(str);
            PublicKey publicKey = (certificate == null || !(certificate.getPublicKey() instanceof RSAKey)) ? null : certificate.getPublicKey();
            if (privateKey == null || publicKey == null) {
                return null;
            }
            return new KeyPair(publicKey, privateKey);
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ byte[] a(byte[] bArr, KeyPair keyPair) throws GeneralSecurityException {
            KeyPair keyPair2 = keyPair;
            Object[] objArr = {bArr, keyPair2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a37133c03a6bdd0e9e1feac9aa233ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a37133c03a6bdd0e9e1feac9aa233ee");
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, keyPair2.getPublic());
            return cipher.doFinal(bArr);
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ byte[] b(byte[] bArr, KeyPair keyPair) throws GeneralSecurityException {
            KeyPair keyPair2 = keyPair;
            Object[] objArr = {bArr, keyPair2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8c7766cd49984ab699eaa8e026a954", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8c7766cd49984ab699eaa8e026a954");
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, keyPair2.getPrivate());
            return cipher.doFinal(bArr);
        }

        public b(Context context) {
            super(context, "com.sankuai.meituan.tte.master_key-2048:", "data_key-2048:", "rsa");
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbd58a1e9b3d013b6af52db8c74e815", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbd58a1e9b3d013b6af52db8c74e815");
            }
        }
    }

    /* compiled from: ProGuard */
    @RequiresApi(api = 23)
    /* loaded from: classes4.dex */
    static class a extends p<SecretKey> {
        public static ChangeQuickRedirect d;

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ SecretKey a(String str) throws GeneralSecurityException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be681e2cbaec6e92a9a6c8fb71e77d1", RobustBitConfig.DEFAULT_VALUE)) {
                return (SecretKey) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be681e2cbaec6e92a9a6c8fb71e77d1");
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setKeySize(128).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
            return keyGenerator.generateKey();
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ SecretKey a(KeyStore keyStore, String str) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException {
            Object[] objArr = {keyStore, str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d75dbfddf0200ad457ac9c6c337f35", RobustBitConfig.DEFAULT_VALUE)) {
                return (SecretKey) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d75dbfddf0200ad457ac9c6c337f35");
            }
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            return null;
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ byte[] a(byte[] bArr, SecretKey secretKey) throws GeneralSecurityException {
            SecretKey secretKey2 = secretKey;
            Object[] objArr = {bArr, secretKey2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4f0bb90c06562c4c064e23672d0725", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4f0bb90c06562c4c064e23672d0725");
            }
            byte[] bArr2 = new byte[12];
            new SecureRandom().nextBytes(bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey2, new GCMParameterSpec(128, bArr2));
            return y.a(bArr2, cipher.doFinal(bArr));
        }

        @Override // com.sankuai.meituan.tte.p
        public final /* synthetic */ byte[] b(byte[] bArr, SecretKey secretKey) throws GeneralSecurityException {
            SecretKey secretKey2 = secretKey;
            Object[] objArr = {bArr, secretKey2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f9d7495c903f9f1d3a381fa58fe739", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f9d7495c903f9f1d3a381fa58fe739");
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey2, new GCMParameterSpec(128, bArr, 0, 12));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }

        public a(Context context) {
            super(context, "com.sankuai.meituan.tte.master_key-aes-128:", "data_key-aes-128:", "aes");
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc630cb1a935ea7a083357d36aea68e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc630cb1a935ea7a083357d36aea68e");
            }
        }
    }
}
