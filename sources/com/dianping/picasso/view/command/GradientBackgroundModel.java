package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GradientBackgroundModel implements Decoding {
    public static final DecodingFactory<GradientBackgroundModel> PICASSO_DECODER = new DecodingFactory<GradientBackgroundModel>() { // from class: com.dianping.picasso.view.command.GradientBackgroundModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final GradientBackgroundModel[] createArray(int i) {
            return new GradientBackgroundModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final GradientBackgroundModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d583c030e909968b64ad92bbf5cd19b", RobustBitConfig.DEFAULT_VALUE) ? (GradientBackgroundModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d583c030e909968b64ad92bbf5cd19b") : new GradientBackgroundModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String endColor;
    public int orientation;
    public String startColor;

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ec8e4156d9e5faea18038b6d68fd922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ec8e4156d9e5faea18038b6d68fd922");
            return;
        }
        while (true) {
            try {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 <= 0) {
                    return;
                }
                if (readMemberHash16 == 1864) {
                    this.endColor = unarchived.readString();
                } else if (readMemberHash16 == 59425) {
                    this.startColor = unarchived.readString();
                } else if (readMemberHash16 == 62928) {
                    this.orientation = (int) unarchived.readDouble();
                }
            } catch (ArchiveException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
