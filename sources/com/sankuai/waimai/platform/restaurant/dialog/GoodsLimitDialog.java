package com.sankuai.waimai.platform.restaurant.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GoodsLimitDialog extends BaseDialogWithCloseIcon {
    public static ChangeQuickRedirect d;
    private TextView a;
    public String e;
    public CharSequence[] f;

    public GoodsLimitDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86743ae06a6ddf7b8812f24982d776c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86743ae06a6ddf7b8812f24982d776c");
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon, android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17a8e2d9b2d565594031acc255788d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17a8e2d9b2d565594031acc255788d8");
            return;
        }
        super.onCreate(bundle);
        this.a = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.wm_restaurant_goods_limit_dialog, (ViewGroup) null).findViewById(R.id.tv_googs_limit);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int a = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(com.meituan.android.singleton.b.a, 15);
        layoutParams.leftMargin = a;
        layoutParams.rightMargin = a;
        a(this.a, layoutParams);
        this.a.setText(a(getContext(), this.e, R.color.wm_restaurant_dialog_highlight_color, this.f));
    }

    private static SpannableString a(Context context, CharSequence charSequence, int i, CharSequence... charSequenceArr) {
        Object[] objArr = {context, charSequence, Integer.valueOf((int) R.color.wm_restaurant_dialog_highlight_color), charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f39d3e6d30e2d51d0e697d68fe38eed0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f39d3e6d30e2d51d0e697d68fe38eed0");
        }
        if (charSequence == null) {
            return new SpannableString("");
        }
        String charSequence2 = charSequence.toString();
        SpannableString spannableString = new SpannableString(charSequence2);
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            for (CharSequence charSequence3 : charSequenceArr) {
                if (!TextUtils.isEmpty(charSequence3)) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(R.color.wm_restaurant_dialog_highlight_color));
                    int indexOf = charSequence2.indexOf(charSequence3.toString());
                    spannableString.setSpan(foregroundColorSpan, indexOf, charSequence3.toString().length() + indexOf, 34);
                }
            }
        }
        return spannableString;
    }
}
