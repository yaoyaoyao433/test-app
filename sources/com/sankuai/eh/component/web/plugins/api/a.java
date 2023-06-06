package com.sankuai.eh.component.web.plugins.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private C0556a b;

    public a(C0556a c0556a) {
        Object[] objArr = {c0556a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04611c4fd94142e5c0ee554d6e6f4a9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04611c4fd94142e5c0ee554d6e6f4a9a");
        } else {
            this.b = c0556a;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90577e7fa3059ef1cf55bf1622a62f7f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90577e7fa3059ef1cf55bf1622a62f7f") : this.b.b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992073be76833ef3aef1b6590427bc49", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992073be76833ef3aef1b6590427bc49") : this.b.c;
    }

    public final JSONObject c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de51a81ad7a473a5ed58e4cc644eae0f", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de51a81ad7a473a5ed58e4cc644eae0f") : this.b.d;
    }

    public final Object d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad841a19175b6ec64c24843b3c33ea2b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad841a19175b6ec64c24843b3c33ea2b") : this.b.e;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.plugins.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0556a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public JSONObject d;
        public Object e;

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aaa1646b9abf0b9051160a3ec95da3e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aaa1646b9abf0b9051160a3ec95da3e") : new a(this);
        }
    }
}
