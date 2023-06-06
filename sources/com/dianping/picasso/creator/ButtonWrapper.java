package com.dianping.picasso.creator;

import android.content.Context;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.ButtonModel;
import com.dianping.picasso.view.PicassoButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ButtonWrapper extends BaseViewWrapper<PicassoButton, ButtonModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoButton createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcd53df0f3d4d29f489311e13160dbbc", RobustBitConfig.DEFAULT_VALUE) ? (PicassoButton) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcd53df0f3d4d29f489311e13160dbbc") : new PicassoButton(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoButton picassoButton, PicassoView picassoView, ButtonModel buttonModel, ButtonModel buttonModel2) {
        Object[] objArr = {picassoButton, picassoView, buttonModel, buttonModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b7f67db2a024f0f4fc891d53027a5b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b7f67db2a024f0f4fc891d53027a5b8");
        } else {
            picassoButton.setClickColor(buttonModel.clickedColor, buttonModel);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<ButtonModel> getDecodingFactory() {
        return ButtonModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoButton picassoButton, final ButtonModel buttonModel, final String str) {
        Object[] objArr = {picassoButton, buttonModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d49f4a75e2110d406ac18d4d356d3d51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d49f4a75e2110d406ac18d4d356d3d51")).booleanValue();
        }
        if ("longPress".equals(str)) {
            picassoButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.dianping.picasso.creator.ButtonWrapper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd839c597570f827d2e57e7dc7afcf80", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd839c597570f827d2e57e7dc7afcf80")).booleanValue();
                    }
                    ButtonWrapper.this.callAction(buttonModel, str, null);
                    return true;
                }
            });
            picassoButton.setLongClickable(true);
            return true;
        } else if (bindClickAction(picassoButton, buttonModel, str)) {
            return true;
        } else {
            return super.bindAction((ButtonWrapper) picassoButton, (PicassoButton) buttonModel, str);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoButton picassoButton, ButtonModel buttonModel) {
        Object[] objArr = {picassoButton, buttonModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7e539f6807ad2b85b19c806ee23f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7e539f6807ad2b85b19c806ee23f29");
            return;
        }
        picassoButton.setOnLongClickListener(null);
        picassoButton.setOnClickListener(null);
    }
}
