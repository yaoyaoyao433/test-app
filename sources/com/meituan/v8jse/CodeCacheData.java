package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CodeCacheData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int length;
    private byte[] mByteCode;
    private int mTag;

    public CodeCacheData(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec4ae888679dbe17fca49bfee9df3287", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec4ae888679dbe17fca49bfee9df3287");
            return;
        }
        this.mByteCode = bArr;
        this.length = i;
        this.mTag = i2;
    }

    public byte[] getByteCode() {
        return this.mByteCode;
    }

    public int getLength() {
        return this.length;
    }

    public int getTag() {
        return this.mTag;
    }
}
