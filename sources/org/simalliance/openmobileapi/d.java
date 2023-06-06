package org.simalliance.openmobileapi;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import org.simalliance.openmobileapi.service.ISmartcardServiceChannel;
import org.simalliance.openmobileapi.service.ISmartcardServiceSession;
import org.simalliance.openmobileapi.service.SmartcardError;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d {
    private final Object a = new Object();
    private final c b;
    private final b c;
    private final ISmartcardServiceSession d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar, ISmartcardServiceSession iSmartcardServiceSession, b bVar) {
        this.b = cVar;
        this.c = bVar;
        this.d = iSmartcardServiceSession;
    }

    public final a a(byte[] bArr) throws IOException {
        String message;
        if (this.b == null || !this.b.a()) {
            throw new IllegalStateException("service not connected to system");
        }
        if (this.d == null) {
            throw new NullPointerException("service session is null");
        }
        if (this.c == null) {
            throw new NullPointerException("reader must not be null");
        }
        synchronized (this.a) {
            SmartcardError smartcardError = new SmartcardError();
            try {
                ISmartcardServiceChannel openLogicalChannel = this.d.openLogicalChannel(bArr, this.b.a, smartcardError);
                c.a(smartcardError);
                smartcardError.a();
                Exception b = smartcardError.b();
                boolean z = true;
                if (b == null || (!(b instanceof MissingResourceException) && ((message = b.getMessage()) == null || (!message.contains("channel in use") && !message.contains("open channel failed") && !message.contains("out of channels") && !message.contains("MANAGE CHANNEL"))))) {
                    z = false;
                }
                c.a(smartcardError);
                if (z) {
                    return null;
                }
                smartcardError.a();
                Exception b2 = smartcardError.b();
                if (b2 != null && (b2 instanceof NoSuchElementException)) {
                    throw new NoSuchElementException("Applet with the defined aid does not exist in the SE");
                }
                c.a(smartcardError);
                if (openLogicalChannel == null) {
                    return null;
                }
                return new a(this.b, this, openLogicalChannel);
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }
    }
}
