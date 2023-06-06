package com.sankuai.waimai.alita.persona;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    com.sankuai.waimai.alita.base.d<String, a> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b2d8b7fc4e6d23cc08989c89cc5f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b2d8b7fc4e6d23cc08989c89cc5f95");
        } else {
            this.b = new com.sankuai.waimai.alita.base.d<>();
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15ac60f05a11d83d05cdc6f53d24c686", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15ac60f05a11d83d05cdc6f53d24c686");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    @NonNull
    public static String a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "639c412641034e881aead0ebaaa6ecd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "639c412641034e881aead0ebaaa6ecd3");
        }
        return str + CommonConstant.Symbol.UNDERLINE + str2;
    }

    public final void a(@NonNull com.sankuai.waimai.alita.persona.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b52e2c53e17217c0d60ad81166e7c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b52e2c53e17217c0d60ad81166e7c71");
        } else {
            this.b.a((com.sankuai.waimai.alita.base.d<String, a>) new a(aVar));
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507b035a5a91a6f7a222f9eb4ab77a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507b035a5a91a6f7a222f9eb4ab77a1b");
            return;
        }
        Iterator<a> a2 = this.b.a();
        while (a2.hasNext()) {
            a next = a2.next();
            if (next != null) {
                ((com.sankuai.waimai.alita.persona.a) next.b).f();
            }
        }
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3678d87a07e9883a89dbc60623c66e64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3678d87a07e9883a89dbc60623c66e64");
            return;
        }
        Iterator<a> a2 = this.b.a();
        while (a2.hasNext()) {
            a next = a2.next();
            if (next != null) {
                ((com.sankuai.waimai.alita.persona.a) next.b).g();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends com.sankuai.waimai.alita.base.a<com.sankuai.waimai.alita.persona.a> {
        public static ChangeQuickRedirect c;

        public a(@NonNull com.sankuai.waimai.alita.persona.a aVar) {
            super(aVar.b(), aVar);
            Object[] objArr = {d.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e7433cfee3eb6fb459b8865a2f7251", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e7433cfee3eb6fb459b8865a2f7251");
            }
        }

        @Override // com.sankuai.waimai.alita.base.a, com.sankuai.waimai.alita.base.c
        public final boolean a(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89783b02317afad57e0ef16f2d127d39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89783b02317afad57e0ef16f2d127d39")).booleanValue() : TextUtils.equals(d.a(((com.sankuai.waimai.alita.persona.a) this.b).b(), ((com.sankuai.waimai.alita.persona.a) this.b).c()), str);
        }
    }
}
