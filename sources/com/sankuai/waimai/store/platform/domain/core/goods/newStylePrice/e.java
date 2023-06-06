package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements f {
    public static ChangeQuickRedirect a;
    private HandPriceModel b;
    private g c;

    public e(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae00d571de21fd085856c174a70bf167", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae00d571de21fd085856c174a70bf167");
            return;
        }
        this.b = new HandPriceModel();
        this.c = gVar;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.f
    public final void a(HandPriceModel handPriceModel) {
        Object[] objArr = {handPriceModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c84f302343d9d4d2bdd541df4e19e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c84f302343d9d4d2bdd541df4e19e66");
            return;
        }
        this.b = handPriceModel;
        this.c.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9133bc9fb6d1014057bf671ff88984d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9133bc9fb6d1014057bf671ff88984d3");
            return;
        }
        this.c.b();
        this.c.c();
        this.c.g();
        this.c.d();
        this.c.e();
        if (!p.a(this.b.getHandPriceInfo())) {
            if (this.c.h() && this.b.getIsAddGoods()) {
                if (i.b(Double.valueOf(this.b.getGoodsCurrentPrice()), Double.valueOf(0.0d))) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37070f2c702c88e2c17978b413da6b21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37070f2c702c88e2c17978b413da6b21");
                    } else if ((!i.c(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(this.b.getHandPriceInfo().getHandMemberPrice())) || !i.e(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(0.0d))) && i.e(Double.valueOf(this.b.getHandPriceInfo().getHandMemberPrice()), Double.valueOf(0.0d))) {
                        a(this.b.getHandPriceInfo().getHandMemberPrice());
                        b(this.b.getMemberIcon());
                        b(this.b.getGoodsOriginPrice());
                    } else {
                        a(this.b.getGoodsOriginPrice());
                    }
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b8839b5f3a69f748faf63aa18eb95192", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b8839b5f3a69f748faf63aa18eb95192");
                    } else if (i.c(Double.valueOf(this.b.getGoodsCurrentPrice()), Double.valueOf(this.b.getHandPriceInfo().getHandMemberPrice())) || i.b(Double.valueOf(this.b.getHandPriceInfo().getHandMemberPrice()), Double.valueOf(0.0d))) {
                        if (i.d(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(this.b.getGoodsCurrentPrice())) || i.b(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(0.0d))) {
                            a(this.b.getGoodsCurrentPrice());
                            b(this.b.getGoodsOriginPrice());
                        } else {
                            a(this.b.getGoodsOriginPrice());
                        }
                    } else if (i.d(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(this.b.getHandPriceInfo().getHandMemberPrice())) || i.b(Double.valueOf(this.b.getGoodsOriginPrice()), Double.valueOf(0.0d))) {
                        a(this.b.getHandPriceInfo().getHandMemberPrice());
                        b(this.b.getMemberIcon());
                        b(this.b.getGoodsOriginPrice());
                    } else {
                        a(this.b.getGoodsOriginPrice());
                    }
                }
                a(this.b.isMultiplySpec(), this.b.getCurrentPriceUnit());
                return;
            }
            a(this.b.getHandPriceInfo().getHandActivityPrice());
            a(this.b.isMultiplySpec(), this.b.getCurrentPriceUnit());
            b(this.b.getGoodsOriginPrice());
            a(this.b.getMemberIcon());
            HandPriceInfo handPriceInfo = this.b.getHandPriceInfo();
            Object[] objArr5 = {handPriceInfo};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "31f64ab4f433a3f91c138c654a8b1d23", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "31f64ab4f433a3f91c138c654a8b1d23");
                return;
            } else {
                this.c.a(handPriceInfo, false);
                return;
            }
        }
        a(this.b.getGoodsCurrentPrice());
        a(this.b.isMultiplySpec(), this.b.getCurrentPriceUnit());
        b(this.b.getGoodsOriginPrice());
        a(this.b.getMemberIcon());
    }

    private void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759602f0637f18aafda4fabf0bf87878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759602f0637f18aafda4fabf0bf87878");
        } else if (i.e(Double.valueOf(d), Double.valueOf(0.0d))) {
            this.c.a(d);
        } else {
            this.c.b();
        }
    }

    private void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67a47269af720ccc10911916bbc3e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67a47269af720ccc10911916bbc3e79");
        } else if (TextUtils.isEmpty(str)) {
            this.c.c();
        } else if (z) {
            this.c.a(this.c.getMultiSpecGrayTextColor(), str);
        } else {
            this.c.a(this.c.getSingleSpecGrayTextColor(), str);
        }
    }

    private void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97c3f1a6f732b2aca5d4649d2dc42618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97c3f1a6f732b2aca5d4649d2dc42618");
        } else if (i.e(Double.valueOf(d), Double.valueOf(0.0d))) {
            this.c.b(d);
        } else {
            this.c.d();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb91ec01c749dec228cb211c4d184a30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb91ec01c749dec228cb211c4d184a30");
        } else if (TextUtils.isEmpty(str)) {
            this.c.g();
        } else {
            this.c.c(str);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e54eb7d3f07136b2e0409f9cc41886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e54eb7d3f07136b2e0409f9cc41886");
        } else if (TextUtils.isEmpty(str)) {
            this.c.f();
        } else {
            this.c.c(str);
        }
    }
}
