package com.meituan.android.pike.bean;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MessageId {
    public static final long INITIAL_TIME_MILLIS = 1514736000000L;
    private static final int TOKEN_PREFIX_LENGTH = 16;
    private static final int[] XOR_MASK = {TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, 251, 252, 253};
    public static ChangeQuickRedirect changeQuickRedirect;
    private long lastTimestamp;
    private int sequence;
    public String token;

    public MessageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e78818dbce6598918b96ce5ddcca8bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e78818dbce6598918b96ce5ddcca8bc4");
            return;
        }
        this.lastTimestamp = 0L;
        this.sequence = 0;
    }

    public String getMessageId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c404d05da2f19596db53f1354e707c1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c404d05da2f19596db53f1354e707c1b");
        }
        if (TextUtils.isEmpty(str)) {
            Class<?> cls = getClass();
            PikeLog.e(cls, "GetMessageid wrong for not token " + str);
            return null;
        }
        this.token = str;
        byte[] decode = Base64.decode(str.substring(0, 16), 0);
        xorWithMask(decode);
        byte[] timeAndSequenceBytes = timeAndSequenceBytes();
        byte[] bArr = new byte[18];
        System.arraycopy(decode, 0, bArr, 0, 12);
        System.arraycopy(timeAndSequenceBytes, 0, bArr, 12, 6);
        return Base64.encodeToString(bArr, 0);
    }

    private void xorWithMask(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a5a0208de233cb9155048a63a7374ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a5a0208de233cb9155048a63a7374ed");
            return;
        }
        for (int i = 0; i < 12; i++) {
            bArr[i] = (byte) (bArr[i] ^ (XOR_MASK[i % 4] & 255));
        }
    }

    private synchronized byte[] timeAndSequenceBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da29c449a8f3b005fb299f9382990ad6", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da29c449a8f3b005fb299f9382990ad6");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis == this.lastTimestamp) {
            int i = this.sequence + 1;
            this.sequence = i;
            if ((i & 255) == 0) {
                currentTimeMillis = waitForNextMills(this.lastTimestamp);
                this.sequence = 0;
            }
        } else {
            this.sequence = 0;
        }
        this.lastTimestamp = currentTimeMillis;
        long j = currentTimeMillis - INITIAL_TIME_MILLIS;
        byte[] bArr = {(byte) (bArr[0] | ((j >> 32) & 63)), (byte) (bArr[1] | ((j >> 24) & 255)), (byte) (bArr[2] | ((j >> 16) & 255)), (byte) (bArr[3] | ((j >> 8) & 255)), (byte) ((j & 255) | bArr[4]), (byte) (bArr[5] | (this.sequence & 255))};
        return bArr;
    }

    private long waitForNextMills(long j) {
        long currentTimeMillis;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abbb2e45fe761615ce4697de573e386", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abbb2e45fe761615ce4697de573e386")).longValue();
        }
        do {
            currentTimeMillis = System.currentTimeMillis();
        } while (currentTimeMillis <= j);
        return currentTimeMillis;
    }
}
