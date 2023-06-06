package com.meituan.android.identifycardrecognizer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.identifycardrecognizer.bean.ImageOcrResult;
import com.meituan.android.identifycardrecognizer.bean.UploadImgResult;
import com.meituan.android.identifycardrecognizer.fragment.OcrFragment;
import com.meituan.android.identifycardrecognizer.fragment.PreviewFragment;
import com.meituan.android.identifycardrecognizer.request.IdCardOcrRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.progressdialog.MTProgressDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OcrCaptureActivity extends PayBaseActivity implements g {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String q;
    private com.meituan.android.paybase.retrofit.b r;

    public OcrCaptureActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f8ca78b2c4d239aa4860b846921bd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f8ca78b2c4d239aa4860b846921bd4");
        } else {
            this.r = new com.meituan.android.paybase.retrofit.b() { // from class: com.meituan.android.identifycardrecognizer.OcrCaptureActivity.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.retrofit.b
                public final void onRequestFinal(int i) {
                }

                @Override // com.meituan.android.paybase.retrofit.b
                public final void onRequestStart(int i) {
                }

                @Override // com.meituan.android.paybase.retrofit.b
                public final void onRequestSucc(int i, Object obj) {
                    Object[] objArr2 = {Integer.valueOf(i), obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15425f5dc4a61e63f53bf7438b1cd8b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15425f5dc4a61e63f53bf7438b1cd8b6");
                        return;
                    }
                    int intValue = TextUtils.isEmpty(OcrCaptureActivity.this.h) ? 0 : Integer.valueOf(OcrCaptureActivity.this.h).intValue();
                    long parseLong = TextUtils.isEmpty(OcrCaptureActivity.this.i) ? 0L : Long.parseLong(OcrCaptureActivity.this.i);
                    if (i != 40) {
                        if (i == 41) {
                            OcrCaptureActivity.this.A_();
                            com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognizesuccess_sc", null);
                            if (!TextUtils.equals(OcrCaptureActivity.this.d, "1") && !TextUtils.equals(OcrCaptureActivity.this.d, "101")) {
                                if (TextUtils.equals(OcrCaptureActivity.this.d, "2")) {
                                    com.meituan.android.paybase.common.analyse.a.a("b_pay_vefvkl45_mc", "c_pay_a67smm8e", OcrCaptureActivity.this.f(), a.EnumC0329a.CLICK, 0);
                                    OcrCaptureActivity.a(OcrCaptureActivity.this, "data", ((ImageOcrResult) obj).getPassportInfo());
                                    return;
                                }
                                return;
                            }
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_0gwf34bo_mc", "c_pay_uwp9z24s", OcrCaptureActivity.this.f(), a.EnumC0329a.CLICK, 0);
                            OcrCaptureActivity.a(OcrCaptureActivity.this, "data", ((ImageOcrResult) obj).getIdentifyInfo());
                            return;
                        }
                        return;
                    }
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_uploadsuccess_sc", null);
                    UploadImgResult uploadImgResult = (UploadImgResult) obj;
                    OcrCaptureActivity.this.A_();
                    if (!TextUtils.equals(OcrCaptureActivity.this.d, "1") && !TextUtils.equals(OcrCaptureActivity.this.d, "101")) {
                        if (TextUtils.equals(OcrCaptureActivity.this.d, "2")) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_4y4jd1e7_mc", "c_pay_a67smm8e", OcrCaptureActivity.this.f(), a.EnumC0329a.CLICK, 0);
                        }
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_xcw614cb_mc", "c_pay_uwp9z24s", OcrCaptureActivity.this.f(), a.EnumC0329a.CLICK, 0);
                    }
                    if (TextUtils.isEmpty(uploadImgResult.getUrl())) {
                        return;
                    }
                    String e = OcrCaptureActivity.this.e();
                    String a2 = com.meituan.android.identifycardrecognizer.utils.b.a();
                    com.meituan.android.paybase.common.analyse.a.a(e, "照片上传成功", a2, "type=" + OcrCaptureActivity.this.d);
                    if (OcrCaptureActivity.this.b) {
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognize_sc", null);
                        OcrCaptureActivity.this.a(true, R.drawable.identifycard_recognizer_upload_loading, "识别中");
                        ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, OcrCaptureActivity.this.r, 41)).imageOcr(OcrCaptureActivity.this.d, intValue, uploadImgResult.getUrl(), "", parseLong, "[]");
                        return;
                    }
                    OcrCaptureActivity.a(OcrCaptureActivity.this, "url", uploadImgResult.getUrl());
                }

                @Override // com.meituan.android.paybase.retrofit.b
                public final void onRequestException(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "764f69c20db8a34779afb0eb576a7fa7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "764f69c20db8a34779afb0eb576a7fa7");
                        return;
                    }
                    boolean z = exc instanceof PayException;
                    int code = z ? ((PayException) exc).getCode() : 0;
                    HashMap<String, Object> f = OcrCaptureActivity.this.f();
                    f.put("errorCode", Integer.valueOf(code));
                    f.put("message", exc.getMessage());
                    OcrCaptureActivity.this.A_();
                    if (i == 40) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("errorCode", Integer.valueOf(code));
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_uploadfail_sc", hashMap);
                        OcrCaptureActivity.b(OcrCaptureActivity.this, z ? exc.getMessage() : null);
                        if (!TextUtils.equals(OcrCaptureActivity.this.d, "1") && !TextUtils.equals(OcrCaptureActivity.this.d, "101")) {
                            if (TextUtils.equals(OcrCaptureActivity.this.d, "2")) {
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_8o4pp4v0_mc", "c_pay_a67smm8e", f, a.EnumC0329a.CLICK, 0);
                                return;
                            }
                            return;
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_umd1rhn9_mc", "c_pay_uwp9z24s", f, a.EnumC0329a.CLICK, 0);
                    } else if (i == 41) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("errorCode", Integer.valueOf(code));
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognizefail_sc", hashMap2);
                        String str = "";
                        if (!TextUtils.equals(OcrCaptureActivity.this.d, "1") && !TextUtils.equals(OcrCaptureActivity.this.d, "101")) {
                            if (TextUtils.equals(OcrCaptureActivity.this.d, "2")) {
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_2r936zfe_mc", "c_pay_a67smm8e", f, a.EnumC0329a.CLICK, 0);
                                str = TextUtils.isEmpty(exc.getMessage()) ? OcrCaptureActivity.this.getString(R.string.identifycard_recognizer_can_not_recognize_id_card) : exc.getMessage();
                            }
                        } else {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_fzkvmxb4_mc", "c_pay_uwp9z24s", f, a.EnumC0329a.CLICK, 0);
                            str = TextUtils.isEmpty(exc.getMessage()) ? OcrCaptureActivity.this.getString(R.string.identifycard_recognizer_can_not_recognize_id_card) : exc.getMessage();
                        }
                        OcrCaptureActivity.c(OcrCaptureActivity.this, str);
                    }
                }
            };
        }
    }

    public static /* synthetic */ void a(OcrCaptureActivity ocrCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, ocrCaptureActivity, changeQuickRedirect, false, "45ea0146c10164fdd77ec1f5f281e864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, ocrCaptureActivity, changeQuickRedirect, false, "45ea0146c10164fdd77ec1f5f281e864");
            return;
        }
        int intValue = TextUtils.isEmpty(ocrCaptureActivity.h) ? 0 : Integer.valueOf(ocrCaptureActivity.h).intValue();
        try {
            com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_upload_sc", null);
            ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, ocrCaptureActivity.r, 40)).uploadImages(ocrCaptureActivity.d, intValue, com.meituan.android.paybase.utils.c.b(str));
        } catch (IOException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OcrCaptureActivity_upload", (Map<String, Object>) null);
        }
    }

    public static /* synthetic */ void a(OcrCaptureActivity ocrCaptureActivity, String str, Serializable serializable) {
        Object[] objArr = {str, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, ocrCaptureActivity, changeQuickRedirect, false, "94467d02db13bd41ccefd48436af9064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, ocrCaptureActivity, changeQuickRedirect, false, "94467d02db13bd41ccefd48436af9064");
            return;
        }
        if (!TextUtils.isEmpty(ocrCaptureActivity.q)) {
            al.a(ocrCaptureActivity, ocrCaptureActivity.q);
        }
        Intent intent = new Intent();
        intent.putExtra("status", "success");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(str, serializable);
        }
        ocrCaptureActivity.setResult(-1, intent);
        ocrCaptureActivity.finish();
    }

    public static /* synthetic */ void b(OcrCaptureActivity ocrCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, ocrCaptureActivity, changeQuickRedirect, false, "15755353854847a052522a6052c95e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, ocrCaptureActivity, changeQuickRedirect, false, "15755353854847a052522a6052c95e81");
            return;
        }
        BasePayDialog.b c = new PayDialog.a(ocrCaptureActivity).c(TextUtils.isEmpty(str) ? ocrCaptureActivity.getString(R.string.identifycard_recognizer_photo_upload_fail) : str);
        String string = ocrCaptureActivity.getString(R.string.identifycard_recognizer_cancel);
        Object[] objArr2 = {ocrCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        BasePayDialog.b a2 = c.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1ea54fd70b3cd7cf0647ea2425a7d146", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1ea54fd70b3cd7cf0647ea2425a7d146") : new d(ocrCaptureActivity));
        String string2 = ocrCaptureActivity.getString(R.string.identifycard_recognizer_retry);
        Object[] objArr3 = {ocrCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        a2.b(string2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c21de0ca1b8bcc52be2aecd91d7f77c9", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c21de0ca1b8bcc52be2aecd91d7f77c9") : new e(ocrCaptureActivity)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    public static /* synthetic */ void c(OcrCaptureActivity ocrCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, ocrCaptureActivity, changeQuickRedirect, false, "1857b9029b4bbf306059d01b46f53e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, ocrCaptureActivity, changeQuickRedirect, false, "1857b9029b4bbf306059d01b46f53e84");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = ocrCaptureActivity.getString(R.string.identifycard_recognizer_can_not_recognize_id_card);
        }
        BasePayDialog.b c = new PayDialog.a(ocrCaptureActivity).c(str);
        String string = ocrCaptureActivity.getString(R.string.identifycard_recognizer_recapture);
        Object[] objArr2 = {ocrCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        c.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "16beaa64562668a61f4162610e86b308", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "16beaa64562668a61f4162610e86b308") : new f(ocrCaptureActivity)).a(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73437c928b18f5dad75d9e4a2c49bfb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73437c928b18f5dad75d9e4a2c49bfb0");
            return;
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        setContentView(R.layout.identifycard_recognizer_activity_id_card_capture);
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bf811d104965c7341259712c7206f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bf811d104965c7341259712c7206f0a");
        } else {
            com.meituan.android.identifycardrecognizer.utils.b.b = null;
            com.meituan.android.identifycardrecognizer.utils.b.c = null;
            com.meituan.android.identifycardrecognizer.utils.b.d = null;
            com.meituan.android.identifycardrecognizer.utils.b.e = null;
            com.meituan.android.identifycardrecognizer.utils.a.a(this, null);
            if (getIntent() != null && getIntent().getData() != null) {
                Uri data = getIntent().getData();
                String path = data.getPath();
                this.b = TextUtils.equals(path, "/recognize");
                if (TextUtils.equals(path, "/verify")) {
                    this.b = true;
                    this.c = true;
                }
                this.d = data.getQueryParameter("certificateType");
                this.f = data.getQueryParameter("merchantNo");
                this.g = data.getQueryParameter("extraData");
                this.h = data.getQueryParameter("bizId");
                this.i = data.getQueryParameter("customId");
                this.q = data.getQueryParameter("callbackUrl");
                com.meituan.android.identifycardrecognizer.utils.b.b = this.h;
                com.meituan.android.identifycardrecognizer.utils.b.e = this.i;
                Object[] objArr3 = {path};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ffa7907fc31d353bcabea0a1f7b3563e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ffa7907fc31d353bcabea0a1f7b3563e");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("certificateType", this.d);
                    hashMap.put("certificateMode", path);
                    hashMap.put("mechantNo", this.f);
                    hashMap.put("bizId", com.meituan.android.identifycardrecognizer.utils.b.a());
                    hashMap.put("customerId", com.meituan.android.identifycardrecognizer.utils.b.e);
                    com.meituan.android.identifycardrecognizer.utils.d.a(hashMap);
                }
            }
        }
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_begin_sc", null);
        getSupportFragmentManager().beginTransaction().add(R.id.content, OcrFragment.a(this.d, this.b, this.c)).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b7886b8cff0eaf2b267212362ed769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b7886b8cff0eaf2b267212362ed769");
            return;
        }
        this.e = str;
        getSupportFragmentManager().beginTransaction().replace(R.id.content, PreviewFragment.a(str, 13)).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603dbcc0dba9dedc63acab6618bcc4d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603dbcc0dba9dedc63acab6618bcc4d4");
        } else {
            a(this.e);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed9c09b4644219789e5adc87f5b6138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed9c09b4644219789e5adc87f5b6138");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!new File(str).exists()) {
                com.meituan.android.paybase.common.analyse.a.a("b_fz3ub6e7", (Map<String, Object>) null);
                com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) "文件不存在，请重新拍摄");
                A_();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
                return;
            }
            b(str);
        }
    }

    private void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb01616455e8b040862709e5ebf2eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb01616455e8b040862709e5ebf2eaa");
            return;
        }
        a(true, R.drawable.identifycard_recognizer_upload_loading, "上传中");
        com.meituan.android.identifycardrecognizer.compress.c.a(this).a(str, new com.meituan.android.identifycardrecognizer.compress.b() { // from class: com.meituan.android.identifycardrecognizer.OcrCaptureActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, String str3) {
                Object[] objArr2 = {str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97be26fff0a41b6b5514dda993190a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97be26fff0a41b6b5514dda993190a2");
                    return;
                }
                String e = OcrCaptureActivity.this.e();
                String a2 = com.meituan.android.identifycardrecognizer.utils.b.a();
                com.meituan.android.paybase.common.analyse.a.a(e, "图片压缩成功", a2, "type=" + OcrCaptureActivity.this.d);
                OcrCaptureActivity.a(OcrCaptureActivity.this, str3);
            }

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, Exception exc) {
                Object[] objArr2 = {str2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26085f0a16cc879dcff6a5dc4f4e075d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26085f0a16cc879dcff6a5dc4f4e075d");
                    return;
                }
                String e = OcrCaptureActivity.this.e();
                String a2 = com.meituan.android.identifycardrecognizer.utils.b.a();
                com.meituan.android.paybase.common.analyse.a.a(e, "图片压缩失败", a2, "type=" + OcrCaptureActivity.this.d);
                OcrCaptureActivity.a(OcrCaptureActivity.this, str);
            }
        });
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479952700a4cddcdf2440c3a6d94b3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479952700a4cddcdf2440c3a6d94b3d9");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("status", "fail");
        setResult(-1, intent);
        finish();
    }

    public static /* synthetic */ void c(OcrCaptureActivity ocrCaptureActivity, Dialog dialog) {
        Object[] objArr = {ocrCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37f5d18c2c23062c955c54c95f4268fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37f5d18c2c23062c955c54c95f4268fd");
            return;
        }
        dialog.dismiss();
        ocrCaptureActivity.g();
    }

    public static /* synthetic */ void b(OcrCaptureActivity ocrCaptureActivity, Dialog dialog) {
        Object[] objArr = {ocrCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eff0c150a7bb66731b1628cf962bf1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eff0c150a7bb66731b1628cf962bf1b3");
        } else {
            ocrCaptureActivity.a(ocrCaptureActivity.e);
        }
    }

    public static /* synthetic */ void a(OcrCaptureActivity ocrCaptureActivity, Dialog dialog) {
        Object[] objArr = {ocrCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "059ececfd405d56085284df8ca84d6bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "059ececfd405d56085284df8ca84d6bc");
            return;
        }
        dialog.dismiss();
        ocrCaptureActivity.g();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1218d530de4ef5283cce85562d704e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1218d530de4ef5283cce85562d704e");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i == 2 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381503f732d519d1e81026e48e78ae68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381503f732d519d1e81026e48e78ae68");
        } else if (isFinishing() || this.k) {
        } else {
            if (this.m == null || !this.m.isShowing()) {
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_1);
                }
                this.m = new MTProgressDialog(this, i, str);
                this.m.setCanceledOnTouchOutside(false);
                this.m.setCancelable(z);
                this.m.show();
            }
        }
    }

    public final void A_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfecbc057a850dead5ce949697fab055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfecbc057a850dead5ce949697fab055");
        } else if (isFinishing() || this.k || this.m == null || !this.m.isShowing()) {
        } else {
            this.m.dismiss();
            this.m = null;
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b136f92259ff7b15d3b6ab28b35d5bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b136f92259ff7b15d3b6ab28b35d5bf5");
            return;
        }
        OcrFragment a2 = OcrFragment.a(this.d, this.b, this.c);
        a2.v = false;
        getSupportFragmentManager().beginTransaction().replace(R.id.content, a2).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ee590b3e9caf43c1c4434f79373399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ee590b3e9caf43c1c4434f79373399");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        PayBaseFragment payBaseFragment = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7adcc61ec25b84d80c55ec40f8207c2", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7adcc61ec25b84d80c55ec40f8207c2") : (PayBaseFragment) getSupportFragmentManager().findFragmentById(R.id.content);
        if (payBaseFragment == null || !payBaseFragment.h()) {
            super.onBackPressed();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163dd35b69cd483c8032e380d6baafff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163dd35b69cd483c8032e380d6baafff") : (TextUtils.equals(this.d, "1") || TextUtils.equals(this.d, "101")) ? "c_pay_uwp9z24s" : TextUtils.equals(this.d, "2") ? "c_pay_a67smm8e" : super.e();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final HashMap<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1c1792fdff4c60ae8458fac8bd3edf", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1c1792fdff4c60ae8458fac8bd3edf");
        }
        HashMap<String, Object> f = super.f();
        f.put("needRecognize", Boolean.valueOf(this.b));
        f.put("needVerify", Boolean.valueOf(this.c));
        f.put("merchantNo", this.f);
        f.put("bizId", this.h);
        return f;
    }
}
