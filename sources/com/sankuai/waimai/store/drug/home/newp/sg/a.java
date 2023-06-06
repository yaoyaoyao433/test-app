package com.sankuai.waimai.store.drug.home.newp.sg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.base.idata.a {
    public static ChangeQuickRedirect a;
    protected final com.sankuai.waimai.store.param.a b;
    public final ViewGroup c;
    public int d;
    public int e;
    public C1157a f;
    public BaseModuleDesc g;
    private boolean h;
    private boolean i;

    public abstract void a(@NonNull C1157a c1157a);

    public abstract void b(@NonNull T t);

    public a(@NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup.getContext());
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549054549b34bc38b98304d54c8e4665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549054549b34bc38b98304d54c8e4665");
            return;
        }
        this.d = 0;
        this.e = -1;
        this.h = false;
        this.i = true;
        this.f = new C1157a();
        this.g = null;
        this.c = viewGroup;
        this.b = aVar;
    }

    public final void a(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23dccce8728682d54ea24ffe47ee7492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23dccce8728682d54ea24ffe47ee7492");
            return;
        }
        b();
        a(this.f);
        u.a(this.mView);
        try {
            b(t);
        } catch (Exception e) {
            u.c(this.mView);
            com.sankuai.shangou.stone.util.log.a.a("%s", e.getMessage());
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef618bf43dbcc5316609223ce3d25bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef618bf43dbcc5316609223ce3d25bab");
        } else if (this.h) {
        } else {
            this.h = true;
            bindView(this.mInflater.inflate(R.layout.wm_drug_home_tile, this.c, false));
        }
    }

    @Override // com.sankuai.waimai.store.base.idata.a
    public final boolean a() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.base.idata.a
    public final void a(boolean z) {
        this.i = z;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.sg.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1157a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        public C1157a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35040bb149a18c2cd69e7b385182091", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35040bb149a18c2cd69e7b385182091");
                return;
            }
            this.b = -1;
            this.c = -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a(Context context, int i) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbdc867a955c1f2a2d56762d850adaa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbdc867a955c1f2a2d56762d850adaa")).intValue() : h.a(context, i);
        }
    }
}
