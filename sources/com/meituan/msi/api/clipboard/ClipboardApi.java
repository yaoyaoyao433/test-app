package com.meituan.msi.api.clipboard;

import com.meituan.android.clipboard.a;
import com.meituan.android.clipboard.b;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ClipboardApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ String a(ClipboardApi clipboardApi, int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, clipboardApi, changeQuickRedirect, false, "1957948e54ef6535c370d48da817562c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, clipboardApi, changeQuickRedirect, false, "1957948e54ef6535c370d48da817562c");
        }
        String str = "default error";
        switch (i) {
            case 0:
                str = "get service null";
                break;
            case 1:
                str = LogMonitor.EXCEPTION_TAG;
                break;
            case 2:
                str = "check read disabled";
                break;
            case 3:
                str = "check write disabled";
                break;
            case 4:
                str = "clip text empty";
                break;
            case 5:
                str = "business no permission";
                break;
        }
        if (exc != null) {
            return str + CommonConstant.Symbol.COLON + exc.getMessage();
        }
        return str;
    }

    @MsiApiMethod(name = "setClipboardData", request = ClipboardData.class)
    public void setClipboardData(final ClipboardData clipboardData, final MsiContext msiContext) {
        Object[] objArr = {clipboardData, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0309c547e42d36f56791cfb9526cd6e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0309c547e42d36f56791cfb9526cd6e3");
        } else {
            a.a(com.meituan.msi.a.f(), new a.InterfaceC0192a() { // from class: com.meituan.msi.api.clipboard.ClipboardApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.a.InterfaceC0192a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "850d0ca6376e2ccf1667dae8d9c891ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "850d0ca6376e2ccf1667dae8d9c891ba");
                        return;
                    }
                    String str = "";
                    if (clipboardData != null && clipboardData._mt != null) {
                        str = clipboardData._mt.sceneToken;
                    }
                    if (str != null) {
                        a.a(str, "content_copied_to_clipboard", clipboardData.data, "msi_clipboardModule", new b() { // from class: com.meituan.msi.api.clipboard.ClipboardApi.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.clipboard.b
                            public final void onSuccess() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82abe969898d8fa636e94a8584e308a2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82abe969898d8fa636e94a8584e308a2");
                                } else {
                                    msiContext.onSuccess("");
                                }
                            }

                            @Override // com.meituan.android.clipboard.b
                            public final void onFail(int i, Exception exc) {
                                Object[] objArr3 = {Integer.valueOf(i), exc};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "59d9252d7a526b2cf40a608662c11e01", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "59d9252d7a526b2cf40a608662c11e01");
                                } else {
                                    msiContext.onError(ClipboardApi.a(ClipboardApi.this, i, exc));
                                }
                            }
                        });
                    } else {
                        msiContext.onError("token is empty");
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getClipboardData", request = ClipboardParam.class, response = ClipboardReponse.class)
    public void getClipboardData(final ClipboardParam clipboardParam, final MsiContext msiContext) {
        Object[] objArr = {clipboardParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965ce9f96e64fd2355b6a5f81631071f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965ce9f96e64fd2355b6a5f81631071f");
        } else {
            a.a(com.meituan.msi.a.f(), new a.InterfaceC0192a() { // from class: com.meituan.msi.api.clipboard.ClipboardApi.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.a.InterfaceC0192a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9fb637e028d0b51c17d347f40aa8947", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9fb637e028d0b51c17d347f40aa8947");
                        return;
                    }
                    String str = "";
                    if (clipboardParam != null && clipboardParam._mt != null) {
                        str = clipboardParam._mt.sceneToken;
                    }
                    ClipboardReponse clipboardReponse = new ClipboardReponse();
                    if (str != null) {
                        CharSequence a2 = a.a(str, "msi_clipboardModule", new b() { // from class: com.meituan.msi.api.clipboard.ClipboardApi.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.clipboard.b
                            public final void onSuccess() {
                            }

                            @Override // com.meituan.android.clipboard.b
                            public final void onFail(int i, Exception exc) {
                                Object[] objArr3 = {Integer.valueOf(i), exc};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d7930de2dc8fb7972b4a359947dd908b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d7930de2dc8fb7972b4a359947dd908b");
                                } else {
                                    msiContext.onError(ClipboardApi.a(ClipboardApi.this, i, exc));
                                }
                            }
                        });
                        clipboardReponse.data = a2 == null ? "" : a2.toString();
                        msiContext.onSuccess(clipboardReponse);
                        return;
                    }
                    msiContext.onError("token is empty");
                }
            });
        }
    }
}
