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
public class BaseViewCommandModel implements Decoding {
    public static final DecodingFactory<BaseViewCommandModel> PICASSO_DECODER = new DecodingFactory<BaseViewCommandModel>() { // from class: com.dianping.picasso.view.command.BaseViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final BaseViewCommandModel[] createArray(int i) {
            return new BaseViewCommandModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final BaseViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce1a2f980b9e42b6862b1ee82badb4f", RobustBitConfig.DEFAULT_VALUE) ? (BaseViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce1a2f980b9e42b6862b1ee82badb4f") : new BaseViewCommandModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Float alpha;
    public String backgroundColor;
    public String borderColor;
    public Float borderWidth;
    public CornerRadiusModel cornerRaduisModel;
    public GradientBackgroundModel gradientBackgroundModel;
    public Float height;
    public Boolean hidden;
    public Float width;
    public Float x;
    public Float y;

    public BaseViewCommandModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d9684bce0097b0138c1d5f779bda295", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d9684bce0097b0138c1d5f779bda295");
            return;
        }
        this.x = null;
        this.y = null;
        this.width = null;
        this.height = null;
        this.borderColor = "";
        this.alpha = null;
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94d2b2aaacbe43d85edd07caf08c2458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94d2b2aaacbe43d85edd07caf08c2458");
            return;
        }
        while (true) {
            try {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 > 0) {
                    switch (readMemberHash16) {
                        case 120:
                            this.x = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 121:
                            this.y = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 11718:
                            this.width = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 34042:
                            this.borderWidth = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 34455:
                            this.borderColor = unarchived.readString();
                            break;
                        case 37159:
                            this.height = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 40362:
                            this.hidden = Boolean.valueOf(unarchived.readBoolean());
                            break;
                        case 45406:
                            this.alpha = Float.valueOf((float) unarchived.readDouble());
                            break;
                        case 60542:
                            this.gradientBackgroundModel = (GradientBackgroundModel) unarchived.readObject(GradientBackgroundModel.PICASSO_DECODER);
                            break;
                        case 63189:
                            this.backgroundColor = unarchived.readString();
                            break;
                        case 63303:
                            this.cornerRaduisModel = (CornerRadiusModel) unarchived.readObject(CornerRadiusModel.PICASSO_DECODER);
                            break;
                        default:
                            readExtraProperty(readMemberHash16, unarchived);
                            break;
                    }
                } else {
                    return;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b80b9ba55a05cd72e7f4a87d08a9e772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b80b9ba55a05cd72e7f4a87d08a9e772");
        } else {
            unarchived.skipAny();
        }
    }
}
