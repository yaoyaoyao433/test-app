package com.meituan.android.legwork.common.im;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.SessionProvider;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends a {
    public static ChangeQuickRedirect e;
    private static final f g = new f();
    public d.InterfaceC0965d f;

    public static f b() {
        return g;
    }

    public final void a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17bb19f62c74cdf20ff3267ec858a028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17bb19f62c74cdf20ff3267ec858a028");
        } else if (this.f == null) {
        } else {
            com.sankuai.waimai.imbase.manager.b.a().b(s, this.f);
            this.f = null;
        }
    }

    @Override // com.meituan.android.legwork.common.im.e
    public final int a(Context context, @NonNull SessionId sessionId, SessionProvider sessionProvider) {
        Object[] objArr = {context, sessionId, sessionProvider};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971e30208fa9c735e1eb0c041fe9105f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971e30208fa9c735e1eb0c041fe9105f")).intValue() : com.sankuai.waimai.imbase.configuration.a.a().a(context, sessionId, sessionProvider);
    }

    public final void a(SessionId sessionId, @NonNull com.sankuai.xm.im.d<com.sankuai.xm.im.session.entry.a> dVar) {
        Object[] objArr = {sessionId, dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6a63f7b09951f05d7628725f1ac7f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6a63f7b09951f05d7628725f1ac7f0");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(sessionId, dVar);
        }
    }

    @Override // com.meituan.android.legwork.common.im.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6239b5edfabaae475794ec730914b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6239b5edfabaae475794ec730914b4")).booleanValue() : com.sankuai.waimai.imbase.manager.b.a().b();
    }
}
