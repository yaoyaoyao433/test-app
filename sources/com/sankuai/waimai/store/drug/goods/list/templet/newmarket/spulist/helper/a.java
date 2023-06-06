package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.helper;

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

    public void a(GoodsSpu goodsSpu, SCSingleLineFlowLayout sCSingleLineFlowLayout) {
        Object[] objArr = {goodsSpu, sCSingleLineFlowLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974752ae5e61019e3f691d6878ecfd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974752ae5e61019e3f691d6878ecfd01");
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
            TextView a2 = a();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c157d8487364bbadbcf9cf696090459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c157d8487364bbadbcf9cf696090459");
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

    private TextView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc379440e4788014f73cb74f39130706", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc379440e4788014f73cb74f39130706");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            TextView textView = new TextView(b.a());
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(0, b.a().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11));
            textView.setIncludeFontPadding(false);
            textView.setGravity(16);
            return textView;
        }
        return this.b.remove(this.b.size() - 1);
    }
}
