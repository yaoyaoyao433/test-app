package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.support.annotation.Keep;
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
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SingleModuleItemView extends DialogModuleView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinearLayout moduleContainer;

    public SingleModuleItemView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84fe0afd59eaedbbf174bcc58505fcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84fe0afd59eaedbbf174bcc58505fcc");
        }
    }

    public SingleModuleItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a66ff1ab4a5c0a9b4e240df85b26558a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a66ff1ab4a5c0a9b4e240df85b26558a");
            return;
        }
        View.inflate(context, R.layout.wm_dynamic_dialog_skeleton_single_module_layout, this);
        this.moduleContainer = (LinearLayout) findViewById(R.id.module_container);
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public ViewGroup getModuleContainer() {
        return this.moduleContainer;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public ViewGroup createModuleItemView(@NonNull AlertInfo.Module module) {
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eb87d46e2393f26c87b48659def907e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eb87d46e2393f26c87b48659def907e");
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

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView
    public void refresh(List<AlertInfo.Module> list, @NonNull j jVar) {
        Object[] objArr = {list, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9163c6d593177c3a2a00e3b744da4653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9163c6d593177c3a2a00e3b744da4653");
        } else if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            jVar.a();
        } else {
            super.refresh(Collections.singletonList(list.get(0)), jVar);
        }
    }
}
