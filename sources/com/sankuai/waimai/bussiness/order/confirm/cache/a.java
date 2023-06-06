package com.sankuai.waimai.bussiness.order.confirm.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.foundation.core.service.user.b {
    public static ChangeQuickRedirect a;
    private static a d;
    public final C0890a b;
    public boolean c;

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d358443a9978459601054e196288aa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d358443a9978459601054e196288aa8");
            return;
        }
        this.b = new C0890a();
        this.c = true;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e82243c06de1adaee1c4943420ab62db", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e82243c06de1adaee1c4943420ab62db");
        }
        if (d == null) {
            d = new a();
        }
        return d;
    }

    @Nullable
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38a42f7ad536262f1a6c3d67643b30b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38a42f7ad536262f1a6c3d67643b30b");
        }
        if (this.c) {
            return this.b.b.b(str);
        }
        return null;
    }

    @Nullable
    public final Invoice b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2167690abba305388ca4fbb2f25bee1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2167690abba305388ca4fbb2f25bee1c");
        }
        if (this.c) {
            return this.b.d.b(str);
        }
        return null;
    }

    public final void a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e252ab635cd2db42c49ee0aa073c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e252ab635cd2db42c49ee0aa073c06");
        } else {
            this.b.b.a(str, str2);
        }
    }

    public final void a(String str, @NonNull DinersOption dinersOption) {
        Object[] objArr = {str, dinersOption};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b4d3aad58d4be0db78dc7d4f64552a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b4d3aad58d4be0db78dc7d4f64552a");
        } else {
            this.b.c.a(str, dinersOption);
        }
    }

    public final void a(String str, @NonNull Invoice invoice) {
        Object[] objArr = {str, invoice};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda5fa40640f4e3713b3f58166c6c58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda5fa40640f4e3713b3f58166c6c58b");
        } else {
            this.b.d.a(str, invoice);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff126b6ef73f2a5ff5d242653092932a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff126b6ef73f2a5ff5d242653092932a");
        } else {
            this.b.b.b();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fb98c414b733df0195f56ce4d07b64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fb98c414b733df0195f56ce4d07b64");
        } else {
            this.b.c.b();
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89a9f2491fe2cca61bd2a4797a4f740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89a9f2491fe2cca61bd2a4797a4f740");
        } else if (this.b.d.a(str)) {
            this.b.d.c(str);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7551b7d9fa8ca3c80a0c60a496b9478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7551b7d9fa8ca3c80a0c60a496b9478");
        } else {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1206d679513d2bd0804ddb2a94153e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1206d679513d2bd0804ddb2a94153e");
        } else if (aVar == b.a.LOGOUT) {
            d();
            com.sankuai.waimai.platform.domain.manager.location.a.c();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0890a {
        public static ChangeQuickRedirect a;
        public c<String, String> b;
        public c<String, DinersOption> c;
        c<String, Invoice> d;

        private C0890a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851d467d681cd09fdbc1070686bbfeda", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851d467d681cd09fdbc1070686bbfeda");
                return;
            }
            this.b = new c<>(GlobalCartManager.getInstance().getPoiIdTab());
            this.c = new c<>(GlobalCartManager.getInstance().getPoiIdTab());
            this.d = new c<>(GlobalCartManager.getInstance().getPoiIdTab());
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69258bf60b7447e79f0e7d8a760fef64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69258bf60b7447e79f0e7d8a760fef64");
                return;
            }
            this.b.b();
            this.c.b();
            this.d.b();
        }
    }
}
