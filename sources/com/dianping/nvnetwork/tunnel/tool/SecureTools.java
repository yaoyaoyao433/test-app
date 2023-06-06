package com.dianping.nvnetwork.tunnel.tool;

import android.util.Base64;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SecureTools {
    private static final int Protocol_Model = 0;
    private static final int Protocol_Version = 1;
    private static com.dianping.nvnetwork.tunnel.tool.a arrayPool = new com.dianping.nvnetwork.tunnel.tool.a(5000);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes.dex */
    public static class ParseData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public byte[] rsp;
        public String secureLoad;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final ThreadLocal<a> c = new ThreadLocal<a>() { // from class: com.dianping.nvnetwork.tunnel.tool.SecureTools.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.ThreadLocal
            public final /* synthetic */ a initialValue() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947301d410f3e5a45e4111c5c8a03016", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947301d410f3e5a45e4111c5c8a03016") : new a("hmacSHA256");
            }
        };
        private final Mac b;

        private a(String str) {
            Mac mac;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42f4ee125084314e34da94ae50f8b6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42f4ee125084314e34da94ae50f8b6d");
                return;
            }
            try {
                mac = Mac.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
                mac = null;
            }
            this.b = mac;
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3447948b86357370d5065a1c7539ff2", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3447948b86357370d5065a1c7539ff2") : c.get());
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            Object[] objArr = {bArr, bArr2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d2bb7facc41ad2ff662b4f4b579553", 6917529027641081856L)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d2bb7facc41ad2ff662b4f4b579553");
            }
            if (bArr == null || bArr2 == null || this.b == null) {
                return null;
            }
            try {
                this.b.init(new SecretKeySpec(bArr, "hmacSHA256"));
                return this.b.doFinal(bArr2);
            } catch (InvalidKeyException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x005b -> B:35:0x005e). Please submit an issue!!! */
    private static byte[] compress(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94ee299c2ee218dc2296c2a8f56f27af", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94ee299c2ee218dc2296c2a8f56f27af");
        }
        if (isEmpty(bArr)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            gZIPOutputStream.write(bArr);
            try {
                gZIPOutputStream.close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            byteArrayOutputStream.close();
        } catch (IOException e4) {
            e = e4;
            gZIPOutputStream2 = gZIPOutputStream;
            e.printStackTrace();
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void createCompressedData(SecureProtocolData secureProtocolData, SocketSecureManager socketSecureManager) {
        byte[] compress;
        int length;
        Object[] objArr = {secureProtocolData, socketSecureManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85bdfb141de6850c3ff6476ebbd3e9e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85bdfb141de6850c3ff6476ebbd3e9e7");
            return;
        }
        int i = -1;
        SocketSecureManager.a encriptData = socketSecureManager.getEncriptData(secureProtocolData.id);
        if (secureProtocolData.isSecure) {
            if (!socketSecureManager.isEncrypted() || isEmpty(encriptData.b) || isEmpty(encriptData.a)) {
                secureProtocolData.isSecure = false;
            } else {
                secureProtocolData.payload = encriptData.a;
            }
        }
        if (isEmpty(secureProtocolData.securePayload)) {
            compress = null;
            length = 0;
        } else {
            compress = secureProtocolData.zip == 0 ? secureProtocolData.securePayload : (secureProtocolData.zip == 1 || secureProtocolData.zip == 2) ? compress(secureProtocolData.securePayload) : null;
            length = compress.length;
        }
        if (isEmpty(secureProtocolData.source)) {
            i = 0;
        } else if (secureProtocolData.zip == 1 || secureProtocolData.zip == 0) {
            i = secureProtocolData.source.length;
        } else if (secureProtocolData.zip == 2) {
            byte[] compress2 = compress(secureProtocolData.source);
            secureProtocolData.source = compress2;
            i = compress2.length;
        }
        int i2 = (length == 0 && i == 0) ? 0 : length + i + 4;
        byte[] bArr = i2 > 0 ? new byte[i2] : null;
        if (length > 0 || i > 0) {
            byte[] array = ByteBuffer.allocate(4).putInt(length).array();
            System.arraycopy(array, 0, bArr, 0, array.length);
            System.arraycopy(compress, 0, bArr, array.length, length);
            if (i > 0) {
                System.arraycopy(secureProtocolData.source, 0, bArr, array.length + length, i);
            }
        }
        if (i2 > 0 && secureProtocolData.isSecure) {
            if (isEmpty(encriptData.b)) {
                secureProtocolData.isSecure = false;
            } else {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                try {
                    bArr = socketSecureManager.encryptData(bArr, encriptData.b);
                    i2 = bArr.length;
                    secureProtocolData.isSecure = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    i2 = bArr2.length;
                    secureProtocolData.isSecure = false;
                    bArr = bArr2;
                }
            }
        }
        try {
            JSONObject jSONObject = isEmpty(secureProtocolData.payload) ? new JSONObject() : new JSONObject(secureProtocolData.payload);
            if (!jSONObject.has("z")) {
                jSONObject.put("z", secureProtocolData.zip);
            }
            if (secureProtocolData.macFlag) {
                byte[] a2 = a.a().a((encriptData.b + secureProtocolData.id).getBytes(), bArr);
                new StringBuilder("mac elapse:").append((-System.currentTimeMillis()) + System.currentTimeMillis());
                if (a2 != null) {
                    jSONObject.put("h", Base64.encodeToString(a2, 2));
                }
            }
            secureProtocolData.payload = jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        int length2 = isEmpty(secureProtocolData.payload) ? 0 : secureProtocolData.payload.getBytes().length;
        secureProtocolData.totalLength = length2 + i2 + 2;
        if (secureProtocolData.totalLength > 0) {
            secureProtocolData.array = new byte[secureProtocolData.totalLength - 2];
            if (length2 > 0) {
                System.arraycopy(secureProtocolData.payload.getBytes(), 0, secureProtocolData.array, 0, length2);
            }
            if (i2 > 0) {
                System.arraycopy(bArr, 0, secureProtocolData.array, length2, i2);
            }
        }
        secureProtocolData.noSecureLength = length2;
    }

    public static void createProtocolData(SecureProtocolData secureProtocolData, SocketSecureManager socketSecureManager) {
        byte[] bArr;
        Object[] objArr = {secureProtocolData, socketSecureManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f0e47890bbbac2d513266ac5b501be3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f0e47890bbbac2d513266ac5b501be3");
        } else if (secureProtocolData.zip >= 0 && SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag)) {
            createCompressedData(secureProtocolData, socketSecureManager);
        } else {
            SocketSecureManager.a encriptData = socketSecureManager.getEncriptData(secureProtocolData.id);
            if (secureProtocolData.isSecure) {
                if (!socketSecureManager.isEncrypted() || isEmpty(encriptData.b) || isEmpty(encriptData.a)) {
                    secureProtocolData.isSecure = false;
                } else {
                    secureProtocolData.payload = encriptData.a;
                }
            }
            int length = isEmpty(secureProtocolData.payload) ? 0 : secureProtocolData.payload.getBytes().length;
            int length2 = isEmpty(secureProtocolData.securePayload) ? 0 : secureProtocolData.securePayload.length;
            int length3 = isEmpty(secureProtocolData.source) ? 0 : secureProtocolData.source.length;
            int i = (length2 == 0 && length3 == 0) ? 0 : SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag) ? length2 + length3 + 1 : length2 + length3;
            byte[] bArr2 = i > 0 ? new byte[i] : null;
            if (length2 > 0) {
                System.arraycopy(secureProtocolData.securePayload, 0, bArr2, 0, length2);
            }
            if (length2 > 0 || length3 > 0) {
                if (SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag)) {
                    bArr2[length2] = 0;
                    if (length3 > 0) {
                        bArr = secureProtocolData.source;
                        length2++;
                        System.arraycopy(bArr, 0, bArr2, length2, length3);
                    }
                } else if (length3 > 0) {
                    bArr = secureProtocolData.source;
                    System.arraycopy(bArr, 0, bArr2, length2, length3);
                }
            }
            if (i > 0 && secureProtocolData.isSecure) {
                if (isEmpty(encriptData.b)) {
                    secureProtocolData.isSecure = false;
                } else {
                    byte[] bArr3 = new byte[i];
                    System.arraycopy(bArr2, 0, bArr3, 0, i);
                    try {
                        bArr2 = socketSecureManager.encryptData(bArr2, encriptData.b);
                        i = bArr2.length;
                        secureProtocolData.isSecure = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        i = bArr3.length;
                        secureProtocolData.isSecure = false;
                        bArr2 = bArr3;
                    }
                }
            }
            secureProtocolData.totalLength = length + i + 2;
            if (secureProtocolData.totalLength > 0) {
                secureProtocolData.array = new byte[secureProtocolData.totalLength - 2];
                if (length > 0) {
                    System.arraycopy(secureProtocolData.payload.getBytes(), 0, secureProtocolData.array, 0, length);
                }
                if (i > 0) {
                    System.arraycopy(bArr2, 0, secureProtocolData.array, length, i);
                }
            }
            secureProtocolData.noSecureLength = length;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.dianping.nvnetwork.tunnel.tool.a] */
    private static byte[] decompress(byte[] bArr) {
        byte[] bArr2;
        IOException e;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        ?? isSupport = PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24e43741c4110abf8d0c787bcfb7878e", 6917529027641081856L);
        if (isSupport != 0) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24e43741c4110abf8d0c787bcfb7878e");
        }
        ?? isEmpty = isEmpty(bArr);
        try {
            if (isEmpty == 0) {
                try {
                    isEmpty = new GZIPInputStream(new ByteArrayInputStream(bArr));
                    try {
                        isSupport = new ByteArrayOutputStream(16384);
                    } catch (IOException e2) {
                        bArr2 = null;
                        e = e2;
                        isSupport = 0;
                    } catch (Throwable th) {
                        th = th;
                        isSupport = 0;
                    }
                    try {
                        bArr2 = arrayPool.a(4096);
                        while (true) {
                            try {
                                int read = isEmpty.read(bArr2);
                                if (read <= 0) {
                                    break;
                                }
                                isSupport.write(bArr2, 0, read);
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                if (bArr2 != null) {
                                    arrayPool.a(bArr2);
                                }
                                if (isEmpty != 0) {
                                    try {
                                        isEmpty.close();
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (isSupport != 0) {
                                    try {
                                        isSupport.close();
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                return bArr;
                            }
                        }
                        isEmpty.close();
                        isSupport.close();
                        byte[] byteArray = isSupport.toByteArray();
                        if (bArr2 != null) {
                            arrayPool.a(bArr2);
                        }
                        try {
                            isEmpty.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        try {
                            isSupport.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e8) {
                        bArr2 = null;
                        e = e8;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r2 != 0) {
                            arrayPool.a(r2);
                        }
                        if (isEmpty != 0) {
                            try {
                                isEmpty.close();
                            } catch (Exception e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (isSupport != 0) {
                            try {
                                isSupport.close();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    isSupport = 0;
                    bArr2 = null;
                    e = e11;
                    isEmpty = 0;
                } catch (Throwable th3) {
                    th = th3;
                    isEmpty = 0;
                    isSupport = 0;
                }
            }
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            r2 = changeQuickRedirect2;
        }
    }

    public static ByteBuffer getProtocolData(SecureProtocolData secureProtocolData, SocketSecureManager socketSecureManager) {
        Object[] objArr = {secureProtocolData, socketSecureManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be5ccc756cea7e7d7659463a6cf274ac", 6917529027641081856L)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be5ccc756cea7e7d7659463a6cf274ac");
        }
        createProtocolData(secureProtocolData, socketSecureManager);
        ByteBuffer allocate = ByteBuffer.allocate(secureProtocolData.totalLength + 9);
        allocate.put((byte) -1);
        allocate.put((byte) 1);
        allocate.put((byte) 0);
        allocate.put((byte) secureProtocolData.flag);
        allocate.put(secureProtocolData.isSecure ? (secureProtocolData.macFlag && SecureProtocol.DataPacketType.HTTP_REQUEST.getType() == secureProtocolData.flag) ? (byte) 3 : (byte) 1 : (byte) 0);
        allocate.putInt(secureProtocolData.totalLength);
        allocate.putShort((short) secureProtocolData.noSecureLength);
        if (secureProtocolData.array != null) {
            allocate.put(secureProtocolData.array);
        }
        allocate.flip();
        return allocate;
    }

    public static boolean isEmpty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7b74ab711120ec63681ff819104517e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7b74ab711120ec63681ff819104517e")).booleanValue() : str == null || "".equals(str);
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static ParseData parseData(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7dcda2fb7fea5160f14806292f4c7bce", 6917529027641081856L)) {
            return (ParseData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7dcda2fb7fea5160f14806292f4c7bce");
        }
        if (i == -1) {
            return parseData(bArr);
        }
        ParseData parseData = new ParseData();
        if (!isEmpty(bArr) && bArr.length >= 4) {
            int i2 = bArr[0];
            int i3 = bArr[1];
            int i4 = bArr[2];
            int i5 = bArr[3];
            int length = bArr.length - 4;
            int i6 = (i2 << 24) | ((i3 & 255) << 16) | ((i4 & 255) << 8) | (i5 & 255);
            int i7 = length - i6;
            if (i6 >= 0 && i6 <= length && i7 >= 0 && i7 <= length) {
                if (i6 != 0) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, 4, bArr2, 0, i6);
                    try {
                        parseData.secureLoad = i == 0 ? new String(bArr2) : new String(decompress(bArr2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    System.arraycopy(bArr, i6 + 4, bArr3, 0, i7);
                    if (i == 1 || i == 0) {
                        parseData.rsp = bArr3;
                    } else if (i == 2) {
                        try {
                            parseData.rsp = decompress(bArr3);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        Log.d("Parse Error , zip is :" + i);
                    }
                }
            }
        }
        return parseData;
    }

    private static ParseData parseData(byte[] bArr) {
        byte[] bArr2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        byte[] bArr3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "130209b95aa94fe6171a4c5e6a3ac25b", 6917529027641081856L)) {
            return (ParseData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "130209b95aa94fe6171a4c5e6a3ac25b");
        }
        ParseData parseData = new ParseData();
        if (!isEmpty(bArr)) {
            int length = bArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length && bArr[i2] != 0; i2++) {
                i++;
            }
            int length2 = (bArr.length - i) - 1;
            if (i > 0) {
                bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
            } else {
                bArr2 = null;
            }
            if (length2 > 0) {
                bArr3 = new byte[length2];
                System.arraycopy(bArr, i + 1, bArr3, 0, length2);
            }
            parseData.rsp = bArr3;
            if (!isEmpty(bArr2)) {
                parseData.secureLoad = new String(bArr2);
            }
        }
        return parseData;
    }

    public static String[] getRSAKeys() throws Exception {
        Object[] objArr;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b810a8269bfada56bbf667cf20681cff", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b810a8269bfada56bbf667cf20681cff");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "69e681e52e6a55051cd8ceece54b286a", 6917529027641081856L)) {
            objArr = (Object[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "69e681e52e6a55051cd8ceece54b286a");
        } else {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024, new SecureRandom());
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            objArr = new Object[]{((RSAPrivateKey) generateKeyPair.getPrivate()).getEncoded(), ((RSAPublicKey) generateKeyPair.getPublic()).getEncoded()};
        }
        String[] strArr = new String[2];
        if (objArr != null && objArr.length == 2) {
            strArr[0] = encryptBASE64((byte[]) objArr[0]);
            strArr[1] = encryptBASE64((byte[]) objArr[1]);
        }
        if (isEmpty(strArr[0]) || isEmpty(strArr[1])) {
            throw new Exception("Get RSA Error");
        }
        return strArr;
    }

    public static byte[] decryptBASE64(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "508bb066bb05ae464d97337b70956ab7", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "508bb066bb05ae464d97337b70956ab7");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d636d6cd3e00e3650afbfbe1e65ac001", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d636d6cd3e00e3650afbfbe1e65ac001") : Base64.decode(str, 0);
    }

    public static String encryptBASE64(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37dd20fd95ad2db4ae244b128bb705fa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37dd20fd95ad2db4ae244b128bb705fa");
        }
        Object[] objArr2 = {bArr};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3106213fcd72e2219dfd226de071a7e5", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3106213fcd72e2219dfd226de071a7e5") : Base64.encodeToString(bArr, 0);
    }

    public static byte[] decryptDataByPrivateKey(byte[] bArr, byte[] bArr2) throws Exception {
        byte[] doFinal;
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f80e14ea69706640e8f485c4f066b431", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f80e14ea69706640e8f485c4f066b431");
        }
        if (!isEmpty(bArr) && !isEmpty(bArr2)) {
            Object[] objArr2 = {bArr, bArr2};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "05fefbe1beda0d408548ebc61a0846e4", 6917529027641081856L)) {
                doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "05fefbe1beda0d408548ebc61a0846e4");
            } else {
                PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, generatePrivate);
                doFinal = cipher.doFinal(bArr);
            }
            if (!isEmpty(doFinal)) {
                return doFinal;
            }
        }
        return null;
    }

    public static byte[] decryptDataByKey(byte[] bArr, byte[] bArr2) throws Exception {
        byte[] doFinal;
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e453d0682843564d6fbe114768a06d07", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e453d0682843564d6fbe114768a06d07");
        }
        if (isEmpty(bArr2) || isEmpty(bArr)) {
            return null;
        }
        Object[] objArr2 = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "f7a471aa6ce2c3ab09d975bac8d088d0", 6917529027641081856L)) {
            doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "f7a471aa6ce2c3ab09d975bac8d088d0");
        } else {
            Key a2 = c.a(bArr2);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, a2);
            doFinal = cipher.doFinal(bArr);
        }
        return doFinal;
    }

    public static byte[] encryptDataByKey(byte[] bArr, byte[] bArr2) throws Exception {
        byte[] doFinal;
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54a95d5aa38e7a0830ecceae27ad7e55", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54a95d5aa38e7a0830ecceae27ad7e55");
        }
        if (isEmpty(bArr2) || isEmpty(bArr)) {
            return null;
        }
        Object[] objArr2 = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "791dd5351de3cfac5e41752ae0c020dc", 6917529027641081856L)) {
            doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "791dd5351de3cfac5e41752ae0c020dc");
        } else {
            Key a2 = c.a(bArr2);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, a2);
            doFinal = cipher.doFinal(bArr);
        }
        return doFinal;
    }
}
