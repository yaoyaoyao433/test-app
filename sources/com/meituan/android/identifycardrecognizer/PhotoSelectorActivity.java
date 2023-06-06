package com.meituan.android.identifycardrecognizer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.android.identifycardrecognizer.adapter.a;
import com.meituan.android.identifycardrecognizer.adapter.b;
import com.meituan.android.identifycardrecognizer.bean.AuthenticationResult;
import com.meituan.android.identifycardrecognizer.bean.ImageOcrResult;
import com.meituan.android.identifycardrecognizer.bean.PhotoFolder;
import com.meituan.android.identifycardrecognizer.bean.UploadImgResult;
import com.meituan.android.identifycardrecognizer.request.IdCardOcrRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.progressdialog.MTProgressDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PhotoSelectorActivity extends PayBaseActivity implements View.OnClickListener, com.meituan.android.privacy.interfaces.g {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private String F;
    private com.meituan.android.paybase.retrofit.b G;
    public Button b;
    public int c;
    private RecyclerView d;
    private View e;
    private RecyclerView f;
    private TextView g;
    private int h;
    private com.meituan.android.identifycardrecognizer.adapter.a i;
    private ArrayList<PhotoFolder> q;
    private com.meituan.android.identifycardrecognizer.adapter.b r;
    private ArrayList<String> s;
    private int t;
    private Drawable u;
    private Drawable v;
    private MTProgressDialog w;
    private int x;
    private String[] y;
    private String[] z;

    public static /* synthetic */ String h(PhotoSelectorActivity photoSelectorActivity) {
        return "album";
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final String e() {
        return "c_mptss4y7";
    }

    public PhotoSelectorActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f52fa3f074d10a658ce9d77fb01070", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f52fa3f074d10a658ce9d77fb01070");
            return;
        }
        this.q = new ArrayList<>();
        this.s = new ArrayList<>();
        this.t = 9;
        this.A = false;
        this.B = false;
        this.G = new com.meituan.android.paybase.retrofit.b() { // from class: com.meituan.android.identifycardrecognizer.PhotoSelectorActivity.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestFinal(int i) {
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestStart(int i) {
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestSucc(int i, Object obj) {
                boolean z;
                String str;
                Object[] objArr2 = {Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bff19c9e40af1215f81a2a72f0d99c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bff19c9e40af1215f81a2a72f0d99c1");
                    return;
                }
                if (i == 56 || i == 57) {
                    if (obj == null) {
                        return;
                    }
                    UploadImgResult uploadImgResult = (UploadImgResult) obj;
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", 200);
                    if (i == 56) {
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, false);
                        PhotoSelectorActivity.this.y[0] = uploadImgResult.getUrl();
                        HashMap hashMap = new HashMap();
                        hashMap.put("index", 1);
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadsuccess_sc", hashMap);
                    } else {
                        PhotoSelectorActivity.b(PhotoSelectorActivity.this, false);
                        PhotoSelectorActivity.this.y[1] = uploadImgResult.getUrl();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("index", 2);
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadsuccess_sc", hashMap2);
                    }
                    if (!PhotoSelectorActivity.this.B && !PhotoSelectorActivity.this.A) {
                        com.meituan.android.paybase.common.analyse.a.a("b_ovpbqv5w", "身份验上传成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PhotoSelectorActivity.h(PhotoSelectorActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", 200);
                        String[] strArr = PhotoSelectorActivity.this.y;
                        int length = strArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = true;
                                break;
                            } else if (TextUtils.isEmpty(strArr[i2])) {
                                z = false;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        PhotoSelectorActivity.this.j();
                        if (z) {
                            PhotoSelectorActivity.a(PhotoSelectorActivity.this, PhotoSelectorActivity.this.y);
                        }
                    }
                }
                if (i == 60) {
                    PhotoSelectorActivity.this.j();
                    if (!TextUtils.isEmpty(((UploadImgResult) obj).getUrl())) {
                        com.meituan.android.paybase.common.analyse.a.a("b_dlvsb96k", "手持上传成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PhotoSelectorActivity.h(PhotoSelectorActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.a.a(PhotoSelectorActivity.this.e(), "手持照片上传成功", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", 200);
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, (String) null, (Serializable) null);
                    }
                }
                if (i == 59) {
                    PhotoSelectorActivity.this.j();
                    if (((AuthenticationResult) obj).getIsAccessed() == 1) {
                        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verifysuccess_sc", null);
                        a.c cVar = new a.c();
                        if (PhotoSelectorActivity.this.x == 2) {
                            str = "手持";
                        } else {
                            str = PhotoSelectorActivity.this.x == 1 ? "身份证" : "not found";
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_hlsy0cjz", cVar.a("type", str).a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
                        com.meituan.android.paybase.common.analyse.a.a("b_fwy8rxct", "身份识别成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PhotoSelectorActivity.h(PhotoSelectorActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.a.a("b_owzg355y", "身份验证成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PhotoSelectorActivity.h(PhotoSelectorActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verified_ocr", 200);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_recognise_ocr", 200);
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, (String) null, (Serializable) null);
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_dlnalo4q", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, (String) null);
                    }
                }
                if (i == 55) {
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_uploadsuccess_sc", null);
                    PhotoSelectorActivity.this.j();
                    UploadImgResult uploadImgResult2 = (UploadImgResult) obj;
                    if (!TextUtils.equals(PhotoSelectorActivity.this.F, "1") && !TextUtils.equals(PhotoSelectorActivity.this.F, "101")) {
                        if (TextUtils.equals(PhotoSelectorActivity.this.F, "2")) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_4y4jd1e7_mc", "c_pay_a67smm8e", PhotoSelectorActivity.this.f(), a.EnumC0329a.CLICK, 0);
                        }
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_xcw614cb_mc", "c_pay_uwp9z24s", PhotoSelectorActivity.this.f(), a.EnumC0329a.CLICK, 0);
                    }
                    if (!TextUtils.isEmpty(uploadImgResult2.getUrl())) {
                        if (PhotoSelectorActivity.this.C) {
                            com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognize_sc", null);
                            PhotoSelectorActivity.this.a(true, R.drawable.identifycard_recognizer_upload_loading, "识别中");
                            ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, PhotoSelectorActivity.this.G, 54)).imageOcr(String.valueOf(PhotoSelectorActivity.this.x), TextUtils.isEmpty(com.meituan.android.identifycardrecognizer.utils.b.a()) ? 0 : Integer.valueOf(com.meituan.android.identifycardrecognizer.utils.b.a()).intValue(), uploadImgResult2.getUrl(), "", Long.valueOf(TextUtils.isEmpty(com.meituan.android.identifycardrecognizer.utils.b.e) ? 0L : Long.parseLong(com.meituan.android.identifycardrecognizer.utils.b.e)).longValue(), "[]");
                        } else {
                            PhotoSelectorActivity.a(PhotoSelectorActivity.this, "url", uploadImgResult2.getUrl());
                        }
                    }
                }
                if (i == 54) {
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognizesuccess_sc", null);
                    PhotoSelectorActivity.this.j();
                    if (!TextUtils.equals(PhotoSelectorActivity.this.F, "1") && !TextUtils.equals(PhotoSelectorActivity.this.F, "101")) {
                        if (TextUtils.equals(PhotoSelectorActivity.this.F, "2")) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_vefvkl45_mc", "c_pay_a67smm8e", PhotoSelectorActivity.this.f(), a.EnumC0329a.CLICK, 0);
                            PhotoSelectorActivity.a(PhotoSelectorActivity.this, "data", ((ImageOcrResult) obj).getPassportInfo());
                            return;
                        }
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_0gwf34bo_mc", "c_pay_uwp9z24s", PhotoSelectorActivity.this.f(), a.EnumC0329a.CLICK, 0);
                    PhotoSelectorActivity.a(PhotoSelectorActivity.this, "data", ((ImageOcrResult) obj).getIdentifyInfo());
                }
            }

            @Override // com.meituan.android.paybase.retrofit.b
            public final void onRequestException(int i, Exception exc) {
                Object[] objArr2 = {Integer.valueOf(i), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c7ec0f8e50bca49fb72f33cc86a87a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c7ec0f8e50bca49fb72f33cc86a87a4");
                    return;
                }
                boolean z = exc instanceof PayException;
                int code = z ? ((PayException) exc).getCode() : 0;
                HashMap<String, Object> f = PhotoSelectorActivity.this.f();
                f.put("errorCode", Integer.valueOf(code));
                f.put("message", exc.getMessage());
                if (i == 56 || i == 57) {
                    PhotoSelectorActivity.this.j();
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(i % 2));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_uploadfail_sc", hashMap);
                    if (PhotoSelectorActivity.this.A && PhotoSelectorActivity.this.B) {
                        com.meituan.android.paybase.common.analyse.a.a(PhotoSelectorActivity.this.e(), "身份证上传失败", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                        com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_upload_ocr", exc);
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, 0, z ? exc.getMessage() : null);
                        PhotoSelectorActivity.a(PhotoSelectorActivity.this, false);
                        PhotoSelectorActivity.b(PhotoSelectorActivity.this, false);
                    }
                }
                if (i == 60) {
                    com.meituan.android.paybase.common.analyse.a.a(PhotoSelectorActivity.this.e(), "手持照片上传失败", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                    com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_upload_ocr", exc);
                    PhotoSelectorActivity.this.j();
                    PhotoSelectorActivity.a(PhotoSelectorActivity.this, 1, z ? exc.getMessage() : null);
                }
                if (i == 59) {
                    int code2 = z ? ((PayException) exc).getCode() : 0;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("errorCode", Integer.valueOf(code));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verifyfail_sc", hashMap2);
                    if (code2 == 160701 || code2 == 160702) {
                        com.meituan.android.paybase.common.analyse.a.a("b_fwy8rxct", "身份识别成功", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).a("method", PhotoSelectorActivity.h(PhotoSelectorActivity.this)).b, a.EnumC0329a.VIEW, -1);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_recognise_ocr", 200);
                    } else {
                        com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_verify_recognise_ocr", exc);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_dlnalo4q", new a.c().a("code", Integer.valueOf(code2)).a("message", exc.getMessage()).a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
                    com.meituan.android.identifycardrecognizer.utils.c.a("paybiz_verified_ocr", exc);
                    PhotoSelectorActivity.this.j();
                    PhotoSelectorActivity.a(PhotoSelectorActivity.this, exc.getMessage());
                }
                if (i == 55) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("errorCode", Integer.valueOf(code));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_uploadfail_sc", hashMap3);
                    PhotoSelectorActivity.this.j();
                    PhotoSelectorActivity.a(PhotoSelectorActivity.this, PhotoSelectorActivity.this.x, z ? exc.getMessage() : null);
                    if (!TextUtils.equals(PhotoSelectorActivity.this.F, "1") && !TextUtils.equals(PhotoSelectorActivity.this.F, "101")) {
                        if (TextUtils.equals(PhotoSelectorActivity.this.F, "2")) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_8o4pp4v0_mc", "c_pay_a67smm8e", f, a.EnumC0329a.CLICK, 0);
                        }
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_umd1rhn9_mc", "c_pay_uwp9z24s", f, a.EnumC0329a.CLICK, 0);
                    }
                }
                if (i == 54) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("errorCode", Integer.valueOf(code));
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_recognizefail_sc", hashMap4);
                    PhotoSelectorActivity.this.j();
                    String str = "";
                    if (!TextUtils.equals(PhotoSelectorActivity.this.F, "1") && !TextUtils.equals(PhotoSelectorActivity.this.F, "101")) {
                        if (TextUtils.equals(PhotoSelectorActivity.this.F, "2")) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_2r936zfe_mc", "c_pay_a67smm8e", f, a.EnumC0329a.CLICK, 0);
                            str = TextUtils.isEmpty(exc.getMessage()) ? PhotoSelectorActivity.this.getString(R.string.identifycard_recognizer_can_not_recognize_id_card) : exc.getMessage();
                        }
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_fzkvmxb4_mc", "c_pay_uwp9z24s", f, a.EnumC0329a.CLICK, 0);
                        str = TextUtils.isEmpty(exc.getMessage()) ? PhotoSelectorActivity.this.getString(R.string.identifycard_recognizer_can_not_recognize_id_card) : exc.getMessage();
                    }
                    PhotoSelectorActivity.a(PhotoSelectorActivity.this, str);
                }
            }
        };
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, int i, String str) {
        String str2;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoSelectorActivity, changeQuickRedirect, false, "358d4364e3fb6bde111dd3676a866970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoSelectorActivity, changeQuickRedirect, false, "358d4364e3fb6bde111dd3676a866970");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else if (i == 0) {
            str2 = photoSelectorActivity.getString(R.string.identifycard_recognizer_id_card_upload_fail);
        } else {
            str2 = photoSelectorActivity.getString(R.string.identifycard_recognizer_photo_upload_fail);
        }
        BasePayDialog.b c = new PayDialog.a(photoSelectorActivity).c(str2);
        String string = photoSelectorActivity.getString(R.string.identifycard_recognizer_cancel);
        Object[] objArr2 = {photoSelectorActivity};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        BasePayDialog.b a2 = c.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8308b286a04303cda9a7965475619b0a", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8308b286a04303cda9a7965475619b0a") : new n(photoSelectorActivity));
        String string2 = photoSelectorActivity.getString(R.string.identifycard_recognizer_retry);
        Object[] objArr3 = {photoSelectorActivity};
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        a2.b(string2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c979cb3ea00fcdbccfe1a2792dcc8c82", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c979cb3ea00fcdbccfe1a2792dcc8c82") : new o(photoSelectorActivity)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoSelectorActivity, changeQuickRedirect, false, "58ada5e5ec5b427d644dce822564900b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoSelectorActivity, changeQuickRedirect, false, "58ada5e5ec5b427d644dce822564900b");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = photoSelectorActivity.getString(R.string.identifycard_recognizer_can_not_recognize_id_card);
        }
        BasePayDialog.b c = new PayDialog.a(photoSelectorActivity).c(str);
        String string = photoSelectorActivity.getString(R.string.identifycard_recognizer_reupload);
        Object[] objArr2 = {photoSelectorActivity};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        c.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d10cdae9fa471a355b1c436ae8a0a7c3", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d10cdae9fa471a355b1c436ae8a0a7c3") : new m(photoSelectorActivity)).a(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoSelectorActivity, changeQuickRedirect, false, "787291f020df14c6e5aa252218129f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoSelectorActivity, changeQuickRedirect, false, "787291f020df14c6e5aa252218129f7e");
        } else if (photoSelectorActivity.E) {
            try {
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_upload_sc", null);
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, photoSelectorActivity.G, 55)).uploadImages(String.valueOf(photoSelectorActivity.x), Integer.valueOf(com.meituan.android.identifycardrecognizer.utils.b.a()).intValue(), com.meituan.android.paybase.utils.c.b(str));
            } catch (IOException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "PeopleSelectorActivity_upload", (Map<String, Object>) null);
            }
        } else if (photoSelectorActivity.x == 2) {
            try {
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, photoSelectorActivity.G, 60)).uploadHandheldImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
            } catch (IOException e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "PeopleSelectorActivity_upload", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
            }
        } else if (i == 0) {
            photoSelectorActivity.A = true;
            try {
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, photoSelectorActivity.G, 56)).uploadIDImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
                HashMap hashMap = new HashMap();
                hashMap.put("index", 1);
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_upload_sc", hashMap);
            } catch (IOException e3) {
                com.meituan.android.paybase.common.analyse.a.a(e3, "PeopleSelectorActivity_upload", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
            }
        } else {
            photoSelectorActivity.B = true;
            try {
                ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, photoSelectorActivity.G, 57)).uploadIDImg(com.meituan.android.paybase.utils.c.b(str), com.meituan.android.identifycardrecognizer.utils.c.a());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("index", 2);
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_upload_sc", hashMap2);
            } catch (IOException e4) {
                com.meituan.android.paybase.common.analyse.a.a(e4, "PeopleSelectorActivity_upload", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
            }
        }
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, String str, Serializable serializable) {
        Object[] objArr = {str, serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoSelectorActivity, changeQuickRedirect, false, "29223bd7c896e2f41b781c3903b6a8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoSelectorActivity, changeQuickRedirect, false, "29223bd7c896e2f41b781c3903b6a8aa");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("status", "success");
        if (TextUtils.isEmpty(str)) {
            intent.putExtra(str, serializable);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(str, serializable);
        }
        photoSelectorActivity.setResult(-1, intent);
        photoSelectorActivity.finish();
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoSelectorActivity, changeQuickRedirect, false, "60afd54d1179a5f80896f19bd21811ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoSelectorActivity, changeQuickRedirect, false, "60afd54d1179a5f80896f19bd21811ca");
        } else if (strArr == null || strArr.length < 2) {
        } else {
            photoSelectorActivity.a(true, R.drawable.identifycard_recognizer_authentication_loading, "身份证验证中");
            com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_verify_sc", null);
            ((IdCardOcrRequestService) com.meituan.android.identifycardrecognizer.request.a.a().a(IdCardOcrRequestService.class, photoSelectorActivity.G, 59)).authenticate(strArr[0], strArr[1], com.meituan.android.identifycardrecognizer.utils.c.a());
        }
    }

    public static /* synthetic */ boolean a(PhotoSelectorActivity photoSelectorActivity, boolean z) {
        photoSelectorActivity.A = false;
        return false;
    }

    public static /* synthetic */ boolean b(PhotoSelectorActivity photoSelectorActivity, boolean z) {
        photoSelectorActivity.B = false;
        return false;
    }

    public static void a(Activity activity, int i, int i2, int i3, boolean z) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa7f80f63500f41c8b8d88be694f7f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa7f80f63500f41c8b8d88be694f7f15");
            return;
        }
        Intent intent = new Intent(activity, PhotoSelectorActivity.class);
        intent.putExtra("MAX_SELECT_NUM", i);
        intent.putExtra("card_type", i3);
        intent.putExtra("fromJSHandler", true);
        activity.startActivityForResult(intent, i2);
    }

    public static void a(Activity activity, int i, String str, boolean z, boolean z2) {
        Object[] objArr = {activity, 2, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53dfb52412b91a3f6d42e44f88273e19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53dfb52412b91a3f6d42e44f88273e19");
            return;
        }
        Intent intent = new Intent(activity, PhotoSelectorActivity.class);
        intent.putExtra("MAX_SELECT_NUM", 1);
        intent.putExtra("type", str);
        intent.putExtra("needRecognize", z);
        intent.putExtra("needVerify", z2);
        intent.putExtra("fromOcr", true);
        activity.startActivityForResult(intent, 2);
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @SuppressLint({"InlinedApi"})
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b402192a4c57a9fbbcda5d0db198ac12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b402192a4c57a9fbbcda5d0db198ac12");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.identifycard_recognizer_activity_photo_selector);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29361b769795acf5c9ad7d89bf543a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29361b769795acf5c9ad7d89bf543a6a");
        } else {
            Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
            if (toolbar != null) {
                toolbar.setNavigationIcon(R.drawable.identifycard_recognizer_base_icon_back);
                toolbar.setTitle("");
                ((TextView) findViewById(R.id.txt_title)).setText("全部照片");
                toolbar.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setSupportActionBar(toolbar);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = j.a;
                toolbar.setNavigationOnClickListener(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ac5fd2aa0ae86b27d9e853e6e87ec786", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ac5fd2aa0ae86b27d9e853e6e87ec786") : new j(this));
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.a(true);
                    supportActionBar.b(false);
                }
            }
        }
        this.d = (RecyclerView) findViewById(R.id.rv_image);
        this.e = findViewById(R.id.lay_masking);
        this.f = (RecyclerView) findViewById(R.id.rv_folder);
        this.g = (TextView) findViewById(R.id.txt_title);
        this.b = (Button) findViewById(R.id.btn_prev_upload);
        if (getIntent() != null) {
            this.t = com.sankuai.waimai.platform.utils.f.a(getIntent(), "MAX_SELECT_NUM", 9);
            this.c = com.sankuai.waimai.platform.utils.f.a(getIntent(), "card_type", 1);
            this.C = com.sankuai.waimai.platform.utils.f.a(getIntent(), "needRecognize", false);
            this.D = com.sankuai.waimai.platform.utils.f.a(getIntent(), "needVerify", false);
            this.E = com.sankuai.waimai.platform.utils.f.a(getIntent(), "fromOcr", false);
            this.F = com.sankuai.waimai.platform.utils.f.a(getIntent(), "type");
        }
        this.u = getResources().getDrawable(R.drawable.identifycard_recognizer_base_icon_up);
        this.v = getResources().getDrawable(R.drawable.identifycard_recognizer_base_icon_down);
        this.u.setBounds(0, 0, this.u.getMinimumWidth(), this.u.getMinimumHeight());
        this.v.setBounds(0, 0, this.v.getMinimumWidth(), this.v.getMinimumHeight());
        this.i = new com.meituan.android.identifycardrecognizer.adapter.a(this, this.q);
        this.f.addOnScrollListener(new RecyclerView.k() { // from class: com.meituan.android.identifycardrecognizer.PhotoSelectorActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr4 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8b275ce76ccc8adf8b81dc5fa6337ebd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8b275ce76ccc8adf8b81dc5fa6337ebd");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (PhotoSelectorActivity.this.isFinishing() || PhotoSelectorActivity.this.isDestroyed()) {
                    return;
                }
                if (i == 0) {
                    Picasso.e(PhotoSelectorActivity.this);
                } else {
                    Picasso.f(PhotoSelectorActivity.this);
                }
            }
        });
        this.f.setLayoutManager(new LinearLayoutManager(this));
        this.f.setAdapter(this.i);
        this.i.b = new a.InterfaceC0260a() { // from class: com.meituan.android.identifycardrecognizer.PhotoSelectorActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.adapter.a.InterfaceC0260a
            public final void a(PhotoFolder photoFolder) {
                Object[] objArr4 = {photoFolder};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d7319977437a94bf294d3e05e09b9638", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d7319977437a94bf294d3e05e09b9638");
                    return;
                }
                PhotoSelectorActivity.this.r.a(photoFolder.getPhotoList());
                PhotoSelectorActivity.this.e.setVisibility(8);
                PhotoSelectorActivity.this.i();
                PhotoSelectorActivity.this.g.setText(photoFolder.getName());
            }
        };
        this.r = new com.meituan.android.identifycardrecognizer.adapter.b(this, this.s, this.t);
        this.d.setLayoutManager(new GridLayoutManager(this, 4));
        this.d.setAdapter(this.r);
        this.r.f = new b.a() { // from class: com.meituan.android.identifycardrecognizer.PhotoSelectorActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.adapter.b.a
            public final void a(int i, String str) {
                Object[] objArr4 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9dc06c60c0963fe0935b7058143d95ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9dc06c60c0963fe0935b7058143d95ae");
                    return;
                }
                PhotoSelectorActivity.this.h = i;
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                PhotoPreviewActivity.a(PhotoSelectorActivity.this, arrayList, 0, 11, true);
            }
        };
        this.g.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.b.setOnClickListener(this);
        if (Privacy.createPermissionGuard() == null) {
            finish();
        } else if (Privacy.createPermissionGuard().a(this, PermissionGuard.PERMISSION_STORAGE_READ, "jf-a46271f439dbd2ff") <= 0) {
            Privacy.createPermissionGuard().a((Activity) this, PermissionGuard.PERMISSION_STORAGE_READ, "jf-a46271f439dbd2ff", (com.meituan.android.privacy.interfaces.d) this);
        } else {
            List<PhotoFolder> g = g();
            this.q.clear();
            this.q.addAll(g);
            this.i.notifyDataSetChanged();
            if (!this.q.isEmpty()) {
                this.r.a(this.q.get(0).getPhotoList());
                this.g.setText(this.q.get(0).getName());
            } else {
                this.g.setText((CharSequence) null);
            }
            i();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c41e22cdc1efe1815c98ba1a62cd5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c41e22cdc1efe1815c98ba1a62cd5a");
        } else {
            setTheme(R.style.NoActionBar_Overlay);
        }
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, View view) {
        Object[] objArr = {photoSelectorActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb7301c12dc621d061317b16a10276a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb7301c12dc621d061317b16a10276a6");
        } else {
            photoSelectorActivity.onBackPressed();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ccf55e5b44faced7664f220b765acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ccf55e5b44faced7664f220b765acd");
        } else if (!isFinishing() && PermissionGuard.PERMISSION_STORAGE_READ.equals(str)) {
            if (i <= 0) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "201000960b358ca63eae8b8b638ea17d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "201000960b358ca63eae8b8b638ea17d");
                } else {
                    BasePayDialog.b c = new PayDialog.a(this).c(getString(R.string.identifycard_recognizer_storage_message));
                    String string = getString(R.string.paybase__permission_btn_cancel);
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    BasePayDialog.b a2 = c.a(string, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4edfbb3ffad29d6fd2201ca22e39a142", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4edfbb3ffad29d6fd2201ca22e39a142") : new k(this));
                    String string2 = getString(R.string.paybase__permission_btn_ok);
                    Object[] objArr4 = {this};
                    ChangeQuickRedirect changeQuickRedirect4 = l.a;
                    a2.b(string2, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c597a161d2882d160c6ae0d294ccc256", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c597a161d2882d160c6ae0d294ccc256") : new l(this)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
                }
                com.meituan.android.paybase.common.analyse.a.a("b_tqmgix5q", (Map<String, Object>) null);
                return;
            }
            List<PhotoFolder> g = g();
            this.q.clear();
            this.q.addAll(g);
            this.i.notifyDataSetChanged();
            if (!this.q.isEmpty()) {
                this.r.a(this.q.get(0).getPhotoList());
                this.g.setText(this.q.get(0).getName());
            } else {
                this.g.setText((CharSequence) null);
            }
            i();
        }
    }

    private List<PhotoFolder> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418f0ed98ba95bfd7f594ff902f11105", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418f0ed98ba95bfd7f594ff902f11105");
        }
        ArrayList arrayList = new ArrayList();
        List<PhotoFolder> a2 = com.meituan.android.identifycardrecognizer.adapter.f.a(this);
        PhotoFolder photoFolder = new PhotoFolder();
        photoFolder.setName("所有照片");
        if (a2 != null && !a2.isEmpty()) {
            arrayList.addAll(a2);
            photoFolder.setThumbnail(a2.get(0).getThumbnail());
            for (PhotoFolder photoFolder2 : a2) {
                photoFolder.getPhotoList().addAll(photoFolder2.getPhotoList());
            }
            photoFolder.setCount(photoFolder.getPhotoList().size());
        }
        if (!photoFolder.getPhotoList().isEmpty()) {
            arrayList.add(0, photoFolder);
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f80093b113e4232241741f44dec836", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f80093b113e4232241741f44dec836");
            return;
        }
        if (view.getId() == R.id.txt_title) {
            if (this.e.getVisibility() == 0) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
            }
        } else if (view.getId() == R.id.lay_masking) {
            this.e.setVisibility(8);
        } else if (view.getId() == R.id.btn_prev_upload) {
            com.meituan.android.paybase.common.analyse.a.a("b_li50s6sh", (Map<String, Object>) null);
            if (this.E) {
                a((String[]) this.r.e.toArray(new String[0]), TextUtils.isEmpty(this.F) ? 0 : Integer.valueOf(this.F).intValue());
            } else if (this.c == 1) {
                if ("less".equals(this.b.getTag())) {
                    com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) Integer.valueOf((int) R.string.identifycard_recognizer_img_select_tip));
                } else if ("ok".equals(this.b.getTag())) {
                    com.meituan.android.paybase.common.analyse.a.a("b_v0hopcjh", "身份证相册上传页_2张图片点击上传按钮", new a.c().a("item", com.meituan.android.identifycardrecognizer.utils.b.a()).b, a.EnumC0329a.CLICK, -1);
                    a((String[]) this.r.e.toArray(new String[0]), 1);
                }
            } else if (this.c == 2) {
                a((String[]) this.r.e.toArray(new String[0]), 2);
            }
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c5d3c55440edf16bb9aaef6b8be716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c5d3c55440edf16bb9aaef6b8be716");
            return;
        }
        if (this.i.getItemCount() == 0) {
            this.g.setText("所有照片");
        }
        if (this.e.getVisibility() == 0) {
            this.g.setCompoundDrawables(null, null, this.u, null);
        } else {
            this.g.setCompoundDrawables(null, null, this.v, null);
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final HashMap<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901d958105d13f7a43612aa765e67f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901d958105d13f7a43612aa765e67f5e");
        }
        HashMap<String, Object> f = super.f();
        if (this.E) {
            f.put("needRecognize", Boolean.valueOf(this.C));
            f.put("needVerify", Boolean.valueOf(this.D));
        }
        f.put("item", com.meituan.android.identifycardrecognizer.utils.b.a());
        return f;
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77277ab6bd9d47328bc2ac7b4cf575e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77277ab6bd9d47328bc2ac7b4cf575e8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfo", "PhotoSelectorActivity");
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_backfrompage_sc", hashMap);
        if (this.e.getVisibility() == 0) {
            this.e.setVisibility(8);
            i();
            return;
        }
        super.onBackPressed();
    }

    public static /* synthetic */ void e(PhotoSelectorActivity photoSelectorActivity, Dialog dialog) {
        Object[] objArr = {photoSelectorActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "457e4f6faa3e7b0a6c8943a41b856e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "457e4f6faa3e7b0a6c8943a41b856e9d");
        } else {
            photoSelectorActivity.finish();
        }
    }

    public static /* synthetic */ void d(PhotoSelectorActivity photoSelectorActivity, Dialog dialog) {
        Object[] objArr = {photoSelectorActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef660050488eb23b62dc7a42b5fcbd69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef660050488eb23b62dc7a42b5fcbd69");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", photoSelectorActivity.getPackageName(), null));
        photoSelectorActivity.startActivity(intent);
        photoSelectorActivity.finish();
    }

    private void a(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b75a670723bb200f0e870d001b258879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b75a670723bb200f0e870d001b258879");
            return;
        }
        this.x = i;
        this.z = (String[]) strArr.clone();
        this.y = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (!TextUtils.isEmpty(str)) {
                if (!new File(str).exists()) {
                    com.meituan.android.paybase.common.analyse.a.a("b_fz3ub6e7", (Map<String, Object>) null);
                    com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) "文件不存在，请重新拍摄");
                    j();
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_upload_ocr", -9753);
                    return;
                }
                a(str, i2);
            }
        }
    }

    private void a(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f12d0ebfdce33cfd6c5bd4e12d1bc56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f12d0ebfdce33cfd6c5bd4e12d1bc56");
            return;
        }
        a(true, R.drawable.identifycard_recognizer_upload_loading, this.E ? "上传中" : "照片上传中");
        com.meituan.android.identifycardrecognizer.compress.c.a(this).a(str, new com.meituan.android.identifycardrecognizer.compress.b() { // from class: com.meituan.android.identifycardrecognizer.PhotoSelectorActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, String str3) {
                Object[] objArr2 = {str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8a8ab1e3b7afadf497017503a19015c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8a8ab1e3b7afadf497017503a19015c");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a(PhotoSelectorActivity.this.e(), "图片压缩成功", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
                PhotoSelectorActivity.a(PhotoSelectorActivity.this, str3, i);
            }

            @Override // com.meituan.android.identifycardrecognizer.compress.b
            public final void a(String str2, Exception exc) {
                Object[] objArr2 = {str2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23aa85dd7a1d89b0ab914a95cc164e42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23aa85dd7a1d89b0ab914a95cc164e42");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_rciyhe42", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("message", exc.getMessage()).b);
                PhotoSelectorActivity.a(PhotoSelectorActivity.this, str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fffb208f3074a23ce59e66b743b79f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fffb208f3074a23ce59e66b743b79f5c");
        } else if (isFinishing() || this.k) {
        } else {
            if (this.w == null || !this.w.isShowing()) {
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_1);
                }
                this.w = new MTProgressDialog(this, i, str);
                this.w.setCanceledOnTouchOutside(false);
                this.w.setCancelable(z);
                this.w.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4695b97ce936d119a912269fc886b071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4695b97ce936d119a912269fc886b071");
        } else if (isFinishing() || this.k || this.w == null || !this.w.isShowing()) {
        } else {
            this.w.dismiss();
            this.w = null;
        }
    }

    public static /* synthetic */ void c(PhotoSelectorActivity photoSelectorActivity, Dialog dialog) {
        Object[] objArr = {photoSelectorActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7166e5c10de5ee1b20828b5515452b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7166e5c10de5ee1b20828b5515452b81");
            return;
        }
        dialog.dismiss();
        photoSelectorActivity.finish();
    }

    public static /* synthetic */ void b(PhotoSelectorActivity photoSelectorActivity, Dialog dialog) {
        Object[] objArr = {photoSelectorActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daf89fec8a27775a76425243a241a375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daf89fec8a27775a76425243a241a375");
            return;
        }
        dialog.dismiss();
        photoSelectorActivity.finish();
    }

    public static /* synthetic */ void a(PhotoSelectorActivity photoSelectorActivity, Dialog dialog) {
        Object[] objArr = {photoSelectorActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26e14917fcf91d8fc0bd2fadb2007b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26e14917fcf91d8fc0bd2fadb2007b50");
        } else {
            photoSelectorActivity.a(photoSelectorActivity.z, photoSelectorActivity.x);
        }
    }
}
