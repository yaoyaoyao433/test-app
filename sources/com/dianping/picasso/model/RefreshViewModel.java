package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RefreshViewModel extends GroupModel {
    public static final DecodingFactory<RefreshViewModel> PICASSO_DECODER = new DecodingFactory<RefreshViewModel>() { // from class: com.dianping.picasso.model.RefreshViewModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final RefreshViewModel[] createArray(int i) {
            return new RefreshViewModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final RefreshViewModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c525cabfc1197b1e527943f162786b7b", RobustBitConfig.DEFAULT_VALUE) ? (RefreshViewModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c525cabfc1197b1e527943f162786b7b") : new RefreshViewModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int style;

    @Override // com.dianping.picasso.model.GroupModel, com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76e5534d0393a98e8ec6314f909c106c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76e5534d0393a98e8ec6314f909c106c");
        } else if (i == 7601) {
            this.style = (int) unarchived.readDouble();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }
}
