package com.meituan.android.privacy.impl.config;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.android.privacy.interfaces.config.b {
    public static ChangeQuickRedirect a;
    public transient boolean b;
    public transient String c;
    public transient boolean d;
    public byte e;
    public String f;
    public long g;
    public Map<String, f> h;
    public f i;
    public Set<String> j;
    public Map<String, com.meituan.android.privacy.interfaces.config.a> k;
    public String l;
    public Map<String, f> m;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc30a20c0adfa0ca4215a71d83aede74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc30a20c0adfa0ca4215a71d83aede74");
            return;
        }
        this.d = true;
        this.h = Collections.emptyMap();
        this.j = Collections.emptySet();
        this.k = Collections.emptyMap();
        this.m = Collections.emptyMap();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0b7adea94ab7e9355937072ef53d410", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0b7adea94ab7e9355937072ef53d410");
        }
        e eVar = new e();
        eVar.i = new f();
        return eVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends IllegalArgumentException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9e3bfd00252275c099a8617d2317f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9e3bfd00252275c099a8617d2317f3");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final String a(OutputStream outputStream, boolean z) throws IOException, NoSuchAlgorithmException {
        DigestOutputStream digestOutputStream;
        DataOutputStream dataOutputStream;
        MessageDigest messageDigest;
        Object[] objArr = {outputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a573ca12f26c9faeb2d107c4e147e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a573ca12f26c9faeb2d107c4e147e3");
        }
        Closeable closeable = null;
        try {
            if (z) {
                messageDigest = MessageDigest.getInstance("MD5");
                digestOutputStream = new DigestOutputStream(outputStream, messageDigest);
                try {
                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(digestOutputStream));
                } catch (Throwable th) {
                    th = th;
                    a(digestOutputStream);
                    a(closeable);
                    throw th;
                }
            } else {
                digestOutputStream = null;
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
                messageDigest = null;
            }
        } catch (Throwable th2) {
            th = th2;
            digestOutputStream = null;
        }
        try {
            a(dataOutputStream, ByteBuffer.allocate(4096));
            dataOutputStream.flush();
            if (z) {
                String a2 = i.a(messageDigest.digest());
                a(digestOutputStream);
                a(dataOutputStream);
                return a2;
            }
            a(digestOutputStream);
            a(dataOutputStream);
            return null;
        } catch (Throwable th3) {
            closeable = dataOutputStream;
            th = th3;
            a(digestOutputStream);
            a(closeable);
            throw th;
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8724e9d0ae946172977430631995a75a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8724e9d0ae946172977430631995a75a");
        }
        try {
            return a(new OutputStream() { // from class: com.meituan.android.privacy.impl.config.e.1
                @Override // java.io.OutputStream
                public final void write(int i) throws IOException {
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr) throws IOException {
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) throws IOException {
                }
            }, true);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void a(InputStream inputStream, boolean z) throws IOException {
        Object[] objArr = {inputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7eb80e0e14bef9a76a144ae9bb2b924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7eb80e0e14bef9a76a144ae9bb2b924");
            return;
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 1024));
            try {
                if (z) {
                    c(dataInputStream2, null);
                } else {
                    b(dataInputStream2, null);
                }
                try {
                    dataInputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.config.b
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199752aa863943c581fcbab00ec1bbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199752aa863943c581fcbab00ec1bbae");
            return;
        }
        dataOutput.write(new byte[]{112, 114, 105, 118, 97, 99, 121});
        dataOutput.writeByte(2);
        com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, this.f);
        dataOutput.writeLong(this.g);
        a(dataOutput, byteBuffer, this.h);
        this.i.a(dataOutput, byteBuffer);
        a(dataOutput, byteBuffer, this.j);
        f.a(dataOutput, byteBuffer, this.k);
        com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, this.l);
        a(dataOutput, byteBuffer, this.m);
    }

    private void b(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e4c0db36e901ee56eb1edceeb5b13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e4c0db36e901ee56eb1edceeb5b13b");
            return;
        }
        c(dataInput, null);
        this.l = com.meituan.android.privacy.interfaces.config.c.a(dataInput, (ByteBuffer) null);
        this.m = a(dataInput, (ByteBuffer) null);
    }

    private void c(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e0cf516e5f22d5247fb7528c3fc228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e0cf516e5f22d5247fb7528c3fc228");
            return;
        }
        byte[] bArr = new byte[7];
        dataInput.readFully(bArr);
        if (!Arrays.equals(new byte[]{112, 114, 105, 118, 97, 99, 121}, bArr)) {
            throw new a("FileConfig Magic Wrong, Please Update Privacy Plugin");
        }
        this.e = dataInput.readByte();
        if (this.e != 2) {
            throw new a("version wrong");
        }
        this.f = com.meituan.android.privacy.interfaces.config.c.a(dataInput, byteBuffer);
        this.g = dataInput.readLong();
        this.h = a(dataInput, byteBuffer);
        this.i = new f();
        this.i.b(dataInput, byteBuffer);
        this.j = d(dataInput, byteBuffer);
        this.k = f.a(dataInput, byteBuffer);
    }

    private static void a(DataOutput dataOutput, ByteBuffer byteBuffer, Set<String> set) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cfde5e60efe201daaffe6259d4ae22b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cfde5e60efe201daaffe6259d4ae22b");
            return;
        }
        dataOutput.writeInt(set.size());
        for (String str : set) {
            com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, str);
        }
    }

    private static Set<String> d(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61b7dac4e053863351167ea48dc99af2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61b7dac4e053863351167ea48dc99af2");
        }
        int readInt = dataInput.readInt();
        HashSet hashSet = new HashSet(readInt);
        for (int i = 0; i < readInt; i++) {
            hashSet.add(com.meituan.android.privacy.interfaces.config.c.a(dataInput, byteBuffer));
        }
        return hashSet;
    }

    public static void a(DataOutput dataOutput, ByteBuffer byteBuffer, Map<String, ? extends com.meituan.android.privacy.interfaces.config.b> map) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8809f6d6f31f74d46a7d39ab79efd24f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8809f6d6f31f74d46a7d39ab79efd24f");
            return;
        }
        dataOutput.writeInt(map.size());
        for (Map.Entry<String, ? extends com.meituan.android.privacy.interfaces.config.b> entry : map.entrySet()) {
            com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, entry.getKey());
            entry.getValue().a(dataOutput, byteBuffer);
        }
    }

    public static Map<String, f> a(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a39fe36e9269918cf36e6b4e83aed11d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a39fe36e9269918cf36e6b4e83aed11d");
        }
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String a2 = com.meituan.android.privacy.interfaces.config.c.a(dataInput, byteBuffer);
            f fVar = new f();
            fVar.b(dataInput, byteBuffer);
            hashMap.put(a2, fVar);
        }
        return hashMap;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7753943821c72681b42391fffd3769", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7753943821c72681b42391fffd3769");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hash", this.f);
            jSONObject.put("pollDuration", this.g);
            jSONObject.put("launchConfigs", this.h.keySet());
            jSONObject.put("notRegisteredConfigs", this.j);
            this.i.a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.k.keySet()) {
                jSONObject2.put(str, this.k.get(str).toString());
            }
            jSONObject.put("appGuardPermissions", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            for (String str2 : this.m.keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                this.m.get(str2).a(jSONObject4);
                jSONObject3.put(str2, jSONObject4);
            }
            jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, jSONObject3);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
