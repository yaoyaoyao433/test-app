package com.meituan.android.identifycardrecognizer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.identifycardrecognizer.bean.UploadImgResult;
import com.meituan.android.identifycardrecognizer.fragment.PeopleCaptureFragment;
import com.meituan.android.identifycardrecognizer.fragment.PreviewFragment;
import com.meituan.android.identifycardrecognizer.request.IdCardOcrRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.progressdialog.MTProgressDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.io.File;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PeopleCaptureActivity extends PayBaseActivity implements g {
    public static ChangeQuickRedirect a;
    @MTPayNeedToPersist
    private String b;
    private com.meituan.android.paybase.retrofit.b c;

    public static /* synthetic */ String a(PeopleCaptureActivity peopleCaptureActivity) {
        return "shoot";
    }

    public PeopleCaptureActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f6168466b242d06f8e0e55da2ffd86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f6168466b242d06f8e0e55da2ffd86");
        } else {
            this.c = new com.meituan.android.paybase.retrofit.b() { // from class: com.meituan.android.identifycardrecognizer.PeopleCaptureActivity.2
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64f11d68a47b6504e04a55ed8fdd5544", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64f11d68a47b6504e04a55ed8fdd5544");
                    } else if (i == 60) {
                        PeopleCaptureActivity.this.B_();
                        if (TextUtils.isEmpty(((UploadImgResult) obj).getUrl())) {
                            return;
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_dlvsb96k", "手持上传成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PeopleCaptureActivity.a(PeopleCaptureActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.a.a(PeopleCaptureActivity.this.e(), "手持照片上传成功", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", 200);
                        Intent intent = new Intent();
                        intent.putExtra("status", "success");
                        PeopleCaptureActivity.this.setResult(-1, intent);
                        PeopleCaptureActivity.this.finish();
                    }
                }

                @Override // com.meituan.android.paybase.retrofit.b
                public final void onRequestException(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a03b6ef7cbfac1c4468d8365619045b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a03b6ef7cbfac1c4468d8365619045b5");
                    } else if (i == 60) {
                        com.meituan.android.paybase.common.analyse.a.a(PeopleCaptureActivity.this.e(), "手持照片上传失败", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                        com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_upload_ocr", exc);
                        PeopleCaptureActivity.this.B_();
                        PeopleCaptureActivity.b(PeopleCaptureActivity.this, exc instanceof PayException ? exc.getMessage() : null);
                    }
                }
            };
        }
    }

    public static /* synthetic */ void a(PeopleCaptureActivity peopleCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, peopleCaptureActivity, changeQuickRedirect, false, "130dd321e61681f15644b35aa39fc8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, peopleCaptureActivity, changeQuickRedirect, false, "130dd321e61681f15644b35aa39fc8fb");
            return;
        }
        try {
            ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, peopleCaptureActivity.c, 60)).uploadHandheldImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
        } catch (IOException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OcrVerifyActivity_upload", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
        }
    }

    public static /* synthetic */ void b(PeopleCaptureActivity peopleCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, peopleCaptureActivity, changeQuickRedirect, false, "89984bec2c39a7d60dbd666edb2bbcce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, peopleCaptureActivity, changeQuickRedirect, false, "89984bec2c39a7d60dbd666edb2bbcce");
            return;
        }
        BasePayDialog.b c = new PayDialog.a(peopleCaptureActivity).c(TextUtils.isEmpty(str) ? "由于网络原因，您的照片上传失败，请重试" : str);
        Object[] objArr2 = {peopleCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        BasePayDialog.b a2 = c.a(IPaymentManager.NO_ACTION, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3930ccd37c337fb5c795b35eb3c3a5e9", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3930ccd37c337fb5c795b35eb3c3a5e9") : new h(peopleCaptureActivity));
        Object[] objArr3 = {peopleCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        a2.b("重试", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8f1a76133d0d804ce80c8524a6d6bdcb", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8f1a76133d0d804ce80c8524a6d6bdcb") : new i(peopleCaptureActivity)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edc1014902d1aa8713ae2528b968883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edc1014902d1aa8713ae2528b968883");
            return;
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        setContentView(R.layout.identifycard_recognizer_activity_people_capture);
        getSupportFragmentManager().beginTransaction().add(R.id.content, new PeopleCaptureFragment()).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69473bdff24457216799c66b5660db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69473bdff24457216799c66b5660db6");
            return;
        }
        this.b = str;
        getSupportFragmentManager().beginTransaction().replace(R.id.content, PreviewFragment.a(str, 11)).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f1a8502a5fea6902fa3c4222e3a59a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f1a8502a5fea6902fa3c4222e3a59a");
        } else {
            a(this.b);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60a714e76f83e6967c5b100493523ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60a714e76f83e6967c5b100493523ab");
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.content, new PeopleCaptureFragment()).commitAllowingStateLoss();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c925ec7e877480189c0737fa29491b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c925ec7e877480189c0737fa29491b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!new File(str).exists()) {
                com.meituan.android.paybase.common.analyse.a.a("b_fz3ub6e7", (Map<String, Object>) null);
                com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) "文件不存在，请重新拍摄");
                B_();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
                return;
            }
            b(str);
        }
    }

    private void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc45d145ca2baa3b3c720a93c78701e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc45d145ca2baa3b3c720a93c78701e");
            return;
        }
        a(true, R.drawable.identifycard_recognizer_upload_loading, "照片上传中");
        com.meituan.android.identifycardrecognizer.compress.c.a(this).a(str, new com.meituan.android.identifycardrecognizer.compress.b() { // from class: com.meituan.android.identifycardrecognizer.PeopleCaptureActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, String str3) {
                Object[] objArr2 = {str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48268aab1ae8faa23dc374e166f5840a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48268aab1ae8faa23dc374e166f5840a");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a(PeopleCaptureActivity.this.e(), "图片压缩成功", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                PeopleCaptureActivity.a(PeopleCaptureActivity.this, str3);
            }

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, Exception exc) {
                Object[] objArr2 = {str2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bb31713cd9335b0fa4f9f0ccecc0df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bb31713cd9335b0fa4f9f0ccecc0df");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_rciyhe42", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("message", exc.getMessage()).b);
                PeopleCaptureActivity.a(PeopleCaptureActivity.this, str);
            }
        });
    }

    private void a(boolean z, int i, String str) {
        Object[] objArr = {(byte) 1, Integer.valueOf((int) R.drawable.identifycard_recognizer_upload_loading), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddba27d1416852030d688291b7ccfa46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddba27d1416852030d688291b7ccfa46");
        } else if (isFinishing() || this.k) {
        } else {
            if (this.m == null || !this.m.isShowing()) {
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_1);
                }
                this.m = new MTProgressDialog(this, R.drawable.identifycard_recognizer_upload_loading, str);
                this.m.setCanceledOnTouchOutside(false);
                this.m.setCancelable(true);
                this.m.show();
            }
        }
    }

    public final void B_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4a8c797da559cccc700e61fbef4b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4a8c797da559cccc700e61fbef4b93");
        } else if (isFinishing() || this.k || this.m == null || !this.m.isShowing()) {
        } else {
            this.m.dismiss();
            this.m = null;
        }
    }

    public static /* synthetic */ void b(PeopleCaptureActivity peopleCaptureActivity, Dialog dialog) {
        Object[] objArr = {peopleCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb6c66c8b7dc377ca42528705e034aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb6c66c8b7dc377ca42528705e034aa7");
            return;
        }
        dialog.dismiss();
        Intent intent = new Intent();
        intent.putExtra("status", "fail");
        peopleCaptureActivity.setResult(-1, intent);
        peopleCaptureActivity.finish();
    }

    public static /* synthetic */ void a(PeopleCaptureActivity peopleCaptureActivity, Dialog dialog) {
        Object[] objArr = {peopleCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35ae1ff100b039aabc12486500535a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35ae1ff100b039aabc12486500535a04");
        } else {
            peopleCaptureActivity.a(peopleCaptureActivity.b);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2f38d6e152d1a6bce5da67d5ea853b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2f38d6e152d1a6bce5da67d5ea853b");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i == 2) {
            if (i2 == -1) {
                setResult(-1, intent);
                finish();
            } else if (i2 == 0) {
                finish();
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a40271a4aa5fed3ec8518fd98a059f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a40271a4aa5fed3ec8518fd98a059f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        PayBaseFragment payBaseFragment = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b419c37dd866c5946ef7282b9e1371", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b419c37dd866c5946ef7282b9e1371") : (PayBaseFragment) getSupportFragmentManager().findFragmentById(R.id.content);
        if (payBaseFragment == null || !payBaseFragment.h()) {
            super.onBackPressed();
        }
    }
}
