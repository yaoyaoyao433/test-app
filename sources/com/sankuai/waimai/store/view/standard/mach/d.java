package com.sankuai.waimai.store.view.standard.mach;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.HorizontalSpringBackView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.mach.component.a<HorizontalSpringBackView> implements HorizontalSpringBackView.a {
    public static ChangeQuickRedirect a;
    private HorizontalSpringBackView c;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490a95ee1fda69148e92e586e9ab7627", RobustBitConfig.DEFAULT_VALUE)) {
            return (HorizontalSpringBackView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490a95ee1fda69148e92e586e9ab7627");
        }
        this.c = new HorizontalSpringBackView(context);
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(HorizontalSpringBackView horizontalSpringBackView) {
        Object[] objArr = {horizontalSpringBackView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6baf288e1e425d5ec124fe6dd138fa8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6baf288e1e425d5ec124fe6dd138fa8f");
            return;
        }
        super.a((d) horizontalSpringBackView);
        View view = null;
        List<com.sankuai.waimai.mach.node.a> b = this.n.b();
        if (com.sankuai.shangou.stone.util.a.a((List) b) > 0) {
            for (com.sankuai.waimai.mach.node.a aVar : b) {
                if (aVar.h() != null && aVar.h().containsKey("spring-back")) {
                    view = aVar.g();
                }
            }
        }
        if (view != null) {
            this.c.setSpringBackView(view);
            this.c.setSpringBackCallback(this);
        }
    }

    @Override // com.sankuai.waimai.store.view.HorizontalSpringBackView.a
    public final void bJ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd89d0ed950c431c46a97f40d694cbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd89d0ed950c431c46a97f40d694cbf");
        } else {
            this.n.f.sendJsEvent("js_event_on_spring_back", null);
        }
    }
}
