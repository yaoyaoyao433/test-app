package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picassocontroller.debug.e;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GroupModel extends PicassoModel {
    public static final DecodingFactory<GroupModel> PICASSO_DECODER = new DecodingFactory<GroupModel>() { // from class: com.dianping.picasso.model.GroupModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final GroupModel[] createArray(int i) {
            return new GroupModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final GroupModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85c7f94dace14f453edbf88b402d0523", RobustBitConfig.DEFAULT_VALUE) ? (GroupModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85c7f94dace14f453edbf88b402d0523") : new GroupModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean clipToBounds;
    @Expose
    public PicassoModel[] subviews;

    public GroupModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea2eb52b2405479436f7e55519091406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea2eb52b2405479436f7e55519091406");
        } else {
            this.clipToBounds = true;
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d25b32b905e032afb77dc60507580faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d25b32b905e032afb77dc60507580faf");
        } else if (i == 17454) {
            this.subviews = (PicassoModel[]) unarchived.readArray(PicassoModel.PICASSO_DECODER);
        } else if (i == 41088) {
            this.clipToBounds = unarchived.readBoolean();
        } else {
            super.readExtraProperty(i, unarchived);
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void buildYogaNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da61928f98bf7778946fd5328efeda55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da61928f98bf7778946fd5328efeda55");
            return;
        }
        super.buildYogaNode();
        if (this.subviews == null) {
            return;
        }
        for (int i = 0; i < this.subviews.length; i++) {
            if (this.subviews[i].node != null) {
                this.node.a(this.subviews[i].node, this.node.c());
            } else if (e.a().b().booleanValue()) {
                e.a().a("请检查使用flex布局的全部视图层级，所有视图必须包含flexStyle属性", 0);
            }
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void updatePModelByYoga() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7f759104a8eda6f6f2d67c65d8dd4ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7f759104a8eda6f6f2d67c65d8dd4ba");
            return;
        }
        super.updatePModelByYoga();
        if (this.subviews == null) {
            return;
        }
        for (PicassoModel picassoModel : this.subviews) {
            picassoModel.updatePModelByYoga();
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public boolean transformComponent(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e802a4fff244cce93184486878ce62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e802a4fff244cce93184486878ce62")).booleanValue();
        }
        if (picassoModel == null || picassoModel.isNull() || this.subviews == null) {
            return false;
        }
        for (int i = 0; i < this.subviews.length; i++) {
            if (picassoModel.equalComponentId(this.subviews[i])) {
                this.subviews[i] = picassoModel;
                return true;
            }
        }
        return false;
    }
}
