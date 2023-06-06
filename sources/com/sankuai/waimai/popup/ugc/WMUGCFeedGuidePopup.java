package com.sankuai.waimai.popup.ugc;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import com.sankuai.waimai.popup.WMSkyFallPopup;
import com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMUGCFeedGuidePopup extends WMBasePopup {
    private static final int TAB_ID_EAT_WHAT = 7;
    private static final int TAB_ID_PICK_ME = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private UGCFeedGuideFullScreenDialog guideDialog;
    private boolean isNewDialog;
    private boolean isNewUser;
    private long userId;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        View i();

        boolean j();

        CountDownLatch k();

        int l();
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
    public void preparePopupData(final WMBasePopup.b bVar, final b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16d1742f4bab179e46c0fe1d08428d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16d1742f4bab179e46c0fe1d08428d7");
            return;
        }
        final Activity activity = getContext().a.get();
        if (!f.a(activity) && (activity instanceof a)) {
            a aVar = (a) activity;
            if (aVar.j()) {
                if (WMSkyFallPopup.skyFallCouponResponseCache == null) {
                    interfaceC1075b.a(false, bVar);
                    return;
                }
                final CountDownLatch k = aVar.k();
                if (k == null || k.getCount() == 0) {
                    interfaceC1075b.a(true, bVar);
                    return;
                } else {
                    c.a("WMUGCFeedGuidePopup").execute(new Runnable() { // from class: com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cad09e4c1dc7b122901b149d109faa3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cad09e4c1dc7b122901b149d109faa3");
                                return;
                            }
                            try {
                                if (!f.a(activity)) {
                                    if (k.getCount() != 0) {
                                        k.await();
                                    }
                                    a(true);
                                    return;
                                }
                                a(false);
                            } catch (InterruptedException e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                                a(false);
                            }
                        }

                        private void a(final boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23f8ad95a698a5ce2b6f5eb34fd4066f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23f8ad95a698a5ce2b6f5eb34fd4066f");
                            } else {
                                ((Activity) activity).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7e99f077e48251f9669a5ca5e60856af", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7e99f077e48251f9669a5ca5e60856af");
                                        } else {
                                            interfaceC1075b.a(z, bVar);
                                        }
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
            }
        }
        interfaceC1075b.a(false, bVar);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7f71bcc81eded60948b0bebd3bd2e4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7f71bcc81eded60948b0bebd3bd2e4f");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c71528bacb00d50adfa062c891987c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c71528bacb00d50adfa062c891987c1");
            return;
        }
        Activity activity = getContext().a.get();
        if (!f.a(activity) && (activity instanceof a)) {
            a aVar2 = (a) activity;
            if (aVar2.j()) {
                if (!UserCenter.getInstance(activity).isLogin()) {
                    aVar.a(true);
                    return;
                }
                View i = aVar2.i();
                if (i == null || i.getVisibility() != 0 || !i.isAttachedToWindow()) {
                    aVar.a(true);
                    return;
                }
                com.sankuai.waimai.business.page.home.model.c cVar = com.sankuai.waimai.business.page.homepage.bubble.b.a().b;
                if (cVar == null) {
                    aVar.a(true);
                    return;
                }
                this.isNewUser = cVar.g;
                this.userId = UserCenter.getInstance(activity).getUserId();
                boolean shouldShowGuide = shouldShowGuide(activity, this.isNewUser, this.userId, cVar.j);
                if (shouldShowGuide && cVar.j == 8 && ((this.isNewUser && TextUtils.isEmpty(cVar.c)) || (!this.isNewUser && TextUtils.isEmpty(cVar.f)))) {
                    shouldShowGuide = false;
                }
                if (!shouldShowGuide) {
                    aVar.a(true);
                    return;
                }
                showUGCFeedTabGuide(activity, i, cVar, aVar);
                recordShowTimes(activity, this.isNewUser, this.userId, cVar.j);
                return;
            }
        }
        aVar.a(true);
    }

    private boolean shouldShowGuide(Context context, boolean z, long j, int i) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c3041a17ea819172f7477e29ce1f31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c3041a17ea819172f7477e29ce1f31")).booleanValue();
        }
        int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, getSPKey(z, j, i), 0);
        return z ? b <= 0 : b < 3 && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, getSPKeyWithDate(false, j), 0) <= 0;
    }

    private void recordShowTimes(Context context, boolean z, long j, int i) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "440174fa269acb1dd60c89e6aad74e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "440174fa269acb1dd60c89e6aad74e8b");
            return;
        }
        recordTotalShowTimes(context, z, j, i);
        if (z) {
            recordForNeverShow(context, false, j, i);
        } else {
            recordDayShowTimes(context, false, j);
        }
    }

    private void recordDayShowTimes(Context context, boolean z, long j) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36deb0dbe55dcb92006aa837926c33a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36deb0dbe55dcb92006aa837926c33a0");
            return;
        }
        String sPKeyWithDate = getSPKeyWithDate(z, j);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, sPKeyWithDate, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, sPKeyWithDate, 0) + 1);
    }

    private void recordTotalShowTimes(Context context, boolean z, long j, int i) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2405560795d25b26f392e53432d3ab38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2405560795d25b26f392e53432d3ab38");
            return;
        }
        String sPKey = getSPKey(z, j, i);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, sPKey, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, sPKey, 0) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordForNeverShow(Context context, boolean z, long j, int i) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd994939768e782fdc98c64b678789f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd994939768e782fdc98c64b678789f");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, getSPKey(z, j, i), 3);
        }
    }

    private String getSPKey(boolean z, long j, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0230f6cd05646f22302213a53323d0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0230f6cd05646f22302213a53323d0b");
        }
        if (i == 7 || i == 0) {
            return "UGCFeedGuide_" + z + CommonConstant.Symbol.UNDERLINE + j;
        }
        return "UGCFeedGuide_" + i + CommonConstant.Symbol.UNDERLINE + z + CommonConstant.Symbol.UNDERLINE + j;
    }

    private String getSPKeyWithDate(boolean z, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bb8db99ff3f629edc169738f7f755db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bb8db99ff3f629edc169738f7f755db");
        }
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        return "UGCFeedGuide_" + z + CommonConstant.Symbol.UNDERLINE + j + CommonConstant.Symbol.UNDERLINE + format;
    }

    private void showUGCFeedTabGuide(final Activity activity, final View view, @NonNull com.sankuai.waimai.business.page.home.model.c cVar, final b.a aVar) {
        int dimensionPixelOffset;
        Object[] objArr = {activity, view, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7003fc2ba3725b004e198a6a68f14363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7003fc2ba3725b004e198a6a68f14363");
            return;
        }
        float[] viewCenterLocationInScreen = getViewCenterLocationInScreen(view);
        int d = g.d(activity);
        int l = ((a) activity).l();
        float f = viewCenterLocationInScreen[0];
        float f2 = d - (l * 0.5f);
        if (isNavigationEnable(activity)) {
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "fbee78c3c5f6364e194449737f3c2f16", RobustBitConfig.DEFAULT_VALUE)) {
                dimensionPixelOffset = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "fbee78c3c5f6364e194449737f3c2f16")).intValue();
            } else {
                Resources resources = (activity == null ? com.meituan.android.singleton.b.a : activity).getResources();
                dimensionPixelOffset = resources.getDimensionPixelOffset(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
            }
            f2 -= dimensionPixelOffset;
        }
        float f3 = f2;
        int a2 = g.a(activity, 25.0f);
        int a3 = g.a(activity, 2.0f);
        if (this.guideDialog == null) {
            if (cVar != null && ((cVar.g && TextUtils.isEmpty(cVar.a)) || cVar.j == 8)) {
                this.isNewDialog = true;
                this.guideDialog = new NewUGCFeedGuideFullScreenDialog(activity);
            } else {
                this.guideDialog = new NormalUGCFeedGuideFullScreenDialog(activity);
            }
        }
        if (this.guideDialog.isShowing()) {
            this.guideDialog.dismiss();
        }
        this.guideDialog.a(f, f3, a2, a3, -13236);
        this.guideDialog.a(activity, cVar);
        this.guideDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bda80e28d6cc019d1cd2a8794f6c20bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bda80e28d6cc019d1cd2a8794f6c20bf");
                } else {
                    aVar.a(true);
                }
            }
        });
        final int i = cVar != null ? cVar.j : 7;
        this.guideDialog.a(new UGCFeedGuideFullScreenDialog.a() { // from class: com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog.a
            public final void a(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9414eeefaa704674e32a04954a4d2e0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9414eeefaa704674e32a04954a4d2e0f");
                    return;
                }
                WMUGCFeedGuidePopup.this.recordForNeverShow(activity, WMUGCFeedGuidePopup.this.isNewUser, WMUGCFeedGuidePopup.this.userId, i);
                view.performClick();
                if (WMUGCFeedGuidePopup.this.isNewUser || i == 8) {
                    JudasManualManager.a("b_waimai_xu3p5igl_mc", "c_m84bv26", AppUtil.generatePageInfoKey(view)).a("style", WMUGCFeedGuidePopup.this.isNewDialog ? "pure_pic" : "title_pic").a("index", z ? "tab" : "pop").a("source_id", i == 8 ? "PickMe" : "EatWhat").a();
                }
            }
        });
        this.guideDialog.show();
        if (this.isNewUser || i == 8) {
            JudasManualManager.b("b_waimai_xu3p5igl_mv", "c_m84bv26", AppUtil.generatePageInfoKey(view)).a("style", this.isNewDialog ? "pure_pic" : "title_pic").a("source_id", i == 8 ? "PickMe" : "EatWhat").a();
        }
    }

    public static boolean isNavigationEnable(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b55ba2c6e36d12af601fd7ca507da3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b55ba2c6e36d12af601fd7ca507da3f")).booleanValue();
        }
        Window window = activity.getWindow();
        Display defaultDisplay = activity.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        View decorView = window.getDecorView();
        if (2 == activity.getResources().getConfiguration().orientation) {
            if (point.x != decorView.findViewById(16908290).getWidth()) {
                return true;
            }
        } else {
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            if (rect.bottom != point.y) {
                return true;
            }
        }
        return false;
    }

    private float[] getViewCenterLocationInScreen(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e93b2cbfd8d886ced207665f5ac60340", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e93b2cbfd8d886ced207665f5ac60340");
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{iArr[0] + (view.getWidth() / 2.0f), iArr[1] + (view.getHeight() / 2.0f)};
    }
}
