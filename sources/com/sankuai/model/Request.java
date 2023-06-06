package com.sankuai.model;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface Request<T> extends ResponseHandler<T> {
    T convert(JsonElement jsonElement) throws IOException;

    T execute(Origin origin) throws IOException;

    Uri getDataUri();

    HttpUriRequest getHttpUriRequest();

    boolean isLocalValid();

    void onDataGot(T t);

    void onDataUpdate(T t);

    void setContentObserver(ContentObserver contentObserver);

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum Origin {
        NET,
        LOCAL,
        UNSPECIFIED,
        NET_PREFERED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Origin() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93d82a5eb005e2a484c8849ad259e8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93d82a5eb005e2a484c8849ad259e8b");
            }
        }

        public static Origin valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1857b5bf49fada0625f58f5711e4e2b", RobustBitConfig.DEFAULT_VALUE) ? (Origin) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1857b5bf49fada0625f58f5711e4e2b") : (Origin) Enum.valueOf(Origin.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Origin[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d79b750cddf40d890f997feddbea88f4", RobustBitConfig.DEFAULT_VALUE) ? (Origin[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d79b750cddf40d890f997feddbea88f4") : (Origin[]) values().clone();
        }
    }
}
