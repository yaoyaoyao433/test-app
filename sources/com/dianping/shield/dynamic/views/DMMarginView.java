package com.dianping.shield.dynamic.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.objects.DynamicModuleMargin;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMMarginView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DMMarginView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d904cc71ef6d64300e6ba1623e0b8864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d904cc71ef6d64300e6ba1623e0b8864");
        }
    }

    public DMMarginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7371e81dd2a395c2031dfe82133dff8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7371e81dd2a395c2031dfe82133dff8d");
        }
    }

    public void setMargin(DynamicModuleMargin dynamicModuleMargin, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        Object[] objArr = {dynamicModuleMargin, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fe2fed68bd7b518547ec8c9d11dd0d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fe2fed68bd7b518547ec8c9d11dd0d5");
        } else if (dynamicModuleMargin == null) {
            if (z) {
                setGravity(17);
            } else {
                setGravity(51);
            }
        } else {
            if (dynamicModuleMargin.right != Integer.MIN_VALUE) {
                i = aq.a(getContext(), dynamicModuleMargin.right);
                i2 = 5;
            } else {
                i = 0;
                i2 = 17;
            }
            if (dynamicModuleMargin.left != Integer.MIN_VALUE) {
                i4 = aq.a(getContext(), dynamicModuleMargin.left);
                i3 = 3;
            } else {
                i3 = i2;
                i4 = 0;
            }
            if (dynamicModuleMargin.bottom != Integer.MIN_VALUE) {
                i5 = aq.a(getContext(), dynamicModuleMargin.bottom);
                i6 = 80;
            } else {
                i5 = 0;
                i6 = 17;
            }
            if (dynamicModuleMargin.top != Integer.MIN_VALUE) {
                i7 = aq.a(getContext(), dynamicModuleMargin.top);
                i6 = 48;
            }
            setPadding(i4, i7, i, i5);
            setGravity(i3 | i6);
        }
    }

    public void setMargin(DynamicModuleMargin dynamicModuleMargin) {
        Object[] objArr = {dynamicModuleMargin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0700568e8c3450f127b306edf47fba0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0700568e8c3450f127b306edf47fba0f");
        } else {
            setMargin(dynamicModuleMargin, false);
        }
    }
}
