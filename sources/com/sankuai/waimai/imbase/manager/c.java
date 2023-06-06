package com.sankuai.waimai.imbase.manager;

import android.app.Application;
import android.content.Context;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements d {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;

    @Override // com.sankuai.waimai.imbase.manager.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1687b88bcbdd172f8912901bee98b13", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1687b88bcbdd172f8912901bee98b13")).booleanValue() : com.sankuai.waimai.imbase.manager.a.a();
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18227473e93c22b96ce671172785f6e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18227473e93c22b96ce671172785f6e5");
        } else {
            Sniffer.smell("waimai_platform", "im_switch", str, "", "");
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final boolean b() {
        return this.b;
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final boolean c() {
        return this.c;
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void b(boolean z) {
        this.c = z;
    }

    public c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a98982386b040e3532ef5abac27b8706", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a98982386b040e3532ef5abac27b8706") : a.a;
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfa4ac5aa96ebcd2c3bf9ca19120ec8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfa4ac5aa96ebcd2c3bf9ca19120ec8")).booleanValue() : com.sankuai.waimai.imbase.manager.a.d();
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89ed390f3576b86569f2eea5e3f292c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89ed390f3576b86569f2eea5e3f292c");
        } else {
            com.sankuai.waimai.imbase.manager.a.b();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e173a88e3e0b71afbad9df0b8f8cec63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e173a88e3e0b71afbad9df0b8f8cec63");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(application);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(short s, long j, long j2, short s2, String str, d.a aVar) {
        Object[] objArr = {Short.valueOf(s), new Long(j), 0L, Short.valueOf(s2), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39460174273910f452058f16116c62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39460174273910f452058f16116c62b");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(s, j, s2, str, aVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(SessionId sessionId, IMClient.g<com.sankuai.xm.im.session.entry.a> gVar) {
        Object[] objArr = {sessionId, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92212d341188b5c399df0f8ff91facee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92212d341188b5c399df0f8ff91facee");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(sessionId, gVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e192feeaccd2a0ecb59c5027cdbc3762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e192feeaccd2a0ecb59c5027cdbc3762");
        } else {
            com.sankuai.waimai.imbase.manager.a.e();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f094066c4b9154ce5740af849b07eb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f094066c4b9154ce5740af849b07eb5d");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(d.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40f9f5d5bcb817247779c5167ad25cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40f9f5d5bcb817247779c5167ad25cc");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(cVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(short s, d.c cVar) {
        Object[] objArr = {Short.valueOf(s), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911529f7ae952f40736cdd55cd056431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911529f7ae952f40736cdd55cd056431");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(s, cVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(short s, d.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c762af6f79bd865a3dc1d6c8d365962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c762af6f79bd865a3dc1d6c8d365962");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(s, aVar);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(short s, d.InterfaceC0965d interfaceC0965d) {
        Object[] objArr = {Short.valueOf(s), interfaceC0965d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715140d6b4a222556c97914298fa193a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715140d6b4a222556c97914298fa193a");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(s, interfaceC0965d);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void b(short s, d.InterfaceC0965d interfaceC0965d) {
        Object[] objArr = {Short.valueOf(s), interfaceC0965d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4919031ea9507ef38f7bf166099a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4919031ea9507ef38f7bf166099a18");
        } else {
            com.sankuai.waimai.imbase.manager.a.b(s, interfaceC0965d);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899c06e17bdf3baa8df5c9945819c76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899c06e17bdf3baa8df5c9945819c76e");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(z);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b149eefafc98cdcb21f110a9bc4a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b149eefafc98cdcb21f110a9bc4a68");
        } else {
            com.sankuai.waimai.imbase.manager.a.c();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(Application application, boolean z) {
        Object[] objArr = {application, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9c138dda9ef7c20875caea54024291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9c138dda9ef7c20875caea54024291");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(application, z);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d
    public final void a(short s, long j, int i, d.b bVar) {
        Object[] objArr = {Short.valueOf(s), new Long(j), Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b72ac051357bf23d5cf6bc45af41208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b72ac051357bf23d5cf6bc45af41208");
        } else {
            com.sankuai.waimai.imbase.manager.a.a(s, j, i, bVar);
        }
    }
}
