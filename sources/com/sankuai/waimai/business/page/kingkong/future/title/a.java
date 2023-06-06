package com.sankuai.waimai.business.page.kingkong.future.title;

import android.support.constraint.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.action.c;
import com.meituan.android.cube.pga.common.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.ChannelImages;
import com.sankuai.waimai.business.page.common.model.ChannelService;
import com.sankuai.waimai.business.page.common.net.response.ChannelBannerInfoResponseV8;
import com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist.SearchBoxPlaceHolderBlock;
import com.sankuai.waimai.business.page.kingkong.view.servicelabels.ServiceLabelsBlock;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.ArrayList;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"waimai_native_kingkong_nav"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a {
    public static ChangeQuickRedirect r;
    private com.sankuai.waimai.business.page.kingkong.a s;

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4eab951aa1d1341e704100a58b5ad4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4eab951aa1d1341e704100a58b5ad4f");
        } else if (aVar instanceof com.sankuai.waimai.business.page.kingkong.a) {
            this.s = (com.sankuai.waimai.business.page.kingkong.a) aVar;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29fcd097553b70a63cb054d45aedfd2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29fcd097553b70a63cb054d45aedfd2") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.business.page.kingkong.future.title.a.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_future_kingkong_moudle_header_placeholder;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c4145495481f39b3334230d5ffc210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c4145495481f39b3334230d5ffc210");
            return;
        }
        super.s();
        if (bC_() instanceof com.sankuai.waimai.business.page.kingkong.a) {
            ServiceLabelsBlock serviceLabelsBlock = new ServiceLabelsBlock((com.sankuai.waimai.business.page.kingkong.a) bC_());
            serviceLabelsBlock.a((c) new c<RocksServerModel, ArrayList<ChannelService>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.title.a.2
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cube.pga.action.c
                public ArrayList<ChannelService> a(RocksServerModel rocksServerModel) {
                    Object[] objArr2 = {rocksServerModel};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c717db2c2eb80bc05e9127cf8504445b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c717db2c2eb80bc05e9127cf8504445b");
                    }
                    if (rocksServerModel != null) {
                        try {
                            JsonObject jsonObject = (JsonObject) new JsonParser().parse(rocksServerModel.stringData);
                            String str = "";
                            if (jsonObject != null && jsonObject.get("channel_images") != null) {
                                str = jsonObject.get("channel_images").getAsString();
                            }
                            ChannelImages channelImages = (ChannelImages) new Gson().fromJson(str, new TypeToken<ChannelImages>() { // from class: com.sankuai.waimai.business.page.kingkong.future.title.a.2.1
                            }.getType());
                            if (channelImages == null || channelImages.channelServiceList == null) {
                                return null;
                            }
                            return ChannelBannerInfoResponseV8.getFilterChannelServices(channelImages.channelServiceList);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                    return null;
                }
            });
            a(serviceLabelsBlock, R.id.fl_service_label);
            a(new SearchBoxPlaceHolderBlock((com.sankuai.waimai.business.page.kingkong.a) bC_()), R.id.fl_search_place_holer);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa696ae87baa2d8246cae698b157d84", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa696ae87baa2d8246cae698b157d84") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a138bf6a17b8c9ccaa96bee9d4148c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a138bf6a17b8c9ccaa96bee9d4148c");
            return;
        }
        super.c(obj);
        if (this.s == null || !(obj instanceof RocksServerModel)) {
            return;
        }
        this.s.P.a((b<RocksServerModel>) ((RocksServerModel) obj));
    }
}
