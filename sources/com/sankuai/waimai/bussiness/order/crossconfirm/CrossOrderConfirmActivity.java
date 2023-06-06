package com.sankuai.waimai.bussiness.order.crossconfirm;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewParent;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
import com.sankuai.waimai.bussiness.order.base.pay.PayParams;
import com.sankuai.waimai.bussiness.order.base.pay.d;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.c;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.a;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.MultiPoiOrderSubmitResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.d;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.e;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.g;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.cube.BasePGAActivity;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.utils.k;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CrossOrderConfirmActivity extends BasePGAActivity implements d, b {
    public static ChangeQuickRedirect a = null;
    private static final String c = "CrossOrderConfirmActivity";
    private boolean D;
    private final Handler E;
    private boolean F;
    private g<MultiPoiOrderPreviewResult> G;
    private final View.OnClickListener H;
    private e I;
    public MultiPoiOrderPreviewResult b;
    @NonNull
    private final f d;
    @NonNull
    private final a e;
    private final com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e f;
    private com.sankuai.waimai.foundation.core.service.screenshot.observer.a g;
    private ObservableScrollView h;
    private View i;
    private com.sankuai.waimai.platform.domain.core.response.a j;
    private ArrayList<String> k;
    private boolean l;
    private PayParams o;
    private boolean p;
    private boolean q;
    private long r;
    private String s;
    private String t;
    private List<OrderedFood> u;
    private Typeface v;

    public CrossOrderConfirmActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f4a2012a77b3dd2076ebc8eab60525", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f4a2012a77b3dd2076ebc8eab60525");
            return;
        }
        this.d = new f() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i, boolean z) {
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(Map<String, Object> map) {
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final long aH_() {
                return -1L;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final String aI_() {
                return "";
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aJ_() {
                return false;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final int aK_() {
                return 1;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aO_() {
                return false;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void b(Map<String, Object> map) {
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b8336d1073737095e5c71288cbcbc12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b8336d1073737095e5c71288cbcbc12");
                } else {
                    CrossOrderConfirmActivity.this.a(i);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(int i, ArrayList<AdditionalBargain.AdditionalBargainDetail> arrayList) {
                Object[] objArr2 = {Integer.valueOf(i), arrayList};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c56dfd38e3d33bf403686f72256d041", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c56dfd38e3d33bf403686f72256d041");
                } else {
                    a(i);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final int aL_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b4ec9d9059ee771bca27af524fb8320", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b4ec9d9059ee771bca27af524fb8320")).intValue() : CrossOrderConfirmActivity.this.e.D.a().c();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final boolean aM_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f52ff07fc7f9b42ab703125765b2244", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f52ff07fc7f9b42ab703125765b2244")).booleanValue() : CrossOrderConfirmActivity.this.D;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final Typeface aN_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ba1f850b959c3a01fa8a4fa31f5618d", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ba1f850b959c3a01fa8a4fa31f5618d") : CrossOrderConfirmActivity.this.v;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed2f5ad4400694187e8d44194b207cbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed2f5ad4400694187e8d44194b207cbc");
                } else {
                    ObjectAnimator.ofInt(CrossOrderConfirmActivity.this.h, "scrollY", i).setDuration(600L).start();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
            public final void a(View view) {
                int i = 0;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2499e3cb27bcc64f00286651e1d9f35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2499e3cb27bcc64f00286651e1d9f35");
                    return;
                }
                ViewParent parent = view.getParent();
                while (true) {
                    View view2 = (View) parent;
                    if (!view2.equals(CrossOrderConfirmActivity.this.h)) {
                        i += view2.getTop();
                        parent = view2.getParent();
                    } else {
                        b((((view.getTop() + i) + (i + view.getBottom())) / 2) - view.getHeight());
                        return;
                    }
                }
            }
        };
        this.e = new a(this, this.d);
        this.f = new com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a(long j, String str, List<OrderedFood> list) {
                Object[] objArr2 = {new Long(j), str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "393eb6ac0f3992bd5b5b804176b6c4f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "393eb6ac0f3992bd5b5b804176b6c4f3");
                } else if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                } else {
                    CrossOrderConfirmActivity.this.t = str;
                    CrossOrderConfirmActivity.this.u = list;
                    CrossOrderConfirmActivity.this.a(3);
                    CrossOrderConfirmActivity.this.q = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c30bf8b8575a0cf500507f378b5b18d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c30bf8b8575a0cf500507f378b5b18d");
                } else {
                    CrossOrderConfirmActivity.this.v();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bad6e820712cc79ab838bbad3aa0bd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bad6e820712cc79ab838bbad3aa0bd3");
                } else {
                    CrossOrderConfirmActivity.this.u();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84cbef039d8050c831eca5011a3246e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84cbef039d8050c831eca5011a3246e8");
                } else {
                    CrossOrderConfirmActivity.this.v();
                }
            }
        };
        this.g = new com.sankuai.waimai.foundation.core.service.screenshot.observer.b() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f0201170b176b83d161677574868e34", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f0201170b176b83d161677574868e34");
                } else if (com.sankuai.waimai.foundation.core.a.d() && TextUtils.equals(str, CrossOrderConfirmActivity.class.getName())) {
                    JudasManualManager.a("b_fq46u68k").a("c_ykhs39e").a("poi_id", i.a(CrossOrderConfirmActivity.this.r, CrossOrderConfirmActivity.this.s)).a(CrossOrderConfirmActivity.this).a();
                }
            }
        };
        this.j = new com.sankuai.waimai.platform.domain.core.response.a();
        this.l = false;
        this.q = false;
        this.E = new Handler();
        this.F = false;
        this.G = new g<MultiPoiOrderPreviewResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.19
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.g
            public final /* synthetic */ void a(MultiPoiOrderPreviewResult multiPoiOrderPreviewResult) {
                MultiPoiOrderPreviewResult multiPoiOrderPreviewResult2 = multiPoiOrderPreviewResult;
                Object[] objArr2 = {multiPoiOrderPreviewResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5590ab1357f443bec5d8443b81871696", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5590ab1357f443bec5d8443b81871696");
                    return;
                }
                CrossOrderConfirmActivity.this.a(multiPoiOrderPreviewResult2);
                if (CrossOrderConfirmActivity.this.q) {
                    SubmitOrderManager.updateAllShopCartData(CrossOrderConfirmActivity.this.t, CrossOrderConfirmActivity.this.u);
                }
                CrossOrderConfirmActivity.this.q = false;
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.g
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "208e8bce36fc87c7987305c40d53a74e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "208e8bce36fc87c7987305c40d53a74e");
                } else {
                    CrossOrderConfirmActivity.this.p = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.g
            public final void a(String str, double d) {
                Object[] objArr2 = {str, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "838aeb6dc0897fcca8c40e196ec215b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "838aeb6dc0897fcca8c40e196ec215b6");
                    return;
                }
                String string = CrossOrderConfirmActivity.this.getString(R.string.wm_order_base_order_not_reach_min_price_1, new Object[]{h.a(d)});
                CrossOrderConfirmActivity crossOrderConfirmActivity = CrossOrderConfirmActivity.this;
                Activity bB_ = CrossOrderConfirmActivity.this.bB_();
                if (TextUtils.isEmpty(str)) {
                    str = string;
                }
                CrossOrderConfirmActivity.a(crossOrderConfirmActivity, bB_, str);
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61d56e4740aa029a32d60a6b0dcb1b6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61d56e4740aa029a32d60a6b0dcb1b6b");
                    return;
                }
                CrossOrderConfirmActivity.this.e.ah.a((com.meituan.android.cube.pga.common.b<Void>) null);
                CrossOrderConfirmActivity.this.a(2);
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.g
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "686aa6815f7d2309b8e3efccfbcc3252", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "686aa6815f7d2309b8e3efccfbcc3252");
                    return;
                }
                if (z) {
                    com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                }
                CrossOrderConfirmActivity.c(CrossOrderConfirmActivity.this, false);
                if (i != 0) {
                    CrossOrderConfirmActivity.this.t = null;
                    CrossOrderConfirmActivity.this.u = null;
                    CrossOrderConfirmActivity.this.q = false;
                }
                CrossOrderConfirmActivity.this.l();
            }
        };
        this.H = new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b42d377d0dcc95cd8af10cc07e83d71", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b42d377d0dcc95cd8af10cc07e83d71");
                    return;
                }
                CrossOrderConfirmActivity.this.i.setEnabled(false);
                String a2 = CrossOrderConfirmActivity.this.e.af.a().a();
                if (!TextUtils.isEmpty(a2)) {
                    CrossOrderConfirmActivity.b(CrossOrderConfirmActivity.this, a2);
                    return;
                }
                k.a("/order/multi/submit", Statistics.getChannel().getSeq());
                CrossOrderConfirmActivity.this.n();
            }
        };
        this.I = new e() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6e7a9948b528acd9840407c51f45211", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6e7a9948b528acd9840407c51f45211");
                } else {
                    CrossOrderConfirmActivity.this.p = true;
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6f4d7eb6c42fe2cbfb62f9886006c10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6f4d7eb6c42fe2cbfb62f9886006c10");
                } else {
                    CrossOrderConfirmActivity.this.l();
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(MultiPoiOrderSubmitResult multiPoiOrderSubmitResult) {
                Object[] objArr2 = {multiPoiOrderSubmitResult};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb26b403affe777f7d8bfcc830ce42b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb26b403affe777f7d8bfcc830ce42b6");
                } else {
                    CrossOrderConfirmActivity.a(CrossOrderConfirmActivity.this, multiPoiOrderSubmitResult);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a109229fe2c22423874b2effa01d02a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a109229fe2c22423874b2effa01d02a");
                    return;
                }
                if (i == 1) {
                    CrossOrderConfirmActivity.this.e.ai.a((com.meituan.android.cube.pga.common.b<i.c<Long, String>>) com.meituan.android.cube.pga.common.i.a(-1L, "0"));
                }
                if (z) {
                    CrossOrderConfirmActivity.this.a(2);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(CrossOrderSubmitResponse crossOrderSubmitResponse) {
                Object[] objArr2 = {crossOrderSubmitResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "780167ab04fa81fbe1763a5e5c933c92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "780167ab04fa81fbe1763a5e5c933c92");
                } else {
                    CrossOrderConfirmActivity.this.e.G.a((com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>>) com.meituan.android.cube.pga.common.i.a(Integer.valueOf(crossOrderSubmitResponse.k), Integer.valueOf(crossOrderSubmitResponse.l)));
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(int i, DialogInterface dialogInterface) {
                Object[] objArr2 = {Integer.valueOf(i), dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fda425e618ca048463c2dc6264d32c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fda425e618ca048463c2dc6264d32c3");
                    return;
                }
                if (i == 1) {
                    CrossOrderConfirmActivity.this.a(2);
                }
                dialogInterface.dismiss();
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60effc732459bee6e1d237c5edc749e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60effc732459bee6e1d237c5edc749e7");
                    return;
                }
                if (CrossOrderConfirmActivity.this.k == null) {
                    CrossOrderConfirmActivity.this.k = new ArrayList(4);
                }
                if (!CrossOrderConfirmActivity.this.k.contains(str)) {
                    CrossOrderConfirmActivity.this.k.add(str);
                }
                b();
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void a(String str, double d) {
                Object[] objArr2 = {str, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "695ced9025e9e1bcbf64c64ffb25e9e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "695ced9025e9e1bcbf64c64ffb25e9e8");
                } else {
                    CrossOrderConfirmActivity.a(CrossOrderConfirmActivity.this, CrossOrderConfirmActivity.this.bB_(), str);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.e
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a50f1eb2902815d245310db6ab417b6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a50f1eb2902815d245310db6ab417b6a");
                } else {
                    CrossOrderConfirmActivity.this.n();
                }
            }
        };
    }

    public static /* synthetic */ void a(CrossOrderConfirmActivity crossOrderConfirmActivity, final Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "3a2e4bceae43cd0b9c86c042b2cd29c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "3a2e4bceae43cd0b9c86c042b2cd29c3");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558962)).b(str).a(R.string.wm_order_confirm_change_another_address, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.21
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e02f0238639ba742edfeaf98a997fb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e02f0238639ba742edfeaf98a997fb8");
                        return;
                    }
                    dialogInterface.dismiss();
                    CrossOrderConfirmActivity.this.e.U.a((com.meituan.android.cube.pga.common.b<i.c<Long, Integer>>) com.meituan.android.cube.pga.common.i.a(-1L, 2));
                }
            }).b(R.string.wm_order_confirm_continue_adding, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.20
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54c73d7b82b7a689f20426576ca6e75c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54c73d7b82b7a689f20426576ca6e75c");
                        return;
                    }
                    dialogInterface.dismiss();
                    activity.finish();
                }
            }).b();
        }
    }

    public static /* synthetic */ void a(CrossOrderConfirmActivity crossOrderConfirmActivity, MultiPoiOrderSubmitResult multiPoiOrderSubmitResult) {
        int i;
        Object[] objArr = {multiPoiOrderSubmitResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "8267b91b0651e7f2c3404672999d6069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "8267b91b0651e7f2c3404672999d6069");
        } else if (multiPoiOrderSubmitResult != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, crossOrderConfirmActivity, changeQuickRedirect2, false, "796a504f752cc6f5d808599daa303cad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, crossOrderConfirmActivity, changeQuickRedirect2, false, "796a504f752cc6f5d808599daa303cad");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, crossOrderConfirmActivity, changeQuickRedirect3, false, "f3b3287e4a4af54d172430b6af4a386b", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, crossOrderConfirmActivity, changeQuickRedirect3, false, "f3b3287e4a4af54d172430b6af4a386b")).intValue();
                } else {
                    if (crossOrderConfirmActivity.b != null && !com.sankuai.waimai.foundation.utils.d.a(crossOrderConfirmActivity.b.poiOrders)) {
                        loop0: for (PoiOrderPreviewResult poiOrderPreviewResult : crossOrderConfirmActivity.b.poiOrders) {
                            List<OrderFoodOutput> list = poiOrderPreviewResult.foodList;
                            if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                                for (OrderFoodOutput orderFoodOutput : list) {
                                    if (orderFoodOutput != null && orderFoodOutput.getSeckill() == 1) {
                                        i = 1;
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    i = 0;
                }
                JudasManualManager.a a2 = JudasManualManager.a("b_ciJxy").a("c_ykhs39e").a("is_multiple_transaction", 1);
                StringBuilder sb = new StringBuilder();
                sb.append(crossOrderConfirmActivity.z());
                a2.a("poi_number", sb.toString()).a("seckill_act", i).b(crossOrderConfirmActivity.b()).a(crossOrderConfirmActivity).a();
            }
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.business.order.api.submit.b(crossOrderConfirmActivity.r));
            c.a().b(MultiPoiOrderPreviewResult.class);
            if (multiPoiOrderSubmitResult.orderPayType == 2) {
                crossOrderConfirmActivity.o = new PayParams();
                crossOrderConfirmActivity.o.f = multiPoiOrderSubmitResult.tradeno;
                crossOrderConfirmActivity.o.e = multiPoiOrderSubmitResult.supportPaytypes;
                crossOrderConfirmActivity.o.i = multiPoiOrderSubmitResult.payToken;
                crossOrderConfirmActivity.o.k = multiPoiOrderSubmitResult.payTip;
                crossOrderConfirmActivity.l = true;
                com.sankuai.waimai.platform.capacity.pay.a.a(crossOrderConfirmActivity, 3, crossOrderConfirmActivity.o.f, crossOrderConfirmActivity.o.i);
                return;
            }
            com.sankuai.waimai.platform.domain.manager.location.a.b(crossOrderConfirmActivity.bB_());
            com.sankuai.waimai.foundation.router.a.a(crossOrderConfirmActivity.bB_(), crossOrderConfirmActivity.getResources().getString(R.string.wm_page_order_tab));
            SubmitOrderManager.getInstance().removeCartData(crossOrderConfirmActivity.r, com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(crossOrderConfirmActivity.u));
        }
    }

    public static /* synthetic */ void b(CrossOrderConfirmActivity crossOrderConfirmActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "e0ab414db3177dd418da755aaedcedb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, crossOrderConfirmActivity, changeQuickRedirect, false, "e0ab414db3177dd418da755aaedcedb3");
        } else {
            new CustomDialog.a(crossOrderConfirmActivity).b(str).a(R.string.wm_order_base_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6db277e668172caa8664d5025343d8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6db277e668172caa8664d5025343d8f");
                        return;
                    }
                    dialogInterface.dismiss();
                    CrossOrderConfirmActivity.this.i.setEnabled(true);
                }
            }).b(R.string.wm_order_confirm_continue_order, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7c542aa34430b2d08a1efd89b4d07c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7c542aa34430b2d08a1efd89b4d07c2");
                    } else {
                        CrossOrderConfirmActivity.this.n();
                    }
                }
            }).a(false).b();
        }
    }

    public static /* synthetic */ boolean c(CrossOrderConfirmActivity crossOrderConfirmActivity, boolean z) {
        crossOrderConfirmActivity.l = false;
        return false;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri.Builder builder;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1aaac51f634d98ba013b927415ba91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1aaac51f634d98ba013b927415ba91");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9abb91645af9ba52ddfc6a0319bf8cff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9abb91645af9ba52ddfc6a0319bf8cff");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, false);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d7969b1dbbf5e7a8238df829ff3761f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d7969b1dbbf5e7a8238df829ff3761f");
        } else {
            this.h = this.e.N.a().b;
            this.i = this.e.ab.a().b;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f2831b49cb0f06089104756133e6899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f2831b49cb0f06089104756133e6899");
        } else {
            this.e.F.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.11
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c cVar) {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c cVar2 = cVar;
                    Object[] objArr5 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bd5cbecde54e63e51800a5f5bd58f5b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bd5cbecde54e63e51800a5f5bd58f5b3");
                    } else {
                        CrossOrderConfirmActivity.this.a(true, false, cVar2.b);
                    }
                }
            });
            this.e.I.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.13
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.a
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8a30069950f02ea132e0c5c06a806463", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8a30069950f02ea132e0c5c06a806463");
                    } else {
                        CrossOrderConfirmActivity.this.n();
                    }
                }
            });
            this.e.t.b = new com.meituan.android.cube.pga.action.d<List<PoiOrderParam>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.14
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final /* synthetic */ List<PoiOrderParam> a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78ced75d99849614c2d7328765837031", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78ced75d99849614c2d7328765837031") : CrossOrderConfirmActivity.this.k();
                }
            };
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a((b) this);
        com.sankuai.waimai.bussiness.order.base.pay.c.a().a(this);
        this.b = (MultiPoiOrderPreviewResult) c.a().a(MultiPoiOrderPreviewResult.class);
        this.r = h();
        this.s = i();
        if (this.b != null) {
            a(this.b);
            this.F = this.b == null || bundle != null;
            Object[] objArr5 = {intent};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4c6aa9c69377d8851bad894ba0a103d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4c6aa9c69377d8851bad894ba0a103d5");
            } else if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    builder = data.buildUpon();
                } else {
                    builder = new Uri.Builder();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z());
                builder.appendQueryParameter("poi_number", sb.toString());
                builder.appendQueryParameter("is_multiple_transaction", "1");
                intent.setData(builder.build());
            }
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.g);
            return;
        }
        finish();
    }

    @Override // com.sankuai.waimai.platform.cube.BasePGAActivity
    public final com.meituan.android.cube.pga.core.a f() {
        return this.e;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final com.meituan.android.cube.core.f g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "214d2e331f479a99a27e3f642f7c5dd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.core.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "214d2e331f479a99a27e3f642f7c5dd7");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "075c7b5d1956cf6ce2c7b7fbf94cf708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "075c7b5d1956cf6ce2c7b7fbf94cf708");
        } else {
            try {
                this.v = Typeface.createFromAsset(getAssets(), "fonts/AvenirLTPro-Medium.ttf");
            } catch (Exception e) {
                this.v = null;
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_newfont").c(e.getMessage()).b());
            }
            if (this.v != null) {
                this.D = true;
            }
        }
        this.e.X.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.16
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80863a5d9714d9f8edf3509991b4b633", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80863a5d9714d9f8edf3509991b4b633") : CrossOrderConfirmActivity.this.f;
            }
        };
        com.sankuai.waimai.bussiness.order.crossconfirm.block.root.c cVar = new com.sankuai.waimai.bussiness.order.crossconfirm.block.root.c(this.e);
        this.e.g = cVar;
        return cVar;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45bdad85b90fb9f504d8d0df9b617b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45bdad85b90fb9f504d8d0df9b617b9b");
            return;
        }
        super.onPause();
        JudasManualManager.a(this);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9962dc639b3782a8a2277f06cbc802f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9962dc639b3782a8a2277f06cbc802f0");
        } else {
            JudasManualManager.a("c_ykhs39e", this);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5d04f63f4e271b0e2730af00c860f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5d04f63f4e271b0e2730af00c860f0");
        } else if (this.e.aa.a().b()) {
            this.e.Z.a();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264b62d8e299149037ea83e9601e4d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264b62d8e299149037ea83e9601e4d8b");
        } else {
            super.onStart();
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e02930711553afe37db3667687ecf96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e02930711553afe37db3667687ecf96");
            return;
        }
        super.onResume();
        if (this.e.K.a().b()) {
            this.e.L.a();
        } else if (!this.l && this.F && !this.e.M.a().b()) {
            this.E.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36d7655979af1e93c5e0c3fa78dde90c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36d7655979af1e93c5e0c3fa78dde90c");
                    } else {
                        CrossOrderConfirmActivity.this.a(2);
                    }
                }
            }, 0L);
        }
        this.l = false;
        this.F = true;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058a0ed0010b70ff6cbd6af12aa8a98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058a0ed0010b70ff6cbd6af12aa8a98b");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b((b) this);
        com.sankuai.waimai.bussiness.order.base.pay.c.a().b(this);
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.g);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3179891e1d1609383b92abee8a9c2720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3179891e1d1609383b92abee8a9c2720");
            return;
        }
        super.onSaveInstanceState(bundle);
        c.a().a(this.b);
        bundle.putSerializable("confirm_submit_poi_ids", this.k);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c3f7c97a1a25555cb47958fcb0add0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c3f7c97a1a25555cb47958fcb0add0");
            return;
        }
        super.onRestoreInstanceState(bundle);
        try {
            this.k = (ArrayList) com.sankuai.waimai.platform.utils.f.a(bundle, "confirm_submit_poi_ids");
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83055cf2272aa36ede94d45e22bc8d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83055cf2272aa36ede94d45e22bc8d6e");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        b.a aVar = new b.a();
        aVar.a = i;
        aVar.b = i2;
        aVar.c = intent;
        this.e.o.a((com.meituan.android.cube.pga.common.b<b.a>) aVar);
        if (i != 1) {
            if (i == 3 && this.o != null) {
                OrderPayResultManager.handleResult(this, i2, this.o.j, this.o.f, d(), true, new com.sankuai.waimai.business.order.api.pay.f() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.18
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.order.api.pay.f
                    public final void a(Activity activity, String str, String str2) {
                        Object[] objArr2 = {activity, str, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc1c55a0a283f86b66a46b2611df4bcb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc1c55a0a283f86b66a46b2611df4bcb");
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                        Bundle bundle = new Bundle();
                        bundle.putInt("fragment_id", 3);
                        bundle.putInt("source", 1);
                        if (!aa.a(str2)) {
                            com.sankuai.waimai.foundation.router.a.a(activity, str2);
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(CrossOrderConfirmActivity.this.bB_(), com.sankuai.waimai.foundation.router.interfaces.c.B, bundle);
                        }
                        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                            return;
                        }
                        activity.finish();
                    }
                });
            }
        } else if (i2 == -1) {
            n();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Nullable
    private ArrayMap<String, Pair<Integer, List<WmOrderedFood>>> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c4db0b401a0a33180d853db18e1a73", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c4db0b401a0a33180d853db18e1a73");
        }
        if (this.b == null || this.b.poiOrders == null || this.b.poiOrders.size() <= 0) {
            return null;
        }
        ArrayMap<String, Pair<Integer, List<WmOrderedFood>>> arrayMap = new ArrayMap<>();
        for (PoiOrderPreviewResult poiOrderPreviewResult : this.b.poiOrders) {
            if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null && !aa.a(poiOrderPreviewResult.poiInfo.poiIdStr) && poiOrderPreviewResult.foodList != null && poiOrderPreviewResult.foodList.size() > 0) {
                if (TextUtils.equals(poiOrderPreviewResult.poiInfo.poiIdStr, this.t)) {
                    arrayMap.put(poiOrderPreviewResult.poiInfo.poiIdStr, new Pair<>(Integer.valueOf(poiOrderPreviewResult.poiInfo.bizType), com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.a(this.u)));
                } else {
                    arrayMap.put(poiOrderPreviewResult.poiInfo.poiIdStr, new Pair<>(Integer.valueOf(poiOrderPreviewResult.poiInfo.bizType), com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.d(poiOrderPreviewResult.foodList)));
                }
            }
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MultiPoiOrderPreviewResult multiPoiOrderPreviewResult) {
        Object[] objArr = {multiPoiOrderPreviewResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64cfbbe3beb2e4795b5407b78fd544f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64cfbbe3beb2e4795b5407b78fd544f");
            return;
        }
        this.b = multiPoiOrderPreviewResult;
        this.r = h();
        this.s = i();
        this.e.g.c(multiPoiOrderPreviewResult);
        l();
    }

    private long h() {
        PoiOrderPreviewResult poiOrderPreviewResult;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96de7083e72ce5c81d21c579841d314e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96de7083e72ce5c81d21c579841d314e")).longValue();
        }
        if (this.b == null || this.b.poiOrders == null || this.b.poiOrders.size() <= 0 || (poiOrderPreviewResult = this.b.poiOrders.get(0)) == null || poiOrderPreviewResult.poiInfo == null) {
            return -1L;
        }
        return poiOrderPreviewResult.poiInfo.poiId;
    }

    private String i() {
        PoiOrderPreviewResult poiOrderPreviewResult;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfbce4b5eebe159774b283aaeace3974", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfbce4b5eebe159774b283aaeace3974") : (this.b == null || this.b.poiOrders == null || this.b.poiOrders.size() <= 0 || (poiOrderPreviewResult = this.b.poiOrders.get(0)) == null || poiOrderPreviewResult.poiInfo == null) ? "" : com.sankuai.waimai.bussiness.order.base.utils.i.b(poiOrderPreviewResult.poiInfo.poiIdStr);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9600a563416a212e4e839f675b10e1f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9600a563416a212e4e839f675b10e1f7");
        } else {
            a(true, false);
        }
    }

    private void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042dea70c6689ad2c04a337e36c9fdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042dea70c6689ad2c04a337e36c9fdbf");
        } else {
            a(true, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a58d34aa844fa9927cfa9ff82c206e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a58d34aa844fa9927cfa9ff82c206e4");
        } else if (z) {
            b(z2, z3);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e(c, "Request is preview, not update!!!!", new Object[0]);
        }
    }

    private void b(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b7886b245105aff95a41d616539eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b7886b245105aff95a41d616539eb2");
            return;
        }
        PoiAddressParam a2 = a(z2);
        List<PoiOrderParam> k = k();
        com.sankuai.waimai.bussiness.order.crossconfirm.request.h a3 = new com.sankuai.waimai.bussiness.order.crossconfirm.request.h(this).a(this.j);
        a3.b = z;
        a3.g = w();
        com.sankuai.waimai.bussiness.order.crossconfirm.request.h a4 = a3.a(this.i);
        a4.d = this.G;
        new d.a().a(a4).a(a2).a(k).a().a();
    }

    private PoiAddressParam a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb90a75f9f94b79db21f2d029f90d182", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiAddressParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb90a75f9f94b79db21f2d029f90d182");
        }
        AddressItem a2 = com.sankuai.waimai.platform.domain.manager.location.a.a(this);
        if (a2 == null) {
            a2 = new AddressItem();
        }
        if (this.e.J.a().b()) {
            a2 = new AddressItem();
        }
        if (!z) {
            a2.addrBrief = "";
            a2.phone = "";
        }
        if (a2.addressType == 1) {
            a2 = null;
            com.sankuai.waimai.platform.domain.manager.location.a.b(this);
        }
        return PoiAddressParam.formAddress(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<PoiOrderParam> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42344b3dc6375266a84c80ca860c234", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42344b3dc6375266a84c80ca860c234");
        }
        ArrayList arrayList = new ArrayList();
        if (this.b == null || this.b.poiOrders == null) {
            return arrayList;
        }
        for (PoiOrderPreviewResult poiOrderPreviewResult : this.b.poiOrders) {
            if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null) {
                long j = poiOrderPreviewResult.poiInfo.poiId;
                String str = poiOrderPreviewResult.poiInfo.poiIdStr;
                if (!aa.a(str)) {
                    PoiOrderParam poiOrderParam = new PoiOrderParam();
                    this.e.y.a((com.meituan.android.cube.pga.common.b<i.c<Long, PoiOrderParam>>) com.meituan.android.cube.pga.common.i.a(Long.valueOf(j), poiOrderParam));
                    poiOrderParam.confirmSubmit = (this.k == null || !this.k.contains(str)) ? 0 : 1;
                    if (TextUtils.equals(str, this.t)) {
                        poiOrderParam.foodList = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.b(this.u);
                    }
                    String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(bB_().getApplicationContext(), "unpl", "");
                    if (!TextUtils.isEmpty(b)) {
                        poiOrderParam.unpl = b;
                    }
                    if (poiOrderParam.callbackInfoReq == null) {
                        poiOrderParam.callbackInfoReq = new CallbackInfo();
                    }
                    poiOrderParam.callbackInfoReq = poiOrderPreviewResult.extendsInfo;
                    poiOrderParam.unAvailableFoodList = poiOrderPreviewResult.unAvailableFoodList;
                    if (!com.sankuai.waimai.foundation.utils.d.a(poiOrderPreviewResult.unAvailableFoodList)) {
                        poiOrderParam.additionalBargainList = new ArrayList<>();
                    }
                    arrayList.add(poiOrderParam);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6086e56b9064f13021922e6d5fc5e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6086e56b9064f13021922e6d5fc5e49");
        } else if (this.i == null) {
            finish();
        } else {
            this.i.setOnClickListener(this.H);
            this.e.ac.a();
            this.i.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e224b3459b2853c1d06386f9a81bbf75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e224b3459b2853c1d06386f9a81bbf75");
        } else if (this.b.addressItem != null && this.b.addressItem.recommendType == 2) {
            CustomDialog.a c2 = new CustomDialog.a(bB_()).c(R.string.wm_order_confirm_suggest_recommend_type_title);
            c2.b(this.b.addressItem.addrDesc + StringUtil.SPACE + this.b.addressItem.addrBuildingNum).a(R.string.wm_order_confirm_cashier_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "106e99104fd4511d1f86207ff5e293b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "106e99104fd4511d1f86207ff5e293b3");
                        return;
                    }
                    dialogInterface.dismiss();
                    CrossOrderConfirmActivity.this.p();
                    JudasManualManager.a("b_27Z6u").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(CrossOrderConfirmActivity.this.r, CrossOrderConfirmActivity.this.s)).a("c_ykhs39e").a(CrossOrderConfirmActivity.this).a();
                }
            }).b(R.string.wm_order_confirm_cashier_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1de46f8f0f8c151a9e8ff93ed659bd66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1de46f8f0f8c151a9e8ff93ed659bd66");
                        return;
                    }
                    JudasManualManager.a("b_8k9S9").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(CrossOrderConfirmActivity.this.r, CrossOrderConfirmActivity.this.s)).a("c_ykhs39e").a(CrossOrderConfirmActivity.this).a();
                    dialogInterface.dismiss();
                    CrossOrderConfirmActivity.this.i.setEnabled(true);
                }
            }).a(true).b();
            JudasManualManager.b("b_BHMKt").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.r, this.s)).a("c_ykhs39e").a(this).a();
        } else {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b3ad5a92be20b8834b67efb0a142ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b3ad5a92be20b8834b67efb0a142ee");
            return;
        }
        try {
            AddressItem addressItem = this.e.C.a().b;
            if (addressItem == null) {
                this.i.setEnabled(true);
                if (this.h.getScrollY() > 0) {
                    ObjectAnimator.ofInt(this.h, "scrollY", 0).setDuration(600L).start();
                    return;
                }
                return;
            }
            com.sankuai.waimai.contextual.computing.storage.db.a.a().a(addressItem.id, com.sankuai.waimai.platform.b.A().j());
            PoiAddressParam a2 = a(true);
            List<PoiOrderParam> k = k();
            if (!a(k)) {
                finish();
            } else if (!r()) {
                this.i.setEnabled(true);
            } else if (!y()) {
                this.i.setEnabled(true);
            } else if (!q()) {
                this.i.setEnabled(true);
            } else {
                com.sankuai.waimai.bussiness.order.crossconfirm.request.f fVar = new com.sankuai.waimai.bussiness.order.crossconfirm.request.f(this);
                fVar.e = w();
                fVar.c = this.I;
                new d.a().a(this.e.H.a().b()).a(a2).a(k).a(SubmitOrderManager.getInstance().getPoiId()).a(SubmitOrderManager.getInstance().getPoiIdStr()).a(fVar).a().a();
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b("error", e.getMessage(), new Object[0]);
            b_(getString(R.string.wm_order_confirm_wrong_param_retry));
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("submit_order").b("submit_params_error").c(e.getMessage()).b());
        }
    }

    private boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80cf112b846c605cee6f86d1e60897d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80cf112b846c605cee6f86d1e60897d1")).booleanValue();
        }
        List<PoiOrderPreviewResult> list = this.b != null ? this.b.poiOrders : null;
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (PoiOrderPreviewResult poiOrderPreviewResult : list) {
                if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null && poiOrderPreviewResult.poiInfo.poiId > 0) {
                    a.C0908a c0908a = new a.C0908a(poiOrderPreviewResult.poiInfo.poiId);
                    this.e.aj.a((com.meituan.android.cube.pga.common.b<a.C0908a>) c0908a);
                    if (c0908a.b) {
                        if (sb.length() > 0) {
                            sb.append("、");
                        }
                        sb.append("「");
                        sb.append(poiOrderPreviewResult.poiInfo.poiName);
                        sb.append("」");
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                new CustomDialog.a(this).c(R.string.wm_order_confirm_title_prompt).b(getString(R.string.wm_order_confirm_tableware_not_chosen, new Object[]{sb2})).b(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.7
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b392698a1af6421aa5b641387044433", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b392698a1af6421aa5b641387044433");
                        } else {
                            dialogInterface.dismiss();
                        }
                    }
                }).a().show();
                return false;
            }
        }
        return true;
    }

    private boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff735a29ec7f408f1fc643ba0ac72bb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff735a29ec7f408f1fc643ba0ac72bb1")).booleanValue();
        }
        List<PoiOrderPreviewResult> list = this.b != null ? this.b.poiOrders : null;
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (PoiOrderPreviewResult poiOrderPreviewResult : list) {
                if (poiOrderPreviewResult != null && (poiOrderPreviewResult.templateType == 1 || poiOrderPreviewResult.templateType == 2)) {
                    if (poiOrderPreviewResult.poiInfo != null && poiOrderPreviewResult.poiInfo.poiId != -1) {
                        b.a aVar = new b.a(poiOrderPreviewResult.poiInfo.poiId);
                        this.e.ak.a((com.meituan.android.cube.pga.common.b<b.a>) aVar);
                        PhoneInfo phoneInfo = aVar.b;
                        if (phoneInfo != null && !phoneInfo.valid()) {
                            d(R.string.wm_order_confirm_remark_error_phone);
                            return false;
                        } else if (poiOrderPreviewResult.templateType == 1 || poiOrderPreviewResult.templateType == 2) {
                            if (TextUtils.isEmpty(phoneInfo.toString())) {
                                if (sb.length() > 0) {
                                    sb.append("、");
                                }
                                sb.append("「");
                                sb.append(poiOrderPreviewResult.poiInfo.poiName);
                                sb.append("」");
                            }
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                new CustomDialog.a(this).c(R.string.wm_order_confirm_title_prompt).b(getString(R.string.wm_order_confirm_phone_not_chosen, new Object[]{sb2})).b(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.8
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06786e5cae32eb468ce038ae691d3324", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06786e5cae32eb468ce038ae691d3324");
                        } else {
                            dialogInterface.dismiss();
                        }
                    }
                }).a().show();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.List<com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam> r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.a
            java.lang.String r11 = "bc2f18fb75541deab71d5ac1e8263b6c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            if (r13 == 0) goto Lb9
            int r1 = r13.size()
            if (r1 <= 0) goto Lb9
            java.util.Iterator r13 = r13.iterator()
        L2e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r13.next()
            com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam r1 = (com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam) r1
            if (r1 == 0) goto L2e
            java.util.ArrayList<com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput> r2 = r1.foodList
            boolean r2 = com.sankuai.waimai.foundation.utils.d.a(r2)
            if (r2 == 0) goto L78
            long r1 = r1.poiId
            java.lang.String r13 = r12.a(r1)
            com.sankuai.waimai.bussiness.order.base.log.a r1 = new com.sankuai.waimai.bussiness.order.base.log.a
            r1.<init>()
            java.lang.String r2 = "submit_order"
            com.sankuai.waimai.platform.capacity.log.a$a r1 = r1.a(r2)
            java.lang.String r2 = "goods_empty"
            com.sankuai.waimai.platform.capacity.log.a$a r1 = r1.b(r2)
            com.sankuai.waimai.platform.capacity.log.a r1 = r1.b()
            com.sankuai.waimai.platform.capacity.log.i.d(r1)
            r1 = 2131364671(0x7f0a0b3f, float:1.8349186E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            if (r13 == 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r13 = ""
        L6e:
            r0[r9] = r13
            java.lang.String r13 = r12.getString(r1, r0)
            com.sankuai.waimai.foundation.utils.ae.a(r12, r13)
            return r9
        L78:
            java.util.ArrayList<com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput> r1 = r1.foodList
            java.util.Iterator r1 = r1.iterator()
        L7e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput r2 = (com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput) r2
            if (r2 == 0) goto L98
            long r3 = r2.id
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L98
            int r2 = r2.count
            if (r2 > 0) goto L7e
        L98:
            com.sankuai.waimai.bussiness.order.base.log.a r13 = new com.sankuai.waimai.bussiness.order.base.log.a
            r13.<init>()
            java.lang.String r0 = "submit_order"
            com.sankuai.waimai.platform.capacity.log.a$a r13 = r13.a(r0)
            java.lang.String r0 = "order_invalid"
            com.sankuai.waimai.platform.capacity.log.a$a r13 = r13.b(r0)
            com.sankuai.waimai.platform.capacity.log.a r13 = r13.b()
            com.sankuai.waimai.platform.capacity.log.i.d(r13)
            r13 = 2131364719(0x7f0a0b6f, float:1.8349283E38)
            r12.d(r13)
            return r9
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.a(java.util.List):boolean");
    }

    private boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4407b4a9f3204b656a36b37c8bdc18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4407b4a9f3204b656a36b37c8bdc18")).booleanValue();
        }
        List<PoiOrderPreviewResult> list = this.b != null ? this.b.poiOrders : null;
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (PoiOrderPreviewResult poiOrderPreviewResult : list) {
                if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null && poiOrderPreviewResult.poiInfo.poiId > 0) {
                    b.a aVar = new b.a(poiOrderPreviewResult.poiInfo.poiId, true);
                    this.e.ag.a((com.meituan.android.cube.pga.common.b<b.a>) aVar);
                    if (!aVar.b) {
                        if (sb.length() > 0) {
                            sb.append("、");
                        }
                        sb.append("「");
                        sb.append(poiOrderPreviewResult.poiInfo.poiName);
                        sb.append("」");
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                new CustomDialog.a(this).c(R.string.wm_order_confirm_title_prompt).b(getString(R.string.wm_order_confirm_deliver_time_not_chosen, new Object[]{sb2})).b(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity.9
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0e6e07e74b30ee0bc7cee925d688c54", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0e6e07e74b30ee0bc7cee925d688c54");
                        } else {
                            dialogInterface.dismiss();
                        }
                    }
                }).a().show();
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final void b_(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e072b4c99922f9cb9b468bd91beeb25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e072b4c99922f9cb9b468bd91beeb25");
        } else if (isFinishing()) {
        } else {
            super.b_(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfece48666d04de93f2a3c3c0bd8c4df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfece48666d04de93f2a3c3c0bd8c4df");
        } else if (aVar == b.a.LOGIN && this.p) {
            n();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d629ced3d0a95a7482c05b42667cf12a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d629ced3d0a95a7482c05b42667cf12a");
        } else if (enumC0948b != b.EnumC0948b.PHONE || this.o == null) {
        } else {
            this.l = true;
            com.sankuai.waimai.platform.capacity.pay.a.a(this, 3, this.o.f, this.o.i);
        }
    }

    private int z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6357931cc6b326ec31f43bb25b5616d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6357931cc6b326ec31f43bb25b5616d4")).intValue();
        }
        if (this.b == null || com.sankuai.waimai.foundation.utils.b.b(this.b.poiOrders)) {
            return 0;
        }
        return this.b.poiOrders.size();
    }

    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52c377af7a565a6d9423c111bad4afd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52c377af7a565a6d9423c111bad4afd");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_mark", this.e.w.a().b);
        return hashMap;
    }

    @Nullable
    private String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efddd85fdcfdf4dd1a5cf786c204e5b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efddd85fdcfdf4dd1a5cf786c204e5b4");
        }
        if (this.b == null || this.b.poiOrders == null || this.b.poiOrders.size() <= 0) {
            return null;
        }
        for (PoiOrderPreviewResult poiOrderPreviewResult : this.b.poiOrders) {
            if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null && poiOrderPreviewResult.poiInfo.poiId == j) {
                return poiOrderPreviewResult.poiInfo.poiName;
            }
        }
        return null;
    }
}
