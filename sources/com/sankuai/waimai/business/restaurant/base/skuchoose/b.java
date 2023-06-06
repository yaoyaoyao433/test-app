package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.utils.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(FoodMultiSpuResponse foodMultiSpuResponse);

        void a(String str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.skuchoose.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0826b {
        View a();
    }

    public static /* synthetic */ void a(Activity activity, int i, GoodsSpu goodsSpu, InterfaceC0826b interfaceC0826b, Poi poi, boolean z, int i2, boolean z2) {
        Object[] objArr = {activity, Integer.valueOf(i), goodsSpu, interfaceC0826b, poi, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d29251834a487cef178a37c8a53e5257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d29251834a487cef178a37c8a53e5257");
        } else if (!z2) {
            ChooseSkuGoodsDialog chooseSkuGoodsDialog = new ChooseSkuGoodsDialog(activity);
            chooseSkuGoodsDialog.e = z;
            chooseSkuGoodsDialog.a(5, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsDialog.a(i, i2, true);
            chooseSkuGoodsDialog.d();
        } else {
            ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = new ChooseSkuGoodsRNDialog();
            chooseSkuGoodsRNDialog.e = z;
            chooseSkuGoodsRNDialog.a(5, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsRNDialog.a(i, i2);
            chooseSkuGoodsRNDialog.a(activity);
        }
    }

    public static /* synthetic */ void a(Activity activity, GoodsSpu goodsSpu, InterfaceC0826b interfaceC0826b, Poi poi, String str, String str2, String str3, int i, boolean z) {
        Object[] objArr = {activity, goodsSpu, interfaceC0826b, poi, str, str2, str3, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd33c1a9dfec962f47d5887993184924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd33c1a9dfec962f47d5887993184924");
        } else if (!z) {
            ChooseSkuGoodsDialog chooseSkuGoodsDialog = new ChooseSkuGoodsDialog(activity);
            chooseSkuGoodsDialog.a(i, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsDialog.e = com.sankuai.waimai.business.restaurant.composeorder.a.b;
            Object[] objArr2 = {str, str2, str3, 0};
            ChangeQuickRedirect changeQuickRedirect2 = ChooseSkuGoodsDialog.a;
            if (PatchProxy.isSupport(objArr2, chooseSkuGoodsDialog, changeQuickRedirect2, false, "61da30cdd3c727a936df9202d8c3cd7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, chooseSkuGoodsDialog, changeQuickRedirect2, false, "61da30cdd3c727a936df9202d8c3cd7b");
            } else {
                chooseSkuGoodsDialog.c().a = str;
                chooseSkuGoodsDialog.c().c = str2;
                chooseSkuGoodsDialog.c().b = str3;
                chooseSkuGoodsDialog.c().d = 0;
            }
            chooseSkuGoodsDialog.d();
        } else {
            ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = new ChooseSkuGoodsRNDialog();
            chooseSkuGoodsRNDialog.a(i, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsRNDialog.e = com.sankuai.waimai.business.restaurant.composeorder.a.b;
            Object[] objArr3 = {str, str2, str3, 0};
            ChangeQuickRedirect changeQuickRedirect3 = ChooseSkuGoodsRNDialog.a;
            if (PatchProxy.isSupport(objArr3, chooseSkuGoodsRNDialog, changeQuickRedirect3, false, "53a06f8fe8712f8104c26ef4557e5f02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, chooseSkuGoodsRNDialog, changeQuickRedirect3, false, "53a06f8fe8712f8104c26ef4557e5f02");
            } else {
                chooseSkuGoodsRNDialog.p().a = str;
                chooseSkuGoodsRNDialog.p().c = str2;
                chooseSkuGoodsRNDialog.p().b = str3;
                chooseSkuGoodsRNDialog.p().d = 0;
            }
            chooseSkuGoodsRNDialog.a(activity);
        }
    }

    public static /* synthetic */ void a(Activity activity, GoodsSpu goodsSpu, InterfaceC0826b interfaceC0826b, Poi poi, List list, String str, int i, com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a aVar) {
        Object[] objArr = {activity, goodsSpu, interfaceC0826b, poi, list, str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04eafdf49fbc0d64f2629c07c6dd38ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04eafdf49fbc0d64f2629c07c6dd38ee");
            return;
        }
        ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = new ChooseSkuGoodsRNDialog();
        chooseSkuGoodsRNDialog.a(6, poi, goodsSpu, interfaceC0826b.a());
        Object[] objArr2 = {list, str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = ChooseSkuGoodsRNDialog.a;
        if (PatchProxy.isSupport(objArr2, chooseSkuGoodsRNDialog, changeQuickRedirect2, false, "ae542aaf00f8211e89e70d7e72e6dc79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, chooseSkuGoodsRNDialog, changeQuickRedirect2, false, "ae542aaf00f8211e89e70d7e72e6dc79");
        } else {
            chooseSkuGoodsRNDialog.f = list;
            chooseSkuGoodsRNDialog.g = i;
            chooseSkuGoodsRNDialog.h = str;
            chooseSkuGoodsRNDialog.i = aVar;
        }
        chooseSkuGoodsRNDialog.a(activity);
    }

    public static /* synthetic */ void b(Activity activity, int i, GoodsSpu goodsSpu, InterfaceC0826b interfaceC0826b, Poi poi, boolean z, int i2, boolean z2, boolean z3) {
        Object[] objArr = {activity, Integer.valueOf(i), goodsSpu, interfaceC0826b, poi, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a545e909520e99feaad403fec910daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a545e909520e99feaad403fec910daf");
        } else if (!z2) {
            ChooseSkuGoodsDialog chooseSkuGoodsDialog = new ChooseSkuGoodsDialog(activity);
            chooseSkuGoodsDialog.e = z;
            chooseSkuGoodsDialog.a(0, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsDialog.a(i, i2, z3);
            chooseSkuGoodsDialog.d();
            com.sankuai.waimai.touchmatrix.views.b.a().a(chooseSkuGoodsDialog);
        } else {
            ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = new ChooseSkuGoodsRNDialog();
            chooseSkuGoodsRNDialog.e = z;
            chooseSkuGoodsRNDialog.a(0, poi, goodsSpu, interfaceC0826b.a());
            chooseSkuGoodsRNDialog.a(i, i2);
            chooseSkuGoodsRNDialog.a(activity);
        }
    }

    public static void a(final Activity activity, final GoodsSpu goodsSpu, final InterfaceC0826b interfaceC0826b, final Poi poi, final int i, boolean z) {
        Object[] objArr = {activity, goodsSpu, interfaceC0826b, poi, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2031f4ec9bd35a767211686b9944d054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2031f4ec9bd35a767211686b9944d054");
        } else {
            a(activity, goodsSpu, poi, z, new a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a(FoodMultiSpuResponse foodMultiSpuResponse) {
                    Object[] objArr2 = {foodMultiSpuResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa40513793579e9707192171b7d1bb7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa40513793579e9707192171b7d1bb7e");
                    } else {
                        b.a(activity, goodsSpu, interfaceC0826b, poi, (String) null, (String) null, (String) null, i, false);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d08589515f599c4a9400cff4bc5c18d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d08589515f599c4a9400cff4bc5c18d7");
                    } else {
                        b.a(activity, goodsSpu, interfaceC0826b, poi, (String) null, (String) null, (String) null, i, true);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52864ca3d7438b16999c26a6daa3715a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52864ca3d7438b16999c26a6daa3715a");
                    } else {
                        b.a(activity, goodsSpu, interfaceC0826b, poi, (String) null, (String) null, (String) null, i, goodsSpu.getFoodMultiSpuResponseNew() != null);
                    }
                }
            });
        }
    }

    public static void a(final Activity activity, final int i, final GoodsSpu goodsSpu, final InterfaceC0826b interfaceC0826b, final Poi poi, final boolean z, final int i2, boolean z2, final boolean z3) {
        Object[] objArr = {activity, Integer.valueOf(i), goodsSpu, interfaceC0826b, poi, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b51aa20c124d5a1c790b3f784b8455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b51aa20c124d5a1c790b3f784b8455");
        } else {
            a(activity, goodsSpu, poi, z2, new a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a(FoodMultiSpuResponse foodMultiSpuResponse) {
                    Object[] objArr2 = {foodMultiSpuResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53dd6b829f2c614e57ae5d6ea9c53cfc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53dd6b829f2c614e57ae5d6ea9c53cfc");
                    } else {
                        b.b(activity, i, goodsSpu, interfaceC0826b, poi, z, i2, false, z3);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "024b4adde8041bd222915aae09070f41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "024b4adde8041bd222915aae09070f41");
                    } else {
                        b.b(activity, i, goodsSpu, interfaceC0826b, poi, z, i2, true, z3);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "066a2cd497fae9d16012d97c5109308e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "066a2cd497fae9d16012d97c5109308e");
                    } else {
                        b.b(activity, i, goodsSpu, interfaceC0826b, poi, z, i2, goodsSpu.getFoodMultiSpuResponseNew() != null, z3);
                    }
                }
            });
        }
    }

    public static void a(final Activity activity, final GoodsSpu goodsSpu, Poi poi, boolean z, final a aVar) {
        Object[] objArr = {activity, goodsSpu, poi, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f29983be6367c1ab724ea9d4faab1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f29983be6367c1ab724ea9d4faab1d6");
        } else if (z) {
            if (goodsSpu.hasMultiSaleAttr || goodsSpu.isPremiumSpu) {
                if (goodsSpu.getFoodMultiSpuResponseNew() == null) {
                    BaseActivity baseActivity = (BaseActivity) activity;
                    baseActivity.u();
                    com.sankuai.waimai.business.restaurant.base.repository.b.a(baseActivity.w()).b(poi.getPoiIDStr(), goodsSpu, new com.sankuai.waimai.business.restaurant.base.repository.net.c<String>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.6
                        public static ChangeQuickRedirect b;

                        @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                        public final /* synthetic */ void a(Object obj) {
                            String str = (String) obj;
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect2 = b;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe57df0a2efef26680e1762df53d413f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe57df0a2efef26680e1762df53d413f");
                                return;
                            }
                            ((BaseActivity) activity).v();
                            goodsSpu.setFoodMultiSpuResponseNew(str);
                            aVar.a(str);
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                        public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                            Object[] objArr2 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect2 = b;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87ae34a5601cd615d1a1c90ae87f786c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87ae34a5601cd615d1a1c90ae87f786c");
                                return;
                            }
                            ((BaseActivity) activity).v();
                            m.a(activity, !TextUtils.isEmpty(aVar2.a()) ? aVar2.a() : activity.getString(R.string.wm_restaurant_fail_retry), (Throwable) aVar2);
                        }
                    });
                    return;
                }
                aVar.a();
                return;
            }
            aVar.a();
        } else if (goodsSpu.hasMultiSaleAttr) {
            if (goodsSpu.getFoodMultiSpuResponse() == null) {
                BaseActivity baseActivity2 = (BaseActivity) activity;
                baseActivity2.u();
                com.sankuai.waimai.business.restaurant.base.repository.b.a(baseActivity2.w()).a(poi.getPoiIDStr(), goodsSpu, new com.sankuai.waimai.business.restaurant.base.repository.net.c<FoodMultiSpuResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.7
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final /* synthetic */ void a(Object obj) {
                        FoodMultiSpuResponse foodMultiSpuResponse = (FoodMultiSpuResponse) obj;
                        Object[] objArr2 = {foodMultiSpuResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "640a7ee4bfcfd827173622d3d2226bb6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "640a7ee4bfcfd827173622d3d2226bb6");
                            return;
                        }
                        ((BaseActivity) activity).v();
                        goodsSpu.setFoodMultiSpuResponse(foodMultiSpuResponse);
                        aVar.a(foodMultiSpuResponse);
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d0a00e373799df479a6fe2f910b9b90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d0a00e373799df479a6fe2f910b9b90");
                            return;
                        }
                        ((BaseActivity) activity).v();
                        m.a(activity, !TextUtils.isEmpty(aVar2.a()) ? aVar2.a() : activity.getString(R.string.wm_restaurant_fail_retry), (Throwable) aVar2);
                    }
                });
                return;
            }
            aVar.a();
        } else {
            aVar.a();
        }
    }
}
