package com.google.zxing.qrcode.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    com.google.zxing.qrcode.decoder.b a;
    com.google.zxing.qrcode.decoder.a b;
    com.google.zxing.qrcode.decoder.c c;
    int d = -1;
    public b e;

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
