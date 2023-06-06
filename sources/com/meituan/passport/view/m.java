package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int b;

    public m(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2219150c733dfedadc72864352d4c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2219150c733dfedadc72864352d4c5");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c2beddf1aac0bc2d3bdbf3c8a96caf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c2beddf1aac0bc2d3bdbf3c8a96caf3");
            return;
        }
        setOrientation(1);
        this.b = Utils.b(getContext());
    }

    public final m a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c49067b77c6b3df7fd269d06c163d64", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c49067b77c6b3df7fd269d06c163d64");
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(getResources().getColor(R.color.passport_black2));
        textView.setTextSize(2, 16.0f);
        textView.setPadding(getResources().getDimensionPixelOffset(R.dimen.passport_dialog_left_right_padding), getResources().getDimensionPixelOffset(R.dimen.passport_dialog_message_top_padding), getResources().getDimensionPixelOffset(R.dimen.passport_dialog_left_right_padding), getResources().getDimensionPixelOffset(R.dimen.passport_dialog_message_bottom_padding));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(textView, 0);
        return this;
    }

    public final m a(@StringRes int i, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "804be9d9bc89142cc9979afd0be5e740", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "804be9d9bc89142cc9979afd0be5e740") : a(getContext().getResources().getString(i), onClickListener);
    }

    private m a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620edbd455f0833783656c81fdbc2218", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620edbd455f0833783656c81fdbc2218");
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(this.b);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(5);
        textView.setPadding(0, 0, getResources().getDimensionPixelOffset(R.dimen.passport_dialog_button_right_padding), 0);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(R.dimen.passport_dialog_button_height)));
        textView.setOnClickListener(onClickListener);
        addView(textView);
        return this;
    }
}
