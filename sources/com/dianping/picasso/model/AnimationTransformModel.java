package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationTransformModel extends PicassoModel {
    public static final DecodingFactory<AnimationTransformModel> PICASSO_DECODER = new DecodingFactory<AnimationTransformModel>() { // from class: com.dianping.picasso.model.AnimationTransformModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationTransformModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "028b052c672d54dc730362f219b71e2f", RobustBitConfig.DEFAULT_VALUE) ? (AnimationTransformModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "028b052c672d54dc730362f219b71e2f") : new AnimationTransformModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationTransformModel[] createArray(int i) {
            return new AnimationTransformModel[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String rotateDirection;
    public Float rotateValue;
    public float scaleX;
    public float scaleY;

    public AnimationTransformModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b667b5444fbc02e76f6909eabf00ad8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b667b5444fbc02e76f6909eabf00ad8b");
            return;
        }
        this.scaleX = -1.0f;
        this.scaleY = -1.0f;
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dd5aebcddf0930c7545f9e8a9b553b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dd5aebcddf0930c7545f9e8a9b553b1");
        } else if (i == 3966) {
            this.rotateValue = Float.valueOf((float) unarchived.readDouble());
        } else if (i == 8292) {
            this.rotateDirection = unarchived.readString();
        } else {
            switch (i) {
                case 8270:
                    this.scaleX = (float) unarchived.readDouble();
                    return;
                case 8271:
                    this.scaleY = (float) unarchived.readDouble();
                    return;
                default:
                    super.readExtraProperty(i, unarchived);
                    return;
            }
        }
    }
}
