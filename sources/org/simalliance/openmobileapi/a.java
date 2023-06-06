package org.simalliance.openmobileapi;

import java.io.IOException;
import org.simalliance.openmobileapi.service.ISmartcardServiceChannel;
import org.simalliance.openmobileapi.service.SmartcardError;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public final ISmartcardServiceChannel a;
    public final c b;
    private d c;
    private final Object d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar, d dVar, ISmartcardServiceChannel iSmartcardServiceChannel) {
        this.b = cVar;
        this.c = dVar;
        this.a = iSmartcardServiceChannel;
    }

    public final byte[] a(byte[] bArr) throws IOException {
        byte[] transmit;
        if (this.b == null || !this.b.a()) {
            throw new IllegalStateException("service not connected to system");
        }
        if (this.a == null) {
            throw new NullPointerException("channel must not be null");
        }
        synchronized (this.d) {
            SmartcardError smartcardError = new SmartcardError();
            try {
                transmit = this.a.transmit(bArr, smartcardError);
                c.a(smartcardError);
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }
        return transmit;
    }

    public final byte[] a() {
        if (this.b == null || !this.b.a()) {
            throw new IllegalStateException("service not connected to system");
        }
        if (this.a == null) {
            throw new NullPointerException("channel must not be null");
        }
        try {
            if (this.a.isClosed()) {
                throw new IllegalStateException("channel is closed");
            }
            try {
                byte[] selectResponse = this.a.getSelectResponse();
                if (selectResponse == null || selectResponse.length != 0) {
                    return selectResponse;
                }
                return null;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }
}
