package com.meituan.mmp.lib.api.media;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.an;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import java.io.File;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageInfoModule extends ServiceApi {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2049e2dedefa0aa8e3937a3d15ba509c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2049e2dedefa0aa8e3937a3d15ba509c") : new String[]{"getImageInfo"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c9cfc5d5eec463bbe73c883bf851fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c9cfc5d5eec463bbe73c883bf851fc");
            return;
        }
        String optString = jSONObject.optString(RaptorUploaderImpl.SRC);
        if (TextUtils.isEmpty(optString)) {
            iApiCallback.onFail();
        } else if (URLUtil.isNetworkUrl(optString)) {
            Object[] objArr2 = {optString, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "428df41937845f02828bf5b1235536e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "428df41937845f02828bf5b1235536e7");
            } else {
                an.a().e().newCall(new Request.Builder().url(optString).build()).enqueue(new Callback() { // from class: com.meituan.mmp.lib.api.media.ImageInfoModule.1
                    public static ChangeQuickRedirect a;

                    @Override // okhttp3.Callback
                    public final void onFailure(Call call, IOException iOException) {
                        Object[] objArr3 = {call, iOException};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e50ae597dd599942b9547bf27f8e47cf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e50ae597dd599942b9547bf27f8e47cf");
                        } else {
                            iApiCallback.onFail(null);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
                    @Override // okhttp3.Callback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onResponse(okhttp3.Call r14, okhttp3.Response r15) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 265
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.media.ImageInfoModule.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
                    }
                });
            }
        } else {
            String a2 = s.a(getContext(), optString, getAppConfig());
            if (!q.a(a2, getAppConfig().e(getContext()))) {
                q.a(iApiCallback);
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            a.a(a2, options);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", options.outWidth);
                jSONObject2.put("height", options.outHeight);
                if (options.outMimeType != null) {
                    jSONObject2.put("type", options.outMimeType.replace("image/", ""));
                }
                jSONObject2.put(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, a(new File(a2)));
                jSONObject2.put("path", optString);
                iApiCallback.onSuccess(jSONObject2);
            } catch (JSONException unused) {
                b.d("InnerApi", "getImageInfo assemble result exception!");
                iApiCallback.onFail();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6e29c3b555c0cf6f88128a4047e44d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6e29c3b555c0cf6f88128a4047e44d");
        }
        try {
            switch (Integer.valueOf(new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1)).intValue()) {
                case 1:
                    return TraceSQLHelper.KEY_UP;
                case 2:
                    return "up-mirrored";
                case 3:
                    return TraceSQLHelper.KEY_DOWN;
                case 4:
                    return "down-mirrored";
                case 5:
                    return "left-mirrored";
                case 6:
                    return "right";
                case 7:
                    return "right-mirrored";
                case 8:
                    return "left";
                default:
                    return TraceSQLHelper.KEY_UP;
            }
        } catch (IOException unused) {
            return TraceSQLHelper.KEY_UP;
        }
    }
}
