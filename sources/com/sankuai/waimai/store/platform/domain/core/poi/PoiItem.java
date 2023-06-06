package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class PoiItem implements IPoiItem, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.IPoiItem
    public abstract String getTag();

    public abstract void setTag(String str);
}
