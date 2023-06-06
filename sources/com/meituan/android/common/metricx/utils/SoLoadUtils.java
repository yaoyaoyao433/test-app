package com.meituan.android.common.metricx.utils;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.a;
import com.meituan.android.loader.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SoLoadUtils {
    private static final String BABEL_TAG = "so_load_success_ratio";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface LibLoadCallback {
        void onLoadFail(String str);

        void onLoadSuccess();
    }

    public static void loadLibrary(final String str, final LibLoadCallback libLoadCallback) {
        Object[] objArr = {str, libLoadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34e4a62f3c5c05c751e6f2467be1c681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34e4a62f3c5c05c751e6f2467be1c681");
        } else if (DynLoader.available(ContextProvider.getInstance().getContext(), str, 1)) {
            if (DynLoader.load(str)) {
                reportLoad(str, 1, "success");
                libLoadCallback.onLoadSuccess();
                return;
            }
            String str2 = str + " is available but load fail.";
            reportLoad(str, 0, str2);
            libLoadCallback.onLoadFail(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            DynLoader.toggleDownload(new a() { // from class: com.meituan.android.common.metricx.utils.SoLoadUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.loader.a
                public final void onDynDownloadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e99cd00f32333d08c64f656ba87ed9eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e99cd00f32333d08c64f656ba87ed9eb");
                    } else if (DynLoader.load(str)) {
                        SoLoadUtils.reportLoad(str, 1, "success");
                        libLoadCallback.onLoadSuccess();
                    } else {
                        String str3 = str + " toggleDownload succeed but load fail.";
                        SoLoadUtils.reportLoad(str, 0, str3);
                        libLoadCallback.onLoadFail(str3);
                    }
                }

                @Override // com.meituan.android.loader.a
                public final void onDynDownloadFailure() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ee8ed09db8be3faf069bcc17e2d03452", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ee8ed09db8be3faf069bcc17e2d03452");
                        return;
                    }
                    String str3 = str + " toggleDownload fail.";
                    SoLoadUtils.reportLoad(str, 0, str3);
                    libLoadCallback.onLoadFail(str3);
                }
            }, new c.a().a(arrayList).b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportLoad(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67e83cef70dd0b066c10f380226eac0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67e83cef70dd0b066c10f380226eac0e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("soName", str);
        Babel.log(new Log.Builder(str2).tag(BABEL_TAG).generalChannelStatus(true).value(i).optional(hashMap).build());
    }
}
