package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.widget.LinearLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.ReportReasonResponse;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.business.restaurant.base.widget.FunctionSheetDialogFragment;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.d;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.CommentImageGallery;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.PoiCommentSP;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
import com.sankuai.waimai.platform.domain.core.comment.Picture;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
import com.sankuai.waimai.platform.widget.PoiCommentLabelView;
import com.sankuai.waimai.platform.widget.common.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a implements a.InterfaceC0837a, CommentImageGallery.a {
    public static ChangeQuickRedirect d;
    protected com.sankuai.waimai.business.restaurant.base.manager.order.g e;
    protected final g.a f;
    e g;
    int h;
    long i;
    a j;
    Activity k;
    private com.sankuai.waimai.business.restaurant.base.functionsheet.a l;
    private a.b m;
    private d.a n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, int i2, long j, boolean z);

        void a(int i, long j);

        void a(String str, Comment comment);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_restaurant_comment_fragment_new;
    }

    public b(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, a aVar) {
        super(activity);
        Object[] objArr = {activity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ff7524f6386bc7fbfc8b44ef8c088b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ff7524f6386bc7fbfc8b44ef8c088b");
            return;
        }
        this.h = 0;
        this.i = 0L;
        this.m = new a.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.common.a.b
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "563aabf372a5c44de4d4bc0d013a0429", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "563aabf372a5c44de4d4bc0d013a0429");
                } else {
                    b.this.j.a(b.this.h, b.this.i);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.common.a.b
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59dac6e8420d834802d26f66d0d7877b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59dac6e8420d834802d26f66d0d7877b");
                } else {
                    b.this.j.a(i, b.this.h, b.this.i, false);
                }
            }
        };
        this.n = new d.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.d.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3f44692640ec13a4ca81a20ea26d33c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3f44692640ec13a4ca81a20ea26d33c");
                    return;
                }
                if (b.this.g != null) {
                    b.this.g.d();
                }
                b.this.h = i;
                b.this.i = 0L;
                b.this.j.a(0, i, 0L, true);
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.d.a
            public final void a(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f8eefc2d81edec8f6289f057bc617e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f8eefc2d81edec8f6289f057bc617e0");
                    return;
                }
                if (b.this.g != null) {
                    b.this.g.d();
                }
                b.this.i = j;
                b.this.h = 0;
                b.this.j.a(0, 0, j, true);
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.d.a
            public final void a(PoiCommentLabelView poiCommentLabelView, PoiCommentTypeInfo poiCommentTypeInfo) {
                Object[] objArr2 = {poiCommentLabelView, poiCommentTypeInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea2e8e6da23faab16563061175c46191", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea2e8e6da23faab16563061175c46191");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = {poiCommentLabelView.getText().toString()};
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "58a161bc6aa16c66352312ce91f5cfa2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "58a161bc6aa16c66352312ce91f5cfa2");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.d.a
            public final void a(PoiCommentLabelView poiCommentLabelView, CommentLabel commentLabel) {
                Object[] objArr2 = {poiCommentLabelView, commentLabel};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a475056387077c0d8cae0359da14599", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a475056387077c0d8cae0359da14599");
                } else {
                    poiCommentLabelView.getText().toString();
                }
            }
        };
        this.k = activity;
        this.e = gVar;
        this.j = aVar;
        this.f = gVar.a(activity);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb23e744086fb3dd503215d325653247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb23e744086fb3dd503215d325653247");
            return;
        }
        this.g = new e(this.k, this.n, this, this, this.e, ((BaseActivity) this.k).w());
        this.g.b((LinearLayout) this.b.findViewById(R.id.comment_container));
        this.g.m = this.m;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf4576bf5005d7cf9528bec0ce48ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf4576bf5005d7cf9528bec0ce48ddf");
            return;
        }
        final String f = this.e.f();
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42e149e4123d7a5c1f3b816b9359290c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42e149e4123d7a5c1f3b816b9359290c");
                } else if (b.this.c != null && com.sankuai.waimai.platform.b.d(b.this.c.getApplicationContext())) {
                    com.sankuai.waimai.business.restaurant.poicontainer.utils.f.a(f, b.this.f.c(), false, b.this.k);
                } else {
                    PoiCommentSP.a(true);
                }
            }
        }, 300L);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83bcfc1625c97c983bbe52cf5771c5d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83bcfc1625c97c983bbe52cf5771c5d8");
        } else {
            com.sankuai.waimai.business.restaurant.poicontainer.utils.f.a(this.e.f(), this.f.c(), true, this.k);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.CommentImageGallery.a
    public final void a(Comment comment, ArrayList<Picture> arrayList, ArrayList<com.sankuai.waimai.platform.domain.core.goods.e> arrayList2, int i, boolean z) {
        Object[] objArr = {comment, arrayList, arrayList2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a52fd9815ad88208ceb922a36d15db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a52fd9815ad88208ceb922a36d15db");
        } else if (com.sankuai.waimai.foundation.utils.b.b(arrayList2)) {
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_ztxffo2t");
            a2.b = AppUtil.generatePageInfoKey(this.k);
            a2.a("c_CijEL").a("comment_id", comment.id).a("poi_id", this.e.f()).a("index", i).a();
            Bundle bundle = new Bundle();
            bundle.putInt("current_img_path", i);
            bundle.putLong("intent_poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(this.e.f()));
            bundle.putString("intent_poi_id_str", this.e.f());
            bundle.putInt("intent_float_layer_type", 1);
            bundle.putInt("intent_pic_count", arrayList2.size());
            bundle.putBoolean("intent_media_include_boolean", z);
            bundle.putInt("from", 1);
            bundle.putInt("comment_source", this.h);
            bundle.putLong("comment_id", comment.id);
            if (z) {
                bundle.putSerializable("intent_media_infos", arrayList2);
            } else {
                bundle.putSerializable("images", arrayList);
            }
            com.sankuai.waimai.foundation.router.a.a(this.k, com.sankuai.waimai.foundation.router.interfaces.c.A, bundle);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.InterfaceC0837a
    public final void a(Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deef8402f279235c9859369b8e905a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deef8402f279235c9859369b8e905a7b");
            return;
        }
        if (this.l == null) {
            this.l = new com.sankuai.waimai.business.restaurant.base.functionsheet.a();
        }
        final com.sankuai.waimai.business.restaurant.base.functionsheet.a aVar = this.l;
        final BaseActivity baseActivity = (BaseActivity) this.k;
        final long j = comment.id;
        Object[] objArr2 = {baseActivity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.functionsheet.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "45e5116e2cf8d6d94abc33da06f99cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "45e5116e2cf8d6d94abc33da06f99cb2");
        } else if (com.sankuai.waimai.foundation.utils.f.a(baseActivity)) {
        } else {
            if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                com.sankuai.waimai.platform.domain.manager.user.a.a((Context) baseActivity);
                return;
            }
            if (aVar.b != null) {
                aVar.b.dismissAllowingStateLoss();
                aVar.b = null;
            }
            aVar.b = new FunctionSheetDialogFragment();
            com.sankuai.waimai.foundation.utils.log.a.b("MoreFunctionDialogFragment", "showFunctionListDialog", new Object[0]);
            aVar.b.a();
            aVar.b.b = null;
            aVar.b.a(0, "我要举报");
            aVar.b.c = new FunctionSheetDialogFragment.a() { // from class: com.sankuai.waimai.business.restaurant.base.functionsheet.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.widget.FunctionSheetDialogFragment.a
                public final void a(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63862393e953418e0e5a3595b32620fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63862393e953418e0e5a3595b32620fe");
                        return;
                    }
                    a aVar2 = aVar;
                    BaseActivity baseActivity2 = baseActivity;
                    Object[] objArr4 = {baseActivity2};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "1688325a2f19e65570075cafdf3e8524", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "1688325a2f19e65570075cafdf3e8524");
                    } else {
                        JudasManualManager.b("b_waimai_963xq37n_mc", "c_CijEL", baseActivity2).a();
                    }
                    aVar.b.dismiss();
                    final a aVar3 = aVar;
                    final BaseActivity baseActivity3 = baseActivity;
                    final long j2 = j;
                    Object[] objArr5 = {baseActivity3, new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "d9c23bfa9a547563771a970e570f4e10", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "d9c23bfa9a547563771a970e570f4e10");
                        return;
                    }
                    final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a((Activity) baseActivity3);
                    com.sankuai.waimai.foundation.utils.log.a.b("MoreFunctionDialogFragment", "getReportReasonList", new Object[0]);
                    b.a(((ShopApiService) b.a((Class<Object>) ShopApiService.class)).getReportReasonList(j2, 1, 4), new b.AbstractC1042b<BaseResponse<ReportReasonResponse>>() { // from class: com.sankuai.waimai.business.restaurant.base.functionsheet.a.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr6 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fc9d1bc75cd17c8997a35efe682e25dd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fc9d1bc75cd17c8997a35efe682e25dd");
                            } else if (!f.a(baseActivity3)) {
                                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                                if (baseResponse.isSuccess()) {
                                    if (((ReportReasonResponse) baseResponse.data).getReportCheckResult() != null) {
                                        if (((ReportReasonResponse) baseResponse.data).getReportCheckResult().a) {
                                            final a aVar4 = aVar3;
                                            List<ReportReasonResponse.b> reasonList = ((ReportReasonResponse) baseResponse.data).getReasonList();
                                            final long j3 = j2;
                                            final BaseActivity baseActivity4 = baseActivity3;
                                            Object[] objArr7 = {reasonList, new Long(j3), baseActivity4};
                                            ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar4, changeQuickRedirect7, false, "382b2c69b52318bf168488cf8d46f219", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, aVar4, changeQuickRedirect7, false, "382b2c69b52318bf168488cf8d46f219");
                                                return;
                                            } else if (com.sankuai.waimai.foundation.utils.b.b(reasonList)) {
                                                return;
                                            } else {
                                                if (aVar4.b == null) {
                                                    aVar4.b = new FunctionSheetDialogFragment();
                                                }
                                                com.sankuai.waimai.foundation.utils.log.a.b("MoreFunctionDialogFragment", "showReportReasonListDialog", new Object[0]);
                                                aVar4.b.a();
                                                aVar4.b.b = "请选择举报理由";
                                                for (int i2 = 0; i2 < reasonList.size(); i2++) {
                                                    ReportReasonResponse.b bVar = reasonList.get(i2);
                                                    if (bVar != null && !aa.a(bVar.b)) {
                                                        aVar4.b.a(bVar.a, bVar.b);
                                                    }
                                                }
                                                aVar4.b.c = new FunctionSheetDialogFragment.a() { // from class: com.sankuai.waimai.business.restaurant.base.functionsheet.a.3
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.business.restaurant.base.widget.FunctionSheetDialogFragment.a
                                                    public final void a(int i3, String str2) {
                                                        Object[] objArr8 = {Integer.valueOf(i3), str2};
                                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "7d559b519138943a3a1c173b3d85c7e3", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "7d559b519138943a3a1c173b3d85c7e3");
                                                            return;
                                                        }
                                                        aVar4.b.dismiss();
                                                        final a aVar5 = aVar4;
                                                        long j4 = j3;
                                                        final BaseActivity baseActivity5 = baseActivity4;
                                                        Object[] objArr9 = {Integer.valueOf(i3), str2, new Long(j4), baseActivity5};
                                                        ChangeQuickRedirect changeQuickRedirect9 = a.a;
                                                        if (PatchProxy.isSupport(objArr9, aVar5, changeQuickRedirect9, false, "a429a181fdb91667e0b8727413d27987", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr9, aVar5, changeQuickRedirect9, false, "a429a181fdb91667e0b8727413d27987");
                                                            return;
                                                        }
                                                        final Dialog a3 = com.sankuai.waimai.platform.widget.dialog.a.a((Activity) baseActivity5);
                                                        b.a(((ShopApiService) b.a((Class<Object>) ShopApiService.class)).submitReport(j4, 1, 4, i3, str2), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.restaurant.base.repository.model.g>>() { // from class: com.sankuai.waimai.business.restaurant.base.functionsheet.a.4
                                                            public static ChangeQuickRedirect a;

                                                            @Override // rx.e
                                                            public final /* synthetic */ void onNext(Object obj2) {
                                                                BaseResponse baseResponse2 = (BaseResponse) obj2;
                                                                Object[] objArr10 = {baseResponse2};
                                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "b5dbde7ff6e392461a3538385315241c", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "b5dbde7ff6e392461a3538385315241c");
                                                                    return;
                                                                }
                                                                com.sankuai.waimai.platform.widget.dialog.a.b(a3);
                                                                if (baseResponse2.isSuccess()) {
                                                                    if (aa.a(((com.sankuai.waimai.business.restaurant.base.repository.model.g) baseResponse2.data).a)) {
                                                                        return;
                                                                    }
                                                                    ae.a((Activity) baseActivity5, ((com.sankuai.waimai.business.restaurant.base.repository.model.g) baseResponse2.data).a);
                                                                } else if (baseResponse2.code == 401) {
                                                                    com.sankuai.waimai.platform.domain.manager.user.a.a((Context) baseActivity5);
                                                                } else {
                                                                    ae.a((Activity) baseActivity5, baseResponse2.msg);
                                                                }
                                                            }

                                                            @Override // rx.e
                                                            public final void onError(Throwable th) {
                                                                Object[] objArr10 = {th};
                                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "6a4c30fe8b5ad31ecfbcf530ea9bc6ab", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "6a4c30fe8b5ad31ecfbcf530ea9bc6ab");
                                                                } else {
                                                                    com.sankuai.waimai.platform.widget.dialog.a.b(a3);
                                                                }
                                                            }
                                                        }, baseActivity5.w());
                                                    }
                                                };
                                                aVar4.b.show(baseActivity4.getSupportFragmentManager(), "MoreFunctionDialogFragment");
                                                FunctionSheetDialogFragment functionSheetDialogFragment = aVar4.b;
                                                Object[] objArr8 = {baseActivity4, functionSheetDialogFragment};
                                                ChangeQuickRedirect changeQuickRedirect8 = a.a;
                                                if (PatchProxy.isSupport(objArr8, aVar4, changeQuickRedirect8, false, "a23514bff9990305a8c68a10f4c2abdb", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, aVar4, changeQuickRedirect8, false, "a23514bff9990305a8c68a10f4c2abdb");
                                                    return;
                                                } else {
                                                    JudasManualManager.a("c_waimai_tp1wb8qq", 0, functionSheetDialogFragment).a("src_page_id", AppUtil.generatePageInfoKey(baseActivity4)).b();
                                                    return;
                                                }
                                            }
                                        }
                                        ae.a((Activity) baseActivity3, ((ReportReasonResponse) baseResponse.data).getReportCheckResult().b);
                                    }
                                } else if (baseResponse.code == 401) {
                                    com.sankuai.waimai.platform.domain.manager.user.a.a((Context) baseActivity3);
                                } else {
                                    ae.a((Activity) baseActivity3, baseResponse.msg);
                                }
                            }
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr6 = {th};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "533fdf49d4e58de5b4be01bbb72db90c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "533fdf49d4e58de5b4be01bbb72db90c");
                            } else {
                                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                            }
                        }
                    }, baseActivity3.w());
                }
            };
            aVar.b.show(baseActivity.getSupportFragmentManager(), "MoreFunctionDialogFragment");
            Object[] objArr3 = {baseActivity};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.functionsheet.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "42463df8575b730de0f5301892534236", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "42463df8575b730de0f5301892534236");
            } else {
                JudasManualManager.c("b_waimai_963xq37n_mv", "c_CijEL", baseActivity).a();
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5582e56b835d5f9b36306b3a8328e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5582e56b835d5f9b36306b3a8328e0");
        } else if (this.g != null) {
            this.g.c();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.viewholder.a.InterfaceC0837a
    public final void a(String str, Comment comment) {
        Object[] objArr = {str, comment};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f96327cf457a4771caabb46f983c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f96327cf457a4771caabb46f983c26");
        } else if (this.j != null) {
            this.j.a(str, comment);
        }
    }
}
