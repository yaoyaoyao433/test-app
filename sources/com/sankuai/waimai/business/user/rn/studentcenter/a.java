package com.sankuai.waimai.business.user.rn.studentcenter;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.waimai.business.user.rn.studentcenter.api.AuthApi;
import com.sankuai.waimai.business.user.rn.studentcenter.bean.AuthBean;
import com.sankuai.waimai.business.user.rn.studentcenter.bean.UploadImgBean;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.l;
import com.tencent.open.SocialConstants;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private volatile com.sankuai.waimai.platform.net.service.a c;
    private Dialog d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.user.rn.studentcenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0881a {
        void a(WritableMap writableMap);

        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);

        void a(byte[] bArr);
    }

    public static /* synthetic */ Dialog a(a aVar, Dialog dialog) {
        aVar.d = null;
        return null;
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "31ffb5f8476c0fddadc32cdc73395f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "31ffb5f8476c0fddadc32cdc73395f58");
        } else if (l.a()) {
            com.sankuai.waimai.platform.widget.dialog.a.b(aVar.d);
            aVar.d = null;
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65cdf0d47b73a7736636f4eedecd0671", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65cdf0d47b73a7736636f4eedecd0671");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a.this.d);
                    a.a(a.this, (Dialog) null);
                }
            }, (String) null);
        }
    }

    public static /* synthetic */ void a(a aVar, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0a426497957a83990467c87a239abb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0a426497957a83990467c87a239abb3b");
        } else if (l.a()) {
            try {
                if (aVar.d != null) {
                    com.sankuai.waimai.platform.widget.dialog.a.b(aVar.d);
                    aVar.d = null;
                }
                aVar.d = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
                if (aVar.d != null) {
                    aVar.d.setCancelable(false);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str, final InterfaceC0881a interfaceC0881a) {
        Object[] objArr = {str, interfaceC0881a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "22a49a04c7c4ae10ef0b1f28da5eb468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "22a49a04c7c4ae10ef0b1f28da5eb468");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AuthApi) aVar.c.b().a(AuthApi.class)).ocrAuth(str, 2), new b.AbstractC1042b<BaseResponse<AuthBean>>() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbe1555a387fd8503e1ee517a953a4c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbe1555a387fd8503e1ee517a953a4c9");
                    } else if (baseResponse != null) {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        if (baseResponse.data != 0 && ((AuthBean) baseResponse.data).info != null) {
                            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                            writableNativeMap3.putString("name", ((AuthBean) baseResponse.data).info.name);
                            writableNativeMap3.putString("idCard", ((AuthBean) baseResponse.data).info.idCard);
                            writableNativeMap3.putString("schoolRoll", ((AuthBean) baseResponse.data).info.schoolRoll);
                            writableNativeMap3.putString("graduationDate", ((AuthBean) baseResponse.data).info.graduationDate);
                            writableNativeMap3.putString("educationForm", ((AuthBean) baseResponse.data).info.educationForm);
                            writableNativeMap3.putString("school", ((AuthBean) baseResponse.data).info.school);
                            writableNativeMap3.putString("studyTime", ((AuthBean) baseResponse.data).info.studyTime);
                            writableNativeMap2.putMap("campusMemberInfo", (WritableMap) writableNativeMap3);
                            writableNativeMap.putMap("data", (WritableMap) writableNativeMap2);
                        }
                        writableNativeMap.putInt("code", baseResponse.code);
                        writableNativeMap.putString("msg", baseResponse.msg);
                        interfaceC0881a.a(writableNativeMap);
                    } else {
                        interfaceC0881a.a("response null");
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "521ed47d4159eaa654c2398973004082", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "521ed47d4159eaa654c2398973004082");
                    } else {
                        interfaceC0881a.a(th.getMessage());
                    }
                }
            }, "StudentCenter", false);
        }
    }

    public static /* synthetic */ void a(a aVar, byte[] bArr, final InterfaceC0881a interfaceC0881a) {
        String encodeToString;
        Object[] objArr = {bArr, interfaceC0881a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "69ead1eb56483400234fefa5973982d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "69ead1eb56483400234fefa5973982d4");
            return;
        }
        ae.b a2 = ae.b.a(SocialConstants.PARAM_IMG_URL, "img.jpg", al.a(bArr, "image/jpeg"));
        String str = "";
        try {
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "448eec41563a24c4b7c3bd50cf03aa30", RobustBitConfig.DEFAULT_VALUE)) {
                encodeToString = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "448eec41563a24c4b7c3bd50cf03aa30");
            } else {
                Object[] objArr3 = {"MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAO1oWI7+eWgrC8NN\n+33wbWCAmnBC47HvrleUMR6HVU0aF9dKD6cvEqWStl7okDNSFXG4jcytulxmJupH\nUUeswXsIctWGJXSvNeo+b2MtAGT3xvjdL+6W7s0pDVcEAYNxnpyJROaIQBn9WzH6\nQ0Zv9SufZZhf9b6YT7FcCF9GvtiRAgMBAAECgYEArhRAM4HnFfnSY0AwM5VzLjq+\ng6iYeyXLic5RAhir9KA4cRWOSsGag6wDa65N5kO/E6cG2tlceFozGMB4mfzT1PCP\ne9HKZj1NgRGRVHDvWBb+3hWjle3EcljN6Ho+PV6QiNAiWOX4gSkmTA2z4QQuEfmg\n64/t0FYDHqvvd8rOa8ECQQD+oHR31bRDMw5IRlC/ulwgDu1GuH6dIDA5AiJ5TPho\nCuOMXM+y6UZWqRerRpYpS4d3nkj4FJopt1v2uGdV6GlJAkEA7rAeIOLr6OChOn2d\ndJmDGG3TbOe/lCahAEIs6DcyCrDhwO6KULnvD8R9xJYEtPvZpyyqPxpUJiBW5HTk\nm1b9CQJAeroT6P6UGB+vrp5VpVPJu5n2O7QJMuqk05V30EeNI3i8HJdPdMiDIpn1\n0pP/JIBHFxyvxwMHGzxJky1mgT24IQJBAKgRpTVc8+aH/Z9VAkEvMytJch12VeT5\nCldHQZ3F99ulT2Ft1kEfm6ELp898HxZdXJYlkj9ax7QNA4JcePiU2RkCQQCPbstI\nyCHhQMVgalxaupl4psjeXs6+L9nef0t0ldP9eD89M582KPgzTUHeDDgkaKWxkCEA\n8CgtIWkYPTxgjQPK\n"};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3053a5018c884e25af80737cb3f032e2", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3053a5018c884e25af80737cb3f032e2") : Base64.decode("MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAO1oWI7+eWgrC8NN\n+33wbWCAmnBC47HvrleUMR6HVU0aF9dKD6cvEqWStl7okDNSFXG4jcytulxmJupH\nUUeswXsIctWGJXSvNeo+b2MtAGT3xvjdL+6W7s0pDVcEAYNxnpyJROaIQBn9WzH6\nQ0Zv9SufZZhf9b6YT7FcCF9GvtiRAgMBAAECgYEArhRAM4HnFfnSY0AwM5VzLjq+\ng6iYeyXLic5RAhir9KA4cRWOSsGag6wDa65N5kO/E6cG2tlceFozGMB4mfzT1PCP\ne9HKZj1NgRGRVHDvWBb+3hWjle3EcljN6Ho+PV6QiNAiWOX4gSkmTA2z4QQuEfmg\n64/t0FYDHqvvd8rOa8ECQQD+oHR31bRDMw5IRlC/ulwgDu1GuH6dIDA5AiJ5TPho\nCuOMXM+y6UZWqRerRpYpS4d3nkj4FJopt1v2uGdV6GlJAkEA7rAeIOLr6OChOn2d\ndJmDGG3TbOe/lCahAEIs6DcyCrDhwO6KULnvD8R9xJYEtPvZpyyqPxpUJiBW5HTk\nm1b9CQJAeroT6P6UGB+vrp5VpVPJu5n2O7QJMuqk05V30EeNI3i8HJdPdMiDIpn1\n0pP/JIBHFxyvxwMHGzxJky1mgT24IQJBAKgRpTVc8+aH/Z9VAkEvMytJch12VeT5\nCldHQZ3F99ulT2Ft1kEfm6ELp898HxZdXJYlkj9ax7QNA4JcePiU2RkCQQCPbstI\nyCHhQMVgalxaupl4psjeXs6+L9nef0t0ldP9eD89M582KPgzTUHeDDgkaKWxkCEA\n8CgtIWkYPTxgjQPK\n", 0)));
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initSign(generatePrivate);
                signature.update(bArr);
                byte[] sign = signature.sign();
                Object[] objArr4 = {sign};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                encodeToString = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3051394f40b77dd85285c32fcb57532e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3051394f40b77dd85285c32fcb57532e") : Base64.encodeToString(sign, 0);
            }
            str = encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AuthApi) aVar.c.b().a(AuthApi.class)).uploadImg(a2, str != null ? Pattern.compile("\\n").matcher(str).replaceAll("") : ""), new b.AbstractC1042b<BaseResponse<UploadImgBean>>() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr5 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6747dd3aa340f5ce179291a030e8411f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6747dd3aa340f5ce179291a030e8411f");
                } else if (baseResponse != null && baseResponse.data != 0 && baseResponse.code == 0 && !TextUtils.isEmpty(((UploadImgBean) baseResponse.data).secret)) {
                    a.a(a.this, ((UploadImgBean) baseResponse.data).secret, interfaceC0881a);
                } else {
                    interfaceC0881a.a("response null");
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr5 = {th};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3af8006fb9f5aaa3b6f5ef0007ee4733", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3af8006fb9f5aaa3b6f5ef0007ee4733");
                } else {
                    interfaceC0881a.a(th.getMessage());
                }
            }
        }, "StudentCenter", false);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73826a6daf82822f889ec8b52898e66b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73826a6daf82822f889ec8b52898e66b");
        } else {
            this.c = new com.sankuai.waimai.platform.net.service.a() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.net.service.a
                public final String c() {
                    return "https://eagleeye.waimai.meituan.com/";
                }

                @Override // com.sankuai.waimai.platform.net.service.a
                public final Gson d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "924df6e95429e86eb3ae7f16de03ab6a", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "924df6e95429e86eb3ae7f16de03ab6a") : new GsonBuilder().registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).create();
                }
            };
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bf4ecc01a6cd83b1279c5756de34db8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bf4ecc01a6cd83b1279c5756de34db8");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public View a(View view, String str) {
        String str2;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26dcfe2d4b4e6cfe783bc41e29f1476c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26dcfe2d4b4e6cfe783bc41e29f1476c");
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eefc5ec81c553558731d9964a786a3fb", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eefc5ec81c553558731d9964a786a3fb");
        } else {
            Object tag = view.getTag(R.id.react_test_id);
            str2 = tag instanceof String ? (String) tag : null;
        }
        if (str2 == null || !str2.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a2 = a(viewGroup.getChildAt(i), str);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return null;
        }
        return view;
    }
}
