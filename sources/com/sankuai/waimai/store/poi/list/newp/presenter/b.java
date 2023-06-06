package com.sankuai.waimai.store.poi.list.newp.presenter;

import android.os.Build;
import android.util.Size;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.model.e;
import com.sankuai.waimai.store.poi.list.newp.contract.d;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiTwoLevelConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.TabItem;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.af;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGAPIBusinessSuccessRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGParseAll;
import com.sankuai.waimai.store.util.monitor.monitor.SGRequestAll;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.poi.list.newp.contract.c {
    public static ChangeQuickRedirect a;
    d.a b;
    public PoiVerticalityDataResponse c;
    com.sankuai.waimai.store.param.a d;
    public final e e;
    boolean f;
    public PoiVerticalityDataResponse g;
    private List<CategoryInfo> h;
    private long i;
    private String j;
    private boolean k;

    public static /* synthetic */ void a(b bVar, String str, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {str, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "41d245e078ff1930afe3f0be5870a49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "41d245e078ff1930afe3f0be5870a49a");
        } else if (o.j() && bVar.d != null && poiVerticalityDataResponse != null) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.7
            }.getType(), new ArrayList());
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            if ("v9/poi/supermarket/channelpage".equals(str)) {
                if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                    return;
                }
                List<PoiCardInfo> list = poiVerticalityDataResponse.poiCardInfos;
                for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                    PoiCardInfo poiCardInfo = (PoiCardInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                    if (poiCardInfo != null && poiCardInfo.moduleDesc != null && !t.a(poiCardInfo.moduleDesc.templateId)) {
                        String str2 = poiCardInfo.moduleDesc.templateId;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            Map map = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                            if (map != null && map.get("templateID") != null && ((String) map.get("templateID")).equals(str2)) {
                                com.sankuai.waimai.store.util.monitor.b.a().a(SGParseAll.SGParseAll).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(bVar.d.c)).a("module_name", str2).a("interface_name", str).a();
                            }
                        }
                    }
                }
            } else if (!com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.getBannerBlocks())) {
                ArrayList<BaseTileNew<BaseModuleDesc, Object>> bannerBlocks = poiVerticalityDataResponse.getBannerBlocks();
                for (int i3 = 0; i3 < com.sankuai.shangou.stone.util.a.c(bannerBlocks); i3++) {
                    BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) bannerBlocks, i3);
                    if (baseTileNew != null && !t.a(baseTileNew.sourceId)) {
                        String str3 = baseTileNew.sourceId;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            Map map2 = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i4);
                            if (map2 != null && map2.get("templateID") != null && ((String) map2.get("templateID")).equals(str3)) {
                                com.sankuai.waimai.store.util.monitor.b.a().a(SGParseAll.SGParseAll).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(bVar.d.c)).a("module_name", str3).a("interface_name", str).a();
                            }
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "33da850f67958440dcb46622f0b861e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "33da850f67958440dcb46622f0b861e1");
        } else if (!o.j() || com.meituan.android.singleton.b.a == null || bVar.d == null) {
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGAPIBusinessSuccessRate.SGAPIBusinessSuccessRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(bVar.d.c)).a("interface_name", str).a(NetLogConstants.Tags.NETWORK_TYPE, p.b(com.meituan.android.singleton.b.a)).a("device_type", Build.MODEL).a(z).a();
        }
    }

    public b(d.a aVar, com.sankuai.waimai.store.param.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3eb874a272a6a638eb90a016086e2a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3eb874a272a6a638eb90a016086e2a0");
            return;
        }
        this.e = new e();
        this.f = false;
        this.k = false;
        this.b = aVar;
        this.d = aVar2;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.c
    public final boolean b() {
        return this.k;
    }

    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e378ecd3186022b5ad069633dbe0e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e378ecd3186022b5ad069633dbe0e4");
            return;
        }
        if (poiVerticalityDataResponse.blocks == null) {
            poiVerticalityDataResponse.blocks = new PoiVerticalityDataResponse.HomeTiles();
        }
        if (poiVerticalityDataResponse.blocks.toolbarBlock == null) {
            poiVerticalityDataResponse.blocks.toolbarBlock = new BaseTile<>();
            if (poiVerticalityDataResponse.blocks.toolbarBlock.propsData == null) {
                poiVerticalityDataResponse.blocks.toolbarBlock.propsData = (V) j.h().a("sm_home_tab_default_info/homeTabInfo", new TypeToken<PoiVerticalityDataResponse.HomeBottomBg>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.2
                }.getType());
            }
            if (poiVerticalityDataResponse.blocks.toolbarBlock.data == null) {
                poiVerticalityDataResponse.blocks.toolbarBlock.data = new PoiVerticalityDataResponse.HomepageTabVO();
                poiVerticalityDataResponse.blocks.toolbarBlock.data.tabList = (List) j.h().a("sm_home_tab_default_info/otherTabs", new TypeToken<List<TabItem>>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.3
                }.getType());
            }
            poiVerticalityDataResponse.blocks.toolbarBlock.jsonStr = i.a(poiVerticalityDataResponse.blocks.toolbarBlock);
        }
        if (poiVerticalityDataResponse.blocks.navigationBlock == null) {
            poiVerticalityDataResponse.blocks.navigationBlock = new BaseTile<>();
            if (poiVerticalityDataResponse.blocks.navigationBlock.propsData == null) {
                poiVerticalityDataResponse.blocks.navigationBlock.propsData = new NavigationTileConfig();
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.pageTitle = this.d.d();
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.hide_share = 1;
                String a2 = j.h().a("home_channel_def_config/msgScheme", "");
                if (t.a(a2)) {
                    poiVerticalityDataResponse.blocks.navigationBlock.propsData.hide_msg = 1;
                } else {
                    poiVerticalityDataResponse.blocks.navigationBlock.propsData.msgScheme = a2;
                }
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.searchButtonTextColor = "#222426";
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.searchButtonBgFromColor = "#FFEC62";
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.searchButtonBgToColor = "#FFD000";
                poiVerticalityDataResponse.blocks.navigationBlock.propsData.titleColorStyle = "0";
            }
            if (poiVerticalityDataResponse.blocks.navigationBlock.data == null) {
                poiVerticalityDataResponse.blocks.navigationBlock.data = new BaseModuleDesc();
                poiVerticalityDataResponse.blocks.navigationBlock.data.functionEntranceList = (List) j.h().a("home_channel_def_config/function_entrance_list", new TypeToken<List<TitleMenuItemEntity>>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.4
                }.getType());
            }
            poiVerticalityDataResponse.blocks.navigationBlock.jsonStr = i.a(poiVerticalityDataResponse.blocks.navigationBlock);
        }
        if (poiVerticalityDataResponse.blocks.backgroundBlock == null) {
            poiVerticalityDataResponse.blocks.backgroundBlock = new BaseTile<>();
            if (poiVerticalityDataResponse.blocks.backgroundBlock.propsData == null) {
                poiVerticalityDataResponse.blocks.backgroundBlock.propsData = new PoiChannelBackgroundConfig();
                poiVerticalityDataResponse.blocks.backgroundBlock.propsData.minuteBgColorFrm = "#FFEC62";
                poiVerticalityDataResponse.blocks.backgroundBlock.propsData.minuteBgColorTo = "#FFD000";
                poiVerticalityDataResponse.blocks.backgroundBlock.propsData.headBgImageUrl = "http://p0.meituan.net";
                if (this.d.y && !this.d.aS) {
                    poiVerticalityDataResponse.blocks.backgroundBlock.propsData.errorHomeHeadDefColor = "#FFFFFF";
                }
            }
            poiVerticalityDataResponse.blocks.backgroundBlock.propsData.subCateTextSelectedBgColorFrm = "#FFEC62";
            poiVerticalityDataResponse.blocks.backgroundBlock.propsData.subCateTextSelectedBgColorTo = "#FFD000";
            poiVerticalityDataResponse.blocks.backgroundBlock.propsData.quickFilterBgColorFrm = "#FFEC62";
            poiVerticalityDataResponse.blocks.backgroundBlock.propsData.quickFilterBgColorTo = "#FFD000";
            poiVerticalityDataResponse.blocks.backgroundBlock.jsonStr = i.a(poiVerticalityDataResponse.blocks.backgroundBlock);
        }
        if (poiVerticalityDataResponse.pageConfig == null) {
            poiVerticalityDataResponse.pageConfig = new PoiVerticalityDataResponse.PageConfig();
            if (poiVerticalityDataResponse.pageConfig.propsData == null) {
                poiVerticalityDataResponse.pageConfig.propsData = new PoiVerticalityDataResponse.PagePropsData();
            }
            if (poiVerticalityDataResponse.pageConfig.propsData.visionPromotion == null) {
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion = new PoiChannelBackgroundConfig();
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.minuteBgColorFrm = "#FFEC62";
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.minuteBgColorTo = "#FFD000";
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.headBgImageUrl = "http://p0.meituan.net";
                if (this.d.y && !this.d.aS) {
                    poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.errorHomeHeadDefColor = "#FFFFFF";
                }
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.subCateTextSelectedBgColorFrm = "#FFEC62";
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.subCateTextSelectedBgColorTo = "#FFD000";
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.quickFilterBgColorFrm = "#FFEC62";
                poiVerticalityDataResponse.pageConfig.propsData.visionPromotion.quickFilterBgColorTo = "#FFD000";
            }
            poiVerticalityDataResponse.pageConfig.jsonStr = i.a(poiVerticalityDataResponse.pageConfig);
        }
    }

    public final void a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc3e3b5eb25ae0730479213c515488b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc3e3b5eb25ae0730479213c515488b");
        } else if (this.c == null || this.g == null) {
        } else {
            if (aVar.y && aVar.ag > 0) {
                ae.a("HomeOpen", "step 5.3 list response, can be callback");
            }
            this.b.a(this.g);
            this.g = null;
            this.f = false;
        }
    }

    private void a(final com.sankuai.waimai.store.param.a aVar, boolean z, boolean z2) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ff9cb17e3bf34626e1034ac3ac8d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ff9cb17e3bf34626e1034ac3ac8d8f");
            return;
        }
        com.sankuai.waimai.store.base.net.j<PoiVerticalityDataResponse> jVar = new com.sankuai.waimai.store.base.net.j<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aeb54df6e36eab16618f63140ebcdf11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aeb54df6e36eab16618f63140ebcdf11");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
                PoiVerticalityDataResponse poiVerticalityDataResponse2 = poiVerticalityDataResponse;
                boolean z3 = true;
                Object[] objArr2 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7d4a9cf86db3931975fbe4005735ffe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7d4a9cf86db3931975fbe4005735ffe");
                    return;
                }
                af.a(b.this.b.a(), "sg.channel.apiend2.native");
                b.this.g = poiVerticalityDataResponse2;
                if (aVar.y && aVar.ag > 0) {
                    ae.a("HomeOpen", "step 5.1 list response");
                }
                b bVar = b.this;
                Object[] objArr3 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "8fe613bdd2f609dfe4f9c86e18eef035", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "8fe613bdd2f609dfe4f9c86e18eef035");
                } else if (poiVerticalityDataResponse2 != null) {
                    List<CategoryInfo> list = poiVerticalityDataResponse2.subNaviInfo != null ? poiVerticalityDataResponse2.subNaviInfo.categoryInfos : null;
                    if (!com.sankuai.shangou.stone.util.a.b(list)) {
                        for (CategoryInfo categoryInfo : list) {
                            if (categoryInfo != null && categoryInfo.isShow == 1 && bVar.d != null) {
                                bVar.d.K = categoryInfo.template_code;
                                bVar.d.f = categoryInfo.code;
                            }
                        }
                    }
                }
                b.this.d.aG = poiVerticalityDataResponse2.traceId;
                b bVar2 = b.this;
                Object[] objArr4 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "9ff7dd6216463b469ea1b8dbc0a96dcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "9ff7dd6216463b469ea1b8dbc0a96dcd");
                } else if (poiVerticalityDataResponse2 != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse2.getPoiList())) {
                    for (PoiVerticality poiVerticality : poiVerticalityDataResponse2.getPoiList()) {
                        if (poiVerticality != null) {
                            poiVerticality.boldingList = poiVerticalityDataResponse2.boldingList;
                        }
                    }
                }
                b bVar3 = b.this;
                Object[] objArr5 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "a36be20051f745955adbe941f754d457", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "a36be20051f745955adbe941f754d457");
                } else if (bVar3.d.K == 1) {
                    if (poiVerticalityDataResponse2.extra != null && poiVerticalityDataResponse2.extra.poiType == 2) {
                        bVar3.d.u = com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse2.poiCardInfos) < com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse2.allSortedSpuIds);
                    } else {
                        bVar3.d.u = com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse2.spuList) < com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse2.allSortedSpuIds);
                    }
                    bVar3.b(poiVerticalityDataResponse2);
                } else {
                    bVar3.d.u = poiVerticalityDataResponse2.hasNextPage;
                    if (poiVerticalityDataResponse2.subNaviInfo != null && poiVerticalityDataResponse2.subNaviInfo.subNavStyle == 3) {
                        bVar3.b(poiVerticalityDataResponse2);
                    }
                }
                b bVar4 = b.this;
                Object[] objArr6 = {poiVerticalityDataResponse2};
                ChangeQuickRedirect changeQuickRedirect6 = b.a;
                if (PatchProxy.isSupport(objArr6, bVar4, changeQuickRedirect6, false, "585a0c284b856821328def5decd2a18f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar4, changeQuickRedirect6, false, "585a0c284b856821328def5decd2a18f");
                } else {
                    bVar4.d.aQ.clear();
                    bVar4.d.l.clear();
                    if (poiVerticalityDataResponse2.judasField != null && poiVerticalityDataResponse2.judasField.rankTraceId != null) {
                        bVar4.d.k = poiVerticalityDataResponse2.judasField.rankTraceId;
                        if (poiVerticalityDataResponse2.subNaviInfo != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse2.subNaviInfo.categoryInfos)) {
                            for (CategoryInfo categoryInfo2 : poiVerticalityDataResponse2.subNaviInfo.categoryInfos) {
                                if (categoryInfo2 != null && categoryInfo2.isShow == 1) {
                                    bVar4.d.l.put(categoryInfo2.code, poiVerticalityDataResponse2.judasField.rankTraceId);
                                }
                            }
                        }
                    }
                }
                b.this.a(aVar);
                aVar.bo = false;
                b.a(b.this, "v9/poi/supermarket/channelpage", true);
                aVar.bw = (poiVerticalityDataResponse2 == null || poiVerticalityDataResponse2.poiCardInfos == null) ? 0 : com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse2.poiCardInfos);
                aVar.bt = (poiVerticalityDataResponse2 == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse2.poiCardInfos)) ? "BlankDataError" : "Success";
                aVar.br = true;
                b.a(b.this, "v9/poi/supermarket/channelpage", poiVerticalityDataResponse2);
                aVar.bz = (poiVerticalityDataResponse2 == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse2.poiCardInfos)) ? false : false;
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e240c9d10474a8b9579c964d479d604e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e240c9d10474a8b9579c964d479d604e");
                    return;
                }
                af.a(b.this.b.a(), "sg.channel.apiend2.native");
                aVar.aR = false;
                if (aVar.y && aVar.ag > 0) {
                    ae.a("HomeOpen", "step 5.2 list response, error");
                }
                b.this.g = new PoiVerticalityDataResponse();
                b.this.g.mSCApiException = bVar;
                b.this.a(aVar);
                b.a(b.this, "v9/poi/supermarket/channelpage", false);
                aVar.bt = "BlankDataError";
            }
        };
        com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.b()).a(aVar, aVar.b, 20, aVar.c, aVar.f, aVar.k, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), this.b.c(), z, this.b.d(), aVar.J, this.b.f(), aVar.K, aVar.n, z2 ? 1 : 0, aVar.aj, this.b.g(), (String) null, (String) null, aVar.m, jVar);
        a("v9/poi/supermarket/channelpage");
    }

    void b(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3b7b8ffa78d5f3fbb509ed3bc8ef5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3b7b8ffa78d5f3fbb509ed3bc8ef5a");
        } else if (poiVerticalityDataResponse.subNaviInfo != null && (this.h == null || this.i != this.d.c || com.sankuai.shangou.stone.util.a.a((List) this.h) < com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse.subNaviInfo.categoryInfos))) {
            this.h = poiVerticalityDataResponse.subNaviInfo.categoryInfos;
            this.i = this.d.c;
        } else {
            if (poiVerticalityDataResponse.subNaviInfo == null) {
                poiVerticalityDataResponse.subNaviInfo = new PoiVerticalityDataResponse.SubNaviInfo();
            }
            poiVerticalityDataResponse.subNaviInfo.categoryInfos = this.h;
            if (com.sankuai.shangou.stone.util.a.b(this.h)) {
                return;
            }
            for (CategoryInfo categoryInfo : this.h) {
                if (categoryInfo != null) {
                    categoryInfo.isShow = 0;
                    if (String.valueOf(this.j).equals(categoryInfo.code)) {
                        categoryInfo.isShow = 1;
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.e.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec70275bd96fbe56825424bfd785eb50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec70275bd96fbe56825424bfd785eb50");
            return;
        }
        this.d.n = i;
        this.d.b = 0L;
        this.d.k = "";
        this.d.g = 0L;
        this.d.i = "";
        this.d.j = "";
        final com.sankuai.waimai.store.param.a aVar = this.d;
        Object[] objArr2 = {aVar, (byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd2a3115ffc37f58ccf745eb323cfc02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd2a3115ffc37f58ccf745eb323cfc02");
            return;
        }
        af.a(this.b.a(), "sg.channel.apistart.native");
        this.b.a(aVar, true);
        this.j = this.d.f;
        this.k = true;
        this.f = true;
        this.c = null;
        this.g = null;
        if (aVar.y && aVar.ag > 0) {
            ae.a("HomeOpen", "step 3. request start.");
        }
        Object[] objArr3 = {aVar, (byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9869c6e6b3fb1e2bcba9c53dcc1e0d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9869c6e6b3fb1e2bcba9c53dcc1e0d68");
        } else {
            final e.b bVar = new e.b() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
                    int i2 = 0;
                    Object[] objArr4 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b6f2d2e6c5e9723f53f3f78c7e889ec9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b6f2d2e6c5e9723f53f3f78c7e889ec9");
                        return;
                    }
                    af.a(b.this.b.a(), "sg.channel.apiend.native");
                    b.this.c = poiVerticalityDataResponse;
                    Object[] objArr5 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f132e91e8c449a7ae2c0272d40069d12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f132e91e8c449a7ae2c0272d40069d12");
                    } else {
                        b.this.d.aF = poiVerticalityDataResponse.extra != null ? poiVerticalityDataResponse.extra.traceId : "";
                        b.this.d.aI = poiVerticalityDataResponse.extra != null ? poiVerticalityDataResponse.extra.traceId : "";
                        aVar.bo = false;
                    }
                    if (aVar.y && aVar.ag > 0) {
                        ae.a("HomeOpen", "step 4.1 home response, can be callback");
                    }
                    b.this.b.a(poiVerticalityDataResponse, aVar, r3);
                    b.this.a(aVar);
                    aVar.bo = false;
                    b.a(b.this, aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel", true);
                    com.sankuai.waimai.store.param.a aVar2 = aVar;
                    if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.getBannerBlocks() != null) {
                        i2 = com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse.getBannerBlocks());
                    }
                    aVar2.bu = i2;
                    aVar.bq = true;
                    b.a(b.this, aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel", poiVerticalityDataResponse);
                }

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.repository.net.b bVar2) {
                    int i2 = 0;
                    Object[] objArr4 = {poiVerticalityDataResponse, bVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "59f5bd2f6a7574510cf7080528104a31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "59f5bd2f6a7574510cf7080528104a31");
                        return;
                    }
                    af.a(b.this.b.a(), "sg.channel.apiend.native");
                    b.this.f = false;
                    b.this.c = poiVerticalityDataResponse;
                    if (aVar.y && aVar.ag > 0) {
                        ae.a("HomeOpen", "step 4.2 home response, data error");
                    }
                    try {
                        b.this.a(b.this.c);
                        b.this.b.a(b.this.c, aVar, r3);
                        b.this.a(aVar);
                        b.this.b.a("", r3, false, bVar2);
                    } catch (Throwable th) {
                        com.sankuai.waimai.store.base.log.a.a(th);
                    }
                    aVar.bo = false;
                    b.a(b.this, aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel", true);
                    com.sankuai.waimai.store.param.a aVar2 = aVar;
                    if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.getBannerBlocks() != null) {
                        i2 = com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse.getBannerBlocks());
                    }
                    aVar2.bu = i2;
                    aVar.bq = true;
                    b.a(b.this, aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel", poiVerticalityDataResponse);
                }

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                    boolean z = true;
                    Object[] objArr4 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "274a4098b80afd0e45cbc7b1cfe9ba17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "274a4098b80afd0e45cbc7b1cfe9ba17");
                        return;
                    }
                    af.a(b.this.b.a(), "sg.channel.apiend.native");
                    z = (bVar2 == null || !bVar2.a()) ? false : false;
                    String str = (bVar2 == null || z) ? "" : bVar2.b;
                    if (aVar.y && aVar.ag > 0) {
                        ae.a("HomeOpen", "step 4.2 home response, error : " + str);
                    }
                    b.this.f = false;
                    try {
                        b.this.c = new PoiVerticalityDataResponse();
                        b.this.a(b.this.c);
                        b.this.b.a(b.this.c, aVar, r3);
                        b.this.a(aVar);
                        b.this.b.a(str, r3, z, bVar2);
                    } catch (Throwable th) {
                        com.sankuai.waimai.store.base.log.a.a(th);
                    }
                    b.a(b.this, aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel", false);
                }
            };
            final e eVar = this.e;
            String b = this.b.b();
            long c = this.b.c();
            String d = this.b.d();
            Object[] objArr4 = {b, aVar, (byte) 1, new Long(c), d, this.b.f(), (byte) 0, bVar};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "3463a5cd238aeb48bc010f82962bb269", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "3463a5cd238aeb48bc010f82962bb269");
            } else if (!eVar.b) {
                eVar.b = true;
                Object[] objArr5 = {b, aVar, new Long(c), d, bVar};
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "d0840bad061babdd4834a1f59b5e34e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "d0840bad061babdd4834a1f59b5e34e4");
                } else {
                    k<PoiVerticalityDataResponse> kVar = new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.model.e.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                            Object[] objArr6 = {poiVerticalityDataResponse};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7403c7da31385313cbf014af5446afcb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7403c7da31385313cbf014af5446afcb");
                                return;
                            }
                            e.a(eVar, poiVerticalityDataResponse);
                            bVar.a(poiVerticalityDataResponse);
                            eVar.b = false;
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                            Object[] objArr6 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "407d34870949e645275b92f929530b02", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "407d34870949e645275b92f929530b02");
                                return;
                            }
                            eVar.b = false;
                            if (bVar2.c == 2 && bVar2.e != null) {
                                bVar.a((PoiVerticalityDataResponse) bVar2.e, bVar2);
                            } else {
                                bVar.a(bVar2);
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void b() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1d8e6c0bfcb9f025a6e896536633611c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1d8e6c0bfcb9f025a6e896536633611c");
                                return;
                            }
                            super.b();
                            eVar.b = false;
                        }
                    };
                    String str = aVar.y ? "sg_home" : "sg_channel";
                    long j = aVar.c;
                    if (aVar.w > 0) {
                        j = aVar.w;
                    }
                    com.sankuai.waimai.store.base.net.sg.a.a((Object) b).a(aVar, String.valueOf(aVar.c), aVar.f, c, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), d, aVar.m, j, str, kVar);
                }
            }
            a(aVar.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel");
        }
        a(aVar, true, false);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.e.a
    public final void b(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547ac7c923949b54d8bf2d51b4cd318a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547ac7c923949b54d8bf2d51b4cd318a");
            return;
        }
        this.d.n = 0;
        this.d.b = 0L;
        this.d.k = "";
        this.f = true;
        this.g = null;
        this.j = this.d.f;
        a(this.d, true, false);
        this.b.a(this.d);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.e.a
    public final boolean c() {
        return this.c == null;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.c
    public final void a() {
        this.h = null;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.e.a
    public final void a(PoiVerticalityDataResponse.SecondFloor secondFloor, PoiTwoLevelConfig poiTwoLevelConfig, PoiPageViewModel poiPageViewModel, final boolean z) {
        int i = 1;
        Object[] objArr = {secondFloor, poiTwoLevelConfig, poiPageViewModel, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba091ea2c9b8b058ebf5d2796f048547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba091ea2c9b8b058ebf5d2796f048547");
        } else if (secondFloor != null) {
            try {
                if (t.a(secondFloor.activityPic)) {
                    return;
                }
                String format = String.format(Locale.getDefault(), "%s@%dw_1l.webp", secondFloor.activityPic, Integer.valueOf(Math.min(g.a(com.meituan.android.singleton.b.a), 720)));
                secondFloor.activityPic = format;
                final com.sankuai.waimai.store.widgets.twolevel.c cVar = new com.sankuai.waimai.store.widgets.twolevel.c();
                cVar.a = secondFloor;
                if (poiTwoLevelConfig != null && poiTwoLevelConfig.twoLevelOverTime > 0) {
                    i = poiTwoLevelConfig.twoLevelOverTime;
                }
                cVar.c = i;
                RequestCreator b = Picasso.g(com.meituan.android.singleton.b.a).d(format).b();
                b.k = DiskCacheStrategy.SOURCE;
                RequestCreator a2 = b.a(Picasso.Priority.HIGH);
                a2.s = new RequestListener() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.b.6
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Exception exc, Object obj, boolean z2) {
                        Object[] objArr2 = {exc, obj, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abe9e10dd066f3a2538c5f1b0b392c3f", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abe9e10dd066f3a2538c5f1b0b392c3f")).booleanValue();
                        }
                        cVar.b = null;
                        b.this.b.a(cVar, z);
                        return false;
                    }

                    @Override // com.squareup.picasso.RequestListener
                    public final boolean a(Object obj, Object obj2, boolean z2, boolean z3) {
                        Object[] objArr2 = {obj, obj2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0feeb5d693b7863b4f7b07a4b11073fb", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0feeb5d693b7863b4f7b07a4b11073fb")).booleanValue();
                        }
                        if (obj instanceof PicassoDrawable) {
                            PicassoDrawable picassoDrawable = (PicassoDrawable) obj;
                            int intrinsicWidth = picassoDrawable.getIntrinsicWidth();
                            int intrinsicHeight = picassoDrawable.getIntrinsicHeight();
                            if (picassoDrawable.getIntrinsicWidth() > 0 && picassoDrawable.getIntrinsicHeight() > 0) {
                                cVar.b = new Size(intrinsicWidth, intrinsicHeight);
                                b.this.b.a(cVar, z);
                            }
                        }
                        return false;
                    }
                };
                a2.k();
            } catch (Throwable unused) {
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09160a9723eccf40ee98c2fcee097030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09160a9723eccf40ee98c2fcee097030");
        } else if (!o.j() || this.d == null) {
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGRequestAll.SGRequestAll).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.d.c)).a("interface_name", str).a();
        }
    }
}
