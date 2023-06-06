package com.sankuai.waimai.store.drug.consultation;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.im.base.j;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.store.im.entrance.drug.a, com.sankuai.waimai.store.im.entrance.drug.unread.I.a, com.sankuai.waimai.store.im.entrance.drug.view.d {
    public static ChangeQuickRedirect a;
    protected final Activity b;
    protected final String c;
    protected final String d;
    protected final String e;
    @Nullable
    protected com.sankuai.waimai.store.im.entrance.drug.view.c f;
    private final com.sankuai.waimai.store.im.entrance.drug.jump.I.a g;
    private final d h;
    @Nullable
    private j i;

    public c(@Nonnull Activity activity, String str, String str2, String str3, @Nullable j jVar) {
        Object[] objArr = {activity, str, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5772c739f024dd57c33626a9666e0e75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5772c739f024dd57c33626a9666e0e75");
            return;
        }
        this.b = activity;
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.i = jVar;
        this.g = new com.sankuai.waimai.store.im.entrance.drug.jump.b(this.b, this.c, str);
        this.h = new d(this);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.unread.I.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefc3fa755c124396a358a2065a9e406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefc3fa755c124396a358a2065a9e406");
        } else if (this.f != null) {
            this.f.a(i);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.view.d
    public final void a(int i, long j, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a3fddcd96b2dbed7f6f22c61dcd344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a3fddcd96b2dbed7f6f22c61dcd344");
        } else {
            this.g.a(i, j, str, str2, false);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df51719e07b8b8686d510fca9d0593e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df51719e07b8b8686d510fca9d0593e0");
        }
        if (this.f == null) {
            this.f = new b(this.b, this.d, this.i);
            ((b) this.f).d = this;
        }
        View a2 = this.f.a(viewGroup);
        this.h.a();
        return a2;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final ViewGroup b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24746ab193bdeabfa116020c17939f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24746ab193bdeabfa116020c17939f5a");
        }
        if (this.f != null) {
            return this.f.b();
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final boolean a(@Nullable DrugImEntranceEntity drugImEntranceEntity, int i, long j, String str, String str2) {
        Object[] objArr = {drugImEntranceEntity, Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a474bf3de9a7041c1f6b0eded70f4e34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a474bf3de9a7041c1f6b0eded70f4e34")).booleanValue();
        }
        if (this.f != null) {
            return this.f.a(drugImEntranceEntity, i, j, str, str2);
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06160fa38bfbcf2be6f2ee81cdbad4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06160fa38bfbcf2be6f2ee81cdbad4bc");
            return;
        }
        d dVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "858b2740d46dde8a28a38163e0356b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "858b2740d46dde8a28a38163e0356b3d");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().b((short) 1024, dVar);
            com.sankuai.waimai.imbase.manager.b.a().b((short) 1052, dVar);
        }
        if (this.f != null) {
            this.f.c();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3ad2e4ba790e3ba1b9db1bcfd3a4d2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3ad2e4ba790e3ba1b9db1bcfd3a4d2a")).intValue();
        }
        if (this.f != null) {
            return this.f.a();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a88fb001885d51571fed38dfa5ccf41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a88fb001885d51571fed38dfa5ccf41");
            return;
        }
        d dVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b27db9d08e3e39f56aedcc224004f2f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b27db9d08e3e39f56aedcc224004f2f8");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, (d.InterfaceC0965d) dVar);
            com.sankuai.waimai.imbase.manager.b.a().a((short) 1052, (d.InterfaceC0965d) dVar);
        }
        if (this.f != null) {
            this.f.d();
        }
    }
}
