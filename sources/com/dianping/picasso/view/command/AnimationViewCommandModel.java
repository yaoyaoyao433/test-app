package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationViewCommandModel extends BaseViewCommandModel {
    public static final int ACTION_PAUSE = 1;
    public static final int ACTION_RESUME = 2;
    public static final DecodingFactory<AnimationViewCommandModel> PICASSO_DECODER = new DecodingFactory<AnimationViewCommandModel>() { // from class: com.dianping.picasso.view.command.AnimationViewCommandModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationViewCommandModel[] createArray(int i) {
            return new AnimationViewCommandModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationViewCommandModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f565c384b27ae34376bf0dd22ab8fd23", RobustBitConfig.DEFAULT_VALUE) ? (AnimationViewCommandModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f565c384b27ae34376bf0dd22ab8fd23") : new AnimationViewCommandModel();
        }
    };
    public static final String Rotation = "rotate";
    public static final String RotationX = "rotateX";
    public static final String RotationY = "rotateY";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public float pivotX;
    public float pivotY;
    public boolean resetAnimation;
    public String rotateDirection;
    public Float rotateValue;
    public float scaleX;
    public float scaleY;

    public AnimationViewCommandModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf98da820e68b46dad6268e4f3c9eb0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf98da820e68b46dad6268e4f3c9eb0b");
            return;
        }
        this.scaleX = -1.0f;
        this.scaleY = -1.0f;
        this.pivotX = -1.0f;
        this.pivotY = -1.0f;
        this.action = 0;
    }

    @Override // com.dianping.picasso.view.command.BaseViewCommandModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f907f543b1fa15d8a36c915cdd184d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f907f543b1fa15d8a36c915cdd184d");
            return;
        }
        switch (i) {
            case 3966:
                this.rotateValue = Float.valueOf((float) unarchived.readDouble());
                return;
            case 8270:
                this.scaleX = (float) unarchived.readDouble();
                return;
            case 8271:
                this.scaleY = (float) unarchived.readDouble();
                return;
            case 8292:
                this.rotateDirection = unarchived.readString();
                return;
            case 9718:
                this.action = 1;
                unarchived.peek();
                return;
            case 13405:
            case 51720:
                unarchived.peek();
                return;
            case 28637:
                this.pivotX = (float) unarchived.readDouble();
                return;
            case 28638:
                this.pivotY = (float) unarchived.readDouble();
                return;
            case 51245:
                this.action = 2;
                unarchived.peek();
                return;
            case 63197:
                this.resetAnimation = true;
                unarchived.peek();
                return;
            default:
                unarchived.skipAny();
                return;
        }
    }
}
