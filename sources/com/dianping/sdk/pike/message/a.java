package com.dianping.sdk.pike.message;

import android.util.Base64;
import com.dianping.sdk.pike.i;
import com.meituan.android.pike.bean.MessageId;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static final int[] d = {TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, 251, 252, 253};
    private static volatile a e;
    public volatile String b;
    private AtomicInteger c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66f4c868ac615bc939351dea8d27867", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66f4c868ac615bc939351dea8d27867");
            return;
        }
        this.c = new AtomicInteger(0);
        this.b = "";
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20bf8836cd2bb513665720a712c6171b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20bf8836cd2bb513665720a712c6171b");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public final String b() {
        byte[] bArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ca53a213a78f71a8a98c7b40b0a4ac6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ca53a213a78f71a8a98c7b40b0a4ac6");
        }
        try {
            if (com.dianping.nvtunnelkit.utils.f.b(this.b) && this.b.length() >= 16) {
                byte[] decode = Base64.decode(this.b.substring(0, 16), 3);
                Object[] objArr2 = {decode};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82260a18c9c2e50ae0f31835a59ab2b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82260a18c9c2e50ae0f31835a59ab2b2");
                } else {
                    for (int i = 0; i < 12; i++) {
                        decode[i] = (byte) (decode[i] ^ (d[i % 4] & 255));
                    }
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f41918b656104a44c357aedbd6360a33", RobustBitConfig.DEFAULT_VALUE)) {
                    bArr = (byte[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f41918b656104a44c357aedbd6360a33");
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - MessageId.INITIAL_TIME_MILLIS;
                    byte[] bArr2 = {(byte) (bArr2[0] | ((currentTimeMillis >> 32) & 63)), (byte) (bArr2[1] | ((currentTimeMillis >> 24) & 255)), (byte) (bArr2[2] | ((currentTimeMillis >> 16) & 255)), (byte) (bArr2[3] | ((currentTimeMillis >> 8) & 255)), (byte) ((currentTimeMillis & 255) | bArr2[4]), (byte) ((this.c.getAndIncrement() & 255) | bArr2[5])};
                    bArr = bArr2;
                }
                byte[] bArr3 = new byte[18];
                System.arraycopy(decode, 0, bArr3, 0, 12);
                System.arraycopy(bArr, 0, bArr3, 12, 6);
                return Base64.encodeToString(bArr3, 3);
            }
        } catch (Exception e2) {
            i.a("MessageIdGenerator", "message id generate error", e2);
        }
        return String.valueOf(this.c.getAndIncrement());
    }
}
