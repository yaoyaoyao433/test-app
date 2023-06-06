package com.sankuai.waimai.platform.rocks.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private View e;
    private TextView f;
    private TextView g;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_rocks_recyclerview_footer;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d843d2c935278de553554c896c784d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d843d2c935278de553554c896c784d");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ef82e85c37514770fc584e06c501fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ef82e85c37514770fc584e06c501fd6");
            return;
        }
        super.b();
        this.e = this.b.findViewById(R.id.rocks_pull_to_load_progress);
        this.f = (TextView) this.b.findViewById(R.id.rocks_footer_info);
        this.g = (TextView) this.b.findViewById(R.id.rocks_footer_retry);
        View view = (View) this.e.getParent();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = g.a(this.c, 90.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void a(com.sankuai.waimai.rocks.view.recyclerview.footer.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a893af75b5263902dbd177ecfac0831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a893af75b5263902dbd177ecfac0831");
            return;
        }
        switch (bVar.a) {
            case 1:
                if (this.e.getVisibility() != 0) {
                    this.e.setVisibility(0);
                }
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
                this.f.setText(TextUtils.isEmpty(bVar.b) ? this.c.getResources().getString(R.string.wm_rocks_footer_loading) : bVar.b);
                return;
            case 2:
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.f.setText(TextUtils.isEmpty(bVar.b) ? this.c.getResources().getString(R.string.wm_rocks_footer_more) : bVar.b);
                return;
            case 3:
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                this.f.setText(TextUtils.isEmpty(bVar.b) ? this.c.getResources().getString(R.string.wm_rocks_no_more_poi) : bVar.b);
                return;
            case 4:
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                this.f.setText(TextUtils.isEmpty(bVar.b) ? this.c.getResources().getString(R.string.wm_rocks_footer_more) : bVar.b);
                return;
            default:
                return;
        }
    }
}
