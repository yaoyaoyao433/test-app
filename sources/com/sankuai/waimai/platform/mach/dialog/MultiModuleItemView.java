package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MultiModuleItemView extends DialogModuleView {
    public static ChangeQuickRedirect a;
    private int b;
    private LinearLayout c;

    public MultiModuleItemView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce95e1e90ebfc6f8fb44a65e52a3f9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce95e1e90ebfc6f8fb44a65e52a3f9a");
        }
    }

    public MultiModuleItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d78ccf824775853191de6c1390c2b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d78ccf824775853191de6c1390c2b8");
            return;
        }
        inflate(context, R.layout.wm_dynamic_dialog_skeleton_multi_module_layout, this);
        ((NestedScrollView) findViewById(R.id.scrollview)).setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.platform.mach.dialog.MultiModuleItemView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bd93289ef9cf13ac59dbc8984a7cbea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bd93289ef9cf13ac59dbc8984a7cbea");
                } else {
                    MultiModuleItemView.this.tryExposeModules();
                }
            }
        });
        this.c = (LinearLayout) findViewById(R.id.module_container);
        this.b = com.sankuai.waimai.foundation.utils.g.c(context);
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public ViewGroup getModuleContainer() {
        return this.c;
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9309649add4ee8f32118f465aa23f1f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9309649add4ee8f32118f465aa23f1f7");
        } else if (i > 0) {
            this.b = i;
            requestLayout();
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public ViewGroup createModuleItemView(@NonNull AlertInfo.Module module) {
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe41dc89913395e3e5fbef63c4b2e3b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe41dc89913395e3e5fbef63c4b2e3b6");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AlertInfo.Module.LayoutInfo layoutInfo = module.layoutInfo;
        if (layoutInfo != null) {
            layoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), layoutInfo.marginTop);
            layoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), layoutInfo.marginBottom);
        }
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800371cc0a0b7d2dc111f676af996bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800371cc0a0b7d2dc111f676af996bd7");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.b), Integer.MIN_VALUE));
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public void refresh(List<AlertInfo.Module> list, j jVar) {
        Object[] objArr = {list, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b414aa5f99775fc092c26dc7f2c8d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b414aa5f99775fc092c26dc7f2c8d4");
        } else {
            super.refresh(list, jVar);
        }
    }
}
