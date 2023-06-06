package com.sankuai.waimai.store.base.net.upload;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.waimai.platform.utils.e;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UploadInfo implements Serializable {
    private static final String DEFAULT_CONTENT_TYPE = "application/otcet-stream";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCancel;
    private String mFilePath;
    public String mOriginFilePath;
    private a mStatus;
    private int progress;

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a implements Serializable {
        START,
        UPLOADING,
        SUCCESS,
        FAILED;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9122b67a743075e5e0b5e8046c08feb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9122b67a743075e5e0b5e8046c08feb");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c83a6556c05581c99323ba0c0de0f70", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c83a6556c05581c99323ba0c0de0f70") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b16a581500efd05dbee71dff11050d52", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b16a581500efd05dbee71dff11050d52") : (a[]) values().clone();
        }
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public a getStatus() {
        if (this.mStatus == null) {
            this.mStatus = a.START;
        }
        return this.mStatus;
    }

    public boolean isCancel() {
        return this.isCancel;
    }

    public void setCancel(boolean z) {
        this.isCancel = z;
    }

    public void setStatus(a aVar) {
        this.mStatus = aVar;
    }

    public byte[] getFileBytes(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f398467fdb93f527fb3f53e9751a29c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f398467fdb93f527fb3f53e9751a29c");
        }
        try {
            return e.a(getFilePath(), i, i2);
        } catch (IOException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    public static ak getRequestBody(byte[] bArr, String str) {
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f67f365cd2e81a0c333d58481aab161c", RobustBitConfig.DEFAULT_VALUE) ? (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f67f365cd2e81a0c333d58481aab161c") : al.a(bArr, str);
    }

    public static ak getDefaultRequestBody(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44f09be8184e9a992094d3e05102865f", RobustBitConfig.DEFAULT_VALUE) ? (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44f09be8184e9a992094d3e05102865f") : getRequestBody(bArr, DEFAULT_CONTENT_TYPE);
    }

    public static ae.b getMultiPart(String str, String str2, ak akVar) {
        Object[] objArr = {str, str2, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "823d6970784765ebd7d07085220b5050", RobustBitConfig.DEFAULT_VALUE) ? (ae.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "823d6970784765ebd7d07085220b5050") : ae.b.a(str, str2, akVar);
    }
}
