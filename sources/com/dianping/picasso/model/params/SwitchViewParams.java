package com.dianping.picasso.model.params;

import android.content.res.ColorStateList;
import android.graphics.Color;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.SwitchModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwitchViewParams extends PicassoModelParams<SwitchModel> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ColorStateList thumbTintList;
    public ColorStateList trackTintList;

    @Override // com.dianping.picasso.model.params.PicassoModelParams
    public void switchModel(SwitchModel switchModel) {
        Object[] objArr = {switchModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51393bf60fcc236cb680837af9f8d90c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51393bf60fcc236cb680837af9f8d90c");
            return;
        }
        super.switchModel((SwitchViewParams) switchModel);
        int parseColor = PicassoUtils.isValidColor(switchModel.thumbTintColor) ? Color.parseColor(switchModel.thumbTintColor) : -1;
        int parseColor2 = Color.parseColor(PicassoUtils.isValidColor(switchModel.tintColor) ? switchModel.tintColor : "#e6e6e6");
        int parseColor3 = Color.parseColor(PicassoUtils.isValidColor(switchModel.onTintColor) ? switchModel.onTintColor : "#52d769");
        this.thumbTintList = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{parseColor, parseColor});
        this.trackTintList = new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{parseColor3, parseColor2});
    }
}
