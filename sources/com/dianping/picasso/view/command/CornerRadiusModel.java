package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CornerRadiusModel extends BaseViewCommandModel {
    public static final DecodingFactory<CornerRadiusModel> PICASSO_DECODER = new DecodingFactory<CornerRadiusModel>() { // from class: com.dianping.picasso.view.command.CornerRadiusModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final CornerRadiusModel[] createArray(int i) {
            return new CornerRadiusModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final CornerRadiusModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea44a3383606919f2b807ed71f9f491", RobustBitConfig.DEFAULT_VALUE) ? (CornerRadiusModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea44a3383606919f2b807ed71f9f491") : new CornerRadiusModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public float cornerRadius;
    public Boolean cornerRadiusLB;
    public Boolean cornerRadiusLT;
    public Boolean cornerRadiusRB;
    public Boolean cornerRadiusRT;

    public CornerRadiusModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "421d7304fbe44bbb0dac35ff881b572a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "421d7304fbe44bbb0dac35ff881b572a");
        } else {
            this.cornerRadius = 0.0f;
        }
    }

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel, com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "637e42145cdc8b602832a05262affe96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "637e42145cdc8b602832a05262affe96");
            return;
        }
        while (true) {
            try {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 <= 0) {
                    return;
                }
                if (readMemberHash16 == 409) {
                    this.cornerRadiusRT = Boolean.valueOf(unarchived.readBoolean());
                } else if (readMemberHash16 == 17255) {
                    this.cornerRadiusRB = Boolean.valueOf(unarchived.readBoolean());
                } else if (readMemberHash16 == 27794) {
                    this.cornerRadius = (float) unarchived.readDouble();
                } else if (readMemberHash16 == 50450) {
                    this.cornerRadiusLB = Boolean.valueOf(unarchived.readBoolean());
                } else if (readMemberHash16 == 55246) {
                    this.cornerRadiusLT = Boolean.valueOf(unarchived.readBoolean());
                }
            } catch (ArchiveException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
