package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e;
import com.sankuai.waimai.platform.widget.RoundRectImageView;
import com.sankuai.waimai.platform.widget.RoundedCornerFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    private RoundedCornerFrameLayout b;
    private RoundRectImageView c;
    private RoundRectImageView d;
    private RoundRectImageView e;
    private RoundRectImageView f;
    private TextView g;

    public a(@NonNull Context context) {
        super(context);
        View inflate;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3dd3ac84ce8b3f987ba154772ea2970", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3dd3ac84ce8b3f987ba154772ea2970");
            return;
        }
        if (d.a(context)) {
            inflate = e.a(context, R.layout.wm_dynamic_food_image);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.wm_dynamic_food_image, (ViewGroup) null);
        }
        this.b = (RoundedCornerFrameLayout) inflate.findViewById(R.id.dy_food_image_container);
        this.c = (RoundRectImageView) inflate.findViewById(R.id.dy_food_image_main);
        this.d = (RoundRectImageView) inflate.findViewById(R.id.dy_food_image_tag_icon);
        this.e = (RoundRectImageView) inflate.findViewById(R.id.dy_food_image_video_icon);
        this.f = (RoundRectImageView) inflate.findViewById(R.id.dy_food_image_shadow);
        this.g = (TextView) inflate.findViewById(R.id.dy_food_image_label);
        addView(inflate);
    }

    public final RoundedCornerFrameLayout getImageContainer() {
        return this.b;
    }

    public final RoundRectImageView getFoodImage() {
        return this.c;
    }

    public final RoundRectImageView getTagIconImage() {
        return this.d;
    }

    public final RoundRectImageView getVideoIconImage() {
        return this.e;
    }

    public final RoundRectImageView getShadowImage() {
        return this.f;
    }

    public final TextView getLabelText() {
        return this.g;
    }
}
