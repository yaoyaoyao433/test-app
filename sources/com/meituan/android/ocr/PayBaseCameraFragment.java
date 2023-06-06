package com.meituan.android.ocr;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.indentifycard.CardNoOcr;
import com.meituan.android.indentifycard.ExtractBankCard;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.t;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayBaseCameraFragment extends PayBaseFragment implements com.meituan.android.privacy.interfaces.g {
    public static ChangeQuickRedirect a;
    private int A;
    private String B;
    private int C;
    private int D;
    private int E;
    private float F;
    private Camera.PreviewCallback G;
    private Camera.AutoFocusCallback H;
    protected Button b;
    protected Camera c;
    protected FrameLayout d;
    c e;
    protected a f;
    @MTPayNeedToPersist
    protected Bitmap g;
    private ScheduledFuture h;
    private ExtractBankCard i;
    private CardNoOcr j;
    private long k;
    private Bitmap l;
    private boolean m;
    private int n;
    private boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private Dialog v;
    private boolean z;

    public static /* synthetic */ void a(boolean z, Camera camera) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04fbb779f1b655284802a9d85bc5bd86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04fbb779f1b655284802a9d85bc5bd86");
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_pay_4m1xoj7c";
    }

    public PayBaseCameraFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54614b7a879031e535764c2fe133f9ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54614b7a879031e535764c2fe133f9ce");
            return;
        }
        this.c = null;
        this.i = null;
        this.j = null;
        this.l = null;
        this.m = false;
        this.n = 0;
        this.o = true;
        this.z = true;
        this.A = 0;
        this.B = "jf-bb8c0f4ba6998341";
        this.C = -999;
        this.D = -999;
        this.E = -999;
        this.F = 0.5625f;
        this.G = new Camera.PreviewCallback() { // from class: com.meituan.android.ocr.PayBaseCameraFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                Camera.Size size;
                int[] iArr;
                boolean z;
                String str;
                Object[] objArr2 = {bArr, camera};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "847a9f290eda841ac90be46750e2528f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "847a9f290eda841ac90be46750e2528f");
                    return;
                }
                try {
                    size = camera.getParameters().getPreviewSize();
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseCameraFragment_onPreviewFrame", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", -9753);
                    new StringBuilder("onPreviewFrame: ").append(e.getMessage());
                    size = null;
                }
                if (size == null) {
                    return;
                }
                int i = size.width;
                int i2 = size.height;
                if (bArr.length != ((i * i2) * 3) / 2) {
                    return;
                }
                PayBaseCameraFragment payBaseCameraFragment = PayBaseCameraFragment.this;
                Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = PayBaseCameraFragment.a;
                if (PatchProxy.isSupport(objArr3, payBaseCameraFragment, changeQuickRedirect3, false, "9be8a57fd9b70621a69ff8074f6870dc", RobustBitConfig.DEFAULT_VALUE)) {
                    iArr = (int[]) PatchProxy.accessDispatch(objArr3, payBaseCameraFragment, changeQuickRedirect3, false, "9be8a57fd9b70621a69ff8074f6870dc");
                } else {
                    double d = i2;
                    iArr = new int[]{i2, i, 0, (int) (((i / 2) - ((0.45d * d) / 1.5851851d)) - (0.075d * d)), i2, (int) (((0.9d * d) / 1.5851851d) + (d * 0.15d))};
                }
                int isClearSafety = PayBaseCameraFragment.this.i.isClearSafety(bArr, iArr);
                if (isClearSafety != PayBaseCameraFragment.this.C) {
                    PayBaseCameraFragment.this.C = isClearSafety;
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_gu5wm0r0_mv", new a.c().a("clearCode", Integer.valueOf(PayBaseCameraFragment.this.C)).b);
                }
                new StringBuilder("onPreviewFrame: isClearSafety ").append(PayBaseCameraFragment.this.i.isClearSafety(bArr, iArr));
                if (isClearSafety < 0) {
                    return;
                }
                int[] iArr2 = new int[23];
                int[] iArr3 = new int[23];
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[115560];
                int[] iArr6 = new int[115560];
                int extractBankCardSafety = PayBaseCameraFragment.this.i.extractBankCardSafety(bArr, iArr5, iArr);
                if (extractBankCardSafety != 1) {
                    if (PayBaseCameraFragment.this.D != extractBankCardSafety) {
                        PayBaseCameraFragment.this.D = extractBankCardSafety;
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_gu5wm0r0_mv", new a.c().a("extractBankCardCode", Integer.valueOf(extractBankCardSafety)).b);
                    }
                    z = false;
                } else {
                    PayBaseCameraFragment.c(PayBaseCameraFragment.this);
                    if (PayBaseCameraFragment.this.z) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_169lzgoe_mv", "识别卡边缘", new a.c().a("is_card_edge_suc", 1).a("card_edge_num", 0).b, a.EnumC0329a.VIEW, -1);
                        PayBaseCameraFragment.this.z = false;
                        if (PayBaseCameraFragment.this.o) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_gu5wm0r0_mv", new a.c().a("type", "cdn").a("version", PayBaseCameraFragment.this.p).b);
                        } else {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_gu5wm0r0_mv", new a.c().a("type", "native").a("version", "1.0.0").b);
                        }
                    }
                    z = true;
                }
                System.arraycopy(iArr5, 0, iArr6, 0, 115560);
                if (z) {
                    boolean unused = PayBaseCameraFragment.this.o;
                    int cardOcrSafety = PayBaseCameraFragment.this.j.cardOcrSafety(428, 270, iArr5, iArr2, iArr3, iArr4);
                    PayBaseCameraFragment.i(PayBaseCameraFragment.this);
                    int legalImageSafety = PayBaseCameraFragment.this.i.getLegalImageSafety(428, 270, iArr6, iArr4[1]);
                    if (PayBaseCameraFragment.this.E != legalImageSafety) {
                        PayBaseCameraFragment.this.E = legalImageSafety;
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_gu5wm0r0_mv", new a.c().a("legalImageCode", Integer.valueOf(PayBaseCameraFragment.this.E)).b);
                    }
                    PayBaseCameraFragment.this.l = Bitmap.createBitmap(iArr6, 428, 270, Bitmap.Config.ARGB_8888);
                    if (cardOcrSafety > 0) {
                        StringBuilder sb = new StringBuilder();
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < cardOcrSafety) {
                            if (iArr3[i4] == 0) {
                                i4++;
                                sb.append(StringUtil.SPACE);
                            }
                            sb.append(iArr2[i3]);
                            i3++;
                            i4++;
                        }
                        str = sb.toString();
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_169lzgoe_mv", "识别卡边缘", new a.c().a("is_card_edge_suc", 1).a("card_edge_num", Integer.valueOf(PayBaseCameraFragment.this.A)).b, a.EnumC0329a.VIEW, -1);
                        PayBaseCameraFragment.d(PayBaseCameraFragment.this, 0);
                        PayBaseCameraFragment.this.z = true;
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str) || PayBaseCameraFragment.this.m) {
                        return;
                    }
                    PayBaseCameraFragment.b(PayBaseCameraFragment.this, true);
                    Bitmap createBitmap = Bitmap.createBitmap(428, iArr4[1] - iArr4[0], Bitmap.Config.ARGB_8888);
                    createBitmap.setPixels(iArr6, iArr4[0] * 428, 428, 0, 0, 428, iArr4[1] - iArr4[0]);
                    if (PayBaseCameraFragment.this.o) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_wthzwuvp_mv", new a.c().a("type", "cdn").a("version", PayBaseCameraFragment.this.p).b);
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_wthzwuvp_mv", new a.c().a("type", "native").a("version", "1.0.0").b);
                    }
                    t.a(PayBaseCameraFragment.this.getString(R.string.cardocr__mge_cid_scan_card), PayBaseCameraFragment.this.getString(R.string.cardocr__mge_act_got_result));
                    t.a(PayBaseCameraFragment.this.getString(R.string.cardocr__mge_cid_scan_card), String.valueOf(PayBaseCameraFragment.this.n));
                    PayBaseCameraFragment payBaseCameraFragment2 = PayBaseCameraFragment.this;
                    Object[] objArr4 = {str, createBitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = PayBaseCameraFragment.a;
                    if (PatchProxy.isSupport(objArr4, payBaseCameraFragment2, changeQuickRedirect4, false, "b586eec430c3af8d7887a471df0fab53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, payBaseCameraFragment2, changeQuickRedirect4, false, "b586eec430c3af8d7887a471df0fab53");
                    } else if (payBaseCameraFragment2.e != null) {
                        payBaseCameraFragment2.e.a(str, createBitmap);
                    }
                    PayBaseCameraFragment.a(PayBaseCameraFragment.this, bArr, size);
                }
            }
        };
        this.H = d.a();
    }

    public static /* synthetic */ void a(PayBaseCameraFragment payBaseCameraFragment, byte[] bArr, Camera.Size size) {
        Object[] objArr = {bArr, size};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, payBaseCameraFragment, changeQuickRedirect, false, "bfabd678c6dfe41a84a13c146a00a2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, payBaseCameraFragment, changeQuickRedirect, false, "bfabd678c6dfe41a84a13c146a00a2b7");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), e.a(payBaseCameraFragment, bArr, size));
        }
    }

    public static /* synthetic */ boolean b(PayBaseCameraFragment payBaseCameraFragment, boolean z) {
        payBaseCameraFragment.m = true;
        return true;
    }

    public static /* synthetic */ int c(PayBaseCameraFragment payBaseCameraFragment) {
        int i = payBaseCameraFragment.A;
        payBaseCameraFragment.A = i + 1;
        return i;
    }

    public static /* synthetic */ int d(PayBaseCameraFragment payBaseCameraFragment, int i) {
        payBaseCameraFragment.A = 0;
        return 0;
    }

    public static /* synthetic */ int i(PayBaseCameraFragment payBaseCameraFragment) {
        int i = payBaseCameraFragment.n;
        payBaseCameraFragment.n = i + 1;
        return i;
    }

    public static PayBaseCameraFragment a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be5042a62fb33cc7147c9497d2c597c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayBaseCameraFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be5042a62fb33cc7147c9497d2c597c1");
        }
        PayBaseCameraFragment payBaseCameraFragment = new PayBaseCameraFragment();
        Bundle bundle = new Bundle();
        bundle.putString("pay_token", str);
        bundle.putString("trans_id", str2);
        bundle.putString("userid", str3);
        bundle.putString("business_platform", str4);
        bundle.putString("report_params", str5);
        payBaseCameraFragment.setArguments(bundle);
        return payBaseCameraFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ceddc4699f3503fefb6aba557e0fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ceddc4699f3503fefb6aba557e0fb5");
            return;
        }
        super.onAttach(activity);
        if (activity instanceof c) {
            this.e = (c) activity;
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18947f9bc4d8d39a16e9deaf9516dba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18947f9bc4d8d39a16e9deaf9516dba7");
            return;
        }
        super.onCreate(bundle);
        t.a(getString(R.string.cardocr__mge_cid_scan_card), getString(R.string.cardocr__mge_act_start_scan), getString(R.string.cardocr__mge_lab_start_acan));
        this.k = System.currentTimeMillis();
        if (getArguments() != null) {
            this.q = getArguments().getString("pay_token");
            this.r = getArguments().getString("trans_id");
            this.s = getArguments().getString("userid");
            this.t = getArguments().getString("business_platform");
            this.u = getArguments().getString("report_params");
        }
        this.i = new ExtractBankCard();
        this.j = new CardNoOcr();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28807abe3d91f9ecb2d08a05c249f99f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28807abe3d91f9ecb2d08a05c249f99f");
        }
        View inflate = layoutInflater.inflate(R.layout.cardocr_camera_fragment, viewGroup, false);
        this.b = (Button) inflate.findViewById(R.id.btn_flicker);
        Button button = (Button) inflate.findViewById(R.id.btn_back);
        this.d = (FrameLayout) inflate.findViewById(R.id.surface_container);
        if (getActivity() != null && getActivity().getPackageManager() != null && getActivity().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            this.b.setOnClickListener(g.a(this));
        } else {
            this.b.setVisibility(8);
        }
        button.setOnClickListener(h.a(this));
        return inflate;
    }

    public final /* synthetic */ void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7f1376a6ec3d1ea4931e6a2d41eaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7f1376a6ec3d1ea4931e6a2d41eaee");
        } else if (this.c != null) {
            try {
                Camera.Parameters parameters = this.c.getParameters();
                if (parameters.getFlashMode().equals("torch")) {
                    parameters.setFlashMode("off");
                    this.b.setBackgroundResource(R.drawable.cardocr_flicker_pressed);
                } else {
                    parameters.setFlashMode("torch");
                    this.b.setBackgroundResource(R.drawable.cardocr_flicker_normal);
                }
                this.c.setParameters(parameters);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseCameraFragment_onCreateView", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("startBankcardOcrError", getString(R.string.cardocr__start_bankcard_ocr_error));
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", -9753);
            }
        }
    }

    public final /* synthetic */ void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b9970b98b75b7c895355ed3ca83777c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b9970b98b75b7c895355ed3ca83777c");
        } else {
            h();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bac30240df8eba267218c210fe0c9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bac30240df8eba267218c210fe0c9f8");
            return;
        }
        super.onStart();
        k();
        com.meituan.android.paybase.common.analyse.a.a("b_jnbDw", "MTCCameraActivity", "POP", (Map<String, Object>) null, (String) null);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61db4b7382692ade793b97188b7850cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61db4b7382692ade793b97188b7850cb");
            return;
        }
        super.onResume();
        if (this.j != null) {
            this.j.ocrInitSafety();
        }
        f();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9eef4c8bd10fdd1f2df1064ac715c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9eef4c8bd10fdd1f2df1064ac715c2e");
            return;
        }
        j();
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fc94cd26076ff47a0abe62b23ffe19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fc94cd26076ff47a0abe62b23ffe19");
            return;
        }
        super.onStop();
        com.meituan.android.paybase.common.analyse.a.a("b_r3Uej", "MTCCameraActivity", "CLOSE", (Map<String, Object>) null, (String) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c1e21d13326bef462c19640f0508dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c1e21d13326bef462c19640f0508dc");
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87abdda0528b2e516fafcd709455caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87abdda0528b2e516fafcd709455caf");
            return;
        }
        j();
        if (this.o) {
            this.j.ocrUninitSafety();
        }
        if (this.v != null) {
            this.v.dismiss();
            this.v = null;
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08eddb608ce13388275d1f9350fc5b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08eddb608ce13388275d1f9350fc5b83");
        } else {
            super.onDetach();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76379e64eb42621c62e4550263421bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76379e64eb42621c62e4550263421bce");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_ohbk3sjc", (Map<String, Object>) null);
        BasePayDialog.b c = new BasePayDialog.b(getActivity()).c(getString(R.string.cardocr__camera_without_permission));
        String string = getString(R.string.paybase__ok);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        c.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7d9195c68a459973e4635475e210f4e3", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7d9195c68a459973e4635475e210f4e3") : new i(this)).a().show();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44cb067c62365560cf2b86b2da6a3930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44cb067c62365560cf2b86b2da6a3930");
            return;
        }
        g();
        this.n = 0;
        this.m = false;
        this.h = com.sankuai.android.jarvis.c.c("bankcard-recognizer-PayBaseCameraFragment").scheduleAtFixedRate(l.a(this), 0L, 1800L, TimeUnit.MILLISECONDS);
        try {
            if (this.c == null || this.c.getParameters() == null || !TextUtils.isEmpty(this.c.getParameters().getFlashMode())) {
                return;
            }
            this.b.setVisibility(8);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseCameraFragment_cameraOnResume", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", -9753);
            new StringBuilder("cameraOnResume: ").append(e.getMessage());
        }
    }

    public final /* synthetic */ void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d64f9ff889f549dca367609d16ab6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d64f9ff889f549dca367609d16ab6bf");
        } else if (this.c != null) {
            try {
                this.c.cancelAutoFocus();
                this.c.autoFocus(this.H);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CameraTimerTask_run").a("message", e.getMessage()).b);
                new StringBuilder("run: ").append(e.getMessage());
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0396c6d4e6494edf961e311eed6913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0396c6d4e6494edf961e311eed6913");
        } else if (Privacy.createPermissionGuard() != null && Privacy.createPermissionGuard().a(getActivity(), PermissionGuard.PERMISSION_CAMERA, this.B) > 0) {
            t.a(getString(R.string.cardocr__mge_cid_scan_card), getString(R.string.cardocr__mge_act_open_camera));
            try {
                this.c = Camera.open();
                Camera.Parameters parameters = this.c.getParameters();
                Camera.Size a2 = a(parameters.getSupportedPreviewSizes(), getActivity().getWindowManager().getDefaultDisplay());
                parameters.setPreviewSize(a2.width, a2.height);
                parameters.setFocusMode(FpsEvent.TYPE_SCROLL_AUTO);
                parameters.setJpegQuality(100);
                Camera.Size a3 = a(parameters.getSupportedPictureSizes(), a2.width / a2.height);
                parameters.setPictureSize(a3.width, a3.height);
                this.c.setParameters(parameters);
                this.c.setDisplayOrientation(90);
                this.c.setPreviewCallback(this.G);
                this.c.startPreview();
                i();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", 200);
            } catch (Exception e) {
                c();
                com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseCameraFragment_openCamera", (Map<String, Object>) null);
                t.a(getString(R.string.cardocr__mge_cid_scan_card), getString(R.string.cardocr__mge_act_fail_open_camera));
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", 1170002);
                new StringBuilder("openCamera: ").append(e.getMessage());
            }
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_bankcard_ocr", 1170002);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7d36b97a34a588f82dde79c64f8db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7d36b97a34a588f82dde79c64f8db1");
            return;
        }
        this.d.removeAllViews();
        this.f = new a(getContext(), this.c, 0.0f, this.F);
        this.d.addView(this.f);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a8facaf1617c645f157e72082892bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a8facaf1617c645f157e72082892bb");
        } else if (this.c != null) {
            if (this.h != null) {
                this.h.cancel(true);
                this.h = null;
            }
            try {
                this.c.setPreviewCallback(null);
                this.c.stopPreview();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseCameraFragment_closeCamera", (Map<String, Object>) null);
                new StringBuilder("closeCamera: ").append(e.getMessage());
            }
            if (this.b.getVisibility() == 0) {
                this.b.setBackgroundResource(R.drawable.cardocr_flicker_pressed);
            }
            this.c.release();
            this.c = null;
        }
    }

    public final /* synthetic */ void a(byte[] bArr, Camera.Size size) {
        Object[] objArr = {bArr, size};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31913334bf8503fbe71de361cb262e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31913334bf8503fbe71de361cb262e79");
            return;
        }
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, size.width, size.height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, size.width, size.height), 80, byteArrayOutputStream);
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f);
            this.g = Bitmap.createBitmap(a2, 0, 0, a2.getWidth(), a2.getHeight(), matrix, true);
            byteArrayOutputStream.close();
            if (this.g != null) {
                this.g = b.a(this.g, 0.08f, 1);
            }
            getActivity().runOnUiThread(f.a(this));
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PayBaseCameraFragment_getLastFrameBitmap").a("message", e.getMessage()).b);
            new StringBuilder("getLastFrameBitmap: ").append(e.getMessage());
        }
    }

    private Camera.Size a(List<Camera.Size> list, Display display) {
        Object[] objArr = {list, display};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7b68981d0d87201510f0c8c75bd2c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7b68981d0d87201510f0c8c75bd2c6");
        }
        Camera.Size size = null;
        int i = Integer.MAX_VALUE;
        if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
            for (Camera.Size size2 : list) {
                int abs = Math.abs(size2.width - display.getHeight()) + Math.abs(size2.height - display.getWidth());
                if (abs == 0) {
                    return size2;
                }
                if (abs < i) {
                    size = size2;
                    i = abs;
                }
            }
        }
        if (size != null) {
            this.F = size.height / size.width;
        }
        return size;
    }

    private Camera.Size a(List<Camera.Size> list, float f) {
        Object[] objArr = {list, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2152e9db0f604f41689dd8ee82e6ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2152e9db0f604f41689dd8ee82e6ca");
        }
        Camera.Size size = null;
        float f2 = Float.MAX_VALUE;
        if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
            for (Camera.Size size2 : list) {
                if (Math.abs((size2.width / size2.height) - f) <= f2) {
                    f2 = Math.abs((size2.width / size2.height) - f);
                    size = size2;
                }
            }
        }
        return size;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effcdc7db6a635ea47ee0f130009c2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effcdc7db6a635ea47ee0f130009c2e9");
        } else if (Privacy.createPermissionGuard() != null && Privacy.createPermissionGuard().a(getActivity(), PermissionGuard.PERMISSION_CAMERA, this.B) <= 0) {
            Privacy.createPermissionGuard().a((Activity) getActivity(), PermissionGuard.PERMISSION_CAMERA, this.B, (com.meituan.android.privacy.interfaces.d) this);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acbbc20799ab06f0d790b51f69344793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acbbc20799ab06f0d790b51f69344793");
        } else if (isDetached() || isRemoving()) {
        } else {
            StringBuilder sb = new StringBuilder("onRequestPermissionsResult: retCode ");
            sb.append(i);
            sb.append(" permissionsID: ");
            sb.append(str);
            if (PermissionGuard.PERMISSION_CAMERA.equals(str)) {
                if (i > 0) {
                    f();
                } else if (i == -4) {
                    String string = getString(R.string.cardocr__permission_camera_message);
                    Object[] objArr2 = {string, 11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef98f42e3841af14f7a474a482a6ccf9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef98f42e3841af14f7a474a482a6ccf9");
                        return;
                    }
                    if (this.v == null) {
                        BasePayDialog.b c = new PayDialog.a(getActivity()).c(string);
                        String string2 = getActivity().getString(R.string.paybase__permission_btn_cancel);
                        Object[] objArr3 = {this};
                        ChangeQuickRedirect changeQuickRedirect3 = j.a;
                        BasePayDialog.b a2 = c.a(string2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "08d1b0f39c57b23c4fcd0acc25d84642", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "08d1b0f39c57b23c4fcd0acc25d84642") : new j(this));
                        String string3 = getActivity().getString(R.string.paybase__permission_btn_ok);
                        Object[] objArr4 = {this, 11};
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        this.v = a2.b(string3, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b12fd1cb69e00ffc88b540e40bdcdb15", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b12fd1cb69e00ffc88b540e40bdcdb15") : new k(this, 11)).a();
                    }
                    if (this.v.isShowing() || getActivity().isFinishing()) {
                        return;
                    }
                    this.v.show();
                } else {
                    c();
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114ff454791841fec6c4091b9fdddc61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114ff454791841fec6c4091b9fdddc61");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 11) {
            k();
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b920224ac6db410de17edbafb7e3703", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b920224ac6db410de17edbafb7e3703")).booleanValue();
        }
        t.a(getString(R.string.cardocr__mge_cid_scan_card), getString(R.string.cardocr__mge_act_on_back_press), getString(R.string.cardocr__mge_lab_stay_time, Long.valueOf((System.currentTimeMillis() - this.k) / 1000)));
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_recognise_bankcard_ocr", this.m ? 200 : -9854);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_2xw0m6zi_mc", "点击返回", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
        if (getActivity() != null) {
            getActivity().finish();
            return true;
        }
        return super.h();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4522ff48899dcdb0e1a4c016d8fb2053", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4522ff48899dcdb0e1a4c016d8fb2053");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Privacy.createPermissionGuard() != null && Privacy.createPermissionGuard().a(getActivity(), PermissionGuard.PERMISSION_CAMERA, this.B) > 0) {
            hashMap.put("IS_LIMIT", "TRUE");
        } else {
            hashMap.put("IS_LIMIT", "FALSE");
        }
        if (!TextUtils.isEmpty(this.t)) {
            hashMap.put("report_params", this.u);
        }
        return hashMap;
    }
}
