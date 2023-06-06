package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class a {
    private static a d;
    private static final Object e = new Object();
    byte[] a;
    byte[] b;
    final SharedPreferences c;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private PublicKey i;
    private final SharedPreferences j;
    private long k = 0;

    public static a a() {
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }

    private static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int read = inputStream.read();
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        try {
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream2;
                        } catch (IOException unused) {
                            return byteArrayOutputStream2;
                        }
                    }
                    byteArrayOutputStream.write(read);
                } catch (IOException unused2) {
                    return null;
                }
            } catch (IOException unused3) {
                byteArrayOutputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                throw th;
            }
        }
    }

    public static void a(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new a(context);
                }
            }
        }
    }

    private void b() {
        c();
        d();
    }

    private a(Context context) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        this.c = context.getSharedPreferences("com.x.y.1", 0);
        this.j = context.getSharedPreferences("com.x.y.2", 0);
        Integer.parseInt(this.c.getString("keyTimeout", "0"));
        this.c.getLong("createDate", 0L);
        DebugLogger.d("HttpKeyMgr", "loadKeys");
        String string = this.c.getString("sKey64", "");
        DebugLogger.d("HttpKeyMgr", "saved sKey64: " + string);
        if (!TextUtils.isEmpty(string)) {
            this.b = string.getBytes();
        }
        String string2 = this.c.getString("aKey64", "");
        DebugLogger.d("HttpKeyMgr", "saved aKey64: " + string2);
        if (!TextUtils.isEmpty(string2)) {
            this.a = string2.getBytes();
            this.g = Base64.decode(this.a, 2);
        }
        String string3 = this.c.getString("rKey64", "");
        DebugLogger.d("HttpKeyMgr", "saved rKey64: " + string3);
        if (!TextUtils.isEmpty(string3)) {
            this.h = string3.getBytes();
            this.f = Base64.decode(this.h, 2);
            DebugLogger.d("HttpKeyMgr", "saved rKey: " + new String(this.f));
        }
        if (this.f != null && this.f.length != 0) {
            if (this.g == null || this.g.length == 0) {
                this.i = b(context);
                if (this.i != null) {
                    d();
                    return;
                }
                return;
            }
            return;
        }
        this.i = b(context);
        if (this.i != null) {
            b();
            return;
        }
        this.c.edit().clear().apply();
        try {
            try {
                httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(PushConstants.URL_DOWNLOAD_PUBLIC_KEY).openConnection());
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                try {
                    httpURLConnection.setRequestMethod("GET");
                } catch (ProtocolException e2) {
                    e2.printStackTrace();
                }
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
            } catch (MalformedURLException unused) {
            }
            try {
                DebugLogger.d("HttpKeyMgr", "code = " + httpURLConnection.getResponseCode());
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    try {
                        String a = a(inputStream);
                        DebugLogger.d("HttpKeyMgr", "body = " + a);
                        if (!TextUtils.isEmpty(a)) {
                            try {
                                JSONObject jSONObject = new JSONObject(a);
                                if (jSONObject.getInt("code") == 200) {
                                    String string4 = jSONObject.getString("value");
                                    SharedPreferences.Editor edit = this.j.edit();
                                    edit.putString("publicKey", string4);
                                    edit.apply();
                                }
                            } catch (Exception e3) {
                                DebugLogger.e("HttpKeyMgr", "downloadPublicKey message error " + e3.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        httpURLConnection.disconnect();
                        throw th;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                httpURLConnection.disconnect();
                this.i = b(context);
                if (this.i != null) {
                    b();
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    private PublicKey b(Context context) {
        DebugLogger.d("HttpKeyMgr", "load publicKey from preference");
        String string = this.j.getString("publicKey", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 2)));
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvalidKeySpecException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private void c() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            this.f = keyGenerator.generateKey().getEncoded();
            this.h = Base64.encode(this.f, 2);
            DebugLogger.d("HttpKeyMgr", "***** rKey64: " + new String(this.h));
            SharedPreferences.Editor edit = this.c.edit();
            edit.putString("rKey64", new String(this.h));
            edit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, this.i);
            this.g = cipher.doFinal(this.f);
            this.a = Base64.encode(this.g, 2);
            DebugLogger.d("HttpKeyMgr", "***** aKey64: " + new String(this.a));
            SharedPreferences.Editor edit = this.c.edit();
            edit.putString("aKey64", new String(this.a));
            edit.apply();
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
        } catch (BadPaddingException e4) {
            e4.printStackTrace();
        } catch (IllegalBlockSizeException e5) {
            e5.printStackTrace();
        } catch (NoSuchPaddingException e6) {
            e6.printStackTrace();
        }
    }

    public final byte[] a(byte[] bArr) {
        if (this.f == null || this.f.length == 0) {
            DebugLogger.e("HttpKeyMgr", "rKey null!");
            return null;
        } else if (bArr == null || bArr.length == 0) {
            DebugLogger.e("HttpKeyMgr", "input null!");
            return null;
        } else {
            DebugLogger.d("HttpKeyMgr", ">>>>>>>>>> encrypt input >>>>>>>>>>\n" + new String(Base64.encode(bArr, 2)));
            DebugLogger.d("HttpKeyMgr", "<<<<<<<<<< encrypt input <<<<<<<<<<");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, new SecretKeySpec(this.f, "AES"), new IvParameterSpec(this.f));
                byte[] doFinal = cipher.doFinal(bArr);
                DebugLogger.d("HttpKeyMgr", ">>>>>>>>>> encrypt output >>>>>>>>>>\n" + new String(Base64.encode(doFinal, 2)));
                DebugLogger.d("HttpKeyMgr", "<<<<<<<<<< encrypt output <<<<<<<<<<");
                return doFinal;
            } catch (InvalidAlgorithmParameterException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return null;
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e6) {
                e6.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e7) {
                e7.printStackTrace();
                return null;
            }
        }
    }
}
