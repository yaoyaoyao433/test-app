package com.google.zxing.datamatrix.encoder;

import android.support.v4.view.InputDeviceCompat;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements g {
    @Override // com.google.zxing.datamatrix.encoder.g
    public final void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!hVar.b()) {
                break;
            }
            sb.append(hVar.a());
            hVar.f++;
            int a = j.a(hVar.a, hVar.f, 5);
            if (a != 5) {
                hVar.g = a;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = hVar.e.length() + length + 1;
        hVar.a(length2);
        boolean z = hVar.h.b - length2 > 0;
        if (hVar.b() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length > 249 && length <= 1555) {
                sb.setCharAt(0, (char) ((length / CustomizedScrollView.ANIMATED_SCROLL_GAP) + 249));
                sb.insert(1, (char) (length % CustomizedScrollView.ANIMATED_SCROLL_GAP));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: " + length);
            }
        }
        int length3 = sb.length();
        for (int i = 0; i < length3; i++) {
            int charAt = sb.charAt(i) + (((hVar.e.length() + 1) * TbsListener.ErrorCode.NEEDDOWNLOAD_10) % 255) + 1;
            if (charAt > 255) {
                charAt += InputDeviceCompat.SOURCE_ANY;
            }
            hVar.a((char) charAt);
        }
    }
}
