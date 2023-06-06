package com.huawei.secure.android.common.ssl.hostname;

import com.meituan.metrics.common.Constants;
import javax.security.auth.x500.X500Principal;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public b(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
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
            int i4 = this.c;
            if (i4 == this.b || this.g[i4] != '\\') {
                return '?';
            }
            this.c = i4 + 1;
            int a2 = a(this.c);
            this.c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        int i2 = this.c;
        if (i2 == this.b) {
            return null;
        }
        this.d = i2;
        this.c = i2 + 1;
        while (true) {
            int i3 = this.c;
            if (i3 >= this.b) {
                break;
            }
            char[] cArr = this.g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        int i4 = this.c;
        if (i4 < this.b) {
            this.e = i4;
            if (this.g[i4] == ' ') {
                while (true) {
                    int i5 = this.c;
                    if (i5 >= this.b) {
                        break;
                    }
                    char[] cArr2 = this.g;
                    if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                        break;
                    }
                    this.c = i5 + 1;
                }
                char[] cArr3 = this.g;
                int i6 = this.c;
                if (cArr3[i6] != '=' || i6 == this.b) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.a);
                }
            }
            this.c++;
            while (true) {
                int i7 = this.c;
                if (i7 >= this.b || this.g[i7] != ' ') {
                    break;
                }
                this.c = i7 + 1;
            }
            int i8 = this.e;
            int i9 = this.d;
            if (i8 - i9 > 4) {
                char[] cArr4 = this.g;
                if (cArr4[i9 + 3] == '.' && (cArr4[i9] == 'O' || cArr4[i9] == 'o')) {
                    char[] cArr5 = this.g;
                    int i10 = this.d + 1;
                    if (cArr5[i10] == 'I' || cArr5[i10] == 'i') {
                        char[] cArr6 = this.g;
                        int i11 = this.d + 2;
                        if (cArr6[i11] == 'D' || cArr6[i11] == 'd') {
                            this.d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.g;
            int i12 = this.d;
            return new String(cArr7, i12, this.e - i12);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        this.c++;
        this.d = this.c;
        this.e = this.d;
        while (true) {
            int i = this.c;
            if (i != this.b) {
                char[] cArr = this.g;
                if (cArr[i] == '\"') {
                    this.c = i + 1;
                    while (true) {
                        int i2 = this.c;
                        if (i2 >= this.b || this.g[i2] != ' ') {
                            break;
                        }
                        this.c = i2 + 1;
                    }
                    char[] cArr2 = this.g;
                    int i3 = this.d;
                    return new String(cArr2, i3, this.e - i3);
                }
                if (cArr[i] == '\\') {
                    cArr[this.e] = d();
                } else {
                    cArr[this.e] = cArr[i];
                }
                this.c++;
                this.e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        int i = this.c;
        if (i + 4 < this.b) {
            this.d = i;
            this.c = i + 1;
            while (true) {
                int i2 = this.c;
                if (i2 == this.b) {
                    break;
                }
                char[] cArr = this.g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.e = i2;
                    this.c = i2 + 1;
                    while (true) {
                        int i3 = this.c;
                        if (i3 >= this.b || this.g[i3] != ' ') {
                            break;
                        }
                        this.c = i3 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + Constants.SPACE);
                    }
                    this.c++;
                }
            }
            this.e = this.c;
            int i4 = this.e;
            int i5 = this.d;
            int i6 = i4 - i5;
            if (i6 >= 5 && (i6 & 1) != 0) {
                byte[] bArr = new byte[i6 / 2];
                int i7 = i5 + 1;
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    bArr[i8] = (byte) a(i7);
                    i7 += 2;
                }
                return new String(this.g, this.d, i6);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char d() {
        this.c++;
        int i = this.c;
        if (i != this.b) {
            char[] cArr = this.g;
            char c = cArr[i];
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
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.b) {
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
        throw new IllegalStateException("Malformed DN: " + this.a);
    }
}
