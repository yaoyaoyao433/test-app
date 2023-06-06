package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IndexPathModel extends PicassoModel {
    public static final DecodingFactory<IndexPathModel> PICASSO_DECODER = new DecodingFactory<IndexPathModel>() { // from class: com.dianping.picasso.model.IndexPathModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final IndexPathModel[] createArray(int i) {
            return new IndexPathModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final IndexPathModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87444b08a8677820a5be8dee733c556b", RobustBitConfig.DEFAULT_VALUE) ? (IndexPathModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87444b08a8677820a5be8dee733c556b") : new IndexPathModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean animate;
    public Integer itemIndex;
    public Integer sectionIndex;

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d4e7eece50a12f8da25ed9a998ff4ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d4e7eece50a12f8da25ed9a998ff4ea");
        } else if (i == 13025) {
            this.animate = Boolean.valueOf(unarchived.readBoolean());
        } else if (i == 16621) {
            this.sectionIndex = Integer.valueOf((int) unarchived.readDouble());
        } else if (i == 45439) {
            this.itemIndex = Integer.valueOf((int) unarchived.readDouble());
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }
}
