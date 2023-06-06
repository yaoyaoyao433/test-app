package com.squareup.okhttp.internal.tls;

import com.meituan.metrics.common.Constants;
import javax.security.auth.x500.X500Principal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public c(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c;
        this.c++;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            this.c++;
        }
        if (this.c >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                this.c++;
            }
            if (this.g[this.c] != '=' || this.c == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
        do {
            this.c++;
            if (this.c >= this.b) {
                break;
            }
        } while (this.g[this.c] == ' ');
        if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && ((this.g[this.d] == 'O' || this.g[this.d] == 'o') && ((this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')))) {
            this.d += 4;
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        int i;
        if (this.c + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.d = this.c;
        this.c++;
        while (this.c != this.b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
            if (this.g[this.c] == ' ') {
                this.e = this.c;
                this.c++;
                while (this.c < this.b && this.g[this.c] == ' ') {
                    this.c++;
                }
                i = this.e - this.d;
                if (i >= 5 || (i & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.a);
                }
                byte[] bArr = new byte[i / 2];
                int i2 = this.d + 1;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) a(i2);
                    i2 += 2;
                }
                return new String(this.g, this.d, i);
            }
            if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                char[] cArr = this.g;
                int i4 = this.c;
                cArr[i4] = (char) (cArr[i4] + Constants.SPACE);
            }
            this.c++;
        }
        this.e = this.c;
        i = this.e - this.d;
        if (i >= 5) {
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        this.d = this.c;
        this.e = this.c;
        while (this.c < this.b) {
            char c = this.g[this.c];
            if (c != ' ') {
                if (c != ';') {
                    if (c == '\\') {
                        char[] cArr = this.g;
                        int i = this.e;
                        this.e = i + 1;
                        cArr[i] = d();
                        this.c++;
                    } else {
                        switch (c) {
                            case '+':
                            case ',':
                                break;
                            default:
                                char[] cArr2 = this.g;
                                int i2 = this.e;
                                this.e = i2 + 1;
                                cArr2[i2] = this.g[this.c];
                                this.c++;
                                break;
                        }
                    }
                }
                return new String(this.g, this.d, this.e - this.d);
            }
            this.f = this.e;
            this.c++;
            char[] cArr3 = this.g;
            int i3 = this.e;
            this.e = i3 + 1;
            cArr3[i3] = Constants.SPACE;
            while (this.c < this.b && this.g[this.c] == ' ') {
                char[] cArr4 = this.g;
                int i4 = this.e;
                this.e = i4 + 1;
                cArr4[i4] = Constants.SPACE;
                this.c++;
            }
            if (this.c == this.b || this.g[this.c] == ',' || this.g[this.c] == '+' || this.g[this.c] == ';') {
                return new String(this.g, this.d, this.f - this.d);
            }
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char d() {
        this.c++;
        if (this.c == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char c = this.g[this.c];
        if (c != ' ' && c != '%' && c != '\\' && c != '_') {
            switch (c) {
                case '\"':
                case '#':
                    break;
                default:
                    switch (c) {
                        case '*':
                        case '+':
                        case ',':
                            break;
                        default:
                            switch (c) {
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                    break;
                                default:
                                    return e();
                            }
                    }
            }
        }
        return this.g[this.c];
    }

    private char e() {
        int i;
        int i2;
        int a = a(this.c);
        this.c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i2 = a & 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            i2 = a & 15;
        } else {
            i = 3;
            i2 = a & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c++;
            if (this.c == this.b || this.g[this.c] != '\\') {
                return '?';
            }
            this.c++;
            int a2 = a(this.c);
            this.c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c < 'A' || c > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.a);
        } else {
            i2 = c - '7';
        }
        char c2 = this.g[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 < 'A' || c2 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.a);
        } else {
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }
}
