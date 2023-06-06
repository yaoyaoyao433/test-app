package com.sankuai.meituan.android.knb.upload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UploadFileManager {
    public static final int ERROR_2020 = 2020;
    public static final int ERROR_2021 = 2021;
    public static final int ERROR_2022 = 2022;
    public static final int ERROR_520 = 520;
    public static final int ERROR_521 = 521;
    public static final String ERROR_MSG_2020 = "signature error";
    public static final String ERROR_MSG_2021 = "uploader error";
    public static final String ERROR_MSG_2022 = "下载 token 获取错误";
    public static final String ERROR_MSG_520 = "require parameter";
    public static final String ERROR_MSG_521 = "parameter error";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IUploadFileHandler sUploadFileHandler;

    public static void setUploadFileHandler(IUploadFileHandler iUploadFileHandler) {
        sUploadFileHandler = iUploadFileHandler;
    }

    private static void checkUploadFileHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fbc58437d49ce3598c875a25b906c6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fbc58437d49ce3598c875a25b906c6ef");
        } else if (sUploadFileHandler == null) {
            setUploadFileHandler(new DefaultUploadFileHandlerImpl(str));
        }
    }

    public static void uploadFile(JSONObject jSONObject, OnUploadFileCompleted onUploadFileCompleted) {
        Object[] objArr = {jSONObject, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e7da26a9c6c7db169bfc2c47080b58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e7da26a9c6c7db169bfc2c47080b58c");
        } else {
            uploadFile("", jSONObject, onUploadFileCompleted);
        }
    }

    public static void uploadFile(String str, final JSONObject jSONObject, final OnUploadFileCompleted onUploadFileCompleted) {
        Object[] objArr = {str, jSONObject, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf3425d5cd4aa71b81a11770d6abbafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf3425d5cd4aa71b81a11770d6abbafb");
            return;
        }
        checkUploadFileHandler(str);
        KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.sankuai.meituan.android.knb.upload.UploadFileManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33c1c909e98e6c3353098dd463fee11f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33c1c909e98e6c3353098dd463fee11f");
                } else {
                    UploadFileManager.sUploadFileHandler.uploadFile(jSONObject, onUploadFileCompleted);
                }
            }
        });
    }

    public static String getValuableString(@NonNull JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0780c2ce20761ce3f8b0123038e1bec4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0780c2ce20761ce3f8b0123038e1bec4");
        }
        Object opt = jSONObject.opt(str);
        if (opt == JSONObject.NULL) {
            return null;
        }
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return String.valueOf(opt);
        }
        return null;
    }
}
