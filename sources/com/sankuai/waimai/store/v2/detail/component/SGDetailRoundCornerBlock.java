package com.sankuai.waimai.store.v2.detail.component;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.j;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailRoundCornerBlock extends j {
    public static ChangeQuickRedirect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Boolean l;

    public SGDetailRoundCornerBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b82183752d58f028445f6fd03189d12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b82183752d58f028445f6fd03189d12");
        } else {
            this.l = Boolean.FALSE;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6595437d5bdc1ddff571ef132e03e6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6595437d5bdc1ddff571ef132e03e6e9");
            return;
        }
        super.a_(view);
        if (view != null) {
            this.h = view.getPaddingLeft();
            this.i = view.getPaddingTop();
            this.j = view.getPaddingRight();
            this.k = view.getPaddingBottom();
        }
    }

    public int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a87d1859af8f857de62dc74fb21a89a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a87d1859af8f857de62dc74fb21a89a")).intValue();
        }
        if (i() == null || i().getContext() == null) {
            return 0;
        }
        return h.a(i().getContext(), 12.0f);
    }

    public int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa0306047e76c0ee36d57494fe33873", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa0306047e76c0ee36d57494fe33873")).intValue();
        }
        if (i() == null || i().getContext() == null) {
            return 0;
        }
        return h.a(i().getContext(), 12.0f);
    }
}
