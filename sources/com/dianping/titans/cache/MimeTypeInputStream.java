package com.dianping.titans.cache;

import android.webkit.WebResourceResponse;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MimeTypeInputStream {
    public static ChangeQuickRedirect changeQuickRedirect;
    public InputStream in;
    public String mimeType;
    public WebResourceResponse resourceResponse;
    public Type type;

    @Deprecated
    public MimeTypeInputStream(String str, InputStream inputStream) {
        this.mimeType = str;
        this.in = inputStream;
        this.type = Type.CACHE;
    }

    public MimeTypeInputStream(String str, InputStream inputStream, Type type) {
        this.mimeType = str;
        this.in = inputStream;
        this.type = type;
    }

    public MimeTypeInputStream(String str, InputStream inputStream, Type type, WebResourceResponse webResourceResponse) {
        this(str, inputStream, type);
        this.resourceResponse = webResourceResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Type {
        LOCAL_ID(DeviceInfo.LOCAL_ID),
        HTTP_DNS("httpDns"),
        CACHE("cache");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private String value;

        public static Type valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5d1a38f931b9bce523b40b180c6595c", RobustBitConfig.DEFAULT_VALUE) ? (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5d1a38f931b9bce523b40b180c6595c") : (Type) Enum.valueOf(Type.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b368db0b2c170e55819726dc3a3bff5d", RobustBitConfig.DEFAULT_VALUE) ? (Type[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b368db0b2c170e55819726dc3a3bff5d") : (Type[]) values().clone();
        }

        Type(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f96296c592957771edc3157ce7d2e3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f96296c592957771edc3157ce7d2e3e");
            } else {
                this.value = str;
            }
        }

        public final String getValue() {
            return this.value;
        }
    }
}
