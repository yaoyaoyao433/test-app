package com.sankuai.waimai.store.platform.domain.core.shopcart.callback;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.am;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private final WeakReference<View> b;
    private final int c;
    private String d;

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28675461ba2f12bafe4fe74adc707e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28675461ba2f12bafe4fe74adc707e9a");
        }
    }

    public a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7418cdcd4ef6802193c574a6a6ab4147", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7418cdcd4ef6802193c574a6a6ab4147");
            return;
        }
        this.b = new WeakReference<>(view);
        this.c = i;
        this.d = str;
    }

    public a(View view, String str) {
        this(view, -1, str);
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04aac0e421bb3e2a988df2383d57f6e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04aac0e421bb3e2a988df2383d57f6e2");
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        View view;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276dc1c3354f4bbbc2565006514a0424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276dc1c3354f4bbbc2565006514a0424");
        } else if (this.c != 273 || (view = this.b.get()) == null || com.sankuai.waimai.store.util.b.a(view.getContext())) {
        } else {
            f.a().a(view, this.d);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c190f93d723c3e2fe2af19a50f01b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c190f93d723c3e2fe2af19a50f01b7");
            return;
        }
        View view = this.b.get();
        if (view == null || com.sankuai.waimai.store.util.b.a(view.getContext()) || aVar == null || TextUtils.isEmpty(aVar.getMessage())) {
            return;
        }
        am.a(view.getContext(), aVar.getMessage());
    }
}
