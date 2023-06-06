package com.sankuai.xm.login.manager.channel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e implements com.sankuai.xm.protobase.utils.b<com.sankuai.xm.login.net.mempool.heap.b> {
    public static ChangeQuickRedirect a = null;
    public static short b = 5;
    private static short h = 5;
    private static volatile boolean i = true;
    volatile short c;
    byte[] d;
    boolean e;
    com.sankuai.xm.protobase.utils.b<com.sankuai.xm.login.net.mempool.heap.b> f;
    com.sankuai.xm.protobase.utils.b<com.sankuai.xm.login.net.mempool.heap.b> g;

    public static boolean a(short s) {
        return s == 1 || s == 3 || s == 5;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb2b9a9587727d9f9850514abaa9d18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb2b9a9587727d9f9850514abaa9d18");
            return;
        }
        this.c = b;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = null;
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8939ad1c726850d4501db8e6c89d141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8939ad1c726850d4501db8e6c89d141");
            return;
        }
        com.sankuai.xm.login.d.b("CryptProcessor::setEnableDowngrade: %s", Boolean.valueOf(z));
        i = z;
    }

    public static void b(short s) {
        h = s;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bc0a7a9491a6b7074b91cb9f9779f12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bc0a7a9491a6b7074b91cb9f9779f12");
            return;
        }
        m.d().a("conn_crypt_error", new HashMap());
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        m.d().a("conn_crypt_error", hashMap);
    }

    public static void a(int i2, String str) {
        Object[] objArr = {2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29244cac8745a0f1240e944f19014075", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29244cac8745a0f1240e944f19014075");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", 2);
        if (str != null) {
            hashMap.put("msg", str);
        }
        m.d().a("conn_crypt_error", hashMap);
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final void a(byte[] bArr) {
        byte[] a2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378d0832bd058af5faa45877a572e5ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378d0832bd058af5faa45877a572e5ea");
            return;
        }
        this.c = h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae76da676ecf09dfa3b071c3f24ea5b8", 6917529027641081856L)) {
            a2 = (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae76da676ecf09dfa3b071c3f24ea5b8");
        } else {
            com.sankuai.xm.login.d.a("CryptProcessor::generateKey:" + ((int) this.c));
            short s = this.c;
            if (s == 1 || s == 5) {
                a2 = com.sankuai.xm.log.utils.a.a(UUID.randomUUID().toString().getBytes(), 256);
            } else {
                a2 = UUID.randomUUID().toString().getBytes();
            }
        }
        this.d = a2;
        this.e = false;
        this.f = null;
        this.g = null;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2186801d4076a1e7ac2ebac4990fb62c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2186801d4076a1e7ac2ebac4990fb62c");
        }
        if (this.e) {
            if (this.f == null) {
                this.f = d();
                this.f.a(this.d);
            }
            return this.f.b(bArr);
        }
        return bArr;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final com.sankuai.xm.login.net.mempool.heap.b a(com.sankuai.xm.login.net.mempool.heap.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a0896afc78b519c1e46fd982dd2a5c", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a0896afc78b519c1e46fd982dd2a5c");
        }
        if (this.e) {
            if (this.g == null) {
                this.g = d();
                this.g.a(this.d);
            }
            return this.g.a((com.sankuai.xm.protobase.utils.b<com.sankuai.xm.login.net.mempool.heap.b>) bVar);
        }
        return bVar;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fdfe5504823fd7ff498418799ce42b1", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fdfe5504823fd7ff498418799ce42b1");
        }
        if (this.e) {
            if (this.g == null) {
                this.g = d();
                this.g.a(this.d);
            }
            return this.g.c(bArr);
        }
        return bArr;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9eb4c410838a8767b4e492278b9069", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9eb4c410838a8767b4e492278b9069")).booleanValue();
        }
        if (this.e) {
            if (this.g == null) {
                this.g = d();
                this.g.a(this.d);
            }
            return c() && this.g.b();
        }
        return false;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a433abb3aa1ec332e196c1fe63035a3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a433abb3aa1ec332e196c1fe63035a3")).booleanValue() : this.e && (this.c == 1 || this.c == 5);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213a6dd93d7d4649a4d1938679f17f82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213a6dd93d7d4649a4d1938679f17f82");
            return;
        }
        com.sankuai.xm.login.d.b("ConnectionChannel::downgrade: cond:%s,%s,%s, type: %s", Boolean.valueOf(z), Boolean.valueOf(c()), Boolean.valueOf(i), Short.valueOf(h));
        if (z || (c() && i)) {
            if (h != 5) {
                if (h == 1) {
                    h = (short) 3;
                    return;
                }
                return;
            }
            h = (short) 1;
        }
    }

    private com.sankuai.xm.protobase.utils.b<com.sankuai.xm.login.net.mempool.heap.b> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e9880dc20a28ebb3c59df16e6e8e9f", 6917529027641081856L)) {
            return (com.sankuai.xm.protobase.utils.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e9880dc20a28ebb3c59df16e6e8e9f");
        }
        short s = this.c;
        if (s != 1) {
            if (s == 5) {
                return new com.sankuai.xm.protobase.utils.a(true);
            }
            return new com.sankuai.xm.protobase.utils.c();
        }
        return new com.sankuai.xm.protobase.utils.a();
    }
}
