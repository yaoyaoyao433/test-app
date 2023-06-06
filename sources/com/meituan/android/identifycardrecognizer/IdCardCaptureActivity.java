package com.meituan.android.identifycardrecognizer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.identifycardrecognizer.bean.AuthenticationResult;
import com.meituan.android.identifycardrecognizer.bean.UploadImgResult;
import com.meituan.android.identifycardrecognizer.fragment.IdCardCaptureFragment;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IdCardCaptureActivity extends PayBaseActivity implements g {
    public static ChangeQuickRedirect a;
    @MTPayNeedToPersist
    private List<String> b;
    @MTPayNeedToPersist
    private boolean c;
    @MTPayNeedToPersist
    private boolean d;
    private List<String> e;
    private com.meituan.android.paybase.retrofit.b f;

    public static /* synthetic */ String d(IdCardCaptureActivity idCardCaptureActivity) {
        return "shoot";
    }

    public IdCardCaptureActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c34c0d846d3c300cd61caf76d7aecc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c34c0d846d3c300cd61caf76d7aecc8");
            return;
        }
        this.b = new ArrayList();
        this.f = new com.meituan.android.paybase.retrofit.b() { // from class: com.meituan.android.identifycardrecognizer.IdCardCaptureActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestFinal(int i) {
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestStart(int i) {
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestSucc(int i, Object obj) {
                boolean z = false;
                Object[] objArr2 = {Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "707637bd582ba508b47c37ac7660d842", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "707637bd582ba508b47c37ac7660d842");
                    return;
                }
                if (i == 56 || i == 57) {
                    if (obj == null) {
                        return;
                    }
                    UploadImgResult uploadImgResult = (UploadImgResult) obj;
                    if (i == 56) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("index", 1);
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadsuccess_sc", hashMap);
                        IdCardCaptureActivity.a(IdCardCaptureActivity.this, false);
                        IdCardCaptureActivity.this.e.add(uploadImgResult.getUrl());
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("index", 2);
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadsuccess_sc", hashMap2);
                        IdCardCaptureActivity.b(IdCardCaptureActivity.this, false);
                        IdCardCaptureActivity.this.e.add(uploadImgResult.getUrl());
                    }
                    if (!IdCardCaptureActivity.this.d && !IdCardCaptureActivity.this.c) {
                        com.meituan.android.paybase.common.analyse.a.a("c_637rnodh", "b_ovpbqv5w", "身份验上传成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", IdCardCaptureActivity.d(IdCardCaptureActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", 200);
                        Iterator it = IdCardCaptureActivity.this.e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (TextUtils.isEmpty((String) it.next())) {
                                break;
                            }
                        }
                        IdCardCaptureActivity.this.g();
                        if (z) {
                            com.meituan.android.paybase.common.analyse.a.a(IdCardCaptureActivity.this.e(), "身份认证开始", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                            IdCardCaptureActivity.a(IdCardCaptureActivity.this, IdCardCaptureActivity.this.e);
                        }
                    }
                }
                if (i == 59) {
                    IdCardCaptureActivity.this.g();
                    if (((AuthenticationResult) obj).getIsAccessed() == 1) {
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verifysuccess_sc", null);
                        com.meituan.android.paybase.common.analyse.a.a("c_e7s23if3", "b_fwy8rxct", "身份识别成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", IdCardCaptureActivity.d(IdCardCaptureActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.a.a("c_1j1lwb43", "b_owzg355y", "身份验证成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", IdCardCaptureActivity.d(IdCardCaptureActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verified_ocr", 200);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_recognise_ocr", 200);
                        IdCardCaptureActivity.f(IdCardCaptureActivity.this);
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_dlnalo4q", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
                    IdCardCaptureActivity.a(IdCardCaptureActivity.this, (String) null);
                }
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestException(int i, Exception exc) {
                Object[] objArr2 = {Integer.valueOf(i), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c2ebaaf444f019db17bb86216574de2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c2ebaaf444f019db17bb86216574de2");
                    return;
                }
                boolean z = exc instanceof PayException;
                int code = z ? ((PayException) exc).getCode() : 0;
                if (i == 56 || i == 57) {
                    IdCardCaptureActivity.this.g();
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", Integer.valueOf(code));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadfail_sc", hashMap);
                    if (IdCardCaptureActivity.this.c && IdCardCaptureActivity.this.d) {
                        com.meituan.android.paybase.common.analyse.a.a(IdCardCaptureActivity.this.e(), "身份证上传失败", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                        com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_upload_ocr", exc);
                        IdCardCaptureActivity.b(IdCardCaptureActivity.this, z ? exc.getMessage() : null);
                        IdCardCaptureActivity.a(IdCardCaptureActivity.this, false);
                        IdCardCaptureActivity.b(IdCardCaptureActivity.this, false);
                    }
                }
                if (i == 59) {
                    if (code == 160701 || code == 160702) {
                        com.meituan.android.paybase.common.analyse.a.a("b_fwy8rxct", "身份识别成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", IdCardCaptureActivity.d(IdCardCaptureActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_recognise_ocr", 200);
                    } else {
                        com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_verify_recognise_ocr", exc);
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("errorCode", Integer.valueOf(code));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verifyfail_sc", hashMap2);
                    com.meituan.android.paybase.common.analyse.a.a("b_dlnalo4q", new a.c().a("code", Integer.valueOf(code)).a("message", exc.getMessage()).a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
                    com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_verified_ocr", exc);
                    IdCardCaptureActivity.this.g();
                    IdCardCaptureActivity.a(IdCardCaptureActivity.this, exc.getMessage());
                }
            }
        };
    }

    public static /* synthetic */ void a(IdCardCaptureActivity idCardCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, idCardCaptureActivity, changeQuickRedirect, false, "04845ad06acb8517ec992dd216337829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, idCardCaptureActivity, changeQuickRedirect, false, "04845ad06acb8517ec992dd216337829");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "无法识别您的身份证，请重新上传";
        }
        BasePayDialog.b c = new PayDialog.a(idCardCaptureActivity).c(str);
        Object[] objArr2 = {idCardCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        c.a("重新拍摄", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "066824efe166aae6d2542d9fe2bd43eb", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "066824efe166aae6d2542d9fe2bd43eb") : new a(idCardCaptureActivity)).a(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    public static /* synthetic */ void a(IdCardCaptureActivity idCardCaptureActivity, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, idCardCaptureActivity, changeQuickRedirect, false, "91caf3e4f5a952e7040676173d863b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, idCardCaptureActivity, changeQuickRedirect, false, "91caf3e4f5a952e7040676173d863b3d");
        } else if (i == 0) {
            idCardCaptureActivity.c = true;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("index", 1);
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_upload_sc", hashMap);
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, idCardCaptureActivity.f, 56)).uploadIDImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
            } catch (IOException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "OcrVerifyActivity_upload", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
            }
        } else {
            idCardCaptureActivity.d = true;
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("index", 2);
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_upload_sc", hashMap2);
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, idCardCaptureActivity.f, 57)).uploadIDImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
            } catch (IOException e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "OcrVerifyActivity_upload", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
            }
        }
    }

    public static /* synthetic */ void a(IdCardCaptureActivity idCardCaptureActivity, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, idCardCaptureActivity, changeQuickRedirect, false, "82b612d0ac298c5f8edeab39680f5924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, idCardCaptureActivity, changeQuickRedirect, false, "82b612d0ac298c5f8edeab39680f5924");
        } else if (com.meituan.android.paybase.utils.i.a((Collection) list) || list.size() < 2) {
        } else {
            com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verify_sc", null);
            idCardCaptureActivity.a(true, R.drawable.identifycard_recognizer_authentication_loading, "身份证验证中");
            ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, idCardCaptureActivity.f, 59)).authenticate((String) list.get(0), (String) list.get(1), com.meituan.android.identifycardrecognizer.utils.c.a());
        }
    }

    public static /* synthetic */ boolean a(IdCardCaptureActivity idCardCaptureActivity, boolean z) {
        idCardCaptureActivity.c = false;
        return false;
    }

    public static /* synthetic */ void b(IdCardCaptureActivity idCardCaptureActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, idCardCaptureActivity, changeQuickRedirect, false, "aeb1102243458a56f2b045fd012cc732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, idCardCaptureActivity, changeQuickRedirect, false, "aeb1102243458a56f2b045fd012cc732");
            return;
        }
        BasePayDialog.b c = new PayDialog.a(idCardCaptureActivity).c(TextUtils.isEmpty(str) ? "由于网络原因，您的身份证上传失败，请重试" : str);
        Object[] objArr2 = {idCardCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        BasePayDialog.b a2 = c.a(IPaymentManager.NO_ACTION, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d3a451f786d8ac61f956fbf3fdcd41c6", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d3a451f786d8ac61f956fbf3fdcd41c6") : new b(idCardCaptureActivity));
        Object[] objArr3 = {idCardCaptureActivity};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        a2.b("重试", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d75d2d12f7a06221eac93cfb22e372f6", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d75d2d12f7a06221eac93cfb22e372f6") : new c(idCardCaptureActivity)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    public static /* synthetic */ boolean b(IdCardCaptureActivity idCardCaptureActivity, boolean z) {
        idCardCaptureActivity.d = false;
        return false;
    }

    public static /* synthetic */ void f(IdCardCaptureActivity idCardCaptureActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, idCardCaptureActivity, changeQuickRedirect, false, "348bfaebc3c99675b2804659c459e1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, idCardCaptureActivity, changeQuickRedirect, false, "348bfaebc3c99675b2804659c459e1e1");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("status", "success");
        idCardCaptureActivity.setResult(-1, intent);
        idCardCaptureActivity.finish();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c498c914fe311be8e078f62b46ef83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c498c914fe311be8e078f62b46ef83");
            return;
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        setContentView(R.layout.identifycard_recognizer_activity_id_card_capture);
        getSupportFragmentManager().beginTransaction().add(R.id.content, IdCardCaptureFragment.a((String) null, 0)).commitAllowingStateLoss();
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19633bd7c1960daa22bea4af8d6a13ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19633bd7c1960daa22bea4af8d6a13ed");
        } else if (i == 11) {
            this.b.clear();
            this.b.add(str);
            getSupportFragmentManager().beginTransaction().replace(R.id.content, PreviewFragment.a(str, 11)).commitAllowingStateLoss();
        } else if (i == 12) {
            this.b.add(str);
            getSupportFragmentManager().beginTransaction().replace(R.id.content, PreviewFragment.a(str, 12)).commitAllowingStateLoss();
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a81507be54ce245e93c0d1d9b831828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a81507be54ce245e93c0d1d9b831828");
        } else if (i == 11) {
            com.meituan.android.paybase.common.analyse.a.a("b_y3q9or9z", "身份验证拍摄页（正面）_确认提交", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).b, a.EnumC0329a.CLICK, -1);
            getSupportFragmentManager().beginTransaction().replace(R.id.content, IdCardCaptureFragment.a((String) null, 1)).commitAllowingStateLoss();
        } else if (i == 12) {
            com.meituan.android.paybase.common.analyse.a.a("b_r72yyrlf", "身份验证拍摄页（反面）_确认提交", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).b, a.EnumC0329a.CLICK, -1);
            a(this.b);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.g
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253b89d7aa7f635fa74604784bc6b3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253b89d7aa7f635fa74604784bc6b3c5");
        } else if (i == 11) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content, IdCardCaptureFragment.a((String) null, 0)).commitAllowingStateLoss();
        } else if (i == 12) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content, IdCardCaptureFragment.a((String) null, 1)).commitAllowingStateLoss();
        }
    }

    private void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0efc57182ed1588b76386714e55b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0efc57182ed1588b76386714e55b96");
            return;
        }
        this.e = new ArrayList();
        for (final int i = 0; i < list.size(); i++) {
            final String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (!new File(str).exists()) {
                    com.meituan.android.paybase.common.analyse.a.a("b_fz3ub6e7", (Map<String, Object>) null);
                    com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) "文件不存在，请重新拍摄");
                    g();
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
                    return;
                }
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "705db1ace6747add0b2a6d2923d00ee8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "705db1ace6747add0b2a6d2923d00ee8");
                } else {
                    a(true, R.drawable.identifycard_recognizer_upload_loading, "照片上传中");
                    com.meituan.android.identifycardrecognizer.compress.c.a(this).a(str, new com.meituan.android.identifycardrecognizer.compress.b() { // from class: com.meituan.android.identifycardrecognizer.IdCardCaptureActivity.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.identifycardrecognizer.compress.b
                        public final void a(String str2, String str3) {
                            Object[] objArr3 = {str2, str3};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a932221a986d34b82d1f7d7149f02c5d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a932221a986d34b82d1f7d7149f02c5d");
                                return;
                            }
                            com.meituan.android.paybase.common.analyse.a.a(IdCardCaptureActivity.this.e(), "图片压缩成功", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                            IdCardCaptureActivity.a(IdCardCaptureActivity.this, str3, i);
                        }

                        @Override // com.meituan.android.identifycardrecognizer.compress.b
                        public final void a(String str2, Exception exc) {
                            Object[] objArr3 = {str2, exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed2f56390024927da5c221d70e3c7904", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed2f56390024927da5c221d70e3c7904");
                                return;
                            }
                            com.meituan.android.paybase.common.analyse.a.a("b_rciyhe42", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("message", exc.getMessage()).b);
                            IdCardCaptureActivity.a(IdCardCaptureActivity.this, str, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece377dcea3554a10a08cbe02d0f2f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece377dcea3554a10a08cbe02d0f2f86");
        } else if (isFinishing() || this.k || this.m == null || !this.m.isShowing()) {
        } else {
            this.m.dismiss();
            this.m = null;
        }
    }

    private void a(boolean z, int i, String str) {
        Object[] objArr = {(byte) 1, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65434ac5282cd8070f8682d72508757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65434ac5282cd8070f8682d72508757");
        } else if (isFinishing() || this.k) {
        } else {
            if (this.m == null || !this.m.isShowing()) {
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_1);
                }
                this.m = new MTProgressDialog(this, i, str);
                this.m.setCanceledOnTouchOutside(false);
                this.m.setCancelable(true);
                this.m.show();
            }
        }
    }

    public static /* synthetic */ void c(IdCardCaptureActivity idCardCaptureActivity, Dialog dialog) {
        Object[] objArr = {idCardCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8cb03be804dac68b884010289429189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8cb03be804dac68b884010289429189");
            return;
        }
        dialog.dismiss();
        idCardCaptureActivity.finish();
    }

    public static /* synthetic */ void b(IdCardCaptureActivity idCardCaptureActivity, Dialog dialog) {
        Object[] objArr = {idCardCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ab07a9bb58c93f26528f4195a87c529", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ab07a9bb58c93f26528f4195a87c529");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("status", "fail");
        idCardCaptureActivity.setResult(-1, intent);
        dialog.dismiss();
        idCardCaptureActivity.finish();
    }

    public static /* synthetic */ void a(IdCardCaptureActivity idCardCaptureActivity, Dialog dialog) {
        Object[] objArr = {idCardCaptureActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f4e7f7149f64af073e3c7dbafe4f815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f4e7f7149f64af073e3c7dbafe4f815");
        } else {
            idCardCaptureActivity.a(idCardCaptureActivity.b);
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9280e4372aa6609378a8b9b4dee815d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9280e4372aa6609378a8b9b4dee815d8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        PayBaseFragment payBaseFragment = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26f3dbff10f3e55c3c854fbca8919587", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26f3dbff10f3e55c3c854fbca8919587") : (PayBaseFragment) getSupportFragmentManager().findFragmentById(R.id.content);
        if (payBaseFragment == null || !payBaseFragment.h()) {
            super.onBackPressed();
        }
    }
}
