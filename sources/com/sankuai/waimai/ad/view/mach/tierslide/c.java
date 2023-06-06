package com.sankuai.waimai.ad.view.mach.tierslide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.TierSlideContainer;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.mach.component.a<TierSlideContainer> implements TierSlideContainer.a, com.sankuai.waimai.mach.component.b {
    public static ChangeQuickRedirect a;
    private d c;
    private TierSlideContainer d;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693d22f5ba7e53b3a0e8142a02d66eb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693d22f5ba7e53b3a0e8142a02d66eb0");
        } else {
            this.c = new d();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217223202694a3d6bcdb33176620c327", RobustBitConfig.DEFAULT_VALUE)) {
            return (TierSlideContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217223202694a3d6bcdb33176620c327");
        }
        TierSlideContainer tierSlideContainer = new TierSlideContainer(context);
        tierSlideContainer.setIndexChangedListener(this);
        return tierSlideContainer;
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03fa963179261526a35e46eee5dce4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03fa963179261526a35e46eee5dce4c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf5d42d18e5e1a827ab17a3b1da0d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf5d42d18e5e1a827ab17a3b1da0d44");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0120a0f12cc04432c5bc1cc89b12f71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0120a0f12cc04432c5bc1cc89b12f71")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c488d3f3dd8188adf68a684090c2fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c488d3f3dd8188adf68a684090c2fc7");
            return;
        }
        super.a((c) tierSlideContainer);
        this.d = tierSlideContainer;
        if (this.d != null) {
            this.d.a(this.c, (com.sankuai.waimai.mach.node.a<TierSlideContainer>) this.n);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c19e916c3774d1cf1f98c443a1b4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c19e916c3774d1cf1f98c443a1b4fe");
        } else if (this.d != null) {
            this.d.setPagerVisibility(z);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6c15bd0633bbf06719398cb4b81983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6c15bd0633bbf06719398cb4b81983");
        } else if (this.d == null) {
        } else {
            if (z) {
                this.d.a();
            } else {
                this.d.b();
            }
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.TierSlideContainer.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf7ab2e0dd96c302da087d41a75560c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf7ab2e0dd96c302da087d41a75560c0");
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

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a4027f551cdefc766edb0f57edb647", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a4027f551cdefc766edb0f57edb647")).intValue();
        }
        TierSlideContainer tierSlideContainer = (TierSlideContainer) this.o;
        if (tierSlideContainer == null) {
            return 0;
        }
        return tierSlideContainer.getItemCount();
    }
}
