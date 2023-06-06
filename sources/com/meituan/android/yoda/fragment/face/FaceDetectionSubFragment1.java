package com.meituan.android.yoda.fragment.face;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.IOUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.fragment.FaceDetectionFragment;
import com.meituan.android.yoda.fragment.SimpleWebViewFragment;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.OpenDetailPageUtil;
import com.meituan.android.yoda.widget.view.BaseButton;
import com.meituan.android.yoda.widget.view.BaseImageView;
import com.meituan.android.yoda.widget.view.BaseTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public class FaceDetectionSubFragment1 extends Fragment implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public Map<String, Object> b;
    public Map<String, Object> c;
    public boolean d;
    private BaseImageView e;
    private BaseTextView f;
    private BaseTextView g;
    private LinearLayout h;
    private BaseTextView i;
    private BaseTextView j;
    private BaseButton k;
    private FaceDetectionFragment l;
    private String m;
    private String n;
    private String o;
    private AppCompatCheckBox p;
    private BaseTextView q;
    private BaseTextView r;
    private BaseTextView s;
    private boolean t;
    private Handler u;
    private boolean v;
    private boolean w;
    private Runnable x;
    private com.meituan.android.privacy.interfaces.g y;

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c9edd644e133e5a61e0d9f6c8be3c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c9edd644e133e5a61e0d9f6c8be3c1d");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409e7f2659c59bc7b1061d94fbde8d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409e7f2659c59bc7b1061d94fbde8d02");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
        }
    }

    public FaceDetectionSubFragment1() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882af31980aceedbcf61d7ca8f53be25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882af31980aceedbcf61d7ca8f53be25");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = false;
        this.t = false;
        this.w = false;
        this.x = new Runnable() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec25b0ed4fe88526c737f8a57969a53b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec25b0ed4fe88526c737f8a57969a53b");
                } else if (FaceDetectionSubFragment1.this.isResumed()) {
                    FaceDetectionSubFragment1.this.w = true;
                    FaceDetectionSubFragment1.this.b();
                }
            }
        };
        this.y = new com.meituan.android.privacy.interfaces.g() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a71aa53ef98acd8899cac930f7cac782", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a71aa53ef98acd8899cac930f7cac782");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "IPermissionCallback.onResult, requestCode = " + FaceDetectionSubFragment1.this.m + ", permissionId = " + str + ", retCode = " + i, true);
                if (i <= 0) {
                    final com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(FaceDetectionSubFragment1.this.m);
                    final Error error = new Error(1211111);
                    error.message = "需要相机权限";
                    if (Privacy.createPermissionGuard().a(FaceDetectionSubFragment1.this.getContext(), PermissionGuard.PERMISSION_CAMERA, "jcyf-3e2361e8b87eaf2d") == -7) {
                        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "IPermissionCallback.onResult, requestCode = " + FaceDetectionSubFragment1.this.m + ", CODE_DENIED_SYS_NOT_ACCEPT", true);
                        try {
                            OpenDetailPageUtil.a(new WeakReference(FaceDetectionSubFragment1.this.getActivity()), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_title), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_message), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_positive_text), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_negative_text), new WeakReference(new OpenDetailPageUtil.DetailDialogCallback() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void negativecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9322a65cf93e27668ecaa97b175e7e7d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9322a65cf93e27668ecaa97b175e7e7d");
                                    } else if (a2 != null) {
                                        if (a2.f == null || a2.f.a() <= 1) {
                                            if (FaceDetectionSubFragment1.this.l == null || FaceDetectionSubFragment1.this.l.g == null) {
                                                return;
                                            }
                                            FaceDetectionSubFragment1.this.l.g.onError(FaceDetectionSubFragment1.this.m, error);
                                            return;
                                        }
                                        com.meituan.android.yoda.util.x.a(FaceDetectionSubFragment1.this.getActivity(), error.message);
                                    }
                                }

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void positivecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ee70987128ecad06d8ec3e510973b43", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ee70987128ecad06d8ec3e510973b43");
                                    } else {
                                        FaceDetectionSubFragment1.this.w = false;
                                    }
                                }
                            }));
                        } catch (Exception unused) {
                            com.meituan.android.yoda.util.x.a(FaceDetectionSubFragment1.this.getActivity(), FaceDetectionSubFragment1.this.getActivity().getString(R.string.yoda_face_verify_permission_request_message));
                        }
                    } else {
                        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "IPermissionCallback.onResult, requestCode = " + FaceDetectionSubFragment1.this.m + ", no CODE_DENIED_SYS_NOT_ACCEPT", true);
                        try {
                            OpenDetailPageUtil.a(new WeakReference(FaceDetectionSubFragment1.this.getActivity()), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_title), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_message), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_positive_text), com.meituan.android.yoda.util.x.a((int) R.string.yoda_face_verify_permission_request_negative_text), new WeakReference(new OpenDetailPageUtil.DetailDialogCallback() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.2.2
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void negativecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5946bc43a499bd604e2a1f699bbc1a59", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5946bc43a499bd604e2a1f699bbc1a59");
                                    } else if (a2 != null) {
                                        if (a2.f == null || a2.f.a() <= 1) {
                                            if (FaceDetectionSubFragment1.this.l == null || FaceDetectionSubFragment1.this.l.g == null) {
                                                return;
                                            }
                                            FaceDetectionSubFragment1.this.l.g.onError(FaceDetectionSubFragment1.this.m, error);
                                            return;
                                        }
                                        com.meituan.android.yoda.util.x.a(FaceDetectionSubFragment1.this.getActivity(), error.message);
                                    }
                                }

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void positivecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a90fee319f12eb034b87219eddd19a20", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a90fee319f12eb034b87219eddd19a20");
                                    } else {
                                        FaceDetectionSubFragment1.this.w = false;
                                    }
                                }
                            }));
                        } catch (Exception unused2) {
                            com.meituan.android.yoda.util.x.a(FaceDetectionSubFragment1.this.getActivity(), FaceDetectionSubFragment1.this.getActivity().getString(R.string.yoda_face_verify_permission_request_message));
                        }
                    }
                    if (FaceDetectionSubFragment1.this.l != null) {
                        FaceDetectionSubFragment1.this.l.a("yoda_face_verify_launch_status", "face_fragment2", true, 708);
                        FaceDetectionSubFragment1.this.l.d("yoda_face_verify_launch_status", "face_fragment2");
                        return;
                    }
                    return;
                }
                FaceDetectionSubFragment1.this.l.p.b(FaceDetectionSubFragment2.a(FaceDetectionSubFragment1.this.m, FaceDetectionSubFragment1.this.n, FaceDetectionSubFragment1.this.o), "face_fragment2");
            }
        };
    }

    public static FaceDetectionSubFragment1 a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4928adb6363cd5c3dc724ba8e6b015ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (FaceDetectionSubFragment1) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4928adb6363cd5c3dc724ba8e6b015ce");
        }
        FaceDetectionSubFragment1 faceDetectionSubFragment1 = new FaceDetectionSubFragment1();
        Bundle bundle = new Bundle();
        bundle.putString("param1", str);
        bundle.putString("param2", str2);
        bundle.putString("param3", str3);
        faceDetectionSubFragment1.setArguments(bundle);
        return faceDetectionSubFragment1;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6f1e0db63588acbb97e1b25a3aee3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6f1e0db63588acbb97e1b25a3aee3d");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.m = getArguments().getString("param1");
            this.n = getArguments().getString("param2");
            this.o = getArguments().getString("param3");
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onCreate, requestCode = " + this.m, true);
        this.c.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.m);
        this.c.put("action", this.n);
        this.c.put(IOUtils.YODA_VERSION, com.meituan.android.yoda.util.x.i());
        this.c.put("method", this.o);
        this.b.put("custom", this.c);
        this.t = true;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df74abb1188181c2026fa64df17cb057", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df74abb1188181c2026fa64df17cb057");
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onCreateView, requestCode = " + this.m, true);
        if (this.l != null) {
            this.l.c("yoda_face_guide_page_launch", "face_fragment1");
        }
        JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
        if (d != null && d.has("backgroundColor")) {
            try {
                String string = d.getString("backgroundColor");
                if (!string.startsWith("#")) {
                    string = "#" + string;
                }
                i = Color.parseColor(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
            View inflate = layoutInflater.inflate(R.layout.fragment_face_detection_sub_fragment1, viewGroup, false);
            inflate.setBackgroundColor(i);
            this.u = new Handler(Looper.getMainLooper());
            return inflate;
        }
        i = 0;
        View inflate2 = layoutInflater.inflate(R.layout.fragment_face_detection_sub_fragment1, viewGroup, false);
        inflate2.setBackgroundColor(i);
        this.u = new Handler(Looper.getMainLooper());
        return inflate2;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        int b;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d86774293c41e4c9faf1cc6268bca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d86774293c41e4c9faf1cc6268bca5");
            return;
        }
        super.onViewCreated(view, bundle);
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onViewCreated, requestCode = " + this.m, true);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ef0780ef8cb1d1491bf9199955de76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ef0780ef8cb1d1491bf9199955de76");
            return;
        }
        com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(this.m);
        try {
            if (a2.c.data.containsKey("needReadLegalProvision")) {
                this.d = ((Boolean) a2.c.data.get("needReadLegalProvision")).booleanValue();
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "initView, requestCode = " + this.m + ", needReadLegalProvision = " + this.d, true);
            }
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "initView, requestCode = " + this.m + ", needReadLegalProvision exception = " + e.getMessage(), true);
            this.d = true;
        }
        this.h = (LinearLayout) view.findViewById(R.id.yoda_real_name_layout);
        this.i = (BaseTextView) view.findViewById(R.id.yoda_real_name);
        this.j = (BaseTextView) view.findViewById(R.id.yoda_real_num);
        try {
            if (a2.c.data.containsKey("realName") && a2.c.data.containsKey("identityNum")) {
                String valueOf = String.valueOf(a2.c.data.get("realName"));
                String valueOf2 = String.valueOf(a2.c.data.get("identityNum"));
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2) && !valueOf.equalsIgnoreCase(StringUtil.NULL) && !valueOf2.equalsIgnoreCase(StringUtil.NULL)) {
                    this.h.setVisibility(0);
                    this.i.setText(valueOf);
                    this.j.setText("（" + valueOf2 + "）");
                }
                this.h.setVisibility(8);
            }
        } catch (Exception e2) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "initView, requestCode = " + this.m + ", mRealNameLayout exception = " + e2.getMessage(), true);
            this.h.setVisibility(8);
        }
        this.p = (AppCompatCheckBox) view.findViewById(R.id.checkbox);
        a(this.p);
        this.r = (BaseTextView) view.findViewById(R.id.tv_protocol_bubble_tip);
        this.s = (BaseTextView) view.findViewById(R.id.btn_user_protocol);
        this.q = (BaseTextView) view.findViewById(R.id.tv_user_protocol);
        View findViewById = view.findViewById(R.id.btn_user_protocol);
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        findViewById.setOnClickListener(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b93aa287f2ff64229b6349bb16fdab5d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b93aa287f2ff64229b6349bb16fdab5d") : new a(this));
        view.findViewById(R.id.checkbox_wrapper).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4b737b8f74510ae37998d17e32273df2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4b737b8f74510ae37998d17e32273df2");
                    return;
                }
                FaceDetectionSubFragment1.this.p.setChecked(!FaceDetectionSubFragment1.this.p.isChecked());
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "CheckBox onClick, requestCode = " + FaceDetectionSubFragment1.this.m + ", isChecked = " + FaceDetectionSubFragment1.this.p.isChecked(), true);
            }
        });
        this.p.setOnCheckedChangeListener(b.a(this));
        this.k = (BaseButton) view.findViewById(R.id.btn_start_verify);
        this.k.setOnClickListener(this);
        if (!this.d) {
            this.p.setVisibility(8);
            this.r.setVisibility(8);
            view.findViewById(R.id.tv_user_protocol).setVisibility(8);
            view.findViewById(R.id.btn_user_protocol).setVisibility(8);
            if (this.t) {
                this.k.setVisibility(4);
            } else {
                this.k.setVisibility(0);
            }
        }
        if (this.d) {
            this.k.setEnabled(false);
            this.k.setContentDescription(getString(R.string.yoda_face_start_verify_btn_not_provision_content_des));
            if (this.p.isChecked()) {
                this.q.setContentDescription(getString(R.string.yoda_face_verify_bubble_tip_checked_content_des));
            } else {
                this.q.setContentDescription(getString(R.string.yoda_face_verify_bubble_tip_not_check_content_des));
            }
        } else {
            this.k.setContentDescription(getString(R.string.yoda_face_verify_start_content_des, this.k.getText()));
        }
        this.f = (BaseTextView) view.findViewById(R.id.yoda_facedetection_guide_title);
        this.g = (BaseTextView) view.findViewById(R.id.yoda_facedetection_guide_content);
        this.e = (BaseImageView) view.findViewById(R.id.yoda_facedetection_guide_img);
        this.l.a(view, R.id.yoda_facedetection_choose_other_type, (String) null, c.b());
        JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
        if (d != null) {
            try {
                if (d.has("imgWidth") && d.has("imgHeight")) {
                    int i = d.getInt("imgWidth");
                    int i2 = d.getInt("imgHeight");
                    ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    this.e.setLayoutParams(layoutParams);
                }
                if (com.meituan.android.yoda.config.ui.d.a().r() && this.l != null && (b = com.meituan.android.yoda.util.x.b(com.meituan.android.yoda.config.ui.d.a().p(), 1)) != -1) {
                    this.e.setColorFilter(b);
                }
                if (d.has("imgFilterColor")) {
                    String string = d.getString("imgFilterColor");
                    if (!string.startsWith("#")) {
                        string = "#" + string;
                    }
                    this.e.setColorFilter(Color.parseColor(string));
                }
                if (d.has("imgUrl")) {
                    String string2 = d.getString("imgUrl");
                    this.e.setColorFilter(0);
                    Picasso.c(getContext());
                    try {
                        Picasso.g(getContext()).a(Uri.parse(string2)).a(R.drawable.yoda_face_liveness_detection).a(this.e);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (d.has("title")) {
                    String string3 = d.getString("title");
                    if (!TextUtils.isEmpty(string3)) {
                        this.f.setText(string3);
                    }
                }
                if (d.has("titleFontSize")) {
                    this.f.setTextSize(d.getInt("titleFontSize"));
                }
                if (d.has("content")) {
                    String string4 = d.getString("content");
                    if (!TextUtils.isEmpty(string4)) {
                        this.g.setText(string4);
                    }
                }
                if (d.has("contentFontSize")) {
                    this.g.setTextSize(d.getInt("contentFontSize"));
                }
                if (d.has("btnText")) {
                    String string5 = d.getString("btnText");
                    if (!TextUtils.isEmpty(string5)) {
                        this.k.setText(string5);
                    }
                }
                if (d.has("btnFontSize")) {
                    this.k.setTextSize(d.getInt("btnFontSize"));
                }
                if (d.has("titleColor")) {
                    String string6 = d.getString("titleColor");
                    if (!TextUtils.isEmpty(string6)) {
                        try {
                            if (!string6.startsWith("#")) {
                                string6 = "#" + string6;
                            }
                            this.f.setTextColor(Color.parseColor(string6));
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                if (d.has("contentColor")) {
                    String string7 = d.getString("contentColor");
                    try {
                        if (!string7.startsWith("#")) {
                            string7 = "#" + string7;
                        }
                        this.g.setTextColor(Color.parseColor(string7));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                if (d.has("btnColor")) {
                    String string8 = d.getString("btnColor");
                    try {
                        if (!string8.startsWith("#")) {
                            string8 = "#" + string8;
                        }
                        this.k.setTextColor(Color.parseColor(string8));
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } else if (com.meituan.android.yoda.config.ui.d.a().s() && this.l != null) {
                    this.v = true;
                    a(this.k, this.k.isEnabled());
                }
                final int i3 = 20;
                if (d.has("btnCornerRadius")) {
                    try {
                        i3 = Integer.parseInt(d.getString("btnCornerRadius"));
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                if (d.has("btnBgColor")) {
                    final String string9 = d.getString("btnBgColor");
                    try {
                        if (!string9.startsWith("#")) {
                            string9 = "#" + string9;
                        }
                        this.k.setBackgroundColor(Color.parseColor(string9));
                        this.k.setBackground(new ColorDrawable() { // from class: com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.4
                            public static ChangeQuickRedirect a;
                            public final Paint b = new Paint(1);

                            @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
                            public final void draw(Canvas canvas) {
                                Object[] objArr4 = {canvas};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fbc4a65a3b1dcc184a793df1339519ad", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fbc4a65a3b1dcc184a793df1339519ad");
                                    return;
                                }
                                super.draw(canvas);
                                this.b.setColor(Color.parseColor(string9));
                                canvas.drawRoundRect(new RectF(getBounds()), i3, i3, this.b);
                            }
                        });
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                if (d.has("btnBgColor1") && d.has("btnBgColor2")) {
                    String string10 = d.getString("btnBgColor1");
                    String string11 = d.getString("btnBgColor2");
                    try {
                        if (!string10.startsWith("#")) {
                            string10 = "#" + string10;
                        }
                        if (!string11.startsWith("#")) {
                            string11 = "#" + string11;
                        }
                        int parseColor = Color.parseColor(string10);
                        int parseColor2 = Color.parseColor(string11);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColors(new int[]{parseColor, parseColor2});
                        gradientDrawable.setCornerRadius(i3);
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                        this.k.setBackground(gradientDrawable);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                } else if (com.meituan.android.yoda.config.ui.d.a().r() && !d.has("btnBgColor") && this.l != null) {
                    this.l.a((Button) this.k);
                }
                if (d.has("userProtocolBubbleText") && this.r != null) {
                    String string12 = d.getString("userProtocolBubbleText");
                    if (!TextUtils.isEmpty(string12)) {
                        this.r.setText(string12);
                    }
                }
                if (d.has("userProtocolUrlText") && this.s != null) {
                    String string13 = d.getString("userProtocolUrlText");
                    if (!TextUtils.isEmpty(string13)) {
                        this.s.setText(string13);
                    }
                }
                if (d.has("userProtocolUrlTextColor")) {
                    if (this.s != null) {
                        String string14 = d.getString("userProtocolUrlTextColor");
                        if (!TextUtils.isEmpty(string14) && !string14.startsWith("#")) {
                            try {
                                this.s.setTextColor(Color.parseColor("#" + string14));
                            } catch (Exception unused) {
                                this.s.setTextColor(Color.parseColor("#FE8C00"));
                            }
                        }
                    }
                } else if (com.meituan.android.yoda.config.ui.d.a().r() && this.l != null) {
                    int b2 = com.meituan.android.yoda.util.x.b(com.meituan.android.yoda.config.ui.d.a().p(), 1);
                    if (this.s != null && b2 != -1) {
                        this.s.setTextColor(b2);
                    }
                }
            } catch (Exception e10) {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "initView, requestCode = " + this.m + ", getUIConfig exception = " + e10.getMessage(), true);
                if (this.l != null) {
                    this.l.a("yoda_face_guide_launch_status", "face_fragment1", true, 706);
                    this.l.d("yoda_face_guide_launch_status", "face_fragment1");
                }
                e10.printStackTrace();
                return;
            }
        }
        if (this.l != null) {
            this.l.d("yoda_face_guide_launch_status", "face_fragment1");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980f85c21d00ed6f5f69fd268d124238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980f85c21d00ed6f5f69fd268d124238");
            return;
        }
        this.t = false;
        if (this.u != null) {
            this.u.removeCallbacks(this.x);
            this.u = null;
        }
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c75236b4900ee73d820d8018e4011bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c75236b4900ee73d820d8018e4011bd");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onResume, requestCode = " + this.m, true);
        String generatePageInfoKey = AppUtil.generatePageInfoKey(this);
        Statistics.getChannel("techportal").writePageView(generatePageInfoKey, "c_c3ai13ne", this.b);
        Statistics.getChannel("techportal").writeModelView(generatePageInfoKey, "b_techportal_kj984c63_mv", this.b, "c_c3ai13ne");
        super.onResume();
        if (this.k == null || this.k.getVisibility() == 0 || this.w || this.u == null || this.x == null) {
            return;
        }
        this.u.postDelayed(this.x, 1000L);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1aa62a96f702cfd6253e02e663febeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1aa62a96f702cfd6253e02e663febeb");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onPause, requestCode = " + this.m, true);
        Statistics.getChannel("techportal").writePageDisappear(AppUtil.generatePageInfoKey(this), "c_c3ai13ne", this.b);
        super.onPause();
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment1 faceDetectionSubFragment1, View view) {
        Object[] objArr = {faceDetectionSubFragment1, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aa6094fe98e8966d41ca1d8a38fbf5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aa6094fe98e8966d41ca1d8a38fbf5e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment1, changeQuickRedirect2, false, "53f0623dd51ddc3fe61732f066d4f1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment1, changeQuickRedirect2, false, "53f0623dd51ddc3fe61732f066d4f1b5");
        } else if (faceDetectionSubFragment1.l == null || faceDetectionSubFragment1.l.g == null) {
        } else {
            JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
            String str = "http://verify.meituan.com/faceProtocol";
            if (d != null && d.has("userProtocolUrl")) {
                try {
                    String string = d.getString("userProtocolUrl");
                    if (TextUtils.isEmpty(string)) {
                        string = "http://verify.meituan.com/faceProtocol";
                    }
                    str = string;
                } catch (JSONException unused) {
                    str = "http://verify.meituan.com/faceProtocol";
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("wenview_url", str);
            SimpleWebViewFragment simpleWebViewFragment = new SimpleWebViewFragment();
            simpleWebViewFragment.setArguments(bundle);
            faceDetectionSubFragment1.l.p.b(simpleWebViewFragment, "protocol_webview_fragment");
        }
    }

    public static /* synthetic */ void a(FaceDetectionSubFragment1 faceDetectionSubFragment1, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {faceDetectionSubFragment1, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b88ab1b853398756884e3b7f311ad980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b88ab1b853398756884e3b7f311ad980");
            return;
        }
        faceDetectionSubFragment1.r.setVisibility(z ? 4 : 0);
        faceDetectionSubFragment1.k.setEnabled(z);
        if (faceDetectionSubFragment1.v) {
            faceDetectionSubFragment1.a(faceDetectionSubFragment1.k, z);
        }
        if (z) {
            faceDetectionSubFragment1.k.setContentDescription(faceDetectionSubFragment1.getString(R.string.yoda_face_verify_start_content_des, faceDetectionSubFragment1.k.getText()));
            faceDetectionSubFragment1.q.setContentDescription(faceDetectionSubFragment1.getString(R.string.yoda_face_verify_bubble_tip_checked_content_des));
            return;
        }
        faceDetectionSubFragment1.k.setContentDescription(faceDetectionSubFragment1.getString(R.string.yoda_face_start_verify_btn_not_provision_content_des));
        faceDetectionSubFragment1.q.setContentDescription(faceDetectionSubFragment1.getString(R.string.yoda_face_verify_bubble_tip_not_check_content_des));
    }

    private void a(AppCompatCheckBox appCompatCheckBox) {
        Object[] objArr = {appCompatCheckBox};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2ed12a5bb175b2eea52e594d7f6c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2ed12a5bb175b2eea52e594d7f6c94");
        } else if (appCompatCheckBox != null && com.meituan.android.yoda.config.ui.d.a().r()) {
            try {
                int b = com.meituan.android.yoda.util.x.b(com.meituan.android.yoda.config.ui.d.a().p(), 1);
                if (b != -1) {
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842912}, com.meituan.android.yoda.util.i.a(com.meituan.android.yoda.util.i.a(com.meituan.android.yoda.util.x.c((int) R.drawable.yoda_face_protocol_checkbox_checked)), b));
                    stateListDrawable.addState(new int[]{-16842912}, com.meituan.android.yoda.util.x.c((int) R.drawable.yoda_faec_protocol_checkbox_unchecked));
                    appCompatCheckBox.setButtonDrawable(stateListDrawable);
                }
            } catch (Exception e) {
                com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "configBusinessUICheckBox exception " + e.getMessage(), true);
            }
        }
    }

    private void a(Button button, boolean z) {
        Object[] objArr = {button, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb3f89b59fd72711fc978b1b211729b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb3f89b59fd72711fc978b1b211729b");
        } else if (button == null || !com.meituan.android.yoda.config.ui.d.a().s() || this.l == null) {
        } else {
            int b = com.meituan.android.yoda.util.x.b(com.meituan.android.yoda.config.ui.d.a().q(), 3);
            int b2 = com.meituan.android.yoda.util.x.b(com.meituan.android.yoda.config.ui.d.a().q(), 2);
            if (z) {
                button.setTextColor(b2);
            } else {
                button.setTextColor(b);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2221db7ac5233682d925138c559a86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2221db7ac5233682d925138c559a86a");
            return;
        }
        super.onAttach(context);
        this.l = (FaceDetectionFragment) getParentFragment();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fec126175cfab3b4e64900294df5b12", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fec126175cfab3b4e64900294df5b12");
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caaaaaf2685d2ba25fcc6f800413608e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caaaaaf2685d2ba25fcc6f800413608e");
        } else if (this.d && !this.p.isChecked()) {
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onClick, requestCode = " + this.m + ", do not read legal.", true);
        } else {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(this);
            com.meituan.android.yoda.util.t.a();
            Statistics.getChannel("techportal").writeModelClick(generatePageInfoKey, "b_ze9kvh93", this.b, "c_c3ai13ne");
            if (this.l != null) {
                this.l.c("yoda_face_verify_page_launch", "face_fragment2");
            }
            if (Privacy.createPermissionGuard().a(getContext(), PermissionGuard.PERMISSION_CAMERA, "jcyf-3e2361e8b87eaf2d") > 0) {
                this.l.p.b(FaceDetectionSubFragment2.a(this.m, this.n, this.o), "face_fragment2");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag1", "onClick, requestCode = " + this.m + ", need requestPermission.", true);
            Privacy.createPermissionGuard().a((Activity) getActivity(), PermissionGuard.PERMISSION_CAMERA, "jcyf-3e2361e8b87eaf2d", (com.meituan.android.privacy.interfaces.d) this.y);
        }
    }
}
