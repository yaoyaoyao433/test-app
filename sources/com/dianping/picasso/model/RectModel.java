package com.dianping.picasso.model;

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
public class RectModel implements Decoding {
    public static final DecodingFactory<RectModel> RECT_MODEL_DECODING_FACTORY = new DecodingFactory<RectModel>() { // from class: com.dianping.picasso.model.RectModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final RectModel[] createArray(int i) {
            return new RectModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final RectModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c90673bf2652d244356c604ecc31746", RobustBitConfig.DEFAULT_VALUE) ? (RectModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c90673bf2652d244356c604ecc31746") : new RectModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public int bottom;
    @Expose
    public int left;
    @Expose
    public int right;
    @Expose
    public int top;

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca1ce7170591b3139113263cefd6fde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca1ce7170591b3139113263cefd6fde8");
            return;
        }
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 <= 0) {
                return;
            }
            if (readMemberHash16 == 39467) {
                this.bottom = (int) unarchived.readDouble();
            } else if (readMemberHash16 == 40967) {
                this.left = (int) unarchived.readDouble();
            } else if (readMemberHash16 == 49493) {
                this.top = (int) unarchived.readDouble();
            } else if (readMemberHash16 == 49692) {
                this.right = (int) unarchived.readDouble();
            } else {
                unarchived.skipAny();
            }
        }
    }
}
