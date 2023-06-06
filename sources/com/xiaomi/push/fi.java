package com.xiaomi.push;

import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public final class fi extends fb {
    public fi() {
        a(CSCallUris.SVID_CALL_PING, (String) null);
        a("0");
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.push.fb
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        return i().length == 0 ? byteBuffer : super.a(byteBuffer);
    }

    @Override // com.xiaomi.push.fb
    public final int j() {
        if (i().length == 0) {
            return 0;
        }
        return super.j();
    }
}
