package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.u;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DefaultPullRefreshHeader extends FrameLayout implements a {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private boolean c;

    public DefaultPullRefreshHeader(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab97332573e84f433df0e110d8900eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab97332573e84f433df0e110d8900eb");
            return;
        }
        this.c = false;
        a(context);
    }

    public DefaultPullRefreshHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15fe16499e544d09164a1a6f382d308f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15fe16499e544d09164a1a6f382d308f");
            return;
        }
        this.c = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f17b726e07cf1881ee8573e3e6a0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f17b726e07cf1881ee8573e3e6a0ff");
            return;
        }
        u.b(this, 0, 44, 0, 0);
        this.b = (ImageView) LayoutInflater.from(context).inflate(R.layout.wm_sg_common_ptr_layout_header, (ViewGroup) this, true).findViewById(R.id.refresh_img);
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5238569fb6f9df954f8c6b186e515d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5238569fb6f9df954f8c6b186e515d0a");
            return;
        }
        boolean z = i != 0;
        if (this.c != z) {
            this.c = z;
            if (z) {
                this.b.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
            } else {
                this.b.setImageDrawable(null);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2, int i3) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a420af8ca50fa1efe64bbc1050c533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a420af8ca50fa1efe64bbc1050c533");
        } else if (i3 == 1 || i3 == 2) {
            float a2 = n.a(i, 0, i2);
            this.b.setPivotX(this.b.getWidth() / 2);
            this.b.setPivotY(this.b.getHeight());
            this.b.setScaleX(a2);
            this.b.setScaleY(a2);
        }
    }
}
