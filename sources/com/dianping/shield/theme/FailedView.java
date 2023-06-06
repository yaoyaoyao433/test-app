package com.dianping.shield.theme;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FailedView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public FailedView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2751c12bcf9022498106ab3ca4f9f254", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2751c12bcf9022498106ab3ca4f9f254");
        } else {
            init();
        }
    }

    public FailedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "965f48447787db1ba9714c59b3e2fcf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "965f48447787db1ba9714c59b3e2fcf2");
        } else {
            init();
        }
    }

    public FailedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4bbb891c94fbba9b33d1a24fb83935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4bbb891c94fbba9b33d1a24fb83935");
        } else {
            init();
        }
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a62411567bf4398b17e6b67c842716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a62411567bf4398b17e6b67c842716");
            return;
        }
        setOrientation(0);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842829, typedValue, true);
        setMinimumHeight((int) typedValue.getDimension(getContext().getResources().getDisplayMetrics()));
        TextView textView = new TextView(getContext());
        textView.setCompoundDrawablePadding(aq.a(getContext(), 8.0f));
        textView.setGravity(17);
        textView.setText(getContext().getResources().getText(R.string.shielddc_base_loading_error_view));
        textView.setTextColor(getContext().getResources().getColor(R.color.shielddc_light_gray));
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.shielddc_text_size_14));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Drawable drawable = getResources().getDrawable(R.drawable.shieldc_icon_loading_view);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
        addView(textView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(17);
    }
}
