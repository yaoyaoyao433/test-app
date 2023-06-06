package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCommonMachListItem {
    public static final int VIEW_MACH_FLOOR = 1;
    public static final int VIEW_NATIVE_FLOOR = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;
    public BaseModuleDesc mBaseModuleDesc;
    public int mViewType;
    public com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> recycleMachDataWrapper;
    public int spanSize;
    public String title;

    public PoiCommonMachListItem() {
        this.spanSize = 1;
    }

    public PoiCommonMachListItem(int i, String str, int i2) {
        this.spanSize = 1;
        this.spanSize = i;
        this.title = str;
        this.mViewType = i2;
    }

    public PoiCommonMachListItem(int i, BaseModuleDesc baseModuleDesc, com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar, int i2) {
        this.spanSize = 1;
        this.spanSize = i;
        this.recycleMachDataWrapper = fVar;
        this.mBaseModuleDesc = baseModuleDesc;
        this.mViewType = i2;
    }
}
