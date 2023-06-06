package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ButtonModel extends PicassoModel {
    public static final DecodingFactory<ButtonModel> PICASSO_DECODER = new DecodingFactory<ButtonModel>() { // from class: com.dianping.picasso.model.ButtonModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ButtonModel[] createArray(int i) {
            return new ButtonModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ButtonModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1617021d2c7a983481544da499dda42", RobustBitConfig.DEFAULT_VALUE) ? (ButtonModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1617021d2c7a983481544da499dda42") : new ButtonModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public String clickedColor;
    @Expose
    public String data;
    @Expose
    public String schema;

    public ButtonModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b9b7d6ec69aacd81bd3ee53342fd659", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b9b7d6ec69aacd81bd3ee53342fd659");
            return;
        }
        this.schema = "";
        this.data = "";
        this.clickedColor = "";
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "692332aa2f24b9bf12b4b4093f7dafaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "692332aa2f24b9bf12b4b4093f7dafaf");
        } else if (i == 13729) {
            this.schema = unarchived.readString();
        } else if (i == 44924) {
            this.clickedColor = unarchived.readString();
        } else if (i == 61354) {
            this.data = unarchived.readString();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }
}
