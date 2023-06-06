package com.sankuai.waimai.store.drug.home.refactor.card.feed_flow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends LinearLayout {
    public static ChangeQuickRedirect a;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b5ef15626bf06ea727ff7f08b1340", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b5ef15626bf06ea727ff7f08b1340");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0740eb1b4d13617a9842b33766a6712d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0740eb1b4d13617a9842b33766a6712d");
            return;
        }
        View a2 = z.a(context, R.layout.wm_drug_home_poi_header_skeleton, this, true);
        Drawable b = e.b(context, (int) R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_6);
        Drawable b2 = e.b(context, (int) R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_4);
        a2.findViewById(R.id.gradient_bg).setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(context, R.color.wm_sg_color_FFFFFF), ContextCompat.getColor(context, R.color.wm_sg_color_F5F5F6)}).a());
        a2.findViewById(R.id.tv_top).setBackground(b2);
        a2.findViewById(R.id.tv_content1).setBackground(b);
        a2.findViewById(R.id.tv_content2).setBackground(b);
        a2.findViewById(R.id.tv_content3).setBackground(b);
        a2.findViewById(R.id.tv_content4).setBackground(b);
    }
}
