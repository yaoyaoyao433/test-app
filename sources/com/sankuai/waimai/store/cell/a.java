package com.sankuai.waimai.store.cell;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.TopNumberAndPrivacyTag;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Context context, @NonNull TextView textView, TopNumberAndPrivacyTag topNumberAndPrivacyTag, Drawable drawable) {
        Object[] objArr = {context, textView, topNumberAndPrivacyTag, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6f082f02a3acaca22a1ff1d84d7d680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6f082f02a3acaca22a1ff1d84d7d680");
        } else if (topNumberAndPrivacyTag == null) {
        } else {
            u.a(textView, topNumberAndPrivacyTag.labelText);
            textView.setTextColor(d.a(topNumberAndPrivacyTag.labelTextColor, context.getResources().getColor(R.color.wm_sg_color_FFFFFF)));
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setStroke(h.a(context, 0.5f), d.a(topNumberAndPrivacyTag.labelBorderColor, context.getResources().getColor(R.color.wm_sg_color_FFFFFF)));
                textView.setBackground(drawable);
            }
        }
    }
}
