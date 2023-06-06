package com.sankuai.waimai.store.drug.home.refactor.card.feed_flow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edac346a1ebd6dd6427e3530c31364bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edac346a1ebd6dd6427e3530c31364bb");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98a4030f24834a31aecd95797c3e1b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98a4030f24834a31aecd95797c3e1b2a");
            return;
        }
        View a2 = z.a(context, R.layout.wm_drug_home_item_skeleton_default_layout, this, true);
        Drawable b = e.b(context, (int) R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_12);
        Drawable b2 = e.b(context, (int) R.color.wm_sg_color_F5F5F6, (int) R.dimen.wm_sc_common_dimen_6);
        Drawable b3 = e.b(context, (int) R.color.wm_sg_color_F5F5F6, (int) R.dimen.wm_sc_common_dimen_4);
        a2.findViewById(R.id.root_view).setBackground(b);
        a2.findViewById(R.id.left_view).setBackground(b2);
        a2.findViewById(R.id.tv_content1).setBackground(b3);
        a2.findViewById(R.id.tv_content2).setBackground(b3);
        a2.findViewById(R.id.tv_content3).setBackground(b3);
        a2.findViewById(R.id.tv_content4).setBackground(b3);
        a2.findViewById(R.id.tv_content5).setBackground(b3);
    }
}
