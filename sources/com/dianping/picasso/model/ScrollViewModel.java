package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollViewModel extends GroupModel {
    public static final DecodingFactory<ScrollViewModel> PICASSO_DECODER = new DecodingFactory<ScrollViewModel>() { // from class: com.dianping.picasso.model.ScrollViewModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ScrollViewModel[] createArray(int i) {
            return new ScrollViewModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ScrollViewModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c242255e65095b287e91f57702d3c4ea", RobustBitConfig.DEFAULT_VALUE) ? (ScrollViewModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c242255e65095b287e91f57702d3c4ea") : new ScrollViewModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean animateToOffset;
    public boolean bounces;
    public Float contentOffsetX;
    public Float contentOffsetY;
    public int overScrollMode;
    public String refreshStatus;
    public PicassoModel refreshView;
    public int scrollDirection;
    public boolean scrollEnabled;
    public boolean showScrollIndicator;

    public ScrollViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71767919725d3058ad59ce125ea3eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71767919725d3058ad59ce125ea3eda");
        } else {
            this.overScrollMode = 2;
        }
    }

    @Override // com.dianping.picasso.model.GroupModel, com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d430e8b4a87e442e3e260ef303b13f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d430e8b4a87e442e3e260ef303b13f3e");
            return;
        }
        switch (i) {
            case 12549:
                this.showScrollIndicator = unarchived.readBoolean();
                return;
            case 18284:
                this.contentOffsetX = Float.valueOf((float) unarchived.readDouble());
                return;
            case 18285:
                this.contentOffsetY = Float.valueOf((float) unarchived.readDouble());
                return;
            case 23584:
                this.refreshView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 27572:
                this.scrollEnabled = unarchived.readBoolean();
                return;
            case 31983:
                this.animateToOffset = unarchived.readBoolean();
                return;
            case 32429:
                this.refreshStatus = unarchived.readString();
                return;
            case 34308:
                this.overScrollMode = (int) unarchived.readDouble();
                return;
            case 38706:
                this.scrollDirection = (int) unarchived.readDouble();
                return;
            case 56043:
                this.bounces = unarchived.readBoolean();
                return;
            default:
                super.readExtraProperty(i, unarchived);
                return;
        }
    }
}
