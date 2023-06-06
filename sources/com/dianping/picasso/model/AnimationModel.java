package com.dianping.picasso.model;

import android.graphics.Color;
import android.text.TextUtils;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationModel extends GroupModel {
    public static final DecodingFactory<AnimationModel> PICASSO_DECODER = new DecodingFactory<AnimationModel>() { // from class: com.dianping.picasso.model.AnimationModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d56409711ba26acb10b67f5af919f60d", RobustBitConfig.DEFAULT_VALUE) ? (AnimationModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d56409711ba26acb10b67f5af919f60d") : new AnimationModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationModel[] createArray(int i) {
            return new AnimationModel[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public float anchorPointX;
    public float anchorPointY;
    public AnimationInfoModel[] animations;
    public int groupAnimationRepeatCount;
    public AnimationTransformModel transformModel;

    public AnimationModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74e15f13bb3f85a571246803c808f568", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74e15f13bb3f85a571246803c808f568");
            return;
        }
        this.anchorPointX = 0.5f;
        this.anchorPointY = 0.5f;
        this.groupAnimationRepeatCount = 0;
    }

    @Override // com.dianping.picasso.model.GroupModel, com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79f098bd5c6b424e07e68da4889abd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79f098bd5c6b424e07e68da4889abd38");
        } else if (i == 21871) {
            this.animations = (AnimationInfoModel[]) unarchived.readArray(AnimationInfoModel.PICASSO_DECODER);
        } else if (i == 25391) {
            this.groupAnimationRepeatCount = (int) unarchived.readDouble();
        } else if (i != 27500) {
            switch (i) {
                case 28637:
                    this.anchorPointX = (float) unarchived.readDouble();
                    return;
                case 28638:
                    this.anchorPointY = (float) unarchived.readDouble();
                    return;
                default:
                    super.readExtraProperty(i, unarchived);
                    return;
            }
        } else {
            this.transformModel = (AnimationTransformModel) unarchived.readObject(AnimationTransformModel.PICASSO_DECODER);
        }
    }

    public int[] getBgColorValues() {
        AnimationInfoModel[] animationInfoModelArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faad4003d8d156a1de7eea9b38a7dbca", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faad4003d8d156a1de7eea9b38a7dbca");
        }
        int[] iArr = new int[2];
        if (((this.animations == null) | (this.animations.length == 0)) && !TextUtils.isEmpty(this.backgroundColor) && this.backgroundColor.startsWith("#")) {
            int parseColor = Color.parseColor(this.backgroundColor);
            iArr[1] = parseColor;
            iArr[0] = parseColor;
            return iArr;
        }
        for (AnimationInfoModel animationInfoModel : this.animations) {
            iArr[0] = animationInfoModel.getBgColorFromValue();
            iArr[1] = animationInfoModel.getBgColorToValue();
            if (iArr[0] != 0 || iArr[1] != 0) {
                if (iArr[0] == 0 && !TextUtils.isEmpty(this.backgroundColor) && this.backgroundColor.startsWith("#")) {
                    iArr[0] = Color.parseColor(this.backgroundColor);
                }
                return iArr;
            }
        }
        return iArr;
    }
}
