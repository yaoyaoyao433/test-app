package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.a;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ActivityRoundImageView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    private View f;
    private View g;
    private UniversalImageView h;
    private Drawable i;

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_sc_goods_list_activity_shadow;
    }

    public ActivityRoundImageView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5473ddbae283f392b452c806d30fe3d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5473ddbae283f392b452c806d30fe3d5");
        }
    }

    public ActivityRoundImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e22b956331a93ae02afff2b449904a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e22b956331a93ae02afff2b449904a9");
        }
    }

    public ActivityRoundImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a19a75e33a17e0ca95324f305c9f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a19a75e33a17e0ca95324f305c9f2f");
        }
    }

    public ActivityRoundImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5b4e1cab6d354c8005f406bc5c0d9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5b4e1cab6d354c8005f406bc5c0d9e");
        }
    }

    public void setData(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b463f243414d383471bb314e1a759ba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b463f243414d383471bb314e1a759ba0");
            return;
        }
        this.h.setCornerRadius(h.a(this.c, 2.0f));
        b.C0608b b = m.b((String) a.a((List<Object>) list, 0));
        b.i = R.drawable.wm_sc_common_loading_large;
        b.j = R.drawable.wm_sc_common_loading_large;
        b.a((ImageView) this.h);
        post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.ActivityRoundImageView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47c63de9f8d38a3cf5d35dbbfdbdc30a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47c63de9f8d38a3cf5d35dbbfdbdc30a");
                    return;
                }
                ActivityRoundImageView.this.h.getLayoutParams().width = ActivityRoundImageView.this.getWidth();
                ActivityRoundImageView.this.f.getLayoutParams().width = (ActivityRoundImageView.this.h.getWidth() * 87) / 100;
                ActivityRoundImageView.this.g.getLayoutParams().width = (ActivityRoundImageView.this.h.getWidth() * 3) / 4;
                u.c(ActivityRoundImageView.this.f, 0, 0, 0, h.a(ActivityRoundImageView.this.c, 3.0f));
                u.c(ActivityRoundImageView.this.h, 0, 0, 0, h.a(ActivityRoundImageView.this.c, 6.0f));
                ActivityRoundImageView.this.requestLayout();
            }
        });
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0ac68924b14b32e535d23b7b5c2a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0ac68924b14b32e535d23b7b5c2a0e");
        }
        this.f = view.findViewById(R.id.half_transparent_view);
        if (this.i == null) {
            this.i = new e.a().c(com.sankuai.waimai.store.util.b.b(this.c, R.color.wm_sg_color_99ffffff)).a(0.0f, 0.0f, h.a(getContext(), 2.0f), h.a(getContext(), 2.0f)).a();
        }
        this.f.setBackground(this.i);
        this.g = view.findViewById(R.id.less_half_transparent_view);
        this.h = (UniversalImageView) view.findViewById(R.id.activity_img);
        return this;
    }
}
