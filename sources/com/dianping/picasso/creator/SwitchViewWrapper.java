package com.dianping.picasso.creator;

import android.content.Context;
import android.widget.CompoundButton;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.SwitchModel;
import com.dianping.picasso.model.params.SwitchViewParams;
import com.dianping.picasso.view.PicassoSwitchView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwitchViewWrapper extends BaseViewWrapper<PicassoSwitchView, SwitchModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoSwitchView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90f499e6d433b9e51a9cb4ea93cb28b6", RobustBitConfig.DEFAULT_VALUE) ? (PicassoSwitchView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90f499e6d433b9e51a9cb4ea93cb28b6") : new PicassoSwitchView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoSwitchView picassoSwitchView, PicassoView picassoView, SwitchModel switchModel, SwitchModel switchModel2) {
        Object[] objArr = {picassoSwitchView, picassoView, switchModel, switchModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f4211c6b2fe10271beb984d13a8b45b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f4211c6b2fe10271beb984d13a8b45b");
            return;
        }
        picassoSwitchView.setInUpdating(true);
        picassoSwitchView.setChecked(switchModel.on);
        picassoSwitchView.setSwitchMinWidth(switchModel.getViewParams().width);
        picassoSwitchView.setThumbTintList(((SwitchViewParams) switchModel.getViewParams()).thumbTintList);
        picassoSwitchView.setTrackTintList(((SwitchViewParams) switchModel.getViewParams()).trackTintList);
        picassoSwitchView.setInUpdating(false);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoSwitchView picassoSwitchView, SwitchModel switchModel) {
        Object[] objArr = {picassoSwitchView, switchModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a0207d2c7c3bea636195d95ea9be6b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a0207d2c7c3bea636195d95ea9be6b9");
        } else {
            picassoSwitchView.setOnCheckedChangeListener(null);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(final PicassoSwitchView picassoSwitchView, final SwitchModel switchModel, final String str) {
        Object[] objArr = {picassoSwitchView, switchModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e9c0e8df9b39f04f127ad46767e6060", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e9c0e8df9b39f04f127ad46767e6060")).booleanValue();
        }
        if ("onSwitch".equals(str)) {
            picassoSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.dianping.picasso.creator.SwitchViewWrapper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85968886c1ffeeb48d3e0bc0bd96bc79", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85968886c1ffeeb48d3e0bc0bd96bc79");
                    } else if (picassoSwitchView.isInUpdating()) {
                    } else {
                        SwitchViewWrapper.this.callAction(switchModel, str, new JSONBuilder().put("isOn", Boolean.valueOf(z)).toJSONObject());
                    }
                }
            });
            return true;
        }
        return super.bindAction((SwitchViewWrapper) picassoSwitchView, (PicassoSwitchView) switchModel, str);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<SwitchModel> getDecodingFactory() {
        return SwitchModel.PICASSO_DECODER;
    }
}
