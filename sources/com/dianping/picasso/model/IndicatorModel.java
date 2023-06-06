package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IndicatorModel extends PicassoModel {
    public static final DecodingFactory<IndicatorModel> DECODER = new DecodingFactory<IndicatorModel>() { // from class: com.dianping.picasso.model.IndicatorModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final IndicatorModel[] createArray(int i) {
            return new IndicatorModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final IndicatorModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c7cefdf22ae73266245da207dd810d", RobustBitConfig.DEFAULT_VALUE) ? (IndicatorModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c7cefdf22ae73266245da207dd810d") : new IndicatorModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean animating;
    public String color;
    public int style;

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b100fe5bfe4195bb7b04f20b9b119c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b100fe5bfe4195bb7b04f20b9b119c0c");
        } else if (i == 7006) {
            this.animating = unarchived.readBoolean();
        } else if (i == 7601) {
            this.style = (int) unarchived.readDouble();
        } else if (i == 12131) {
            this.color = unarchived.readString();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }
}
