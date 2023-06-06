package com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiTabMscFragment extends PoiTabMRNFragment {
    public static ChangeQuickRedirect k;

    public static PoiTabMscFragment a(Uri uri, @Nullable Map<String, Object> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79ff8887b5b2e786fb6b2a0e808db79d", RobustBitConfig.DEFAULT_VALUE) ? (PoiTabMscFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79ff8887b5b2e786fb6b2a0e808db79d") : new PoiTabMscFragment();
    }
}
