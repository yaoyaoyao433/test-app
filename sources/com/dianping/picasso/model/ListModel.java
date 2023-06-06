package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.model.params.ListViewParams;
import com.dianping.picasso.view.list.PCSListAdapter;
import com.dianping.picassocontroller.annotation.PCSIgnored;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListModel extends PicassoModel {
    public static final DecodingFactory<ListModel> PICASSO_DECODER = new DecodingFactory<ListModel>() { // from class: com.dianping.picasso.model.ListModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListModel[] createArray(int i) {
            return new ListModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9258ca1d443fd754f1b9bea021d0b516", RobustBitConfig.DEFAULT_VALUE) ? (ListModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9258ca1d443fd754f1b9bea021d0b516") : new ListModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @PCSIgnored
    public PCSListAdapter adapter;
    public boolean animationToIndexPath;
    public boolean animationToOffset;
    public int batchCount;
    public boolean captureNestFling;
    public float captureResponderOffset;
    public String indexColor;
    public String[] indexTitles;
    public int initIndex;
    public int initItem;
    public int initSection;
    public ArrayList<ArrayList<ArrayList<ListItemActionConfig>>> itemActionConfigs;
    public ArrayList<ArrayList<PicassoModel>> items;
    public PicassoModel listFooterView;
    public PicassoModel listHeaderView;
    public PicassoModel loadingView;
    public boolean needStopScroll;
    public int nestScrollType;
    public float offset;
    public String refreshStatus;
    public PicassoModel refreshView;
    public String scrollBounce;
    public boolean scrollEnable;
    public PicassoModel[] sectionHeaders;
    public int[] sectionItemCounts;
    public boolean showScrollIndicator;
    public boolean stickySectionHeader;
    public Float toOffsetX;
    public Float toOffsetY;
    public String updateAction;
    public IndexPathModel[] updateIndexPathModels;

    public ListModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3412d08b2b9e65fa06ca41693afbf545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3412d08b2b9e65fa06ca41693afbf545");
            return;
        }
        this.batchCount = 15;
        this.initIndex = -1;
        this.animationToIndexPath = false;
        this.animationToOffset = false;
        this.showScrollIndicator = false;
        this.stickySectionHeader = false;
        this.scrollEnable = true;
        this.needStopScroll = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36528a94a513fb003bcbc424078c3f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36528a94a513fb003bcbc424078c3f9b");
            return;
        }
        switch (i) {
            case 334:
                this.updateIndexPathModels = (IndexPathModel[]) unarchived.readArray(IndexPathModel.PICASSO_DECODER);
                return;
            case 4754:
                this.animationToOffset = unarchived.readBoolean();
                return;
            case 5151:
                this.nestScrollType = (int) unarchived.readDouble();
                return;
            case 7932:
                double[] readDoubleArray = unarchived.readDoubleArray();
                if (readDoubleArray == null || readDoubleArray.length < 0) {
                    return;
                }
                this.sectionItemCounts = new int[readDoubleArray.length];
                for (int i2 = 0; i2 < readDoubleArray.length; i2++) {
                    this.sectionItemCounts[i2] = (int) readDoubleArray[i2];
                }
                return;
            case 10335:
                this.updateAction = unarchived.readString();
                return;
            case 12549:
                this.showScrollIndicator = unarchived.readBoolean();
                return;
            case 16904:
                if (unarchived.peek() == 65) {
                    this.itemActionConfigs = new ArrayList<>();
                    int readMemberHash16 = unarchived.readMemberHash16();
                    for (int i3 = 0; i3 < readMemberHash16; i3++) {
                        ArrayList arrayList = new ArrayList();
                        if (unarchived.peek() == 65) {
                            int readMemberHash162 = unarchived.readMemberHash16();
                            for (int i4 = 0; i4 < readMemberHash162; i4++) {
                                ArrayList arrayList2 = new ArrayList();
                                if (unarchived.peek() == 65) {
                                    int readMemberHash163 = unarchived.readMemberHash16();
                                    for (int i5 = 0; i5 < readMemberHash163; i5++) {
                                        arrayList2.add(unarchived.readObject(ListItemActionConfig.DECODER));
                                    }
                                    arrayList.add(arrayList2);
                                }
                            }
                            this.itemActionConfigs.add(arrayList);
                        }
                    }
                    return;
                }
                return;
            case 19523:
                this.initItem = (int) unarchived.readDouble();
                return;
            case 23584:
                this.refreshView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 25104:
                this.listHeaderView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 26040:
                this.animationToIndexPath = unarchived.readBoolean();
                return;
            case 28990:
                this.captureNestFling = unarchived.readBoolean();
                return;
            case 29349:
                this.needStopScroll = unarchived.readBoolean();
                return;
            case 32162:
                this.initIndex = (int) unarchived.readDouble();
                return;
            case 32429:
                this.refreshStatus = unarchived.readString();
                return;
            case 34602:
                this.toOffsetX = Float.valueOf((float) unarchived.readDouble());
                return;
            case 34603:
                this.toOffsetY = Float.valueOf((float) unarchived.readDouble());
                return;
            case 37377:
                this.loadingView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 48053:
                this.scrollBounce = unarchived.readString();
                return;
            case 48911:
                this.captureResponderOffset = (float) unarchived.readDouble();
                return;
            case 51633:
                this.indexColor = unarchived.readString();
                return;
            case 55437:
                this.indexTitles = unarchived.readStringArray();
                return;
            case 57269:
                this.initSection = (int) unarchived.readDouble();
                return;
            case 59328:
                if (unarchived.peek() == 65) {
                    int readMemberHash164 = unarchived.readMemberHash16();
                    this.items = new ArrayList<>();
                    for (int i6 = 0; i6 < readMemberHash164; i6++) {
                        ArrayList arrayList3 = new ArrayList();
                        if (unarchived.peek() == 65) {
                            int readMemberHash165 = unarchived.readMemberHash16();
                            for (int i7 = 0; i7 < readMemberHash165; i7++) {
                                arrayList3.add(unarchived.readObject(PicassoModel.PICASSO_DECODER));
                            }
                            this.items.add(arrayList3);
                        }
                    }
                    return;
                }
                return;
            case 60080:
                this.scrollEnable = unarchived.readBoolean();
                return;
            case 60641:
                this.sectionHeaders = (PicassoModel[]) unarchived.readArray(PicassoModel.PICASSO_DECODER);
                return;
            case 61033:
                this.stickySectionHeader = unarchived.readBoolean();
                return;
            case 65013:
                this.batchCount = (int) unarchived.readDouble();
                return;
            case 65054:
                this.listFooterView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            default:
                super.readExtraProperty(i, unarchived);
                return;
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void switchModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a0c94d9bb7959c3fc19bcf9bf24284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a0c94d9bb7959c3fc19bcf9bf24284");
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = new ListViewParams();
        }
        this.viewParams.switchModel(this);
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public boolean transformComponent(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9305c75bcbb5864ef63101dfbaa4d46c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9305c75bcbb5864ef63101dfbaa4d46c")).booleanValue();
        }
        if (picassoModel == null || picassoModel.isNull()) {
            return false;
        }
        if (picassoModel.equalComponentId(this.loadingView)) {
            this.loadingView = picassoModel;
            return true;
        } else if (picassoModel.equalComponentId(this.refreshView)) {
            this.refreshView = picassoModel;
            return true;
        } else if (picassoModel.equalComponentId(this.listHeaderView)) {
            this.listHeaderView = picassoModel;
            return true;
        } else if (picassoModel.equalComponentId(this.listFooterView)) {
            this.listFooterView = picassoModel;
            return true;
        } else {
            if (this.sectionHeaders != null) {
                for (int i = 0; i < this.sectionHeaders.length; i++) {
                    if (picassoModel.equalComponentId(this.sectionHeaders[i])) {
                        this.sectionHeaders[i] = picassoModel;
                        if (this.adapter instanceof PCSListAdapter) {
                            this.adapter.updateItemPModel(i, -1, picassoModel);
                        }
                        return true;
                    }
                }
            }
            if (this.items != null) {
                for (int i2 = 0; i2 < this.items.size(); i2++) {
                    ArrayList<PicassoModel> arrayList = this.items.get(i2);
                    if (arrayList != null) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (picassoModel.equalComponentId(arrayList.get(i3))) {
                                arrayList.set(i3, picassoModel);
                                if (this.adapter instanceof PCSListAdapter) {
                                    this.adapter.updateItemPModel(i2, i3, picassoModel);
                                }
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
    }
}
