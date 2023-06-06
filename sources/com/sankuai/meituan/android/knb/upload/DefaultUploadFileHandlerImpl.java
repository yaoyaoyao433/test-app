package com.sankuai.meituan.android.knb.upload;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.EventReporter;
import com.dianping.titans.utils.LocalIdUtils;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.meituan.android.knb.http.RetrofitFactory;
import com.sankuai.meituan.android.knb.upload.retrofit.DefaultUploadFileResponse;
import com.sankuai.meituan.android.knb.upload.retrofit.DefaultUploadFileRetrofitService;
import com.sankuai.meituan.android.knb.upload.retrofit.SecureTokenResponse;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DefaultUploadFileHandlerImpl extends AbstractUploadFileHandlerImpl {
    private static final String EPASSPORT = "epassport";
    private static final String REPORT_INFO_TAG = "titans-info";
    private static final String TYPE_BUSINESS = "business";
    private static final String TYPE_BUSINESSTEST = "businessTest";
    private static final String TYPE_USERCENTER = "userCenter";
    private static final String TYPE_USERCENTERTEST = "userCenterTest";
    public static final String VENUS_URL = "https://pic-up.meituan.com/";
    public static final String VENUS_URL_FOR_TEST = "http://extrauploader.inf.test.sankuai.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String hostUrl;
    protected DefaultUploadFileRetrofitService service;

    public DefaultUploadFileHandlerImpl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e85e61ab6bcbdb3707a7f302cb535958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e85e61ab6bcbdb3707a7f302cb535958");
            return;
        }
        this.hostUrl = str;
        init();
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38927502c55afd777ba6a853c7476c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38927502c55afd777ba6a853c7476c9c");
            return;
        }
        String str = VENUS_URL;
        if (BridgeConfigManager.isDebug()) {
            str = VENUS_URL_FOR_TEST;
        }
        this.service = (DefaultUploadFileRetrofitService) RetrofitFactory.getInstance(str).a(DefaultUploadFileRetrofitService.class);
    }

    @Override // com.sankuai.meituan.android.knb.upload.IUploadFileHandler
    public void uploadFile(JSONObject jSONObject, OnUploadFileCompleted onUploadFileCompleted) {
        Object[] objArr = {jSONObject, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf3d097649ca3f402b4d82aed65751c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf3d097649ca3f402b4d82aed65751c8");
            return;
        }
        String valuableString = UploadFileManager.getValuableString(jSONObject, "contentType");
        if (TextUtils.isEmpty(valuableString) || valuableString.startsWith("image/")) {
            uploadImage(jSONObject, onUploadFileCompleted);
        } else {
            uploadOthers(jSONObject, onUploadFileCompleted);
        }
    }

    public void uploadOthers(JSONObject jSONObject, OnUploadFileCompleted onUploadFileCompleted) {
        Object[] objArr = {jSONObject, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2569a1190ce0789f77d7e890e31d1398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2569a1190ce0789f77d7e890e31d1398");
        } else {
            S3Uploader.uploadOthers(jSONObject, onUploadFileCompleted);
        }
    }

    private ak makeRequestBody(String str, String str2, OnUploadFileCompleted onUploadFileCompleted) throws Exception {
        Object[] objArr = {str, str2, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06cc2add08fd9f29ac735ab8b39db996", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06cc2add08fd9f29ac735ab8b39db996");
        }
        Uri uri = LocalIdUtils.getUri(str);
        if (TextUtils.equals("content", uri.getScheme())) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream b = ContentResolverProvider.getContentResolver(onUploadFileCompleted.getContext(), onUploadFileCompleted.getSceneToken()).b(uri);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = b.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        return al.a(byteArrayOutputStream.toByteArray(), str2);
                    }
                }
            } catch (Exception unused) {
                return null;
            } finally {
                IOUtils.close(b);
                IOUtils.close(byteArrayOutputStream);
            }
        } else {
            return al.a(LocalIdUtils.getFile(str, onUploadFileCompleted.getSceneToken()), str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (r3.equals("business") != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029e A[Catch: Exception -> 0x01c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x01c8, blocks: (B:80:0x01ce, B:82:0x01e5, B:84:0x01ed, B:86:0x0204, B:88:0x021f, B:91:0x0256, B:93:0x025a, B:96:0x0266, B:98:0x026a, B:100:0x028c, B:89:0x0238, B:104:0x029e, B:103:0x0294), top: B:114:0x01ce, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uploadImage(org.json.JSONObject r21, com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted r22) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.upload.DefaultUploadFileHandlerImpl.uploadImage(org.json.JSONObject, com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted):void");
    }

    private void reportAnonymousUploadImage(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c651c4f1e201c95075e944a9f329040e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c651c4f1e201c95075e944a9f329040e");
        } else if (TextUtils.isEmpty(this.hostUrl)) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("case", "uploadFileAnonymous");
                hashMap.put("isLogin", Integer.valueOf(z ? 1 : 0));
                hashMap.put("url", this.hostUrl);
                EventReporter.reportBabel(hashMap, REPORT_INFO_TAG);
            } catch (Exception unused) {
            }
        }
    }

    private void getSecureTokenAndCallback(JSONObject jSONObject, DefaultUploadFileResponse defaultUploadFileResponse, OnUploadFileCompleted onUploadFileCompleted, String str) throws IOException {
        String str2;
        Object[] objArr = {jSONObject, defaultUploadFileResponse, onUploadFileCompleted, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7210ffd1bc7148eff1c0a10d78f8ba54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7210ffd1bc7148eff1c0a10d78f8ba54");
            return;
        }
        boolean z = jSONObject != null && jSONObject.optBoolean("secure", false);
        try {
            str2 = new Gson().toJson(defaultUploadFileResponse);
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = null;
        }
        if (z) {
            SecureTokenResponse e = this.service.getSecureToken("https://websafe.meituan.com/signature/venus/secureToken", jSONObject.optString("client", "shaitu"), jSONObject.optString("secret"), str, jSONObject.optInt("maxAge", DaBaiBean.DABAI_DATA_EXPIRE_TIME)).a().e();
            if (e.code == 0) {
                onUploadFileCompleted.onSuccess(str2, str, e.token, 0);
                return;
            } else {
                onUploadFileCompleted.onError("", 0, "", e.code);
                return;
            }
        }
        onUploadFileCompleted.onSuccess(str2, str, null, 0);
    }
}
