package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SingleModuleItemViewNew extends c {
    public static ChangeQuickRedirect d;
    private LinearLayout e;

    public SingleModuleItemViewNew(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f592d1e4f9f8377b5e600477f52f83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f592d1e4f9f8377b5e600477f52f83");
        }
    }

    public SingleModuleItemViewNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bced6bb439a8ef09ae760d0e8559dcb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bced6bb439a8ef09ae760d0e8559dcb9");
            return;
        }
        View.inflate(context, R.layout.wm_tmatrix_dynamic_dialog_skeleton_single_module_layout, this);
        this.e = (LinearLayout) findViewById(R.id.module_container);
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c
    public ViewGroup getModuleContainer() {
        return this.e;
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c
    public final ViewGroup a(@NonNull AlertInfo.Module module) {
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66ff425cdcf42bd608228ce01d7b630", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66ff425cdcf42bd608228ce01d7b630");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        AlertInfo.Module.LayoutInfo layoutInfo = module.layoutInfo;
        if (layoutInfo != null) {
            layoutParams.topMargin = layoutInfo.marginTop;
            layoutParams.bottomMargin = layoutInfo.marginBottom;
        }
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
