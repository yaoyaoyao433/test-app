package com.sankuai.waimai.alita.platform.network;

import com.google.gson.Gson;
import com.meituan.android.singleton.e;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends e<ar> {
    public static ChangeQuickRedirect e;

    public abstract String c();

    public abstract Gson d();

    @Override // com.meituan.android.singleton.e
    public final /* synthetic */ ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cacab4ab333370a0a5b377a30313ce86", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cacab4ab333370a0a5b377a30313ce86");
        }
        return new ar.a().a(c()).a(f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(d())).a(i.a("oknv")).a();
    }
}
