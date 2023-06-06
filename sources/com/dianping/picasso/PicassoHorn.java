package com.dianping.picasso;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoHorn {
    private static final String HORN_TYPE = "Picasso";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Gson gson = new GsonBuilder().create();
    private static HornConfig hornConfig = new HornConfig();

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes.dex */
    public static class HornConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("jsErrorUploadToCat")
        public boolean jsErrorUploadToCat;
        @SerializedName("jsErrorUploadToCrashPlatform")
        public boolean jsErrorUploadToCrashPlatform;
        @SerializedName("jsErrorUploadToRaptor")
        public boolean jsErrorUploadToRaptor;
        @SerializedName("jsErrorUploadVCInfo")
        public boolean jsErrorUploadVCInfo;
    }

    public static void initHorn(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46ec0f3d1aaf096eb3a7cd62dffd394f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46ec0f3d1aaf096eb3a7cd62dffd394f");
            return;
        }
        Horn.init(context);
        Horn.register(HORN_TYPE, new HornCallback() { // from class: com.dianping.picasso.PicassoHorn.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7880cbd4f36b02228c20ab9b4b479ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7880cbd4f36b02228c20ab9b4b479ac");
                } else if (z) {
                    try {
                        HornConfig unused = PicassoHorn.hornConfig = (HornConfig) PicassoHorn.gson.fromJson(str, (Class<Object>) HornConfig.class);
                        if (PicassoHorn.hornConfig == null) {
                            HornConfig unused2 = PicassoHorn.hornConfig = new HornConfig();
                        }
                    } catch (Exception unused3) {
                        HornConfig unused4 = PicassoHorn.hornConfig = new HornConfig();
                    }
                }
            }
        });
    }

    @NonNull
    public static HornConfig getHornConfig() {
        return hornConfig;
    }
}
