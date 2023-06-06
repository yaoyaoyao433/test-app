package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TextViewCommandModel extends BaseViewCommandModel {
    public static final DecodingFactory<TextViewCommandModel> PICASSO_DECODER = new DecodingFactory<TextViewCommandModel>() { // from class: com.dianping.picasso.view.command.TextViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final TextViewCommandModel[] createArray(int i) {
            return new TextViewCommandModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final TextViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc27f0bb25d608cb40ad1069abe77c2f", RobustBitConfig.DEFAULT_VALUE) ? (TextViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc27f0bb25d608cb40ad1069abe77c2f") : new TextViewCommandModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String text;
    public String textColor;
    public Float textSize;

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc4d67d436478c42a31c033887abf6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc4d67d436478c42a31c033887abf6d9");
        } else if (i == 11830) {
            this.textColor = unarchived.readString();
        } else if (i != 15054) {
            if (i == 17709) {
                this.text = unarchived.readString();
            } else {
                super.readExtraProperty(i, unarchived);
            }
        } else {
            float readDouble = (float) unarchived.readDouble();
            if (readDouble <= 1.0E-8d) {
                readDouble = 14.0f;
            }
            this.textSize = Float.valueOf(readDouble);
        }
    }
}
