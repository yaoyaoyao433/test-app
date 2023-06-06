package com.sankuai.xm.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.j;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.service.n;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.vcard.d;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import com.sankuai.xm.imui.session.SessionProvider;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.login.b;
import com.sankuai.xm.network.setting.e;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private static a b;

    @Override // com.sankuai.xm.base.init.a
    public final void a(f fVar) {
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(f fVar) {
    }

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "IMKit";
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(f fVar) {
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(f fVar) {
    }

    public a() {
        super(6);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fdb690a1954046eaad989121ad6c971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fdb690a1954046eaad989121ad6c971");
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48ede9b41f14d55007891177f5b15815", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48ede9b41f14d55007891177f5b15815");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        b.q();
        return b;
    }

    @Deprecated
    public final void a(Context context, short s, short s2, String str, e eVar) {
        Object[] objArr = {context, (short) 3, (short) -1, str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c49b24762a6b564903c923af08518564", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c49b24762a6b564903c923af08518564");
            return;
        }
        f.m().b((short) -1).a(str);
        com.sankuai.xm.im.b bVar = new com.sankuai.xm.im.b();
        bVar.b = eVar;
        a(context, (short) 3, (int) j.a((short) 3), bVar);
    }

    private boolean a(Context context, short s, int i, com.sankuai.xm.im.b bVar) {
        Object[] objArr = {context, Short.valueOf(s), Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7a5223b38125e3c911fdfddf756fc6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7a5223b38125e3c911fdfddf756fc6")).booleanValue();
        }
        f.m().a(context).a(s).b(i).a(bVar.a()).a(com.sankuai.xm.im.b.class, bVar);
        return e(f.m());
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e55cedd5731df2b9e4a3e117541f18", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e55cedd5731df2b9e4a3e117541f18") : com.sankuai.xm.base.util.b.a(IMUIManager.a());
    }

    @Deprecated
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e125e01cb0aaf51cbc99842c00646822", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e125e01cb0aaf51cbc99842c00646822")).booleanValue() : p();
    }

    public final void a(Map<c.b, c.a> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b365efea33c1d8ea43af5e2bf8889c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b365efea33c1d8ea43af5e2bf8889c5f");
        } else {
            IMClient.a().a(map);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6522f60f20aa394d8b27be3eec158ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6522f60f20aa394d8b27be3eec158ee");
        } else {
            IMUIManager.a().a(str, str2);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4207115f9bf1099cc1f4b5a187e4e66", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4207115f9bf1099cc1f4b5a187e4e66")).booleanValue();
        }
        if (IMClient.a().h() == null) {
            return false;
        }
        return IMClient.a().h().l();
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce8996e146476c4dfbc2c4ef6e0f836", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce8996e146476c4dfbc2c4ef6e0f836")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        IMClient.a().a(str);
        return true;
    }

    public final int a(Context context, @NonNull SessionId sessionId, SessionProvider sessionProvider, SessionParams sessionParams) {
        Object[] objArr = {context, sessionId, sessionProvider, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149bfda20b253a4c2c41ea88e9860d08", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149bfda20b253a4c2c41ea88e9860d08")).intValue() : IMUIManager.a().a(context, sessionId, sessionProvider, sessionParams);
    }

    public final void a(short s, com.sankuai.xm.im.desensitization.c cVar) {
        Object[] objArr = {Short.valueOf(s), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c62e33e047822e9eb13c1f0738b6043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c62e33e047822e9eb13c1f0738b6043");
        } else {
            com.sankuai.xm.im.desensitization.a.a().a(s, cVar);
        }
    }

    public final void a(@NonNull d dVar, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6404c55d1002e938ca7d41b0415b82d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6404c55d1002e938ca7d41b0415b82d5");
        } else {
            IMUIManager.a().a(dVar, aVar);
        }
    }

    public final void a(IMMessage iMMessage, boolean z, IMClient.g<Integer> gVar) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a28bd7cdbbb468fa547e2c987ac81f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a28bd7cdbbb468fa547e2c987ac81f");
        } else if (iMMessage == null) {
            if (gVar != null) {
                gVar.a(10011);
            }
        } else {
            int a2 = IMUIManager.a().a(iMMessage, z, gVar);
            if (a2 == 0 || gVar == null) {
                return;
            }
            gVar.a(Integer.valueOf(a2));
        }
    }

    public final void a(short s, @StyleRes int i) {
        Object[] objArr = {Short.valueOf(s), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072f7f99952418c45b493ff3362720b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072f7f99952418c45b493ff3362720b8");
        } else {
            com.sankuai.xm.imui.theme.c.a().a(s, i);
        }
    }

    public final void a(short s, com.sankuai.xm.imui.theme.b bVar) {
        Object[] objArr = {Short.valueOf(s), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03207443d0ac6a35320341385bff82ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03207443d0ac6a35320341385bff82ac");
        } else {
            com.sankuai.xm.imui.theme.c.a().a(s, bVar);
        }
    }

    public final void a(SessionId sessionId, com.sankuai.xm.im.a<List<AtMeInfo>> aVar) {
        Object[] objArr = {sessionId, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec6d34c0691ff283d73597896e350c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec6d34c0691ff283d73597896e350c4");
        } else if (!d()) {
            com.sankuai.xm.imui.common.util.d.d("IMKit is uninitialized", new Object[0]);
            aVar.onFailure(10023, "未初始化");
        } else {
            try {
                ((com.sankuai.xm.ui.service.c) a(com.sankuai.xm.ui.service.c.class)).a(sessionId, aVar);
            } catch (n e) {
                com.sankuai.xm.imui.common.util.d.d("ServiceNotAvailableException:" + e.getMessage(), new Object[0]);
            }
        }
    }

    @Nullable
    public final <T> T a(Class<T> cls) throws n {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa67b8de74394b85eaadab3431d1b72", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa67b8de74394b85eaadab3431d1b72");
        }
        T t = (T) m.b(cls);
        if ((t instanceof com.sankuai.xm.group.b) && !d() && IMUIManager.a().e() == 0) {
            throw new n("service is not available");
        }
        return t;
    }
}
