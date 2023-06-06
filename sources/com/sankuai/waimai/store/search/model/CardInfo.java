package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CardInfo implements Serializable {
    public static final int TYPE_NOLBS = 6;
    public static final int TYPE_PAOTUI = 5;
    public static final int TYPE_POI = 1;
    public static final int TYPE_SPU = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public CardMore cardMore;
    private OasisModule cardMoreModule;
    @SerializedName("title")
    public CardTitle cardTitle;
    private OasisModule cardTitleModule;
    @SerializedName("card_type")
    public int cardType;
    @SerializedName("show_num")
    public int defNum;
    public boolean first;
    @SerializedName("index")
    public int index;
    @SerializedName("keyword")
    public String keyword;
    public int lastShowNum;
    private List<OasisModule> list;
    @SerializedName("list_sign")
    public int listSign;
    @SerializedName("list_template_id")
    public String listTemplateId;
    private String mSearchLogId;
    @SerializedName("more_show_num")
    public int moreNum;
    @SerializedName("more_show_text")
    public String moreShowText;
    @SerializedName("pick_up_text")
    public String pickUpText;
    @SerializedName("card_poi_info_list")
    public List<PoiEntity> poiCards;
    @SerializedName("region_id")
    public int regionId;
    public int showNum;
    @SerializedName("card_spu_info_list")
    public List<f> spuCards;
    private int templateDetail;
    public String templateId;

    public CardInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69322eda8f51ac71b9676412818bf5f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69322eda8f51ac71b9676412818bf5f1");
            return;
        }
        this.list = new ArrayList();
        this.first = true;
    }

    public void init(List<OasisModule> list, int i, String str, SearchShareData searchShareData, String str2) {
        Object[] objArr = {list, Integer.valueOf(i), str, searchShareData, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "499f22052cb7993ff605cd21f2690249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "499f22052cb7993ff605cd21f2690249");
            return;
        }
        this.templateDetail = i;
        this.mSearchLogId = str2;
        if (this.cardTitle == null) {
            this.cardTitle = new CardTitle();
        }
        if (this.cardMore == null) {
            this.cardMore = new CardMore(this);
        }
        if (str.equals("wm_shangou_search_nondelivery_paotui_card")) {
            this.cardTitle.setType(5);
            this.cardMore.setType(5);
        } else {
            this.cardTitle.setType(6);
            this.cardMore.setType(6);
        }
        this.cardMore.expandText = this.moreShowText;
        this.cardMore.pickupText = this.pickUpText;
        this.cardMore.showType = 1;
        this.cardMoreModule = getOasisModule(this.cardMore, "wm_shangou_card_more");
        this.cardTitleModule = getOasisModule(this.cardTitle, "wm_shangou_card_title");
        if (!t.a(str2)) {
            searchShareData.a(this.cardMoreModule.data, str2);
            searchShareData.a(this.cardTitleModule.data, str2);
        }
        if (this.listSign == 1) {
            List<OasisModule> oasisModulePoiList = getOasisModulePoiList(this.poiCards);
            if (!com.sankuai.shangou.stone.util.a.b(oasisModulePoiList)) {
                if (!t.a(str2)) {
                    for (OasisModule oasisModule : oasisModulePoiList) {
                        searchShareData.a(oasisModule.data, str2);
                    }
                }
                this.list.addAll(oasisModulePoiList);
            }
        } else if (this.listSign == 2) {
            List<OasisModule> oasisModuleSpuList = getOasisModuleSpuList(this.spuCards);
            if (!com.sankuai.shangou.stone.util.a.b(oasisModuleSpuList)) {
                if (!t.a(str2)) {
                    for (OasisModule oasisModule2 : oasisModuleSpuList) {
                        searchShareData.a(oasisModule2.data, str2);
                    }
                }
                this.list.addAll(oasisModuleSpuList);
            }
        }
        splitData(list);
    }

    private void splitData(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "142518c92fd69a7e71b8a69a6299c5a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "142518c92fd69a7e71b8a69a6299c5a5");
        } else if (!com.sankuai.shangou.stone.util.a.b(this.list)) {
            if (this.cardTitleModule != null) {
                list.add(this.cardTitleModule);
            }
            int min = Math.min(this.defNum, this.list.size());
            for (int i = 0; i < min; i++) {
                list.add(this.list.get(i));
            }
            this.showNum = min;
            this.lastShowNum = min;
            if (this.cardMoreModule == null || this.defNum >= this.list.size()) {
                return;
            }
            list.add(this.cardMoreModule);
        }
    }

    public int getFoldNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36eb2a02775b0ce8e73384c50898aa4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36eb2a02775b0ce8e73384c50898aa4f")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.list)) {
            return 0;
        }
        return this.list.size() - this.showNum;
    }

    public List<OasisModule> getCardList() {
        return this.list;
    }

    @Nullable
    private List<OasisModule> getOasisModulePoiList(List<PoiEntity> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8ef9bfc25fbffdb528bc1469f74c9f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8ef9bfc25fbffdb528bc1469f74c9f9");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            PoiEntity poiEntity = (PoiEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (poiEntity != null) {
                poiEntity.templateDetail = this.templateDetail;
                OasisModule oasisModule = getOasisModule(poiEntity, this.listTemplateId);
                poiEntity.setInCardIndex(i);
                arrayList.add(oasisModule);
            }
        }
        return arrayList;
    }

    @Nullable
    private List<OasisModule> getOasisModuleSpuList(List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2df3f8a6a5410f492e00153d24377323", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2df3f8a6a5410f492e00153d24377323");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (fVar != null) {
                OasisModule oasisModule = getOasisModule(fVar, this.listTemplateId);
                fVar.setInCardIndex(i);
                arrayList.add(oasisModule);
            }
        }
        return arrayList;
    }

    private OasisModule getOasisModule(Serializable serializable, String str) {
        Object[] objArr = {serializable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c599d8cefa02d1cc85d6ec40e864c74", RobustBitConfig.DEFAULT_VALUE)) {
            return (OasisModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c599d8cefa02d1cc85d6ec40e864c74");
        }
        OasisModule oasisModule = new OasisModule();
        oasisModule.data = serializable;
        oasisModule.nativeTemplateId = str;
        oasisModule.templateType = 0;
        oasisModule.moduleId = this.listTemplateId;
        return oasisModule;
    }

    public int getAddCount() {
        return this.showNum - this.lastShowNum;
    }

    public boolean canShowMore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63940295737d6d77cc53c4fa9989a391", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63940295737d6d77cc53c4fa9989a391")).booleanValue() : this.showNum < com.sankuai.shangou.stone.util.a.c(this.list);
    }

    public void onMoreClick(List<OasisModule> list, int i, SearchShareData searchShareData) {
        Object[] objArr = {list, Integer.valueOf(i), searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded3610ddd8e15c074ac10d61974f5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded3610ddd8e15c074ac10d61974f5b9");
        } else if (this.list.size() <= 0) {
        } else {
            processIndex();
            if (this.showNum < this.list.size()) {
                this.showNum += Math.min(this.moreNum, this.list.size() - this.lastShowNum);
                int i2 = this.lastShowNum;
                int i3 = i;
                while (i2 < this.showNum) {
                    if (!t.a(this.mSearchLogId)) {
                        searchShareData.a(this.list.get(i2), this.mSearchLogId);
                    }
                    list.add(i3, this.list.get(i2));
                    i2++;
                    i3++;
                }
                if (this.showNum >= this.list.size()) {
                    this.cardMore.showType = 2;
                } else {
                    this.cardMore.showType = 1;
                }
                this.lastShowNum = this.showNum;
                return;
            }
            int size = this.list.size() - 1;
            int i4 = i;
            while (size >= this.defNum) {
                int i5 = i4 - 1;
                if (i5 >= 0 && i5 < list.size()) {
                    list.remove(i5);
                }
                size--;
                i4--;
            }
            this.lastShowNum = this.defNum;
            this.showNum = this.defNum;
            this.cardMore.showType = 1;
        }
    }

    private void processIndex() {
        int min;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91185bcb59be7b84c295dfaf6279a6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91185bcb59be7b84c295dfaf6279a6a6");
        } else if (this.first) {
            if (this.showNum < this.list.size() && (min = Math.min(this.defNum, this.list.size())) > 0) {
                OasisModule oasisModule = this.list.get(min - 1);
                int statisticsIndex = oasisModule.data instanceof com.sankuai.waimai.store.search.statistics.i ? ((com.sankuai.waimai.store.search.statistics.i) oasisModule.data).getStatisticsIndex() : 0;
                while (min < this.list.size()) {
                    OasisModule oasisModule2 = this.list.get(min);
                    if (oasisModule2.data instanceof com.sankuai.waimai.store.search.statistics.i) {
                        ((com.sankuai.waimai.store.search.statistics.i) oasisModule2.data).setStatisticsIndex(statisticsIndex);
                    }
                    min++;
                }
            }
            this.first = false;
        }
    }

    public int getRegion() {
        return this.regionId;
    }
}
