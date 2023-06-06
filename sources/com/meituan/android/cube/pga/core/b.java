package com.meituan.android.cube.pga.core;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.cube.core.f;
import com.meituan.android.cube.core.g;
import com.meituan.android.cube.pga.common.j;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b extends g {
    public static ChangeQuickRedirect a;
    protected a f;

    public abstract a h();

    public b() {
        super(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfb957af22e74d6b6b5e076284e8719", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfb957af22e74d6b6b5e076284e8719");
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public void a(@NonNull FragmentActivity fragmentActivity, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e1f42d0f380b7e8defe1c7cd9e7596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e1f42d0f380b7e8defe1c7cd9e7596");
            return;
        }
        this.f = (a) b(fragmentActivity, bundle);
        this.c = g();
        if ((this.c instanceof com.meituan.android.cube.pga.block.a) && (this.f instanceof a)) {
            this.f.g = (com.meituan.android.cube.pga.block.a) this.c;
        }
        if (this.c != null) {
            this.c.a(this.f, 2);
        }
        if (this.c != null) {
            fragmentActivity.setContentView(this.c.i());
        }
        this.f.h.a((j<Bundle>) bundle);
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6113947c1b7680a9e12c73c69556bd49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6113947c1b7680a9e12c73c69556bd49");
            return;
        }
        super.a();
        this.f.i.a((j<Boolean>) Boolean.TRUE);
        if (this.f.j.a().booleanValue()) {
            this.f.j.a((j<Boolean>) Boolean.FALSE);
        }
        if (this.f.l.a().booleanValue()) {
            this.f.l.a((j<Boolean>) Boolean.FALSE);
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e87a8d8aa533cf035bf31c402531174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e87a8d8aa533cf035bf31c402531174");
            return;
        }
        super.b();
        this.f.k.a((j<Boolean>) Boolean.TRUE);
        if (this.f.j.a().booleanValue()) {
            this.f.j.a((j<Boolean>) Boolean.FALSE);
        }
        if (this.f.l.a().booleanValue()) {
            this.f.l.a((j<Boolean>) Boolean.FALSE);
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f144748edb73e58b99a671b6f96b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f144748edb73e58b99a671b6f96b83");
            return;
        }
        super.c();
        this.f.j.a((j<Boolean>) Boolean.TRUE);
        if (this.f.i.a().booleanValue()) {
            this.f.i.a((j<Boolean>) Boolean.FALSE);
        }
        if (this.f.k.a().booleanValue()) {
            this.f.k.a((j<Boolean>) Boolean.FALSE);
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667948143367a1535ed48753bbe4046d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667948143367a1535ed48753bbe4046d");
            return;
        }
        super.d();
        this.f.l.a((j<Boolean>) Boolean.TRUE);
        if (this.f.i.a().booleanValue()) {
            this.f.i.a((j<Boolean>) Boolean.FALSE);
        }
        if (this.f.k.a().booleanValue()) {
            this.f.k.a((j<Boolean>) Boolean.FALSE);
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb6e8b53ae729f01a1a72b93d9642c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb6e8b53ae729f01a1a72b93d9642c9");
            return;
        }
        if (this.c != null) {
            this.c.a(this.f, 0);
        }
        this.f.m.a();
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d33220dc209f46fc651d42d1c8fc265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d33220dc209f46fc651d42d1c8fc265");
            return;
        }
        super.a(intent);
        this.f.n.a((com.meituan.android.cube.pga.common.b<Intent>) intent);
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a0f33edb477ba7a18c80887eb576b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a0f33edb477ba7a18c80887eb576b4");
            return;
        }
        super.a(i2, i2, intent);
        b.a aVar = new b.a();
        aVar.a = i;
        aVar.b = i2;
        aVar.c = intent;
        this.f.o.a((com.meituan.android.cube.pga.common.b<b.a>) aVar);
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4342656ed433dd71ff006a742a4e77a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4342656ed433dd71ff006a742a4e77a4");
            return;
        }
        super.a(bundle);
        this.f.p.a((com.meituan.android.cube.pga.common.b<Bundle>) bundle);
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da854e292479a6c009f7e9492afaf845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da854e292479a6c009f7e9492afaf845");
            return;
        }
        super.b(bundle);
        this.f.q.a((com.meituan.android.cube.pga.common.b<Bundle>) bundle);
    }

    @Override // com.meituan.android.cube.core.g
    public final com.meituan.android.cube.core.b b(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357ec39893a17b17a62edb49a8134e58", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.core.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357ec39893a17b17a62edb49a8134e58");
        }
        a h = h();
        if (h == null) {
            h = new a(fragmentActivity);
        }
        if (!TextUtils.isEmpty(this.e)) {
            h.c = this.e;
        }
        h.a(this);
        h.b = bundle;
        return h;
    }

    @Override // com.meituan.android.cube.core.g
    public final /* bridge */ /* synthetic */ f f() {
        return (com.meituan.android.cube.pga.block.a) this.c;
    }
}
