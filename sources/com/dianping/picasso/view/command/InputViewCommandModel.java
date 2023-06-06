package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InputViewCommandModel extends BaseViewCommandModel {
    public static final DecodingFactory<InputViewCommandModel> PICASSO_DECODER = new DecodingFactory<InputViewCommandModel>() { // from class: com.dianping.picasso.view.command.InputViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final InputViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65842b25de391f8b15bd5ec8e58fdb25", RobustBitConfig.DEFAULT_VALUE) ? (InputViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65842b25de391f8b15bd5ec8e58fdb25") : new InputViewCommandModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final InputViewCommandModel[] createArray(int i) {
            return new InputViewCommandModel[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean clearText;
    public Integer cursorIndex;
    public Boolean hasFocus;

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "606ffe93c471facba433ca85331f8e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "606ffe93c471facba433ca85331f8e4b");
        } else if (i == 33050) {
            this.clearText = Boolean.TRUE;
        } else if (i == 34138) {
            if (79 == unarchived.peek() && 51996 == unarchived.readMemberHash16()) {
                this.cursorIndex = Integer.valueOf((int) unarchived.readDouble());
            }
        } else if (i == 38539) {
            this.hasFocus = Boolean.FALSE;
        } else if (i == 64290) {
            this.hasFocus = Boolean.TRUE;
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }
}
