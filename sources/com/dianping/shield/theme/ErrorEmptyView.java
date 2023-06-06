package com.dianping.shield.theme;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ErrorEmptyView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ErrorEmptyView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed090f826e3a9ad9d27862ad96befa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed090f826e3a9ad9d27862ad96befa4");
        } else {
            init();
        }
    }

    public ErrorEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "833786873233fed3b7caab5942a9ccdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "833786873233fed3b7caab5942a9ccdd");
        } else {
            init();
        }
    }

    public ErrorEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9c101ef7053a5d3cf283ddd753eef41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9c101ef7053a5d3cf283ddd753eef41");
        } else {
            init();
        }
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22f6d7203d436b37a0cb336904df1c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22f6d7203d436b37a0cb336904df1c28");
            return;
        }
        setOrientation(1);
        setGravity(17);
        setPadding(aq.a(getContext(), 16.0f), aq.a(getContext(), 16.0f), aq.a(getContext(), 16.0f), aq.a(getContext(), 16.0f));
        inflate(getContext(), R.layout.shielddc_base_info_empty_view, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
