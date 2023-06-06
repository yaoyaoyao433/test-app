package com.sankuai.waimai.platform.machpro.refresh;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.list.e;
import com.sankuai.waimai.platform.widget.dialog.view.AnimatableImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect c;
    String d;
    private Context e;
    private AnimatableImageView f;
    private TextView g;

    public c(Context context, View view) {
        super(view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d0453d1a08e19e454bb9fd4d563a94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d0453d1a08e19e454bb9fd4d563a94");
            return;
        }
        view.setLayoutParams(new RecyclerView.g(-1, -2));
        this.e = context;
        this.f = (AnimatableImageView) view.findViewById(R.id.wm_mach_pro_loadmore_anim);
        this.g = (TextView) view.findViewById(R.id.wm_mach_pro_loadmore_txt);
    }

    @Override // com.sankuai.waimai.machpro.component.list.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edcbd419f9b9a275e3c971cdd9179d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edcbd419f9b9a275e3c971cdd9179d7");
        } else if (i == 101) {
            this.g.setText(this.e.getText(R.string.wm_mach_pro_loadmore_loading));
            this.f.setVisibility(0);
        } else if (i != 103) {
            if (i == 102) {
                this.f.setVisibility(8);
                this.g.setText(this.e.getText(R.string.wm_mach_pro_loadmore));
            }
        } else {
            this.f.setVisibility(8);
            if (TextUtils.isEmpty(this.d)) {
                this.g.setText(this.e.getText(R.string.wm_mach_pro_loadmore_no_data));
            } else {
                this.g.setText(this.d);
            }
        }
    }
}
