package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private List<TextView> b;

    public void a(@NonNull Context context, GoodsSpu goodsSpu, SCSingleLineFlowLayout sCSingleLineFlowLayout) {
        Object[] objArr = {context, goodsSpu, sCSingleLineFlowLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd8e9414f0bb2e234673e71dda9ae63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd8e9414f0bb2e234673e71dda9ae63");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        a(sCSingleLineFlowLayout);
        sCSingleLineFlowLayout.removeAllViews();
        sCSingleLineFlowLayout.setVisibility(0);
        for (int i = 0; i < 6; i++) {
            String str = "";
            if (i == 0) {
                if (!t.a((String) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.productAttrLabel.attrLabelList, i))) {
                    str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.productAttrLabel.attrLabelList, i);
                }
            } else if (!t.a((String) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.productAttrLabel.attrLabelList, i))) {
                str = "｜" + ((String) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.productAttrLabel.attrLabelList, i));
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TextView a2 = a(context);
            a2.setText(str);
            a2.setTextColor(b.a().getResources().getColor(R.color.wm_sg_color_858687));
            sCSingleLineFlowLayout.addView(a2);
        }
        if (sCSingleLineFlowLayout.getChildCount() == 0) {
            sCSingleLineFlowLayout.setVisibility(8);
        }
    }

    private void a(SCSingleLineFlowLayout sCSingleLineFlowLayout) {
        Object[] objArr = {sCSingleLineFlowLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb904f63308b09edae1abdca33080b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb904f63308b09edae1abdca33080b2");
            return;
        }
        int childCount = sCSingleLineFlowLayout.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            this.b.add((TextView) sCSingleLineFlowLayout.getChildAt(i));
        }
        sCSingleLineFlowLayout.removeAllViewsInLayout();
    }

    private TextView a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26bfd37ce57cf2c34ce989749ecf96dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26bfd37ce57cf2c34ce989749ecf96dd");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            TextView textView = new TextView(context);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(0, b.a().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12));
            textView.setIncludeFontPadding(false);
            textView.setGravity(16);
            return textView;
        }
        return this.b.remove(this.b.size() - 1);
    }
}
