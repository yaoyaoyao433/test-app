package com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.api.store.model.SCActivityDialogInfo;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.widget.image.GeometricScaleTransform;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect w;

    public c(Activity activity, ImageView imageView) {
        super(activity);
        Object[] objArr = {activity, imageView};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58f0243b9ca38968cbac1ec93cba05f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58f0243b9ca38968cbac1ec93cba05f");
        } else {
            this.e = imageView;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.a
    public final void d(boolean z) {
        SCActivityDialogInfo b;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531d671aecdfc5774694169d43e5339e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531d671aecdfc5774694169d43e5339e");
        } else if (z || this.j == 0) {
            this.e.setVisibility(8);
        } else {
            if ((this.j == 2 || this.j == 4) && this.i != null && !TextUtils.isEmpty(this.i.clickUrl)) {
                a(this.i != null ? this.i.shareTipIcon : "", R.drawable.wm_order_detail_ic_floating_hongbao);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef1c47d96f3be8995cda27eb414999f0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef1c47d96f3be8995cda27eb414999f0");
                        } else if (c.this.i != null) {
                            com.sankuai.waimai.foundation.router.a.a(c.this.f, c.this.i.clickUrl);
                            c.this.a();
                        }
                    }
                });
                b();
            }
            if (this.j == 1 && this.h != null) {
                a(this.h.shareIcon != null ? this.h.shareIcon : "", R.drawable.wm_order_detail_ic_floating_hongbao);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9a295c3036a5339076bf36690ce68ee", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9a295c3036a5339076bf36690ce68ee");
                            return;
                        }
                        c.this.e.setEnabled(false);
                        c.this.b(false);
                        c.this.a();
                    }
                });
            }
            if (this.j == 3 && this.h != null) {
                a(this.h.shareIcon != null ? this.h.shareIcon : "", R.drawable.wm_order_detail_ic_floating_hongbao);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45df905928c9be9f33c4a8b9caa24d25", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45df905928c9be9f33c4a8b9caa24d25");
                            return;
                        }
                        c.this.e.setEnabled(false);
                        IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                        if (iOrderBusinessService != null && c.this.i != null && c.this.i.couponCollectionTip != null) {
                            c.this.g = false;
                            Map<String, Object> map = c.this.i.couponCollectionTip;
                            map.put("order_id", c.this.b);
                            iOrderBusinessService.showCouponListDialog(c.this.f, k.a().toJson(map), new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.3.1
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    Object[] objArr3 = {dialogInterface};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63b1fe49abcc44c28c649f2c2f905632", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63b1fe49abcc44c28c649f2c2f905632");
                                    } else if (c.this.v != null) {
                                        c.this.v.obtainMessage(32631).sendToTarget();
                                    }
                                }
                            });
                        }
                        c.this.a();
                    }
                });
            }
            if (this.j == 5 && this.h != null) {
                a(this.h.shareIcon != null ? this.h.shareIcon : "", R.drawable.wm_order_detail_ic_floating_hongbao);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12987c97ff74b0e2557ba8af56ca77f8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12987c97ff74b0e2557ba8af56ca77f8");
                            return;
                        }
                        c.this.g = true;
                        c.this.a(c.this.o, false);
                        c.this.a();
                    }
                });
            }
            if (this.j != 7 || (b = com.sankuai.waimai.bussiness.order.detailnew.util.k.b(this.n)) == null || aa.a(b.shareIcon)) {
                return;
            }
            if (!this.k) {
                if (b.activityType == 4) {
                    if (a(b.logData)) {
                        a(JudasManualManager.b("b_waimai_xvhyjhee_mv"), b).a(this.f).a();
                    } else {
                        JudasManualManager.b("b_vhvrldi8").a("poi_id", i.a(this.c, this.d)).a("order_id", this.b).a("stid", b.stids).b(b.logData).a(this.f).a();
                    }
                } else {
                    JudasManualManager.b("b_waimai_sg_mgy5j26s_mv").a("poi_id", i.a(this.c, this.d)).a("order_id", this.b).a("stid", b.stids).a("pageinfo", b.shareIcon).a(this.f).a();
                }
                this.k = true;
            }
            b.C0608b b2 = com.sankuai.waimai.platform.capacity.imageloader.a.a().b(g.a(this.f, 48.0f));
            b2.b = this.f.getApplicationContext();
            b2.c = b.shareIcon;
            b2.f = ImageQualityUtil.a(0);
            b2.k = 4;
            b2.a(this.e);
            this.e.setOnClickListener(d.a(this, b));
        }
    }

    public static /* synthetic */ void a(c cVar, SCActivityDialogInfo sCActivityDialogInfo, View view) {
        Object[] objArr = {cVar, sCActivityDialogInfo, view};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8646642f31ed5644863ccfe028e9157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8646642f31ed5644863ccfe028e9157");
            return;
        }
        cVar.g = true;
        if (!aa.a(sCActivityDialogInfo.clickUrl)) {
            com.sankuai.waimai.foundation.router.a.a(cVar.f, sCActivityDialogInfo.clickUrl);
        } else {
            cVar.a(cVar.o, false);
        }
        if (sCActivityDialogInfo.activityType == 4) {
            if (cVar.a(sCActivityDialogInfo.logData)) {
                cVar.a(JudasManualManager.a("b_waimai_xvhyjhee_mc"), sCActivityDialogInfo).a(cVar.f).a();
                return;
            } else {
                JudasManualManager.a("b_m18t3geu").a("poi_id", i.a(cVar.c, cVar.d)).a("order_id", cVar.b).a("stid", sCActivityDialogInfo.stids).b(sCActivityDialogInfo.logData).a(cVar.f).a();
                return;
            }
        }
        JudasManualManager.a("b_waimai_sg_mgy5j26s_mc").a("poi_id", i.a(cVar.c, cVar.d)).a("order_id", cVar.b).a("stid", sCActivityDialogInfo.stids).a("pageinfo", sCActivityDialogInfo.shareIcon).a(cVar.f).a();
    }

    private JudasManualManager.a a(@NonNull JudasManualManager.a aVar, SCActivityDialogInfo sCActivityDialogInfo) {
        Object[] objArr = {aVar, sCActivityDialogInfo};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78104a2b570690822f1200e7808e5b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (JudasManualManager.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78104a2b570690822f1200e7808e5b78");
        }
        return aVar.a("poi_id", i.a(this.c, this.d)).a("order_id", this.b).a("stid", aa.a(sCActivityDialogInfo.stids) ? "-999" : sCActivityDialogInfo.stids).b(sCActivityDialogInfo.logData).a("activity_type", a(sCActivityDialogInfo.logData.get("activity_type"))).a(PushConstants.TASK_ID, b(sCActivityDialogInfo.logData.get(PushConstants.TASK_ID)));
    }

    private boolean a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcdf630e51668498a4836a69d33190f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcdf630e51668498a4836a69d33190f")).booleanValue();
        }
        if (map != null) {
            try {
                if (map.containsKey("friend_assistance")) {
                    return 1 == ((Double) map.get("friend_assistance")).intValue();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private int a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70bb0b2187291612f25861c88f158582", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70bb0b2187291612f25861c88f158582")).intValue();
        }
        int i = -999;
        if (obj == null) {
            return -999;
        }
        if (obj instanceof String) {
            i = r.a((String) obj, -999);
        } else {
            try {
                i = ((Double) obj).intValue();
            } catch (Exception unused) {
            }
        }
        if (i != 6) {
            switch (i) {
                case 8:
                    return 4;
                case 9:
                    return 5;
                default:
                    return i;
            }
        }
        return 3;
    }

    private String b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2951b63ae539a6073b518d37b3d81dbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2951b63ae539a6073b518d37b3d81dbc");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return !aa.a(str) ? str : "-999";
        }
        return "-999";
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf((int) R.drawable.wm_order_detail_ic_floating_hongbao)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c15706873ec50be31f2a76a402876ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c15706873ec50be31f2a76a402876ad");
            return;
        }
        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a.b = this.f.getApplicationContext();
        a.c = str;
        a.f = ImageQualityUtil.a(0);
        b.C0608b a2 = a.a(new GeometricScaleTransform(this.f.getApplicationContext(), 48));
        a2.k = 4;
        a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1878861a57b84e5bda53bd94a6f56194", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1878861a57b84e5bda53bd94a6f56194");
                    return;
                }
                c.this.e.setImageBitmap(bitmap);
                c.this.e.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.5.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "639afcfc54e926a8b18ed55abfee4a54", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "639afcfc54e926a8b18ed55abfee4a54");
                        } else {
                            c.this.e.setVisibility(0);
                        }
                    }
                });
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35147eb3c3f6cf0224737b9fcf88f1a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35147eb3c3f6cf0224737b9fcf88f1a7");
                    return;
                }
                c.this.e.setImageResource(r2);
                c.this.e.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c.5.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48a677ad42d1fdb335e18b9c7e0da35e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48a677ad42d1fdb335e18b9c7e0da35e");
                        } else {
                            c.this.e.setVisibility(0);
                        }
                    }
                });
            }
        });
    }

    public final boolean d() {
        return this.j == 2;
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f7d902f2153d6613b6ba0289b58aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f7d902f2153d6613b6ba0289b58aa7");
        } else if ((i == 1 || i == 2) && com.sankuai.waimai.share.b.a(this.f)) {
            JudasManualManager.a("b_eIBhM").a("channel_id", i).a("orderid", str).a("c_hgowsqb").a(this.f).a();
        }
    }
}
