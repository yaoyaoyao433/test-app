package com.dianping.nvnetwork.tunnel.Encrypt;

import android.os.Message;
import com.dianping.nvnetwork.tunnel.Encrypt.d;
import com.dianping.nvnetwork.tunnel.protocol.SecureProtocol;
import com.dianping.nvnetwork.tunnel.tool.Log;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    a b;
    com.dianping.nvnetwork.tunnel.Encrypt.b c;
    boolean d;
    SocketSecureCell e;
    SocketSecureManager f;
    Object g;
    private d h;
    private c i;
    private long j;
    private Timer k;
    private TimerTask l;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        CREATE_KEY_REQUEST,
        SUCCESS_CREATE_KEY,
        CHANGE_KEY_REQUEST;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d48e67fe55033fe0824c1f3915065d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d48e67fe55033fe0824c1f3915065d");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c0753ff0a447e09b9b17aebb6ddcf5e", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c0753ff0a447e09b9b17aebb6ddcf5e") : Enum.valueOf(a.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a33c669656e34239663b3d3e2f698e9f", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a33c669656e34239663b3d3e2f698e9f") : values().clone());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public long f;
        public String g;
        public int h;

        public b() {
        }
    }

    public e(c cVar, d dVar) {
        Object[] objArr = {cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978ed57fb32da73ad5c5a4458aec664f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978ed57fb32da73ad5c5a4458aec664f");
            return;
        }
        this.b = a.NONE;
        this.g = new Object();
        this.j = -1L;
        this.i = cVar;
        this.h = dVar;
    }

    private b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2db29c48c3cb02282b5479043f5f9d", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2db29c48c3cb02282b5479043f5f9d");
        }
        b bVar = new b();
        try {
            if (!SecureTools.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("a")) {
                    bVar.b = jSONObject.getString("a");
                }
                if (jSONObject.has("b")) {
                    bVar.a = jSONObject.getString("b");
                }
                if (jSONObject.has("p")) {
                    bVar.c = jSONObject.getString("p");
                }
                if (jSONObject.has("t")) {
                    bVar.d = jSONObject.getString("t");
                }
                if (jSONObject.has(com.huawei.hms.opendevice.c.a)) {
                    bVar.f = jSONObject.getLong(com.huawei.hms.opendevice.c.a);
                }
                if (jSONObject.has("s")) {
                    bVar.e = jSONObject.getString("s");
                }
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    private String a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d052de1be036c770707a4b3c12ff5b6c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d052de1be036c770707a4b3c12ff5b6c");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!SecureTools.isEmpty(bVar.b)) {
                jSONObject.put("a", bVar.b);
            }
            if (!SecureTools.isEmpty(bVar.a)) {
                jSONObject.put("b", bVar.a);
            }
            if (!SecureTools.isEmpty(bVar.c)) {
                jSONObject.put("p", bVar.c);
            }
            if (!SecureTools.isEmpty(bVar.g)) {
                jSONObject.put("d", new JSONObject(bVar.g));
            }
            if (!SecureTools.isEmpty(bVar.d)) {
                jSONObject.put("t", bVar.d);
            }
            jSONObject.put("s", bVar.h);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd9800a55cb5281900eda317c33b188", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd9800a55cb5281900eda317c33b188");
            return;
        }
        this.b = a.NONE;
        this.f.setEncrypted(false);
        a(false);
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:17:0x0050, B:19:0x005e, B:21:0x0066, B:23:0x006e, B:25:0x008e, B:27:0x0096, B:29:0x00a5, B:30:0x00a9, B:33:0x00b7, B:35:0x00d2, B:36:0x0121, B:31:0x00ae, B:32:0x00b2, B:37:0x0125), top: B:44:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:17:0x0050, B:19:0x005e, B:21:0x0066, B:23:0x006e, B:25:0x008e, B:27:0x0096, B:29:0x00a5, B:30:0x00a9, B:33:0x00b7, B:35:0x00d2, B:36:0x0121, B:31:0x00ae, B:32:0x00b2, B:37:0x0125), top: B:44:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r13, com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell r14, com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.tunnel.Encrypt.e.a(int, com.dianping.nvnetwork.tunnel.Encrypt.SocketSecureCell, com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData):void");
    }

    private void a(int i, SocketSecureCell socketSecureCell, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), socketSecureCell, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b617f82de597dfbc139051abe7db7315", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b617f82de597dfbc139051abe7db7315");
            return;
        }
        try {
            Message message = new Message();
            message.what = 1;
            socketSecureCell.notifyMessage(message);
            a(true);
            SecureProtocolData secureProtocolData = new SecureProtocolData();
            secureProtocolData.flag = i;
            b bVar = new b();
            bVar.d = this.h.b;
            bVar.a = this.h.a().b;
            secureProtocolData.payload = a(bVar);
            socketSecureCell.writeSecure(secureProtocolData);
        } catch (Exception unused) {
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ed63016b8fbea424710ed0b02c77b9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ed63016b8fbea424710ed0b02c77b9");
        }
        try {
            return (this.e == null || this.e.getSecureSocketAddress() == null) ? "" : this.e.getSecureSocketAddress().getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8927ace8cf42dc37b2971d06e0f52d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8927ace8cf42dc37b2971d06e0f52d");
            return;
        }
        Log.w("SocketSecureProcess : 秘钥签名检查结果 : " + z);
        int c = (int) (c() - this.j);
        String b2 = b();
        if (this.f != null) {
            this.f.onSignB2KeyEvent(z, b2, c);
        }
    }

    private long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3ed82185770c4484907b86024d31bd", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3ed82185770c4484907b86024d31bd")).longValue() : System.currentTimeMillis();
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae3cd631012a585d38c11d32fd3e169", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae3cd631012a585d38c11d32fd3e169");
        }
        if (this.c == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("d", this.c.a);
            jSONObject.put("s", this.c.b);
            jSONObject.put("p", this.c.d);
            jSONObject.put("b", this.c.c);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eef10768d725fd47f1533a204448ee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eef10768d725fd47f1533a204448ee8");
            return;
        }
        if (this.k != null) {
            this.k.cancel();
        }
        this.k = new Timer();
        this.l = new TimerTask() { // from class: com.dianping.nvnetwork.tunnel.Encrypt.e.1
            public static ChangeQuickRedirect a;

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9035aa96fea005e387d2ea29b8456b79", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9035aa96fea005e387d2ea29b8456b79");
                    return;
                }
                synchronized (e.this.g) {
                    if (e.this.b == a.CREATE_KEY_REQUEST) {
                        e.this.b = a.NONE;
                        e.this.a(false);
                        Log.d("SocketSecureProcess : 获取秘钥超时");
                        Log.w("SocketSecureProcess : 获取秘钥超时");
                    } else if (e.this.b == a.CHANGE_KEY_REQUEST) {
                        e.this.b = a.SUCCESS_CREATE_KEY;
                        Log.d("SocketSecureProcess : 交换秘钥超时");
                        Log.w("SocketSecureProcess : 交换秘钥超时");
                    }
                }
            }
        };
        this.k.schedule(this.l, 10000L);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a16bb92fc1388eaf791dd5e4b0e017", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a16bb92fc1388eaf791dd5e4b0e017");
        } else if (this.k != null) {
            this.k.cancel();
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SocketSecureCell socketSecureCell, String str, int i) {
        Object[] objArr = {socketSecureCell, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e5299b79278fe10e458efaa808b610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e5299b79278fe10e458efaa808b610");
            return;
        }
        try {
            this.j = System.currentTimeMillis();
            this.e = socketSecureCell;
            String[] a2 = this.i.a();
            if (a2 != null && a2.length == 2) {
                this.h.c = a2[0];
                SecureProtocolData secureProtocolData = new SecureProtocolData();
                secureProtocolData.flag = i;
                b bVar = new b();
                bVar.g = d();
                bVar.c = a2[1];
                bVar.d = str;
                bVar.h = this.d ? 1 : 0;
                secureProtocolData.securePayload = a(bVar).getBytes();
                if (!socketSecureCell.writeSecure(secureProtocolData)) {
                    a();
                    return;
                }
                this.b = a.CREATE_KEY_REQUEST;
                Log.d("SocketSecureProcess : 创建秘钥请求");
                Log.w("SocketSecureProcess : 请求创建秘钥");
                e();
            }
        } catch (Exception unused) {
            Log.d("SocketSecureProcess : 创建密钥失败");
            a();
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbd28c120162f276d52b5099ebf161a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbd28c120162f276d52b5099ebf161a");
            return;
        }
        int c = (int) (c() - this.j);
        String b2 = b();
        if (this.f != null) {
            this.f.onCreateB2KeyInfoEvent(z, b2, c);
        }
        this.j = -1L;
    }

    public final synchronized void a(SocketSecureCell socketSecureCell, SecureProtocolData secureProtocolData) {
        Object[] objArr = {socketSecureCell, secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e40ebd4c9e38a41e447d6fbae88280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e40ebd4c9e38a41e447d6fbae88280");
            return;
        }
        synchronized (this.g) {
            if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.CREATE_KEY_RESPONSE.getType()) {
                a(SecureProtocol.DataPacketType.CREATE_KEY_SUCCESS.getType(), socketSecureCell, secureProtocolData);
            } else if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.KEY_SOONEXPIRE_RESPONSE.getType()) {
                Object[] objArr2 = {socketSecureCell, secureProtocolData};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5c7d23347e784d56ad9b54014d6432a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5c7d23347e784d56ad9b54014d6432a");
                } else {
                    f();
                    b a2 = a(secureProtocolData.payload);
                    if (!SecureTools.isEmpty(a2.a)) {
                        d.a b2 = this.h.b(a2.a);
                        d.a a3 = this.h.a();
                        if (b2 != null && a3 != null && b2.b.equals(a3.b) && this.b == a.SUCCESS_CREATE_KEY) {
                            Log.d("SocketSecureProcess : 秘钥快过期");
                            Log.w("SocketSecureProcess : 秘钥快过期 :tid : " + a2.d + "b2 : " + a2.a + " b2Key : " + com.dianping.nvnetwork.tunnel.tool.d.a(b2.c));
                            Object[] objArr3 = {socketSecureCell};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43f9e720c2ce222aa868bea4c0c0df3c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43f9e720c2ce222aa868bea4c0c0df3c");
                            } else {
                                this.e = socketSecureCell;
                                b bVar = new b();
                                d.a a4 = this.h.a();
                                if (a4 != null) {
                                    bVar.a = a4.b;
                                    bVar.d = this.h.b;
                                    String str = a4.c;
                                    if (!SecureTools.isEmpty(bVar.a) && !SecureTools.isEmpty(bVar.d)) {
                                        SecureProtocolData secureProtocolData2 = new SecureProtocolData();
                                        secureProtocolData2.flag = SecureProtocol.DataPacketType.CHANGE_KEY_REQUEST.getType();
                                        secureProtocolData2.isSecure = true;
                                        secureProtocolData2.securePayload = a(bVar).getBytes();
                                        if (socketSecureCell.writeSecure(secureProtocolData2)) {
                                            this.b = a.CHANGE_KEY_REQUEST;
                                            Log.d("SocketSecureProcess : 秘钥快过期，重新申请新秘钥");
                                            Log.w("SocketSecureProcess : 秘钥快过期，重新申请新秘钥 tid : " + bVar.d + " b2 : " + bVar.a + " b2Key : " + com.dianping.nvnetwork.tunnel.tool.d.a(str));
                                            e();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.CHANGE_KEY_RESPONSE.getType()) {
                Object[] objArr4 = {socketSecureCell, secureProtocolData};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1187c9e361805321a242f6c0354e84dd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1187c9e361805321a242f6c0354e84dd");
                } else {
                    f();
                    b a5 = a(new String(secureProtocolData.array));
                    if (SecureTools.isEmpty(a5.a) || SecureTools.isEmpty(a5.b) || a5.f <= 0) {
                        this.b = a.SUCCESS_CREATE_KEY;
                    } else {
                        this.h.a(a5.a, a5.b, a5.f);
                        this.f.saveSecureInfo2Local();
                        this.b = a.SUCCESS_CREATE_KEY;
                        this.f.setEncrypted(true);
                        Log.d("SocketSecureProcess : 交换秘钥成功 : " + a5.b);
                        Log.w("SocketSecureProcess : 交换秘钥成功 : tid : " + a5.d + "b2 : " + a5.a + " b2Key : " + com.dianping.nvnetwork.tunnel.tool.d.a(a5.b));
                        a(SecureProtocol.DataPacketType.CHANGE_KEY_SUCCESS.getType(), socketSecureCell, this.h.b, a5.a);
                    }
                }
            } else if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.KEY_EXPIRED_RESPONSE.getType()) {
                Object[] objArr5 = {socketSecureCell, secureProtocolData};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "57d422db75934e9f1ffc6a30c169e19a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "57d422db75934e9f1ffc6a30c169e19a");
                } else if (!SecureTools.isEmpty(secureProtocolData.payload)) {
                    b a6 = a(secureProtocolData.payload);
                    d.a a7 = this.h.a();
                    if (!SecureTools.isEmpty(this.h.b) && this.b != a.CREATE_KEY_REQUEST && !SecureTools.isEmpty(a6.a) && a7 != null && a6.a.equals(a7.b)) {
                        Log.d("SocketSecureProcess : 秘钥已过期，重新申请秘钥");
                        Log.w("SocketSecureProcess : 秘钥已过期，重新申请秘钥 过期的 tid :" + a6.d + " b2 : " + a6.a + " b2Key : " + com.dianping.nvnetwork.tunnel.tool.d.a(a7.c));
                        this.h.c(a6.a);
                        this.f.removeSecureInfo2Local();
                        this.f.setEncrypted(false);
                        a(socketSecureCell, this.h.b, SecureProtocol.DataPacketType.RECREATE_KEY_REQUEST.getType());
                    }
                }
            } else if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.RECREATE_KEY_RESPONSE.getType()) {
                a(SecureProtocol.DataPacketType.RECREATE_KEY_SUCCESS.getType(), socketSecureCell, secureProtocolData);
            } else {
                try {
                    if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.TID_NOEXIST_RESPONSE.getType()) {
                        Object[] objArr6 = {socketSecureCell, secureProtocolData};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b27fdd9da503d38f43c40453979ac1da", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b27fdd9da503d38f43c40453979ac1da");
                        } else if (!SecureTools.isEmpty(secureProtocolData.payload)) {
                            JSONObject jSONObject = new JSONObject(secureProtocolData.payload);
                            if (jSONObject.has("t") && jSONObject.getString("t").equals(this.h.b) && this.b != a.CREATE_KEY_REQUEST) {
                                Log.d("SocketSecureProcess : tid不存在，走重新申请秘钥和tid");
                                Log.w("SocketSecureProcess : tid不存在，走重新申请秘钥和tid");
                                this.b = a.NONE;
                                this.h.b();
                                this.f.removeSecureInfo2Local();
                                this.h.b = null;
                                this.f.setEncrypted(false);
                                a(socketSecureCell, (String) null, SecureProtocol.DataPacketType.CREATE_KEY_REQUEST.getType());
                            }
                        }
                    } else if (secureProtocolData.encryptFlag == SecureProtocol.DataPacketType.KEY_NOEXIST_RESPONSE.getType()) {
                        Object[] objArr7 = {socketSecureCell, secureProtocolData};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e882be30dc68b1b587308b5bead9273f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e882be30dc68b1b587308b5bead9273f");
                        } else if (!SecureTools.isEmpty(secureProtocolData.payload)) {
                            JSONObject jSONObject2 = new JSONObject(secureProtocolData.payload);
                            if (jSONObject2.has("b")) {
                                String string = jSONObject2.getString("b");
                                d.a a8 = this.h.a();
                                if (a8 != null && !SecureTools.isEmpty(string) && string.equals(a8.b) && this.b != a.CREATE_KEY_REQUEST) {
                                    Log.d("SocketSecureProcess : tid 对应的b2不存在");
                                    Log.w("SocketSecureProcess : tid 对应的b2不存在");
                                    this.e = socketSecureCell;
                                    this.b = a.NONE;
                                    this.h.b();
                                    this.f.removeSecureInfo2Local();
                                    this.f.setEncrypted(false);
                                    a(socketSecureCell, this.h.b, SecureProtocol.DataPacketType.RECREATE_KEY_REQUEST.getType());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
