package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CardMore implements Serializable {
    public static final int SHOW_TYPE_EXPAND = 1;
    public static final int SHOW_TYPE_PICKUP = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean expandExposed;
    public String expandText;
    public CardInfo mCardInfo;
    public String pickupText;
    public int showType;
    public int type;

    public void setType(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }

    public CardMore(CardInfo cardInfo) {
        Object[] objArr = {cardInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a67c0a67b51495a9a423ebc5eb94e6d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a67c0a67b51495a9a423ebc5eb94e6d3");
            return;
        }
        this.expandExposed = false;
        this.mCardInfo = cardInfo;
    }

    public String getShowText() {
        if (this.showType == 1) {
            return this.expandText;
        }
        return this.showType == 2 ? this.pickupText : "";
    }
}
