package com.sankuai.waimai.business.search.ui.result.mach.component;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.TierSlideContainer;
import com.sankuai.waimai.ad.view.mach.tierslide.d;
import com.sankuai.waimai.mach.component.b;
import com.sankuai.waimai.mach.lifecycle.c;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.mach.component.a<TierSlideContainer> implements TierSlideContainer.a, b, c {
    public static ChangeQuickRedirect a;
    private d c;
    private TierSlideContainer d;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdce09e48bd60a155a929e42714f81b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdce09e48bd60a155a929e42714f81b1");
        } else {
            this.c = new d();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a35521144c9e5158d174aa828e6d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (TierSlideContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a35521144c9e5158d174aa828e6d0d");
        }
        TierSlideContainer tierSlideContainer = new TierSlideContainer(context);
        tierSlideContainer.setIndexChangedListener(this);
        return tierSlideContainer;
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479678c9ceba6dfc1addee5c883f8125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479678c9ceba6dfc1addee5c883f8125");
            return;
        }
        super.a();
        this.c.a();
        String a2 = a("scale-offset");
        String a3 = a("auto-play");
        String a4 = a("visible-count");
        String a5 = a("interaction-enable");
        String a6 = a("video-interval");
        String a7 = a("gif-interval");
        String a8 = a("default-interval");
        this.c.c = j(a3);
        this.c.d = j(a5);
        this.c.b = f(a4);
        this.c.e = c(a2);
        this.c.a(d(a6));
        this.c.b(d(a7));
        this.c.c(d(a8));
        this.c.a(a("scroll-mode"));
        if (k() == null || !(k().get("@index-change") instanceof com.sankuai.waimai.mach.parser.d)) {
            return;
        }
        this.c.j = (com.sankuai.waimai.mach.parser.d) k().get("@index-change");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bec9657a68f467843d589004c30b7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bec9657a68f467843d589004c30b7aa");
            return;
        }
        super.b();
        if (this.d != null) {
            this.d.e();
        }
    }

    private boolean j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4413ec9fedf052d9dc54d9df451229a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4413ec9fedf052d9dc54d9df451229a7")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(TierSlideContainer tierSlideContainer) {
        Object[] objArr = {tierSlideContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df035a0e3c574113fa01c4cc1510bc93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df035a0e3c574113fa01c4cc1510bc93");
            return;
        }
        super.a((a) tierSlideContainer);
        this.d = tierSlideContainer;
        if (this.d != null) {
            this.d.a(this.c, (com.sankuai.waimai.mach.node.a<TierSlideContainer>) this.n);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.TierSlideContainer.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "718822e3213e767b49febb969f711e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "718822e3213e767b49febb969f711e6e");
            return;
        }
        com.sankuai.waimai.mach.parser.d dVar = this.c.j;
        if (this.m == null || dVar == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(i));
        this.m.asyncCallJSMethod(dVar.b, linkedList);
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcfda9278873cdfd88f056855717a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcfda9278873cdfd88f056855717a70");
        } else if (this.d != null) {
            this.d.setPagerVisibility(z);
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0473fc3b6752b602ffa619ac89c7b183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0473fc3b6752b602ffa619ac89c7b183");
        } else if (this.d == null) {
        } else {
            if (z) {
                this.d.a();
            } else {
                this.d.b();
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482c2d4ef7cda13e502d81ed43be7a06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482c2d4ef7cda13e502d81ed43be7a06")).intValue();
        }
        TierSlideContainer tierSlideContainer = (TierSlideContainer) this.o;
        if (tierSlideContainer == null) {
            return 0;
        }
        return tierSlideContainer.getItemCount();
    }
}
