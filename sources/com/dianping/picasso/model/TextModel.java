package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoTextUtils;
import com.dianping.picasso.creator.PicassoBaselineInterface;
import com.dianping.picasso.creator.PicassoSizeToFitInterface;
import com.dianping.picasso.model.params.TextViewParams;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TextModel extends PicassoModel implements PicassoBaselineInterface, PicassoSizeToFitInterface {
    public static final DecodingFactory<TextModel> PICASSO_DECODER = new DecodingFactory<TextModel>() { // from class: com.dianping.picasso.model.TextModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final TextModel[] createArray(int i) {
            return new TextModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final TextModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ee08f1133ab022699d9cd8dab671e6b", RobustBitConfig.DEFAULT_VALUE) ? (TextModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ee08f1133ab022699d9cd8dab671e6b") : new TextModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean adjustsFitWidth;
    public boolean canShowQuickMenu;
    @Expose
    public int contentVerticalAlignment;
    public boolean disableBold;
    public Float firstLineHeadIndent;
    @Expose
    public String fontName;
    @Expose
    public int fontStyle;
    @Expose
    public int lineBreakMode;
    @Expose
    public int linespacing;
    public boolean needSizeToFit;
    @Expose
    public int numberOfLines;
    @Expose
    public int padding;
    @Expose
    public int paddingBottom;
    @Expose
    public int paddingLeft;
    @Expose
    public int paddingRight;
    @Expose
    public int paddingTop;
    public String sizeKey;
    @Expose
    public boolean strikethrough;
    @Expose
    public String text;
    @Expose
    public int textAlignment;
    @Expose
    public String textColor;
    public String textEndColor;
    public int textOrientation;
    public String textShadowColor;
    public float textShadowOffsetX;
    public float textShadowOffsetY;
    public float textShadowRadius;
    @Expose
    public float textSize;
    public String textStartColor;
    @Expose
    public boolean underline;

    public TextModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2848eb69ca3a40f253e5a11f5b1ed10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2848eb69ca3a40f253e5a11f5b1ed10");
            return;
        }
        this.text = "";
        this.textSize = 14.0f;
        this.textColor = "";
        this.fontName = "";
        this.lineBreakMode = 4;
        this.numberOfLines = 1;
        this.sizeKey = "";
        this.textShadowColor = "";
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "531dfa5630dcebe5fc1ad162456c4492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "531dfa5630dcebe5fc1ad162456c4492");
            return;
        }
        switch (i) {
            case 6175:
                this.needSizeToFit = unarchived.readBoolean();
                return;
            case 6288:
                this.firstLineHeadIndent = Float.valueOf((float) unarchived.readDouble());
                return;
            case 6607:
                this.linespacing = (int) unarchived.readDouble();
                return;
            case 7565:
                this.disableBold = unarchived.readBoolean();
                return;
            case 9343:
                this.canShowQuickMenu = unarchived.readBoolean();
                return;
            case 11830:
                this.textColor = unarchived.readString();
                return;
            case 13205:
                this.textEndColor = unarchived.readString();
                return;
            case 13614:
                this.textStartColor = unarchived.readString();
                return;
            case 15054:
                float readDouble = (float) unarchived.readDouble();
                if (readDouble <= 1.0E-8d) {
                    readDouble = 14.0f;
                }
                this.textSize = readDouble;
                return;
            case 15226:
                this.fontName = unarchived.readString();
                return;
            case 15377:
                this.padding = (int) unarchived.readDouble();
                return;
            case 17592:
                this.textShadowOffsetX = (float) unarchived.readDouble();
                return;
            case 17593:
                this.textShadowOffsetY = (float) unarchived.readDouble();
                return;
            case 17709:
                this.text = unarchived.readString();
                return;
            case 18308:
                this.paddingTop = (int) unarchived.readDouble();
                return;
            case 19043:
                this.textOrientation = (int) unarchived.readDouble();
                return;
            case 30859:
                this.paddingRight = (int) unarchived.readDouble();
                return;
            case 31394:
                this.fontStyle = (int) unarchived.readDouble();
                return;
            case 32467:
                this.strikethrough = unarchived.readBoolean();
                return;
            case 34783:
                int readDouble2 = (int) unarchived.readDouble();
                if (readDouble2 <= 0) {
                    readDouble2 = Integer.MAX_VALUE;
                }
                this.numberOfLines = readDouble2;
                return;
            case 37294:
                this.lineBreakMode = (int) unarchived.readDouble();
                return;
            case 44825:
                this.adjustsFitWidth = unarchived.readBoolean();
                return;
            case 45468:
                this.paddingBottom = (int) unarchived.readDouble();
                return;
            case 47007:
                this.textShadowRadius = (float) unarchived.readDouble();
                return;
            case 47774:
                this.sizeKey = unarchived.readString();
                return;
            case 50892:
                this.underline = unarchived.readBoolean();
                return;
            case 52116:
                this.contentVerticalAlignment = (int) unarchived.readDouble();
                return;
            case 52918:
                this.textShadowColor = unarchived.readString();
                return;
            case 57272:
                this.paddingLeft = (int) unarchived.readDouble();
                return;
            case 65334:
                this.textAlignment = (int) unarchived.readDouble();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8add77737350e328de5225fd43d8701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8add77737350e328de5225fd43d8701");
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = new TextViewParams();
        }
        this.viewParams.switchModel(this);
    }

    @Override // com.dianping.picasso.creator.PicassoSizeToFitInterface
    public boolean needSizeToFit() {
        return this.needSizeToFit;
    }

    @Override // com.dianping.picasso.creator.PicassoSizeToFitInterface
    public String sizeKey() {
        return this.sizeKey;
    }

    @Override // com.dianping.picasso.creator.PicassoSizeToFitInterface
    public JSONObject calculateSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec20c6aa78497917c649c217ac3b4f6e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec20c6aa78497917c649c217ac3b4f6e") : PicassoTextUtils.sizeToFit(this);
    }

    @Override // com.dianping.picasso.creator.PicassoBaselineInterface
    public float baseLineWithWidth(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8299424cc49c5abdcc29cfd791a24721", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8299424cc49c5abdcc29cfd791a24721")).floatValue() : this.numberOfLines >= 2 ? f2 : PicassoTextUtils.getBaseline(this);
    }
}
