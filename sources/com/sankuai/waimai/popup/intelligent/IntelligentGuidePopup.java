package com.sankuai.waimai.popup.intelligent;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.list.model.c;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import com.sankuai.waimai.popup.WMSkyFallPopup;
import com.sankuai.waimai.popup.intelligent.IntelligentEntranceGuideDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IntelligentGuidePopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IntelligentEntranceGuideDialog guideDialog;
    private long userId;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        View m();

        boolean n();

        boolean o();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        return true;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        return true;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a498740b98b9ed57c03483712d421a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a498740b98b9ed57c03483712d421a");
            return;
        }
        Activity activity = getContext().a.get();
        if (f.a(activity) || !(activity instanceof a) || !((a) activity).n()) {
            interfaceC1075b.a(false, bVar);
        } else if (!UserCenter.getInstance(activity).isLogin()) {
            interfaceC1075b.a(false, bVar);
        } else if (WMSkyFallPopup.skyFallCouponResponseCache == null) {
            interfaceC1075b.a(false, bVar);
        } else {
            this.userId = UserCenter.getInstance(activity).getUserId();
            if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, getSPKey(this.userId), 0) == 0) {
                c cVar = (c) com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "zim-intelligent_floating_layer", (Class<Object>) c.class);
                if (cVar != null && cVar.a) {
                    bVar.c = cVar;
                    interfaceC1075b.a(true, bVar);
                    return;
                }
                interfaceC1075b.a(false, bVar);
                return;
            }
            interfaceC1075b.a(false, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bafe790843790f9f2317ed68498ecfaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bafe790843790f9f2317ed68498ecfaf");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f529673c1944b3eaea5e1285b010893a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f529673c1944b3eaea5e1285b010893a");
            return;
        }
        Activity activity = getContext().a.get();
        if (!f.a(activity) && (activity instanceof a)) {
            a aVar2 = (a) activity;
            if (aVar2.n() && aVar2.o()) {
                View m = aVar2.m();
                if (m == null || m.getVisibility() != 0 || !m.isAttachedToWindow()) {
                    aVar.a(true);
                    return;
                } else if (bVar == null || !(bVar.c instanceof c)) {
                    aVar.a(true);
                    return;
                } else {
                    showIntelligentEntranceGuide(activity, m, (c) bVar.c, aVar);
                    return;
                }
            }
        }
        aVar.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordShown(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4aaf13a175002660b8a26bcaa13af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4aaf13a175002660b8a26bcaa13af9");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, getSPKey(j), 1);
        }
    }

    private String getSPKey(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cbee910d8399ea9689636083e11345e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cbee910d8399ea9689636083e11345e");
        }
        return "IntelligentGuidePopup_" + j;
    }

    private void showIntelligentEntranceGuide(final Activity activity, final View view, @NonNull c cVar, final b.a aVar) {
        Object[] objArr = {activity, view, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5c02e1b59fa4884ab758fd8469cbf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5c02e1b59fa4884ab758fd8469cbf6");
            return;
        }
        float[] viewCenterLocationInScreen = getViewCenterLocationInScreen(view);
        int a2 = g.a(activity, 27.0f);
        if (this.guideDialog == null) {
            this.guideDialog = new IntelligentEntranceGuideDialog(activity);
        }
        if (this.guideDialog.isShowing()) {
            this.guideDialog.dismiss();
        }
        IntelligentEntranceGuideDialog intelligentEntranceGuideDialog = this.guideDialog;
        float f = viewCenterLocationInScreen[0];
        float f2 = viewCenterLocationInScreen[1];
        float f3 = a2;
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), -13236};
        ChangeQuickRedirect changeQuickRedirect3 = IntelligentEntranceGuideDialog.a;
        if (PatchProxy.isSupport(objArr2, intelligentEntranceGuideDialog, changeQuickRedirect3, false, "8aeb22319f949b1ab60d16c56d7ea3e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, intelligentEntranceGuideDialog, changeQuickRedirect3, false, "8aeb22319f949b1ab60d16c56d7ea3e1");
        } else {
            intelligentEntranceGuideDialog.b = f;
            intelligentEntranceGuideDialog.c = f2;
            intelligentEntranceGuideDialog.e.a(f, f2, f3, 0.0f, -13236);
        }
        final IntelligentEntranceGuideDialog intelligentEntranceGuideDialog2 = this.guideDialog;
        Object[] objArr3 = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect4 = IntelligentEntranceGuideDialog.a;
        if (PatchProxy.isSupport(objArr3, intelligentEntranceGuideDialog2, changeQuickRedirect4, false, "704b65f173843cead613bd6ab3245532", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, intelligentEntranceGuideDialog2, changeQuickRedirect4, false, "704b65f173843cead613bd6ab3245532");
        } else if (cVar != null) {
            intelligentEntranceGuideDialog2.f.setVisibility(4);
            com.sankuai.waimai.modular.utils.b.a(intelligentEntranceGuideDialog2.g, cVar.b);
            com.sankuai.waimai.modular.utils.b.a(intelligentEntranceGuideDialog2.h, cVar.c);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = activity;
            c.c = cVar.d;
            c.a(intelligentEntranceGuideDialog2.i);
            intelligentEntranceGuideDialog2.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.popup.intelligent.IntelligentEntranceGuideDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "4bd5269918952ea6fc4082327dbbc3d7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "4bd5269918952ea6fc4082327dbbc3d7");
                    } else {
                        intelligentEntranceGuideDialog2.a(false);
                    }
                }
            });
            intelligentEntranceGuideDialog2.f.post(new Runnable() { // from class: com.sankuai.waimai.popup.intelligent.IntelligentEntranceGuideDialog.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "1e81b3f325d053ac35eb112c10971329", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "1e81b3f325d053ac35eb112c10971329");
                    } else {
                        IntelligentEntranceGuideDialog.a(intelligentEntranceGuideDialog2);
                    }
                }
            });
        }
        this.guideDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr4 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "364676c97b626256a75e87c3a187d7a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "364676c97b626256a75e87c3a187d7a5");
                    return;
                }
                aVar.a(false);
                IntelligentGuidePopup.this.recordShown(activity, IntelligentGuidePopup.this.userId);
            }
        });
        this.guideDialog.d = new IntelligentEntranceGuideDialog.a() { // from class: com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.popup.intelligent.IntelligentEntranceGuideDialog.a
            public final void a(boolean z) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "a6c74ac1585ab9c15904cef8fdb2f2fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "a6c74ac1585ab9c15904cef8fdb2f2fd");
                } else if (z) {
                    view.performClick();
                } else {
                    JudasManualManager.a a3 = JudasManualManager.a("b_waimai_hjxorlep_mc").a("c_m84bv26");
                    a3.b = AppUtil.generatePageInfoKey(view);
                    a3.a("session_id", Statistics.getSession()).a();
                }
            }
        };
        this.guideDialog.show();
        JudasManualManager.a a3 = JudasManualManager.b("b_waimai_hjxorlep_mv").a("c_m84bv26");
        a3.b = AppUtil.generatePageInfoKey(view);
        a3.a("session_id", Statistics.getSession()).a();
    }

    private float[] getViewCenterLocationInScreen(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eb3ecd160059b8ad3aebcc5e94f627d", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eb3ecd160059b8ad3aebcc5e94f627d");
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{iArr[0] + (view.getWidth() / 2.0f), iArr[1] + (view.getHeight() / 2.0f)};
    }
}
