package com.huawei.agconnect.config.a;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends g {
    private final Map<String, String> a;
    private final Object b;
    private SecretKey c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, String str) {
        super(context, str);
        this.a = new HashMap();
        this.b = new Object();
        this.d = true;
        try {
            String a = super.a("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138", null);
            String a2 = super.a("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C", null);
            String a3 = super.a("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B", null);
            String a4 = super.a("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD", null);
            if (a == null || a2 == null || a3 == null || a4 == null) {
                this.d = false;
            } else {
                this.c = f.a(d.a(a), d.a(a2), d.a(a3), d.a(a4));
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
            this.c = null;
        }
    }

    @Override // com.huawei.agconnect.config.a.g, com.huawei.agconnect.config.a.c
    public final String a(String str, String str2) {
        if (!this.d) {
            String a = super.a(str, null);
            return a == null ? str2 : a;
        } else if (this.c == null) {
            Log.e("SecurityResourcesReader", "KEY is null return def directly");
            return str2;
        } else {
            synchronized (this.b) {
                String str3 = this.a.get(str);
                if (str3 != null) {
                    return str3;
                }
                String a2 = super.a(str, null);
                if (a2 == null) {
                    return str2;
                }
                try {
                    SecretKey secretKey = this.c;
                    byte[] a3 = d.a(a2);
                    if (secretKey == null || a3 == null) {
                        throw new NullPointerException("key or cipherText must not be null.");
                    }
                    byte[] copyOfRange = Arrays.copyOfRange(a3, 1, 17);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, secretKey, new IvParameterSpec(copyOfRange));
                    String str4 = new String(cipher.doFinal(a3, copyOfRange.length + 1, (a3.length - copyOfRange.length) - 1), "UTF-8");
                    this.a.put(str, str4);
                    return str4;
                } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                    Log.e("SecurityResourcesReader", "Exception when reading the 'V' for 'Config'.");
                    return str2;
                }
            }
        }
    }
}
