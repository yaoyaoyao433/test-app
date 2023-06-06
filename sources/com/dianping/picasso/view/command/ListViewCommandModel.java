package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.model.IndexPathModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListViewCommandModel extends BaseViewCommandModel {
    public static final DecodingFactory<ListViewCommandModel> PICASSO_DECODER = new DecodingFactory<ListViewCommandModel>() { // from class: com.dianping.picasso.view.command.ListViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListViewCommandModel[] createArray(int i) {
            return new ListViewCommandModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "615cbd3aaf5555b0f32127b31aa7370b", RobustBitConfig.DEFAULT_VALUE) ? (ListViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "615cbd3aaf5555b0f32127b31aa7370b") : new ListViewCommandModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public ContentOffsetModel contentOffsetModel;
    public Boolean needStopScroll;
    public Boolean scrollEnable;
    public IndexPathModel scrollToIndexPath;

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a133df2c340147846b85506c57ec58e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a133df2c340147846b85506c57ec58e");
        } else if (i == 20847) {
            this.needStopScroll = Boolean.TRUE;
            super.readExtraProperty(i, unarchived);
        } else if (i == 34412) {
            this.contentOffsetModel = (ContentOffsetModel) unarchived.readObject(ContentOffsetModel.PICASSO_DECODER);
        } else if (i == 58063) {
            this.scrollToIndexPath = (IndexPathModel) unarchived.readObject(IndexPathModel.PICASSO_DECODER);
        } else if (i == 60080 && 79 == unarchived.peek() && 60080 == unarchived.readMemberHash16()) {
            this.scrollEnable = Boolean.valueOf(unarchived.readBoolean());
        }
    }
}
