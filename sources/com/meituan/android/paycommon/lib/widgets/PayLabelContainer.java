package com.meituan.android.paycommon.lib.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.paybase.common.analyse.cat.CatCustomInfo;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.android.paybase.widgets.label.LabelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PayLabelContainer extends com.meituan.android.paybase.widgets.label.a {
    public static ChangeQuickRedirect c;

    public PayLabelContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8628403aaeeea49223f61d14dcff62f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8628403aaeeea49223f61d14dcff62f");
        }
    }

    @Override // com.meituan.android.paybase.widgets.label.a
    public final void a(List<Label> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521f8218dba2180f0b79db0d2bf7a6f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521f8218dba2180f0b79db0d2bf7a6f4");
            return;
        }
        i.a((List) list);
        if (i.a((Collection) list)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i >= 0 && i2 >= i) {
                return;
            }
            Label label = list.get(i2);
            LabelView labelView = new LabelView(getContext());
            labelView.setLabel(label);
            addView(labelView);
            labelView.setTag(R.id.paycommon__label_data, label);
        }
    }

    public final void b(List<? extends Label> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8199c80e06c8eba4b789e6000d5d3f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8199c80e06c8eba4b789e6000d5d3f83");
            return;
        }
        i.a((List) list);
        if (i.a((Collection) list)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i >= 0 && i2 >= i) {
                return;
            }
            Label label = list.get(i2);
            LabelView labelView = new LabelView(getContext());
            labelView.setLabel(label);
            addView(labelView);
            labelView.setTag(R.id.paycommon__label_data, label);
        }
    }

    public final void a(List<? extends Label> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237ef190c0c6a158a6530cad14be27f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237ef190c0c6a158a6530cad14be27f7");
        } else {
            b(list, -1);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fae2bb46e73df1c83014d6c9561b5f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fae2bb46e73df1c83014d6c9561b5f0");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    Object tag = childAt.getTag(R.id.paycommon__label_data);
                    if (tag instanceof Label) {
                        Label label = (Label) tag;
                        Object[] objArr2 = {label};
                        ChangeQuickRedirect changeQuickRedirect2 = c;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92ae1a5165adf17bcd7271ab3cbab13a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92ae1a5165adf17bcd7271ab3cbab13a");
                        } else if (label != null && !TextUtils.isEmpty(label.getLabelId())) {
                            CatCustomInfo catCustomInfo = new CatCustomInfo();
                            List<Float> arrayList = new ArrayList<>();
                            arrayList.add(Float.valueOf(1.0f));
                            HashMap hashMap = new HashMap();
                            hashMap.put("active_id", label.getLabelId());
                            StringBuilder sb = new StringBuilder();
                            sb.append(label.getType());
                            hashMap.put("type", sb.toString());
                            hashMap.put("paymentversion", "10.1.0");
                            catCustomInfo.setCustomCommandTagDic(hashMap);
                            catCustomInfo.setCustomCommand("paybiz_promotion_label_show");
                            catCustomInfo.setCustomCommandDurationArray(arrayList);
                            com.meituan.android.paybase.common.analyse.cat.a.a(catCustomInfo);
                        }
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.widgets.label.a, android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8543ce6af3a72a593d88930ab55857db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8543ce6af3a72a593d88930ab55857db");
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
        if (View.MeasureSpec.getMode(i) != 0) {
            view.measure(0, 0);
            if ((((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) - view.getMeasuredWidth()) - i2 < 0) {
                view.setVisibility(8);
                if (view == getChildAt(0)) {
                    setVisibility(8);
                }
            }
        }
    }
}
