package com.sankuai.waimai.store.poi.list.newp.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.MachBackgroundConfig;
import com.sankuai.waimai.store.repository.model.MachNavigationConfig;
import com.sankuai.waimai.store.repository.model.SimpleTile;
import com.sankuai.waimai.store.repository.model.TileList;
import com.sankuai.waimai.store.repository.model.TileListConfig;
import com.sankuai.waimai.store.repository.model.TileTab;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HomeTileResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("blocks")
    public MachTileBlock blocks;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MachTileBlock implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background")
        public BaseTile<BaseModuleDesc, MachBackgroundConfig> background;
        @SerializedName(ConfigInfo.MODULE_BANNER)
        public List<SimpleTile<BaseModuleDesc>> banner;
        @SerializedName(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)
        public BaseTile<TileList, TileListConfig> listBlock;
        @SerializedName("navigation")
        public BaseTile<BaseModuleDesc, MachNavigationConfig> navigation;
        @SerializedName("tab")
        public SimpleTile<TileTab> tabBlock;
    }
}
