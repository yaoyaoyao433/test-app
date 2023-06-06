package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FullyDynamicDialogContentView extends d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SingleModuleItemView moduleView;

    public FullyDynamicDialogContentView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b2df0985b88288191a659fce439e0f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b2df0985b88288191a659fce439e0f1");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public FullyDynamicDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb03240f2809f8885c601805d9ff9ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb03240f2809f8885c601805d9ff9ca4");
            return;
        }
        inflate(context, R.layout.wm_dynamic_dialog_skeleton_fully_dynamic_content_layout, this);
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad3dc6d034e817629305cb09603f465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad3dc6d034e817629305cb09603f465");
        } else {
            this.moduleView = (SingleModuleItemView) findViewById(R.id.module_view);
        }
    }

    public View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ba24a83a6e7207a322743db5a1a403", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ba24a83a6e7207a322743db5a1a403");
        }
        if (this.moduleView == null) {
            return null;
        }
        return this.moduleView.getContentView();
    }

    public View getBgView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3a5c3766cf04c42fa87c63d959cfdf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3a5c3766cf04c42fa87c63d959cfdf5");
        }
        if (this.moduleView == null) {
            return null;
        }
        return this.moduleView.getBgView();
    }

    public Map<String, View> getMachTagViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc40eaf73290beb8754cc587f8e70b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc40eaf73290beb8754cc587f8e70b1");
        }
        if (this.moduleView == null) {
            return null;
        }
        return this.moduleView.getTagViews();
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.d
    public void refresh(AlertInfo alertInfo, @NonNull j jVar) {
        Object[] objArr = {alertInfo, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42ca3e8c69dd68841f36ba1e78a22dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42ca3e8c69dd68841f36ba1e78a22dd4");
        } else if (alertInfo != null) {
            this.moduleView.refresh(alertInfo.modules, jVar);
        } else {
            jVar.a();
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.c
    public void attachDialogContext(@NonNull DynamicDialog.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfde1ac18908b3b66808d3ea32b1d6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfde1ac18908b3b66808d3ea32b1d6a9");
            return;
        }
        super.attachDialogContext(dVar);
        this.moduleView.attachDialogContext(dVar);
    }
}
