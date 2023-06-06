package com.dianping.shield.debug.node;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeTitleLayout extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView applyView;
    private View.OnClickListener onClickListener;
    private String title;

    public NodeTitleLayout(Context context, String str, View.OnClickListener onClickListener) {
        super(context);
        Object[] objArr = {context, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bdce5275424ce6b98f8ccdecc462b14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bdce5275424ce6b98f8ccdecc462b14");
            return;
        }
        this.onClickListener = onClickListener;
        this.title = str;
        initView();
    }

    public NodeTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3633236dcac3b2b314f9b33eac42f615", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3633236dcac3b2b314f9b33eac42f615");
        } else {
            initView();
        }
    }

    public NodeTitleLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc8c0e03c5b1e354a9021263f6217466", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc8c0e03c5b1e354a9021263f6217466");
        } else {
            initView();
        }
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f3254c150955948c1f89c3fe3f76f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f3254c150955948c1f89c3fe3f76f2");
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.setMargins(30, 30, 30, 30);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(3);
        textView.setText(this.title);
        textView.setTextColor(getResources().getColor(R.color.shieldc_titlebar_title_color));
        textView.setTextSize(2, 16.0f);
        addView(textView);
        this.applyView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(30, 30, 30, 30);
        this.applyView.setLayoutParams(layoutParams2);
        this.applyView.setGravity(5);
        this.applyView.setText("应用");
        this.applyView.setTextColor(getResources().getColor(R.color.dark_red_text));
        this.applyView.setOnClickListener(this.onClickListener);
        addView(this.applyView);
    }
}
