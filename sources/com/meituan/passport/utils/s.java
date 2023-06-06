package com.meituan.passport.utils;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.api.AccountApiFactory;
import com.meituan.passport.api.OpenApi;
import com.meituan.passport.api.OpenApiFactory;
import com.meituan.passport.api.OperatorApi;
import com.meituan.passport.api.OperatorApiFactory;
import com.meituan.passport.api.UserApi;
import com.meituan.passport.api.UserApiFactory;
import com.meituan.passport.api.VerifyApi;
import com.meituan.passport.api.VerifyApiFactory;
import com.meituan.passport.dialogs.ProgressDialogFragment;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.Ticket;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ae;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a = null;
    private static String b = "wxa552e31d6839de85";

    public static AccountApi a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e061dc8db8f2d2864f0efe3e678b2021", RobustBitConfig.DEFAULT_VALUE) ? (AccountApi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e061dc8db8f2d2864f0efe3e678b2021") : AccountApiFactory.getInstance().create();
    }

    public static OpenApi b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "660ecc078ee8e95480f6360bd3467f67", RobustBitConfig.DEFAULT_VALUE) ? (OpenApi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "660ecc078ee8e95480f6360bd3467f67") : OpenApiFactory.getInstance().create();
    }

    public static VerifyApi c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00cf0d01035ab83ab30613d42a831fa5", RobustBitConfig.DEFAULT_VALUE) ? (VerifyApi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00cf0d01035ab83ab30613d42a831fa5") : VerifyApiFactory.getInstance().create();
    }

    public static OperatorApi d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64d2bedf83779ed54d790f9ab6b32a5b", RobustBitConfig.DEFAULT_VALUE) ? (OperatorApi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64d2bedf83779ed54d790f9ab6b32a5b") : OperatorApiFactory.getInstance().create();
    }

    public static UserApi e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d30e49523de3b8c34379b49035dab813", RobustBitConfig.DEFAULT_VALUE) ? (UserApi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d30e49523de3b8c34379b49035dab813") : UserApiFactory.getInstance().create();
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd3e16ad8783b83ad2bf16253057cab8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd3e16ad8783b83ad2bf16253057cab8") : com.meituan.passport.plugins.q.a().c().b();
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cf52a48e9ef44002b70b66e00a74ff9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cf52a48e9ef44002b70b66e00a74ff9") : com.meituan.passport.plugins.r.a().b();
    }

    public static void a(final com.meituan.passport.converter.m<User> mVar, FragmentActivity fragmentActivity, byte[] bArr) {
        byte[] bArr2;
        boolean z = true;
        Object[] objArr = {mVar, fragmentActivity, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e59b8c2fe63e6e6cbe52b422d21636a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e59b8c2fe63e6e6cbe52b422d21636a0");
        } else if (fragmentActivity != null) {
            UserCenter userCenter = UserCenter.getInstance(fragmentActivity);
            if (userCenter == null || !userCenter.isLogin()) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = Boolean.valueOf(userCenter == null);
                String format = String.format("userCenter is null ? [%s]", objArr2);
                Object[] objArr3 = new Object[1];
                objArr3[0] = Boolean.valueOf((userCenter == null || !userCenter.isLogin()) ? false : false);
                String format2 = String.format("user is login ? [%s]", objArr3);
                n.a("NetUtils.updateUserAvatarPicture", "userCenter is null or user is not login", format + ", " + format2);
                return;
            }
            n.a("NetUtils.updateUserAvatarPicture", "user is login", "true");
            try {
                bArr2 = "255".getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bArr2 = new byte[0];
            }
            com.sankuai.meituan.retrofit2.ak a2 = com.sankuai.meituan.retrofit2.al.a(bArr2, "US-ASCII");
            ae.b a3 = ae.b.a("pic", "image.jpg", com.sankuai.meituan.retrofit2.al.a(bArr, "image/jpg"));
            ae.b a4 = ae.b.a("avatartype", null, a2);
            com.meituan.passport.pojo.request.c cVar = new com.meituan.passport.pojo.request.c();
            HashMap hashMap = new HashMap();
            for (String str : cVar.c().keySet()) {
                hashMap.put(str, com.sankuai.meituan.retrofit2.al.a(cVar.c().get(str).toString().getBytes(Charset.forName("UTF-8")), "multipart/form-data"));
            }
            hashMap.put("token", com.sankuai.meituan.retrofit2.al.a(userCenter.getUser().token.getBytes(Charset.forName("UTF-8")), "multipart/form-data"));
            final com.meituan.passport.handler.exception.c cVar2 = (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragmentActivity, (com.meituan.passport.converter.b) null)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, (com.meituan.passport.converter.b) null)).b;
            Call<User> uploadUserAvatarPicture = b().uploadUserAvatarPicture(hashMap, a4, a3);
            final WeakReference weakReference = new WeakReference(fragmentActivity.getSupportFragmentManager());
            ProgressDialogFragment.a((FragmentManager) weakReference.get(), R.string.passport_upload_user_profile_photo_loading);
            uploadUserAvatarPicture.a(new com.sankuai.meituan.retrofit2.f<User>() { // from class: com.meituan.passport.utils.s.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<User> call, Response<User> response) {
                    boolean z2 = true;
                    Object[] objArr4 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "7d140fca03b19b9caea6583064b3c2c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "7d140fca03b19b9caea6583064b3c2c2");
                        return;
                    }
                    if ((response == null || !response.f() || response.e() == null) ? false : false) {
                        n.a("NetUtils.updateUserAvatarPicture", "uploadUserAvatarPicture response", "is successful");
                        User e = response.e();
                        if (com.meituan.passport.converter.m.this != null) {
                            com.meituan.passport.converter.m.this.a(e);
                        }
                        if (weakReference == null || weakReference.get() == null) {
                            return;
                        }
                        ProgressDialogFragment.a((FragmentManager) weakReference.get());
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<User> call, Throwable th) {
                    Object[] objArr4 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "80b0036b1084deb8201270b7d7546960", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "80b0036b1084deb8201270b7d7546960");
                        return;
                    }
                    n.a("NetUtils.updateUserAvatarPicture", "uploadUserAvatarPicture  exception", th != null ? th.getMessage() : "");
                    if (cVar2 != null) {
                        cVar2.b(th);
                    }
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ProgressDialogFragment.a((FragmentManager) weakReference.get());
                }
            });
        }
    }

    public static void a(com.meituan.passport.converter.m<Ticket> mVar, com.meituan.passport.converter.b bVar, Fragment fragment, String str, String str2, String str3) {
        Object[] objArr = {mVar, bVar, fragment, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a8539e39e4d21401dcaed09edbb3c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a8539e39e4d21401dcaed09edbb3c55");
        } else if (!fragment.isAdded() || str == null || str2 == null || TextUtils.isEmpty(str3)) {
        } else {
            com.sankuai.android.jarvis.c.a("thread-resetPasswordCheck", new AnonymousClass2(str, str2, str3, mVar, (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragment, bVar)).a(new com.meituan.passport.handler.exception.f(fragment, bVar)).b)).start();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.utils.s$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ com.meituan.passport.converter.m e;
        public final /* synthetic */ com.meituan.passport.handler.exception.c f;

        public AnonymousClass2(String str, String str2, String str3, com.meituan.passport.converter.m mVar, com.meituan.passport.handler.exception.c cVar) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = mVar;
            this.f = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378667d9accdce6813b2d8a0eb1835dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378667d9accdce6813b2d8a0eb1835dd");
                return;
            }
            final String f = s.f();
            if (TextUtils.isEmpty(f)) {
                return;
            }
            final String g = s.g();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.utils.s.2.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20cd3c0558fd014e023f42a2e57a2aec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20cd3c0558fd014e023f42a2e57a2aec");
                    } else {
                        s.b().resetPasswordCheck(com.meituan.passport.encryption.a.b(AnonymousClass2.this.b), AnonymousClass2.this.c, AnonymousClass2.this.d, f, g).a(new com.sankuai.meituan.retrofit2.f<Ticket>() { // from class: com.meituan.passport.utils.s.2.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<Ticket> call, Response<Ticket> response) {
                                boolean z = true;
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4f900540c34aef2877c00ed747a91ea", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4f900540c34aef2877c00ed747a91ea");
                                    return;
                                }
                                if ((response == null || !response.f() || response.e() == null) ? false : false) {
                                    Ticket e = response.e();
                                    if (AnonymousClass2.this.e != null) {
                                        AnonymousClass2.this.e.a(e);
                                    }
                                }
                            }

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<Ticket> call, Throwable th) {
                                Object[] objArr3 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5b732ef214e6888ddad94f4fff11a90", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5b732ef214e6888ddad94f4fff11a90");
                                } else if (AnonymousClass2.this.f != null) {
                                    AnonymousClass2.this.f.b(th);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
