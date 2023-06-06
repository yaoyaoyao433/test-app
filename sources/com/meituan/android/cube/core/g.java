package com.meituan.android.cube.core;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class g implements com.meituan.android.cube.delegate.a {
    public static ChangeQuickRedirect b;
    protected f c;
    protected b d;
    @Nullable
    protected String e;

    public abstract f g();

    public g() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92666b8ac46efb0709061d943c28b2bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92666b8ac46efb0709061d943c28b2bb");
        }
    }

    public g(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "031beb851f6349faf402057cc8c7f462", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "031beb851f6349faf402057cc8c7f462");
        } else {
            this.e = str;
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void a(@NonNull FragmentActivity fragmentActivity, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399a80373ce1453e9a96356824de68d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399a80373ce1453e9a96356824de68d2");
            return;
        }
        this.c = g();
        this.d = b(fragmentActivity, bundle);
        if (this.c != null) {
            this.c.a(this.d, 2);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62f80437812894dca0c5b19ff90d96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62f80437812894dca0c5b19ff90d96a");
        } else if (this.c != null) {
            this.c.a(this.d, 4);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e504764a48e830089e0d07f49baf82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e504764a48e830089e0d07f49baf82");
        } else if (this.c != null) {
            this.c.a(this.d, 5);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7fbf5b69a04b3ffab589441c56a53c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7fbf5b69a04b3ffab589441c56a53c9");
        } else if (this.c != null) {
            this.c.a(this.d, 4);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59654fab6daa924003de867ae6db939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59654fab6daa924003de867ae6db939");
        } else if (this.c != null) {
            this.c.a(this.d, 3);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f31631c798974a28c1207dac591ab9be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f31631c798974a28c1207dac591ab9be");
        } else if (this.c != null) {
            this.c.a(this.d, 0);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc0cde115d21cf1011b843d7a97f8104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc0cde115d21cf1011b843d7a97f8104");
        } else if (this.c != null) {
            ((com.meituan.android.cube.core.eventhandler.protocol.b) this.c.a((Class<com.meituan.android.cube.core.eventhandler.event.a>) com.meituan.android.cube.core.eventhandler.protocol.b.class)).a(intent);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59a35e7e0694aa5c2c0196414c0f3f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59a35e7e0694aa5c2c0196414c0f3f3");
        } else if (this.c != null) {
            ((com.meituan.android.cube.core.eventhandler.protocol.a) this.c.a((Class<com.meituan.android.cube.core.eventhandler.event.a>) com.meituan.android.cube.core.eventhandler.protocol.a.class)).a(i, i2, intent);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df206afe5bafde0eb2a58a4a91f77c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df206afe5bafde0eb2a58a4a91f77c98");
        } else if (this.c != null) {
            ((com.meituan.android.cube.core.eventhandler.protocol.d) this.c.a((Class<com.meituan.android.cube.core.eventhandler.event.a>) com.meituan.android.cube.core.eventhandler.protocol.d.class)).b(bundle);
        }
    }

    @Override // com.meituan.android.cube.delegate.a
    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bd1195880bdd94cef96a0e241bf58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bd1195880bdd94cef96a0e241bf58b");
        } else if (this.c != null) {
            this.c.a(com.meituan.android.cube.core.eventhandler.protocol.c.class);
        }
    }

    public f f() {
        return this.c;
    }

    public b b(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483ebc81d73e56d010d10e48cf38218c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483ebc81d73e56d010d10e48cf38218c");
        }
        b bVar = new b(fragmentActivity);
        if (!TextUtils.isEmpty(this.e)) {
            bVar.c = this.e;
        }
        bVar.a(this);
        bVar.b = bundle;
        return bVar;
    }
}
