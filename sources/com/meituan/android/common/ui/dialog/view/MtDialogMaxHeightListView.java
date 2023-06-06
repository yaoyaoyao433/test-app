package com.meituan.android.common.ui.dialog.view;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.meituan.android.common.ui.utils.UIUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtDialogMaxHeightListView extends ListView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public MtDialogMaxHeightListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a81fef20f65d161d9acd3712a490374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a81fef20f65d161d9acd3712a490374");
        } else {
            this.mContext = context;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92801c47b95ec63d747f65c13264ccb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92801c47b95ec63d747f65c13264ccb8");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(UIUtil.dip2px(this.mContext, 264.0f), Integer.MIN_VALUE));
        }
    }
}
