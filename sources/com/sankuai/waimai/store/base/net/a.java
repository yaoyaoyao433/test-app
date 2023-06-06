package com.sankuai.waimai.store.base.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.v;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements h {
    public static ChangeQuickRedirect a;
    String b;

    public abstract String b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe0d1e499da75cd1dcb9082c67e37f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe0d1e499da75cd1dcb9082c67e37f6");
            return;
        }
        this.b = b();
        if (t.a(this.b)) {
            throw new RuntimeException("必须配置线上环境");
        }
    }

    @Override // com.sankuai.waimai.store.base.net.h
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98102718868f38b5df414c353d69bb24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98102718868f38b5df414c353d69bb24") : (String) v.a(new v.a<String>() { // from class: com.sankuai.waimai.store.base.net.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.v.a
            public final /* synthetic */ String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32f6ca07d9c7a7e596113352317bcfde", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32f6ca07d9c7a7e596113352317bcfde") : a.this.b;
            }

            @Override // com.sankuai.waimai.store.util.v.a
            public final /* synthetic */ String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3cbda1de49bb8113043009aa999a464", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3cbda1de49bb8113043009aa999a464");
                }
                if (!com.sankuai.waimai.store.config.k.b()) {
                    return com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), a.this.b);
                }
                return a.this.b;
            }

            @Override // com.sankuai.waimai.store.util.v.a
            public final /* synthetic */ String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "658ef6ed38c92312c26fb8aaccfee059", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "658ef6ed38c92312c26fb8aaccfee059") : a.this.b;
            }
        });
    }
}
