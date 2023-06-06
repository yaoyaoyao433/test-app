package com.sankuai.meituan.android.knb.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.image.ImageUploadServiceData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBGsonProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile KNBGsonProvider provider;
    private final Gson gson;
    private final GsonBuilder gsonBuilder;

    public KNBGsonProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "505e615fc8a199ea7f162b2f73080f90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "505e615fc8a199ea7f162b2f73080f90");
            return;
        }
        this.gsonBuilder = new GsonBuilder();
        this.gsonBuilder.registerTypeAdapter(ImageUploadServiceData.class, new ImageUploadServiceDataDeserializer());
        this.gson = this.gsonBuilder.create();
    }

    public static KNBGsonProvider getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "772155a83db553a8d8d6916a746b738a", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBGsonProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "772155a83db553a8d8d6916a746b738a");
        }
        if (provider == null) {
            synchronized (KNBGsonProvider.class) {
                if (provider == null) {
                    provider = new KNBGsonProvider();
                }
            }
        }
        return provider;
    }

    public Gson get() {
        return this.gson;
    }
}
