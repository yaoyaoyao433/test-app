package com.meituan.android.cashier.oneclick.hybrid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.dianping.networklog.c;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.v2.container.NeoBaseFragment;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickNeoFragmentV2 extends NeoBaseFragment {
    public static ChangeQuickRedirect a;
    private String e;

    public OneClickNeoFragmentV2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91ee56dfb5ae5a9e00591be69891bed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91ee56dfb5ae5a9e00591be69891bed");
        } else {
            this.e = KernelConfig.KERNEL_TYPE_RECCE;
        }
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        boolean a2;
        String kernelType;
        KernelConfig kernelConfig;
        Intent intent;
        Uri data;
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2328a17706735a749a53bd33ee010d3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2328a17706735a749a53bd33ee010d3b")).booleanValue();
        }
        super.a(neoConfig);
        HashMap hashMap = new HashMap();
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("tradeno");
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, queryParameter);
            }
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.c, hashMap);
        if (neoConfig == null) {
            a("neo config error");
            return false;
        }
        long d = a.b() ? a.d() : 12000L;
        neoConfig.loadingConfig().setLoadingEnabled(true);
        neoConfig.loadingConfig().setLoadingLayoutId(R.layout.cashieroneclick__fragment);
        neoConfig.loadingConfig().setLoadingDuration(d);
        neoConfig.downgradeConfig().setLoadingTimeout(true);
        neoConfig.uiConfig().setModal(true);
        if (a.c()) {
            neoConfig.downgradeConfig().setNoResponseTime(a.e());
        }
        neoConfig.setNeoRequestBridge(true);
        neoConfig.setNeoBridge(true);
        if (TextUtils.equals(this.c.f().kernelConfig().getKernelType(), KernelConfig.KERNEL_TYPE_RECCE)) {
            a2 = g.a(neoConfig.getUrl());
        } else {
            a2 = com.meituan.android.neohybrid.neo.offline.b.a(neoConfig.getUrl());
        }
        com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclickpay_offline_status_sc", com.meituan.android.neohybrid.neo.report.a.c("exist_offline_package", neoConfig.getUrl()).a("is_offline", a2 ? "1" : "0").b);
        q.a("cashier_oneclickpaydispatcher_start", b());
        Object[] objArr2 = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b2bffa27739fb699de33c4248504095", RobustBitConfig.DEFAULT_VALUE)) {
            kernelType = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b2bffa27739fb699de33c4248504095");
        } else {
            kernelType = (neoConfig == null || (kernelConfig = neoConfig.kernelConfig()) == null) ? KernelConfig.KERNEL_TYPE_RECCE : kernelConfig.getKernelType();
        }
        this.e = kernelType;
        return false;
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5045714510a1da62bdda875d37f83481", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5045714510a1da62bdda875d37f83481");
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64f9e1473bbde270ccb105f43b5081a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64f9e1473bbde270ccb105f43b5081a");
            return;
        }
        super.a(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.cashier_lottie_view);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setAnimation("oneclickpay_loading.json");
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.b(true);
        lottieAnimationView.a();
        ((TextView) view.findViewById(R.id.cashier_tv_toast_info)).setText(getActivity().getText(R.string.cashieroneclick__toast_default_content));
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ef66ab2f6354ea14dc3bf7c493a278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ef66ab2f6354ea14dc3bf7c493a278");
            return;
        }
        super.a(view, z, z2);
        view.setVisibility(8);
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750b006dad9c06cd82cdcf9c7223b460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750b006dad9c06cd82cdcf9c7223b460");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361626c298a02729e9a3a0a521c356c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361626c298a02729e9a3a0a521c356c8")).booleanValue();
        }
        com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 10).a("message", str).b);
        q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 10).a("message", str).b, b());
        com.meituan.android.cashier.oneclick.util.b.c(1100031);
        if (TextUtils.equals(this.e, KernelConfig.KERNEL_TYPE_RECCE)) {
            com.meituan.android.cashier.oneclick.presenter.a a2 = com.meituan.android.cashier.oneclick.presenter.a.a();
            FragmentActivity activity = getActivity();
            a2.a(activity, "recce_" + str);
        } else {
            com.meituan.android.cashier.oneclick.presenter.a.a().a(getActivity(), str);
        }
        return true;
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1f3423e7ece10b4efb8016361a19cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1f3423e7ece10b4efb8016361a19cd");
            return;
        }
        super.a(bundle);
        bundle.putString(KernelConfig.KEY_KERNEL_TYPE, this.e);
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503d215f4c316a557f16e0829800651d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503d215f4c316a557f16e0829800651d");
            return;
        }
        super.b(bundle);
        if (bundle == null || !TextUtils.equals(bundle.getString(KernelConfig.KEY_KERNEL_TYPE), KernelConfig.KERNEL_TYPE_RECCE)) {
            return;
        }
        a("rebuild_happen_execute_downgrade");
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        View j;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2720a57ba0589a5523e7ff542aa9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2720a57ba0589a5523e7ff542aa9d9");
            return;
        }
        super.onViewCreated(view, bundle);
        String str = this.e;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6891bccfe8a9f7ced1b43edc997ae9af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6891bccfe8a9f7ced1b43edc997ae9af");
        } else if (TextUtils.equals(KernelConfig.KERNEL_TYPE_RECCE, str)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e08ce43277e443e5a685c6d5491d939b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e08ce43277e443e5a685c6d5491d939b");
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.webview_container);
                relativeLayout.setBackgroundResource(R.color.paycommon__bg_dialog);
                relativeLayout.setAlpha(0.0f);
                relativeLayout.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(null);
                if (this.c == null || this.c.b() == null || (j = this.c.b().j()) == null) {
                    return;
                }
                j.startAnimation(AnimationUtils.loadAnimation(g(), R.anim.bottom_in));
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac859a8811dfe41feb53519ba41820f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac859a8811dfe41feb53519ba41820f");
            return;
        }
        super.onStop();
        if (a.n()) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03e87c1787106ecec37e1462e5c483a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03e87c1787106ecec37e1462e5c483a4");
                } else if (getActivity() != null && !getActivity().isFinishing()) {
                    if (getActivity().getWindow() != null && getActivity().getWindow().getDecorView() != null) {
                        View decorView = getActivity().getWindow().getDecorView();
                        if (decorView != null) {
                            int i = 1;
                            decorView.setDrawingCacheEnabled(true);
                            Bitmap drawingCache = decorView.getDrawingCache();
                            String a2 = a(drawingCache);
                            decorView.setDrawingCacheEnabled(false);
                            drawingCache.recycle();
                            c.a("base64 长度是：" + a2.length(), 3, new String[]{"Recce-Android"});
                            int o = a.o() != 0 ? a.o() : 3000;
                            if (a2.length() > o) {
                                int length = a2.length();
                                while (length > 0) {
                                    c.a("base64 第" + i + "部分: " + a2.substring(0, Math.min(length, o)), 3, new String[]{"Recce-Android"});
                                    if (a2.length() > Math.min(length, o)) {
                                        a2 = a2.substring(Math.min(length, o));
                                    }
                                    length -= Math.min(length, o);
                                    i++;
                                }
                                return;
                            }
                            c.a("OneClickNeoFragmentV2 onStop base64 is " + a2, 3, new String[]{"Recce-Android"});
                            return;
                        }
                        c.a("OneClickNeoFragmentV2 onStop containerView is null", 3, new String[]{"Recce-Android"});
                        return;
                    }
                    c.a("OneClickNeoFragmentV2 onStop getActivity().getWindow() is null", 3, new String[]{"Recce-Android"});
                } else {
                    c.a("OneClickNeoFragmentV2 onStop activity is null", 3, new String[]{"Recce-Android"});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83f0405c78427c2aec24fedc3c4c1c44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83f0405c78427c2aec24fedc3c4c1c44");
            return;
        }
        super.onPause();
        c.a("OneClickNeoFragmentV2: onPause", 3, new String[]{"Recce-Android"});
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed1cdfe281482b196bb5c11cf6bb2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed1cdfe281482b196bb5c11cf6bb2cb");
            return;
        }
        super.onResume();
        c.a("OneClickNeoFragmentV2: onResume", 3, new String[]{"Recce-Android"});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: Exception -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0074, blocks: (B:36:0x008b, B:23:0x006d), top: B:38:0x0029 }] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.graphics.Bitmap r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.cashier.oneclick.hybrid.OneClickNeoFragmentV2.a
            java.lang.String r11 = "e4d547aa0478b848932bb07a77e1ef63"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 3
            int r1 = com.meituan.android.cashier.oneclick.hybrid.a.p()
            if (r1 <= 0) goto L29
            int r0 = com.meituan.android.cashier.oneclick.hybrid.a.p()
        L29:
            if (r12 == 0) goto L40
            int r1 = r12.getWidth()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            int r1 = r1 / r0
            int r3 = r12.getHeight()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            int r3 = r3 / r0
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createScaledBitmap(r12, r1, r3, r9)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            goto L41
        L3a:
            r12 = move-exception
            r0 = r2
            goto L7a
        L3d:
            r12 = move-exception
            r0 = r2
            goto L68
        L40:
            r12 = r2
        L41:
            if (r12 == 0) goto L88
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r1.<init>(r0)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r4 = 10
            r12.compress(r3, r4, r1)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r0.flush()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r0.close()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r1.close()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            byte[] r12 = r0.toByteArray()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            java.lang.String r12 = com.meituan.android.paybase.utils.c.a(r12)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L79
            r2 = r12
            goto L89
        L67:
            r12 = move-exception
        L68:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L91
            r0.flush()     // Catch: java.lang.Exception -> L74
            r0.close()     // Catch: java.lang.Exception -> L74
            goto L91
        L74:
            r12 = move-exception
            r12.printStackTrace()
            goto L91
        L79:
            r12 = move-exception
        L7a:
            if (r0 == 0) goto L87
            r0.flush()     // Catch: java.lang.Exception -> L83
            r0.close()     // Catch: java.lang.Exception -> L83
            goto L87
        L83:
            r0 = move-exception
            r0.printStackTrace()
        L87:
            throw r12
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L91
            r0.flush()     // Catch: java.lang.Exception -> L74
            r0.close()     // Catch: java.lang.Exception -> L74
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.oneclick.hybrid.OneClickNeoFragmentV2.a(android.graphics.Bitmap):java.lang.String");
    }
}
