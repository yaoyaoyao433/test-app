package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TwoRowLeftOriginTop extends BaseHandPriceView {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public int getLayoutId() {
        return R.layout.wm_drug_new_style_price_two_row_left_origin_top;
    }

    public TwoRowLeftOriginTop(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9846bfa0b8bb22259dba26391c2d41d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9846bfa0b8bb22259dba26391c2d41d");
        }
    }

    public TwoRowLeftOriginTop(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2915af7c26d4fb42c7cf68026514dcb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2915af7c26d4fb42c7cf68026514dcb8");
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b884748b8f706333bd4278fe0ad0640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b884748b8f706333bd4278fe0ad0640");
            return;
        }
        super.a();
        HandPriceOneLineLayout handPriceOneLineLayout = (HandPriceOneLineLayout) findViewById(R.id.new_hand_price_layout);
        if (handPriceOneLineLayout == null) {
            return;
        }
        this.h = (ToBeMemberPrice) findViewById(R.id.to_be_member_content);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f);
        arrayList.add(this.d);
        arrayList.add(this.e);
        handPriceOneLineLayout.setPriorityViews(arrayList);
        HandPriceOneLineLayout handPriceOneLineLayout2 = (HandPriceOneLineLayout) findViewById(R.id.hand_price_container);
        if (handPriceOneLineLayout2 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.g);
        handPriceOneLineLayout2.setPriorityViews(arrayList2);
    }

    public final void a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46db644bb535ef4a9deb826eb1795d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46db644bb535ef4a9deb826eb1795d1d");
        } else if (TextUtils.isEmpty(str)) {
            u.c(this.h);
        } else {
            u.a(this.h);
            ToBeMemberPrice toBeMemberPrice = this.h;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = ToBeMemberPrice.a;
            if (PatchProxy.isSupport(objArr2, toBeMemberPrice, changeQuickRedirect2, false, "2d82f2f6f234288d00e9bb05b8b4f384", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, toBeMemberPrice, changeQuickRedirect2, false, "2d82f2f6f234288d00e9bb05b8b4f384");
            } else if (TextUtils.isEmpty(str)) {
                u.c(toBeMemberPrice);
            } else {
                u.a(toBeMemberPrice);
                u.a(toBeMemberPrice.b, str);
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = ToBeMemberPrice.a;
                if (PatchProxy.isSupport(objArr3, toBeMemberPrice, changeQuickRedirect3, false, "ea61d08d2bd14d977541238f02e1c86b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, toBeMemberPrice, changeQuickRedirect3, false, "ea61d08d2bd14d977541238f02e1c86b");
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    u.c(toBeMemberPrice.c);
                }
                u.a(toBeMemberPrice.c);
                b.C0608b b = m.b(str2, ImageQualityUtil.a());
                b.e = 0;
                b.a(toBeMemberPrice.c);
            }
        }
    }
}
