package com.meituan.android.yoda.fragment.face;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.IOUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.facedetection.algo.FaceLivenessDet;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.YodaFaceDetectionResponseListener;
import com.meituan.android.yoda.bean.AESKeys;
import com.meituan.android.yoda.bean.FeLiveType;
import com.meituan.android.yoda.bean.S3Parameter;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.config.verify.a;
import com.meituan.android.yoda.fragment.FaceDetectionFragment;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.FaceDetUtils;
import com.meituan.android.yoda.widget.tool.CameraManager;
import com.meituan.android.yoda.widget.tool.e;
import com.meituan.android.yoda.widget.view.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FaceDetectionSubFragment2 extends Fragment implements TextToSpeech.OnInitListener, CameraManager.IDetection {
    public static ChangeQuickRedirect a;
    private S3Parameter A;
    private AESKeys B;
    private int C;
    private ViewGroup D;
    private int[] E;
    private int F;
    private int G;
    private int H;
    private ExecutorService I;
    private boolean J;
    private CountDownLatch K;
    private FeLiveType L;
    private int M;
    private float N;
    private final long O;
    private final int P;
    private com.meituan.android.yoda.asynchronous.a Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private e.a W;
    private boolean X;
    private com.meituan.android.yoda.asynchronous.b Y;
    private com.meituan.android.yoda.asynchronous.a Z;
    public FaceDetectionFragment b;
    public CameraManager c;
    public Handler d;
    public long e;
    public boolean f;
    public JSONObject g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public CommonDialog.a n;
    public String o;
    public String p;
    public String q;
    public Map<String, Object> r;
    public Map<String, Object> s;
    public String t;
    public TextToSpeech u;
    public boolean v;
    public com.meituan.android.yoda.asynchronous.b w;
    public AtomicInteger x;
    public boolean y;
    private String z;

    public static boolean a(int i) {
        return i == 1 || i == 3;
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "109c35ccce45387bbad33cf36431c133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "109c35ccce45387bbad33cf36431c133");
        } else if (faceDetectionSubFragment2.n != null) {
            faceDetectionSubFragment2.X = true;
            faceDetectionSubFragment2.f = true;
            if (faceDetectionSubFragment2.n.a()) {
                faceDetectionSubFragment2.n.b();
            }
            if (TextUtils.isEmpty(str)) {
                str = com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_over_time_title);
            }
            Context context = faceDetectionSubFragment2.getContext();
            if (context != null) {
                faceDetectionSubFragment2.n.a(context, CommonDialog.b.CONFIRM).a(str, 17.0f).a(8).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_retry), 17, g.a(faceDetectionSubFragment2)).b(faceDetectionSubFragment2.h, 17, h.a(faceDetectionSubFragment2)).a(z ? faceDetectionSubFragment2.b() : null).c();
            }
        }
    }

    public static /* synthetic */ void q(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "1d7a0564331fb48bd901488eb935b3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "1d7a0564331fb48bd901488eb935b3b9");
            return;
        }
        if (faceDetectionSubFragment2.Y == null) {
            faceDetectionSubFragment2.Z = new com.meituan.android.yoda.asynchronous.a() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.asynchronous.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9416a70b138a585b04e86e6a67b4dee8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9416a70b138a585b04e86e6a67b4dee8");
                        return;
                    }
                    com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "postDelayedS3PeriodTimeOutDialog.work, 人脸照片上传失败", true);
                    FaceDetectionSubFragment2.a(FaceDetectionSubFragment2.this, com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_image_upload_error), false);
                    FaceDetectionSubFragment2.this.c.paraList.clear();
                }
            };
            faceDetectionSubFragment2.Y = new com.meituan.android.yoda.asynchronous.b(faceDetectionSubFragment2.Z);
        } else {
            faceDetectionSubFragment2.d.removeCallbacks(faceDetectionSubFragment2.Y);
        }
        faceDetectionSubFragment2.d.postDelayed(faceDetectionSubFragment2.Y, 300000L);
    }

    public static /* synthetic */ void y(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "0062618fa942de04d6ceb8fb6dc82dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, faceDetectionSubFragment2, changeQuickRedirect, false, "0062618fa942de04d6ceb8fb6dc82dc3");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "handleInfoErrorDialogCancelPressed, customerConfigCancelUrl = " + faceDetectionSubFragment2.j + ", cancelActionJumpURL = " + faceDetectionSubFragment2.i, true);
        if (faceDetectionSubFragment2.b != null) {
            if (faceDetectionSubFragment2.b.p != null) {
                faceDetectionSubFragment2.b.k();
            }
            if (faceDetectionSubFragment2.j && !TextUtils.isEmpty(faceDetectionSubFragment2.i)) {
                faceDetectionSubFragment2.b.h(faceDetectionSubFragment2.i);
            } else {
                faceDetectionSubFragment2.b.i();
            }
        }
    }

    public FaceDetectionSubFragment2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25bd2ada3e3b67d4bc90d1c09d46da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25bd2ada3e3b67d4bc90d1c09d46da1");
            return;
        }
        this.z = "";
        this.J = false;
        this.f = false;
        this.j = false;
        this.m = false;
        this.M = 0;
        this.N = 0.0f;
        this.O = 10000L;
        this.P = 1;
        this.r = new HashMap();
        this.s = new HashMap();
        this.v = false;
        this.w = null;
        this.Q = null;
        this.S = 3;
        this.T = 1;
        this.U = 0;
        this.V = 700;
        this.x = new AtomicInteger(0);
        this.W = new e.a() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.widget.tool.e.a
            public final FaceDetectionFragment a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df2d53a5eedbebc16c931f3c1b3d8e8b", RobustBitConfig.DEFAULT_VALUE) ? (FaceDetectionFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df2d53a5eedbebc16c931f3c1b3d8e8b") : FaceDetectionSubFragment2.this.b;
            }

            @Override // com.meituan.android.yoda.widget.tool.e.a
            public final AtomicInteger b() {
                return FaceDetectionSubFragment2.this.x;
            }

            @Override // com.meituan.android.yoda.widget.tool.e.a
            public final Map<String, Object> c() {
                return FaceDetectionSubFragment2.this.r;
            }
        };
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.y = false;
    }

    public static FaceDetectionSubFragment2 a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4bb017d21a59307da55fe8013cf2b91", RobustBitConfig.DEFAULT_VALUE)) {
            return (FaceDetectionSubFragment2) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4bb017d21a59307da55fe8013cf2b91");
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = new FaceDetectionSubFragment2();
        Bundle bundle = new Bundle();
        bundle.putString("param1", str);
        bundle.putString("param2", str2);
        bundle.putString("param3", str3);
        faceDetectionSubFragment2.setArguments(bundle);
        return faceDetectionSubFragment2;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2abe7431ec6c2e588cd497aca41cba0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2abe7431ec6c2e588cd497aca41cba0a");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.o = getArguments().getString("param1");
            this.p = getArguments().getString("param2");
            this.q = getArguments().getString("param3");
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onCreate, requestCode = " + this.o, true);
        this.s.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.o);
        this.s.put("action", this.p);
        this.s.put(IOUtils.YODA_VERSION, com.meituan.android.yoda.util.x.i());
        this.s.put("method", this.q);
        this.r.put("custom", this.s);
        this.I = com.sankuai.android.jarvis.c.a("det_upload_thread", 4);
        this.n = new CommonDialog.a(getActivity());
        try {
            Picasso.c(getContext());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.u = new TextToSpeech(getActivity().getApplicationContext(), this);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94ab0d6fdf31224f09c2228ae35fd5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94ab0d6fdf31224f09c2228ae35fd5b");
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onCreateView, requestCode = " + this.o, true);
        return layoutInflater.inflate(R.layout.fragment_face_detection_sub_fragment2, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #0 {Exception -> 0x00da, blocks: (B:28:0x00c5, B:30:0x00d7), top: B:62:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: Exception -> 0x0103, TRY_LEAVE, TryCatch #1 {Exception -> 0x0103, blocks: (B:37:0x00ee, B:39:0x0100), top: B:64:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r13, @android.support.annotation.Nullable android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e97578afef32ed9954bb0cfd709e310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e97578afef32ed9954bb0cfd709e310");
            return;
        }
        super.onAttach(context);
        this.b = (FaceDetectionFragment) getParentFragment();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d3f9cbea817206f0344b192cbb6a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d3f9cbea817206f0344b192cbb6a1e");
            return;
        }
        super.onConfigurationChanged(configuration);
        onPause();
        onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd4646905b2ff01c4904cf6f791b502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd4646905b2ff01c4904cf6f791b502");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onResume, requestCode = " + this.o, true);
        Statistics.getChannel("techportal").writePageView(AppUtil.generatePageInfoKey(this), "c_qbkemhd7", this.r);
        super.onResume();
        a(1.0f);
        this.c.setIDetection(this);
        if (Privacy.createPermissionGuard().a(getContext(), PermissionGuard.PERMISSION_CAMERA, "jcyf-3e2361e8b87eaf2d") > 0) {
            try {
                this.c.openCamera(getContext(), this.D, this.G, this.H);
                this.D.post(d.a(this));
                this.J = true;
            } catch (Exception e) {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "openCamera exception = " + e.getMessage() + " ,requestCode:" + this.o, true);
                e.printStackTrace();
                onCameraError();
            }
            if (this.f) {
                return;
            }
            d();
        }
    }

    public static /* synthetic */ void e(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6031769254a27618597f7a873510b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6031769254a27618597f7a873510b02");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "4361c38af36d0a439d04d608c60bf803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "4361c38af36d0a439d04d608c60bf803");
        } else if (faceDetectionSubFragment2.c == null || faceDetectionSubFragment2.c.getCameraSurfacePreview() == null) {
        } else {
            com.meituan.android.yoda.widget.view.d cameraSurfacePreview = faceDetectionSubFragment2.c.getCameraSurfacePreview();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.8
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r11) {
                    /*
                        r10 = this;
                        r0 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r8 = 0
                        r0[r8] = r11
                        com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.AnonymousClass8.a
                        java.lang.String r9 = "392e0bf6685fd0fcb250bc65cfec035e"
                        r4 = 0
                        r6 = 4611686018427387906(0x4000000000000002, double:2.000000000000001)
                        r1 = r0
                        r2 = r10
                        r3 = r11
                        r5 = r9
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1e
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r11, r8, r9)
                        return
                    L1e:
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.x(r11)
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        org.json.JSONObject r11 = r11.g
                        if (r11 == 0) goto L40
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        org.json.JSONObject r11 = r11.g
                        java.lang.String r0 = "faceFaqActionRef"
                        boolean r11 = r11.has(r0)
                        if (r11 == 0) goto L40
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this     // Catch: org.json.JSONException -> L40
                        org.json.JSONObject r11 = r11.g     // Catch: org.json.JSONException -> L40
                        java.lang.String r0 = "faceFaqActionRef"
                        java.lang.String r11 = r11.getString(r0)     // Catch: org.json.JSONException -> L40
                        goto L41
                    L40:
                        r11 = 0
                    L41:
                        boolean r0 = android.text.TextUtils.isEmpty(r11)
                        if (r0 == 0) goto L51
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        com.meituan.android.yoda.fragment.FaceDetectionFragment r11 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.f(r11)
                        r11.i()
                        return
                    L51:
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r0 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.x(r0)
                        com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r0 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.this
                        com.meituan.android.yoda.fragment.FaceDetectionFragment r0 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.f(r0)
                        r0.h(r11)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.AnonymousClass8.onClick(android.view.View):void");
                }
            };
            Object[] objArr3 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.widget.view.d.d;
            if (PatchProxy.isSupport(objArr3, cameraSurfacePreview, changeQuickRedirect3, false, "ae030785b333acc8e4f444121a866f86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cameraSurfacePreview, changeQuickRedirect3, false, "ae030785b333acc8e4f444121a866f86");
            } else {
                cameraSurfacePreview.f.a(onClickListener);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18489b49d007994cb7c6de7a44279d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18489b49d007994cb7c6de7a44279d55");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onPause, requestCode = " + this.o, true);
        Statistics.getChannel("techportal").writePageDisappear(AppUtil.generatePageInfoKey(this), "c_qbkemhd7", this.r);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "993a0e104094363667b03f15816dd3b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "993a0e104094363667b03f15816dd3b3");
        } else {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "closeCamera, requestCode = " + this.o, true);
            if (this.J) {
                this.J = false;
                try {
                    f();
                    this.c.closeCamera(this.D);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        super.onPause();
        a(this.N);
    }

    @Override // com.meituan.android.yoda.widget.tool.CameraManager.IDetection
    public void onSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d438cd4d8bf218af24fa87b73ec5bf84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d438cd4d8bf218af24fa87b73ec5bf84");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onSuccess, requestCode = " + this.o, true);
        f();
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        HashMap hashMap = new HashMap(this.s);
        try {
            hashMap.put("paralist", new JSONObject(this.c.paraList));
        } catch (Exception unused) {
        }
        HashMap hashMap2 = new HashMap(this.r);
        hashMap.put("duration", Long.valueOf(currentTimeMillis));
        hashMap2.put("custom", hashMap);
        Statistics.getChannel("techportal").writeModelView(AppUtil.generatePageInfoKey(this), "b_ok3mff22", hashMap, "c_qbkemhd7");
        b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_common_waiting_message));
        if (this.c == null || this.c.paraList == null) {
            return;
        }
        this.c.paraList.clear();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b481981584b4bf8d7d057260790e7b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b481981584b4bf8d7d057260790e7b0b");
            return;
        }
        super.onDestroy();
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onDestroy, requestCode = " + this.o, true);
        FaceLivenessDet faceLivenessDet = ai.a().b;
        if (faceLivenessDet != null) {
            faceLivenessDet.wrapFaceLivenessDetModelUnInit();
        }
        this.I.shutdown();
        if (this.u != null) {
            this.u.stop();
            this.u.shutdown();
        }
        f();
        g();
        if (this.n != null) {
            this.n.b();
        }
        this.y = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.String] */
    @Override // com.meituan.android.yoda.widget.tool.CameraManager.IDetection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFileReady(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.onFileReady(java.io.File):void");
    }

    @Override // com.meituan.android.yoda.widget.tool.CameraManager.IDetection
    public void onFaceImageReady(com.meituan.android.yoda.model.a[] aVarArr, String str, HashMap<String, String> hashMap) {
        Object[] objArr = {aVarArr, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603b68b54718751807bd7dcfdd2135da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603b68b54718751807bd7dcfdd2135da");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onBitmapReady, requestCode = " + this.o, true);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            if (aVarArr[i3].g == 0) {
                if (i < this.S) {
                    arrayList.add(aVarArr[i3]);
                }
                i++;
            } else if (aVarArr[i3].g == 1) {
                i2++;
                arrayList.add(aVarArr[i3]);
            }
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onBitmapReady, action count and rayAction count = " + i + StringUtil.SPACE + i2 + StringUtil.SPACE + this.S, true);
        a((com.meituan.android.yoda.model.a[]) arrayList.toArray(new com.meituan.android.yoda.model.a[arrayList.size()]), str, hashMap);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5babf260b100345e8f7dbceece32f83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5babf260b100345e8f7dbceece32f83c");
        } else if (i == 0) {
            int language = this.u.setLanguage(Locale.CHINA);
            if (language == -1 || language == -2) {
                this.v = false;
                this.u = null;
            }
            if (this.u != null) {
                this.u.setPitch(1.0f);
                this.u.setSpeechRate(1.5f);
                this.v = true;
            }
        }
    }

    @Override // com.meituan.android.yoda.widget.tool.CameraManager.IDetection
    public void onCameraError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429e30b88eab2c8823ecfe8b4c3b75aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429e30b88eab2c8823ecfe8b4c3b75aa");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onCameraError.", true);
        if (this.b != null) {
            this.b.a("yoda_face_verify_launch_status", "face_fragment2", true, 707);
            this.b.d("yoda_face_verify_launch_status", "face_fragment2");
        }
        if (this.n != null) {
            if (this.n.a()) {
                this.n.b();
            }
            this.n.a(getContext(), CommonDialog.b.CONFIRM).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_camera_error), 17.0f).a(8).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_exit), 17, n.a(this)).b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_help), 17, o.a(this)).a((List<String>) null).c();
            this.f = true;
            if (this.d == null || this.w == null) {
                return;
            }
            this.d.removeCallbacks(this.w);
        }
    }

    public static /* synthetic */ void i(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35f2ecfbbe23afb216a9c483f10df354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35f2ecfbbe23afb216a9c483f10df354");
        } else {
            faceDetectionSubFragment2.d.post(m.a(faceDetectionSubFragment2));
        }
    }

    public static /* synthetic */ void d(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3317b6414a5af5b322a2df3886bc3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3317b6414a5af5b322a2df3886bc3e");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
            return;
        }
        Error error = new Error(121234);
        error.message = "相机损坏";
        faceDetectionSubFragment2.b.g.onError(faceDetectionSubFragment2.o, error);
    }

    public static /* synthetic */ void h(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24c3ff03b865095e81dbc91549c9ff6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24c3ff03b865095e81dbc91549c9ff6f");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        if (faceDetectionSubFragment2.b != null) {
            faceDetectionSubFragment2.b.i();
        }
    }

    public static /* synthetic */ void g(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cce025575421826442b84fce8d25a2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cce025575421826442b84fce8d25a2d2");
        } else {
            faceDetectionSubFragment2.d.post(l.a(faceDetectionSubFragment2));
        }
    }

    public static /* synthetic */ void c(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81c20c5200f979cc007574684a9d5b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81c20c5200f979cc007574684a9d5b13");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "verify.onError, click retry button.", true);
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.c.stopPreview();
        faceDetectionSubFragment2.d();
    }

    public static /* synthetic */ void f(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f3fbd4b93a2bd42ac8b9c237d5dd892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f3fbd4b93a2bd42ac8b9c237d5dd892");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.h();
    }

    public static /* synthetic */ void c(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, Error error, View view) {
        Object[] objArr = {faceDetectionSubFragment2, str, error, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "524329b991550bad4580ac3bb6d4f57d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "524329b991550bad4580ac3bb6d4f57d");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        if (faceDetectionSubFragment2.m) {
            faceDetectionSubFragment2.c(faceDetectionSubFragment2.l);
            if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
                return;
            }
            faceDetectionSubFragment2.b.g.onError(str, error);
            return;
        }
        if (faceDetectionSubFragment2.b != null) {
            faceDetectionSubFragment2.b.i();
        }
        if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
            return;
        }
        faceDetectionSubFragment2.b.g.onError(str, error);
    }

    public static /* synthetic */ void e(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f064b63fc30dfb37496e5d2154d9b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f064b63fc30dfb37496e5d2154d9b3e");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.d();
    }

    public static /* synthetic */ void d(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91def1549024ea0b5cf4a06f5f9eaa4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91def1549024ea0b5cf4a06f5f9eaa4e");
        } else {
            faceDetectionSubFragment2.d.post(k.a(faceDetectionSubFragment2));
        }
    }

    public static /* synthetic */ void b(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e188ede9f5de9af827517d826ec91187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e188ede9f5de9af827517d826ec91187");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.y = true;
        if (faceDetectionSubFragment2.getActivity() != null) {
            faceDetectionSubFragment2.getActivity().onBackPressed();
        }
    }

    public static /* synthetic */ void c(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d60c596cfa591d3812d9a47a99a16c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d60c596cfa591d3812d9a47a99a16c9");
            return;
        }
        faceDetectionSubFragment2.y = false;
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.meituan.android.yoda.model.a[] aVarArr, String str, HashMap<String, String> hashMap) {
        boolean z = false;
        int i = 1;
        Object[] objArr = {aVarArr, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d03f81dc2bb2730be3125b5b04db38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d03f81dc2bb2730be3125b5b04db38");
        } else if (aVarArr != null) {
            int length = aVarArr.length;
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onFaceImageReady, requestCode = " + this.o + ", infos.length = " + length, true);
            this.t = AppUtil.generatePageInfoKey(this);
            f();
            this.K = new CountDownLatch(length);
            String[] strArr = new String[length];
            if (this.b == null || this.A == null) {
                return;
            }
            if (this.b.m != null) {
                com.meituan.android.yoda.config.verify.a aVar = this.b.m;
                aVar.b = aVarArr;
                aVar.e = a.EnumC0375a.FACE_DETECTE_COMPLETE;
            }
            try {
                Statistics.getChannel("techportal").writeModelClick(this.t, "b_36l7haza", this.r, "c_qbkemhd7");
                JsonArray jsonArray = new JsonArray();
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = 0;
                while (i2 < length) {
                    if (aVarArr[i2].g == 0) {
                        strArr[i2] = "v0-" + System.currentTimeMillis() + CommonConstant.Symbol.MINUS + i2 + ".jpeg";
                    } else if (aVarArr[i2].g == i) {
                        strArr[i2] = "v0-" + System.currentTimeMillis() + "-ray-" + aVarArr[i2].h + ".jpeg";
                    }
                    aVarArr[i2].j = z;
                    this.I.submit(new com.meituan.android.yoda.widget.tool.e(strArr[i2], i2, aVarArr[i2].d, this.A, this.B, this.K, jsonArray, this.W));
                    i2++;
                    z = false;
                    i = 1;
                }
                this.K.await(10000L, TimeUnit.MILLISECONDS);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    int asInt = next.getAsJsonObject().get("index").getAsInt();
                    if (next.getAsJsonObject().get("status").getAsInt() == 1) {
                        if (aVarArr[asInt].g == 0) {
                            arrayList.add(strArr[asInt]);
                        } else if (aVarArr[asInt].g == 1) {
                            arrayList2.add(strArr[asInt]);
                        }
                        aVarArr[asInt].j = true;
                    }
                }
                HashMap<String, List<String>> hashMap2 = new HashMap<>();
                hashMap2.put("face_upload_suc", arrayList);
                hashMap2.put("ray_upload_suc", arrayList2);
                a(length, strArr, hashMap2, jsonArray, aVarArr, currentTimeMillis, str, hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onFaceImageReady, face detection return param error. requestCode = " + this.o, true);
            if (this.b == null || this.b.i == null) {
                return;
            }
            this.b.i.a(this.o, com.meituan.android.yoda.util.x.e());
        }
    }

    private void a(int i, String[] strArr, HashMap<String, List<String>> hashMap, JsonArray jsonArray, final com.meituan.android.yoda.model.a[] aVarArr, long j, final String str, final HashMap<String, String> hashMap2) {
        boolean z;
        int i2;
        Object[] objArr = {Integer.valueOf(i), strArr, hashMap, jsonArray, aVarArr, new Long(j), str, hashMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f869f8b8a29a1ca7a5e57f4b8a9e960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f869f8b8a29a1ca7a5e57f4b8a9e960");
            return;
        }
        boolean z2 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            if (aVarArr[i6].i && !aVarArr[i6].j) {
                z2 = false;
            }
            if (aVarArr[i6].g == 1) {
                i5++;
            }
            if (aVarArr[i6].j) {
                if (aVarArr[i6].g == 0) {
                    i3++;
                } else if (aVarArr[i6].g == 1) {
                    i4++;
                }
            }
        }
        int size = (hashMap.get("face_upload_suc") != null ? hashMap.get("face_upload_suc").size() : 0) + 0 + (hashMap.get("ray_upload_suc") != null ? hashMap.get("ray_upload_suc").size() : 0);
        Object[] objArr2 = {Integer.valueOf(size)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb2b39a935fcdc93495c8009aa74fd53", RobustBitConfig.DEFAULT_VALUE)) {
            z = z2;
            switch (size) {
                case 0:
                    i2 = ConnectionResult.RESOLUTION_REQUIRED;
                    break;
                case 1:
                    i2 = 801;
                    break;
                case 2:
                    i2 = 802;
                    break;
                case 3:
                    i2 = 803;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        } else {
            z = z2;
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb2b39a935fcdc93495c8009aa74fd53")).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        Object[] objArr3 = {Integer.valueOf(i2), jsonArray, new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        int i7 = i3;
        boolean z3 = z;
        int i8 = i4;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eff0803d5981be7034a39004fae629fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eff0803d5981be7034a39004fae629fd");
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("duration", Long.valueOf(currentTimeMillis));
            jsonObject.addProperty("statues", Integer.valueOf(this.x.get()));
            if (jsonArray.size() == 0) {
                jsonObject.addProperty("details", "none success");
            } else {
                jsonObject.add("details", jsonArray);
            }
            jsonObject.addProperty("action", this.p);
            jsonObject.addProperty("type", this.q);
            int i9 = (int) currentTimeMillis;
            com.meituan.android.yoda.monitor.report.a.a("yoda_image_upload", i2, i9, jsonObject);
            com.meituan.android.yoda.monitor.report.a.a("yoda_face_image_upload", i2, i9, jsonObject);
        }
        if (!z3 || i7 < this.T || (i5 > 0 && i8 < this.U)) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onFaceImageReady, requestCode = " + this.o + ", image upload fail. successCount = " + size + ", isMustUploadSuc:" + z3 + ", actionSucImgSize:" + i7 + ", raySucImgSize:" + i8, true);
            Object[] objArr4 = {Integer.valueOf(i), aVarArr, str, hashMap2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7ca44c27197d1daaab626126e800af6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7ca44c27197d1daaab626126e800af6a");
                return;
            }
            if (com.meituan.android.yoda.config.verify.c.a() != null && com.meituan.android.yoda.config.verify.c.a().e()) {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "handleFaceImageUploadFail, retry upload.", true);
                this.I.execute(new Runnable() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4957aefe2fbfc68556e46235cd54ed05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4957aefe2fbfc68556e46235cd54ed05");
                        } else if (FaceDetectionSubFragment2.this.X) {
                        } else {
                            FaceDetectionSubFragment2.this.a(aVarArr, str, hashMap2);
                        }
                    }
                });
            } else {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "handleFaceImageUploadFail, toast user.", true);
                this.d.post(new AnonymousClass3());
            }
            Statistics.getChannel("techportal").writeModelView(this.t, "b_techportal_sp3rgngr_mv", c(), "c_qbkemhd7");
            return;
        }
        a(i, strArr, hashMap, aVarArr, str, hashMap2);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Runnable {
        public static ChangeQuickRedirect a;

        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7160b8e9358fd66fa972b857e48808", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7160b8e9358fd66fa972b857e48808");
                return;
            }
            FaceDetectionSubFragment2.this.a();
            if (FaceDetectionSubFragment2.this.n != null) {
                if (FaceDetectionSubFragment2.this.n.a()) {
                    FaceDetectionSubFragment2.this.n.b();
                }
                FaceDetectionSubFragment2.this.n.a(FaceDetectionSubFragment2.this.getContext(), CommonDialog.b.CONFIRM).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_image_upload_fail_message), 17.0f).a(8).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_retry), 17, v.a(this)).b(FaceDetectionSubFragment2.this.h, 17, w.a(this)).a((List<String>) null).c();
            }
        }

        public static /* synthetic */ void b(AnonymousClass3 anonymousClass3, View view) {
            Object[] objArr = {anonymousClass3, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45bd7bd1c62a151688222c9371c1e2b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45bd7bd1c62a151688222c9371c1e2b6");
                return;
            }
            Handler handler = FaceDetectionSubFragment2.this.d;
            Object[] objArr2 = {anonymousClass3};
            ChangeQuickRedirect changeQuickRedirect2 = x.a;
            handler.post(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "de40b5629b3b5b87e2f6d26032540d17", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "de40b5629b3b5b87e2f6d26032540d17") : new x(anonymousClass3));
        }

        public static /* synthetic */ void a(AnonymousClass3 anonymousClass3, View view) {
            Object[] objArr = {anonymousClass3, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "685cf5d4ff99ed31dae60584b3839fb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "685cf5d4ff99ed31dae60584b3839fb1");
                return;
            }
            FaceDetectionSubFragment2.this.n.b();
            FaceDetectionSubFragment2.this.f = false;
            FaceDetectionSubFragment2.this.h();
        }
    }

    private void a(int i, String[] strArr, HashMap<String, List<String>> hashMap, com.meituan.android.yoda.model.a[] aVarArr, String str, HashMap<String, String> hashMap2) {
        String a2;
        Object[] objArr = {Integer.valueOf(i), strArr, hashMap, aVarArr, str, hashMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b86d99f84c45ecd338a1bd48f2f50f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b86d99f84c45ecd338a1bd48f2f50f");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "handleFaceImageUploadSuccess, toast user.", true);
        g();
        if (this.b != null && this.b.m != null) {
            this.b.m.e = a.EnumC0375a.FACE_IMAGE_UPLOADED;
        }
        Statistics.getChannel("techportal").writeModelView(this.t, "b_techportal_9n7q22a4_mv", c(), "c_qbkemhd7");
        Gson gson = new Gson();
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("face", com.meituan.android.yoda.xxtea.e.a(gson.toJson(hashMap.get("face_upload_suc")), this.b != null ? this.b.getRequestCode() : ""));
        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray2 = new JsonArray();
        for (int i2 = 0; i2 < i; i2++) {
            if (aVarArr[i2].g == 0) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("name", strArr[i2]);
                jsonObject.addProperty("anchor", aVarArr[i2].e);
                jsonObject.addProperty(PayLabelConstants.KEY_LABEL_CHECK, aVarArr[i2].f);
                jsonObject.addProperty("version", (Number) 2);
                jsonArray.add(jsonObject);
            } else if (aVarArr[i2].g == 1 && aVarArr[i2].j) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("name", strArr[i2]);
                jsonObject2.addProperty("anchor", aVarArr[i2].e);
                jsonObject2.addProperty(PayLabelConstants.KEY_LABEL_CHECK, aVarArr[i2].f);
                jsonObject2.addProperty("version", (Number) 2);
                jsonArray2.add(jsonObject2);
            }
        }
        String json = gson.toJson((JsonElement) jsonArray);
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "image upload success, prepare_verify_param. requestCode = " + this.o + " extraInfo = " + json, true);
        hashMap3.put("extraInfo", com.meituan.android.yoda.xxtea.e.a(json, this.b != null ? this.b.getRequestCode() : ""));
        if (jsonArray2.size() > 0) {
            String json2 = gson.toJson((JsonElement) jsonArray2);
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "image upload success, prepare_verify_param. requestCode = " + this.o + " rayExtraInfo = " + json2, true);
            hashMap3.put("faceRayFiles", com.meituan.android.yoda.xxtea.e.a(json2, this.b != null ? this.b.getRequestCode() : ""));
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "origin actionSequence:" + str, true);
        if (TextUtils.isEmpty(str)) {
            a2 = "";
        } else {
            a2 = com.meituan.android.yoda.xxtea.e.a(str, this.b != null ? this.b.getRequestCode() : "");
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "enc actionSequence:" + a2, true);
        hashMap3.put("actionSequence", a2);
        if (hashMap2 != null) {
            if (hashMap2.containsKey("open_file_count")) {
                hashMap3.put("fileListCount", hashMap2.get("open_file_count"));
            }
            if (hashMap2.containsKey("open_file_content")) {
                hashMap3.put("fileList", com.meituan.android.yoda.xxtea.e.a(com.meituan.android.yoda.model.behavior.tool.c.a(hashMap2.get("open_file_content")), this.b.getRequestCode()));
            }
        }
        this.x.set(0);
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "upload_success, start verify, requestCode = " + this.o, true);
        if (this.d != null) {
            this.d.post(new Runnable() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a5b5b45e2c909f3dbd858f12a826bf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a5b5b45e2c909f3dbd858f12a826bf2");
                        return;
                    }
                    FaceDetectionSubFragment2.this.a();
                    FaceDetectionSubFragment2.this.b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_waiting_message));
                }
            });
        }
        if (this.b != null) {
            this.b.b(hashMap3, this.b.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979e96f6e15322ab623324a59ec1f500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979e96f6e15322ab623324a59ec1f500");
            return;
        }
        try {
            if (this.n != null) {
                this.f = true;
                if (this.n.a()) {
                    this.n.b();
                }
                this.n.a(getContext(), CommonDialog.b.WAITING).b(str, com.meituan.android.yoda.util.x.a(17.0f)).c();
            }
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "busy, requestCode = " + this.o + ", exception = " + e.getMessage(), true);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4e8829053175574256560af21a1861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4e8829053175574256560af21a1861");
            return;
        }
        try {
            if (this.n != null) {
                this.n.b();
            }
            this.f = false;
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "idle, requestCode = " + this.o + ", exception = " + e.getMessage(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22cc146ebcc182fefc4ce40b059c3990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22cc146ebcc182fefc4ce40b059c3990");
            return;
        }
        boolean z2 = true;
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "info, requestCode = " + this.o, true);
        e();
        if (this.b != null) {
            b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_common_waiting_message));
            com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(this.o);
            try {
                if (a2.c.data.containsKey("needReadLegalProvision")) {
                    z = ((Boolean) a2.c.data.get("needReadLegalProvision")).booleanValue();
                }
            } catch (Exception unused) {
            }
            HashMap<String, String> hashMap = new HashMap<>();
            JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
            if (d != null && d.has("ignoreFaceGuide")) {
                try {
                    z2 = true ^ d.getBoolean("ignoreFaceGuide");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (z2) {
                hashMap.put("readLegalProvision", z ? "1" : "0");
            }
            hashMap.put("encryptionVersion", "2");
            this.b.a(hashMap, new AnonymousClass5());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements com.meituan.android.yoda.interfaces.h<YodaResult> {
        public static ChangeQuickRedirect a;

        public AnonymousClass5() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(37:9|10|(1:12)|13|(1:15)|16|(2:18|(1:22))|23|(2:25|(3:27|(1:29)|30)(1:144))(1:145)|31|(2:33|(1:37))|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|50|(1:54)|(2:55|56)|(6:133|(1:135)|136|137|138|139)(17:60|61|(3:63|(2:66|64)|67)|68|69|(5:121|122|123|(1:125)(1:127)|126)|71|(1:73)|74|75|(2:77|(4:79|(6:83|84|85|(2:87|88)|90|88)|92|(1:96)))|98|(1:100)|101|(1:103)(1:119)|104|(1:106)(1:118))|143|69|(0)|71|(0)|74|75|(0)|98|(0)|101|(0)(0)|104|(0)(0)) */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0328 A[Catch: Exception -> 0x039f, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0350 A[Catch: Exception -> 0x039f, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x036c A[Catch: Exception -> 0x039f, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x037e A[Catch: Exception -> 0x039f, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0392 A[Catch: Exception -> 0x039f, TRY_LEAVE, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0271 A[Catch: Exception -> 0x039f, TRY_LEAVE, TryCatch #1 {Exception -> 0x039f, blocks: (B:9:0x0052, B:11:0x005b, B:12:0x0067, B:14:0x006f, B:15:0x0074, B:17:0x007d, B:19:0x0091, B:21:0x009b, B:22:0x00ab, B:24:0x00b4, B:26:0x00c0, B:28:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f5, B:36:0x0109, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:42:0x0129, B:44:0x0131, B:45:0x013c, B:47:0x0144, B:48:0x0151, B:50:0x0159, B:51:0x016e, B:53:0x0177, B:55:0x0180, B:79:0x0249, B:84:0x025b, B:88:0x0266, B:89:0x0268, B:91:0x0271, B:112:0x0320, B:114:0x0328, B:115:0x0347, B:117:0x0350, B:119:0x0375, B:121:0x037e, B:122:0x0392, B:118:0x036c, B:30:0x00da, B:31:0x00e4), top: B:152:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x028e A[Catch: Exception -> 0x0320, TryCatch #0 {Exception -> 0x0320, blocks: (B:92:0x0285, B:94:0x028e, B:96:0x029f, B:98:0x02b9, B:100:0x02c5, B:106:0x02e8, B:107:0x02fe, B:109:0x0306, B:111:0x0310), top: B:150:0x0285 }] */
        @Override // com.meituan.android.yoda.interfaces.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void a(java.lang.String r13, @android.support.annotation.NonNull com.meituan.android.yoda.bean.YodaResult r14) {
            /*
                Method dump skipped, instructions count: 1134
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.AnonymousClass5.a(java.lang.String, java.lang.Object):void");
        }

        @Override // com.meituan.android.yoda.interfaces.h
        public final void a(String str, @NonNull Error error) {
            String a2;
            Object[] objArr = {str, error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9845fb0df26dbca6baf4a215d835e87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9845fb0df26dbca6baf4a215d835e87");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "info.onError, requestCode = " + str, true);
            FaceDetectionSubFragment2.this.a();
            List<String> list = null;
            if (com.meituan.android.yoda.config.a.a(error.code)) {
                if (error.icons == null || error.icons.isEmpty()) {
                    list = FaceDetectionSubFragment2.this.b();
                } else {
                    list = error.icons;
                }
            }
            if (FaceDetectionSubFragment2.this.a(str, error)) {
                FaceDetectionSubFragment2.this.f = true;
                if (FaceDetectionSubFragment2.this.n.a()) {
                    FaceDetectionSubFragment2.this.n.b();
                }
                FaceDetectionSubFragment2.this.n.a(FaceDetectionSubFragment2.this.getContext(), CommonDialog.b.CONFIRM).a(error.message, 17.0f).a(8).b(FaceDetectionSubFragment2.this.h, 17, ae.a(this, error)).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_retry), 17, af.a(this)).a(list).c();
            } else if (FaceDetectionSubFragment2.this.a(str, error, false)) {
                FaceDetectionSubFragment2.this.f();
                if (FaceDetectionSubFragment2.this.n != null) {
                    if (FaceDetectionSubFragment2.this.n.a()) {
                        FaceDetectionSubFragment2.this.n.b();
                    }
                    if (FaceDetectionSubFragment2.this.j) {
                        a2 = FaceDetectionSubFragment2.this.h;
                    } else {
                        a2 = com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_help);
                    }
                    FaceDetectionSubFragment2.this.n.a(FaceDetectionSubFragment2.this.getContext(), CommonDialog.b.CONFIRM).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_net_check_error_tips2), 17.0f).a(8).a(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_retry), 17, ag.a(this)).b(a2, 17, ah.a(this, error)).a(list).c();
                }
            } else {
                error.YODErrorUserInteractionKey = 1;
                FaceDetectionSubFragment2.this.f = true;
                if (FaceDetectionSubFragment2.this.n != null) {
                    if (FaceDetectionSubFragment2.this.n.a()) {
                        FaceDetectionSubFragment2.this.n.b();
                    }
                    FaceDetectionSubFragment2.this.n.a(FaceDetectionSubFragment2.this.getContext(), CommonDialog.b.CONFIRM).a(error.message, 17.0f).a(8).b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_help), 17, z.a(this, error)).a(FaceDetectionSubFragment2.this.k, 17, aa.a(this, str, error)).a(list).c();
                }
            }
        }
    }

    public final boolean a(String str, Error error, boolean z) {
        String a2;
        Object[] objArr = {str, error, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548e409e22d9d459061e31de1abc9be0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548e409e22d9d459061e31de1abc9be0")).booleanValue();
        }
        if (error != null && this.b != null && this.b.g != null) {
            if (com.meituan.android.yoda.config.a.a(error.code, this.o)) {
                error.YODErrorUserInteractionKey = 1;
                this.f = true;
                if (this.n != null) {
                    if (this.n.a()) {
                        this.n.b();
                    }
                    if (this.m) {
                        a2 = this.k;
                    } else {
                        a2 = com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_exit);
                    }
                    List<String> list = null;
                    if (com.meituan.android.yoda.config.a.a(error.code)) {
                        if (error.icons == null || error.icons.isEmpty()) {
                            list = b();
                        } else {
                            list = error.icons;
                        }
                    }
                    this.n.a(getContext(), CommonDialog.b.CONFIRM).a(error.message, 17.0f).a(8).b(com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_help), 17, e.a(this, str, error)).a(a2, 17, f.a(this, str, error)).a(list).c();
                }
                return true;
            } else if (!z && this.b != null) {
                this.b.d();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void b(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, Error error, View view) {
        Object[] objArr = {faceDetectionSubFragment2, str, error, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b32a09d2793c0fd461cc5be9da6073c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b32a09d2793c0fd461cc5be9da6073c");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.b.i();
        if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
            return;
        }
        faceDetectionSubFragment2.b.g.onError(str, error);
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment2 faceDetectionSubFragment2, String str, Error error, View view) {
        Object[] objArr = {faceDetectionSubFragment2, str, error, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bdb264b80d48d57081bf371b1384660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bdb264b80d48d57081bf371b1384660");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.c(faceDetectionSubFragment2.l);
        if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
            return;
        }
        faceDetectionSubFragment2.b.g.onError(str, error);
    }

    public final boolean a(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97666830688d5d9b03e63b16fced617", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97666830688d5d9b03e63b16fced617")).booleanValue() : error != null && com.meituan.android.yoda.config.a.b(error.code);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ea72a75243761cf194ec9b7ac3c251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ea72a75243761cf194ec9b7ac3c251");
            return;
        }
        if (this.w == null) {
            this.Q = new com.meituan.android.yoda.asynchronous.a() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.asynchronous.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f4ef01dc095bcec914d3dc7195fe858", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f4ef01dc095bcec914d3dc7195fe858");
                        return;
                    }
                    try {
                        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "postDelayedFaceDetectTimeOutDialog.work, 人脸检测超时", true);
                        if (FaceDetectionSubFragment2.this.c != null) {
                            FaceDetectionSubFragment2.this.c.reportFaceDetectResult(false);
                            FaceDetectionSubFragment2.this.c.stopPreview();
                        }
                        for (YodaFaceDetectionResponseListener yodaFaceDetectionResponseListener : com.meituan.android.yoda.plugins.d.a().d) {
                            if (yodaFaceDetectionResponseListener != null) {
                                if (FaceDetectionSubFragment2.this.c != null) {
                                    yodaFaceDetectionResponseListener.onFaceDeFail(FaceDetectionSubFragment2.this.c.getErrorCode(), FaceDetectionSubFragment2.this.L.feLiveType);
                                } else {
                                    yodaFaceDetectionResponseListener.onFaceDeFail(0, FaceDetectionSubFragment2.this.L.feLiveType);
                                }
                            }
                        }
                        if (FaceDetectionSubFragment2.this.b == null || FaceDetectionSubFragment2.this.b.getActivity() == null) {
                            return;
                        }
                        FaceDetectionSubFragment2.a(FaceDetectionSubFragment2.this, com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_over_time_title), true);
                        long currentTimeMillis = System.currentTimeMillis() - FaceDetectionSubFragment2.this.e;
                        HashMap hashMap = new HashMap(FaceDetectionSubFragment2.this.s);
                        HashMap hashMap2 = new HashMap(FaceDetectionSubFragment2.this.r);
                        hashMap2.put("custom", hashMap);
                        try {
                            hashMap.put("paraList", new JSONObject(FaceDetectionSubFragment2.this.c.paraList));
                        } catch (Exception unused) {
                        }
                        hashMap.put("duration", Long.valueOf(currentTimeMillis));
                        Statistics.getChannel("techportal").writeModelView(AppUtil.generatePageInfoKey(FaceDetectionSubFragment2.this), "b_k9lvxzrc", hashMap2, "c_qbkemhd7");
                        FaceDetectionSubFragment2.this.c.paraList.clear();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            this.w = new com.meituan.android.yoda.asynchronous.b(this.Q);
        } else {
            this.d.removeCallbacks(this.w);
        }
        this.d.postDelayed(this.w, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf7c33ed9f4b192524659a27dfca6f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf7c33ed9f4b192524659a27dfca6f7");
            return;
        }
        if (this.d != null) {
            this.d.removeCallbacks(this.w);
        }
        this.w = null;
        this.Q = null;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3458b63ab288bffdb878bb4c6acf760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3458b63ab288bffdb878bb4c6acf760");
            return;
        }
        this.d.removeCallbacks(this.Y);
        this.Y = null;
        this.Z = null;
    }

    public static /* synthetic */ void b(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "273f5bccb6868ac50661797dd8416bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "273f5bccb6868ac50661797dd8416bbe");
        } else {
            faceDetectionSubFragment2.d.post(j.a(faceDetectionSubFragment2));
        }
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment2 faceDetectionSubFragment2) {
        Object[] objArr = {faceDetectionSubFragment2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fddfa8ddc5a1c4296a6dac2dad4a18c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fddfa8ddc5a1c4296a6dac2dad4a18c8");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.d();
        faceDetectionSubFragment2.X = false;
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment2 faceDetectionSubFragment2, View view) {
        Object[] objArr = {faceDetectionSubFragment2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ad956d4dfd1a3382e16171406cb5e14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ad956d4dfd1a3382e16171406cb5e14");
            return;
        }
        faceDetectionSubFragment2.n.b();
        faceDetectionSubFragment2.f = false;
        faceDetectionSubFragment2.c(faceDetectionSubFragment2.i);
        if (faceDetectionSubFragment2.b == null || faceDetectionSubFragment2.b.g == null) {
            return;
        }
        faceDetectionSubFragment2.b.g.onCancel(faceDetectionSubFragment2.o);
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b838cb6351f2b59915d3c6468cfc7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b838cb6351f2b59915d3c6468cfc7ea");
            return;
        }
        try {
            if (getActivity() != null) {
                ImageView imageView = new ImageView(getActivity());
                imageView.setImageDrawable(com.meituan.android.yoda.util.x.c((int) R.drawable.yoda_face_login_verify_success));
                imageView.setLayoutParams(new ViewGroup.LayoutParams((int) com.meituan.android.yoda.util.x.a(40.0f), (int) com.meituan.android.yoda.util.x.a(40.0f)));
                new com.sankuai.meituan.android.ui.widget.a(this.D, str, -2).a(20.0f).a(imageView).b(Color.parseColor("#CD111111")).a();
            }
        } catch (Exception unused) {
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb21998c82b89bd463966c5956a5561e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb21998c82b89bd463966c5956a5561e");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            this.N = attributes.screenBrightness;
            attributes.screenBrightness = f;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public List<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6970c9221a9bfec804b8f059495638", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6970c9221a9bfec804b8f059495638");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://s3plus.meituan.net/v1/mss_f231eb419c414559a1837748d11d4312/yoda-resources/face/faceTip_steady.png");
        arrayList.add("https://s3plus.meituan.net/v1/mss_f231eb419c414559a1837748d11d4312/yoda-resources/face/faceTip_bright.png");
        arrayList.add("https://s3plus.meituan.net/v1/mss_f231eb419c414559a1837748d11d4312/yoda-resources/face/faceTip_horizontal.png");
        arrayList.add("https://s3plus.meituan.net/v1/mss_f231eb419c414559a1837748d11d4312/yoda-resources/face/faceTip_clear.png");
        return arrayList;
    }

    public Map<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e31d7eae031902c4ddf04c298b34e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e31d7eae031902c4ddf04c298b34e6");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() - this.c.getPreviewStartTime();
        hashMap2.putAll(this.s);
        hashMap2.put("duration", String.valueOf(currentTimeMillis));
        hashMap.put("custom", hashMap2);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3219df7cb64dfbb58eda30d26da4d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3219df7cb64dfbb58eda30d26da4d8");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "handleVerifyErrorDialogCancelPressed, cancelActionJumpURL = " + this.i, true);
        if (!TextUtils.isEmpty(this.i)) {
            if (this.b != null && this.b.g != null) {
                this.b.g.onCancel(this.o);
            }
            c(this.i);
        } else if (this.b != null) {
            if (this.b.q) {
                if (this.b.p != null) {
                    this.b.k();
                }
            } else if (this.b.g != null) {
                this.b.g.onCancel(this.o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7007e923fa53cba8d78c80ec8528b54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7007e923fa53cba8d78c80ec8528b54b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith("https") || str.startsWith("http")) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("yoda://www.meituan.com/knbview"));
                intent.putExtra("url", str);
                startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (str.contains("openinapp")) {
                try {
                    i = Integer.parseInt(Uri.parse(str).getQueryParameter("openinapp"));
                } catch (Exception unused) {
                    i = -1;
                }
                if (i == 1) {
                    try {
                        intent2.setPackage(getActivity().getPackageName());
                    } catch (Exception unused2) {
                    }
                }
            }
            startActivity(intent2);
        }
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment2 faceDetectionSubFragment2, HashMap hashMap, String str, File file) {
        Object[] objArr = {faceDetectionSubFragment2, hashMap, str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab0d62f23f1b16e1d0e660c4f7b2dcc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab0d62f23f1b16e1d0e660c4f7b2dcc1");
            return;
        }
        try {
            boolean post = FaceDetUtils.post(faceDetectionSubFragment2.A.url, null, hashMap, str, file);
            file.delete();
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "isSuccess :" + post, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
