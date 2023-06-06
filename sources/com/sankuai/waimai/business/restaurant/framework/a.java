package com.sankuai.waimai.business.restaurant.framework;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends Lifecycle {
    public static ChangeQuickRedirect a;
    @Nullable
    private final c b;
    @NonNull
    private final e c;
    @Nullable
    private final d d;
    @NonNull
    private final List<a> e;

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ba78a9dc38620642523806fef97613", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ba78a9dc38620642523806fef97613");
            return;
        }
        this.e = new LinkedList();
        this.b = null;
        this.c = new C0830a();
        this.d = null;
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.Lifecycle
    @CallSuper
    public final void a(i iVar, a aVar) {
        Object[] objArr = {iVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349e3121e6f9f08446cff20f28db17c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349e3121e6f9f08446cff20f28db17c3");
        } else {
            super.a(iVar, aVar);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.Lifecycle
    @CallSuper
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe9b5b515c3c1d148643c64c5c2de9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe9b5b515c3c1d148643c64c5c2de9d");
            return;
        }
        super.a(i, i2);
        if (i < i2) {
            a(i2);
            b(i2);
            return;
        }
        b(i2);
        a(i2);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b65864ce65701ce8683932a0ca41a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b65864ce65701ce8683932a0ca41a6a");
            return;
        }
        if (this.b != null) {
            this.b.a(this.h, this, i);
        }
        this.c.a(this.h, this, i);
        if (this.d != null) {
            this.d.a(this.h, this, i);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12dfcb564c92c67808e03c5105f62c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12dfcb564c92c67808e03c5105f62c36");
            return;
        }
        for (a aVar : this.e) {
            aVar.a(this.h, this, i);
        }
    }

    public final <T extends a> void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9229e42dc1feefb86a3d1fc6999d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9229e42dc1feefb86a3d1fc6999d59");
        } else if (t != null) {
            if (!t.d()) {
                t.a(this.h, this, this.g);
                this.e.add(t);
                return;
            }
            a aVar = t.i;
            if (aVar != this) {
                a(String.format("Block (%s) 添加子Block (%s) 失败：子Block已经被attach, 其parent为Block (%s)", this, t, aVar));
                return;
            }
            String format = String.format("Block (%s) 添加子Block (%s) 失败：子Block已经被attach", this, t);
            Object[] objArr2 = {format};
            ChangeQuickRedirect changeQuickRedirect2 = Lifecycle.f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "536d52fb2666ace044915d816eebfd25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "536d52fb2666ace044915d816eebfd25");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.d("", format, new Object[0]);
            }
        }
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbd8f0d4cca0bd5b3557a1b9477d579", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbd8f0d4cca0bd5b3557a1b9477d579") : this.c.e;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.framework.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0830a extends e {
        public static ChangeQuickRedirect a;

        private C0830a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796f1074e726825fbd135481635dab77", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796f1074e726825fbd135481635dab77");
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.framework.e
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ffc99f2be9d25c8acb490c7e6c2061", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ffc99f2be9d25c8acb490c7e6c2061") : a.this.a(layoutInflater, viewGroup);
        }

        @Override // com.sankuai.waimai.business.restaurant.framework.e
        public final void a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19eeeacf67a462b4c3a470f9b408e74a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19eeeacf67a462b4c3a470f9b408e74a");
                return;
            }
            a aVar = a.this;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "bf79755aedaf23bf410f6afd41696008", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "bf79755aedaf23bf410f6afd41696008");
            }
        }
    }

    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d411ae19abbbbcaacffaa053d18b2e08", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d411ae19abbbbcaacffaa053d18b2e08");
        }
        if (this.g <= 1) {
            a(this.h, this, 1);
        }
        if (!d()) {
            a(String.format("%s BaseBlock createView失败：当前没有attach，context为null，可能是因为没有调用addBlock", this));
            return null;
        }
        e eVar = this.c;
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = e.d;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "6dd3b979f0f1ff52a6d329a7bac179da", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "6dd3b979f0f1ff52a6d329a7bac179da");
        }
        if (eVar.e == null) {
            Context b = eVar.b();
            eVar.e = com.sankuai.waimai.platform.base.c.a(eVar.a(LayoutInflater.from(b), viewGroup), b, eVar.i, -4235042);
            eVar.a(eVar.e);
        }
        return eVar.e;
    }
}
