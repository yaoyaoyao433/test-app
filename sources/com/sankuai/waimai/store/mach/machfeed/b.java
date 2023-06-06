package com.sankuai.waimai.store.mach.machfeed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.container.d;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect c;
    public final ViewGroup d;

    public d a() {
        return null;
    }

    public b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0722cb9684028e90cc6a31fd85cc6f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0722cb9684028e90cc6a31fd85cc6f9");
        } else {
            this.d = new FrameLayout(context);
        }
    }

    public final void c(BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b787d1494581eaa5bf3e972c332d5e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b787d1494581eaa5bf3e972c332d5e50");
            return;
        }
        View d = d(baseModuleDesc, i);
        if (d == null) {
            return;
        }
        ViewGroup viewGroup = this.d;
        viewGroup.removeAllViews();
        viewGroup.addView(d, new ViewGroup.LayoutParams(-1, -2));
    }

    public final void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7178615459190ff513a5323c31934cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7178615459190ff513a5323c31934cc7");
            return;
        }
        View b = b(baseModuleDesc, i, z);
        if (b == null) {
            return;
        }
        ViewGroup viewGroup = this.d;
        viewGroup.removeAllViews();
        viewGroup.addView(b, new ViewGroup.LayoutParams(-1, -2));
    }

    public View d(BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efacc9baa858e4102cba678bfdc166e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efacc9baa858e4102cba678bfdc166e3");
        }
        if (this.d.getContext() instanceof SCBaseActivity) {
            return ((SCBaseActivity) this.d.getContext()).d.a(baseModuleDesc, b(baseModuleDesc, i), a(baseModuleDesc, i), false, a());
        }
        return null;
    }

    private View b(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa8d23085b38e4c48c5cf96e8b8ae3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa8d23085b38e4c48c5cf96e8b8ae3c");
        }
        if (this.d.getContext() instanceof SCBaseActivity) {
            return ((SCBaseActivity) this.d.getContext()).d.a(baseModuleDesc, b(baseModuleDesc, i), a(baseModuleDesc, i), z, a());
        }
        return null;
    }

    public Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26236fc998a69462ce081f2186c9649f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26236fc998a69462ce081f2186c9649f") : new HashMap();
    }

    public Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c770c3033032a6a133aab4e2cae48875", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c770c3033032a6a133aab4e2cae48875") : new HashMap();
    }
}
