package com.dianping.nvnetwork.tnold;

import android.util.Base64;
import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureManager;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("TNSecureTools");

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public byte[] b;
    }

    public static ByteBuffer a(SecureProtocolData secureProtocolData, SocketSecureManager socketSecureManager) {
        byte[] bArr;
        int length;
        int i;
        byte[] bArr2;
        byte[] bArr3;
        int length2;
        byte b2 = 0;
        Object[] objArr = {secureProtocolData, socketSecureManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "720ea589aa393a53f91964c061e6a8eb", 6917529027641081856L)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "720ea589aa393a53f91964c061e6a8eb");
        }
        if (secureProtocolData.zip < 0 || !SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag)) {
            Object[] objArr2 = {secureProtocolData, socketSecureManager};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "65a45cb7bcc695b8f69b6912de53df89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "65a45cb7bcc695b8f69b6912de53df89");
            } else {
                SocketSecureManager.a encriptData = socketSecureManager.getEncriptData(secureProtocolData.id);
                if (secureProtocolData.isSecure) {
                    if (socketSecureManager.isEncrypted() && !a(encriptData.b) && !a(encriptData.a)) {
                        secureProtocolData.payload = encriptData.a;
                    } else {
                        secureProtocolData.isSecure = false;
                    }
                }
                int length3 = a(secureProtocolData.payload) ? 0 : secureProtocolData.payload.getBytes().length;
                if (SecureTools.isEmpty(secureProtocolData.securePayload)) {
                    bArr = null;
                    length = 0;
                } else {
                    bArr = secureProtocolData.securePayload;
                    length = bArr.length;
                }
                int length4 = b(secureProtocolData.source) ? 0 : secureProtocolData.source.length;
                if (length == 0 && length4 == 0) {
                    i = 0;
                } else {
                    i = SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag) ? length + length4 + 1 : length + length4;
                }
                bArr2 = i > 0 ? new byte[i] : null;
                if (length > 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                if (length > 0 || length4 > 0) {
                    if (SecureProtocol.DataPacketType.isAddSeparator(secureProtocolData.flag)) {
                        bArr2[length] = 0;
                        if (length4 > 0) {
                            System.arraycopy(secureProtocolData.source, 0, bArr2, length + 1, length4);
                        }
                    } else if (length4 > 0) {
                        System.arraycopy(secureProtocolData.source, 0, bArr2, length, length4);
                    }
                }
                if (i > 0 && secureProtocolData.isSecure) {
                    if (!a(encriptData.b)) {
                        byte[] bArr4 = new byte[i];
                        System.arraycopy(bArr2, 0, bArr4, 0, i);
                        try {
                            bArr2 = socketSecureManager.encryptData(bArr2, encriptData.b);
                            i = bArr2.length;
                            secureProtocolData.isSecure = true;
                        } catch (Exception e) {
                            e.printStackTrace();
                            i = bArr4.length;
                            secureProtocolData.isSecure = false;
                            bArr2 = bArr4;
                        }
                    } else {
                        secureProtocolData.isSecure = false;
                    }
                }
                secureProtocolData.totalLength = length3 + i + 2;
                if (secureProtocolData.totalLength > 0) {
                    secureProtocolData.array = new byte[secureProtocolData.totalLength - 2];
                    if (length3 > 0) {
                        System.arraycopy(secureProtocolData.payload.getBytes(), 0, secureProtocolData.array, 0, length3);
                    }
                    if (i > 0) {
                        System.arraycopy(bArr2, 0, secureProtocolData.array, length3, i);
                    }
                }
                secureProtocolData.noSecureLength = length3;
            }
        } else {
            Object[] objArr3 = {secureProtocolData, socketSecureManager};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4cece455a305e6724fd41d15c85effaa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4cece455a305e6724fd41d15c85effaa");
            } else {
                SocketSecureManager.a encriptData2 = socketSecureManager.getEncriptData(secureProtocolData.id);
                if (secureProtocolData.isSecure) {
                    if (socketSecureManager.isEncrypted() && !SecureTools.isEmpty(encriptData2.b) && !SecureTools.isEmpty(encriptData2.a)) {
                        secureProtocolData.payload = encriptData2.a;
                    } else {
                        secureProtocolData.isSecure = false;
                    }
                }
                if (SecureTools.isEmpty(secureProtocolData.securePayload)) {
                    bArr3 = null;
                    length2 = 0;
                } else {
                    bArr3 = secureProtocolData.securePayload;
                    length2 = bArr3.length;
                }
                int length5 = SecureTools.isEmpty(secureProtocolData.source) ? 0 : secureProtocolData.source.length;
                int i2 = (length2 == 0 && length5 == 0) ? 0 : length2 + length5 + 4;
                bArr2 = i2 > 0 ? new byte[i2] : null;
                if (length2 > 0 || length5 > 0) {
                    byte[] array = ByteBuffer.allocate(4).putInt(length2).array();
                    System.arraycopy(array, 0, bArr2, 0, array.length);
                    System.arraycopy(bArr3, 0, bArr2, array.length, length2);
                    if (length5 > 0) {
                        System.arraycopy(secureProtocolData.source, 0, bArr2, array.length + length2, length5);
                    }
                }
                if (i2 > 0 && secureProtocolData.isSecure) {
                    if (!SecureTools.isEmpty(encriptData2.b)) {
                        byte[] bArr5 = new byte[i2];
                        System.arraycopy(bArr2, 0, bArr5, 0, i2);
                        try {
                            bArr2 = socketSecureManager.encryptData(bArr2, encriptData2.b);
                            i2 = bArr2.length;
                            secureProtocolData.isSecure = true;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            i2 = bArr5.length;
                            secureProtocolData.isSecure = false;
                            bArr2 = bArr5;
                        }
                    } else {
                        secureProtocolData.isSecure = false;
                    }
                }
                try {
                    JSONObject jSONObject = SecureTools.isEmpty(secureProtocolData.payload) ? new JSONObject() : new JSONObject(secureProtocolData.payload);
                    if (!jSONObject.has("z")) {
                        jSONObject.put("z", secureProtocolData.zip);
                    }
                    if (secureProtocolData.macFlag) {
                        byte[] a2 = a.a().a((encriptData2.b + secureProtocolData.id).getBytes(), bArr2);
                        if (a2 != null) {
                            jSONObject.put("h", Base64.encodeToString(a2, 2));
                        }
                    }
                    secureProtocolData.payload = jSONObject.toString();
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                int length6 = SecureTools.isEmpty(secureProtocolData.payload) ? 0 : secureProtocolData.payload.getBytes().length;
                secureProtocolData.totalLength = length6 + i2 + 2;
                if (secureProtocolData.totalLength > 0) {
                    secureProtocolData.array = new byte[secureProtocolData.totalLength - 2];
                    if (length6 > 0) {
                        System.arraycopy(secureProtocolData.payload.getBytes(), 0, secureProtocolData.array, 0, length6);
                    }
                    if (i2 > 0) {
                        System.arraycopy(bArr2, 0, secureProtocolData.array, length6, i2);
                    }
                }
                secureProtocolData.noSecureLength = length6;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(secureProtocolData.totalLength + 9);
        allocate.put((byte) -1);
        allocate.put((byte) 1);
        allocate.put((byte) 0);
        allocate.put((byte) secureProtocolData.flag);
        if (secureProtocolData.isSecure) {
            b2 = (secureProtocolData.macFlag && SecureProtocol.DataPacketType.HTTP_REQUEST.getType() == secureProtocolData.flag) ? (byte) 3 : (byte) 1;
        }
        allocate.put(b2);
        allocate.putInt(secureProtocolData.totalLength);
        allocate.putShort((short) secureProtocolData.noSecureLength);
        if (secureProtocolData.array != null) {
            allocate.put(secureProtocolData.array);
        }
        allocate.flip();
        return allocate;
    }

    public static b a(byte[] bArr) throws Exception {
        byte[] bArr2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        byte[] bArr3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f311f234e78a8114ce22919b2055a7d6", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f311f234e78a8114ce22919b2055a7d6");
        }
        b bVar = new b();
        if (!SecureTools.isEmpty(bArr)) {
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
            bVar.b = bArr3;
            if (!SecureTools.isEmpty(bArr2)) {
                bVar.a = new String(bArr2);
            }
            return bVar;
        }
        throw new Exception("empty response data");
    }

    public static b a(int i, boolean z, byte[] bArr, h hVar) throws Exception {
        b bVar;
        com.dianping.nvnetwork.tnold.zip.g gVar;
        com.dianping.nvnetwork.tnold.zip.g gVar2;
        com.dianping.nvnetwork.tnold.zip.a aVar;
        com.dianping.nvnetwork.tnold.zip.e eVar;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7078afdabaada927cff3ba8bb16ff6c", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7078afdabaada927cff3ba8bb16ff6c");
        }
        if (i == -1) {
            return a(bArr);
        }
        Objects.requireNonNull(bArr);
        try {
            if (!b(bArr) && bArr.length >= 4) {
                int i2 = bArr[0];
                int i3 = bArr[1];
                int i4 = bArr[2];
                int i5 = bArr[3];
                int length = bArr.length - 4;
                int i6 = ((i3 & 255) << 16) | (i2 << 24) | ((i4 & 255) << 8) | (i5 & 255);
                int i7 = length - i6;
                if (i6 >= 0 && i6 <= length && i7 >= 0 && i7 <= length) {
                    b bVar2 = new b();
                    long currentTimeMillis = System.currentTimeMillis();
                    com.dianping.nvnetwork.tnold.zip.g gVar3 = com.dianping.nvnetwork.tnold.zip.h.e;
                    if (i6 != 0) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, 4, bArr2, 0, i6);
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = h.a;
                        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "61c9067f700e699edc7c97c3b9367b00", 6917529027641081856L)) {
                            eVar = (com.dianping.nvnetwork.tnold.zip.e) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "61c9067f700e699edc7c97c3b9367b00");
                        } else {
                            if (i != 104) {
                                switch (i) {
                                    case 1:
                                    case 2:
                                        hVar.g = h.d;
                                        break;
                                    case 3:
                                    case 4:
                                        break;
                                    default:
                                        hVar.g = h.b;
                                        break;
                                }
                                eVar = hVar.g;
                            }
                            hVar.g = hVar.f;
                            eVar = hVar.g;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        bVar2.a = eVar.a(i, z, bArr2);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        gVar = eVar.a();
                        bVar = bVar2;
                        g.d(z, i, currentTimeMillis2, currentTimeMillis3, gVar.a, gVar.b);
                    } else {
                        bVar = bVar2;
                        gVar = gVar3;
                    }
                    com.dianping.nvnetwork.tnold.zip.g gVar4 = com.dianping.nvnetwork.tnold.zip.h.e;
                    if (i7 != 0) {
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = h.a;
                        gVar2 = gVar;
                        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "d9878691c3c45e83003de21155cd3f84", 6917529027641081856L)) {
                            aVar = (com.dianping.nvnetwork.tnold.zip.a) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "d9878691c3c45e83003de21155cd3f84");
                        } else {
                            if (i != 2) {
                                switch (i) {
                                    case 4:
                                    case 5:
                                        break;
                                    default:
                                        hVar.h = h.c;
                                        break;
                                }
                                aVar = hVar.h;
                            }
                            hVar.h = h.e;
                            aVar = hVar.h;
                        }
                        byte[] bArr3 = new byte[i7];
                        System.arraycopy(bArr, i6 + 4, bArr3, 0, i7);
                        long currentTimeMillis4 = System.currentTimeMillis();
                        bVar.b = aVar.a(i, z, bArr3);
                        long currentTimeMillis5 = System.currentTimeMillis();
                        com.dianping.nvnetwork.tnold.zip.g a2 = aVar.a();
                        g.e(z, i, currentTimeMillis4, currentTimeMillis5, a2.a, a2.b);
                        gVar4 = a2;
                    } else {
                        gVar2 = gVar;
                    }
                    com.dianping.nvnetwork.tnold.zip.g gVar5 = gVar2;
                    g.f(z, i, currentTimeMillis, System.currentTimeMillis(), gVar4.a + gVar5.a, gVar4.b + gVar5.b);
                    return bVar;
                }
                throw new Exception("parse error");
            }
            throw new Exception("empty response data");
        } catch (Exception e) {
            com.dianping.nvtunnelkit.logger.b.a(b, "Hpack-gzip: hpack or gzip decompress failed", e);
            if ((e instanceof com.dianping.nvnetwork.tnold.zip.hpack.e) || (e instanceof com.dianping.nvnetwork.tnold.zip.gzip.c)) {
                g.b(z, e);
            }
            throw e;
        }
    }

    private static boolean b(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "280d2dc992b42a84c233d2c2ea52483e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "280d2dc992b42a84c233d2c2ea52483e")).booleanValue() : str == null || "".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final ThreadLocal<a> b = new ThreadLocal<a>() { // from class: com.dianping.nvnetwork.tnold.l.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.ThreadLocal
            public final /* synthetic */ a initialValue() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e647e762327d6b4a16c89646b63ceac", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e647e762327d6b4a16c89646b63ceac") : new a("hmacSHA256");
            }
        };
        private final Mac c;

        private a(String str) {
            Mac mac;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55af8bd88976f6d98c648d25f63545f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55af8bd88976f6d98c648d25f63545f");
                return;
            }
            try {
                mac = Mac.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
                mac = null;
            }
            this.c = mac;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            Object[] objArr = {bArr, bArr2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d291cb6146f1f6d45e21c3a9d2bdf1c4", 6917529027641081856L)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d291cb6146f1f6d45e21c3a9d2bdf1c4");
            }
            if (bArr == null || bArr2 == null || this.c == null) {
                return null;
            }
            try {
                this.c.init(new SecretKeySpec(bArr, "hmacSHA256"));
                byte[] doFinal = this.c.doFinal(bArr2);
                new StringBuilder("sha256 elapse:").append((-System.currentTimeMillis()) + System.currentTimeMillis());
                return doFinal;
            } catch (InvalidKeyException unused) {
                return null;
            }
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2210b8d54fe5edb2ea31ad6998380f1f", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2210b8d54fe5edb2ea31ad6998380f1f") : b.get();
        }
    }
}
