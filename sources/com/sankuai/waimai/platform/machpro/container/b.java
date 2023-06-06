package com.sankuai.waimai.platform.machpro.container;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.container.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.machpro.container.a b;
    private com.sankuai.waimai.platform.widget.emptylayout.d c;

    @Override // com.sankuai.waimai.machpro.container.d
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aab44ba9bc6c4650c2761963af7bacc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aab44ba9bc6c4650c2761963af7bacc");
        }
        b(context);
        return this.c.a();
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f436847d520cfdd0fcfc951500548011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f436847d520cfdd0fcfc951500548011");
            return;
        }
        super.a();
        if (this.c != null) {
            this.c.d();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7981ed1ead39d5af1dc314fcb74e3e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7981ed1ead39d5af1dc314fcb74e3e0");
            return;
        }
        super.b();
        if (this.c == null || !this.c.j()) {
            return;
        }
        this.c.h();
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final View a(Context context, com.sankuai.waimai.machpro.container.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5f250f228db1ccc77827bdca966040", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5f250f228db1ccc77827bdca966040");
        }
        b(context);
        this.b = aVar;
        return this.c.a();
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dfd46b7f2be08a104aa5647d1a12d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dfd46b7f2be08a104aa5647d1a12d26");
            return;
        }
        super.c();
        if (this.c != null) {
            this.c.b(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.machpro.container.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f41b52dd1dad3ee512473681939be3dd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f41b52dd1dad3ee512473681939be3dd");
                    } else if (b.this.b != null) {
                        b.this.b.b();
                    }
                }
            });
            this.c.d("加载失败，点击重试！");
        }
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbaa50744671ada952501e670cfa136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbaa50744671ada952501e670cfa136");
            return;
        }
        super.d();
        if (this.c == null || !this.c.j()) {
            return;
        }
        this.c.h();
    }

    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24278e63ff3b6c75da6ab11e4abdccba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24278e63ff3b6c75da6ab11e4abdccba");
        } else if (this.c == null && (context instanceof Activity)) {
            this.c = new com.sankuai.waimai.platform.widget.emptylayout.d(((Activity) context).getLayoutInflater(), (ViewGroup) null);
        }
    }
}
