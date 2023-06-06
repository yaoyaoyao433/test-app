package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollViewCommandModel extends BaseViewCommandModel {
    public static final DecodingFactory<ScrollViewCommandModel> PICASSO_DECODER = new DecodingFactory<ScrollViewCommandModel>() { // from class: com.dianping.picasso.view.command.ScrollViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ScrollViewCommandModel[] createArray(int i) {
            return new ScrollViewCommandModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ScrollViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7c1b4ca0b203e1d151978aef22927df", RobustBitConfig.DEFAULT_VALUE) ? (ScrollViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7c1b4ca0b203e1d151978aef22927df") : new ScrollViewCommandModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public ContentOffsetModel contentOffsetModel;

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c448514791034a7ac5b3eb7916e2394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c448514791034a7ac5b3eb7916e2394");
            return;
        }
        if (i == 34412) {
            this.contentOffsetModel = (ContentOffsetModel) unarchived.readObject(ContentOffsetModel.PICASSO_DECODER);
        }
        super.readExtraProperty(i, unarchived);
    }
}
