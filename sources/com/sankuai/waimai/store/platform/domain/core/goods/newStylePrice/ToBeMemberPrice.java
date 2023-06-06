package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ToBeMemberPrice extends LinearLayout {
    public static ChangeQuickRedirect a;
    TextView b;
    ImageView c;

    public ToBeMemberPrice(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309cc069519bf000b4ea448226d0272a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309cc069519bf000b4ea448226d0272a");
        }
    }

    public ToBeMemberPrice(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744180dd306462b3a9d76d24683ec659", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744180dd306462b3a9d76d24683ec659");
        }
    }

    public ToBeMemberPrice(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c423aec422e8b3c0e9194fe4635e9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c423aec422e8b3c0e9194fe4635e9d");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46367cb7d113168d2d0b85e4da78b885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46367cb7d113168d2d0b85e4da78b885");
            return;
        }
        z.a(context, R.layout.wm_drug_to_be_member_price, this, true);
        this.b = (TextView) findViewById(R.id.to_be_member_price_number);
        this.c = (ImageView) findViewById(R.id.to_be_member_price_icon);
    }
}
