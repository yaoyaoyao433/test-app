package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.model.params.SwitchViewParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwitchModel extends PicassoModel {
    public static final DecodingFactory<SwitchModel> PICASSO_DECODER = new DecodingFactory<SwitchModel>() { // from class: com.dianping.picasso.model.SwitchModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final SwitchModel[] createArray(int i) {
            return new SwitchModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final SwitchModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba879c4b14067bc4f88c2a0be8d9913", RobustBitConfig.DEFAULT_VALUE) ? (SwitchModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba879c4b14067bc4f88c2a0be8d9913") : new SwitchModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean on;
    public String onTintColor;
    public String thumbTintColor;
    public String tintColor;

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4cdd618e462dfd61772cbd1c7ef99a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4cdd618e462dfd61772cbd1c7ef99a6");
        } else if (i == 3551) {
            this.on = unarchived.readBoolean();
        } else if (i == 37160) {
            this.tintColor = unarchived.readString();
        } else if (i == 45042) {
            this.thumbTintColor = unarchived.readString();
        } else if (i == 52745) {
            this.onTintColor = unarchived.readString();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void switchModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751d2996b412363237e33d234084a97c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751d2996b412363237e33d234084a97c");
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = new SwitchViewParams();
        }
        this.viewParams.switchModel(this);
    }
}
