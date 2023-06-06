package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.identifycardrecognizer.PhotoSelectorActivity;
import com.meituan.android.identifycardrecognizer.widgets.IdCardOcrCaptureClipView;
import com.meituan.android.identifycardrecognizer.widgets.a;
import com.meituan.android.identifycardrecognizer.widgets.rotate.RotateImageView;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseCaptureFragment extends PayBaseFragment implements View.OnClickListener, com.meituan.android.privacy.interfaces.g {
    public static ChangeQuickRedirect a;
    protected RotateImageView b;
    protected RotateImageView c;
    protected RotateImageView d;
    protected RotateImageView e;
    protected View f;
    protected View g;
    protected RotateImageView h;
    protected IdCardOcrCaptureClipView i;
    protected FrameLayout j;
    public com.meituan.android.identifycardrecognizer.widgets.a k;
    protected Camera l;
    protected final Point m;
    protected int n;
    protected int o;
    protected int p;
    protected String q;
    protected OrientationEventListener r;
    protected int s;
    protected boolean t;
    private int u;
    private String v;

    public abstract Bitmap a(byte[] bArr);

    public abstract void a(String str);

    public abstract int c();

    public BaseCaptureFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c30aa7645a6bd38e986308a42d8e838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c30aa7645a6bd38e986308a42d8e838");
            return;
        }
        this.m = new Point();
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.v = "jf-a46271f439dbd2ff";
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296aeae34c8b04eec5162bfd828b17c8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296aeae34c8b04eec5162bfd828b17c8") : layoutInflater.inflate(R.layout.identifycard_recognizer_fragment_capture, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5445d22724ee384bcac9063c1dfef16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5445d22724ee384bcac9063c1dfef16a");
            return;
        }
        super.onViewCreated(view, bundle);
        if (getActivity() == null) {
            return;
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", new a.c().a("message", "无可用摄像头").b);
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) "没有可用的摄像头");
            getActivity().finish();
            return;
        }
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_onCreate").a("message", e.getMessage()).b);
            }
            if (cameraInfo.facing == 1) {
                this.o = i;
            } else {
                this.n = i;
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            getActivity().getWindowManager().getDefaultDisplay().getRealSize(this.m);
        } else {
            getActivity().getWindowManager().getDefaultDisplay().getSize(this.m);
        }
        if (getArguments() != null) {
            this.q = getArguments().getString("outputDir");
        }
        if (TextUtils.isEmpty(this.q) && getActivity() != null) {
            File file = new File(q.a(getContext(), "jinrong_cips", "", u.d), "meituan_idcard_ocr/pic");
            file.mkdirs();
            this.q = file.toString();
        }
        this.f = view.findViewById(R.id.root_container);
        this.g = view.findViewById(R.id.bottom_layout);
        this.e = (RotateImageView) view.findViewById(R.id.photo_album);
        this.d = (RotateImageView) view.findViewById(R.id.img_flash);
        this.c = (RotateImageView) view.findViewById(R.id.img_take_pic);
        this.b = (RotateImageView) view.findViewById(R.id.img_cancel);
        this.h = (RotateImageView) view.findViewById(R.id.img_mask);
        this.i = (IdCardOcrCaptureClipView) view.findViewById(R.id.ocr_clipview);
        this.j = (FrameLayout) view.findViewById(R.id.camera_preview_container);
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.c.setVisibility(0);
        this.t = getActivity().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        if (this.t) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        this.r = new OrientationEventListener(getContext()) { // from class: com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf7f45e370d46fc001d3a80e92781391", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf7f45e370d46fc001d3a80e92781391");
                    return;
                }
                int i3 = BaseCaptureFragment.this.s;
                if (i2 == -1) {
                    return;
                }
                if (60 <= i2 && i2 < 120) {
                    BaseCaptureFragment.this.s = 90;
                    BaseCaptureFragment.this.u = 1;
                } else if (150 <= i2 && i2 < 210) {
                    BaseCaptureFragment.this.s = TXLiveConstants.RENDER_ROTATION_180;
                    BaseCaptureFragment.this.u = 2;
                } else if (240 <= i2 && i2 < 300) {
                    BaseCaptureFragment.this.s = 270;
                    BaseCaptureFragment.this.u = 3;
                } else if (i2 >= 330 || i2 < 30) {
                    BaseCaptureFragment.this.s = 0;
                    BaseCaptureFragment.this.u = 0;
                }
                if (i3 != BaseCaptureFragment.this.s) {
                    BaseCaptureFragment.this.i.setOrientationChanged(BaseCaptureFragment.this.u);
                    BaseCaptureFragment.this.a(BaseCaptureFragment.this.s);
                }
            }
        };
        if (Privacy.createPermissionGuard() != null && Privacy.createPermissionGuard().a(getActivity(), PermissionGuard.PERMISSION_CAMERA, this.v) <= 0) {
            Privacy.createPermissionGuard().a((Activity) getActivity(), PermissionGuard.PERMISSION_CAMERA, this.v, (com.meituan.android.privacy.interfaces.d) this);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e79a082ef81f4992067337a97a53f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e79a082ef81f4992067337a97a53f3");
            return;
        }
        float f = 360 - i;
        this.b.setRotation(f);
        this.c.setRotation(f);
        this.d.setRotation(f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c01a31ac544e4e952e8905dfa0fd969", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c01a31ac544e4e952e8905dfa0fd969");
            return;
        }
        int id = view.getId();
        if (id == R.id.img_take_pic) {
            com.meituan.android.paybase.common.analyse.a.a(d(), "点击拍摄", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afef6aa0844ac1e1b6298e09b25f25a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afef6aa0844ac1e1b6298e09b25f25a0");
                return;
            }
            switch (c()) {
                case 11:
                    com.meituan.android.paybase.common.analyse.a.a("b_0bbjw1c7", "身份验证拍摄页（正面）_点击拍摄", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).b, a.EnumC0329a.CLICK, -1);
                    break;
                case 12:
                    com.meituan.android.paybase.common.analyse.a.a("b_ag7k0drn", "身份验证拍摄页（反面）_点击拍摄", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).b, a.EnumC0329a.CLICK, -1);
                    break;
            }
            if (this.k == null || !this.k.d) {
                com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", new a.c().a("message", "相机出现异常").b);
                com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) "相机出现异常,请重新打开");
                return;
            }
            this.c.setEnabled(false);
            Camera.PictureCallback a2 = com.meituan.android.identifycardrecognizer.fragment.a.a(this);
            if (this.l != null) {
                this.l.takePicture(null, null, a2);
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", new a.c().a("message", "相机出现异常").b);
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) "相机出现异常,请重新打开");
            this.c.setEnabled(true);
        } else if (id == R.id.img_cancel) {
            h();
        } else if (id != R.id.img_flash) {
            if (id == R.id.photo_album) {
                com.meituan.android.paybase.common.analyse.a.a(d(), "点击去相册", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                PhotoSelectorActivity.a((Activity) getActivity(), 1, 2, 2, true);
            }
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "efa07293e46ad03d63a9d5fab26fafce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "efa07293e46ad03d63a9d5fab26fafce");
            } else if (this.l != null && this.t) {
                this.d.setVisibility(0);
                try {
                    Camera.Parameters parameters = this.l.getParameters();
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.d.setImageResource(R.drawable.identifycard_recognizer_icon_flash_on);
                    } else {
                        getActivity().getWindow().addFlags(128);
                        parameters.setFlashMode("torch");
                        this.d.setImageResource(R.drawable.identifycard_recognizer_icon_flash_off);
                    }
                    try {
                        this.l.setParameters(parameters);
                    } catch (Exception e) {
                        com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_changeFlashLight_camera.setParameters").a("message", e.getMessage()).b);
                    }
                } catch (Exception e2) {
                    com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_changeFlashLight_camera.getParameters").a("message", e2.getMessage()).b);
                }
            } else {
                this.d.setVisibility(8);
            }
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62831d8e138ffdea2dd93a17e1c9223", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62831d8e138ffdea2dd93a17e1c9223") : getClass().getSimpleName();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74fe776fd5a9dfefd0bb53d872f1dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74fe776fd5a9dfefd0bb53d872f1dec");
            return;
        }
        super.onResume();
        int i = this.p;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4d2f66e3a99da7425faf09c76f14579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4d2f66e3a99da7425faf09c76f14579");
        } else if (Privacy.createPermissionGuard() != null && Privacy.createPermissionGuard().a(getActivity(), PermissionGuard.PERMISSION_CAMERA, this.v) > 0) {
            try {
                this.l = Camera.open(i == -1 ? 0 : i);
                Camera.Parameters parameters = this.l.getParameters();
                Camera.Size a2 = a(parameters.getSupportedPreviewSizes(), this.m.y, this.m.x, 1920, 1080, this.m.y, this.m.x);
                parameters.setPreviewSize(a2.width, a2.height);
                Camera.Size a3 = a(parameters.getSupportedPictureSizes(), this.m.y, this.m.x, 1920, 1080, this.m.y, this.m.x);
                parameters.setPictureSize(a3.width, a3.height);
                if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                }
                if (this.t) {
                    parameters.setFlashMode("off");
                }
                this.l.setParameters(parameters);
                this.l.setDisplayOrientation(b(i));
                this.d.setImageResource(R.drawable.identifycard_recognizer_icon_flash_on);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.l.enableShutterSound(false);
                }
                this.k = new com.meituan.android.identifycardrecognizer.widgets.a(getContext(), this.l, a2, new a.InterfaceC0262a() { // from class: com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.identifycardrecognizer.widgets.a.InterfaceC0262a
                    public final void a(float[] fArr) {
                        Object[] objArr3 = {fArr};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3fa279ef32f205c3297376e275794a5e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3fa279ef32f205c3297376e275794a5e");
                        } else if (BaseCaptureFragment.this.l == null || BaseCaptureFragment.this.getActivity() == null || BaseCaptureFragment.this.getActivity().isFinishing()) {
                        } else {
                            try {
                                if ("torch".equals(BaseCaptureFragment.this.l.getParameters().getFlashMode())) {
                                    return;
                                }
                                if (fArr[2] < 0.1f && BaseCaptureFragment.this.t) {
                                    BaseCaptureFragment.this.d.setVisibility(0);
                                } else {
                                    BaseCaptureFragment.this.d.setVisibility(8);
                                }
                            } catch (Exception e) {
                                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_callBack").a("message", e.getMessage()).b);
                            }
                        }
                    }

                    @Override // com.meituan.android.identifycardrecognizer.widgets.a.InterfaceC0262a
                    public final void a(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a4a31f9e0ca4c2bb8f34023aed2210c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a4a31f9e0ca4c2bb8f34023aed2210c");
                        } else if (BaseCaptureFragment.this.l == null || BaseCaptureFragment.this.getActivity() == null || BaseCaptureFragment.this.getActivity().isFinishing()) {
                        }
                    }
                });
                this.j.removeAllViews();
                this.j.addView(this.k, 0);
                this.p = i;
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", new a.c().a("message", "无相机权限").b);
                f();
            }
        }
        this.r.enable();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b47c474c22417daf7f89d5f353eb8d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b47c474c22417daf7f89d5f353eb8d0");
            return;
        }
        super.onPause();
        this.r.disable();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99f8105fa29accbf565e39494c380051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99f8105fa29accbf565e39494c380051");
            return;
        }
        try {
            if (this.l != null) {
                if (this.k != null) {
                    this.k.surfaceDestroyed(this.k.getHolder());
                }
                this.l.stopPreview();
                this.l.release();
                this.l = null;
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_closeCamera").a("message", e.getMessage()).b);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f9c0e8b6e8f00051da44e2442478f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f9c0e8b6e8f00051da44e2442478f1");
            return;
        }
        super.onDestroy();
        this.r = null;
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567220885a8bcecb8aeaa2f17663a6e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567220885a8bcecb8aeaa2f17663a6e7");
        } else if (isDetached() || isRemoving() || !PermissionGuard.PERMISSION_CAMERA.equals(str) || i > 0) {
        } else {
            f();
            com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", new a.c().a("message", "无相机权限").b);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10edbe852a75de5aa793b5f8325f4b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10edbe852a75de5aa793b5f8325f4b6d");
            return;
        }
        com.meituan.android.identifycardrecognizer.widgets.a aVar = this.k;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.identifycardrecognizer.widgets.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d280f924f243f190774dcd0d3f436ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d280f924f243f190774dcd0d3f436ed8");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        } else {
            aVar.b = i;
            aVar.c = i2;
            aVar.requestLayout();
        }
    }

    public static /* synthetic */ void a(BaseCaptureFragment baseCaptureFragment, byte[] bArr, Camera camera) {
        Object[] objArr = {baseCaptureFragment, bArr, camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb2c93a8fcb9a4f192f3f8f77db5f311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb2c93a8fcb9a4f192f3f8f77db5f311");
            return;
        }
        camera.cancelAutoFocus();
        new b(baseCaptureFragment.q, baseCaptureFragment).b((Object[]) new byte[][]{bArr});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends com.meituan.android.paybase.asynctask.a<byte[], Void, String> {
        public static ChangeQuickRedirect a;
        private String b;
        private WeakReference<BaseCaptureFragment> c;
        private File d;

        @Override // com.meituan.android.paybase.asynctask.b
        public final /* synthetic */ void a(Object obj) {
            String str = (String) obj;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6fd6ca42d8eb54ebf50334f7aa21ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6fd6ca42d8eb54ebf50334f7aa21ca");
                return;
            }
            BaseCaptureFragment baseCaptureFragment = this.c.get();
            if (baseCaptureFragment == null || baseCaptureFragment.getActivity() == null || baseCaptureFragment.getActivity().isFinishing()) {
                return;
            }
            if (str == null) {
                com.meituan.android.paybase.common.analyse.a.a("b_cyf9rzch", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).b);
                baseCaptureFragment.a(this.d.getPath());
            } else {
                a.c cVar = new a.c();
                com.meituan.android.paybase.common.analyse.a.a("b_69pzdkvy", cVar.a("message", "其他异常：" + str).a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).b);
                com.meituan.android.paybase.dialog.e.a((Activity) baseCaptureFragment.getActivity(), (Object) str);
            }
            baseCaptureFragment.b();
        }

        public b(String str, BaseCaptureFragment baseCaptureFragment) {
            Object[] objArr = {str, baseCaptureFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4793bf4e038e785922e0c188e2e17d22", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4793bf4e038e785922e0c188e2e17d22");
                return;
            }
            this.b = str;
            this.c = new WeakReference<>(baseCaptureFragment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meituan.android.paybase.asynctask.b
        public String a(byte[]... bArr) {
            boolean z;
            FileOutputStream fileOutputStream;
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3496b840b53ec284dcafc7a9a8abd536", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3496b840b53ec284dcafc7a9a8abd536");
            }
            if (bArr[0] == null || bArr[0].length == 0) {
                return "图片数据获取失败";
            }
            new File(this.b).mkdirs();
            String str = this.b;
            long length = bArr[0].length;
            Object[] objArr2 = {str, new Long(length)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b7a84283a3587cfb7fa4287dad61833", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b7a84283a3587cfb7fa4287dad61833")).booleanValue();
            } else {
                if (!TextUtils.isEmpty(str)) {
                    StatFs statFs = new StatFs(str);
                    if (statFs.getBlockSize() * statFs.getAvailableBlocks() * 0.9d >= length) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                BaseCaptureFragment baseCaptureFragment = this.c.get();
                FileOutputStream fileOutputStream2 = null;
                Bitmap a2 = (baseCaptureFragment == null || baseCaptureFragment.getActivity().isFinishing()) ? null : baseCaptureFragment.a(bArr[0]);
                if (a2 == null) {
                    return "图片创建失败";
                }
                this.d = new File(this.b, System.currentTimeMillis() + ".jpg");
                try {
                    try {
                        fileOutputStream = new FileOutputStream(this.d);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    a2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveImageTask_doInBackground").a("message", e2.getMessage()).b);
                    }
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveImageTask_doInBackground").a("message", e.getMessage()).b);
                    this.d.delete();
                    String message = e.getMessage();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveImageTask_doInBackground").a("message", e4.getMessage()).b);
                        }
                    }
                    return message;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    Throwable th3 = th;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveImageTask_doInBackground").a("message", e5.getMessage()).b);
                        }
                    }
                    throw th3;
                }
            }
            return "存储空间已满,请清理后再拍照";
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58055d7fd90ab3a7432e185d549436f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58055d7fd90ab3a7432e185d549436f2");
        } else {
            this.c.setEnabled(true);
        }
    }

    public final Bitmap a(byte[] bArr, int i, int i2, int i3, int i4, boolean z, int i5) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366df0568deee8e96930368e9fe3d0cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366df0568deee8e96930368e9fe3d0cb");
        }
        Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        matrix.reset();
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
            matrix.postRotate(i5);
        } else {
            matrix.postRotate(i5);
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, a2.getWidth(), a2.getHeight(), matrix, true);
        if (i3 * i4 <= 0 || createBitmap.getWidth() <= i3 || createBitmap.getHeight() <= i4 || i + i3 > createBitmap.getWidth() || i2 + i4 > createBitmap.getHeight()) {
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i, i2, i3, i4);
        createBitmap.recycle();
        return createBitmap2;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> b2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f34218cb8a0809736a9adbc9480cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f34218cb8a0809736a9adbc9480cb6");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2 && intent != null && (b2 = com.sankuai.waimai.platform.utils.f.b(intent, "PHOTO_SELECTED_PATHS")) != null && !b2.isEmpty()) {
            a(b2.get(0));
        }
        com.meituan.android.privacy.aop.a.f();
    }

    public final int b(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "194cfab495fdf1933eaddbf39b0e0b16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "194cfab495fdf1933eaddbf39b0e0b16")).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrCaptureActivity_getCameraDisplayOrientation").a("message", e.getMessage()).b);
        }
        switch (getActivity() == null ? 0 : getActivity().getWindowManager().getDefaultDisplay().getRotation()) {
            case 1:
                i2 = 90;
                break;
            case 2:
                i2 = TXLiveConstants.RENDER_ROTATION_180;
                break;
            case 3:
                i2 = 270;
                break;
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    private Camera.Size a(List<Camera.Size> list, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 1920;
        int i8 = 1080;
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), 1920, 1080, Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4d80e352e86a1870c28dc27befcffa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4d80e352e86a1870c28dc27befcffa");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Camera.Size size : list) {
            if (size.width <= i7 && size.height <= i8) {
                double d = i6 / i5;
                if (size.height <= size.width * (d + 0.1d) && size.height >= size.width * (d - 0.1d)) {
                    if (size.width >= i && size.height >= i2) {
                        arrayList.add(size);
                    }
                    arrayList2.add(size);
                }
            }
            i7 = 1920;
            i8 = 1080;
        }
        if (!arrayList.isEmpty()) {
            return (Camera.Size) Collections.min(arrayList, new a());
        }
        if (!arrayList2.isEmpty()) {
            return (Camera.Size) Collections.max(arrayList2, new a());
        }
        return list.get(list.size() / 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Serializable, Comparator<Camera.Size> {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = -1020369447098026852L;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            Object[] objArr = {size3, size4};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab1d9ff8206d51913eee3c7065bbf34", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab1d9ff8206d51913eee3c7065bbf34")).intValue() : Long.signum((size3.width * size3.height) - (size4.width * size4.height));
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dc7b7851d99f52cca94dd638d42444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dc7b7851d99f52cca94dd638d42444");
        } else if (getActivity() == null) {
        } else {
            new PayDialog.a(getActivity()).c(getString(R.string.identifycard_recognizer_camera_message)).a(getString(R.string.paybase__permission_btn_cancel), com.meituan.android.identifycardrecognizer.fragment.b.a(this)).b(getString(R.string.paybase__permission_btn_ok), c.a(this)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
        }
    }

    public static /* synthetic */ void b(BaseCaptureFragment baseCaptureFragment, Dialog dialog) {
        Object[] objArr = {baseCaptureFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3e1854a42866835d04f7b2fff07cddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3e1854a42866835d04f7b2fff07cddd");
        } else {
            baseCaptureFragment.getActivity().finish();
        }
    }

    public static /* synthetic */ void a(BaseCaptureFragment baseCaptureFragment, Dialog dialog) {
        Object[] objArr = {baseCaptureFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2d0eaeeb30de3b7c4140e85d8c57f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2d0eaeeb30de3b7c4140e85d8c57f8b");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", baseCaptureFragment.getActivity().getPackageName(), null));
        baseCaptureFragment.startActivity(intent);
        baseCaptureFragment.getActivity().finish();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62813470035ca64f94b8ef5d69b4f29a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62813470035ca64f94b8ef5d69b4f29a")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_4argjh9h", (Map<String, Object>) null);
        return super.h();
    }
}
