package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.model.params.ImageViewParams;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ImageModel extends PicassoModel {
    public static final DecodingFactory<ImageModel> PICASSO_DECODER = new DecodingFactory<ImageModel>() { // from class: com.dianping.picasso.model.ImageModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ImageModel[] createArray(int i) {
            return new ImageModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ImageModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c330e4e8b034bf7475fe5093fb4794f3", RobustBitConfig.DEFAULT_VALUE) ? (ImageModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c330e4e8b034bf7475fe5093fb4794f3") : new ImageModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public float blurRadius;
    @Expose
    public String businessID;
    public int cacheType;
    @Expose
    public int contentMode;
    @Expose
    public int decodeOption;
    @Expose
    public RectModel edgeInsets;
    public boolean fadeEffect;
    public boolean failedRetry;
    public int gifLoopCount;
    @Expose
    public String image;
    public String imageBase64;
    @Expose
    public String imagePath;
    @Expose
    public float imageScale;
    @Expose
    public String imageUrl;
    @Expose
    public boolean needPlaceholder;
    @Expose
    public String placeholderError;
    @Expose
    public String placeholderLoading;
    @Expose
    public float saturation;
    @Expose
    public String tintColor;

    public ImageModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22da5dfeaf4741f2ebfc300457b42449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22da5dfeaf4741f2ebfc300457b42449");
            return;
        }
        this.imageUrl = "";
        this.imagePath = "";
        this.image = "";
        this.placeholderError = "";
        this.placeholderLoading = "";
        this.needPlaceholder = true;
        this.edgeInsets = new RectModel();
        this.imageScale = 3.0f;
        this.tintColor = "";
        this.decodeOption = 0;
        this.businessID = "";
        this.saturation = 1.0f;
        this.imageBase64 = "";
        this.gifLoopCount = -1;
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be79ed5e7f2712acdc4dfa1252dc54c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be79ed5e7f2712acdc4dfa1252dc54c3");
            return;
        }
        switch (i) {
            case 4271:
                this.imageScale = (float) unarchived.readDouble();
                return;
            case 6931:
                this.edgeInsets = (RectModel) unarchived.readObject(RectModel.RECT_MODEL_DECODING_FACTORY);
                return;
            case 8668:
                this.cacheType = (int) unarchived.readDouble();
                return;
            case 11623:
                this.gifLoopCount = (int) unarchived.readDouble();
                return;
            case 23555:
                this.decodeOption = (int) unarchived.readDouble();
                return;
            case 23584:
                this.imagePath = unarchived.readString();
                return;
            case 24537:
                this.blurRadius = (float) unarchived.readDouble();
                return;
            case 25108:
                this.imageUrl = unarchived.readString();
                return;
            case 31817:
                this.placeholderLoading = unarchived.readString();
                return;
            case 33418:
                this.imageBase64 = unarchived.readString();
                return;
            case 35581:
                this.needPlaceholder = unarchived.readBoolean();
                return;
            case 37160:
                this.tintColor = unarchived.readString();
                return;
            case 43355:
                this.image = unarchived.readString();
                return;
            case 44845:
                this.fadeEffect = unarchived.readBoolean();
                return;
            case 48235:
                this.failedRetry = unarchived.readBoolean();
                return;
            case 52309:
                this.placeholderError = unarchived.readString();
                return;
            case 55515:
                this.businessID = unarchived.readString();
                return;
            case 64466:
                this.saturation = (float) unarchived.readDouble();
                return;
            case 64956:
                this.contentMode = (int) unarchived.readDouble();
                return;
            default:
                super.readExtraProperty(i, unarchived);
                return;
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void switchModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "230be8cc5c68f219f9d9b4672cbcbe30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "230be8cc5c68f219f9d9b4672cbcbe30");
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = new ImageViewParams();
        }
        this.viewParams.switchModel(this);
    }
}
