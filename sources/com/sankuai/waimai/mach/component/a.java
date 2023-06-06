package com.sankuai.waimai.mach.component;

import android.support.annotation.CallSuper;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T extends MachViewGroup> extends com.sankuai.waimai.mach.component.base.a<T> {
    public static ChangeQuickRedirect b;
    private boolean a;
    private boolean c;
    private boolean d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da0fec4c47f69845de1af6d623c1d930", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da0fec4c47f69845de1af6d623c1d930");
            return;
        }
        this.a = false;
        this.c = false;
        this.d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.mach.component.base.a
    public /* bridge */ /* synthetic */ void a(View view) {
        a((a<T>) ((MachViewGroup) view));
    }

    public final void c(boolean z) {
        this.a = true;
        this.c = false;
    }

    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25d7cd9d5a28d562eed1e6eec6aacab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25d7cd9d5a28d562eed1e6eec6aacab");
            return;
        }
        super.a((a<T>) t);
        t.setClipChildren(this.a ? this.c : this.d);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @CallSuper
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dfd41480c6e76e513279e3d00479c38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dfd41480c6e76e513279e3d00479c38");
            return;
        }
        String str = this.n.x;
        if (TextUtils.isEmpty(str) || "hidden".equals(str)) {
            this.d = true;
        } else {
            this.d = false;
        }
    }
}
