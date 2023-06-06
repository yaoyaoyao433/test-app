package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CountLoadingView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private ProgressBar c;

    public CountLoadingView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88a120302d5ace2b43f662fc2629881", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88a120302d5ace2b43f662fc2629881");
        } else {
            a();
        }
    }

    public CountLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea941a19c163b9ccbf763907c628740e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea941a19c163b9ccbf763907c628740e");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89049f83b4ed634fd2a8accc2a6f3158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89049f83b4ed634fd2a8accc2a6f3158");
            return;
        }
        View inflate = View.inflate(getContext(), R.layout.commonui_count_loading_item, null);
        addView(inflate);
        this.b = (TextView) inflate.findViewById(R.id.loading_item_count);
        this.c = (ProgressBar) inflate.findViewById(R.id.loading_item_progress);
    }

    public void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cfbd8592d5ae36a5413bb96ab4d839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cfbd8592d5ae36a5413bb96ab4d839");
        } else {
            this.b.setText(charSequence);
        }
    }
}
