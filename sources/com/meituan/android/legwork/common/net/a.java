package com.meituan.android.legwork.common.net;

import com.google.gson.GsonBuilder;
import com.meituan.android.legwork.common.util.g;
import com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil;
import com.meituan.android.legwork.net.util.c;
import com.meituan.android.legwork.net.util.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.i;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends com.meituan.android.legwork.net.a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.legwork.net.a
    public final i.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412876e2f4014b6534eccf38f118b5df", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412876e2f4014b6534eccf38f118b5df") : com.sankuai.meituan.retrofit2.converter.gson.a.a(new GsonBuilder().setLenient().registerTypeAdapterFactory(new BaseEntityTypeAdapterFactory()).create());
    }

    @Override // com.meituan.android.legwork.net.a
    public final aj a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe63d4fbb6277710f471d55826be4e31", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe63d4fbb6277710f471d55826be4e31");
        }
        Object[] objArr2 = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "db5b31aa60c94715cebc1ff8ce117ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "db5b31aa60c94715cebc1ff8ce117ec9");
        }
        aj a2 = ajVar.a().b("M-TraceId", d.a()).b("content-type", "application/x-www-form-urlencoded;charset=utf-8").b("token", com.meituan.android.legwork.common.user.a.a().f()).b(c.a(ajVar.b())).a();
        if (g.a().i) {
            a2 = LegworkEncryptUtil.handleEncrypt(a2);
        }
        return c.a(a2);
    }

    @Override // com.meituan.android.legwork.net.a
    public final a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29e8562826153fcee542db7d21e5dc6", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29e8562826153fcee542db7d21e5dc6") : com.meituan.android.singleton.i.a("oknv");
    }
}
