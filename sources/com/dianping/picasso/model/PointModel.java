package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PointModel implements Decoding {
    public static final DecodingFactory<PointModel> POINT_MODEL_DECODING_FACTORY = new DecodingFactory<PointModel>() { // from class: com.dianping.picasso.model.PointModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final PointModel[] createArray(int i) {
            return new PointModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final PointModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc45cd648de60cc0dcad513924057973", RobustBitConfig.DEFAULT_VALUE) ? (PointModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc45cd648de60cc0dcad513924057973") : new PointModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public Float x;
    @Expose
    public Float y;

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3576e60fe83aad4ac1ef84d050f4738e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3576e60fe83aad4ac1ef84d050f4738e");
            return;
        }
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 > 0) {
                switch (readMemberHash16) {
                    case 120:
                        this.x = Float.valueOf((float) unarchived.readDouble());
                        break;
                    case 121:
                        this.y = Float.valueOf((float) unarchived.readDouble());
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

    public float floatX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "591d25bce09f00d9601f791d1b83f2d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "591d25bce09f00d9601f791d1b83f2d6")).floatValue();
        }
        if (this.x != null) {
            return this.x.floatValue();
        }
        return 0.0f;
    }

    public float floatY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "399a1c98c4353cb7d336c9e059801fa1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "399a1c98c4353cb7d336c9e059801fa1")).floatValue();
        }
        if (this.y != null) {
            return this.y.floatValue();
        }
        return 0.0f;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1621cd0eda7a71694f2db4b17eeba644", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1621cd0eda7a71694f2db4b17eeba644")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointModel pointModel = (PointModel) obj;
        return Objects.equals(this.x, pointModel.x) && Objects.equals(this.y, pointModel.y);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aae704d4532080452409f7b5b11b2b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aae704d4532080452409f7b5b11b2b1")).intValue() : Objects.hash(this.x, this.y);
    }
}
