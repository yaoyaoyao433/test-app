package com.meituan.android.yoda.model;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Bitmap b;
    public Rect c;
    public byte[] d;
    public String e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    @Nullable
    public static a[] a(@NonNull byte[] bArr, @NonNull int[] iArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, byte[][] bArr4, int[][] iArr2, byte[][] bArr5, byte[][] bArr6, boolean[] zArr) {
        int i;
        Object[] objArr = {bArr, iArr, bArr2, bArr3, bArr4, iArr2, bArr5, bArr6, zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        int i2 = 0;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d1a69937e37b701a528752bb93fc87c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d1a69937e37b701a528752bb93fc87c");
        }
        if (bArr == null || iArr == null) {
            return null;
        }
        com.meituan.android.yoda.monitor.log.a.a("FaceDetectionInfo", "parseFaceDetectionInfos, encodeDataLen.length = " + iArr.length + ", encodeDataLen = " + x.a(iArr), true);
        com.meituan.android.yoda.monitor.log.a.a("FaceDetectionInfo", "parseFaceDetectionInfos, faceRect.length = " + bArr2.length + ", faceRect = " + x.a(bArr2), true);
        com.meituan.android.yoda.monitor.log.a.a("FaceDetectionInfo", "parseFaceDetectionInfos, check.length = " + bArr3.length + ", check = " + x.a(bArr3), true);
        if (bArr4 == null || bArr4.length <= 0 || zArr == null) {
            i = 0;
        } else {
            i = 0;
            for (boolean z : zArr) {
                if (z) {
                    i++;
                }
            }
            com.meituan.android.yoda.monitor.log.a.a("FaceDetectionInfo", "parseFaceDetectionInfos, ray length = " + i, true);
        }
        a[] aVarArr = new a[iArr.length + i];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            a aVar = new a();
            aVar.d = Arrays.copyOfRange(bArr, i3, iArr[i4] + i3);
            i3 += iArr[i4];
            int i5 = i4 * 88;
            aVar.e = new String(Arrays.copyOfRange(bArr2, i5, i5 + 88));
            int i6 = i4 * 44;
            aVar.f = new String(Arrays.copyOfRange(bArr3, i6, i6 + 44));
            aVarArr[i4] = aVar;
        }
        if (bArr4 != null && bArr4.length > 0) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < bArr4.length) {
                if (zArr[i7]) {
                    a aVar2 = new a();
                    com.meituan.android.yoda.monitor.log.a.a("FaceDetectionInfo", "parseFaceDetectionInfos, rayEncodeData.length = " + bArr4[i7].length + " rayEncodeDataLen:" + x.a(iArr2[i7]), true);
                    aVar2.d = Arrays.copyOfRange(bArr4[i7], i2, iArr2[i7][i2]);
                    aVar2.e = new String(Arrays.copyOfRange(bArr5[i7], i2, 88));
                    aVar2.f = new String(Arrays.copyOfRange(bArr6[i7], 0, 44));
                    aVar2.g = 1;
                    aVar2.h = i7;
                    if (i8 == 0) {
                        aVar2.i = true;
                    }
                    aVarArr[iArr.length + i8] = aVar2;
                    i8++;
                }
                i7++;
                i2 = 0;
            }
        }
        return aVarArr;
    }
}
