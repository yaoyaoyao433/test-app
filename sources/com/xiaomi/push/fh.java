package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes6.dex */
public final class fh {
    private XmlPullParser a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fh() {
        try {
            this.a = XmlPullParserFactory.newInstance().newPullParser();
            this.a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gf a(byte[] bArr, fn fnVar) {
        this.a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.a.next();
        int eventType = this.a.getEventType();
        String name = this.a.getName();
        if (eventType == 2) {
            if (name.equals("message")) {
                return gn.a(this.a);
            }
            if (name.equals("iq")) {
                return gn.a(this.a, fnVar);
            }
            if (name.equals("presence")) {
                return gn.b(this.a);
            }
            if (this.a.getName().equals("stream")) {
                return null;
            }
            if (this.a.getName().equals("error")) {
                throw new fy(gn.c(this.a));
            }
            if (!this.a.getName().equals("warning")) {
                this.a.getName().equals("bind");
                return null;
            }
            this.a.next();
            this.a.getName().equals("multi-login");
            return null;
        }
        return null;
    }
}
