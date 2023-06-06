package com.sankuai.waimai.store.goods.detail.components.subroot.base;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailRoundCornerTileBlock extends j {
    public static ChangeQuickRedirect g;
    private int h;
    private int i;
    private int j;
    private int k;
    private Boolean l;
    private int m;
    private int n;
    private Boolean o;

    public SGDetailRoundCornerTileBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9249c23c655eb256858cb967f90f5f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9249c23c655eb256858cb967f90f5f3");
            return;
        }
        this.l = Boolean.FALSE;
        this.o = Boolean.FALSE;
    }

    @Override // com.meituan.android.cube.core.f
    public void a_(@NonNull View view) {
        View c;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9cf9f73876c6b9b105b9cbd7b85989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9cf9f73876c6b9b105b9cbd7b85989");
            return;
        }
        super.a_(view);
        if (view == null || (c = c(view)) == null) {
            return;
        }
        this.h = c.getPaddingLeft();
        this.i = c.getPaddingTop();
        this.j = c.getPaddingRight();
        this.k = c.getPaddingBottom();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c.getLayoutParams();
        this.m = layoutParams.topMargin;
        this.n = layoutParams.bottomMargin;
    }

    public final void a(BaseTile.LayoutInfo layoutInfo) {
        Object[] objArr = {layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425f56321c57517023de930a31b9086a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425f56321c57517023de930a31b9086a");
            return;
        }
        b(layoutInfo);
        c(layoutInfo);
    }

    private void b(BaseTile.LayoutInfo layoutInfo) {
        View c;
        Object[] objArr = {layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb1899fe3d26b885513337e65c01ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb1899fe3d26b885513337e65c01ae2");
            return;
        }
        View i = i();
        if (i == null || (c = c(i)) == null || layoutInfo == null) {
            return;
        }
        float a = h.a(m(), layoutInfo.borderTopLeftRadius);
        float a2 = h.a(m(), layoutInfo.borderBottomLeftRadius);
        e.a c2 = new e.a().c(b.b(m(), R.color.white));
        c2.a(a, a, a2, a2);
        c.setBackground(c2.a());
    }

    private void c(BaseTile.LayoutInfo layoutInfo) {
        View c;
        Object[] objArr = {layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204496c2f174392bd86539e353647ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204496c2f174392bd86539e353647ea9");
            return;
        }
        View i = i();
        if (i == null || (c = c(i)) == null || layoutInfo == null) {
            return;
        }
        b(c);
        if (layoutInfo.top > 0 || layoutInfo.bottom > 0) {
            this.o = Boolean.TRUE;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c.getLayoutParams();
            if (layoutInfo.top > 0) {
                layoutParams.topMargin = h.a(m(), layoutInfo.top);
            }
            if (layoutInfo.bottom > 0) {
                layoutParams.bottomMargin = h.a(m(), layoutInfo.bottom);
            }
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f581aee21418901c8ed540727d9ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f581aee21418901c8ed540727d9ca5");
        } else if (this.o.booleanValue()) {
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.topMargin = this.m;
                layoutParams.bottomMargin = this.n;
            }
            this.o = Boolean.FALSE;
        }
    }

    private View c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f7c1b22c45a30a30e8572483552423", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f7c1b22c45a30a30e8572483552423");
        }
        if (view == null) {
            return null;
        }
        return view.findViewById(R.id.content);
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82d9d02287244326359d8e710da23c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82d9d02287244326359d8e710da23c7");
            return;
        }
        View i = i();
        if (i == null) {
            return;
        }
        c(i).setBackgroundColor(0);
    }
}
