package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.view.list.StickyTopInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListItemModel extends GroupModel implements StickyTopInterface {
    public static final DecodingFactory<ListItemModel> DeCODER = new DecodingFactory<ListItemModel>() { // from class: com.dianping.picasso.model.ListItemModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListItemModel[] createArray(int i) {
            return new ListItemModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListItemModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c6e0dc037259324fe5c231364f26cb", RobustBitConfig.DEFAULT_VALUE) ? (ListItemModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c6e0dc037259324fe5c231364f26cb") : new ListItemModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int reuseId;
    public Float stickyTop;
    public int uniqueId;

    @Override // com.dianping.picasso.model.GroupModel, com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0995608896ec9e363164669598538f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0995608896ec9e363164669598538f93");
        } else if (i == 25260) {
            this.stickyTop = Float.valueOf((float) unarchived.readDouble());
        } else if (i == 25263) {
            this.reuseId = unarchived.readString().hashCode();
        } else if (i == 58572) {
            this.uniqueId = unarchived.readString().hashCode();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }

    @Override // com.dianping.picasso.view.list.StickyTopInterface
    public Integer getStickyTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5233257ffca6b6056999a5c18a7265b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5233257ffca6b6056999a5c18a7265b8");
        }
        if (this.stickyTop != null) {
            return Integer.valueOf(PicassoUtils.dp2px(PicassoEnvironment.globalContext, this.stickyTop.floatValue()));
        }
        return null;
    }
}
