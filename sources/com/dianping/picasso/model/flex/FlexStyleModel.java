package com.dianping.picasso.model.flex;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FlexStyleModel implements Decoding {
    public static final DecodingFactory<FlexStyleModel> PICASSO_DECODER = new DecodingFactory<FlexStyleModel>() { // from class: com.dianping.picasso.model.flex.FlexStyleModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final FlexStyleModel[] createArray(int i) {
            return new FlexStyleModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final FlexStyleModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7c837cd7e12e566062888c4eba232b1", RobustBitConfig.DEFAULT_VALUE) ? (FlexStyleModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7c837cd7e12e566062888c4eba232b1") : new FlexStyleModel();
        }
    };
    public static final int UNDEFINED = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public int alignContent;
    @Expose
    public int alignItems;
    @Expose
    public int alignSelf;
    @Expose
    public FlexEdgeModel border;
    @Expose
    public int direction;
    @Expose
    public float flex;
    @Expose
    public float flexBasis;
    @Expose
    public int flexDirection;
    @Expose
    public float flexGrow;
    @Expose
    public float flexShrink;
    @Expose
    public float height;
    @Expose
    public float heightPercent;
    @Expose
    public int justifyContent;
    @Expose
    public FlexEdgeModel margin;
    @Expose
    public float maxHeight;
    @Expose
    public float maxHeightPercent;
    @Expose
    public float maxWidth;
    @Expose
    public float maxWidthPercent;
    @Expose
    public float minHeight;
    @Expose
    public float minHeightPercent;
    @Expose
    public float minWidth;
    @Expose
    public float minWidthPercent;
    @Expose
    public int overflow;
    @Expose
    public FlexEdgeModel padding;
    @Expose
    public FlexEdgeModel position;
    @Expose
    public int positionType;
    @Expose
    public float width;
    @Expose
    public float widthPercent;
    @Expose
    public int wrap;

    public FlexStyleModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f34711d36e345dc1ad349f3293e56fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f34711d36e345dc1ad349f3293e56fb");
            return;
        }
        this.direction = -1;
        this.flexDirection = -1;
        this.justifyContent = -1;
        this.alignContent = -1;
        this.alignItems = -1;
        this.alignSelf = -1;
        this.positionType = -1;
        this.wrap = -1;
        this.overflow = -1;
        this.flex = Float.NaN;
        this.flexGrow = Float.NaN;
        this.flexShrink = Float.NaN;
        this.flexBasis = Float.NaN;
        this.height = Float.NaN;
        this.width = Float.NaN;
        this.minWidth = Float.NaN;
        this.minHeight = Float.NaN;
        this.maxWidth = Float.NaN;
        this.maxHeight = Float.NaN;
        this.widthPercent = Float.NaN;
        this.heightPercent = Float.NaN;
        this.minWidthPercent = Float.NaN;
        this.minHeightPercent = Float.NaN;
        this.maxWidthPercent = Float.NaN;
        this.maxHeightPercent = Float.NaN;
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4921027b1cbde499c7aff602c9b7fada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4921027b1cbde499c7aff602c9b7fada");
            return;
        }
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 > 0) {
                switch (readMemberHash16) {
                    case 1919:
                        this.direction = (int) unarchived.readDouble();
                        break;
                    case 3974:
                        this.flexDirection = (int) unarchived.readDouble();
                        break;
                    case 8478:
                        this.heightPercent = (float) unarchived.readDouble();
                        break;
                    case 11718:
                        this.width = (float) unarchived.readDouble();
                        break;
                    case 13748:
                        this.alignContent = (int) unarchived.readDouble();
                        break;
                    case 15377:
                        this.padding = (FlexEdgeModel) unarchived.readObject(FlexEdgeModel.PICASSO_DECODER);
                        break;
                    case 22210:
                        this.maxWidth = (float) unarchived.readDouble();
                        break;
                    case 23468:
                        this.flexGrow = (float) unarchived.readDouble();
                        break;
                    case 24521:
                        this.justifyContent = (int) unarchived.readDouble();
                        break;
                    case 29740:
                        this.border = (FlexEdgeModel) unarchived.readObject(FlexEdgeModel.PICASSO_DECODER);
                        break;
                    case 34222:
                        this.margin = (FlexEdgeModel) unarchived.readObject(FlexEdgeModel.PICASSO_DECODER);
                        break;
                    case 34731:
                        this.maxHeight = (float) unarchived.readDouble();
                        break;
                    case 36378:
                        this.maxHeightPercent = (float) unarchived.readDouble();
                        break;
                    case 37159:
                        this.height = (float) unarchived.readDouble();
                        break;
                    case 37730:
                        this.flexShrink = (float) unarchived.readDouble();
                        break;
                    case 39209:
                        this.position = (FlexEdgeModel) unarchived.readObject(FlexEdgeModel.PICASSO_DECODER);
                        break;
                    case 40473:
                        this.minHeight = (float) unarchived.readDouble();
                        break;
                    case 46082:
                        this.overflow = (int) unarchived.readDouble();
                        break;
                    case 47764:
                        this.minWidth = (float) unarchived.readDouble();
                        break;
                    case 53233:
                        this.alignSelf = (int) unarchived.readDouble();
                        break;
                    case 53322:
                        this.wrap = (int) unarchived.readDouble();
                        break;
                    case 57347:
                        this.positionType = (int) unarchived.readDouble();
                        break;
                    case 58271:
                        this.widthPercent = (float) unarchived.readDouble();
                        break;
                    case 59171:
                        this.maxWidthPercent = (float) unarchived.readDouble();
                        break;
                    case 62225:
                        this.minWidthPercent = (float) unarchived.readDouble();
                        break;
                    case 63429:
                        this.flexBasis = (float) unarchived.readDouble();
                        break;
                    case 64443:
                        this.alignItems = (int) unarchived.readDouble();
                        break;
                    case 65516:
                        this.minHeightPercent = (float) unarchived.readDouble();
                        break;
                    case 65529:
                        this.flex = (float) unarchived.readDouble();
                        break;
                    default:
                        unarchived.skipAny();
                        break;
                }
            } else {
                return;
            }
        }
    }
}
