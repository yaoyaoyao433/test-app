package com.sankuai.waimai.store.goods.list.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddCrossSkus implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<SGGoodAttrValue> attrs;
    public int count;
    public long id;
    public long skuid;
}
