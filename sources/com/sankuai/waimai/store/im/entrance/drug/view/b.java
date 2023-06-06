package com.sankuai.waimai.store.im.entrance.drug.view;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.base.j;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.im.entrance.drug.a, com.sankuai.waimai.store.im.entrance.drug.unread.I.a, d {
    public static ChangeQuickRedirect a;
    protected final Activity b;
    protected final String c;
    protected final String d;
    protected final String e;
    @Nullable
    protected c f;
    private final com.sankuai.waimai.store.im.entrance.drug.jump.I.a g;
    private final com.sankuai.waimai.store.im.entrance.drug.unread.a h;
    @Nullable
    private j i;

    public b(@Nonnull Activity activity, String str, String str2, String str3, @Nullable j jVar) {
        Object[] objArr = {activity, str, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07b40935599d85cfd2a526a1e318688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07b40935599d85cfd2a526a1e318688");
            return;
        }
        this.b = activity;
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.i = jVar;
        this.g = new com.sankuai.waimai.store.im.entrance.drug.jump.b(this.b, this.c, str);
        this.h = new com.sankuai.waimai.store.im.entrance.drug.unread.a(this);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.unread.I.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f692a391bdb5822bb743bc867d31cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f692a391bdb5822bb743bc867d31cd8");
        } else if (this.f != null) {
            this.f.a(i);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.view.d
    public final void a(int i, long j, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366647d2f9fe169024cc88298eb5ad6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366647d2f9fe169024cc88298eb5ad6e");
        } else {
            this.g.a(i, j, str, str2, false);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55eca89642f66e4a06fd715e96ab656", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55eca89642f66e4a06fd715e96ab656");
        }
        if (this.f == null) {
            this.f = new a(this.b, this.d, this.i);
            ((a) this.f).h = this;
        }
        View a2 = this.f.a(viewGroup);
        this.h.a();
        return a2;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final ViewGroup b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71127e68c78ab83ea2f2d84a7bec2bf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71127e68c78ab83ea2f2d84a7bec2bf4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4250b4c9193e98f69acd2a882c6c8968", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4250b4c9193e98f69acd2a882c6c8968")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d999fac53bd4629f0e43d2488de7479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d999fac53bd4629f0e43d2488de7479");
            return;
        }
        this.h.b();
        if (this.f != null) {
            this.f.c();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3200fe9436669b2057f3da2ff0c6067a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3200fe9436669b2057f3da2ff0c6067a")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46483cfe35f836d4a33d9b46c2701ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46483cfe35f836d4a33d9b46c2701ba5");
            return;
        }
        this.h.c();
        if (this.f != null) {
            this.f.d();
        }
    }
}
