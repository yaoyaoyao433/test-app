package com.sankuai.waimai.rocks.view.block;

import android.text.TextUtils;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.view.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<ViewType extends com.meituan.android.cube.pga.view.a, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.a<ViewType, com.sankuai.waimai.rocks.view.viewmodel.e, ContextType> {
    public static ChangeQuickRedirect r;

    public void O() {
    }

    public a() {
    }

    public a(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51e67d5a1a352e484de83a30f81aaca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51e67d5a1a352e484de83a30f81aaca");
        }
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70549152d44e0304ccf17e19b385915", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70549152d44e0304ccf17e19b385915");
        }
        if (this.n == 0 || ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s == null) {
            return "";
        }
        if (TextUtils.isEmpty(((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.e)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.n) ? "" : ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.n);
            sb.append(((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).v);
            return sb.toString();
        }
        return ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.a();
    }

    public final String N() {
        return (this.n == 0 || ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s == null) ? "" : ((com.sankuai.waimai.rocks.view.viewmodel.e) this.n).s.n;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2beebba5f0528cb8830e8ca92be08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2beebba5f0528cb8830e8ca92be08b");
        } else {
            super.y();
        }
    }
}
