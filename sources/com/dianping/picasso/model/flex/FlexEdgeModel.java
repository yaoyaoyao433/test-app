package com.dianping.picasso.model.flex;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FlexEdgeModel implements Decoding {
    public static final DecodingFactory<FlexEdgeModel> PICASSO_DECODER = new DecodingFactory<FlexEdgeModel>() { // from class: com.dianping.picasso.model.flex.FlexEdgeModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final FlexEdgeModel[] createArray(int i) {
            return new FlexEdgeModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final FlexEdgeModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce22514ba4f1eec932c2d6134600241", RobustBitConfig.DEFAULT_VALUE) ? (FlexEdgeModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce22514ba4f1eec932c2d6134600241") : new FlexEdgeModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public float all;
    @Expose
    public float allPercent;
    @Expose
    public float bottom;
    @Expose
    public float bottomPercent;
    @Expose
    public float end;
    @Expose
    public float endPercent;
    @Expose
    public float horizontal;
    @Expose
    public float horizontalPercent;
    @Expose
    public float left;
    @Expose
    public float leftPercent;
    @Expose
    public float right;
    @Expose
    public float rightPercent;
    @Expose
    public float start;
    @Expose
    public float startPercent;
    @Expose
    public float top;
    @Expose
    public float topPercent;
    @Expose
    public float vertical;
    @Expose
    public float verticalPercent;

    public FlexEdgeModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f40d917e2f9d6b959a2373b2af2361d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f40d917e2f9d6b959a2373b2af2361d3");
            return;
        }
        this.left = Float.NaN;
        this.top = Float.NaN;
        this.right = Float.NaN;
        this.bottom = Float.NaN;
        this.start = Float.NaN;
        this.end = Float.NaN;
        this.horizontal = Float.NaN;
        this.vertical = Float.NaN;
        this.all = Float.NaN;
        this.leftPercent = Float.NaN;
        this.topPercent = Float.NaN;
        this.rightPercent = Float.NaN;
        this.bottomPercent = Float.NaN;
        this.startPercent = Float.NaN;
        this.endPercent = Float.NaN;
        this.horizontalPercent = Float.NaN;
        this.verticalPercent = Float.NaN;
        this.allPercent = Float.NaN;
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f2c33000d94f9f86e2f1591897f793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f2c33000d94f9f86e2f1591897f793");
            return;
        }
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 > 0) {
                switch (readMemberHash16) {
                    case TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE /* 304 */:
                        this.topPercent = (float) unarchived.readDouble();
                        break;
                    case 16257:
                        this.horizontalPercent = (float) unarchived.readDouble();
                        break;
                    case 25583:
                        this.verticalPercent = (float) unarchived.readDouble();
                        break;
                    case 26486:
                        this.vertical = (float) unarchived.readDouble();
                        break;
                    case 31137:
                        this.all = (float) unarchived.readDouble();
                        break;
                    case 35035:
                        this.end = (float) unarchived.readDouble();
                        break;
                    case 35876:
                        this.horizontal = (float) unarchived.readDouble();
                        break;
                    case 38462:
                        this.leftPercent = (float) unarchived.readDouble();
                        break;
                    case 39467:
                        this.bottom = (float) unarchived.readDouble();
                        break;
                    case 39780:
                        this.allPercent = (float) unarchived.readDouble();
                        break;
                    case 40967:
                        this.left = (float) unarchived.readDouble();
                        break;
                    case 43930:
                        this.bottomPercent = (float) unarchived.readDouble();
                        break;
                    case 49493:
                        this.top = (float) unarchived.readDouble();
                        break;
                    case 49692:
                        this.right = (float) unarchived.readDouble();
                        break;
                    case 50274:
                        this.start = (float) unarchived.readDouble();
                        break;
                    case 55018:
                        this.endPercent = (float) unarchived.readDouble();
                        break;
                    case 57993:
                        this.rightPercent = (float) unarchived.readDouble();
                        break;
                    case 58755:
                        this.startPercent = (float) unarchived.readDouble();
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
