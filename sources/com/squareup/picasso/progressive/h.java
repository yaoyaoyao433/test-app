package com.squareup.picasso.progressive;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public int b = 0;
    private int e = 0;
    private int f = 0;
    public int d = 0;
    public int c = 0;
    public int a = 0;

    public boolean a(InputStream inputStream) {
        int read;
        int i = this.c;
        while (this.a != 6 && (read = inputStream.read()) != -1) {
            try {
                this.b++;
                switch (this.a) {
                    case 0:
                        if (read == 255) {
                            this.a = 1;
                            break;
                        } else {
                            this.a = 6;
                            break;
                        }
                    case 1:
                        if (read == 216) {
                            this.a = 2;
                            break;
                        } else {
                            this.a = 6;
                            break;
                        }
                    case 2:
                        if (read != 255) {
                            break;
                        } else {
                            this.a = 3;
                            break;
                        }
                    case 3:
                        if (read != 255) {
                            if (read != 0) {
                                if (read == 218 || read == 217) {
                                    int i2 = this.b - 2;
                                    if (this.f > 0) {
                                        this.d = i2;
                                    }
                                    int i3 = this.f;
                                    this.f = i3 + 1;
                                    this.c = i3;
                                }
                                if ((read == 1 || (read >= 208 && read <= 215) || read == 217 || read == 216) ? false : true) {
                                    this.a = 4;
                                    break;
                                } else {
                                    this.a = 2;
                                    break;
                                }
                            } else {
                                this.a = 2;
                                break;
                            }
                        } else {
                            this.a = 3;
                            break;
                        }
                        break;
                    case 4:
                        this.a = 5;
                        break;
                    case 5:
                        int i4 = ((this.e << 8) + read) - 2;
                        long j = i4;
                        while (j > 0) {
                            long skip = inputStream.skip(j);
                            if (skip <= 0) {
                                if (inputStream.read() == -1) {
                                    this.b += i4;
                                    this.a = 2;
                                    break;
                                } else {
                                    j--;
                                }
                            } else {
                                j -= skip;
                            }
                        }
                        this.b += i4;
                        this.a = 2;
                }
                this.e = read;
            } catch (IOException unused) {
            }
        }
        return (this.a == 6 || this.c == i) ? false : true;
    }
}
