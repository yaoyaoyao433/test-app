package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    private HandPriceModel b;
    private g c;

    public a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fb52b69a4e1ed10761d714086a388d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fb52b69a4e1ed10761d714086a388d");
            return;
        }
        this.b = new HandPriceModel();
        this.c = gVar;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.f
    public final void a(@NonNull HandPriceModel handPriceModel) {
        Object[] objArr = {handPriceModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c7e619f1c1a0d74572353af1292e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c7e619f1c1a0d74572353af1292e5e");
            return;
        }
        this.b = handPriceModel;
        this.c.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49543662562d1f175e7b19d4c2a1c89c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49543662562d1f175e7b19d4c2a1c89c");
            return;
        }
        if (this.c.h() && this.b.getIsAddGoods()) {
            this.c.e();
        } else if (!TextUtils.isEmpty(this.b.getToBeMemberPrice()) && (this.c instanceof TwoRowLeftOriginTop)) {
            this.c.e();
        } else {
            HandPriceInfo handPriceInfo = this.b.getHandPriceInfo();
            Object[] objArr3 = {handPriceInfo};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33ae28f505e5e5f248b18a2404851081", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33ae28f505e5e5f248b18a2404851081");
            } else {
                this.c.a(handPriceInfo, true);
            }
        }
        String standardPrice = this.b.getStandardPrice();
        Object[] objArr4 = {standardPrice};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "889b85e449302c71f4d5a79bd6a66cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "889b85e449302c71f4d5a79bd6a66cb7");
        } else if (!TextUtils.isEmpty(standardPrice)) {
            this.c.a(standardPrice);
        } else {
            this.c.b();
        }
        String currentPriceUnit = this.b.getCurrentPriceUnit();
        Object[] objArr5 = {currentPriceUnit};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "44eaba7ca4564961f8622e2eba9c1247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "44eaba7ca4564961f8622e2eba9c1247");
        } else if (TextUtils.isEmpty(currentPriceUnit)) {
            this.c.c();
        } else {
            this.c.a(this.c.getMultiSpecGrayTextColor(), currentPriceUnit);
        }
        String underlinePrice = this.b.getUnderlinePrice();
        String toBeMemberPrice = this.b.getToBeMemberPrice();
        Object[] objArr6 = {underlinePrice, toBeMemberPrice};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6d907599c0ff30b66f9d15649b787174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6d907599c0ff30b66f9d15649b787174");
        } else if (!TextUtils.isEmpty(underlinePrice) && (TextUtils.isEmpty(toBeMemberPrice) || !(this.c instanceof TwoRowLeftOriginTop))) {
            this.c.b(underlinePrice);
        } else {
            this.c.d();
        }
        String toBeMemberPrice2 = this.b.getToBeMemberPrice();
        String memberIcon = this.b.getMemberIcon();
        Object[] objArr7 = {toBeMemberPrice2, memberIcon};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "38dac5fac388ad16ba4474644c1c26b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "38dac5fac388ad16ba4474644c1c26b8");
        } else if (!TextUtils.isEmpty(toBeMemberPrice2) && (this.c instanceof TwoRowLeftOriginTop)) {
            this.c.g();
            ((TwoRowLeftOriginTop) this.c).a(toBeMemberPrice2, memberIcon);
        } else {
            if (TextUtils.isEmpty(memberIcon)) {
                this.c.g();
            } else {
                this.c.c(memberIcon);
            }
            if (this.c instanceof TwoRowLeftOriginTop) {
                ((TwoRowLeftOriginTop) this.c).a("", "");
            }
        }
    }
}
