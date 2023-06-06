package com.dianping.picasso.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.codelog.b;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.FlexUtils;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.creator.PicassoBaselineInterface;
import com.dianping.picasso.creator.PicassoSizeToFitInterface;
import com.dianping.picasso.model.flex.FlexStyleModel;
import com.dianping.picasso.model.params.PicassoModelParams;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoModel implements Parcelable, Decoding {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int accessId;
    public String accessLabel;
    @Expose
    public String[] actions;
    @Expose
    public float alpha;
    @Expose
    public String backgroundColor;
    @Expose
    public String borderColor;
    @Expose
    public float borderWidth;
    public int componentId;
    public boolean componentIntercept;
    @Expose
    public float cornerRadius;
    public boolean cornerRadiusLB;
    public boolean cornerRadiusLT;
    public boolean cornerRadiusRB;
    public boolean cornerRadiusRT;
    private int endBytePosition;
    public String endColor;
    @Expose
    public String extra;
    @Expose
    public FlexStyleModel flexStyle;
    @Expose
    public String gaLabel;
    @Expose
    public String gaUserInfo;
    @Expose
    public String handleId;
    @Expose
    public float height;
    @Expose
    public boolean hidden;
    @Expose
    public String hostId;
    @Expose
    public boolean isRootFlexView;
    public int key;
    protected d node;
    public int orientation;
    @Expose
    public String parentId;
    private byte[] rawData;
    @Expose
    public String sdColor;
    @Expose
    public float sdOffsetX;
    @Expose
    public float sdOffsetY;
    @Expose
    public float sdOpacity;
    @Expose
    public float sdRadius;
    private int startBytePosition;
    public String startColor;
    @Expose
    public String statisticsInfo;
    @Expose
    public String tag;
    @Expose
    public int type;
    @Expose
    public String viewId;
    protected PicassoModelParams viewParams;
    @Expose
    public float width;
    @Expose
    public float x;
    @Expose
    public float y;
    public static final DecodingFactory<PicassoModel> PICASSO_DECODER = new DecodingFactory<PicassoModel>() { // from class: com.dianping.picasso.model.PicassoModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final PicassoModel[] createArray(int i) {
            return new PicassoModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final PicassoModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f02ab1a09e2be93405a6568bc998f4f", RobustBitConfig.DEFAULT_VALUE) ? (PicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f02ab1a09e2be93405a6568bc998f4f") : new PicassoModel();
        }
    };
    public static final Parcelable.Creator<PicassoModel> CREATOR = new Parcelable.Creator<PicassoModel>() { // from class: com.dianping.picasso.model.PicassoModel.4
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicassoModel createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038d121c9f0f41012898a58cfdab7fdc", RobustBitConfig.DEFAULT_VALUE)) {
                return (PicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038d121c9f0f41012898a58cfdab7fdc");
            }
            try {
                int readInt = parcel.readInt();
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                PicassoUnarchived picassoUnarchived = new PicassoUnarchived(bArr);
                BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(readInt));
                if (viewWrapperByType != null) {
                    Object createInstance = viewWrapperByType.getDecodingFactory().createInstance();
                    if (createInstance instanceof PicassoModel) {
                        ((Decoding) createInstance).decode(picassoUnarchived);
                        ((PicassoModel) createInstance).hostId = "__Cached__" + ((PicassoModel) createInstance).hostId;
                        PicassoModel.traversePModel((PicassoModel) createInstance);
                        return (PicassoModel) createInstance;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new PicassoModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicassoModel[] newArray(int i) {
            return new PicassoModel[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean transformComponent(PicassoModel picassoModel) {
        return false;
    }

    public PicassoModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62376372cbee1c5ef3c5fb39b9ca50f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62376372cbee1c5ef3c5fb39b9ca50f1");
            return;
        }
        this.tag = "";
        this.type = -1;
        this.borderColor = "";
        this.sdColor = "";
        this.sdRadius = 3.0f;
        this.sdOffsetY = -3.0f;
        this.gaUserInfo = "";
        this.gaLabel = "";
        this.statisticsInfo = "";
        this.extra = "";
        this.alpha = 1.0f;
        this.key = -1;
        this.accessId = -1;
        this.accessLabel = "";
        this.orientation = 0;
        this.rawData = new byte[0];
        this.startBytePosition = 0;
        this.endBytePosition = 0;
        this.componentId = 0;
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) {
        int readMemberHash16;
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff7d8cf48d00b4a8f8cfa5f8982a92fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff7d8cf48d00b4a8f8cfa5f8982a92fd");
            return;
        }
        this.rawData = unarchived.rawData();
        boolean z = unarchived instanceof PicassoUnarchived;
        if (z) {
            this.startBytePosition = ((PicassoUnarchived) unarchived).getPosition();
        }
        while (true) {
            try {
                readMemberHash16 = unarchived.readMemberHash16();
            } catch (ArchiveException e) {
                b.b(PicassoModel.class, e.getMessage());
            }
            if (readMemberHash16 > 0) {
                switch (readMemberHash16) {
                    case 120:
                        this.x = (float) unarchived.readDouble();
                        break;
                    case 121:
                        this.y = (float) unarchived.readDouble();
                        break;
                    case 1864:
                        this.endColor = unarchived.readString();
                        break;
                    case 10900:
                        this.sdOffsetX = (float) unarchived.readDouble();
                        break;
                    case 10901:
                        this.sdOffsetY = (float) unarchived.readDouble();
                        break;
                    case 11718:
                        this.width = (float) unarchived.readDouble();
                        break;
                    case 11936:
                        this.viewId = unarchived.readString();
                        break;
                    case 13539:
                        this.hostId = unarchived.readString();
                        break;
                    case 16497:
                        this.statisticsInfo = unarchived.readString();
                        break;
                    case 16696:
                        this.flexStyle = (FlexStyleModel) unarchived.readObject(FlexStyleModel.PICASSO_DECODER);
                        break;
                    case 18685:
                        this.actions = unarchived.readStringArray();
                        break;
                    case 19197:
                        this.cornerRadiusLB = unarchived.readBoolean();
                        break;
                    case 19215:
                        this.cornerRadiusLT = unarchived.readBoolean();
                        break;
                    case 19383:
                        this.cornerRadiusRB = unarchived.readBoolean();
                        break;
                    case 19401:
                        this.cornerRadiusRT = unarchived.readBoolean();
                        break;
                    case 28741:
                        this.componentIntercept = unarchived.readBoolean();
                        break;
                    case 31290:
                        this.gaLabel = unarchived.readString();
                        break;
                    case 31634:
                        this.sdColor = unarchived.readString();
                        break;
                    case 34042:
                        this.borderWidth = (float) unarchived.readDouble();
                        break;
                    case 34455:
                        this.borderColor = unarchived.readString();
                        break;
                    case 36195:
                        this.handleId = unarchived.readString();
                        break;
                    case 36666:
                        this.type = (int) unarchived.readDouble();
                        break;
                    case 36709:
                        this.parentId = unarchived.readString();
                        break;
                    case 37159:
                        this.height = (float) unarchived.readDouble();
                        break;
                    case 37904:
                        this.extra = unarchived.readString();
                        break;
                    case 38896:
                        this.accessLabel = unarchived.readString();
                        break;
                    case 40362:
                        this.hidden = unarchived.readBoolean();
                        break;
                    case 40543:
                        this.key = (int) unarchived.readDouble();
                        break;
                    case 42563:
                        this.sdRadius = (float) unarchived.readDouble();
                        break;
                    case 45406:
                        this.alpha = (float) unarchived.readDouble();
                        break;
                    case 49050:
                        this.tag = unarchived.readString();
                        break;
                    case 56056:
                        this.componentId = (int) unarchived.readDouble();
                        break;
                    case 56851:
                        this.gaUserInfo = unarchived.readString();
                        break;
                    case 57226:
                        this.isRootFlexView = unarchived.readBoolean();
                        break;
                    case 59425:
                        this.startColor = unarchived.readString();
                        break;
                    case 62586:
                        this.sdOpacity = (float) unarchived.readDouble();
                        break;
                    case 62879:
                        String readString = unarchived.readString();
                        if (!TextUtils.isEmpty(readString)) {
                            this.accessId = readString.hashCode();
                            break;
                        } else {
                            break;
                        }
                    case 62928:
                        this.orientation = (int) unarchived.readDouble();
                        break;
                    case 63189:
                        this.backgroundColor = unarchived.readString();
                        break;
                    case 63303:
                        this.cornerRadius = (float) unarchived.readDouble();
                        break;
                    default:
                        readExtraProperty(readMemberHash16, unarchived);
                        break;
                }
            } else {
                if (z) {
                    this.endBytePosition = ((PicassoUnarchived) unarchived).getPosition();
                }
                if (this.flexStyle != null) {
                    buildYogaNode();
                    if (this.isRootFlexView) {
                        this.node.a(this.width == 0.0f ? Float.NaN : this.width, this.height != 0.0f ? this.height : Float.NaN);
                        updatePModelByYoga();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public void buildYogaNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46e5083a0263b465dee7013a0215f681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46e5083a0263b465dee7013a0215f681");
            return;
        }
        this.node = d.a();
        FlexUtils.bindYogaStyle(this.node, this.flexStyle);
        if (this instanceof PicassoBaselineInterface) {
            this.node.a(createYogaBaselineFunction());
        }
        if (this instanceof PicassoSizeToFitInterface) {
            this.node.a(createYogaMeasureFunction());
            this.node.f();
        }
    }

    public YogaMeasureFunction createYogaMeasureFunction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99cc3c8ab9c039812bf09750b124ce6", RobustBitConfig.DEFAULT_VALUE) ? (YogaMeasureFunction) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99cc3c8ab9c039812bf09750b124ce6") : new YogaMeasureFunction() { // from class: com.dianping.picasso.model.PicassoModel.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.facebook.yoga.YogaMeasureFunction
            public long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                Object[] objArr2 = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5db5ad670cc792d51a7acf64531dc106", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5db5ad670cc792d51a7acf64531dc106")).longValue();
                }
                if (yogaMeasureMode == YogaMeasureMode.UNDEFINED) {
                    f = Float.MAX_VALUE;
                }
                if (yogaMeasureMode2 == YogaMeasureMode.UNDEFINED) {
                    f2 = Float.MAX_VALUE;
                }
                PicassoModel.this.getViewParams().width = PicassoUtils.dp2px(PicassoEnvironment.globalContext, f);
                JSONObject calculateSize = ((PicassoSizeToFitInterface) PicassoModel.this).calculateSize();
                return c.a(PicassoModel.this.getSatisfiedSize(f, (float) calculateSize.optDouble("width"), yogaMeasureMode), PicassoModel.this.getSatisfiedSize(f2, (float) calculateSize.optDouble("height"), yogaMeasureMode2));
            }
        };
    }

    public YogaBaselineFunction createYogaBaselineFunction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e257b9cea6d8ce41eb72c3eecc59ae0a", RobustBitConfig.DEFAULT_VALUE) ? (YogaBaselineFunction) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e257b9cea6d8ce41eb72c3eecc59ae0a") : new YogaBaselineFunction() { // from class: com.dianping.picasso.model.PicassoModel.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.facebook.yoga.YogaBaselineFunction
            public float baseline(d dVar, float f, float f2) {
                Object[] objArr2 = {dVar, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "828243db8ad7049a8fb2b504cfbc9bc3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "828243db8ad7049a8fb2b504cfbc9bc3")).floatValue() : ((PicassoBaselineInterface) PicassoModel.this).baseLineWithWidth(f, f2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getSatisfiedSize(float f, float f2, YogaMeasureMode yogaMeasureMode) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), yogaMeasureMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b75bd60af18885220ece36af868533a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b75bd60af18885220ece36af868533a")).floatValue();
        }
        switch (yogaMeasureMode) {
            case EXACTLY:
                return f;
            case AT_MOST:
                return Math.min(f, f2);
            default:
                return f2;
        }
    }

    public void updatePModelByYoga() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc7dbc5d366eb46dee95c630890bbe66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc7dbc5d366eb46dee95c630890bbe66");
        } else if (this.node != null) {
            this.x = this.node.q();
            this.y = this.node.r();
            this.width = this.node.s();
            this.height = this.node.t();
            if (this.hidden) {
                return;
            }
            switchModel();
        }
    }

    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe091e41c9f6f586f3ee354c0c8440a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe091e41c9f6f586f3ee354c0c8440a1");
        } else {
            unarchived.skipAny();
        }
    }

    public void switchModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0359db119a8aadf834f32b020190105b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0359db119a8aadf834f32b020190105b");
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = new PicassoModelParams();
        }
        this.viewParams.switchModel(this);
    }

    @NonNull
    public PicassoModelParams getViewParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4dce04a779cd18ac4382e8595d5caf", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModelParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4dce04a779cd18ac4382e8595d5caf");
        }
        if (this.viewParams == null) {
            switchModel();
        }
        return this.viewParams;
    }

    public boolean isNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "097a53786f6e2af612ebbe110c54233c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "097a53786f6e2af612ebbe110c54233c")).booleanValue() : TextUtils.isEmpty(this.viewId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void traversePModel(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7e5603d7deb1059b729dd9bf5c8a62e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7e5603d7deb1059b729dd9bf5c8a62e");
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType != null) {
            try {
                PicassoModel[] subModels = viewWrapperByType.getSubModels(picassoModel);
                if (subModels != null) {
                    for (PicassoModel picassoModel2 : subModels) {
                        picassoModel2.hostId = picassoModel.hostId;
                        traversePModel(picassoModel2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        picassoModel.viewParams = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17333662db129a88a4689ae7a3d98922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17333662db129a88a4689ae7a3d98922");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.rawData, this.startBytePosition, this.endBytePosition);
        parcel.writeInt(this.type);
        parcel.writeInt(copyOfRange.length);
        parcel.writeByteArray(copyOfRange);
    }

    public boolean equalComponentId(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a5467a3366d3d6499f0a11b54d89ce2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a5467a3366d3d6499f0a11b54d89ce2")).booleanValue() : picassoModel != null && picassoModel.componentId == this.componentId && this.componentId > 0;
    }
}
