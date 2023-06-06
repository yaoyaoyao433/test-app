package com.dianping.picasso.view.command;

import com.dianping.codelog.b;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ContentOffsetModel implements Decoding {
    public static final DecodingFactory<ContentOffsetModel> PICASSO_DECODER = new DecodingFactory<ContentOffsetModel>() { // from class: com.dianping.picasso.view.command.ContentOffsetModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ContentOffsetModel[] createArray(int i) {
            return new ContentOffsetModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ContentOffsetModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99b2b38e002958fb6627f79dc3acb33", RobustBitConfig.DEFAULT_VALUE) ? (ContentOffsetModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99b2b38e002958fb6627f79dc3acb33") : new ContentOffsetModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean animate;
    public Float x;
    public Float y;

    public ContentOffsetModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb2d08e31f82ecfcf3b66d29c6efa64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb2d08e31f82ecfcf3b66d29c6efa64");
            return;
        }
        this.x = null;
        this.y = null;
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25554f42f47ca6aefa6f2a446a93d155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25554f42f47ca6aefa6f2a446a93d155");
            return;
        }
        while (true) {
            try {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 <= 0) {
                    return;
                }
                if (readMemberHash16 != 13025) {
                    switch (readMemberHash16) {
                        case 120:
                            this.x = Float.valueOf((float) unarchived.readDouble());
                            continue;
                        case 121:
                            this.y = Float.valueOf((float) unarchived.readDouble());
                            continue;
                        default:
                            readExtraProperty(readMemberHash16, unarchived);
                            continue;
                    }
                } else {
                    this.animate = Boolean.valueOf(unarchived.readBoolean());
                }
            } catch (ArchiveException e) {
                b.b(PicassoModel.class, e.getMessage());
                return;
            }
        }
    }

    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dca2218c25a65aa533d4391c91f69f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dca2218c25a65aa533d4391c91f69f92");
        } else {
            unarchived.skipAny();
        }
    }
}
